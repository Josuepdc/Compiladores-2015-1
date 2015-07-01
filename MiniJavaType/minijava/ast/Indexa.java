package minijava.ast;

import minijava.TabSimb;

public class Indexa implements Exp {
	public Exp vet;
	public Exp ind;
	public int lin;
	
	public Indexa(Exp _vet, Exp _ind, int _lin) {
		vet = _vet;
		ind = _ind;
		lin = _lin;
	}
	
	public String toString() {
		return vet + "[" + ind + "]";
	}

	@Override
	public String tipo(Classe self, TabSimb<Classe> classes,
			TabSimb<String> vars) {
		// TODO: tipagem da expressão de indexação
		// o tipo de uma indexação é sempre "int", mas antes precisamos:
		//   verificar que o tipo de "tvet" é compatível com "int[]"
		//   verificar que o tipo de "tind" é compatível com "int"
		
		
		if(vet.tipo(self, classes, vars) == "int[]" && ind.tipo(self, classes, vars) == "int")
			return "int";
		
		return null;
	}

}
