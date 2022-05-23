public class ATM {
    public int countBanknotes(int sum) {
        int result = 0;
        while (sum != 0) {
            if (sum >= 500) {
                sum -= 500;
                result++;
            }else if (sum >=400){
                sum -= 400;
                result = result + 2;
            }else if (sum >=300){
                sum -= 300;
                result = result + 2;
            }else if (sum >=200){
                sum -= 200;
                result++;
            }else if (sum >=100){
                sum -= 100;
                result++;
            }else if (sum >=50){
                sum -= 50;
                result++;
            }else if (sum >=40){
                sum -= 40;
                result = result + 2;
            }else if (sum >=20){
                sum -= 20;
                result++;
            }else if (sum >=10){
                sum -= 10;
                result++;
            }else if (sum >=5){
                sum -= 5;
                result++;
            }else if (sum >=4){
                sum -= 4;
                result = result + 2;
            }else if (sum >=3){
                sum -= 3;
                result = result + 2;
            }else if (sum >=2){
                sum -= 2;
                result++;
            }else if (sum >=1){
                sum -= 2;
                result++;
                break;
            }
        }
        return result;
    }
}
