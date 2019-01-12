


//kousma metinlerine cevap vs ekle.

//mosterlerde esya dusurme
// mosterlerle savasma mekanıgı



package Diyarin.Krali;


import java.util.Random;
import java.util.Scanner;





public class Arthur {
  
    int seviye=0;
    int a;
    float deneyim ;
    int sf;
    int zf ;
    int suf ;
    int yf;
    int para = 100 ; 
    int su=5,aclik=10;
    int silah = 0, zirh = 0, güc = 0, beceri=0 ,ceviklik=0;

     Scanner input = new Scanner(System.in);
     

     public void Movia(){
         System.out.println("            _.------.                        .----.__\n" +
"           /         \\_.       ._           /---.__  \\\n" +
"          |  O    O   |\\\\___  //|          /       `\\ |\n" +
"          |  .vvvvv.  | )   `(/ |         | o     o  \\|\n" +
"          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\n" +
"         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\n" +
"       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\n" +
"      /   / |         \\        /  | | ~   \\          |  \\\\\n" +
"      \\  /  |        / \\ Y   /'   | \\     |          |   ~\n" +
"       `'   |  _     |  `._/' |   |  \\     7        /\n" +
"         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\n" +
"    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\n" +
" --'                  \\  \\ |   /    |  |              `-\n" +
"                       \\uU \\UU/     |  /   :F_P:");
         
         System.out.println("Karsına bir Movia geliyor. \nMovia ile dovuste 1 su , 3 yemek kayıp edersin.\nMovialar 1. seviye varliklardir\nEger kazanırsan 100 deneyim 200$ para verir.");
         
                       System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              int eldekiimkan;
              eldekiimkan = silah+zirh+güc+beceri+ceviklik+seviye;
              su = su - 1;
              aclik= aclik-3;
              
              if(eldekiimkan >= 2){
                  
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
                  if(red <= 90){
                      
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+200;
                  deneyim=deneyim+100;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim= deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsy = input.nextInt();
              gecis();
             
              
              HAZAR();
                  
                  }
                  else{
                      System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                  
                      System.out.println("Canavar kazandı"); 
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsa = input.nextInt();
              gecis();
              HAZAR();
                  }
              }
              else{
                                    
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
              
               if(red >= 90){     
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+200;
                  deneyim=deneyim+100;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaaa = input.nextInt();
              gecis();
              
              HAZAR();
                  }   
               else{                    
                   System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                   System.out.println("Canavar kazandı");
                
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
              gecis();
              HAZAR();}
              }
         
     }
     
     
     public void kalanpara(){
         

           System.out.println("\n\n\n\t\t\t\t\t\tkalan paran "+para+"$");
     }
     
     public void gecis(){
         for (int i = 0; i < 20; i++) {
             for (int j = 0; j < 6; j++) {
                 System.out.print("|||||||||||||||||");
             }
             System.out.print("\n");
         
      
         }
     }
     public void Kumarhane(){
         
         
         System.out.println("yatiracagin miktari gir = ");
         int yatirilicak = input.nextInt();
         
         if (yatirilicak < para && para > 0){
             int zahmin;     
             Random rd = new Random();
         
         zahmin = 1+rd.nextInt(3);    
         
          System.out.println("Aklımdan 1 den 3 e kadar sayı tuttum tahmin et");
          int tahmin = input.nextInt();
          if(tahmin == zahmin){
              System.out.println("Bildiniz");
              para = para+yatirilicak*2;
              kalanpara();
             
              System.out.println("Kumar haneye donmek icin 1 e bas");
              
              int dns = input.nextInt();
              switch(dns){
                  case 1:
                      KUMAR();
                      break;
                      case 2:
                          KUMAR();
                                  
                      default:
                          
                          break;
              }
              
              
          }
          else{
              System.out.println("Kayıp ettiniz"); 
              System.out.println("cevap "+zahmin+" idi");
              para= para-yatirilicak*3;
              kalanpara();
              System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              KUMAR();
              }
          
             
             
         }
         else{
             System.out.println("Yeterince paran yok dostum");
             kalanpara();
             System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
             KUMAR();
         } 
         
         
     }
     
     public void KUMAR(){
      gecis();
         System.out.println(
"              d#+%XMMMMMMMMMMMM%b\n" +
"            /%XXMMMMMMMMMMMMMMMMMMMb\n" +
"     .-----.MMMMMMMMMMMMMMMMMMMMMMMM\n" +
"    / -----/;+MMMMMMMMX+;= =+MMMMMMMM\n" +
"   |  ----|;;MMMMMMMX-      ;M%%MMMMMX\n" +
"   |   ---'/:+MMMMMM;       X%=  MMMMM\n" +
"   |   |   /\\+MMMMMM:       _._  %MMMM/\n" +
"   |   :   | |MMMMM%/_-\"-. :_ _:  XMMM%\n" +
"   '.   '-/' |MMMMMM%'--'    '     |/|\n" +
"    |      _/MMMMMX%     |         | |\n" +
"    |     |'XMMMMM_/     |_        | /\n" +
"    |     |  XMMM%%;:              |-\n" +
"    |     |    %XMM+=   .---.      |\n" +
"   .'     |     %%X%:,   ---    ,-'\n" +
"   |      |         |'.      ._-':\n" +
"   |      |        /   \"-----\"   |\n" +
"  /       |    __./              |.\n" +
"  |       |   /,.|                 -.\n" +
"  |       |  /...|                   -..-.\n" +
" .'       | |....\\                  /......\n" +
" |        |/|.....\\                /......=-.\n" +
" |        | |......\\.             /.....,-----.\n" +
".'          |.......'------------'......|      '.\n" +
"|           |,.........................,|       |\n" +
"|           |,......................... .       |\n" +
"|           |......................... .        |\n" +
"|          /...........................'       .'\n" +
" |        /...........................'        |\n" +
"  '___   /.......................... |        .'\n" +
"      '-'............................'        |\n" +
"       |........................... |        .'\n" +
"       |..........................,|         |\n" +
"       |..........................-'        /\n" +
"       |.........................'         /\n" +
"       |....................... |         /\n" +
"      /........................ |        |\n" +
"     /.........................'        /\n" +
"     |.......................,'        |\n" +
"     ):......................|         |\n" +
"     |,......................|        .+\n" +
"     |.......................|       //|\n" +
"     :---.__................/       |...\\\n" +
"    /       \"-_______-----\"\"|       |... |\n" +
"    .-                      |      .'... |\n" +
"   .'.'-.                   |      |.......\n" +
"  /......--.               .'     /........|\n" +
"  '.........'-------------'|     |.........|\n" +
"   |.....................,.'     |..........\\\n" +
"   |....................,,|     .'............\n" +
"   |....................,,|     |............|");
         
         System.out.println("\n\n\n-Selam. Ben Casiogirl.");
         System.out.println("+Merhaba. Casiogirl. Beni taniyorsundur heralde.");
         System.out.println("-Hayır burada kimse kimseyi tanimaz borclu olmadigi surece \n eger kendine guveniyorsan iceride paranı katlayabilirsin. ");
         System.out.println("+İsin icinde hile yoksa kesin kazanırım.");
         System.out.println("-Merak etme bu diyarda hile tuzak yasaktır. \n oyunun kurallarından bahsedecegim \n 1- Kaybettigin paraları asla geri alamassın. \n 2- Paran yoksa borcla oynayamassın. \n 3- Kazanırsan riske ettigin para iki ye katlanır kayıp edersen 3 katı silinir. \n Hala oynamak istiyormusun.  ");

         System.out.println("\n EVET demek icin 1 e bas / HAYIR demek icin 2 ye bas");
         
         int chat1cvp = input.nextInt();
         
         switch(chat1cvp){
             case 1:
                 
                 System.out.println("+EVET.");
                 Kumarhane();
                 
break;
                 
             case 2:
                 
                 System.out.println("+HAYIR.");
              
                 seceneklers2();
                 default:
                     seceneklers2();
             
         }
         
         
         
     }

