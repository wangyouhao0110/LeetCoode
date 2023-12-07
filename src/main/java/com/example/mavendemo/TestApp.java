package com.example.mavendemo;


import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;


import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;
import java.util.logging.SimpleFormatter;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class TestApp {
    public static void main(String[] args) {
        String s = "234";
        boolean empty = StringUtils.isNotBlank(s);
        System.out.println(empty);
    }
}
