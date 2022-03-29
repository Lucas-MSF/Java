package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades_enum.Status;

public class Mesa {

	private Integer numero;
	private Status status;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<ConsumoBebida> consumoBebida = new ArrayList<>();
	private List<ConsumoComida> consumoComida = new ArrayList<>();

	public Mesa() {
		this.status= Status.valueOf("LIVRE");
	}
	
	public Mesa(Integer numero, Status status, Cliente cliente, Funcionario funcionario) {
		this.numero = numero;
		this.status = status;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ConsumoBebida> getConsumoBebida() {
		return consumoBebida;
	}

	public void addConsumoBebida(Bebidas bebida, int quantidade) {
		if (consumoBebida.size() == 0) {
			consumoBebida.add(new ConsumoBebida(bebida, quantidade));
		} else {
			for (ConsumoBebida x : consumoBebida) {
				if (x.getBebida().getNome().equals(bebida.getNome())) {
					x.addQuantidade(quantidade);
				} else {
					consumoBebida.add(new ConsumoBebida(bebida, quantidade));
				}
			}
		}
	}

	public void removeConsumoBebida(Bebidas bebida, int quantidade) {
		for (ConsumoBebida x : consumoBebida) {
			if (x.getBebida().getNome().equals(bebida.getNome())) {
				x.removeQuantidade(quantidade);
				if (x.getQuantidade() == 0) {
					consumoBebida.remove(x);
				}
			} else {
				System.out.println("A mesa nao consumiu essa bebida.");
			}
		}
	}

	public List<ConsumoComida> getConsumoComida() {
		return consumoComida;
	}

	public void addConsumoComida(Comida comida, int quantidade) {
		if (consumoComida.size() == 0) {
			consumoComida.add(new ConsumoComida(comida, quantidade));
		} else {
			for (ConsumoComida x : consumoComida) {
				if (x.getComida().getNome().equals(comida.getNome())) {
					x.addQuantidade(quantidade);
				} else {
					consumoComida.add(new ConsumoComida(comida, quantidade));
				}
			}
		}
	}

	public void removeConsumoComida(Comida comida, int quantidade) {
		for (ConsumoComida x : consumoComida) {
			if (x.getComida().getNome().equals(comida.getNome())) {
				x.removeQuantidade(quantidade);
				if (x.getQuantidade() == 0) {
					consumoComida.remove(x);
				}
			} else {
				System.out.println("A mesa nao consumiu essa comida.");
			}
		}
	}

	public Double somarTotal() {
		double total=0;
		for (ConsumoBebida x : consumoBebida)
			total += x.getBebida().getValor() * x.getQuantidade();

		for (ConsumoComida x : consumoComida)
			total += x.getComida().getValor() * x.getQuantidade();

		return total;
	}

	public Double taxaServico() {
		double taxa = somarTotal() * 0.1;
		return taxa;
	}

	public void notaFiscal() {
		
		double taxaDeServico= somarTotal() * 0.1;
		Date horarioDaEmissao= new Date();
		double descontoFidelidade= cliente.getFidelidade()*0.005;
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("==========Bebidas CHABAS==========\n\n");
		System.out.print("----------Recibo de pagamento----------\n");
		System.out.println("Horario de emissao: "+  sdf2.format(horarioDaEmissao));
		System.out.print("Consumo: \n");
		System.out.print("Produto:      Valor unidade:   Quantidade:\n");
		for (ConsumoBebida x : consumoBebida) {
			System.out.printf(
					"%s     %.2f            %d \n",x.getBebida().getNome(), x.getBebida().getValor(), x.getQuantidade());
		}
		for (ConsumoComida x : consumoComida) {
			System.out.print(
					x.getComida().getNome() + "    " + x.getComida().getValor() + "     " + x.getQuantidade() + "\n");

		}
		System.out.printf("Taxa de servico: %.2f \n",taxaDeServico);
		System.out.printf("Desconto fidelidade: %.2f \n",(somarTotal()+taxaDeServico)*descontoFidelidade);
		System.out.printf("Total: %.2f \n", ((somarTotal() + taxaDeServico)-(somarTotal()+taxaDeServico)*descontoFidelidade));
		
	}
}
