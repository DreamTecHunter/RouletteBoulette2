package com.dad.rouletteboulette2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    @FXML
    private BorderPane borderPane;
    @FXML
    private VBox box_v0, box_v0_h0_vh, box_v0_h1_v0, box_v0_h1_v1, box_v0_h1_v2, box_v0_h2_v0,
            box_v0_h2_v1, box_v0_h3_v0, box_v0_h3_v1, box_v0_h3_v2, box_v0_h3_v3, box_v0_h3_v4;
    @FXML
    private HBox box_v0_h0, box_v0_h1, box_v0_h1_v1_h0, box_v0_h1_v1_h1, box_v0_h2, box_v0_h2_v0_h0,
            box_v0_h3;
    @FXML
    private GridPane gridPaneFirst12th, gridPaneSecond12th, gridPaneThird12th;
    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, button11, button12,
            button13, button14, button15, button16, button17, button18,
            button19, button20, button21, button22, button23, button24,
            button25, button26, button27, button28, button29, button30,
            button31, button32, button33, button34, button35, button36,
            buttonClockStart, buttonClockStop, buttonClockSave;
    @FXML
    private Label labelColumn1, LabelColumn2, labelColumn3,
            labelEven, labelOdd,
            labelFirstTwelve, labelSecondTwelve, labelThirdTwelve,
            labelFirstEighteen, labelSecondEighteen,
            labelRed, labelBlack,
            labelCLock,
            labelColumns, labelDozens, labelColors, labelEvenOdd, labelEighteenth;
    @FXML
    private TextField textFieldHours, textFieldMinutes, textFiledSeconds;
    @FXML
    private TableView tableViewColumns, tableViewDozens, tableViewColors, tableViewEvenOdd, tableViewEighteenth;
    @FXML
    private TableColumn tableColumnColumn1, tableColumnColumn2, tableColumnColumn3,
            tableColumnFirstTwelve, tableColumnSecondTwelve, tableColumnThirdTwelve,
            tableColumnRed, tableColumnBlack,
            tableColumnEven, tableColumnOdd,
            tableColumnFirstEighteen, tableColumnSecondEighteen;
    // Assembly of the Variable according to there type.
    private BorderPane[] borderPaneArray;
    private VBox[] vBoxArray;
    private HBox[] hBoxArray;
    private GridPane[] gridPaneArray;
    private Button[] buttonArray;
    private Label[] labelArray;
    private TextField[] textFieldsArray;
    private TableView[] tableViewArray;
    private TableColumn[] tableColumnArray;
    // Assembly of the Variable according to certain criteria.
    private Button[] numberButtonArray;
    private Button[] clockButtonArray;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.initNumberButtonArray(button0,
                button1, button2, button3, button4, button5, button6,
                button7, button8, button9, button10, button11, button12,
                button13, button14, button15, button16, button17, button18,
                button19, button20, button21, button22, button23, button24,
                button25, button26, button27, button28, button29, button30,
                button31, button32, button33, button34, button35, button36
        );
        this.initGridPaneArray(gridPaneFirst12th, gridPaneSecond12th, gridPaneThird12th);
        button0.setMinHeight(150);
        button0.setPrefHeight(225);
        button0.setMaxHeight(300);


    }

    @FXML
    protected void start() {

    }

    @FXML
    protected void stop() {

    }

    @FXML
    protected void save() {

    }

    private void initBorderPaneArray(BorderPane... borderPaneArray){
        for(BorderPane borderPane: borderPaneArray){

        }
        this.borderPaneArray = borderPaneArray;
    }
    private void initVBoxArray(VBox... vBoxArray){
        for (VBox vBox : vBoxArray){

        }
        this.vBoxArray = vBoxArray;
    }
    private void initHBoxArray(HBox... hBoxArray){
        for (HBox hBox: hBoxArray){

        }
        this.hBoxArray = hBoxArray;
    }
    private void initGridPane(GridPane... gridPaneArray){}
    private void initButtonArray(Button... buttonArray){
        for(Button button : buttonArray){
            button.setMinSize(25,25);
            button.setPrefSize(62.5,37.5);
            button.setMaxSize(100,50);
        }
        this.buttonArray = buttonArray;
    }
    private void initLabel(Label... labelArray){}
    private void initTextField(TextField... textFieldsArray){}
    private void initTableView(TableView... tableViewArray){}
    private void initTableColumn(TableColumn... tableColumnArray){}

    private void initNumberButton(Button... numberButtonArray){}
    private void initClockButton(Button... clockButtonArray){}

    private void initNumberButtonArray(Button... numberButtonArray) {
        for (int i = 0; i < numberButtonArray.length; i++) {
            this.initNumberButton(numberButtonArray[i], i);
        }
        this.numberButtonArray = numberButtonArray;
    }

    private void initNumberButton(Button numberButton, int number) {
        numberButton.setMinSize(50, 50);
        numberButton.setPrefSize(75, 75);
        numberButton.setMaxSize(100, 100);
        numberButton.setBackground(
                new Background(
                        new BackgroundFill(
                                RouletteNumber.values()[number].color,
                                CornerRadii.EMPTY,
                                Insets.EMPTY
                        )
                )
        );
        numberButton.setTextFill(Color.WHITE);
    }

    private void initGridPaneArray(GridPane... gridPaneArray) {
        for (GridPane gridpane : gridPaneArray) {
            this.initGridPane(gridpane);
        }
        this.gridPaneArray = gridPaneArray;
    }

    private void initGridPane(GridPane gridpane) {
        gridpane.setHgap(1);
        gridpane.setVgap(1);
    }
}