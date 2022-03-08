/* =========================================================
 * ====                   WARNING                        ===
 * =========================================================
 * The code in this tab has been generated from the GUI form
 * designer and care should be taken when editing this file.
 * Only add/edit code inside the event handlers i.e. only
 * use lines between the matching comment tags. e.g.

 void myBtnEvents(GButton button) { //_CODE_:button1:12356:
     // It is safe to enter your event code here  
 } //_CODE_:button1:12356:
 
 * Do not rename this tab!
 * =========================================================
 */

public void button1_click1(GButton source, GEvent event) { //_CODE_:button1:910956:
  println("button1 - GButton >> GEvent." + event + " @ " + millis());
  start=1;
  button1.setVisible(false);
  button2.setVisible(true);
  button3.setVisible(true);
  button4.setVisible(true);
  button5.setVisible(true);
  button9.setVisible(true);
  label14.setVisible(true);
  label15.setVisible(true);
  label16.setVisible(true);
  label17.setVisible(true);
  label21.setVisible(true);
  label22.setVisible(true);
  label39.setVisible(true);
  label40.setVisible(true);
  label41.setVisible(true);
  label42.setVisible(true);
  label43.setVisible(true);
  label44.setVisible(true);
  label45.setVisible(true);
  label46.setVisible(true);
  label47.setVisible(true);
  label48.setVisible(true);
  label54.setVisible(true);
  label55.setVisible(true);
  label56.setVisible(true);
  label57.setVisible(true);
  label58.setVisible(true);
  label59.setVisible(true);
  label60.setVisible(true);
  label61.setVisible(true);
  label62.setVisible(true);
  label24.setVisible(true);
  label25.setVisible(true);
  label26.setVisible(true);
  label31.setVisible(true);
  label27.setVisible(true);
  label32.setVisible(true);
  slider1.setVisible(true);
} //_CODE_:button1:910956:

public void button2_click1(GButton source, GEvent event) { //_CODE_:button2:321599:
  println("button2 - GButton >> GEvent." + event + " @ " + millis());
  next=1;
  join=0;
  joining=0;
  nextround=0;
} //_CODE_:button2:321599:

public void button3_click1(GButton source, GEvent event) { //_CODE_:button3:518088:
  println("button3 - GButton >> GEvent." + event + " @ " + millis());
  window1.setVisible(true);
  join=1;
  nextround=1;
  joining=1;
  useri[0]=5;
  useri[1]=5;
  useri[2]=300;
  useri[3]=useri[0]*balancepricea+useri[1]*balancepriceb+useri[2];
  showdata();
} //_CODE_:button3:518088:

