public class Clock1 {
    public String s1 = "NORMAL";
    public String s2 = "TIME";
    public String s3 = "min";
    public String s4 = "ALARM";
    int a =0, b =0, c =1, d =1, e =2000;
    String enter(char x){
        switch(s1) {
            case "ALARM":{
                if(x == 'd'){
                    s1 = "NORMAL";
                    return s1;
                }
                else if (x == 'a')
                    if(s4 == "ALARM"){
                        s4 = "CHIME";
                        return s4;
                    }
                    else{
                        s1 = "ALARM";
                        return s4;
                    }}
            return s1;
            case "UPDATE": {
                if (x == 'd')
                    s1 = "NORMAL";
                else if (x == 'c')
                    s1 = "UPDATE";
                else {
                    switch (s3) {
                        case "min": {
                            if (x == 'a')
                                s3 = "hour";
                            if (x == 'b'){
                                this.a = (a +1)%60;
                                return this.ShowTime();
                            }
                            break;
                        }
                        case "hour": {
                            if (x == 'a')
                                s3 = "day";
                            if (x == 'b'){
                                this.b = (b +1)%12 +1;
                                return this.ShowTime();
                            }break;
                        }
                        case "day": {
                            if (x == 'a')
                                s3 = "month";
                            if (x == 'b'){
                                this.c = (c +1)%30+1;
                                return this.ShowTime();
                            }break;
                        }
                        case "month": {
                            if (x == 'a')
                                s3 = "year";
                            if (x == 'b'){
                                this.d = (d +1)%12+1;
                                return this.ShowTime();
                            }break;
                        }
                        case "year": {
                            if (x == 'a')
                                s1 = "NORMAL";
                            if (x == 'b'){
                                this.e = (e +1);
                                return this.ShowTime();
                            }
                        }break;
                    }
                }
                return s1;
            }

            case "NORMAL": {
                if (x == 'c')
                    this.s1 = "UPDATE";
                if (x == 'b')
                    this.s1 = "ALARM";
                if (x == 'a')
                    if (s2 == "TIME") {
                        s2 = "DATE";
                        return this.ShowDate();
                    }
                    else{
                        s2 = "TIME";
                        return this.ShowTime();
                    }
                return s1;
            }
        }
        return s1;
    }
    String ShowDate(){
        System.out.println(e +"-"+ d +"-"+ c);
        return (e +"-"+ d +"-"+ c);
    }
    String ShowTime(){
        System.out.println( b +":"+ a);
        return ( b +":"+ a);
    }
    public static void main(String args[]){
    }}