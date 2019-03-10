package pl.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author Jarek Czaplicki
 */
public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            Data[] data = mapper.readValue(new File("data.json"), Data[].class);
            System.out.println(data.length);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
