import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Myframe extends JFrame implements ActionListener{
  
  JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
  JLabel theWord;
  JLabel hangManImage;

  //this needs to change as the code gose on as they get the wrong letter, and if they win then will display win
  String selectImage = "Start.png";
  ImageIcon image = new ImageIcon(selectImage);
  

  Myframe(){
    // creating instance of JButton
    a = new JButton("a");
    b = new JButton("b");
    c = new JButton("c");
    d = new JButton("d");
    e = new JButton("e");
    f = new JButton("f");
    g = new JButton("g");
    h = new JButton("h");
    i = new JButton("i");
    j = new JButton("j");
    k = new JButton("k");
    l = new JButton("l");
    m = new JButton("m");
    n = new JButton("n");
    o = new JButton("o");
    p = new JButton("p");
    q = new JButton("q");
    r = new JButton("r");
    s = new JButton("s");
    t = new JButton("t");
    u = new JButton("u");
    v = new JButton("v");
    w = new JButton("w");
    x = new JButton("x");
    y = new JButton("y");
    z = new JButton("z");

    theWord = new JLabel("place holder. a variable will sit here");
    hangManImage = new JLabel();

// add event listener
    a.addActionListener(this);
    b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
    e.addActionListener(this);
    f.addActionListener(this);
    g.addActionListener(this);
    h.addActionListener(this);
    i.addActionListener(this);
    j.addActionListener(this);
    k.addActionListener(this);
    l.addActionListener(this);
    m.addActionListener(this);
    o.addActionListener(this);
    p.addActionListener(this);
    q.addActionListener(this);
    r.addActionListener(this);
    s.addActionListener(this);
    t.addActionListener(this);
    u.addActionListener(this);
    v.addActionListener(this);
    w.addActionListener(this);
    x.addActionListener(this);
    y.addActionListener(this);
    z.addActionListener(this);

// x axis, y axis, width, height
    b.setBounds(65, 0, 60, 40);
    a.setBounds(0, 0, 60, 40);
    c.setBounds(130, 0, 60, 40);
    d.setBounds(0, 40, 60, 40);
    e.setBounds(65, 40, 60, 40);
    f.setBounds(130, 40, 60, 40);
    g.setBounds(0, 80, 60, 40);
    h.setBounds(65, 80, 60, 40);
    i.setBounds(130, 80, 60, 40);
    j.setBounds(0, 120, 60, 40);
    k.setBounds(65, 120, 60, 40);
    l.setBounds(130, 120, 60, 40);
    m.setBounds(0, 160, 60, 40);
    n.setBounds(65, 160, 60, 40);
    o.setBounds(130, 160, 60, 40);
    p.setBounds(0, 200, 60, 40);
    q.setBounds(65, 200, 60, 40);
    r.setBounds(130, 200, 60, 40);
    s.setBounds(0, 240, 60, 40);
    t.setBounds(65, 240, 60, 40);
    u.setBounds(130, 240, 60, 40);
    v.setBounds(0, 280, 60, 40);
    w.setBounds(65, 280, 60, 40);
    x.setBounds(130, 280, 60, 40);
    y.setBounds(0, 320, 60, 40);
    z.setBounds(65, 320, 60, 40);

    theWord.setBounds(10, 380, 400, 40);
    //hangManImage.setBackground(Color.black);
    hangManImage.setIcon(image);
    hangManImage.setBounds(260,60,150,250);

// add buttons to Jthis
    this.add(a);
    this.add(b);
    this.add(c);
    this.add(d);
    this.add(e);
    this.add(f);
    this.add(g);
    this.add(h);
    this.add(i);
    this.add(j);
    this.add(k);
    this.add(l);
    this.add(m);
    this.add(n);
    this.add(o);
    this.add(p);
    this.add(q);
    this.add(r);
    this.add(s);
    this.add(t);
    this.add(u);
    this.add(v);
    this.add(w);
    this.add(x);
    this.add(y);
    this.add(z);

    this.add(theWord);
    this.add(hangManImage);
    

    this.setSize(400, 500);
    this.setLayout(null);
    // make the frame visible
    this.setVisible(true);
  }

// with each action of the bottons they liseten for an event say there name for debugging reason, then with be removed once pressed and be checked for being in the word of the codes choice, then it will update the display. 
  @Override 
  public void actionPerformed(ActionEvent ev){
    if(ev.getSource()== a){
      System.out.println("a");
      this.remove(a);

      this.repaint();

    }else if(ev.getSource()== b){
      System.out.println("b");
      this.remove(b);

      this.repaint();

    } else if(ev.getSource()== c){
      System.out.println("c");
      this.remove(c);

      this.repaint();

    } else if(ev.getSource()== d){
      System.out.println("d");
      this.remove(d);

      this.repaint();

    } else if(ev.getSource()== e){
      System.out.println("e");
      this.remove(e);

      this.repaint();

    } else if(ev.getSource()== f){
      System.out.println("f");
      this.remove(f);

      this.repaint();

    } else if(ev.getSource()== g){
      System.out.println("g");
      this.remove(g);

      this.repaint();

    } else if(ev.getSource()== h){
      System.out.println("h");
      this.remove(h);

      this.repaint();

    } else if(ev.getSource()== i){
      System.out.println("i");
      this.remove(i);

      this.repaint();

    } else if(ev.getSource()== j){
      System.out.println("j");
      this.remove(j);

      this.repaint();

    } else if(ev.getSource()== k){
      System.out.println("k");
      this.remove(k);

      this.repaint();

    } else if(ev.getSource()== l){
      System.out.println("l");
      this.remove(l);

      this.repaint();

    } else if(ev.getSource()== m){
      System.out.println("m");
      this.remove(m);

      this.repaint();

    } else if(ev.getSource()== n){
      // broke after adding the remove and im not sure why it stopped working
      System.out.println("n");
      this.remove(n);

      this.repaint();

    } else if(ev.getSource()== o){
      System.out.println("o");
      this.remove(o);

      this.repaint();

    } else if(ev.getSource()== p){
      System.out.println("p");
      this.remove(p);

      this.repaint();

    } else if(ev.getSource()== q){
      System.out.println("q");
      this.remove(q);

      this.repaint();

    } else if(ev.getSource()== r){
      System.out.println("r");
      this.remove(r);

      this.repaint();

    } else if(ev.getSource()== s){
      System.out.println("s");
      this.remove(s);

      this.repaint();

    } else if(ev.getSource()== t){
      System.out.println("t");
      this.remove(t);

      this.repaint();

    } else if(ev.getSource()== u){
      System.out.println("u");
      this.remove(u);

      this.repaint();

    } else if(ev.getSource()== v){
      System.out.println("v");
      this.remove(v);

      this.repaint();

    } else if(ev.getSource()== w){
      System.out.println("w");
      this.remove(w);

      this.repaint();

    } else if(ev.getSource()== x){
      System.out.println("x");
      this.remove(x);

      this.repaint();

    } else if(ev.getSource()== y){
      System.out.println("y");
      this.remove(y);

      this.repaint();

    } else if(ev.getSource()== z){
      System.out.println("z");
      this.remove(z);

      this.repaint();

    }else{
        System.out.println("nope");
    }
  }




}