package components;

import bane.GameObject;
import editor.GameViewWindow;
import org.joml.Vector4f;
import org.lwjgl.system.CallbackI;

public class TranslateGizmo extends Component {
    private Vector4f xAxisColor = new Vector4f(1,0,0,1);
    private Vector4f xAxisColorHover = new Vector4f();
    private Vector4f yAxisColor = new Vector4f(0,1,0,1);
    private Vector4f yAxisColorHover = new Vector4f();

    private GameObject xAxisObject;
    private GameObject yAxisObject;
    private SpriteRenderer xAxisSprite;
    private SpriteRenderer yAxisSprite;
    private GameObject activeGameObject = null;

    public TranslateGizmo(Sprite arrowSprite) {

    }
}
