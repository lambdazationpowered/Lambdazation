package org.lambdazation.client.gui.widget;

import org.lambdazation.client.gui.widget.model.ModelText;
import org.lambdazation.client.gui.widget.view.ViewText;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WidgetText<M extends ModelText, V extends ViewText<M>> extends WidgetBase<M, V> {
	public WidgetText(M model, V view) {
		super(model, view);
	}

	@Override
	public Action onKeyboardKey(InputContext ctx, int key, boolean pressed) {
		Action action = Action.CONTINUE;
		action = super.onKeyboardKey(ctx, key, pressed);
		// TODO NYI
		return action;
	}

	@Override
	public Action onKeyboardChar(InputContext ctx, char input) {
		Action action = Action.CONTINUE;
		action = super.onKeyboardChar(ctx, input);
		// TODO NYI
		return action;
	}

	@Override
	public Action onMouseButton(InputContext ctx, int button, boolean pressed) {
		Action action = Action.CONTINUE;
		action = super.onMouseButton(ctx, button, pressed);
		// TODO NYI
		return action;
	}

	@Override
	public Action onMouseMove(InputContext ctx, double deltaX, double deltaY) {
		Action action = Action.CONTINUE;
		action = super.onMouseMove(ctx, deltaX, deltaY);
		// TODO NYI
		return action;
	}

	@Override
	public Action onMouseWheel(InputContext ctx, double delta) {
		Action action = Action.CONTINUE;
		action = super.onMouseWheel(ctx, delta);
		// TODO NYI
		return action;
	}
}