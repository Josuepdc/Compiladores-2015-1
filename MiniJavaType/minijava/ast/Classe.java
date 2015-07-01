package minijava.ast;

import java.util.List;

import minijava.TabSimb;

public class Classe {
	public String nome;
	public String pai;
	public List<Var> campos;
	public List<Metodo> metodos;
	public int lin;
	
	// Tipos de todos os campos, incluindo campos nas superclasses
	public TabSimb<String> todosCampos;
	// Todos os mÃ©todos, incluindo mÃ©todos nas superclasses
	public TabSimb<Metodo> todosMetodos;
	
	public Classe(String _nome, List<Var> _campos, List<Metodo> _metodos, int _lin) {
		nome = _nome;
		pai = "Object";
		campos = _campos;
		metodos = _metodos;
		lin = _lin;
	}

	public Classe(String _nome, String _pai, List<Var> _campos, List<Metodo> _metodos, int _lin) {
		nome = _nome;
		pai = _pai;
		campos = _campos;
		metodos = _metodos;
		lin = _lin;
	}

	public String toString() {
		String res = "class " + nome + " extends " + pai + "{\n";
		for(Var campo: campos) {
			res += campo + ";\n";
		}
		for(Metodo metodo: metodos) {
			res += metodo + "\n";
		}
		res += "}";
		return res;
	}
	
	public boolean subClasseDe(TabSimb<Classe> classes, String classe) {
	    // TODO: implemente esse mÃ©todo
		// Ele retorna verdadeiro se a classe corrente Ã© subclasse de "classe"
		// Uma classe Ã© subclasse dela mesma
		// classe A Ã© subclasse de B se B Ã© pai de A
		// classe A Ã© subclasse de B se pai de A Ã© subclasse de B		
		
		
		if(classes.procurar(classe)!= null){
			if(this == classes.procurar(classe))
				return true;
			
			if(classes.procurar(this.pai) == classes.procurar(classe))
				return true;
			
			for(Classe aux = this ; !aux.pai.equals("Object") ; aux = classes.procurar(aux.pai)) {
				if(classes.procurar(aux.pai) == classes.procurar(classe))
					return true;			
			}
		}	
		return false;
	}
	
	public void adicionaCampos(TabSimb<Classe> classes, TabSimb<String> vars) {
		// TODO: implemente esse mÃ©todo
		// Adiciona o tipo dos campos dessa classe e de todas as suas superclasses
		// na tabela de sÃ­mbolos "vars"
		// Ter dois campos com o mesmo nome Ã© um erro; caso uma subclasse
		// declare um campo com o mesmo nome de um campo de uma de suas
		// superclasses, o erro deve ser acusado na linha que estÃ¡
		// redeclarando o campo na subclasse
			
		for(Var v : this.campos)
			vars.inserir(v.nome, v.tipo);
		
		if(this.pai != "Object")
			for(Classe aux = this ; !aux.pai.equals("Object") ; aux = classes.procurar(aux.pai))
				for(Var v : classes.procurar(aux.pai).campos)
					if(!vars.inserir(v.nome, v.tipo))
						for(Var v_atual : this.campos)
							if(v_atual.nome.equals(v.nome) )
								throw new RuntimeException("campo " + v_atual.nome + " redeclarado na linha" + v_atual.lin);
	}
	
	public void adicionaCampos(TabSimb<Classe> classes) {
		todosCampos = new TabSimb<String>();
		this.adicionaCampos(classes, todosCampos);
	}
	
	public void adicionaMetodos(TabSimb<Classe> classes) {
		if(todosMetodos != null) return;
		Classe cpai = classes.procurar(pai);
		if(cpai != null) {
			cpai.adicionaMetodos(classes);
			todosMetodos = new TabSimb<Metodo>(cpai.todosMetodos);
		} else todosMetodos = new TabSimb<Metodo>();
		for(Metodo metodo: metodos) {
			Metodo mpai = todosMetodos.procurar(metodo.nome);
			if(mpai != null) {
				if(mpai.params.size() != metodo.params.size())
					throw new RuntimeException("mÃ©todo " + metodo.nome + 
							" redefinido com aridade diferente na linha " + metodo.lin);
				try {
					for(int i = 0; i < mpai.params.size(); i++) {
						/* if(!mpai.params.get(i).tipo.equals(metodo.params.get(i).tipo)) {
							throw new RuntimeException...
						}*/
						Tipo.compativel(classes, mpai.params.get(i).tipo, metodo.params.get(i).tipo, metodo.lin);
					}
					Tipo.compativel(classes, metodo.tret, mpai.tret, metodo.lin);
				} catch(RuntimeException e) {
					throw new RuntimeException("erro na redefiniÃ§Ã£o de mÃ©todo: " + e.getMessage());
				}
			}
			if(!todosMetodos.inserir(metodo.nome, metodo))
				throw new RuntimeException("mÃ©todo " + metodo.nome + " redeclarado na linha " + metodo.lin);
		}
	}
	
	public void tipos(TabSimb<Classe> classes) {
		for(Metodo metodo: metodos) {
			TabSimb<String> escMetodo = new TabSimb<String>(todosCampos);
			for(Var param: metodo.params) {
				if(!escMetodo.inserir(param.nome, param.tipo))
					throw new RuntimeException("parÃ¢metro " + param.nome + " redeclarado na linha " + param.lin);
			}
			for(Var var: metodo.vars) {
				if(!escMetodo.inserir(var.nome, var.tipo))
					throw new RuntimeException("variÃ¡vel " + var.nome + 
							" redeclarada na linha " + var.lin);
			}
			for(Cmd cmd: metodo.cmds) {
				cmd.tipos(this, classes, escMetodo);
			}
			String tret = metodo.ret.tipo(this, classes, escMetodo);
			Tipo.compativel(classes, tret, metodo.tret, metodo.lin);
		}
	}

}
