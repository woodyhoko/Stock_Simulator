import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import g4p_controls.*; 
import java.awt.Font; 
import java.awt.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class finalproject extends PApplet {





// initialize x and y as 0
int start=0;
float[][] ai=new float[84][100];
int win1=0;
int next=0;
float balancepricea=0;
float balancepriceb=0;
float[] sba=new float[101];
float[] dba=new float[101];
float[] sbb=new float[101];
float[] dbb=new float[101];
float[] pricerecorda=new float[100];
float[] pricerecordb=new float[100];
float[][] record=new float[406][100];
int recordpos;
int[] deadlist=new int[100];
int deadpos=0;
int best,best2,best3;
int bestd,bestd2,bestd3;
int[][] forcheck=new int[101][4];
float allmoney;
float allwealth;
float adl;
float asl;
float bdl;
float bsl;
int tad=0,tas=0;
int tbd=0,tbs=0;
float bank=0;
int alldead=0;
int aiii=10;
int join=0;
int nextround=0;
float userad=0;
float useradq=0;
float useras=0;
float userasq=0;
float userbd=0;
float userbdq=0;
float userbs=0;
float userbsq=0;
float[] useri=new float[4];
int userpro=0;
int joining=0;
int checkai=1;
int skip=0;
int tttt=0;

public void setup(){
  recordpos=0;
  joining=0;
  deadpos=0;
  
  background(220);
  createGUI();
  button1.setFont(new Font("Calibri",Font.PLAIN,72));
  label14.setFont(new Font("Calibri",Font.PLAIN,24));
  label13.setFont(new Font("Calibri",Font.PLAIN,26));
  label15.setFont(new Font("Calibri",Font.PLAIN,24));
  label14.setVisible(false);
  label15.setVisible(false);
  label16.setFont(new Font("Calibri",Font.PLAIN,12));
  label33.setFont(new Font("Calibri",Font.PLAIN,12));
  label34.setFont(new Font("Calibri",Font.PLAIN,12));
  label17.setFont(new Font("Calibri",Font.PLAIN,12));
  label16.setVisible(false);
  label17.setVisible(false);
  label21.setFont(new Font("Calibri",Font.PLAIN,12));
  label18.setFont(new Font("Calibri",Font.PLAIN,16));
  label20.setFont(new Font("Calibri",Font.PLAIN,18));
  label22.setFont(new Font("Calibri",Font.PLAIN,12));
  label28.setFont(new Font("Calibri",Font.PLAIN,18));
  label29.setFont(new Font("Calibri",Font.PLAIN,18));
  label30.setFont(new Font("Calibri",Font.PLAIN,18));
  label47.setFont(new Font("Calibri",Font.PLAIN,24));
  label23.setFont(new Font("Calibri",Font.PLAIN,28));
  label63.setFont(new Font("Calibri",Font.PLAIN,28));
  label49.setFont(new Font("Calibri",Font.PLAIN,28));
  label50.setFont(new Font("Calibri",Font.PLAIN,28));
  label47.setVisible(false);
  label44.setVisible(false);
  label21.setVisible(false);
  label24.setVisible(false);
  label25.setVisible(false);
  label26.setVisible(false);
  label31.setVisible(false);
  label27.setVisible(false);
  label32.setVisible(false);
  label22.setVisible(false);
  label39.setVisible(false);
  label40.setVisible(false);
  label41.setVisible(false);
  label42.setVisible(false);
  label43.setVisible(false);
  label45.setVisible(false);
  label46.setVisible(false);
  label48.setVisible(false);
  label54.setVisible(false);
  label55.setVisible(false);
  label56.setVisible(false);
  label57.setVisible(false);
  label58.setVisible(false);
  label59.setVisible(false);
  label60.setVisible(false);
  label61.setVisible(false);
  label62.setVisible(false);
  button2.setVisible(false);
  button2.setFont(new Font("Calibri",Font.PLAIN,24));
  button3.setVisible(false);
  button3.setFont(new Font("Calibri",Font.PLAIN,22));
  button4.setVisible(false);
  button4.setFont(new Font("Calibri",Font.PLAIN,24));
  button5.setVisible(false);
  button5.setFont(new Font("Calibri",Font.PLAIN,24));
  button6.setFont(new Font("Calibri",Font.PLAIN,24));
  button7.setFont(new Font("Calibri",Font.PLAIN,16));
  button8.setFont(new Font("Calibri",Font.PLAIN,24));
  button9.setVisible(false);
  button9.setFont(new Font("Calibri",Font.PLAIN,24));
  slider1.setVisible(false);
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
  
  fill(0,0,255);
  stroke(0,0,255); // stroke color blue
  ellipseMode(CENTER); // ref. point to ellipse is its center
  window1.setVisible(false);
  window2.setVisible(false);
}



public void grading(){
  float[] tempscore=new float[100];
  float[] tempscored=new float[100];
  
  for(int m=-1;m++<99;){
    ai[58][m]=(ai[58][m]+((ai[5][m]*balancepricea+ai[6][m]*balancepriceb+ai[7][m])-ai[57][m]))/2;
    ai[57][m]=ai[5][m]*balancepricea+ai[6][m]*balancepriceb+ai[7][m];
  }
  tempscore=reverse(sort(ai[57]));
  tempscored=reverse(sort(ai[58]));
  for(int m=-1;m++<99;){
    if(ai[57][m]==tempscore[0]){
      best=m;
    }
    if(ai[57][m]==tempscore[1]){
      best2=m;
    }
    if(ai[57][m]==tempscore[2]){
      best3=m;
    }
    if(ai[58][m]==tempscored[0]){
      bestd=m;
    }
    if(ai[58][m]==tempscored[1]){
      bestd2=m;
    }
    if(ai[58][m]==tempscored[2]){
      bestd3=m;
    }
  }
}

public void showdata(){
  String datatxt="#         a         b         balance                      #          a        b         balance\n";
  for(int m=-1;m++<49;){
    for(int n=-1;n++<7;){
      if((n==0||n==5||n==6)&&ai[59][m]==1)
        datatxt+=nf(ai[n][m],3,0)+"     ";
      else if((n==7)&&ai[59][m]==1)
        datatxt+=nf(ai[n][m],4,2)+"                      ";
      else if(n==0||n==5||n==6)
        datatxt+="        ";
      else if(n==7)
        datatxt+="                                            ";
    }
    for(int n=-1;n++<7;){
      if((n==0||n==5||n==6)&&ai[59][m+50]==1)
        datatxt+=nf(ai[n][m+50],3,0)+"     ";
      else if((n==7)&&ai[59][m+50]==1)
        datatxt+=nf(ai[n][m+50],4,2);
    }
    datatxt+="\n";
  }
  float[] hh=new float[100];
  hh=reverse(sort(ai[57]));
  int h1=0,h2=0,h3=0,h4=0,h5=0;
  for(int m=-1;m++<99;){
    if(ai[57][m]==hh[0])
      h1=m;
    if(ai[57][m]==hh[1])
      h2=m;
    if(ai[57][m]==hh[2])
      h3=m;
    if(ai[57][m]==hh[3])
      h4=m;
    if(ai[57][m]==hh[4])
      h5=m;
  }
  String ledata="Leader Board\n";
  ledata+="No.1 : #"+nf(h1+1,3,0)+" -- "+nf(ai[57][h1],5,2)+"\n";
  ledata+="No.2 : #"+nf(h2+1,3,0)+" -- "+nf(ai[57][h2],5,2)+"\n";
  ledata+="No.3 : #"+nf(h3+1,3,0)+" -- "+nf(ai[57][h3],5,2)+"\n";
  ledata+="No.4 : #"+nf(h4+1,3,0)+" -- "+nf(ai[57][h4],5,2)+"\n";
  ledata+="No.5 : #"+nf(h5+1,3,0)+" -- "+nf(ai[57][h5],5,2);
  
  String userinfo="player info : \n";
  userinfo+="quantity of a : "+nf(useri[0],3,0)+"\n";
  userinfo+="quantity of b : "+nf(useri[1],3,0)+"\n";
  userinfo+="balance : "+nf(useri[2],3,0);
  
  String scoreii="Your Score : "+nf(useri[3],5,2);
  
  int app=0;
  int bpp=0;
  for(int m=-1;m++<99;){
    if(ai[56][m]>0)
      app+=2;
    else
      bpp+=2;
  }
  String aptr="a produced this round : "+nf(app,3,0);
  String bptr="b produced this round : "+nf(bpp,3,0);
  String aaa="a's balance price : "+nf(balancepricea,4,2);
  String bbb="b's balance price : "+nf(balancepriceb,4,2);
  String bbck="the bank value : "+nf(bank,9,2);
  String dai="eliminated ai : "+nf(alldead,10,0);
  String ain="AI #"+nf(checkai,3,0);
  

  label63.setText(ain);
  label1.setText(datatxt);
  label20.setText(userinfo);
  label18.setText(ledata);
  label13.setText(scoreii);
  label32.setText(dai);
  label27.setText(bbck);
  label31.setText(bbb);
  label26.setText(aaa);
  label25.setText(bptr);
  label24.setText(aptr);

  if(win1==0){
    window1.setVisible(true);
    win1=1;
  }
}

public void reborn(){
  for(int d=-1;d++<deadpos-1;){
    int c1,c2,c3,c4;
    c1=PApplet.parseInt(random(10,70));
    c2=PApplet.parseInt(random(10,70));
    c3=PApplet.parseInt(random(10,70));
    c4=PApplet.parseInt(random(10,70));
    if(d==0){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c1;){
        ai[m][deadlist[d]-1]=ai[m][best];
      }
      for(int m=c1;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][best2];
      }
    }
    else if(d==1){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c1;){
        ai[m][deadlist[d]-1]=ai[m][best2];
      }
      for(int m=c1;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][best];
      }
    }
    else if(d==2){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c2;){
        ai[m][deadlist[d]-1]=ai[m][best];
      }
      for(int m=c2;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][best3];
      }
    }
    else if(d==3){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c2;){
        ai[m][deadlist[d]-1]=ai[m][best3];
      }
      for(int m=c2;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][best];
      }
    }
    else if(d==4){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c3;){
        ai[m][deadlist[d]-1]=ai[m][bestd];
      }
      for(int m=c3;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][bestd2];
      }
    }
    else if(d==5){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c3;){
        ai[m][deadlist[d]-1]=ai[m][bestd2];
      }
      for(int m=c3;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][bestd];
      }
    }
    else if(d==6){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c4;){
        ai[m][deadlist[d]-1]=ai[m][bestd];
      }
      for(int m=c4;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][bestd3];
      }
    }
    else if(d==7){
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int m=0;m++<c4;){
        ai[m][deadlist[d]-1]=ai[m][bestd3];
      }
      for(int m=c4;m++<81;){
        ai[m][deadlist[d]-1]=ai[m][bestd];
      }
    }
    else{
      bank+=ai[5][deadlist[d]-1]*balancepricea+ai[6][deadlist[d]-1]*balancepriceb+ai[7][deadlist[d]-1];
      for(int n=0;n++<81;){
        if(n==15||n==23||n==32||n==41||n==50||n==67||n==78){
          ai[n][deadlist[d]-1]=random(-100,100);
        }
        else if(n==8||n==9||n==16||n==17||n==25||n==26||n==34||n==35||n==43||n==44||n==60||n==61||n==71||n==72){
          ai[n][deadlist[d]-1]=random(-10,10);
        }
        else if(n==52||n==53||n==54||n==55){
          ai[n][deadlist[d]-1]=random(1,10);
        }
        else if(n==70||n==81){
          ai[n][deadlist[d]-1]=random(100,1000);
        }
        else{
          ai[n][deadlist[d]-1]=random(-2,2);
        }
      }
      ai[1][deadlist[d]-1]=50;
      ai[2][deadlist[d]-1]=50;
      ai[3][deadlist[d]-1]=50;
      ai[4][deadlist[d]-1]=50;
    }
    ai[5][deadlist[d]-1]=5;
    ai[6][deadlist[d]-1]=5;
    ai[7][deadlist[d]-1]=300;
    ai[59][deadlist[d]-1]=1;
  }
  deadpos=0;
}

