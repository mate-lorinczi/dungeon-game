package com.codecool.dungeoncrawl.ui.elements;

import com.codecool.dungeoncrawl.data.items.Item;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.util.List;

public class StatusPane {
    public static final int RIGHT_PANEL_WIDTH = 200;
    public static final int RIGHT_PANEL_PADDING = 10;
    private GridPane ui;
    private Label healthTextLabel;
    private Label healthValueLabel;

    private Label inventoryTextLabel;
    private Label inventoryContent;


    public StatusPane() {
        ui = new GridPane();
        healthTextLabel = new Label("Health: ");
        healthValueLabel = new Label();
        inventoryTextLabel = new Label("Inventory: ");
        inventoryContent = new Label();
    }

    public BorderPane build() {

        ui.setPrefWidth(RIGHT_PANEL_WIDTH);
        ui.setPadding(new Insets(RIGHT_PANEL_PADDING));

        ui.add(healthTextLabel, 0, 0);
        ui.add(healthValueLabel, 1, 0);
        ui.add(inventoryTextLabel, 0,2);
        ui.add(inventoryContent,1,2);

        BorderPane borderPane = new BorderPane();
        borderPane.setRight(ui);
        return borderPane;
    }

    public void setHealthValue(String text) {
        healthValueLabel.setText(text);
    }
    public void setInventoryContent(List<Item> itemList){ inventoryContent.setText(
            String.join("\n",
                    itemList.stream().map(item -> item.getTileName()).toList())); }
}
