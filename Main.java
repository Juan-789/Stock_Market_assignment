import java.util.Scanner;
import java.util.Random;
class Main {
public static void main(String[] args) {
    System.out.print("Welcome to the Juanberg terminal! ");
    boolean login = true;
    int owned_stocks = 0;
    double balance = 0;
//    double value = 0;
//    double profit = 0;
    //make array of each month
double [] january =  {35.689999, 36.290001, 36.549999, 36.110001, 37.700001, 36.970001, 36.639999, 37.290001, 35.799999, 39.189999, 40.380001, 38.419998, 38.580002, 42.110001, 45.5, 44.959999, 48.700001, 47.75, 49.580002, 47.880001};
double [] february = {50.84, 54.490002, 54.665001, 52.889999, 51.799999, 51.720001, 51.259998, 49.150002, 49.119999, 50.73, 53.700001, 46.919998, 45.029999, 42.849998, 42.924999, 42.82, 41.09, 41.049999, 41.359001};
double [] march =    {41.450001, 41.41, 43.488998, 44.055, 43.68, 43.82, 45.98, 42.634998, 55.322498, 56.299999, 62.386002, 65.778, 78, 71.305, 73.377998, 73.948997, 71.181, 70.684998, 71.660004, 75.877998, 73.779999, 70.863998};
double [] april =    {71.687698, 73.088997, 74.134003, 68.543999, 66.904999, 64.172997, 62.897999, 64.436996, 62.200001, 60.700001, 58.689098, 61.400002, 59.400002, 53.774502, 49.271, 47.584999, 45.853001, 43.997002, 45.213001, 46.338001};
double [] may =      {45.414001,47.535,48.799,42.487999,40.148998,37.171001,36.610001,34.599998,38.5,40.862999,39.824001,38.497002,37.973,41.369999,40.398998,36.879002,35.640999,33.674999,35.7127,37.181499,38.740002};
double [] june =     {39.293999, 40.099998, 38.5504, 37.456001, 38.132, 39.605, 39.751999, 36.280998, 34.014, 32.077, 33.0975, 31.931, 32.585999, 33.681999, 34.825001, 36.527, 38.7897, 39.5, 38.049, 34.98,33.34};
double [] july =     {33.060001, 34.279999, 35.310001, 35.48, 36.75, 35.099998, 33.48, 33.209999, 32.25, 31.84, 34.200001, 34.380001, 38.84, 40.68, 39.859001, 37.43, 31.950001, 35.48, 36.16, 36.648998};
double [] august =   {37.419998, 38.98, 42.150002, 42.59, 42.549999, 42.450001, 38.84, 40.869999, 45.43, 41.529999, 41.099998, 40.389999, 39.014999, 37.380001, 36.439999, 33.98, 33.799999, 34.264999, 34.709999, 34.59, 33.200001, 32.91, 33.349998};
double [] september ={31.360001, 31.99, 30.360001, 31.098, 32.029999, 34.900002, 35.810001, 33.52, 33.73, 34.73, 32.830002, 33.029999, 32.389999, 32.43, 30.569, 28.91, 29.940001, 29.4, 29.370001, 28.6, 28.139999};
double [] october =  {28.219999, 31.844999, 31.25, 31.08, 29.190001, 27.280001, 26.58, 26.450001, 26.559999, 27.389999, 27.995001, 29.719999, 28.629999, 30.82, 29.75, 29.389999, 30.16, 30.870001, 34.599998, 34.779999, 36.16};
double [] november = {36.400002, 36.060001, 35.155998, 35, 32.93, 33.25, 32.389999, 36.599998, 40.921001, 39.310001, 41.73, 39.779999, 38.27, 38.369999, 36.091, 35.380001, 37.040001, 37.009998, 40.150002, 39.959999, 40.900002};
double [] december = {43.740002, 45.060001, 43.700001, 40.849998, 38.990002, 39.150002, 40.355, 38.68, 42.700001, 39.450001, 37.799999, 37.110001, 36.299999, 37.099998, 36.939999, 35.599998, 34.549999, 33.634998, 33.700001, 35.380001, 35.146};
double [][] arrays = {january,february,march,april,may,june,july,august,september,october,november,december};

    while (login) {
        System.out.print("To view the final balance of your stocks, press 'q' at any point of the prompts and the program will end and you balance will be shown. ");
        //Ask date of transaction
            System.out.println("What day do you desire to make the transaction (enter in format: DD MM)");
            Scanner given_date = new Scanner(System.in);
            String date = given_date.nextLine();
    
            String monthString = date.substring(3,5);
            String dayString = date.substring(0, 2);
        
        //formats the input into month and days
            int month = Integer.parseInt(monthString);
            int day = Integer.parseInt(dayString);

        //ask for transaction type
        System.out.println("What type of transaction you want to make? 'B' for buying, 'S' for selling");
        Scanner given_transaction = new Scanner(System.in);
        String transaction = given_transaction.nextLine();
        
        //adds to balance
        if (transaction.equals( "B")) {
            //ask for quantity
        System.out.println("How much?");
        Scanner given_quantity = new Scanner(System.in);
        int quantity = given_quantity.nextInt();
            balance += quantity*arrays[month-1][day-1];
            owned_stocks += quantity;

        }
        //deducts balance
        else if (transaction.equals("S") ) {
            //ask for quantity
        System.out.println("How much?");
        Scanner given_quantity = new Scanner(System.in);
        int quantity = given_quantity.nextInt();
            balance -= quantity*arrays[month-1][day-1];
            owned_stocks -= quantity;
        }
        else if (transaction.equals("q")) {
            //generate random move in your portfolio
            Random rand_gain = new Random();
            double percent_gain = 2* rand_gain.nextDouble();
            double value = owned_stocks*arrays[month-1][day-1]*percent_gain;
            double profit = balance - value;
            if (percent_gain>1) {
                System.out.println("Congratulations!!! \n due to ground breaking research done by SHOPIFY \n Your portfolio's value is, "+value+" and your profit/loss is "+profit);
                login = false;
            }
            else if (percent_gain<1) {
                System.out.print("Unfortunate \n SHOPIFY has been in a legal lawsuit due to privacy from users \n  Your portfolio's value is, "+value+" and your profit/loss is "+profit);
                login = false;
            }       

        }
        }
    }

    }
