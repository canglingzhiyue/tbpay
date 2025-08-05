package com.tmall.wireless.mirrorlife.base.bridge;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class PailixiangCompassBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_DIVIDER = ",";
    public static final String KEY_VALUE_DIVIDER = ":";
    public static final String PITCH = ", PITCH:";
    public static final String ROLL = ", ROLL:";
    public static final String YAW = "Yaw:";
    private SensorManager sensorManager;
    public StringBuilder mStringBuilder = new StringBuilder();
    public boolean initial = false;
    public float[] orientation = new float[3];
    public float[] gyro = new float[3];
    private SensorEventListener sensorEventListener = new SensorEventListener() { // from class: com.tmall.wireless.mirrorlife.base.bridge.PailixiangCompassBridge.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            } else if (sensorEvent.sensor.getType() == 3) {
                System.arraycopy(sensorEvent.values, 0, PailixiangCompassBridge.this.orientation, 0, 3);
                PailixiangCompassBridge.this.initial = true;
            } else if (sensorEvent.sensor.getType() != 4 || !PailixiangCompassBridge.this.initial) {
            } else {
                System.arraycopy(sensorEvent.values, 0, PailixiangCompassBridge.this.gyro, 0, 3);
                PailixiangCompassBridge.this.mStringBuilder.setLength(0);
                StringBuilder sb = PailixiangCompassBridge.this.mStringBuilder;
                sb.append(PailixiangCompassBridge.this.orientation[0]);
                sb.append(",");
                sb.append(PailixiangCompassBridge.this.orientation[1]);
                sb.append(",");
                sb.append(PailixiangCompassBridge.this.orientation[2]);
                sb.append(",");
                sb.append(PailixiangCompassBridge.this.gyro[0]);
                sb.append(",");
                sb.append(PailixiangCompassBridge.this.gyro[1]);
                sb.append(",");
                sb.append(PailixiangCompassBridge.this.gyro[2]);
                PailixiangCompassBridge.this.notifyDirection(PailixiangCompassBridge.this.mStringBuilder.toString());
            }
        }
    };

    static {
        kge.a(989800647);
    }

    public static /* synthetic */ Object ipc$super(PailixiangCompassBridge pailixiangCompassBridge, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void fireEvent(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b044543", new Object[]{this, iWVWebView, str, str2});
        }
    }

    public float[] unWrap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("430168d", new Object[]{this, str});
        }
        float[] fArr = new float[3];
        String[] split = str.split(",");
        if (split.length != 3) {
            return fArr;
        }
        fArr[0] = Float.parseFloat(split[0]);
        fArr[1] = Float.parseFloat(split[1]);
        fArr[2] = Float.parseFloat(split[2]);
        return fArr;
    }

    public void notifyDirection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab5c047", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resultData", (Object) str);
        fireEvent(this.mWebView, "WEEX_AR_COMPASS_UPDATE", jSONObject.toString());
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            this.sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        } catch (Exception unused) {
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("startCompass".equals(str)) {
            SensorManager sensorManager = this.sensorManager;
            sensorManager.registerListener(this.sensorEventListener, sensorManager.getDefaultSensor(3), 1);
            SensorManager sensorManager2 = this.sensorManager;
            sensorManager2.registerListener(this.sensorEventListener, sensorManager2.getDefaultSensor(4), 1);
            wVCallBackContext.success();
            return true;
        } else if (!"stopCompass".equals(str)) {
            return false;
        } else {
            this.sensorManager.unregisterListener(this.sensorEventListener);
            return true;
        }
    }
}
