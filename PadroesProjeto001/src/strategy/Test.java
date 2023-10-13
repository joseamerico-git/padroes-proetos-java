package strategy;

public class Test {
	public static void main(String[] args) {
		// Strategy

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		
		System.out.println("Aplicando modo normal");
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		System.out.println("Aplicando modo defensivo");
		robo.setComportamento(defensivo);
		robo.mover();
		
		System.out.println("Aplicando modo agressivo");
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
	}

}
