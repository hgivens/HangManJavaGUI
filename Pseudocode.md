### Main Java page 
    import swing elements
    make a new Myframe object

### Myframe Java 
    import Swing Elements
    Make public class what extends from jframe and has listeners {

      instantiate buttons for all 25 letters letters (so they are global)

      MyFrame(){
        Set each button with a name. 
        make each button have a action listener

        set the buttons bounds to a set location on the frame 
        add to THIS frame each button 
        set THIS frame to set bounderies 
        Set THIS layout to null
        Set THIS visible to ture
      }

      OVERRIDE 
      Public void ACTION PREFORMED (Action Event e){
        if/else stamenst for each letter 
            -they will console there name for debugging reasons
            -once pressed set to remove then repaint (to represh) and avoid double inputs.
            -check the charater to the varabile that hold the word in question. 
                if its in the word then:
                  update what has been found (visual and data wise)
                if not in word then add image of hang man that next (this will use an array maybe? Sting with name of image what will insert into a funciton? add to a count that will effect the image)
        }
      }

    }