import java.util.Calendar;

public class MethodPractice {

    public static boolean isLeapYear(int year){

        if (year % 4 != 0) { // 4で割り切れない場合はうるう年ではない
            return false;
        } else if (year % 100 != 0) { // 4で割り切れるが、100で割り切れない場合はうるう年
            return true;
        } else if (year % 400 == 0) {  // 4で割り切れ、100でも割り切れるが、400で割り切れる場合はうるう年
            return true;
        } else { // 4で割り切れ、100でも割り切れるが、400で割り切れない場合はうるう年ではない
            return false;
        }

    }



    public static int getSum(int num) {
        if(num <= 0){
            return  0;
        }else{
            return num + getSum(num-1);
        }
    }




        public static boolean isPrime(int num) {
        if(num <= 1 || (num>2 && num % 2 ==0 )) {
            return false;
        }else{
                for(var i=2; i<num;i++ ){
                    if(num %i ==0) {
                        continue;

                    }else if(num %i !=0){
                        return false;
                    }
                }
        }
        return true;
        }



    public static int factorial(int num) {
        var answer = 1;
        for ( var i=2; i<=num; i++){
            answer *= i;
        }
        return answer;
        }

    public static int findMax(int[] num){
        var max = num[0];
        for(var i=1; i<num.length;i++){
            if( max< num[i]){
                    max=num[i];
            }
        }
        return max;

    }



    public static boolean isPalindrome(String kaibun){
        char[] c = kaibun.toCharArray();
        for(var i=0; i<c.length/2; i++) {
            if(c[i]==(c[c.length - i-1])){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }




    public static int getAge (int year, int month, int day){
        Calendar cl = Calendar.getInstance();
        int age_support = cl.get(Calendar.YEAR)-year;
        var now_month = cl.get(Calendar.MONTH)+1;
        var now_day = cl.get(Calendar.DATE);

        if(month > now_month){
            age_support -= 1;
            return age_support;
        }else if(month == now_month){
            if( day < now_day){
                return age_support;
            }else{
                age_support -= 1;
                return age_support;
            }
        }else{
            return age_support;
        }

    }





    public static void sortArray(int[] nums) {
        for (var i = 0; i < nums.length; i++) {
            for (var j = nums.length-1; j > i; j--) {
                if (nums[j] < nums[j-1]) {
                    var a = 0;
                    a = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = a;
                }
            }
        }
        return;
    }




    public static int getIndex(int target,int[] nums,int last,int first) {

        var compare_target = (first + last) / 2;
        for (var i = 0; i < nums.length; ) {

            if (target < nums[compare_target]) {
                return getIndex(target, nums, compare_target - 1, first);

            } else if (target > nums[compare_target]) {
                return getIndex(target, nums, last, compare_target + 1);


            } else if (target == nums[compare_target]) {
                return compare_target;
            }


        }
        return compare_target;
    }














}


