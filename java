// untuk bermain dengan warna di console

        // Regular Colors
        String Black = "\033[0;30m";
        String Red = "\033[0;31m";
        String Green = "\033[0;32m";
        String Yellow = "\033[0;33m";
        String Blue = "\033[0;34m";
        String Purple = "\033[0;35m";
        String Cyan = "\033[0;36m";
        String White = "\033[0;37m";

        // Bold
        String BBlack = "\033[1;30m";
        String BRed = "\033[1;31m";
        String BGreen = "\033[1;32m";
        String BYellow = "\033[1;33m";
        String BBlue = "\033[1;34m";
        String BPurple = "\033[1;35m";
        String BCyan = "\033[1;36m";
        String BWhite = "\033[1;37m";

        // Underline
        String UBlack = "\033[4;30m";
        String URed = "\033[4;31m";
        String UGreen = "\033[4;32m";
        String UYellow = "\033[4;33m";
        String UBlue = "\033[4;34m";
        String UPurple = "\033[4;35m";
        String UCyan = "\033[4;36m";
        String UWhite = "\033[4;37m";

        // Background
        String On_Black = "\033[40m";
        String On_Red = "\033[41m";
        String On_Green = "\033[42m"; 
        String On_Yellow = "\033[43m";
        String On_Blue = "\033[44m"; 
        String On_Purple = "\033[45m"; 
        String On_Cyan = "\033[46m"; 
        String On_White = "\033[47m"; 

        // High Intensty
        String IBlack = "\033[0;90m"; 
        String IRed = "\033[0;91m"; 
        String IGreen = "\033[0;92m"; 
        String IYellow = "\033[0;93m"; 
        String IBlue = "\033[0;94m"; 
        String IPurple = "\033[0;95m"; 
        String ICyan = "\033[0;96m"; 
        String IWhite = "\033[0;97m"; 

        // Bold High Intensty
        String BIBlack = "\033[1;90m"; 
        String BIRed = "\033[1;91m"; 
        String BIGreen = "\033[1;92m"; 
        String BIYellow = "\033[1;93m"; 
        String BIBlue = "\033[1;94m"; 
        String BIPurple = "\033[1;95m"; 
        String BICyan = "\033[1;96m"; 
        String BIWhite = "\033[1;97m"; 

        // High Intensty backgrounds
        String On_IBlack = "\033[0;100m"; 
        String On_IRed = "\033[0;101m"; 
        String On_IGreen = "\033[0;102m"; 
        String On_IYellow = "\033[0;103m"; 
        String On_IBlue = "\033[0;104m"; 
        String On_IPurple = "\033[10;95m"; 
        String On_ICyan = "\033[0;106m"; 
        String On_IWhite = "\033[0;107m"; 
        
        
        contoh penggunaan
        
        class Coba
        {
        //definisi diatas ditaruh sini
          public static void main(String[] args) {
            String nama= "Ryan fabella";
            String kota = "Surabaya";
            System.out.println("Hallo nama saya "+nama+", saya tinggal di kota "+kota);
            System.out.println(On_ICyan+"Hallo nama saya "+Black+BRed+nama+On_IYellow+",saya tinggal di kota "+Black+BBlue+kota+Black);
          }
        }
