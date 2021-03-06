package minijava.ast;

import java.util.List;

import minijava.TabSimb;

public class Chamada implements Exp {
	public Exp obj;
	public String nome;
	public List<Exp> args;
	public int lin;
	
	public Chamada(Exp _obj, String _nome, List<Exp> _args, int _lin) {
		obj = _obj;
		nome = _nome;
		args = _args;
		lin = _lin;
	}

	public String toString() {
		String res = obj + "." + nome + "(";
		if(!args.isEmpty())
			res += args.get(0);
		for(int i = 1; i < args.size() ; i++)
			res += ", " + args.get(i);
		res += ")";
		return res;
	}

	@Override
	public String tipo(Classe self, TabSimb<Classe> classes,
			TabSimb<String> vars) {
		// TODO: implemente esse método
		// Para ter o tipo de uma chamada de método, deve-se:
		//   obter o tipo da expressão "obj"
		//   verificar se existe uma classe declarada com esse tipo
		//   verificar se a classe tem um método chamado "nome"
		//   verificar se o número de argumentos bate com o número de parâmetros
		//   verificar se o tipo de cada argumento é compatível com o tipo do parâmetro correspondente
		// Se todas as verificações acima passam, o tipo da chamada é o tipo de retorno do método

		Classe classe = classes.procurar(obj.tipo(self, classes, vars));
		
		if(classe != null) {
			for(Metodo m: classe.metodos) {
				if(m.nome.equals(this.nome)) {
					if(m.params.size() == this.args.size()) {
						for(int i = 0 ; i < this.args.size() ; i++){
							//if(!m.params.get(i).tipo.equals(this.args.get(i).tipo(self, classes, vars)) || classes.procurar(m.params.get(i).tipo).subClasseDe(classes, this.args.get(i).tipo(self, classes, vars)) )
							Tipo.compativel(classes, this.args.get(i).tipo(self, classes, vars), m.params.get(i).tipo, this.lin);

						}
						return m.tret;
					} else {
						throw new RuntimeException("numero de argumentos não corresponde ao numero de parâmentros na linha" + this.lin);
					}
				}
							
							
			}
		}
		
		return null;
	}
}