public void button4_click1(GButton source, GEvent event) { //_CODE_:button4:256645:
  println("button4 - GButton >> GEvent." + event + " @ " + millis());
  recordpos=0;
  deadpos=0;
  bank=0;
  join=0;
  joining=0;
  nextround=0;
  alldead=0;
  for(int m=-1;m++<99;){
    ai[0][m]=ai[0][m]=m+1;
    for(int n=0;n++<81;){
      if(n==15||n==23||n==32||n==41||n==50||n==67||n==78){
        ai[n][m]=random(-100,100);
      }
      else if(n==8||n==9||n==16||n==17||n==25||n==26||n==34||n==35||n==43||n==44||n==60||n==61||n==71||n==72){
        ai[n][m]=random(-10,10);
      }
      else if(n==52||n==53||n==54||n==55){
        ai[n][m]=random(1,10);
      }
      else if(n==70||n==81){
        ai[n][m]=random(100,1000);
      }
      else{
        ai[n][m]=random(-2,2);
      }
    }
    ai[5][m]=5;
    ai[6][m]=5;
    ai[7][m]=300;
    ai[57][m]=0;
    ai[58][m]=0;
    ai[59][m]=1;
  }
  for(int m=-1;m++<99;){
    for(int n=-1;n++<405;){
      record[n][m]=0;
    }
    pricerecorda[m]=pricerecordb[m]=sba[m]=dba[m]=sbb[m]=dbb[m]=0;
  }
  balancepricea=0;
  balancepriceb=0;

  for(int m=-1;m++<99;){
    ai[1][m]=abs(ai[5][m]*ai[16][m]+ai[6][m]*ai[17][m]+ai[7][m]*ai[18][m]+50*ai[19][m]+50*ai[20][m]+50*ai[21][m]+50*ai[22][m]+ai[23][m]+50*ai[24][m])/ai[52][m];
    ai[2][m]=abs(ai[5][m]*ai[25][m]+ai[6][m]*ai[26][m]+ai[7][m]*ai[27][m]+50*ai[28][m]+50*ai[29][m]+50*ai[30][m]+50*ai[31][m]+ai[32][m]+50*ai[33][m])/ai[53][m];
    ai[3][m]=abs(ai[5][m]*ai[34][m]+ai[6][m]*ai[35][m]+ai[7][m]*ai[36][m]+50*ai[37][m]+50*ai[38][m]+50*ai[39][m]+50*ai[40][m]+ai[41][m]+50*ai[42][m])/ai[54][m];
    ai[4][m]=abs(ai[5][m]*ai[43][m]+ai[6][m]*ai[44][m]+ai[7][m]*ai[45][m]+50*ai[46][m]+50*ai[47][m]+50*ai[48][m]+50*ai[49][m]+ai[50][m]+50*ai[51][m])/ai[55][m];
    ai[56][m]=ai[5][m]*ai[8][m]+ai[6][m]*ai[9][m]+ai[7][m]*ai[10][m]+50*ai[11][m]+50*ai[12][m]+50*ai[13][m]+50*ai[14][m]+ai[15][m];
    ai[82][m]=abs(ai[5][m]*ai[60][m]+ai[6][m]*ai[61][m]+ai[7][m]*ai[62][m]+50*ai[63][m]+50*ai[64][m]+50*ai[65][m]+50*ai[66][m]+ai[67][m]+50*ai[68][m]+50*ai[69][m])/ai[70][m];
    ai[83][m]=abs(ai[5][m]*ai[71][m]+ai[6][m]*ai[72][m]+ai[7][m]*ai[73][m]+50*ai[74][m]+50*ai[75][m]+50*ai[76][m]+50*ai[77][m]+ai[78][m]+50*ai[79][m]+50*ai[80][m])/ai[81][m];
    if(ai[82][m]>ai[5][m])
      ai[82][m]=ai[5][m];
    if(ai[83][m]>ai[6][m])
      ai[83][m]=ai[6][m];
  }
} //_CODE_:button4:256645:

public void button5_click1(GButton source, GEvent event) { //_CODE_:button5:564707:
  println("button5 - GButton >> GEvent." + event + " @ " + millis());
  exit();
} //_CODE_:button5:564707:

public void slider1_change1(GSlider source, GEvent event) { //_CODE_:slider1:619874:
  println("slider1 - GSlider >> GEvent." + event + " @ " + millis());
  aiii=slider1.getValueI();
} //_CODE_:slider1:619874:

public void button9_click1(GButton source, GEvent event) { //_CODE_:button9:665087:
  println("button9 - GButton >> GEvent." + event + " @ " + millis());
  window1.setVisible(true);
} //_CODE_:button9:665087:

synchronized public void win_draw1(PApplet appc, GWinData data) { //_CODE_:window1:816851:
  window1.background(237);
} //_CODE_:window1:816851:

public void textfield1_change1(GTextField source, GEvent event) { //_CODE_:textfield1:265921:
  println("textfield1 - GTextField >> GEvent." + event + " @ " + millis());
  userad=float(textfield1.getText());
} //_CODE_:textfield1:265921:

public void textfield2_change1(GTextField source, GEvent event) { //_CODE_:textfield2:461938:
  println("textfield2 - GTextField >> GEvent." + event + " @ " + millis());
  useradq=float(textfield2.getText());
} //_CODE_:textfield2:461938:

public void textfield3_change1(GTextField source, GEvent event) { //_CODE_:textfield3:392952:
  println("textfield3 - GTextField >> GEvent." + event + " @ " + millis());
  useras=float(textfield3.getText());
} //_CODE_:textfield3:392952:

public void textfield4_change1(GTextField source, GEvent event) { //_CODE_:textfield4:275519:
  println("textfield4 - GTextField >> GEvent." + event + " @ " + millis());
  userasq=float(textfield4.getText());
} //_CODE_:textfield4:275519:

