package com.company.devices;

import com.android.ddmlib.AndroidDebugBridge;
import com.android.ddmlib.AndroidDebugBridge.IDeviceChangeListener;
import com.android.ddmlib.IDevice;

public class DeviceChangeListener implements IDeviceChangeListener {
    @Override
    public void deviceConnected(IDevice iDevice) {
        System.out.println("设备连接成功： " + iDevice.getSerialNumber());
    }

    @Override
    public void deviceDisconnected(IDevice iDevice) {
        System.out.println("设备断开连接： " + iDevice.getSerialNumber());
    }

    @Override
    public void deviceChanged(IDevice iDevice, int i) {
        if (iDevice.isOnline()) {
            System.out.println("设备改变连接，上线：" + iDevice.getSerialNumber());
        } else {
            System.out.println("设备改变连接，下线： " + iDevice.getSerialNumber());
        }
    }
}
