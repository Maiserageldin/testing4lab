public class coffee{
    public float amount;
    public int coffeeAmount;
        public boolean power = false;
        public boolean on = false;
        public boolean busy = false;
        private final float Coffeeprice = 6;
    public String UseCoffee(int coffeeAmount) {
        if (power) {
            int j = 0;
            if (amount >= Coffeeprice) {
                while (amount >= Coffeeprice && coffeeAmount > 0) {
                    amount -= Coffeeprice;
                    busy = true;
                    coffeeAmount--;
                    j++;
                }
            }
            else{
                return "Not enough money";
            }
            busy = false;
            return j + "Here you go the coffee";
        } else {
            return "turn it on,please";
        }
    }

        public String UseCoffeeMachine() {
            if (!power) {
                on = true;
                power = true;
                return "Power on" + "Lights on";
            } else {
                return "Error";
            }
        }
        public String StopTheMachine() {
            if (power) {
                on = false;
                power = false;
                return "Lights off" + "Power off";
            } else {
                return "Error!";
            }

        }
    public String addCoins(float money) {
        if (power) {
            this.amount = money;
            return "Thank you for purchasing coffee";
        } else {
            return "turn it on,please";
        }
    }
    }
