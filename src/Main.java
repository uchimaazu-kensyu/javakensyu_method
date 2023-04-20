import java.util.Scanner;


public class Main{
    // メインメソッド
    public static void main(String[] args) {



//        メソッド-うるう年判定
        System.out.println("初めに、入力された年がうるう年か判定します。数字を入力してください。");
        var sc = new Scanner(System.in);
        var input = sc.nextInt();
        var leap_year = MethodPractice.isLeapYear(input);
        if(leap_year==true){
            System.out.println(input+"年はうるう年です。");
        }else {
            System.out.println(input+"年はうるう年ではありません。");
        }





        //メソッド-合計値
        System.out.println("次に、「1から入力された数字まで」の合計値を出力します。数字を入力してください。");
        input = sc.nextInt();
        System.out.println(MethodPractice.getSum(input));





//        メソッド-素数判定
        System.out.println("次に、入力された数字が素数かどうかを判定します。数字を入力してください。");
        input = sc.nextInt();
        var result = MethodPractice.isPrime(input));
        if(result ==true){
            System.out.println(input+"は素数です。");
        }else {
            System.out.println(input+"は素数ではありません。");
        }





        //        メソッド-階乗
        System.out.println("次に、入力された数字が素数かどうかを判定します。数字を入力してください。");
        input = sc.nextInt();
        System.out.println(MethodPractice.factorial(input));






//        メソッド-配列の最大値
        System.out.println("次に配列の中から最大値を取得します。");
        int nums[]= {2,43,2,21,10,4};
        System.out.println("下が配列です。");
        for(var e : nums){
            System.out.println(e+",");
        }
        System.out.println("下が最大値です。");
        System.out.println(MethodPractice.findMax(nums));




//        メソッド-回文
        System.out.println("次に、入力された言葉が回文かどうか調べます。文字を入力してください。");
        String input_2 = sc.next();
        var kaibun = MethodPractice.isPalindrome(input_2);
        if(kaibun ==true){
            System.out.println(input_2+"は回文です。");
        }else {
            System.out.println(input_2+"は回文ではありません。");
        }




//        メソッド-年齢取得
        System.out.println("次に、入力された生年月日の人の年齢を出力します。まず生まれ年を入力してください。");
        var year = sc.nextInt();
        System.out.println("次に、誕生月を入力してください。");
        var month = sc.nextInt();
        System.out.println("次に、誕生日を入力してください。");
        var day = sc.nextInt();

        System.out.println(MethodPractice.getAge(year,month,day)+"歳です。");




//        メソッド-配列のソート
        System.out.println("次に、数字の配列を昇順に並べます。");
        int[] nums2={2,43,2,21,10,4};
        System.out.println("下が配列です。");
        for(var e : nums){
            System.out.println(e+",");
        }
        MethodPractice.sortArray(nums2);
        System.out.println("下が昇順に並べたものです。");
        for(var e: nums2){
            System.out.print(e+",");
        }




        //        メソッド-二分探索
        System.out.println("次に、入力した数値が配列のどこにあるのかを表示します");

        int[] nums3={2,43,2,21,10,4};
        MethodPractice.sortArray(nums3);
        var sc = new Scanner(System.in);
        var target = sc.nextInt();
//        MethodPractice.getIndex(target,nums3,nums3.length-1,0);

        var answer = MethodPractice.getIndex(target,nums3,nums3.length-1,0);
        System.out.print(answer + 1 + "番目です。");




    }
}