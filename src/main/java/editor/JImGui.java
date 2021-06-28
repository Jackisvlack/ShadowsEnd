package editor;

import imgui.ImGui;
import org.joml.Vector2f;

public class JImGui {

    private static float defaultColumnWidth = 220.0f;

    public static void drawVec2Control(String label, Vector2f values) {
        drawVec2Control(label, values, 0.0f, defaultColumnWidth);
    }

    public static void drawVec2Control(String label, Vector2f values, float resetValue) {
        drawVec2Control(label, values, resetValue, defaultColumnWidth);
    }

    public static void drawVec2Control(String label, Vector2f values, float resetValue, float columnWidth) {
        ImGui.pushID(label);

        ImGui.columns(2);
        ImGui.setColumnWidth(0, columnWidth);
        ImGui.text(label);
        ImGui.nextColumn();

        

        ImGui.popID();
    }
}