     public void kazık_dukkan(){
         Random rnd = new Random();
         
         a=rnd.nextInt(10);
         sf = 40 + a;
            zf = 40 + a ;
            suf = 3 + a; 
            yf = 3 + a;
gecis();
         
         System.out.println(""+
"               ,\n" +
"            ,:' `..;\n" +
"            `. ,;;'%\n" +
"            +;;'%%%%%\n" +
"             /- %,)%%\n" +
"             `   \\ %%\n" +
"              =  )/ \\\n" +
"              `-'/ / \\\n" +
"                /\\/.-.\\\n" +
"               |  (    |\n" +
"               |  |   ||\n" +
"               |  |   ||\n" +
"           _.-----'   ||\n" +
"          / \\________,'|\n" +
"         (((/  |       |\n" +
"         //    |       |\n" +
"        //     |\\      |\n" +
"       //      | \\     |\n" +
"      //       |  \\    |\n" +
"     //        |   \\   |\n" +
"    //         |    \\  |\n" +
"   //          |    |\\ |\n" +
"  //           |    | \\|\n" +
" //            \\    \\\n" +
"c'             |\\    \\\n" +
"               | \\    \\\n" +
"               |  \\    \\  \n"+
"               |.' \\    \\  \n" +
"              _\\    \\.-' \\ \n" +
"             (___.-(__.'\\/    \n");
         
         System.out.println("-Merhaba ben kör satıcı. ");
         System.out.println("+Merhaba.");
         System.out.println("-Buradan ihtiyacın olan herşeyi alabilirsin "+nickname+".");
         System.out.println("+Isimimi nereden biliyorsun");
         System.out.println("-Diyarın talibiymissi namın cabuk yuruyor");
         System.out.println("+Sana neden kazıkcı diyorlar");
         System.out.println("-bana kör oldugum için kazıkcı diyorlar fiyatları hep farklı soyluyormşum hepsı palavra\n\n ");
         System.out.println("\n\n 1 Silah "+sf+"$ almak icin 1 e bas. \n\n 1 zirh "+zf+"$ almak icin 2 ye bas \n\n 1 Lt Su "+suf+"$ almak icin 3 e bas \n\n 1 tabak kuru pilav "+yf+"$ almak icin 4 e bas \n\n\n eger bisi almayacaksan beni oylama 5 e bas pazara geri git... ");
         
     int dukkanscnk = input.nextInt();
     
     switch(dukkanscnk){
         
             case 1 :
                 if(para >= sf){
                     
                 
                    silah++;
                    para=para-sf;
                    gecis();
                     System.out.println("alım basarılı");   
                 kalanpara();
                System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
            kazık_dukkan();
                 }
                 else{
                     gecis();
                 
                     System.out.println("yetersiz para");   
                     
                     System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                 kazık_dukkan();
                 }
             case 2 : 
                 if(para >= zf){
                 zirh++;
                 para=para-zf;
                gecis(); 
                     System.out.println("alım basarılı");
                kalanpara();
                System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                kazık_dukkan();
                 }
                 else{
                     System.out.println("yetersiz para");
                     System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                     kazık_dukkan();
                 }
             
             case 3 : 
                 if(para >= suf){
                 if(su < 20){ 
                     su++;
                    para=para-suf;
                 gecis();
                     System.out.println("alım gerceklestı");
              kalanpara();
                 System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                 
                 kazık_dukkan();}
                 else{gecis();
                 System.out.println("\n\n\n\n\n\nDAHA FAZLA SU ICEMESSIN\n\n\n\n");
                 System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                   
                 pazar();
                 }
                 }
                 else{
                     gecis();
                 
                     System.out.println("yeterlı paran malesef yok");
                     
                     System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                 kazık_dukkan();
                 }
             case 4 :
                if(para >= yf){
                 if(aclik < 45){aclik++; para=para-yf; gecis();kazık_dukkan(); System.out.println("alım basarılı :D");System.out.println("\n\nkalan paran "+para+"$");System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              kazık_dukkan();}
                 else{gecis(); System.out.println("\n\n\n\nDAHA FAZLA YERSEN OLERSIN\n\n\n\n");System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
               pazar();}
                }
                else{
                    System.out.println("paran yetmıyor genc adam");
                    System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                    kazık_dukkan();
                }
                 
                 
             case 5:
                 gecis();gecis();
                 pazar();
                 
                 default:
                     gecis();
                     System.out.println("yanlis tusladin");
                     System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                     pazar();
     }
     
     
     }
     public void kasadam(){
         gecis();
     
         System.out.println("" +
"                 ,#####,\n" +
"                 #_   _#\n" +
"                 |a` `a|\n" +
"                 |  u  |\n" +
"                 \\  =  /\n" +
"                 |\\___/|\n" +
"        ___ ____/:     :\\____ ___\n" +
"      .'   `.-===-\\   /-===-.`   '.\n" +
"     /      .-\"\"\"\"\"-.-\"\"\"\"\"-.      \\\n" +
"    /'             =:=             '\\\n" +
"  .'  ' .:    o   -=:=-   o    :. '  `.\n" +
"  (.'   /'. '-.....-'-.....-' .'\\   '.)\n" +
"  /' ._/   \".     --:--     .\"   \\_. '\\\n" +
" |  .'|      \".  ---:---  .\"      |'.  |\n" +
" |  : |       |  ---:---  |       | :  |\n" +
"  \\ : |       |_____._____|       | : /\n" +
"  /   (       |----|------|       )   \\\n" +
" /... .|      |    |      |      |. ...\\\n" +
"|::::/''     /     |       \\     ''\\::::|\n" +
"'\"\"\"\"       /'    .L_      `\\       \"\"\"\"'\n" +
"           /'-.,__/` `\\__..-'\\\n" +
"          ;      /     \\      ;\n" +
"          :     /       \\     |\n" +
"          |    /         \\.   |\n" +
"          |`../           |  ,/\n" +
"          ( _ )           |  _)\n" +
"          |   |           |   |\n" +
"          |___|           \\___|                  \n" +
"          :===|            |==|                      \n" +
"           \\  /            |__|                      \n" +
"           /\\/\\           /\"\"\"`8.__\n" +
"           |oo|           \\__.//___)\n" +
"           |==|\n" +
"           \\__/                                         "     );
         System.out.println("-Selam çelimsiz şey.. Ben kasadam");
         System.out.println("+Ben "+nickname);
         System.out.println("-Senin biraz antremana ihtiyacın var. ");
         System.out.println("+Evet, guclenmeliyim");
         System.out.println("-Cok dogru yerdesin. Besinini aldıysan amino asit basalım nedersin ?!?");
         System.out.println("Dostum 1 set ; \n Guc icin 1 e bas ve 50$ öde \n Beceri icin 2 ye bas ve 55$ öde \n Ceviklik icin 3 bas ve 60$ öde \n\n Eger pazara donmek istiyorsan 4 e bas;   ");
         
         int kasadamscnk = input.nextInt();
         switch(kasadamscnk)
         {                 case 1 :
                     if(para >= 50){
                     güc=+1;
                     para=para-50;
                     System.out.println("yeni guc = "+güc);
                     kalanpara();
                     System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
         kasadam();
                     }
                     else{
                         System.out.println("50 paran bilemi yok :'('");   
                         System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                     kasadam();
                     }
         case 2 :
             if(para >= 55){
                     beceri=+1;
                     para=para-55;
                   System.out.println("teni beceri = "+beceri);
                   System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
                    kalanpara();
         kasadam();}
             else{
                 System.out.println("paran yok koçum");   
                 System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
             kasadam();
             }
         case 3 :
             if(para >= 60){
               ceviklik=+1;
                     para=para-60;
                     System.out.println("yeni ceviklik = "+ceviklik);
                     
                     kalanpara();
                     System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              
         kasadam();}
             else{System.out.println("git para kazan fakir");System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
               kasadam();}
                 case 4 :
                     pazar();
                     
                     default:
                       kalanpara();
                         pazar();
         
     }
     }
     
     public void pazar(){
         gecis();
     
         System.out.println("köylü pazara hos geldin");
         System.out.println("Dükkana gitmek icin 1 e bas");
         System.out.println("Geliştiriciye gitmek icin 2 ye bas");
         System.out.println("Secenekler Menusu ıcın 3 e bas");
         int pzrscnklr = input.nextInt();
         switch(pzrscnklr){
             case 1 : 
                 kazık_dukkan();
                 break;
                 
             case 2 : 
                 kasadam();
                 break;
             
             case 3 : 
                 seceneklers2();
                 break;
                 default:
                     System.out.println("yanlis bastın");
                     pazar();
         }
     }
    
