package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.factory.User;
import one.digitalinnovation.gof.factory.UserFactory;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		System.out.println("\n-----Singleton-----\n");
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		System.out.println("\n-----Strategy-----\n");
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		System.out.println("\n-----Facade-----\n");
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

		// Factory
		System.out.println("\n-----Factory-----\n");

		User user1 = UserFactory.newAdmin(1l, "My Name");
		user1.addPendingTask(user1, "task1");
		user1.addPendingTask(user1, "task2");
		user1.completeTask();	

		User user2 = UserFactory.newOperator(2l, "Operator");
		user2.addPendingTask(user1, "task2");

		System.out.println(user1.toString());
		System.out.println(user2.toString());
	}

}
