package com.company.mycalculatorlib;

import java.util.Date;

public interface Dateabl extends MyCalculatorLib {
    Date addDate(Date date, int daysNumber);
    Date subtractDate(Date date, int daysNumber);
}
