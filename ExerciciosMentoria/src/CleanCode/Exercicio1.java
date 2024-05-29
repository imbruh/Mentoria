package CleanCode;

import java.util.Date;
import java.util.List;

public class Exercicio1{}

	class Usuario{
		public int id;
		public double saldo;
		public int quantidadeNotificacoes;
	
		Usuario(Integer id, double saldo, int quantidadeNotificacoes){}
		
		public static Usuario findById(Integer id){
			return new Usuario(1, 100, 2);
			
		}
	}

	class Notifications{
		Notifications(Date data, int usuarioId, String mensagem){}
		
		public static void create(Notifications notification){
			
		}


	public static void notificarUsuarios(List<Integer> listaIds, double valorConta) {
	    for (Integer id: listaIds) {
	        Usuario usuario = Usuario.findById(id);
	        
	        if (usuario != null) {
	        	if(valorConta > usuario.saldo) {
	        		if(usuario.quantidadeNotificacoes == 4) {
	        			new Notifications(new Date(), usuario.id, "Voce foi notificado mais de 3 vezes. Sua assinatura foi cancelada"); 
	        		}
	        		else {
	        			new Notifications(new Date(), usuario.id, "Sem saldo para realizar o pagamento");        
	        		}
	        	}
	        	
	        } 
	
	     }
	}
}
