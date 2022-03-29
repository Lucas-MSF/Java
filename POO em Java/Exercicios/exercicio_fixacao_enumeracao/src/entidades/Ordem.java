package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades_enum.OrderStatus;

public class Ordem {
	
	private Date momento;
	private OrderStatus status;
	private Cliente cliente;
	private List <OrdemItem>  itens= new ArrayList<>();

	public Ordem() {
		
	}

	public Ordem(Date momento, OrderStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getItens() {
		return itens;
	}

	public void addItem(OrdemItem item) {
		itens.add(item);
	}
	public void removeItem (OrdemItem item) {
		itens.remove(item);
	}
	public double total () {
		double sum=0;
		for(OrdemItem  c  :  itens) {
			sum+= c.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		StringBuilder tostring= new StringBuilder();
		tostring.append("\nMomento do pedido: "+ sdf2.format(momento) +"\n");
		tostring.append("Status do pedido: "+ this.status +"\n");
		tostring.append( this.cliente +"\n");
		tostring.append("Produtos do pedido: \n");
		for(OrdemItem c : itens) {
			tostring.append(c+"\n");
		}
		tostring.append("Valor Total do pedido: "+ String.format("%.2f",total()) );
		return tostring.toString();
	}
	
}
