package com.taobao.monitor.impl.data.battery;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.util.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.mpi;
import tb.riy;

/* loaded from: classes.dex */
public class SensorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SensorManager";
    private static d sBatteryDispatcher;
    private static final Map<String, Integer> sSensorInfoCache = new ConcurrentHashMap();

    private static int getDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8941f7a2", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 20000;
        }
        if (i == 2) {
            return 66667;
        }
        return i != 3 ? i : s.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0;
    }

    public static void setBatteryDispatcher(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efef1bb5", new Object[]{dVar});
        } else {
            sBatteryDispatcher = dVar;
        }
    }

    public static Map<String, Integer> getCurrSensorInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8650c2cc", new Object[0]) : new HashMap(sSensorInfoCache);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a861ca", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i)})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ebe31fa", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i), handler})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i, handler);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e644a01", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i), new Integer(i2)})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i, i2);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, int i2, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52d8b1", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i), new Integer(i2), handler})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i, i2, handler);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dad9093c", new Object[]{sensorManager, sensorListener, new Integer(i)})).booleanValue();
        }
        recordRegister(sensorListener, 3);
        return sensorManager.registerListener(sensorListener, i);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("804890cf", new Object[]{sensorManager, sensorListener, new Integer(i), new Integer(i2)})).booleanValue();
        }
        recordRegister(sensorListener, i2);
        return sensorManager.registerListener(sensorListener, i, i2);
    }

    private static void recordRegister(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144bd22c", new Object[]{obj, new Integer(i)});
        } else if (obj == null) {
        } else {
            String name = obj.getClass().getName();
            long a2 = h.a();
            int delay = getDelay(i);
            sSensorInfoCache.put(name, Integer.valueOf(delay));
            d dVar = sBatteryDispatcher;
            if (dVar != null) {
                dVar.a(name, delay, a2);
            }
            if (i <= 66667) {
                mpi.c(TAG, "high speed sensor register: " + name + riy.BRACKET_START_STR + delay + "us)");
            }
            mpi.c(TAG, "registerListener", name, Integer.valueOf(delay));
        }
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a734bc", new Object[]{sensorManager, sensorEventListener});
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
        recordUnregister(sensorEventListener);
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42969a4", new Object[]{sensorManager, sensorEventListener, sensor});
            return;
        }
        sensorManager.unregisterListener(sensorEventListener, sensor);
        recordUnregister(sensorEventListener);
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e56d232", new Object[]{sensorManager, sensorListener});
            return;
        }
        sensorManager.unregisterListener(sensorListener);
        recordUnregister(sensorListener);
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c83e711", new Object[]{sensorManager, sensorListener, new Integer(i)});
            return;
        }
        sensorManager.unregisterListener(sensorListener, i);
        recordUnregister(sensorListener);
    }

    private static void recordUnregister(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3386c50", new Object[]{obj});
        } else if (obj == null) {
        } else {
            String name = obj.getClass().getName();
            sSensorInfoCache.remove(name);
            d dVar = sBatteryDispatcher;
            if (dVar != null) {
                dVar.b(name);
            }
            mpi.c(TAG, "unregisterListener", name);
        }
    }
}