public void textfield5_change1(GTextField source, GEvent event) { //_CODE_:textfield5:259826:
  println("textfield5 - GTextField >> GEvent." + event + " @ " + millis());
  userbd=float(textfield5.getText());
} //_CODE_:textfield5:259826:

public void textfield6_change1(GTextField source, GEvent event) { //_CODE_:textfield6:731881:
  println("textfield6 - GTextField >> GEvent." + event + " @ " + millis());
  userbdq=float(textfield6.getText());
} //_CODE_:textfield6:731881:

public void textfield7_change1(GTextField source, GEvent event) { //_CODE_:textfield7:410653:
  println("textfield7 - GTextField >> GEvent." + event + " @ " + millis());
  userbs=float(textfield7.getText());
} //_CODE_:textfield7:410653:

public void textfield8_change1(GTextField source, GEvent event) { //_CODE_:textfield8:575632:
  println("textfield8 - GTextField >> GEvent." + event + " @ " + millis());
  userbsq=float(textfield8.getText());
} //_CODE_:textfield8:575632:

public void dropList1_click1(GDropList source, GEvent event) { //_CODE_:dropList1:853885:
  println("dropList1 - GDropList >> GEvent." + event + " @ " + millis());
  userpro=dropList1.getSelectedIndex();
  print(userpro);
} //_CODE_:dropList1:853885:

public void button6_click1(GButton source, GEvent event) { //_CODE_:button6:210722:
  println("button6 - GButton >> GEvent." + event + " @ " + millis());
  join=0;
  nextround=1;
  skip=0;
} //_CODE_:button6:210722:

public void textfield9_change1(GTextField source, GEvent event) { //_CODE_:textfield9:334946:
  println("textfield9 - GTextField >> GEvent." + event + " @ " + millis());
  checkai=int(textfield9.getText());
} //_CODE_:textfield9:334946:

public void button7_click1(GButton source, GEvent event) { //_CODE_:button7:704852:
  println("button7 - GButton >> GEvent." + event + " @ " + millis());
  window2.setVisible(true);
} //_CODE_:button7:704852:

public void button8_click1(GButton source, GEvent event) { //_CODE_:button8:889740:
  println("button8 - GButton >> GEvent." + event + " @ " + millis());
  join=0;
  nextround=1;
  skip=1;
} //_CODE_:button8:889740:

synchronized public void win_draw2(PApplet appc, GWinData data) { //_CODE_:window2:881985:
  appc.background(237);
  
  appc.stroke(0,255,0);
  for(int m=0;m++<99;){
    appc.line(m*2+50,250-8*record[checkai-1][(m+recordpos-1)%100],(m-1)*2+50,250-8*record[checkai-1][(m+recordpos-2)%100]);
  }
  appc.stroke(0,0,255);
  for(int m=0;m++<99;){
    appc.line(m*2+50,250-8*record[checkai-1+100][(m+recordpos-1)%100],(m-1)*2+50,250-8*record[checkai-1+100][(m+recordpos-2)%100]);
  }
  appc.stroke(255,165,0);
  for(int m=0;m++<99;){
    appc.line(m*2+350,250-0.2*record[checkai-1+200][(m+recordpos-1)%100],(m-1)*2+350,250-0.2*record[checkai-1+200][(m+recordpos-2)%100]);
  }
  appc.stroke(255,0,0);
  for(int m=0;m++<99;){
    appc.line(m*2+50,550-0.1*record[checkai-1+300][(m+recordpos-1)%100],(m-1)*2+50,550-0.1*record[checkai-1+300][(m+recordpos-2)%100]);
  }
  //line(m*2+350,250-record[403][(m+recordpos-1)%100],(m-1)*2+350,250-record[403][(m+recordpos-2)%100]);
  
  appc.stroke(0,0,0);
  appc.line(35,150,50,150);
  appc.line(335,150,350,150);
  appc.line(35,450,50,450);
  appc.line(50,250,275,250);
  appc.line(50,25,50,250);
  appc.line(350,250,575,250);
  appc.line(350,25,350,250);
  appc.line(50,325,50,550);
  appc.line(50,550,275,550);
} //_CODE_:window2:881985:



