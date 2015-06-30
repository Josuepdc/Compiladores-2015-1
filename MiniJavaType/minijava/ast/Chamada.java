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
		//  N verificar se o tipo de cada argumento é compatível com o tipo do parâmetro correspondente
		// Se todas as verificações acima passam, o tipo da chamada é o tipo de retorno do método
		
		Metodo metodo = self.todosMetodos.procurar(nome);
		if(metodo != null){
			Classe classe = classes.procurar(metodo.tret);
			if(classe !=null){
				for(Metodo m: classe.metodos){
					if(m.nome == this.nome)
						if(this.args.size() == m.params.size())
							//TODO N
								
								
				}
			}
		}
		return null;
	}
}
