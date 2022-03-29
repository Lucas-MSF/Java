package questao_8;

public class Aplicacao {

	public static void main(String[] args) {
		Medico medico= new Medico();
		Paciente paciente= new Paciente();
		
		medico.setMedico();
		paciente.setPaciente();
		
		paciente.descreverSintomas();
		medico.analisarSintoma(paciente.descreverSintomas());
		medico.receitarRemedio(medico.analisarSintoma(paciente.descreverSintomas()));
	
	/*Sim, a consulta poderia ser uma classe, levando os atributos: medico, paciente, data, hora   */
	}

}
