package com.company.devices;

import com.android.ddmlib.AndroidDebugBridge;

import java.io.File;

public class AndroidDebugBrigeWrapper {
    private AndroidDebugBridge adb;
    private String adbPath = null;

    public AndroidDebugBrigeWrapper() {
        init(false);
    }

    /**
     * 获取系统adb路径
     * @return
     */
    private String getADBPath(){
        if (adbPath == null){
            //获取ANDROID_HOME环境变量
            adbPath = System.getenv("ANDROID_HOME");
            System.out.println("adbPath: " + adbPath);
            if(adbPath != null){
                System.out.println("File.separator: " + File.separator);
                adbPath += File.separator + "platform-tools";
                adbPath += File.separator + "adb";
                System.out.println("adbPath: " + adbPath);
            }else {
                return null;
            }
        }
        return adbPath;
    }

    private void init(boolean clientSupport) {
        AndroidDebugBridge.init(clientSupport);
        adb = AndroidDebugBridge.createBridge(getADBPath(), true);
    }

    public void addDeviceChangeListener(AndroidDebugBridge.IDeviceChangeListener listener) {
        AndroidDebugBridge.addDeviceChangeListener(listener);
    }

    public void removeDeviceChangeListener(AndroidDebugBridge.IDeviceChangeListener listener) {
        AndroidDebugBridge.removeDeviceChangeListener(listener);
    }

    public void terminate() {
        AndroidDebugBridge.terminate();
    }

    public void disconnectBridge() {
        AndroidDebugBridge.disconnectBridge();
    }
}
