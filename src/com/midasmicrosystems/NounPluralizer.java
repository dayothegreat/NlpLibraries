/*
 Copyright 2014 Midas Microsystems

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.midasmicrosystems;

import java.util.HashMap;
import java.util.Map;

/**
 * Responsible for converting a singular noun word to its plural equivalent.
 *
 *
 * @author Adedayo Ominiyi(adedayoominiyi@gmail.com,
 * ominiyi_freeman@yahoo.co.uk)
 */
public class NounPluralizer {

    private static final Map<String, String> exemptions = new HashMap<String, String>() {
        {
            put("piano", "pianos");
            put("biro", "biros");

            put("roof", "roofs");
            put("chief", "chiefs");
            put("belief", "beliefs");
            put("proof", "proofs");
            put("safe", "safes");

            put("man", "men");
            put("woman", "women");
            put("child", "children");
            put("foot", "feet");
            put("ox", "oxen");
            put("buffalo", "buffalo");
            put("tooth", "teeth");
            put("louse", "lice");
            put("mouse", "mice");
            put("sheep", "sheep");
            put("deer", "deer");

            put("fish", "fish");
        }
    };

    private NounPluralizer() {

    }

    public static String pluralize(String singularWord) {
        String newSingularWord = singularWord.toLowerCase();
        if (exemptions.containsKey(newSingularWord)) {
            return exemptions.get(newSingularWord);
        }

        // ends with 'sis'. Change the 'sis' to 'ses'.
        if (newSingularWord.endsWith("sis")) {
            return newSingularWord.substring(0, newSingularWord.indexOf("sis")) + "ses";
        }

        // ends with 'fe'. Change the 'fe' to 'ves'
        if (newSingularWord.endsWith("fe")) {
            return newSingularWord.substring(0, newSingularWord.indexOf("fe")) + "ves";
        }

        // ends with 'f'. Change the 'f' to 'ves'
        if (newSingularWord.endsWith("f")) {
            return newSingularWord.substring(0, newSingularWord.indexOf("f")) + "ves";
        }

        // ends with "<consonant>y". Change the 'y' to 'ies'
        if (newSingularWord.endsWith("y")) {
            int newSingularWordLength = newSingularWord.length();
            if (newSingularWordLength > 2) {
                char charBeforeY = newSingularWord.charAt(newSingularWordLength - 2);
                if (isConsonant(charBeforeY)) {
                    return newSingularWord.substring(0, newSingularWord.indexOf("y")) + "ies";
                }
            }
        }

        // ends with 'sh', 'ch', 'x', 'o', 's'. Add 'es' to the end
        if (newSingularWord.endsWith("sh")
                || newSingularWord.endsWith("ch")
                || newSingularWord.endsWith("x")
                || newSingularWord.endsWith("o")
                || newSingularWord.endsWith("s")) {
            return newSingularWord + "es";
        }

        // All others nouns add 's' to the end.
        return (newSingularWord + "s");
    }

    public static boolean isConsonant(char c) {
        return ((c != 'a') && (c != 'e') && (c != 'i') && (c != 'o') && (c != 'u'));
    }
}