public void saverecord(){
  
  for(int m=-1;m++<99;){
    record[m][(recordpos-1)%100]=ai[5][m];
    record[m+100][(recordpos-1)%100]=ai[6][m];
    record[m+200][(recordpos-1)%100]=ai[7][m];
    record[m+300][(recordpos-1)%100]=ai[57][m];
  }
  record[400][(recordpos-1)%100]=0;
  record[401][(recordpos-1)%100]=0;
  record[402][(recordpos-1)%100]=0;
  record[403][(recordpos-1)%100]=0;
  //for(int m=-1;m++<99;){
  //  if(ai[59][m]==1&&ai[1][m]>balancepricea){
  //    record[400][(recordpos-1)%100]+=ai[82][m]*(ai[1][m]-balancepricea);
  //  }
  //  if(ai[59][m]==1&&ai[2][m]<balancepricea){
  //    record[401][(recordpos-1)%100]+=ai[82][m]*(-ai[2][m]+balancepricea);
  //  }
  //  if(ai[59][m]==1&&ai[3][m]>balancepriceb){
  //    record[402][(recordpos-1)%100]+=ai[83][m]*(ai[3][m]-balancepriceb);
  //  }
  //  if(ai[59][m]==1&&ai[4][m]<balancepriceb){
  //    record[403][(recordpos-1)%100]+=ai[83][m]*(-ai[4][m]+balancepriceb);
  //  }
  //}
  if(adl<1)
    adl=1;
  if(asl<1)
    asl=1;
  if(bdl<1)
    bdl=1;
  if(bsl<1)
    bsl=1;
  record[400][(recordpos-1)%100]=adl;
  record[401][(recordpos-1)%100]=asl;
  record[402][(recordpos-1)%100]=bdl;
  record[403][(recordpos-1)%100]=bsl;
  record[404][(recordpos-1)%100]=allmoney;
  record[405][(recordpos-1)%100]=allwealth;
}

