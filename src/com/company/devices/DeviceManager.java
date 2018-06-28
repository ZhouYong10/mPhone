package com.company.devices;

public class DeviceManager {
    private static DeviceManager INSTANCE = null;
    private AndroidDebugBrigeWrapper androidDebugBrigeWrapper;
    private DeviceChangeListener deviceChangeListener;

    private DeviceManager() {

    }

    public static DeviceManager getinstance() {
        if (INSTANCE == null) {
            INSTANCE = new DeviceManager();
        }

        return INSTANCE;
    }

    public void start() {
        androidDebugBrigeWrapper = new AndroidDebugBrigeWrapper();
        deviceChangeListener = new DeviceChangeListener();

        androidDebugBrigeWrapper.addDeviceChangeListener(deviceChangeListener);
    }

    public void destroy() {
        if (androidDebugBrigeWrapper == null) {
            return ;
        }
        androidDebugBrigeWrapper.removeDeviceChangeListener(deviceChangeListener);
        androidDebugBrigeWrapper.terminate();
    }
}
