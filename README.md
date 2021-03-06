# ExploringJavaFX

**Example 1: event.consume()** 
Comment and uncomment all evt.consume() and see what happens.
```
Rectangle rect = new Rectangle(50, 50);
StackPane root = new StackPane(rect);

rect.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            print("1");
            //evt.consume();
            });

root.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            print("2");
            //evt.consume();
            });

root.setOnMouseClicked(evt -> {
            print("3");
            //evt.consume();
            });
...
```

The same event is handled 4 different ways, on 2 different nodes (rect,root) and 2 different ways to set the eventhandler (EventFilter,OnMouseClicked).
An event will travel through all nodes. So first the root will handle the event, and then the rect will handle it. But only the EventFilter will be able to "consume" the event, meaning it will not travel any further. OnMouseClicked is not able to consume it. If every consume() is uncommented only "2" will be printed.

## **Combining Maven with JavaFX and Scenebuilder**

- Start a Maven project: it creates a Java and a Resources folder
- Create a different JavaFX project and copy those files
- Move the code to the Java folder
- Move the .fxml file to the Resources folder
- The controller in the .fxml file does not need to know the folder in which the controller is located,  "java.controllerName" -> "controllerName"
- FXMLloader just use getResource("file.fxml") instead of "../resources/file.fxml" or a variation of that.
- Reload the POM file

<img src="readmeImages/pom.png" alt="alt text" width="200" height="">

If you can't see the POM file go to the top left and select "project".
