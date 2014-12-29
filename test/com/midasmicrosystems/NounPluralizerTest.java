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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit Test for the NounPluralizer Class.
 *
 *
 * @author Adedayo Ominiyi(adedayoominiyi@gmail.com,
 * ominiyi_freeman@yahoo.co.uk)
 */
public class NounPluralizerTest {

    public NounPluralizerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPluralize() {
        assertEquals("Error", "brushes", NounPluralizer.pluralize("brush"));
        assertEquals("Error", "boxes", NounPluralizer.pluralize("box"));
        assertEquals("Error", "churches", NounPluralizer.pluralize("church"));
        assertEquals("Error", "buses", NounPluralizer.pluralize("bus"));
        assertEquals("Error", "gases", NounPluralizer.pluralize("gas"));
        assertEquals("Error", "watches", NounPluralizer.pluralize("watch"));
        assertEquals("Error", "foxes", NounPluralizer.pluralize("fox"));
        assertEquals("Error", "losses", NounPluralizer.pluralize("loss"));
        assertEquals("Error", "passes", NounPluralizer.pluralize("pass"));

        assertEquals("Error", "tomatoes", NounPluralizer.pluralize("tomato"));
        assertEquals("Error", "heroes", NounPluralizer.pluralize("hero"));
        assertEquals("Error", "potatoes", NounPluralizer.pluralize("potato"));
        assertEquals("Error", "cargoes", NounPluralizer.pluralize("cargo"));
        assertEquals("Error", "mosquitoes", NounPluralizer.pluralize("mosquito"));
        assertEquals("Error", "mottoes", NounPluralizer.pluralize("motto"));

        assertEquals("Error", "biros", NounPluralizer.pluralize("biro"));
        assertEquals("Error", "pianos", NounPluralizer.pluralize("piano"));

        assertEquals("Error", "leaves", NounPluralizer.pluralize("leaf"));
        assertEquals("Error", "halves", NounPluralizer.pluralize("half"));
        assertEquals("Error", "wolves", NounPluralizer.pluralize("wolf"));
        assertEquals("Error", "hooves", NounPluralizer.pluralize("hoof"));
        assertEquals("Error", "wives", NounPluralizer.pluralize("wife"));
        assertEquals("Error", "knives", NounPluralizer.pluralize("knife"));
        assertEquals("Error", "thieves", NounPluralizer.pluralize("thief"));
        assertEquals("Error", "lives", NounPluralizer.pluralize("life"));

        assertEquals("Error", "crises", NounPluralizer.pluralize("crisis"));
        assertEquals("Error", "theses", NounPluralizer.pluralize("thesis"));
        assertEquals("Error", "oases", NounPluralizer.pluralize("oasis"));

        assertEquals("Error", "babies", NounPluralizer.pluralize("baby"));
        assertEquals("Error", "ladies", NounPluralizer.pluralize("lady"));
        assertEquals("Error", "flies", NounPluralizer.pluralize("fly"));
        assertEquals("Error", "armies", NounPluralizer.pluralize("army"));
        assertEquals("Error", "cities", NounPluralizer.pluralize("city"));
        assertEquals("Error", "bodies", NounPluralizer.pluralize("body"));
    }
}
