package one.innovation.strategy;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
	
		
		
		ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();
		ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
		ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
		Robo robo = new Robo();
		
		List<Comportamento> comportamentos = new ArrayList<>();
		comportamentos.add(comportamentoNormal);
		comportamentos.add(comportamentoAgressivo);
		comportamentos.add(comportamentoDefensivo);
		for (Comportamento comportamento: comportamentos) {
			robo.setStrategy(comportamento);
			robo.mover();
		}
	}
}
