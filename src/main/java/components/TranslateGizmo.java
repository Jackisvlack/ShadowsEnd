package components;

import bane.MouseListener;
import editor.PropertiesWindow;

public class TranslateGizmo extends Gizmo {

    public TranslateGizmo(Sprite arrowSprite, PropertiesWindow propertiesWindow) {
        super(arrowSprite, propertiesWindow);
    }

    @Override
    public void update(float dt) {
        if (activeGameObject != null) {
            if (xAxisActive && !yAxisActive) {
                activeGameObject.transform.position.y -= MouseListener.getWorldDy();
            } else if (yAxisActive) {
                activeGameObject.transform.position.x -= MouseListener.getWorldDx();
            }
        }

        super.update(dt);
    }
}
