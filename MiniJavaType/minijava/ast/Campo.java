package minijava.ast;

import minijava.TabSimb;

public class Campo implements Exp {
	public Exp obj;
	public String nome;
	public int lin;
	
	public Campo(Exp _obj, String _nome, int _lin) {
		obj = _obj;
		nome = _nome;
		lin = _lin;
	}

	public String toString() {
		return obj + "." + nome;
	}

	@Override
	public String tipo(Classe self, TabSimb<Classe> classes,
			TabSimb<String> vars) {
		// TODO: implemente esse método
		// Para saber o tipo de um acesso a campo:
		//   obter o tipo da expressão "obj"
		//   verificar se existe uma classe declarada com esse tipo
		//   verificar se a classe tem um campo chamado "nome"
		// Se todas as verificações acima passam, o tipo do acesso é o tipo do campo
		String tipo = self.todosCampos.procurar(nome);
		if(tipo != null){
			Classe classe = classes.procurar(tipo);
			if(classe !=null){
				for(Var v: classe.campos){
					if(v.nome != null)
						return v.tipo;
				}
			}
		}
		return null;
	}
}