public void draw(){
  
  allmoney=0;
  allwealth=0;
  if(start==1){
    background(220);
    
    if(recordpos==0)
    recordpos++;
    
    
    stroke(139,131,120);
    for(int m=0;m++<99;){
      line(m*2+50,850-(PApplet.parseFloat(1)/750)*(record[404][(m+recordpos-1)%100]),(m-1)*2+50,850-(PApplet.parseFloat(1)/750)*(record[404][(m+recordpos-2)%100]));
    }
    
    stroke(220,20,60);
    line(50,250-balancepricea,250,250-balancepricea);
    line(350,250-balancepriceb,550,250-balancepriceb);
    
    for(int m=0;m++<99;){
      line(m*2+50,250-pricerecorda[(m+recordpos)%100],(m-1)*2+50,250-pricerecorda[(m+recordpos-1)%100]);
      line(m*2+350,250-pricerecordb[(m+recordpos)%100],(m-1)*2+350,250-pricerecordb[(m+recordpos-1)%100]);
    }

    stroke(107,142,35);
    for(int m=0;m++<99;){
      line(m*2+50,550-12*log(record[400][(m+recordpos-1)%100]),(m-1)*2+50,550-12*log(record[400][(m+recordpos-2)%100]));
      line(m*2+350,550-12*log(record[402][(m+recordpos-1)%100]),(m-1)*2+350,550-12*log(record[402][(m+recordpos-2)%100]));
    }
    stroke(0,154,205);
    for(int m=0;m++<99;){
      line(m*2+50,550-12*log(record[401][(m+recordpos-1)%100]),(m-1)*2+50,550-12*log(record[401][(m+recordpos-2)%100]));
      line(m*2+350,550-12*log(record[403][(m+recordpos-1)%100]),(m-1)*2+350,550-12*log(record[403][(m+recordpos-2)%100]));
    }
    stroke(205,0,205);
    for(int m=0;m++<99;){
      line(m*2+50,550-12*log(record[400][(m+recordpos-1)%100])-12*log(record[401][(m+recordpos-1)%100]),(m-1)*2+50,550-12*log(record[400][(m+recordpos-2)%100])-12*log(record[401][(m+recordpos-2)%100]));
      line(m*2+350,550-12*log(record[402][(m+recordpos-1)%100])-12*log(record[403][(m+recordpos-1)%100]),(m-1)*2+350,550-12*log(record[402][(m+recordpos-2)%100])-12*log(record[403][(m+recordpos-2)%100]));
    }
    stroke(238,58,140);
    for(int m=0;m++<99;)
      line(m*2+50,850-(PApplet.parseFloat(1)/750)*(record[405][(m+recordpos-1)%100]),(m-1)*2+50,850-(PApplet.parseFloat(1)/750)*(record[405][(m+recordpos-2)%100]));
    stroke(0,0,0);
    line(35,150,50,150);
    line(35,750,50,750);
    line(335,150,350,150);
    line(50,250,275,250);
    line(50,25,50,250);
    line(350,250,575,250);
    line(350,25,350,250);
    line(50,325,50,550);
    line(50,550,275,550);
    line(50,625,50,850);
    line(50,850,275,850);
    line(350,325,350,550);
    line(350,550,575,550);


    stroke(0,154,205);  //blue
    
    int mmm=0;
    int nnn=0;
    for(int m=-1;m++<tttt-1;){
      line(mmm*2+50,250-sba[m],2*(mmm+forcheck[m][0])+50,250-sba[m+1]);
      line(nnn*2+350,250-sbb[m],2*(nnn+forcheck[m][2])+350,250-sbb[m+1]);
      mmm+=forcheck[m][0];
      nnn+=forcheck[m][2];
    }
    
    stroke(107,142,35); // stroke color green
    
    mmm=0;
    nnn=0;
    for(int m=-1;m++<tttt-1;){
      line(2*mmm+50,250-dba[m],(mmm+forcheck[m][1])*2+50,250-dba[m+1]);
      line(2*nnn+350,250-dbb[m],(nnn+forcheck[m][3])*2+350,250-dbb[m+1]);// draw the line
      mmm+=forcheck[m][1];
      nnn+=forcheck[m][3];
    }


    // increment x and y
    
    
    delay(50);
    start=0;
  }
  if(next==1&&join==0){
    start=1;
    if(nextround==1)
      join=1;
    
    
    adl=0;
    asl=0;
    bdl=0;
    bsl=0;
    tttt=-1;
    if(joining==1&&skip==0){
      sba[0]=useras;
      dba[0]=userad;
      sbb[0]=userbs;
      dbb[0]=userbd;
      tttt=0;
    }
    for(int m=-1;m++<99;){
      if(ai[59][m]==1){
        tttt++;
        sba[tttt]=ai[1][m];
        dba[tttt]=ai[2][m];
        sbb[tttt]=ai[3][m];
        dbb[tttt]=ai[4][m];
      }
    }
    sba=sort(sba,tttt+1);
    dba=reverse(sort(dba));
    sbb=sort(sbb,tttt+1);
    dbb=reverse(sort(dbb));
    
    int t1=0,t2=0;
    int[][] tempt=new int[100][4];
    int temuser1=0;
    int temuser2=0;
    int temuser3=0;
    int temuser4=0;
    int m1=0,m2=0;
    
    tas=tad=tbs=tbd=0;
    
    while(true){
      for(int n=-1;n++<99;){
        if(t1<=0&&(tempt[n][0]==0&&sba[m1]==ai[1][n]&&ai[59][n]==1)||(temuser1==0)&&(sba[m1]==useras)&&joining==1&&skip==0){
          if(tempt[n][0]==0&&sba[m1]==ai[1][n]&&ai[59][n]==1){
            t1=PApplet.parseInt(ai[82][n]);
            tas+=PApplet.parseInt(ai[82][n]);
            tempt[n][0]=1;
          }
          else{
            t1=PApplet.parseInt(userasq);
            tas+=PApplet.parseInt(userasq);
            temuser1=1;
          }
          forcheck[m1][0]=t1;
          break;
        }
      }
      for(int n=-1;n++<99;){
        if(t2<=0&&(tempt[n][1]==0&&dba[m2]==ai[2][n]&&ai[59][n]==1)||(temuser2==0)&&(dba[m2]==userad&&joining==1&&skip==0)){
          if(tempt[n][1]==0&&dba[m2]==ai[2][n]&&ai[59][n]==1){
            t2=PApplet.parseInt(ai[82][n]);
            tad+=PApplet.parseInt(ai[82][n]);
            tempt[n][1]=1;
          }
          else{
            t2=PApplet.parseInt(useradq);
            tad+=PApplet.parseInt(useradq);
            temuser2=1;
          }
          forcheck[m2][1]=t2;
          break;
        }
      }
      if(m1>tttt-2||m2>tttt-2){
        balancepricea=(sba[m1]+dba[m2])/2;
        break;
      }
      else if((t1>=t2&&dba[m2+1]<sba[m1])||(t1<t2&&dba[m2]<sba[m1+1])){
        balancepricea=(sba[m1]+dba[m2])/2;
        break;
      }
      else if(t1>=t2){
        t1-=t2;
        m2++;
        t2=0;
      }
      else{
        t2-=t1;
        m1++;
        t1=0;
      }
    }
    t1=t2=0;
    m1=m2=0;
    temuser1=temuser2=temuser3=temuser4=0;

    while(true){
      for(int n=-1;n++<99;){
        if(t1<=0&&(tempt[n][2]==0&&sbb[m1]==ai[3][n]&&ai[59][n]==1)||(temuser3==0)&&(sbb[m1]==userbs&&joining==1&&skip==0)){
          if(tempt[n][2]==0&&sbb[m1]==ai[3][n]&&ai[59][n]==1){
            t1=PApplet.parseInt(ai[83][n]);
            tbs+=PApplet.parseInt(ai[83][n]);
            tempt[n][2]=1;
          }
          else{
            t1=PApplet.parseInt(userbsq);
            tbs+=PApplet.parseInt(userbsq);
            temuser3=1;
          }
          forcheck[m1][2]=t1;
          break;
        }
      }
      for(int n=-1;n++<99;){
        if(t2<=0&&(tempt[n][3]==0&&dbb[m2]==ai[4][n]&&ai[59][n]==1)||(temuser4==0)&&(dbb[m2]==userbd&&joining==1&&skip==0)){
          if(tempt[n][3]==0&&dbb[m2]==ai[4][n]&&ai[59][n]==1){
            t2=PApplet.parseInt(ai[83][n]);
            tbd+=PApplet.parseInt(ai[83][n]);
            tempt[n][3]=1;
          }
          else{
            t2=PApplet.parseInt(userbdq);
            tbd+=PApplet.parseInt(userbdq);
            temuser4=1;
          }
          forcheck[m2][3]=t2;
          break;
        }
      }
      if(m1>tttt-2||m2>tttt-2){
        balancepriceb=(sbb[m1]+dbb[m2])/2;
        break;
      }
      else if((t1>=t2&&dbb[m2+1]<sbb[m1])||(t1<t2&&dbb[m2]<sbb[m1+1])){
        balancepriceb=(sbb[m1]+dbb[m2])/2;
        break;
      }
      else if(t1>=t2){
        t1-=t2;
        m2++;
        t2=0;
      }
      else{
        t2-=t1;
        m1++;
        t1=0;
      }
    }
    pricerecorda[recordpos%100]=balancepricea;
    pricerecordb[recordpos%100]=balancepriceb;
    recordpos++;
    
    
    
    int[][] tempnum=new int[100][4];
    
    int asq=max(tad,tas);
    int adq=max(tbd,tbs);
    int bsq=max(tad,tas);
    int bdq=max(tbd,tbs);
    int ut1=0,ut2=0,ut3=0,ut4=0;
    
    for(int m=-1;m++<tttt;){
      for(int n=-1;n++<99;){
        if((sba[m]==ai[1][n]&&tempnum[n][0]==0&&sba[m]<=balancepricea&&ai[59][n]==1)||(sba[m]==useras&&ut1==0&&sba[m]<=balancepricea&&joining==1&&skip==0)){
          if(sba[m]==ai[1][n]&&tempnum[n][0]==0&&sba[m]<=balancepricea&&ai[59][n]==1){
            for(int k=0;k++<PApplet.parseInt(ai[82][m])&&asq>0;){
              ai[5][n]--;
              ai[7][n]+=balancepricea;
              asl+=(balancepricea-sba[m]);
              asq--;
            }
            tempnum[n][0]=1;
          }
          else{
            for(int k=0;k++<PApplet.parseInt(userasq)&&asq>0;){
              useri[0]--;
              useri[2]+=balancepricea;
              asl+=(balancepricea-sba[m]);
              asq--;
            }
            ut1=1;
          }
          break;
        }
      }
      for(int n=-1;n++<99;){
        if((dba[m]==ai[2][n]&&tempnum[n][1]==0&&dba[m]>=balancepricea&&ai[59][n]==1)||(dba[m]==userad&&ut2==0&&dba[m]>=balancepricea&&joining==1&&skip==0)){
          if(dba[m]==ai[2][n]&&tempnum[n][1]==0&&dba[m]>=balancepricea&&ai[59][n]==1){
            for(int k=0;k++<PApplet.parseInt(ai[82][m])&&adq>0;){
              ai[5][n]++;
              ai[7][n]-=balancepricea;
              adl+=(-balancepricea+dba[m]);
              adq--;
            }
            tempnum[n][1]=1;
          }
          else{
            for(int k=0;k++<PApplet.parseInt(useradq)&&adq>0;){
              useri[0]++;
              useri[2]-=balancepricea;
              adl+=(-balancepricea+dba[m]);
              adq--;
            }
            ut2=1;
          }
          break;
        }
      }
      for(int n=-1;n++<99;){
        if((sbb[m]==ai[3][n]&&tempnum[n][2]==0&&sbb[m]<=balancepriceb&&ai[59][n]==1)||(sbb[m]==userbs&&ut3==0&&sbb[m]<=balancepriceb&&joining==1&&skip==0)){
          if(sbb[m]==ai[3][n]&&tempnum[n][2]==0&&sbb[m]<=balancepriceb&&ai[59][n]==1){
            for(int k=0;k++<PApplet.parseInt(ai[83][m])&&bsq>0;){
              ai[5][n]--;
              ai[7][n]+=balancepriceb;
              bsl+=(balancepriceb-sbb[m]);
              bsq--;
            }
            tempnum[n][2]=1;
          }
          else{
            for(int k=0;k++<PApplet.parseInt(userbsq)&&bsq>0;){
              useri[1]--;
              useri[2]+=balancepriceb;
              bsl+=(+balancepriceb-sbb[m]);
              bsq--;
            }
            ut3=1;
          }
          break;
        }
      }
      for(int n=-1;n++<99;){
        if((dbb[m]==ai[4][n]&&tempnum[n][3]==0&&dbb[m]>=balancepriceb&&ai[59][n]==1)||(dbb[m]==userbd&&ut4==0&&dbb[m]>=balancepriceb&&joining==1&&skip==0)){
          if(dbb[m]==ai[4][n]&&tempnum[n][3]==0&&dbb[m]>=balancepriceb&&ai[59][n]==1){
            for(int k=0;k++<PApplet.parseInt(ai[83][m])&&bdq>0;){
              ai[5][n]++;
              ai[7][n]-=balancepriceb;
              bdl+=(-balancepriceb+dbb[m]);
              bdq--;
            }
            tempnum[n][3]=1;
          }
          else{
            for(int k=0;k++<PApplet.parseInt(userbdq)&&bdq>0;){
              useri[1]++;
              useri[2]-=balancepriceb;
              bdl+=(-balancepriceb+dbb[m]);
              bdq--;
            }
            ut4=1;
          }
          break;
        }
      }
    }
    if(joining==1){
      if(skip==0){
        if(userpro==0)
          useri[0]+=2;
        else
          useri[1]+=2;
        useri[0]--;
        useri[1]--;
      }
      useri[3]=useri[0]*balancepricea+useri[1]*balancepriceb+useri[2];
      if(useri[0]<0||useri[1]<0||useri[2]<0)
        joining=0;
    }
    
    for(int m=-1;m++<99;){
      if(ai[56][m]>0){
        ai[5][m]+=2;
      }
      else{
        ai[6][m]+=2;
      }
      ai[5][m]--;
      ai[6][m]--;
      if((ai[5][m]<0||ai[6][m]<0||ai[7][m]<0)&&ai[59][m]==1){
        ai[59][m]=0;
        deadlist[deadpos]=m+1;
        deadpos++;
        alldead++;
      }
      grading();
      if(recordpos%aiii==0)
      reborn();
      if(ai[59][m]==1){
        allmoney+=ai[7][m];
        allwealth+=ai[7][m];
        allwealth+=ai[5][m]*balancepricea;
        allwealth+=ai[6][m]*balancepriceb;
      }
      saverecord();
    }
    for(int m=-1;m++<99;){
      if(recordpos==1&&ai[59][m]==1){
        ai[1][m]=abs(ai[5][m]*ai[16][m]+ai[6][m]*ai[17][m]+ai[7][m]*ai[18][m]+50*ai[19][m]+pricerecorda[recordpos-1]*ai[20][m]+50*ai[21][m]+pricerecordb[recordpos-1]*ai[22][m]+ai[23][m]+ai[1][m]*ai[24][m])/ai[52][m];
        ai[2][m]=abs(ai[5][m]*ai[25][m]+ai[6][m]*ai[26][m]+ai[7][m]*ai[27][m]+50*ai[28][m]+pricerecorda[recordpos-1]*ai[29][m]+50*ai[30][m]+pricerecordb[recordpos-1]*ai[31][m]+ai[32][m]+ai[2][m]*ai[33][m])/ai[53][m];
        ai[3][m]=abs(ai[5][m]*ai[34][m]+ai[6][m]*ai[35][m]+ai[7][m]*ai[36][m]+50*ai[37][m]+pricerecorda[recordpos-1]*ai[38][m]+50*ai[39][m]+pricerecordb[recordpos-1]*ai[40][m]+ai[41][m]+ai[3][m]*ai[42][m])/ai[54][m];
        ai[4][m]=abs(ai[5][m]*ai[43][m]+ai[6][m]*ai[44][m]+ai[7][m]*ai[45][m]+50*ai[46][m]+pricerecorda[recordpos-1]*ai[47][m]+50*ai[48][m]+pricerecordb[recordpos-1]*ai[49][m]+ai[50][m]+ai[4][m]*ai[51][m])/ai[55][m];
        ai[56][m]=ai[5][m]*ai[8][m]+ai[6][m]*ai[9][m]+ai[7][m]*ai[10][m]+50*ai[11][m]+pricerecorda[recordpos-1]*ai[12][m]+50*ai[13][m]+pricerecordb[recordpos-1]*ai[14][m]+ai[15][m];
        ai[82][m]=abs(ai[5][m]*ai[60][m]+ai[6][m]*ai[61][m]+ai[7][m]*ai[62][m]+50*ai[63][m]+pricerecorda[recordpos-1]*ai[64][m]+50*ai[65][m]+pricerecordb[recordpos-1]*ai[66][m]+ai[67][m]+ai[1][m]*ai[68][m]+ai[2][m]*ai[69][m])/ai[70][m];
        ai[83][m]=abs(ai[5][m]*ai[71][m]+ai[6][m]*ai[72][m]+ai[7][m]*ai[73][m]+50*ai[74][m]+pricerecorda[recordpos-1]*ai[75][m]+50*ai[76][m]+pricerecordb[recordpos-1]*ai[77][m]+ai[78][m]+ai[3][m]*ai[79][m]+ai[4][m]*ai[80][m])/ai[81][m];
        if(ai[82][m]>ai[5][m])
          ai[82][m]=ai[5][m];
        if(ai[83][m]>ai[6][m])
          ai[83][m]=ai[6][m];
        
      }
      else if(ai[59][m]==1){
        ai[1][m]=abs(ai[5][m]*ai[16][m]+ai[6][m]*ai[17][m]+ai[7][m]*ai[18][m]+pricerecorda[(recordpos-2)%100]*ai[19][m]+pricerecorda[(recordpos-1)%100]*ai[20][m]+pricerecordb[(recordpos-2)%100]*ai[21][m]+pricerecordb[(recordpos-1)%100]*ai[22][m]+ai[23][m]+ai[1][m]*ai[24][m])/ai[52][m];
        ai[2][m]=abs(ai[5][m]*ai[25][m]+ai[6][m]*ai[26][m]+ai[7][m]*ai[27][m]+pricerecorda[(recordpos-2)%100]*ai[28][m]+pricerecorda[(recordpos-1)%100]*ai[29][m]+pricerecordb[(recordpos-2)%100]*ai[30][m]+pricerecordb[(recordpos-1)%100]*ai[31][m]+ai[32][m]+ai[2][m]*ai[33][m])/ai[53][m];
        ai[3][m]=abs(ai[5][m]*ai[34][m]+ai[6][m]*ai[35][m]+ai[7][m]*ai[36][m]+pricerecorda[(recordpos-2)%100]*ai[37][m]+pricerecorda[(recordpos-1)%100]*ai[38][m]+pricerecordb[(recordpos-2)%100]*ai[39][m]+pricerecordb[(recordpos-1)%100]*ai[40][m]+ai[41][m]+ai[3][m]*ai[42][m])/ai[54][m];
        ai[4][m]=abs(ai[5][m]*ai[43][m]+ai[6][m]*ai[44][m]+ai[7][m]*ai[45][m]+pricerecorda[(recordpos-2)%100]*ai[46][m]+pricerecorda[(recordpos-1)%100]*ai[47][m]+pricerecordb[(recordpos-2)%100]*ai[48][m]+pricerecordb[(recordpos-1)%100]*ai[49][m]+ai[50][m]+ai[4][m]*ai[51][m])/ai[55][m];
        ai[56][m]=ai[5][m]*ai[8][m]+ai[6][m]*ai[9][m]+ai[7][m]*ai[10][m]+pricerecorda[(recordpos-2)%100]*ai[11][m]+pricerecorda[(recordpos-1)%100]*ai[12][m]+pricerecordb[(recordpos-2)%100]*ai[13][m]+pricerecordb[(recordpos-1)%100]*ai[14][m]+ai[15][m];
        ai[82][m]=abs(ai[5][m]*ai[60][m]+ai[6][m]*ai[61][m]+ai[7][m]*ai[62][m]+pricerecorda[(recordpos-2)%100]*ai[63][m]+pricerecorda[(recordpos-1)%100]*ai[64][m]+pricerecordb[(recordpos-2)%100]*ai[65][m]+pricerecordb[(recordpos-1)%100]*ai[66][m]+ai[67][m]+ai[1][m]*ai[68][m]+ai[2][m]*ai[69][m])/ai[70][m];
        ai[83][m]=abs(ai[5][m]*ai[71][m]+ai[6][m]*ai[72][m]+ai[7][m]*ai[73][m]+pricerecorda[(recordpos-2)%100]*ai[74][m]+pricerecorda[(recordpos-1)%100]*ai[75][m]+pricerecordb[(recordpos-2)%100]*ai[76][m]+pricerecordb[(recordpos-1)%100]*ai[77][m]+ai[78][m]+ai[3][m]*ai[79][m]+ai[4][m]*ai[80][m])/ai[81][m];
        if(ai[82][m]>ai[5][m])
          ai[82][m]=ai[5][m];
        if(ai[83][m]>ai[6][m])
          ai[83][m]=ai[6][m];
      }
    }
    
    showdata();
    //next=0;
  }
}
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
  userad=PApplet.parseFloat(textfield1.getText());
} //_CODE_:textfield1:265921:

public void textfield2_change1(GTextField source, GEvent event) { //_CODE_:textfield2:461938:
  println("textfield2 - GTextField >> GEvent." + event + " @ " + millis());
  useradq=PApplet.parseFloat(textfield2.getText());
} //_CODE_:textfield2:461938:

public void textfield3_change1(GTextField source, GEvent event) { //_CODE_:textfield3:392952:
  println("textfield3 - GTextField >> GEvent." + event + " @ " + millis());
  useras=PApplet.parseFloat(textfield3.getText());
} //_CODE_:textfield3:392952:

public void textfield4_change1(GTextField source, GEvent event) { //_CODE_:textfield4:275519:
  println("textfield4 - GTextField >> GEvent." + event + " @ " + millis());
  userasq=PApplet.parseFloat(textfield4.getText());
} //_CODE_:textfield4:275519:

public void textfield5_change1(GTextField source, GEvent event) { //_CODE_:textfield5:259826:
  println("textfield5 - GTextField >> GEvent." + event + " @ " + millis());
  userbd=PApplet.parseFloat(textfield5.getText());
} //_CODE_:textfield5:259826:

public void textfield6_change1(GTextField source, GEvent event) { //_CODE_:textfield6:731881:
  println("textfield6 - GTextField >> GEvent." + event + " @ " + millis());
  userbdq=PApplet.parseFloat(textfield6.getText());
} //_CODE_:textfield6:731881:

public void textfield7_change1(GTextField source, GEvent event) { //_CODE_:textfield7:410653:
  println("textfield7 - GTextField >> GEvent." + event + " @ " + millis());
  userbs=PApplet.parseFloat(textfield7.getText());
} //_CODE_:textfield7:410653:

public void textfield8_change1(GTextField source, GEvent event) { //_CODE_:textfield8:575632:
  println("textfield8 - GTextField >> GEvent." + event + " @ " + millis());
  userbsq=PApplet.parseFloat(textfield8.getText());
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
  checkai=PApplet.parseInt(textfield9.getText());
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
    appc.line(m*2+350,250-0.2f*record[checkai-1+200][(m+recordpos-1)%100],(m-1)*2+350,250-0.2f*record[checkai-1+200][(m+recordpos-2)%100]);
  }
  appc.stroke(255,0,0);
  for(int m=0;m++<99;){
    appc.line(m*2+50,550-0.1f*record[checkai-1+300][(m+recordpos-1)%100],(m-1)*2+50,550-0.1f*record[checkai-1+300][(m+recordpos-2)%100]);
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
  slider1 = new GSlider(this, 650, 320, 100, 40, 10.0f);
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
  public void settings() {  size(800,900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "finalproject" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