// Create all the GUI controls. 
// autogenerated do not edit
public void createGUI(){
  G4P.messagesEnabled(false);
  G4P.setGlobalColorScheme(GCScheme.BLUE_SCHEME);
  G4P.setCursor(ARROW);
  surface.setTitle("The main board");
  button1 = new GButton(this, 250, 280, 300, 225);
  button1.setText("Start");
  button1.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  button1.addEventHandler(this, "button1_click1");
  button2 = new GButton(this, 650, 350, 100, 60);
  button2.setText("Run");
  button2.addEventHandler(this, "button2_click1");
  button3 = new GButton(this, 650, 450, 100, 60);
  button3.setText("Join game");
  button3.setLocalColorScheme(GCScheme.GREEN_SCHEME);
  button3.addEventHandler(this, "button3_click1");
  button4 = new GButton(this, 650, 650, 100, 60);
  button4.setText("Restart");
  button4.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  button4.addEventHandler(this, "button4_click1");
  button5 = new GButton(this, 650, 750, 100, 60);
  button5.setText("Exit");
  button5.setLocalColorScheme(GCScheme.RED_SCHEME);
  button5.addEventHandler(this, "button5_click1");
  label14 = new GLabel(this, 33, 25, 20, 120);
  label14.setTextAlign(GAlign.LEFT, GAlign.TOP);
  label14.setText("$");
  label14.setOpaque(false);
  label15 = new GLabel(this, 333, 25, 20, 120);
  label15.setTextAlign(GAlign.LEFT, GAlign.TOP);
  label15.setText("$");
  label15.setOpaque(false);
  label16 = new GLabel(this, 15, 140, 80, 20);
  label16.setText("100");
  label16.setOpaque(false);
  label17 = new GLabel(this, 315, 140, 80, 20);
  label17.setText("100");
  label17.setOpaque(false);
  slider1 = new GSlider(this, 650, 320, 100, 40, 10.0);
  slider1.setLimits(10, 2, 18);
  slider1.setNumberFormat(G4P.INTEGER, 0);
  slider1.setOpaque(false);
  slider1.addEventHandler(this, "slider1_change1");
  label21 = new GLabel(this, 610, 313, 80, 20);
  label21.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label21.setText("extreme ai");
  label21.setOpaque(false);
  label22 = new GLabel(this, 712, 313, 80, 20);
  label22.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label22.setText("too safe");
  label22.setOpaque(false);
  button9 = new GButton(this, 650, 550, 100, 60);
  button9.setText("Input window");
  button9.setLocalColorScheme(GCScheme.ORANGE_SCHEME);
  button9.addEventHandler(this, "button9_click1");
  label24 = new GLabel(this, 600, 10, 175, 30);
  label24.setText("a produced this round :");
  label24.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label24.setOpaque(false);
  label25 = new GLabel(this, 600, 50, 175, 30);
  label25.setText("b produced this round :");
  label25.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label25.setOpaque(false);
  label26 = new GLabel(this, 600, 100, 175, 30);
  label26.setText("a's balance price : ");
  label26.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label26.setOpaque(false);
  label27 = new GLabel(this, 600, 200, 175, 30);
  label27.setText("the bank value : ");
  label27.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label27.setOpaque(false);
  label28 = new GLabel(this, 625, 840, 150, 30);
  label28.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label28.setText("ID : 104501527");
  label28.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  label28.setOpaque(false);
  label29 = new GLabel(this, 625, 870, 150, 30);
  label29.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label29.setText("NAME : Ko Ho");
  label29.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  label29.setOpaque(false);
  label30 = new GLabel(this, 625, 810, 150, 30);
  label30.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label30.setText("DEP : NCU-CSIE-2B");
  label30.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  label30.setOpaque(false);
  label31 = new GLabel(this, 600, 140, 175, 30);
  label31.setText("b's balance price : ");
  label31.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label31.setOpaque(false);
  label32 = new GLabel(this, 600, 250, 175, 30);
  label32.setText("eliminated ai : ");
  label32.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label32.setOpaque(false);
  label39 = new GLabel(this, 110, 250, 80, 20);
  label39.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label39.setText("time/amount");
  label39.setOpaque(false);
  label40 = new GLabel(this, 410, 250, 80, 20);
  label40.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label40.setText("time/amount");
  label40.setOpaque(false);
  label41 = new GLabel(this, 110, 550, 80, 20);
  label41.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label41.setText("time");
  label41.setOpaque(false);
  label42 = new GLabel(this, 410, 550, 80, 20);
  label42.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label42.setText("time");
  label42.setOpaque(false);
  label43 = new GLabel(this, 110, 850, 80, 20);
  label43.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label43.setText("time");
  label43.setOpaque(false);
  label45 = new GLabel(this, 33, 350, 10, 100);
  label45.setText("surplus");
  label45.setOpaque(false);
  label46 = new GLabel(this, 333, 350, 10, 100);
  label46.setText("surplus");
  label46.setOpaque(false);
  label47 = new GLabel(this, 33, 625, 80, 30);
  label47.setTextAlign(GAlign.LEFT, GAlign.TOP);
  label47.setText("$");
  label47.setOpaque(false);
  label44 = new GLabel(this, 0, 740, 80, 20);
  label44.setText("75000");
  label44.setOpaque(false);
  label48 = new GLabel(this, 340, 580, 250, 50);
  label48.setText("fig a >> product a's supply(blue), demand(green) and price(red)");
  label48.setOpaque(false);
  label54 = new GLabel(this, 110, 25, 80, 20);
  label54.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label54.setText("fig a");
  label54.setOpaque(false);
  label55 = new GLabel(this, 410, 25, 80, 20);
  label55.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label55.setText("fig b");
  label55.setOpaque(false);
  label56 = new GLabel(this, 110, 325, 80, 20);
  label56.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label56.setText("fig c");
  label56.setOpaque(false);
  label57 = new GLabel(this, 410, 325, 80, 20);
  label57.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label57.setText("fig d");
  label57.setOpaque(false);
  label58 = new GLabel(this, 110, 625, 80, 20);
  label58.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label58.setText("fig e");
  label58.setOpaque(false);
  label59 = new GLabel(this, 340, 640, 250, 50);
  label59.setText("fig b >> product b's supply(blue), demand(green) and price(red)");
  label59.setOpaque(false);
  label60 = new GLabel(this, 340, 700, 250, 50);
  label60.setText("fig c >> product a's supply sulplus(blue), demand sulplus(green), and total sulsplus(purple)");
  label60.setOpaque(false);
  label61 = new GLabel(this, 340, 760, 250, 50);
  label61.setText("fig d >> product b's supply sulplus(blue), demand sulplus(green), and total sulsplus(purple)");
  label61.setOpaque(false);
  label62 = new GLabel(this, 340, 820, 250, 50);
  label62.setText("fig g >> total currency(brown) and total wealth(pink)");
  label62.setOpaque(false);
  window1 = GWindow.getWindow(this, "ai summary and player input", 0, 0, 800, 900, JAVA2D);
  window1.noLoop();
  window1.addDrawHandler(this, "win_draw1");
  label1 = new GLabel(window1, 50, 50, 720, 720);
  label1.setTextAlign(GAlign.LEFT, GAlign.TOP);
  label1.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  label1.setOpaque(false);
  textfield1 = new GTextField(window1, 650, 63, 100, 25, G4P.SCROLLBARS_NONE);
  textfield1.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  textfield1.setOpaque(true);
  textfield1.addEventHandler(this, "textfield1_change1");
  label2 = new GLabel(window1, 525, 50, 100, 50);
  label2.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label2.setText("the price you want to buy");
  label2.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label2.setOpaque(false);
  label3 = new GLabel(window1, 525, 100, 100, 50);
  label3.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label3.setText("the quantity?");
  label3.setOpaque(false);
  textfield2 = new GTextField(window1, 650, 113, 100, 25, G4P.SCROLLBARS_NONE);
  textfield2.setOpaque(true);
  textfield2.addEventHandler(this, "textfield2_change1");
  textfield3 = new GTextField(window1, 650, 188, 100, 25, G4P.SCROLLBARS_NONE);
  textfield3.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  textfield3.setOpaque(true);
  textfield3.addEventHandler(this, "textfield3_change1");
  label4 = new GLabel(window1, 525, 175, 100, 50);
  label4.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label4.setText("the price you want to sell");
  label4.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label4.setOpaque(false);
  label5 = new GLabel(window1, 525, 225, 100, 50);
  label5.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label5.setText("the quantity?");
  label5.setOpaque(false);
  textfield4 = new GTextField(window1, 650, 238, 100, 25, G4P.SCROLLBARS_NONE);
  textfield4.setOpaque(true);
  textfield4.addEventHandler(this, "textfield4_change1");
  label6 = new GLabel(window1, 600, 30, 80, 20);
  label6.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label6.setText("Product a");
  label6.setLocalColorScheme(GCScheme.ORANGE_SCHEME);
  label6.setOpaque(false);
  label7 = new GLabel(window1, 525, 320, 100, 50);
  label7.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label7.setText("the price you want to buy");
  label7.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label7.setOpaque(false);
  label8 = new GLabel(window1, 525, 370, 100, 50);
  label8.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label8.setText("the quantity?");
  label8.setOpaque(false);
  label9 = new GLabel(window1, 525, 445, 100, 50);
  label9.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label9.setText("the price you want to sell");
  label9.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label9.setOpaque(false);
  label10 = new GLabel(window1, 525, 495, 100, 50);
  label10.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label10.setText("the quantity?");
  label10.setOpaque(false);
  label11 = new GLabel(window1, 600, 300, 100, 20);
  label11.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label11.setText("Product b");
  label11.setLocalColorScheme(GCScheme.ORANGE_SCHEME);
  label11.setOpaque(false);
  textfield5 = new GTextField(window1, 650, 333, 100, 25, G4P.SCROLLBARS_NONE);
  textfield5.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  textfield5.setOpaque(true);
  textfield5.addEventHandler(this, "textfield5_change1");
  textfield6 = new GTextField(window1, 650, 383, 100, 25, G4P.SCROLLBARS_NONE);
  textfield6.setOpaque(true);
  textfield6.addEventHandler(this, "textfield6_change1");
  textfield7 = new GTextField(window1, 650, 458, 100, 25, G4P.SCROLLBARS_NONE);
  textfield7.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  textfield7.setOpaque(true);
  textfield7.addEventHandler(this, "textfield7_change1");
  textfield8 = new GTextField(window1, 650, 508, 100, 25, G4P.SCROLLBARS_NONE);
  textfield8.setOpaque(true);
  textfield8.addEventHandler(this, "textfield8_change1");
  dropList1 = new GDropList(window1, 650, 595, 100, 60, 2);
  dropList1.setItems(loadStrings("list_853885"), 0);
  dropList1.addEventHandler(this, "dropList1_click1");
  label12 = new GLabel(window1, 525, 580, 100, 50);
  label12.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label12.setText("The product you want to produce this round");
  label12.setOpaque(false);
  button6 = new GButton(window1, 525, 750, 148, 60);
  button6.setText("Next round");
  button6.addEventHandler(this, "button6_click1");
  label13 = new GLabel(window1, 525, 825, 250, 50);
  label13.setText("Your Score : ");
  label13.setLocalColorScheme(GCScheme.RED_SCHEME);
  label13.setOpaque(false);
  label18 = new GLabel(window1, 100, 765, 200, 125);
  label18.setText("AI's Leader Board");
  label18.setOpaque(false);
  label19 = new GLabel(window1, 300, 800, 150, 20);
  label19.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label19.setText("check ai info?");
  label19.setOpaque(false);
  textfield9 = new GTextField(window1, 300, 825, 80, 25, G4P.SCROLLBARS_NONE);
  textfield9.setOpaque(true);
  textfield9.addEventHandler(this, "textfield9_change1");
  button7 = new GButton(window1, 400, 825, 50, 25);
  button7.setText("check");
  button7.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  button7.addEventHandler(this, "button7_click1");
  label20 = new GLabel(window1, 525, 650, 225, 100);
  label20.setTextAlign(GAlign.CENTER, GAlign.TOP);
  label20.setText("player info");
  label20.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label20.setOpaque(false);
  button8 = new GButton(window1, 700, 750, 60, 60);
  button8.setText("skip");
  button8.setLocalColorScheme(GCScheme.RED_SCHEME);
  button8.addEventHandler(this, "button8_click1");
  window2 = GWindow.getWindow(this, "ai detail info", 0, 0, 600, 600, JAVA2D);
  window2.noLoop();
  window2.addDrawHandler(this, "win_draw2");
  label33 = new GLabel(window2, 21, 140, 80, 20);
  label33.setText("6");
  label33.setOpaque(false);
  label34 = new GLabel(window2, 315, 140, 80, 20);
  label34.setText("500");
  label34.setOpaque(false);
  label35 = new GLabel(window2, 5, 440, 80, 20);
  label35.setText("1000");
  label35.setOpaque(false);
  label36 = new GLabel(window2, 110, 250, 80, 20);
  label36.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label36.setText("time");
  label36.setOpaque(false);
  label37 = new GLabel(window2, 410, 250, 80, 20);
  label37.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label37.setText("time");
  label37.setOpaque(false);
  label38 = new GLabel(window2, 110, 550, 80, 20);
  label38.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label38.setText("time");
  label38.setOpaque(false);
  label23 = new GLabel(window2, 300, 350, 250, 60);
  label23.setText("fig 1 >> the quantity of a(blue) and b(red)");
  label23.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label23.setOpaque(false);
  label49 = new GLabel(window2, 300, 420, 250, 60);
  label49.setText("fig 2 >> the balance");
  label49.setLocalColorScheme(GCScheme.RED_SCHEME);
  label49.setOpaque(false);
  label50 = new GLabel(window2, 300, 490, 250, 60);
  label50.setText("fig 3 >> the score");
  label50.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  label50.setOpaque(false);
  label51 = new GLabel(window2, 110, 25, 80, 20);
  label51.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label51.setText("fig 1");
  label51.setLocalColorScheme(GCScheme.PURPLE_SCHEME);
  label51.setOpaque(false);
  label52 = new GLabel(window2, 410, 25, 80, 20);
  label52.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label52.setText("fig 2");
  label52.setLocalColorScheme(GCScheme.RED_SCHEME);
  label52.setOpaque(false);
  label53 = new GLabel(window2, 110, 325, 80, 20);
  label53.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label53.setText("fig 3");
  label53.setLocalColorScheme(GCScheme.CYAN_SCHEME);
  label53.setOpaque(false);
  label63 = new GLabel(window2, 300, 290, 250, 60);
  label63.setTextAlign(GAlign.CENTER, GAlign.MIDDLE);
  label63.setText("AI #");
  label63.setOpaque(false);
  window1.loop();
  window2.loop();
}

