# ExploringJavaFX

**Example 1: event.consume()** 
Comment and uncomment all evt.consume() and see what happens.
```
rect.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            print("1");
            //evt.consume();});
```
```            
rect.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {

            print("2");
            
            //evt.consume();});
```
