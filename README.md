# ExploringJavaFX

**Example 1: event.consume()** 
Comment and uncomment all evt.consume() and see what happens.
```
Rectangle rect = new Rectangle(50, 50);
StackPane root = new StackPane(rect);

rect.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            print("1");
            //evt.consume();});

root.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            print("2");
            //evt.consume();});

root.setOnMouseClicked(evt -> {
        print("3");
        //evt.consume();
        });
```

