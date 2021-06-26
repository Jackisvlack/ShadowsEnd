package components;

import bane.MouseListener;
import editor.PropertiesWindow;

public class ScaleGizmo extends Gizmo {
    public ScaleGizmo(Sprite scaleSprite, PropertiesWindow propertiesWindow) {
        super(scaleSprite, propertiesWindow);
    }

    @Override
    public void update(float dt) {
        if (activeGameObject != null) {
            if (xAxisActive && !yAxisActive) {
                activeGameObject.transform.scale.y -= MouseListener.getWorldDy();
            } else if (yAxisActive) {
                activeGameObject.transform.scale.x -= MouseListener.getWorldDx();
            }
        }

        super.update(dt);
    }
}
