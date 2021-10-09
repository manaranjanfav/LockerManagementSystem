package com.lld.lockersystem.Models;

import com.lld.lockersystem.Enums.LOCKER_STATUS;

public class Locker {
    int id;
    int locker_size ;
    LOCKER_STATUS locker_status;
    int remaining_days_to_vacate;
}
