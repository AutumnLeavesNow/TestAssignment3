/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.komarevtseva.yandextranslator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;



/**
 *
 * @author Admin
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Translation {
    
    private List<String> text;
    //private String lang;
    //private long code;
    public Translation() {    
    }
    public String getText() {
        StringBuilder result = new StringBuilder();
        text.forEach((item) -> {
            result.append(item).append(" ");
        });
        return result.toString();
    }

    public void setText(List<String> text) {
        this.text = text;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        text.forEach((item) -> {
            result.append(item).append(" ");
        });
        return result.toString();
    }

    
}
