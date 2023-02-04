package com.example.chinese;

import com.example.IsItFriday;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假定;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionDefinitions {
    private Integer first;
    private Integer second;

    @假定("一个数是\"{int}\"")
    public void 一个数是(Integer first) {
        this.first = first;
    }
    @当("加上\"{int}\"")
    public void 加上(Integer second) {
        this.second = second;
    }
    @那么("结果是\"{int}\"")
    public void 结果是(Integer sum) {
        assertEquals(first + second, sum);
    }
}