    public void  seceneklers1(){
        gecis();
        System.out.println("\n\n\n\nSecenekler Menusu\n#Petra şehri için 1 \n #Durum bilgileri icin 2 \n #Para bilgisi icin 3 \n #Yetenek bilgisi icin 4 \n");
        
        int seceneklerss= input.nextInt();
        
        switch(seceneklerss){
            case 1:
                   PETRA();
                
            case 2:
                    System.out.println("\nSu = " + su + "\n Aclik = " + aclik  );
                seceneklers1();
                    
            case 3:
                    System.out.println("\nPara = " + para + "$");
                seceneklers1();
                    
            case 4:
                    System.out.println("\nSilah = " + silah + "\nZirh = "+zirh+ "\nGuc = "+güc+"\nBeceri"+beceri+"\nCeviklik"+ceviklik+"\n Deneyim/Seviye = "+deneyim+"/"+seviye);
            seceneklers1();
                    
            default:
                seceneklers1();
                
        }
            public void seceneklers2(){
                gecis();
        System.out.println("\n\n\n\nSecenekler Menusu\n#Köylü Pazar için 1 \n #Durum bilgileri icin 2 \n #Para bilgisi icin 3 \n #Yetenek bilgisi icin 4 \n #Kumarhaneye gitmek icin 5 e bas \n #Hazar icin 6 ya bas = \n #Mitra icin 7 ye bas = ");
        
        int seceneklerssa= input.nextInt();
        
        switch(seceneklerssa){
            case 1:
                   pazar();
                
            case 2:
                    System.out.println("\nSu = " + su + "\n Aclik = " + aclik  );
                seceneklers2();
                    
            case 3:
                    System.out.println("\nPara = " + para + "$");
                seceneklers2();
                    
            case 4:
                    System.out.println("\nSilah = " + silah + "\nZirh = "+zirh+ "\nGuc = "+güc+"\nBeceri"+beceri+"\nCeviklik"+ceviklik+"\n Deneyim/Seviye = "+deneyim+"/"+seviye);
                seceneklers2();
            
            case 5 : 
                KUMAR();
                
                
                
            case 6:
                    HAZAR();
                break;
                
            case 7:
                    MİTRA();
                break;
            default:
                seceneklers2();
                
        }
    
    }
     
    
    public void SHİRE()
    {
        

        
        System.out.println(
                
"░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
"░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
"░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
"░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐ -Merhaba maceracı. Bu Diyarın kıralı olmaya çok fazla insan talip oldu. \n" +
"░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐  Hiç biri başaramadı. Senin gözlerindeki Isıgı gorebiliyorum. Eger bu gorevleri\n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌  tamamlayabilecegine eminsen yola koyulabilirsin. Sana bu diyar hakkında bilgiler\n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿    verecegim kulagını iyi acmali ve dinlemelisin.");
    
        
        System.out.println(" \n\n Oncelikle ben Yuno. Sana ne derler?");
        nickname = input.nextLine();
        System.out.println(" - Tanistigima memnun oldum " + nickname + ".");
        System.out.println("   Sonsuz yıl önce bu diyarın kurucu ARTHUR 5 şehir kurdu.\n"
        +                  "PETRA, HAZAR, MİTRA, AİSAN ve şu an bulundugumuz SHİRE. \n"
        +                  "Bundan sonraki krallar için bazi testler hazirladi. \n"
        +                  "Yenilmez altı canavar. ilk önce Movia ile talim yapmalı sonra \nsırasıyla GOBLİN, SENTOR, NORA, CERBERUS \nve son olarak DRAGON u yenmelisin.\nDaha onu görebilen olmadı var oldugu bile efsane. "
        );
           System.out.println("\n\n\nSimdi ne yapmak istersin "+nickname+"\n\n\n");
           System.out.println("write 1 and press enter...");
           int enter=input.nextInt();
           System.out.println(enter);
           seceneklers1();
    
    }
    public void PETRA(){
        System.out.println("                   \\  |  /         ___________\n" +
"    ____________  \\ \\_# /         |  ___      |       _________\n" +
"   |            |  \\  #/          | |   |     |      | = = = = |\n" +
"   | |   |   |  |   \\\\#           | |`v'|     |      |         |\n" +
"   |            |    \\#  //       |  --- ___  |      | |  || | |\n" +
"   | |   |   |  |     #_//        |     |   | |      |         |\n" +
"   |            |  \\\\ #_/_______  |     |   | |      | |  || | |\n" +
"   | |   |   |  |   \\\\# /_____/ \\ |      ---  |      |         |\n" +
"   |            |    \\# |+ ++|  | |  |^^^^^^| |      | |  || | |\n" +
"   |            |    \\# |+ ++|  | |  |^^^^^^| |      | |  || | |\n" +
"^^^|    (^^^^^) |^^^^^#^| H  |_ |^|  | |||| | |^^^^^^|         |\n" +
"   |    ( ||| ) |     # ^^^^^^    |  | |||| | |      | ||||||| |\n" +
"   ^^^^^^^^^^^^^________/  /_____ |  | |||| | |      | ||||||| |\n" +
"        `v'-                      ^^^^^^^^^^^^^      | ||||||| |\n" +
"         || |`.      (__)    (__)                          ( )\n" +
"                     (oo)    (oo)                       /---V\n" +
"              /-------\\/      \\/ --------\\             * |  |\n" +
"             / |     ||        ||_______| \\\n" +
"            *  ||W---||        ||      ||  *\n" +
"               ^^    ^^        ^^      ^^");
        System.out.println("hg petraya");
        seceneklers2();
    }
    
    public void HAZAR()
    {
        
        System.out.println("                                               /\\      /\\\n" +
"                                               ||______||\n" +
"                                               || ^  ^ ||\n" +
"                                               \\| |  | |/\n" +
"                                                |______|\n" +
"              __                                |  __  |\n" +
"             /  \\       ________________________|_/  \\_|__\n" +
"            / ^^ \\     /=========================/ ^^ \\===|\n" +
"           /  []  \\   /=========================/  []  \\==|\n" +
"          /________\\ /=========================/________\\=|\n" +
"       *  |        |/==========================|        |=|\n" +
"      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n" +
"     *****| []  [] |           _____           | []  [] | |\n" +
"    *******        |          /_____\\          |      * | |\n" +
"   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n" +
"  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n" +
" *************     |         @|__|__|@         |/ |*******|\n" +
"***************   ***********--=====--**********| *********\n" +
"***************___*********** |=====| **********|***********\n" +
" *************     ********* /=======\\ ******** | *********");
        System.out.println("Sehrin Icine Giriyorsun Ve Heryerde MOVİA Dedikleri Canavarlarla Istila Edilmis");
        System.out.println("Movia 1. seviye canavardır");
        System.out.println("Movia ya saldırmak icin 1 e bas / Petraya donmek icin 2 ye bas");
        int moviaonay = input.nextInt();
        switch(moviaonay){
            case 1:
                if(su > 0 && aclik > 2){
                    Movia();
                }
                else{
                    System.out.println("Yeterli su veye yemek yok.");
                    System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              HAZAR();
                    
                }
            case 2:
                gecis();
                PETRA();
        }
        
    }
    public void MİTRA(){
        gecis();
        
System.out.println("                                               /\\      /\\\n" +
"                                               ||______||\n" +
"                                               || ^  ^ ||\n" +
"                                               \\| |  | |/\n" +
"                                                |______|\n" +
"              __                                |  __  |\n" +
"             /  \\       ________________________|_/  \\_|__\n" +
"            / ^^ \\     /=========================/ ^^ \\===|\n" +
"           /  []  \\   /=========================/  []  \\==|\n" +
"          /________\\ /=========================/________\\=|\n" +
"       *  |        |/==========================|        |=|\n" +
"      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n" +
"     *****| []  [] |           _____           | []  [] | |\n" +
"    *******        |          /_____\\          |      * | |\n" +
"   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n" +
"  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n" +
" *************     |         @|__|__|@         |/ |*******|\n" +
"***************   ***********--=====--**********| *********\n" +
"***************___*********** |=====| **********|***********\n" +
" *************     ********* /=======\\ ******** | *********");
        System.out.println("Mitaraya Hos geldin \n Buradan sonrası canavarlarla doludur.");
        System.out.println("1. canavar Goblin 3. seviye \n 2. canavar Sentor 5. seviye \n 3. canavar Nora 8. seviye \n 4. canavar Cerberus 12. seviye \n 5. Son canavar Drogon 20. seviye");
        System.out.println("Gobline gitmek icin 1 e bas / Petraya geri gitmek icin 2 ye bas");
        
        int zrt = input.nextInt();
        switch(zrt){
            
        case 1:
        System.out.println("Gobline dogru gidiyorsun");
                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              gecis();
              Goblin();
        case 2: 
            PETRA();
    }}
    public void Goblin(){
    if(seviye >= 2){
     
    
        System.out.println("                             . `  `. .`  ` .\n" +
"                        . `     `.  ;  .`     ` .\n" +
"                     .`           \\   /           `.\n" +
"                   .`     . - .   ( @ )   . - .     `.\n" +
"                  /    .`      `.  '-'  .'      `.    \\\n" +
"          /\\    .`    /   .--.   `-._.-'   .--.   \\    `.    /\\\n" +
"        .`  `. /    .'  .`    `. `.   .` .`    `.  `.    \\ .`  `.\n" +
"      .`     .`    /   /        \\  \\ /  /        \\   \\    `.     `.\n" +
"     /      /    .'   /   . ''' .\\     /. ''' .   \\   `.    \\      \\\n" +
"    |    .`(    /    |   /        \\   /        \\   |    \\    )`.    |\n" +
"     \\   | /  .'      \\ |   /##\\  |   |  /##\\   | /      `.  \\ |   /\n" +
"      |  / | /         \\\\  | ###| /   \\ |### |  //         \\ | \\  |\n" +
"    .`\\  | \\/)       _.-'.  \\##/ |     | \\##/  .'-._       (\\/ |  /`.\n" +
"   /   | |  (      .`     `-.   /       \\   .-'     `.      )  | |   \\\n" +
"  |  .`\\ \\   )               `.'         `.'               (   / /`.  |\n" +
"  /\\/  | |                  .'             `.                  | |  \\/\\\n" +
"  \\   / /     /            (   .-.     .-.   )            \\     \\ \\   /\n" +
"   `./ |    .`              `.(   `._.'   ).'              `.    | \\ /\n" +
"   / \\ \\   /.`\\      )._           ) (           _.(      /`.\\   / /  \\\n" +
"  /  |  `-'/   \\    /  ''--.__    .' '.    __.--''  \\    /   \\`-'  |   \\\n" +
"  |   `---'/  .`'.  '.       ''--..___..--''       .'  .'`.  \\`---'    |\n" +
"  |    _.-/  /   |'.  '.                         .'  .'|   \\  \\-._     |\n" +
"  /\\ .`  |  /|  /   '.  ''---....._____.....---''  .'   \\  |\\ |   `.  /\n" +
" |  /     \\/ \\ |       - . _     _.---._     _ . -       \\ /|/      \\|\n" +
" \\ /          \\/            ''--._______.--''             \\|         \\\n" +
" .`        \\                                                 /        `.\n" +
"/       ;   |  `.                                       .`  |   ;       \\\n" +
"| (      )  /    \\                  ^                  /    \\  (      ) |\n" +
"|  `.      / .`   `.              .` `.              .`   `. \\      .`  |\n" +
"\\         \\         `-._         /     \\         _.-`         /         /\n" +
" \\         \\  _.-`   _  `--.__.-`       `-.__.--`  _   `-._  /         /\n" +
" |          `-._    / )   _                   _   ( \\    _.-`          |\n" +
"  \\             `-.` (   / )    `-.___.-`    ( \\   ) `.-`             /\n" +
"   \\      `.         /.-' / )               ( \\ '-.\\         .`      /\n" +
"    `-._     `.     |  .-' / )  `-.___.-`  ( \\ '-.  |     .`     _.-`\n" +
"    /   `--._        \\  .-' / )           ( \\ '-.  /        _.--`  \\\n" +
"    |   |   \\`--.._   |  .-' /  `-.___.-`  \\ '-.  |   _..--`/  |    |\n" +
"     `./     \\ .`  `-/.__.--'               '--.__.\\-`  `. /    `.  |\n" +
"      |     / |_           -._            _.-            _| \\    |\\/\n" +
"       `.  | /  ''--..__            _            __..--''  \\ |  .`\n" +
"       | \\/  |==  ==    ''--..__/\\_/ \\_/\\__..--''    ==  ==|  \\/ \\\n" +
"       \\     \\ _==   ==   ==   / o)|-|(o \\   ==   ==   ==_ /     /\n" +
"       |    /|  ''--..__==  == \\ (\\) (/) / ==  ==__..--'' ||\\    |\n" +
"        \\  / |      |  |''--..__\\ )\\_/( /__..--''   _.-'\\ \\\\ \\  /\n" +
"         \\|  /     /  /          \\/___\\/     \\\\ _.-'     \\ \\\\ |/\n" +
"             |    /  /  :                     \\\\\\    @ .-'  ||\n" +
"             \\_.-`  /          :            : || \\_.-'      \\\\\n" +
"             /___.-`                          ||       _     \\\\\n" +
"             | :                       :       \\\\     / (    ||\n" +
"             /               :                  \\\\    =:_\\   \\\\\n" +
"             |   :                              ||     )      \\\\\n" +
"             |         :                 :      \\\\          _.//\n" +
"              \\     /\\                           \\\\     _.-'\n" +
"              |    |  \\    |\\   :            |\\   ||_.-'   |\n" +
"              | : /   |   /  |      /|      /  |   /|     /\n" +
"              \\  /    \\  |   \\     | |     | `./  |  \\   /\n" +
"              | / `    |/  `. |    / \\  : /    | /    \\  |\n" +
"              \\|\\ `            \\  |   |  | `   \\|    ` \\ |\n" +
"                 | `     `.     \\ /   / /  `  `.     ` ||/\n" +
"                 \\  `        ,   \\|   \\ | `          ` /\n" +
"                  | `.      ,    |    |/            ` |   .    .\n" +
"                   \\             /     \\           ,`/     \\  /\n" +
"                    \\    . - .   |     |   . - .    /     ( O  )\n" +
"                     \\  .`-._ . /       \\ . _.-'.  /       )  (\n" +
"                     \\  : _.-': |       | :`-._ :  /      (    )\n" +
"                     |   `- -`  \\       /  `- -`   |        \\ /\n" +
"          )\\         |    ___   |       |   ___    |         |\n" +
"       )\\/ (         /_.-'___'-._\\     /_.-'___'-._\\        /\n" +
"      (  @  )       [__.-'   '-._]     [_.-'   '-.__]      |\n" +
"       \\( )/       /|\\ _ \\   /_  /     \\  _\\   /_  /   /|  /\n" +
"           \\      | /|`   | |  -_| /\\  |_-  | |  ` |  | / /\n" +
"       |\\   |  |\\/ | /.-` | |`-._\\/ |  /_.-`| |`-. \\ /  |/|\\       /|\n" +
"  /\\  /  \\   \\ \\ \\ \\ \\-_ /   \\.-'/\\ \\  \\'-./   \\ _-/ |  / / \\ /\\  | \\\n" +
" | / |  / /\\ | /  |/ /`-.\\ _ /.-'\\|  \\ /'-.\\ _ /.-`\\ / | /  / | \\ \\ |\n" +
" \\ | \\ | |  \\\\\\|  \\ .`-_ // \\ \\ .-\\  // -./ / \\\\ _-`.  \\ | |  / / | \\\n" +
" / \\ / \\ |  //|\\  .`,`__//___\\ \\__/   \\__/ /___\\\\__`,`. |/ \\ / | /  |\n" +
" \\ |/  |/  |/ |/ /_-_--_--_---,--.`) (`,--.---_--_--_-_\\\\|  \\| \\/   \\\n" +
" / \\|  /   /\\ /\\(_`'_`'_`'_) (____)   (____) (_`'_`'_`'_)/  /\\  | /  / \n");  
        
        
     System.out.println("Karsına bir Goblin geliyor. \nGoblin ile dovuste 1 su , 3 yemek kayıp edersin.\nGoblinler 3. seviye varliklardir\nEger kazanırsan 250 deneyim 400$ para verir.");
         
                       System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              int eldekiimkan;
              eldekiimkan = silah+zirh+güc+beceri+ceviklik+seviye;
              su = su - 1;
              aclik= aclik-3;
              
              if(eldekiimkan > 8){
                  
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
                  if(red <= 90){
                      
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+400;
                  deneyim=deneyim+250;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsy = input.nextInt();
              gecis();
             
              
              Sentor();
                  
                  }
                  else{
                      System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                  
                      System.out.println("Canavar kazandı"); 
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsa = input.nextInt();
              gecis();
              MİTRA();
                  }
              }
              else{
                                    
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
              
               if(red >= 90){     
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+400;
                  deneyim=deneyim+250;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaaa = input.nextInt();
              gecis();
              
              Sentor();
                  }   
               else{                    
                   System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                   System.out.println("Canavar kazandı");
                
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
              gecis();
              MİTRA();}
              }
       
    }   
    else{
        System.out.println("Seviyen Bu canavarla Savasmak icin yetersiz.");
                              System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              gecis();
              MİTRA();
        
    }
    }
    public void Sentor(){
        if(seviye >= 5){
            System.out.println("         ,     .\n" +
"        /(     )\\               A\n" +
"   .--.( `.___.' ).--.         /_\\\n" +
"   `._ `%_&%#%$_ ' _.'     /| <___> |\\\n" +
"      `|(@\\*%%/@)|'       / (  |L|  ) \\\n" +
"       |  |%%#|  |       J d8bo|=|od8b L\n" +
"        \\ \\$#%/ /        | 8888|=|8888 |\n" +
"        |\\|%%#|/|        J Y8P\"|=|\"Y8P F\n" +
"        | (.\".)%|         \\ (  |L|  ) /\n" +
"    ___.'  `-'  `.___      \\|  |L|  |/\n" +
"  .'#*#`-       -'$#*`.       / )|\n" +
" /#%^#%*_ *%^%_  #  %$%\\    .J (__)\n" +
" #&  . %%%#% ###%*.   *%\\.-'&# (__)\n" +
" %*  J %.%#_|_#$.\\J* \\ %'#%*^  (__)\n" +
" *#% J %$%%#|#$#$ J\\%   *   .--|(_)\n" +
" |%  J\\ `%%#|#%%' / `.   _.'   |L|\n" +
" |#$%||` %%%$### '|   `-'      |L|\n" +
" (#%%||` #$#$%%% '|            |L|\n" +
" | ##||  $%%.%$%  |            |L|\n" +
" |$%^||   $%#$%   |            |L|\n" +
" |&^ ||  #%#$%#%  |            |L|\n" +
" |#$*|| #$%$$#%%$ |\\           |L|\n" +
" ||||||  %%(@)$#  |\\\\          |L|\n" +
" `|||||  #$$|%#%  | L|         |L|\n" +
"      |  #$%|$%%  | ||l        |L|\n" +
"      |  ##$H$%%  | |\\\\        |L|\n" +
"      |  #%%H%##  | |\\\\|       |L|\n" +
"      |  ##% $%#  | Y|||       |L|\n" +
"      J $$#* *%#% L  |E/\n" +
"      (__ $F J$ __)  F/\n" +
"      J#%$ | |%%#%L\n" +
"      |$$%#& & %%#|\n" +
"      J##$ J % %%$F\n" +
"       %$# * * %#&\n" +
"       %#$ | |%#$%\n" +
"       *#$%| | #$*\n" +
"      /$#' ) ( `%%\\\n" +
"     /#$# /   \\ %$%\\\n" +
"    ooooO'     `Ooooo");
            
            
            System.out.println("Karsına bir Sentor geliyor. \nSentor ile dovuste 1 su , 3 yemek kayıp edersin.\nSentorlar 5. seviye varliklardir\nEger kazanırsan 300 deneyim 400$ para verir.");
         
                       System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              int eldekiimkan;
              eldekiimkan = silah+zirh+güc+beceri+ceviklik+seviye;
              su = su - 1;
              aclik= aclik-3;
              
              if(eldekiimkan > 20){
                  
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
                  if(red <= 90){
                      
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+500;
                  deneyim=deneyim+300;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsy = input.nextInt();
              gecis();
             
              
              Nora();
                  
                  }
                  else{
                      System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                  
                      System.out.println("Canavar kazandı"); 
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsa = input.nextInt();
              gecis();
              MİTRA();
                  }
              }
              else{
                                    
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
              
               if(red >= 90){     
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+400;
                  deneyim=deneyim+250;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaaa = input.nextInt();
              gecis();
              
              Nora();
                  }   
               else{                    
                   System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                   System.out.println("Canavar kazandı");
                
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
              gecis();
              MİTRA();}
     
            
        }

    }}
     public void AİSAN(){
        gecis();
        
System.out.println("                                               /\\      /\\\n" +
"                                               ||______||\n" +
"                                               || ^  ^ ||\n" +
"                                               \\| |  | |/\n" +
"                                                |______|\n" +
"              __                                |  __  |\n" +
"             /  \\       ________________________|_/  \\_|__\n" +
"            / ^^ \\     /=========================/ ^^ \\===|\n" +
"           /  []  \\   /=========================/  []  \\==|\n" +
"          /________\\ /=========================/________\\=|\n" +
"       *  |        |/==========================|        |=|\n" +
"      *** | ^^  ^^ |---------------------------| ^^  ^^ |--\n" +
"     *****| []  [] |           _____           | []  [] | |\n" +
"    *******        |          /_____\\          |      * | |\n" +
"   *********^^  ^^ |  ^^  ^^  |  |  |  ^^  ^^  |     ***| |\n" +
"  ***********]  [] |  []  []  |  |  |  []  []  | ===***** |\n" +
" *************     |         @|__|__|@         |/ |*******|\n" +
"***************   ***********--=====--**********| *********\n" +
"***************___*********** |=====| **********|***********\n" +
" *************     ********* /=======\\ ******** | *********");
        System.out.println("Aisan a Hos geldin \n Dragona Giden yol buradan gecer.");
    }
     public void Nora(){
         if(seviye >= 8){
             
             System.out.println("                              __\n" +
"                            .d$$b\n" +
"                          .' TO$;\\\n" +
"                         /  : TP._;\n" +
"                        / _.;  :Tb|\n" +
"                       /   /   ;j$j\n" +
"                   _.-\"       d$$$$\n" +
"                 .' ..       d$$$$;\n" +
"                /  /P'      d$$$$P. |\\\n" +
"               /   \"      .d$$$P' |\\^\"l\n" +
"             .'           `T$P^\"\"\"\"\"  :\n" +
"         ._.'      _.'                ;\n" +
"      `-.-\".-'-' ._.       _.-\"    .-\"\n" +
"    `.-\" _____  ._              .-\"\n" +
"   -(.g$$$$$$$b.              .'\n" +
"     \"\"^^T$$$P^)            .(:\n" +
"       _/  -\"  /.'         /:/;\n" +
"    ._.'-'`-'  \")/         /;/;\n" +
" `-.-\"..--\"\"   \" /         /  ;\n" +
".-\" ..--\"\"        -'          :\n" +
"..--\"\"--.-\"         (\\      .-(\\\n" +
"  ..--\"\"              `-\\(\\/;`\n" +
"    _.                      :\n" +
"                            ;`-\n" +
"                           :\\\n" +
"                           ;");
             
             
             
                System.out.println("Karsına bir Nora geliyor. \nNora ile dovuste 1 su , 3 yemek kayıp edersin.\nNoralar 8. seviye varliklardir\nEger kazanırsan 300 deneyim 500$ para verir.");
         
                       System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              int eldekiimkan;
              eldekiimkan = silah+zirh+güc+beceri+ceviklik+seviye;
              su = su - 1;
              aclik= aclik-3;
              
              if(eldekiimkan >= 30){
                  
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
                  if(red <= 90){
                      
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+500;
                  deneyim=deneyim+300;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsy = input.nextInt();
              gecis();
             
              
              Ceberus();
                  
                  }
                  else{
                      System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                  
                      System.out.println("Canavar kazandı"); 
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Mitra Şehrine Devam etmek icin 1 e bas...");
              
              int dnsa = input.nextInt();
              gecis();
              MİTRA();
                  }
              }
              else{
                                    
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
              
               if(red >= 90){     
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+500;
                  deneyim=deneyim+300;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaaa = input.nextInt();
              gecis();
              
              Ceberus();
                  }   
               else{                    
                   System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                   System.out.println("Canavar kazandı");
                
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
              gecis();
              MİTRA();}
     
            
        }} 
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         
         else{
             System.out.println("Seviyeniz Nora icin yetersiz. 8. seviye erisip geri gel");
             System.out.println("Devam Petra ya etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
         
              gecis();
              
              PETRA();
         }
}
   public void Ceberus(){
       if(seviye >= 12){
           
           
           
           
           
           
           System.out.println("              _,._      \n" +
"  .||,       /_ _\\\\     \n" +
" \\.`',/      |'L'| |    \n" +
" = ,. =      | -,| L    \n" +
" / || \\    ,-'\\\"/,'`.   \n" +
"   ||     ,'   `,,. `.  \n" +
"   ,|____,' , ,;' \\| |  \n" +
"  (3|\\    _/|/'   _| |  \n" +
"   ||/,-''  | >-'' _,\\\\ \n" +
"   ||'      ==\\ ,-'  ,' \n" +
"   ||       |  V \\ ,|   \n" +
"   ||       |    |` |   \n" +
"   ||       |    |   \\  \n" +
"   ||       |    \\    \\ \n" +
"   ||       |     |    \\\n" +
"   ||       |      \\_,-'\n" +
"   ||       |___,,--\")_\\\n" +
"   ||         |_|   ccc/\n" +
"   ||        ccc/       \n" +
"   ||                ");
           
           System.out.println("Karsına Usta Buyucu Ceberus geliyor. \nCeberus ile dovuste 1 su , 3 yemek kayıp edersin.\nCeberuslar 12. seviye varliklardir\nEger kazanırsan 100 deneyim 0$ para verir. \n Cunku kendisini kutsamıstır ve laneti sayesinde olurken varlıklarını yanında goturur.");
         
                       System.out.println("Devam etmek icin 1 e bas...");
              
              int dns = input.nextInt();
              int eldekiimkan;
              eldekiimkan = silah+zirh+güc+beceri+ceviklik+seviye;
              su = su - 1;
              aclik= aclik-3;
              
              if(eldekiimkan > 40){
                  
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
                  if(red < 70){
                      
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+0;
                  deneyim=deneyim+100;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsy = input.nextInt();
              gecis();
             
              
              Yunoc1();
                  
                  }
                  else{
                      System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                  
                      System.out.println("Canavar kazandı"); 
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Mitra Şehrine Devam etmek icin 1 e bas...");
              
              int dnsa = input.nextInt();
              gecis();
              MİTRA();
                  }
              }
              else{
                                    
              int red;
                  Random rd = new Random();
                  red = 0+rd.nextInt(100);
              
               if(red > 70){     
                  
                  System.out.println("Canavarı ortadan ikiye ayırdın");
                  para=para+0;
                  deneyim=deneyim+100;
                  if(deneyim >= 1000){
                      seviye++;
                      deneyim=deneyim-1000;

                  }
                   System.out.println("deneyim/seviye = "+deneyim+"/"+seviye+"su = "+su+" aclik = "+aclik+"\npara = "+para);
                                System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaaa = input.nextInt();
              gecis();
              
              Yunoc1();
                  }   
               else{                    
                   System.out.println("	\n" +
"                              .___.\n" +
"          /)               ,-^     ^-. \n" +
"         //               /           \\\n" +
".-------| |--------------/  __     __  \\-------------------.__\n" +
"|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\n" +
"`-------| |--------------| \\__/   \\__/ |-------------------'^^\n" +
"         \\\\               \\    /|\\    /\n" +
"          \\)               \\   \\_/   /\n" +
"                            |       |\n" +
"                            |+H+H+H+|\n" +
"                            \\       ");    
                   System.out.println("Canavar kazandı");
                
                      System.out.println("su = "+su+"aclik = "+aclik);
                                                      System.out.println("Devam etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
              gecis();
              MİTRA();}
     
            
        }}
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       
           
       
       else{
           System.out.println("Bu canavarla savasmak icin Seviyeniz 12 ve ustu olmalıdır. ");
                    System.out.println("Devam Petra Sehrine etmek icin 1 e bas...");
              
              int dnsaa = input.nextInt();
         
              gecis();
              
              PETRA();
       
       }
   }
   
   public void Yunoc1(){
       
       System.out.println(
                
"░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
"░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
"░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
"░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐ \n" +
"░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐ \n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌ \n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿   ");
       
       System.out.println("- Merhaba "+nickname+" \n       Sana ilk baktigimda buraya kadar gelecegini gormustum. \n Eger kazanıp Diyarımızı canavarlardan kurtarırsan yeni Arthur ?n sen olursun ve diyara sahip olursun ");
       
       System.out.println("-Ama sana bu uyarıda bulunmalıyım Dragon diyer canavarlara benzemez efsanelere gore onu yenmek imkansız savasmaya eminmisin.");
       
                           System.out.println("Drogon a Gitmek icin 1 e bas.");
              
              int dnsaa = input.nextInt();
              
              Drogon();
       
   }
   
   
   
   
   
   
   
  public void Drogon(){
      
      
  if(seviye > 20){
      System.out.println("))))))))`\"###mnn$$$$\"\"\"%%%%%%%`\"\"$$$$$$$mmn..m###(((((((((((((((((((((((((((((\n" +
"))))))))))\"$$$\"\"'%%%%%%%%%%%%%%%%%%%%%%`\"\"$$$$$n###.(((((((((((((((((((((((((.\n" +
")))))))))))$##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`\"$$$n#.(((((((((((((((((((.m###\n" +
")))))))))))`##n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`\"$$$n.((((((((((((((.m####\"'\n" +
"))))))))))))###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`\"$$n.(((((((((.m####\"'(((\n" +
"))))))))))))\"##m%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`\"$$n((((((.m###\"'((((((\n" +
"mmmmn..))))))###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`$$n((.m###\"'((((((((\n" +
"###########n.###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`$$n(###\"'((((((((((\n" +
"))))`\"\"\"########%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\"$$.#\"'((((((((((((\n" +
")))))))))))`m##\"%%%%%%%m$$%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%`$$\"((((((((((((((\n" +
"))))))))))))m##%%%%%%%m$$'%%%%%%%%%%%%%%%%%%%%%$n.%%%%%%%%%%$$'(((((((((((((((\n" +
"))))))))))))##\"%%%%%%m$$\"%%%%%%%%%%%%%%%%.n%%%%\"$$n.%%%%%$$.$\"((((((((((((((((\n" +
")))))))))))%##%%%%%%%$$n%%%%%%%%%%%%%%%%m$$n%%%%`\"$$n.%%%`$$n.((((((((((((((((\n" +
"))))))))))m##\"%%%%%%%$$$%%%%%%%%%%%%%%%m$$$$n.%%%%`\"$$n.%%`\"$$n(((((((((((((((\n" +
"))))))).m##\"%%%%%%%%%$$$%%%%%%%%%%%%%%%$$\"'\"$$n.%%%%`\"$$.%%%`$$n.(((((((((((((\n" +
"))))).m##\"%%%%%%%%%%%\"$$n%%%%%%%%%%%%%%$$n `\"$$n%%%%%`$$.%%%`\"$$$((((((((((((\n" +
")))))m##\"'%%%%%%%%%%%%$$$%%%%%%%%%%%%%%`$$n `\"$$n%%%%`$$%%%%%`$\"##n(((((((((\n" +
"))).m##\"%%%%%%%%%%%%%m\"$$n%%%%%%%%%%%%%%`\"$$n \"$$.%%%%$$%%%%m$\" \"##n((((((((\n" +
").m##\"'%%%%%%%%%%%%%m$$\"$$%%%%%%%%%%%%%%%%\"$$n. \"$$%%%%`$n%.m$\" \"##n(((((((\n" +
"m##\"'%%%%%%%%%%%%%%%$$':$$n%%%%%%%%%%%%%%%%`\"$$n. $$%%%%%\"$n$$\" \"##n((((((\n" +
"##\"%%%%%%%%%%%%%%%%m$$::\"$$n%%%%%%%%%%%%%%%%%`\"$$$$\"%%%%%%$$.$ \"##((((((\n" +
"#\"%%%%%%%%%%%%%%%%%$$':::\"$$n.%%%%%%%%%%%%%%%%%%`$'%%%%%%%$$n\" ##n((((m\n" +
"%%%%%%%%%%%%%%%%%%%$$::::::\"$$m.%%%%%%%%%%%%%%%%%%%%%%%%%%`\"$$. `##n(.m#\n" +
"%%%%%%%%%%%%%%%%%%%$$::::::::`\"$$n.%%%%%%%%%%%%%%%%%%%%%%%%%`\"$n. `##m##\"\n" +
"%%%%%%%%%%%%%%%%%%%$$n:::::::::$`$$n.%%%%%%%%%%%%%%%%%%%%%%%%%\"$$. m##\"'\n" +
"%%%%%%%%%%%%%%%%%%%\"$$:::::::::`$$\"$$n%%%%%%%%%%%%%%%%%%%%%%%%%\"$n nW'\"\n" +
"%%%%%%%%%%%%%%%%%%%%$$::::::::::$$ `$$n%%%%%%%%%%%%%%%%%%%%%%%%\"$$. ''\n" +
"%%%%%%%%%%%%%%%%%%%%$$n:::::::::$$n \"$$%%%%%%%%%%%%%%%%%%%%%%%%`$$n.\n" +
"%%%%%%%%%%%%%%%%%%%%\"$$:::::::::\"$$ $$n%%%%%%%%%%%%%%%%%%%%%%%\"$$n\n" +
"%%%%%%%%%%%%%%%%%%%%%$$::::::::::$$ `$$n%%%%%%%%%%%%%%%%%%%%%%\"$$\n" +
"%%%%%%%%%%%%%%%%%%%%%$$::::::::::$$ \"$$n.m$$$n%%%%%%%%%%%%%%%%$$n\n" +
"%%%%%%%%%%%%%%%%%%%%%$$n:::::::::$$n .m$$$\"\"\"$n%%%%%%%%%%%%%%%`$$n\n" +
"%%%%%%%%%%%%%%%%%%%%%`$$:::::::::\"$$ $$$\"'%%%`\"%%%%%%%%%%%%%%%%n$\"\n" +
"%%%%%%%%%%%%%%%%%%%%%%$$::::::::::$$ $$$n%%%%%%%%%%%%%%%%%%%%%.m$$n.\n" +
"%%%%%%%%%%%%%%%%%%%%%%$$::::::::::$$n `$$$.%%%%%%%%%%%%%%%%%%%%\"$$n\"$\n" +
"%%%%%%%%%%%%%%%%%%%%%%$$n:::::::::\"$$ `\"$$.%%%%%%$$n$m.%%%%%%%%\"$$n'$.\n" +
"%%%%%%%%%%%%%%%%%%%%%%`$$::::::::::$$n `$$n.%%%%\"$$\"\"$n%%%%%%%%`\"$n`$n.\n" +
"%%%%%%%%%%%%%%%%%%%%%%%$$::::::::::`$$ `$$n.%%%`$nm$\"%%%%%%%%%%\"$$`$\n" +
"%%%%%%%%%%%%%%%%%%%%%%%$$:::::::::::$$n `\"$$n%%`\"$$n%%%%%%%%%%%$$n$'\n" +
"%%%%%%%%%%%%%%%%%%%%%%%$$n::::::::::`$$ `\"$mn.`\"$n.%%%%%%%%%\"$$'\n" +
"%%%%%%%%%%%%%%%%%%%%%%%\"$$:::::::::::$$n `\"$$n.`\"$$.%%%%%%%.$$\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%$$:::::::::::`$$ `$$n.`$$.%%%%%.$$\"\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%$$n:::::::::::$$n `\"$$n`$$.%%%%.$$\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%\"$$:::::::::::`$$ `\"$n.\"$.%%m$$\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%%$$::::::::::::$$n `\"$n$$.$$$'\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%%$$::::::::::::`$$ \"$$$$$\"'\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%%$$n::::::::::::$$n .$$W\"'\n" +
"%%%%%%%%%%%%%%%%%%%%%%%%%`$$::::::::::::`$$ .$W");
      int d_can = 2;
      int s_can = 2;
      System.out.println("\n\n\n DROGON tum ihtisamiyla karsinda ve seni fark ediyor.");
      
      System.out.println("Drogonla savasta su ya yemege yada herhangi bir ihtiyaca mecbur degilsin cunku korkudan hissedemiyrsun \n ");
                                      System.out.println("Devam edip Drogon a saldırmak icin 1 e bas");
                                      
                                      
              
              int dnsaa = input.nextInt();
      
              gecis();
              
              System.out.println("Drogon sana dogru yaklasior. \n ilk saldırıyı gerceklestiriyorsun");
              for (int i = 0; i < 40; i++) {
          
      
         
              System.out.println("Saga dogru vurmak icin 1 e bas / Sola dogru icin 2 ye bas");
                             Random svr = new Random();
                  int savur = 0+svr.nextInt(1);                 
               int vuruskarar1 = input.nextInt();
              switch(vuruskarar1){
                  case 1:
                      if(vuruskarar1 == savur){
                          System.out.println("Evet canavar saga kacarken vurdun ve 1 canı gitti");
                          d_can--;
                                            System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
              break;
                      
                      }
                      else{
                                  System.out.println("Canavar sola kactı ve sıyırdın");
                      
                                        System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
              break;
                      }
                         
                      
                  case 2:    

                                    if(vuruskarar1 == savur){
                          System.out.println("Evet canavar sola kacarken vurdun ve 1 canı gitti");
                          d_can--;
                                        System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
              break;
                      }
                      else{
                                  System.out.println("Canavar saga kactı ve sıyırdın");
                                                    System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
              break;
                                  }
                         
                    default:
                        PETRA();
              
              
      
  }
              if(d_can == 0){
                  System.out.println("Drogon inliyor ve ölüyor");
                  System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
              Yunoc2();
                  
                            }
              
                  System.out.println("                                       \\/\n" +
"                                       ^`'.\n" +
"                                       ^   `'.\n" +
"             (                         ^      `'.\n" +
"           )  )        \\/              ^         `'.\n" +
"         (   ) @       /^              ^            `'.\n" +
"       )  )) @@  )    /  ^             ^               `'.\n" +
"      ( ( ) )@@      /    ^            ^                  `'.\n" +
"    ))  ( @@ @ )    /      ^           ^                     `'.\n" +
"   ( ( @@@@@(@     /       |\\_/|,      ^                        `'.\n" +
"  )  )@@@(@@@     /      _/~/~/~|C     ^                           `'.\n" +
"((@@@(@@@@@(     /     _(@)~(@)~/\\C    ^                              `'.\n" +
"  ))@@@(@@)@@   /     /~/~/~/~/`\\~`C   ^             __.__               `'.\n" +
"   )@@@@(@@)@@@(     (o~/~o)^,) \\~ \\C  ^          .' -_'-'\"...             `.\n" +
"    ( (@@@)@@@(@@@@@@_~^~^~,-/\\~ \\~ \\C/^        /`-~^,-~-`_~-^`;_           `.\n" +
"      @ )@@@(@@@@@@@   \\^^^/  (`^\\.~^ C^.,  /~^~^~^/_^-_`~-`~-~^\\- /`'-./`'-. ;\n" +
"       (@ (@@@@(@@      `''  (( ~  .` .,~^~^-`-^~`/'^`-~ _`~-`_^-~\\         ^^\n" +
"           @jgs@             (((` ~ .-~-\\ ~`-_~`-/_-`~ `- ~-_- `~`;\n" +
"          /                 /~((((` . ~-~\\` `  ~ |:`-_-~_~`  ~ _`-`;\n" +
"         /                 /~-((((((`.\\-~-\\ ~`-`~^\\- ^_-~ ~` -_~-_`~`;\n" +
"        /                 /-~-/(((((((`\\~-~\\~`^-`~`\\ -~`~\\-^ -_~-_`~-`;\n" +
"       /                 /~-~/  `((((((|-~-|((`.-~.`Y`_,~`\\ `,- ~-_`~-`;\n" +
"      /              ___/-~-/     `\"\"\"\"|~-~|\"''    /~-^ .'    `:~`-_`~-~`;\n" +
"     /         _____/  /~-~/           |-~-|      /-~-~.`      `:~^`-_`^-:\n" +
"    /    _____/        ((((            ((((      (((((`           `:~^-_~-`;\n" +
"    \\___/                                                          `:_^-~`;\n" +
"                                                                    `:~-^`:\n" +
"                                                                  ,`~-~`,`\n" +
"                                                                 ,\"`~.,'\n" +
"                                                               ,\"-`,\"`\n" +
"                                                             ,\"_`,\"\n" +
"                                                            ,\",\"`\n" +
"                                                         ;~-~_~~;\n" +
"                                                          '. ~.");
              System.out.println("Canavar saldırıya gecti");
              
                System.out.println("Saga dogru kacmak icin 1 e bas / Sola dogru icin 2 ye bas");
                             Random svrr = new Random();
                  int savurr = 0+svrr.nextInt(1);                 
               int vkaciskarar1 = input.nextInt();
              switch(vkaciskarar1){
                  case 1:
                      if(vkaciskarar1 == savur){
                          System.out.println("Evet saga dogru katın vesıyrıldın");
                          
                                        System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
                      break;
                      }
                      else{
                                  System.out.println("canavar sana vurdu");
                          s_can--;        
                                        System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
                      break;
                      }
                         
                      
                  case 2:    

                                    if(vkaciskarar1 == savur){
                          System.out.println("Evet sola dogru kactın ve kurtuldun");
                                            System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
                      break;
                      }
                      else{
                                  System.out.println("canavar sana vurdu");
                          s_can--;
                                                     System.out.println(" Devam Etmek icin 1 e bas");
              
              int dnsaau = input.nextInt();
                            break;
                                    }
                                    
                         
                     default:
                         PETRA();
              
              
      
  }
              if(s_can == 0){
                  System.out.println("Canın bitiyor ve oluyorsun");
                                                 System.out.println(" Petraya Gitmek icin 1 e bas");
              
              int dnsaaya = input.nextInt();  
              }
              
  
  }
  
  }
      
      else{
      System.out.println("Seviyen Drogon icin yetersiz... \n \n 20. seviye olup gelmelisin ");
                                 System.out.println(" Petraya Gitmek icin 1 e bas");
              
              int dnsaa = input.nextInt();
      
  }
      
      
      
      
      
      
      
  
  }
  public void Yunoc2(){
    System.out.println(
                
"░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
"░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
"░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
"░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐ \n" +
"░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐ \n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌ \n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿   ");
    
    
      System.out.println("-Tebrikler ,  inanılmaz , Basardın yendin Drogonu");
      System.out.println("Ne demek istersin \n (1)Etabi yenecektim. \n (2)Tesekkürler sayende.");
      
      int cvp1 = input.nextInt();
      
      switch(cvp1) {
          case 1:
              System.out.println("+Etabi yenecektim.");
              break;
          case 2:
              System.out.println("+Tesekkürler sayende.");
      
              break;
      default:
          break;
      }
      
                                                 System.out.println(" Devam etmek icin 1 e bas");
              
              int dnsaaya = input.nextInt();  
      
              System.out.println("-Sana ne kadar tesekkur etsek azdır.");
              
              System.out.println("Ne demek istersin \n (1)mutavazi olmak \n (2)Cool olmak");
              
              int cvp2 = input.nextInt();
      
      switch(cvp2) {
          case 1:
              System.out.println("+Ne demekliyim bilemedim");
              break;
          case 2:
              System.out.println("+Rica ederim canim");
              break;
     default:
         break;
      }
      System.out.println("Sana hediye olarak bir kahve vermek istiyorum");
      
                   System.out.println("devam etmek icin 1 e bas");
              
              int dll = input.nextInt();
      System.out.println("       }   }   {\n" +
"      {   {  }  }\n" +
"       }   }{  {\n" +
"      {  }{  }  }\n" +
"     ( }{ }{  { )\n" +
"    .-{   }   }-.\n" +
"   ( ( } { } { } )\n" +
"   |`-.._____..-'|\n" +
"   |             ;--.\n" +
"   |   (__)     (__  \\\n" +
"   |   (oo)      | )  )\n" +
"   |    \\/       |/  /\n" +
"   |             /  /   \n" +
"   |            (  /\n" +
"   \\             y'\n" +
"    `-.._____..-");
      
      System.out.println("Ne yapmak istersin \n (1)Kafama dikerim \n (2)Tokum derim icmem");
int icmekyadaicmemek = input.nextInt();
  switch(icmekyadaicmemek){
      case 1:
          icdim();
      case 2:
          icmedim();
          default:
              
   Yunoc2();
  }
  }
  public void icdim(){
      
      for (int j = 0; j < 45; j++) {
          
      
      System.out.println("---*********----///////++++++64t3337576o87621%%%%%%%%%++++^^^^^^^((((///////////&&&&&&&&&>>>>>£#$½{{[½$#$½{[][{½$#$½{[]}][{½$#£}][{");
      }
  
                System.out.println(
                
"░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
"░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
"░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
"░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐ \n" +
"░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐ \n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌ \n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿   ");
      
      System.out.println("ne oldu iyimisin");
       System.out.println("Devam etmek icin 1 e bas ");
         int basgec2 = input.nextInt();    
      for (int j = 0; j < 45; j++) {
          
      
      System.out.println("---*********----///////++++++64t3337576o87621%%%%%%%%%++++^^^^^^^((((///////////&&&&&&&&&>>>>>£#$½{{[½$#$½{[][{½$#$½{[]}][{½$#£}][{");
      }
          System.out.println(
                
"░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
"░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
"░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
"░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐ \n" +
"░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐ \n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌ \n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿   ");
      
      System.out.println("Zehirledim seni OLUCEKSİN");
       System.out.println("Devam etmek icin 1 e bas ");
         int basgec1 = input.nextInt();    
      
         for (int j = 0; j < 45; j++) {
          
      
      System.out.println("---*********----///////++++++64t3337576o87621%%%%%%%%%++++^^^^^^^((((///////////&&&&&&&&&>>>>>£#$½{{[½$#$½{[][{½$#$½{[]}][{½$#£}][{");
      }
         
         System.out.println(""+
         
         "░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░    ▀▄\n" +
"░░░░░▌           ░░░░░░▀                ░▀▀▄\n" +
"░░░░▌░░          ░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░           ░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒              ░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░        ▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐                 ▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░                ░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░     ░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀         ░░░░░░░       ▀▒▌░▐\n" +
"░░░░▀▐▀▄▒          ░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀      ░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒            ▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░              ▀▐▒░░▐ \n" +
"░░░░░░▌▌░▌▐░▌▒               ░▌▒░▐ \n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌ \n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿   ");
      System.out.println("Bu diyara kimse sahip olamaz"+nickname);
      System.out.println("Senin gibi biri gelip gorevleri tamamlamasını 100 yıldır bekliyorum");
      System.out.println("O gelen kisi Drogonu oldurup bana krallıgı vermesi icin");
      
      
       System.out.println("Devam etmek icin 1 e bas ");
         int basgec3 = input.nextInt();  
  
      die();
  
  }
  public void icmedim(){
          System.out.println(
                
"░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
"░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
"░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
"░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
"░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
"░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
"░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
"░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
"░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
"░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
"░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
"▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
"░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
"░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
"░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
"░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
"░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
"░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐ \n" +
"░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐ \n" +
"░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌ \n" +
"░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒﻿   ");
          System.out.println("-Neden icmiyorsun Bence icmelisin yorgun dustun.");
         System.out.println("Al ic");
         System.out.println("Ne yapacaksın \n (1)İC \n (2)İCMEM");
         int icmekyadaicmemek = input.nextInt();
         switch(icmekyadaicmemek){
             case 1:
                 icdim();
                 case 2:
                     break;
                     default:
                         icdim();
         }
         System.out.println("-İcmiyorsun demek he");
                  System.out.println("Devam etmek icin 1 e bas ");
         int basgec = input.nextInt();
         System.out.println("                                  _____________________________\n" +
"                           _.-''``------------------------|`. |``''--..__\n" +
"                      _.-'` ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' | : |          ``'';';--..__\n" +
"                 _.-'`                                    | : |         '   :';       ```';\n" +
"            _.-'`                           ________/\\_/\\_|.'_|_       '   :';           /\n" +
"       _.-'`                         _.-''``                    ``''--:.__;';           _|\n" +
"     .'`                        _.-'`                                     `'`''-._     /\n" +
"   .`                       _.-'                                                  `'-./\n" +
" .'                    _.-'`\n" +
"/               __..-'`\n" +
"``'''----'''````");
         System.out.println("Bicak darbesi yedin öluyorsun");
                          System.out.println("Devam etmek icin 1 e bas ");
         int basgec2 = input.nextInt();
         die();
  }
  
          
     public  void  die(){
         System.out.println("                  _  /)\n" +
"                 mo / )\n" +
"                 |/)\\)\n" +
"                  /\\_\n" +
"                  \\__|=\n" +
"                 (    )\n" +
"                 __)(__\n" +
"           _____/      \\\\_____\n" +
"          |  _     ___   _   ||\n" +
"          | | \\     |   | \\  ||\n" +
"          | |  |    |   |  | ||\n" +
"          | |_/     |   |_/  ||\n" +
"          | | \\     |   |    ||\n" +
"          | |  \\    |   |    ||\n" +
"          | |   \\. _|_. | .  ||\n" +
"          |                  ||\n" +
"          |      "+nickname+"            ||\n" +
"          |                  ||\n" +
"  *       | *   **    * **   |**      **\n" +
"   \\))ejm97/.,(//,,..,,\\||(,,.,\\\\,.((/");   
     
         System.out.println("Bu diyar sana nasip degilmis"+nickname);
         System.out.println("Baska zaman baska paralel evrenlerde umarım sen kral olabilirsin ....");
         
         
     
     }
     
     public String nickname = "";
    public static void main(String[] args) {
        
        
        Arthur a = new Arthur();
        a.SHİRE();
        
    }
    
}
