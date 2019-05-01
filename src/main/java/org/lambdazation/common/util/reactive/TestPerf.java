package org.lambdazation.common.util.reactive;

import java.util.function.Consumer;

import org.lambdazation.common.util.data.Product;
import org.lambdazation.common.util.data.Unit;

public class TestPerf {
	public static void main(String[] args) {
		Product<Consumer<Unit>, Source<Unit>> product = Source.newSource();
		Source<Unit> clieckedSource = product.right;

		// @formatter:off
		Flow<Unit> flow =
			Flow.input(clieckedSource).compose(
			clickedEvent ->
			Combinator.increment(0, clickedEvent.replace(count -> count + 1)).compose(
			countedEvent ->
			Flow.output(countedEvent.fmap(count -> () -> {}))));
		// @formatter:on

		Reactive.react(flow);

		for (int i = 0; i < 10000; i++)
			test(product.left);
	}

	private static void test(Consumer<Unit> consumer) {
		long time = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			consumer.accept(Unit.UNIT);
		System.out.println(System.currentTimeMillis() - time + " ms");
	}
}
