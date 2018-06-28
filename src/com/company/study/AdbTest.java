package com.company.study;

import com.android.ddmlib.IDevice;
import com.company.devices.ADB;
import com.company.devices.DeviceManager;


public class AdbTest {


    public static void main(String args[]) {
//        ADB adb = new ADB();
//        IDevice[] devices = adb.getDevices();
//        System.out.println("devices: " + devices);

        new Thread(new Runnable() {
            @Override
            public void run() {
                DeviceManager.getinstance().start();
            }
        }).start();

    }
}
