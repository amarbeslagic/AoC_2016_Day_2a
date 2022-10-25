import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_2a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        int location = 5;
        int bathroomCode = 0;

        for(String inputString : listOfStrings) {
            for(int i=0; i<inputString.length(); i++){
                char symbol = inputString.charAt(i);

                if(symbol == 'U'){
                    if(location == 4){
                        location = 1;
                    }
                    else if(location == 5){
                        location = 2;
                    }
                    else if(location == 6){
                        location = 3;
                    }
                    else if(location == 7){
                        location = 4;
                    }
                    else if(location == 8){
                        location = 5;
                    }
                    else if(location == 9){
                        location = 6;
                    }

                }
                else if(symbol == 'D'){
                    if(location == 1){
                        location = 4;
                    }
                    else if(location == 2){
                        location = 5;
                    }
                    else if(location == 3){
                        location = 6;
                    }
                    else if(location == 4){
                        location = 7;
                    }
                    else if(location == 5){
                        location = 8;
                    }
                    else if(location == 6){
                        location = 9;
                    }
                }
                else if(symbol == 'L'){
                    if(location == 2){
                        location = 1;
                    }
                    else if(location == 5){
                        location = 4;
                    }
                    else if(location == 8){
                        location = 7;
                    }
                    else if(location == 3){
                        location = 2;
                    }
                    else if(location == 6){
                        location = 5;
                    }
                    else if(location == 9){
                        location = 8;
                    }
                }
                else if(symbol == 'R'){
                    if(location == 1){
                        location = 2;
                    }
                    else if(location == 2){
                        location = 3;
                    }
                    else if(location == 4){
                        location = 5;
                    }
                    else if(location == 5){
                        location = 6;
                    }
                    else if(location == 7){
                        location = 8;
                    }
                    else if(location == 8){
                        location = 9;
                    }
                }
            }
            bathroomCode *= 10;
            bathroomCode += location;
        }
        System.out.println(bathroomCode);
    }
}