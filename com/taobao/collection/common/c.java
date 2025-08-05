package com.taobao.collection.common;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kfs;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1868837238);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 18;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        BluetoothManager bluetoothManager = (BluetoothManager) kfs.a().getSystemService("bluetooth");
        BluetoothAdapter bluetoothAdapter = null;
        if (Build.VERSION.SDK_INT >= 18) {
            bluetoothAdapter = bluetoothManager.getAdapter();
        }
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }
}
