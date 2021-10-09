package com.lld.lockersystem.Models;

import java.util.List;
import java.util.Map;

import com.lld.lockersystem.Enums.DAY;
import com.lld.lockersystem.Enums.HOUSE_STATUS;

public class LockerHouse {
    int id;
    Location location;
    List<Locker> lockers;
    HOUSE_STATUS house_STATUS;
    List<DAY> opening_days;
    Map<DAY,TIME> day_to_time;
    Admin admin;
}
