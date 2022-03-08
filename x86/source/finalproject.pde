import g4p_controls.*;
import java.awt.Font;
import java.awt.*;

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

void setup(){
  recordpos=0;
  joining=0;
  deadpos=0;
  size(800,900);
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



void grading(){
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

void showdata(){
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

void reborn(){
  for(int d=-1;d++<deadpos-1;){
    int c1,c2,c3,c4;
    c1=int(random(10,70));
    c2=int(random(10,70));
    c3=int(random(10,70));
    c4=int(random(10,70));
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

void saverecord(){
  
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

void draw(){
  
  allmoney=0;
  allwealth=0;
  if(start==1){
    background(220);
    
    if(recordpos==0)
    recordpos++;
    
    
    stroke(139,131,120);
    for(int m=0;m++<99;){
      line(m*2+50,850-(float(1)/750)*(record[404][(m+recordpos-1)%100]),(m-1)*2+50,850-(float(1)/750)*(record[404][(m+recordpos-2)%100]));
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
      line(m*2+50,850-(float(1)/750)*(record[405][(m+recordpos-1)%100]),(m-1)*2+50,850-(float(1)/750)*(record[405][(m+recordpos-2)%100]));
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
            t1=int(ai[82][n]);
            tas+=int(ai[82][n]);
            tempt[n][0]=1;
          }
          else{
            t1=int(userasq);
            tas+=int(userasq);
            temuser1=1;
          }
          forcheck[m1][0]=t1;
          break;
        }
      }
      for(int n=-1;n++<99;){
        if(t2<=0&&(tempt[n][1]==0&&dba[m2]==ai[2][n]&&ai[59][n]==1)||(temuser2==0)&&(dba[m2]==userad&&joining==1&&skip==0)){
          if(tempt[n][1]==0&&dba[m2]==ai[2][n]&&ai[59][n]==1){
            t2=int(ai[82][n]);
            tad+=int(ai[82][n]);
            tempt[n][1]=1;
          }
          else{
            t2=int(useradq);
            tad+=int(useradq);
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
            t1=int(ai[83][n]);
            tbs+=int(ai[83][n]);
            tempt[n][2]=1;
          }
          else{
            t1=int(userbsq);
            tbs+=int(userbsq);
            temuser3=1;
          }
          forcheck[m1][2]=t1;
          break;
        }
      }
      for(int n=-1;n++<99;){
        if(t2<=0&&(tempt[n][3]==0&&dbb[m2]==ai[4][n]&&ai[59][n]==1)||(temuser4==0)&&(dbb[m2]==userbd&&joining==1&&skip==0)){
          if(tempt[n][3]==0&&dbb[m2]==ai[4][n]&&ai[59][n]==1){
            t2=int(ai[83][n]);
            tbd+=int(ai[83][n]);
            tempt[n][3]=1;
          }
          else{
            t2=int(userbdq);
            tbd+=int(userbdq);
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
            for(int k=0;k++<int(ai[82][m])&&asq>0;){
              ai[5][n]--;
              ai[7][n]+=balancepricea;
              asl+=(balancepricea-sba[m]);
              asq--;
            }
            tempnum[n][0]=1;
          }
          else{
            for(int k=0;k++<int(userasq)&&asq>0;){
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
            for(int k=0;k++<int(ai[82][m])&&adq>0;){
              ai[5][n]++;
              ai[7][n]-=balancepricea;
              adl+=(-balancepricea+dba[m]);
              adq--;
            }
            tempnum[n][1]=1;
          }
          else{
            for(int k=0;k++<int(useradq)&&adq>0;){
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
            for(int k=0;k++<int(ai[83][m])&&bsq>0;){
              ai[5][n]--;
              ai[7][n]+=balancepriceb;
              bsl+=(balancepriceb-sbb[m]);
              bsq--;
            }
            tempnum[n][2]=1;
          }
          else{
            for(int k=0;k++<int(userbsq)&&bsq>0;){
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
            for(int k=0;k++<int(ai[83][m])&&bdq>0;){
              ai[5][n]++;
              ai[7][n]-=balancepriceb;
              bdl+=(-balancepriceb+dbb[m]);
              bdq--;
            }
            tempnum[n][3]=1;
          }
          else{
            for(int k=0;k++<int(userbdq)&&bdq>0;){
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