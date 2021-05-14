import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Myframe extends JFrame implements ActionLIstener{
  
  JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

  Myframe(){
    this.SetDeaultClosesOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

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

    //b.setBackground(Color.gray);


// add buttons to JFrame
    frame.add(a);
    frame.add(b);
    frame.add(c);
    frame.add(d);
    frame.add(e);
    frame.add(f);
    frame.add(g);
    frame.add(h);
    frame.add(i);
    frame.add(j);
    frame.add(k);
    frame.add(l);
    frame.add(m);
    frame.add(n);
    frame.add(o);
    frame.add(p);
    frame.add(q);
    frame.add(r);
    frame.add(s);
    frame.add(t);
    frame.add(u);
    frame.add(v);
    frame.add(w);
    frame.add(x);
    frame.add(y);
    frame.add(z);

    this.pack();
    this.setVisible(ture);
  }

  @Override 
  public void actionPerformed(ActionEvent e){
    //do a switch satment insteat of a if/else for the logic of the game
    if(e.getSource()== a){
      System.out.println("a");
    }
  }
}