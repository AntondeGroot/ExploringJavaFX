# ExploringJavaFX

**Example 1: event.consume()** 
rect.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            System.out.println("rect click(filter)1");
        //evt.consume();
        });
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
