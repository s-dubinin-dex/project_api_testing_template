package com.example;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    void openGitHubMainPage(){
        open("https://github.com/");
    }
}