// Variable declarations 
// autogenerated do not edit
GButton button1; 
GButton button2; 
GButton button3; 
GButton button4; 
GButton button5; 
GLabel label14; 
GLabel label15; 
GLabel label16; 
GLabel label17; 
GSlider slider1; 
GLabel label21; 
GLabel label22; 
GButton button9; 
GLabel label24; 
GLabel label25; 
GLabel label26; 
GLabel label27; 
GLabel label28; 
GLabel label29; 
GLabel label30; 
GLabel label31; 
GLabel label32; 
GLabel label39; 
GLabel label40; 
GLabel label41; 
GLabel label42; 
GLabel label43; 
GLabel label45; 
GLabel label46; 
GLabel label47; 
GLabel label44; 
GLabel label48; 
GLabel label54; 
GLabel label55; 
GLabel label56; 
GLabel label57; 
GLabel label58; 
GLabel label59; 
GLabel label60; 
GLabel label61; 
GLabel label62; 
GWindow window1;
GLabel label1; 
GTextField textfield1; 
GLabel label2; 
GLabel label3; 
GTextField textfield2; 
GTextField textfield3; 
GLabel label4; 
GLabel label5; 
GTextField textfield4; 
GLabel label6; 
GLabel label7; 
GLabel label8; 
GLabel label9; 
GLabel label10; 
GLabel label11; 
GTextField textfield5; 
GTextField textfield6; 
GTextField textfield7; 
GTextField textfield8; 
GDropList dropList1; 
GLabel label12; 
GButton button6; 
GLabel label13; 
GLabel label18; 
GLabel label19; 
GTextField textfield9; 
GButton button7; 
GLabel label20; 
GButton button8; 
GWindow window2;
GLabel label33; 
GLabel label34; 
GLabel label35; 
GLabel label36; 
GLabel label37; 
GLabel label38; 
GLabel label23; 
GLabel label49; 
GLabel label50; 
GLabel label51; 
GLabel label52; 
GLabel label53; 
GLabel label63; 