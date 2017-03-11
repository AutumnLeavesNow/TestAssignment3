/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.komarevtseva.yandextranslator;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;
import org.springframework.web.client.RestTemplate;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 *
 * @author Admin
 */
public class YandexTranslator {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.out.println("Insert yout phrase in english");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(translate(input));
        
    }
        private static String translate(String input){
            RestTemplate restTemplate = new RestTemplate();
            StringBuilder sburl = new StringBuilder();
            sburl.append("https://translate.yandex.net/api/v1.5/tr.json/translate?");
            sburl.append("key=trnsl.1.1.20160424T170331Z.dccf840833d21fdd.07417b4a1f9293ac063152a4ab63ee4a3d4bb5f8");
            sburl.append("&text=");
            sburl.append(input);
            sburl.append("&lang=en-ru");
            String url = sburl.toString();
            System.out.println(url);
            Translation translation = restTemplate.getForObject(url, Translation.class);
            return translation.getText();
        }



    
    
}
