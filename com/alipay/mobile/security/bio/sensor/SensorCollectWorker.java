package com.alipay.mobile.security.bio.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alipay.mobile.security.bio.sensor.SensorCollectors;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class SensorCollectWorker implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f5801a;
    public int b;
    private Object c = new Object();
    private String d;
    private Sensor e;
    private SensorManager f;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public SensorCollectWorker(SensorManager sensorManager, SensorCollectors.SensorType sensorType, int i) {
        a();
        if (sensorManager == null || sensorType == null) {
            return;
        }
        this.f = sensorManager;
        this.e = sensorManager.getDefaultSensor(sensorType.getmSensorType());
        this.f5801a = sensorType.getSensorName();
        this.b = sensorType.getmSensorType();
        if (this.e == null) {
            BioLog.i("SensorCollectWorker: " + sensorType.getSensorName() + " 注册失败.［" + System.currentTimeMillis() + riy.ARRAY_END_STR);
            return;
        }
        BioLog.i("SensorCollectWorker: " + sensorType.getSensorName() + " 注册成功.［" + System.currentTimeMillis() + riy.ARRAY_END_STR);
    }

    public void start() {
        SensorManager sensorManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Sensor sensor = this.e;
        if (sensor == null || (sensorManager = this.f) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, 50000);
        BioLog.i("SensorCollectWorker: " + this.f5801a + " 开始采集数据.［" + System.currentTimeMillis() + riy.ARRAY_END_STR);
    }

    public void destory() {
        SensorManager sensorManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        Sensor sensor = this.e;
        if (sensor == null || (sensorManager = this.f) == null) {
            return;
        }
        try {
            sensorManager.unregisterListener(this, sensor);
        } catch (Throwable th) {
            BioLog.e(th);
        }
        this.e = null;
        BioLog.i("SensorCollectWorker: " + this.f5801a + " 停止采集数据.［" + System.currentTimeMillis() + riy.ARRAY_END_STR);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.e == null ? "" : this.f5801a;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        if (this.e != null) {
            return this.b;
        }
        return -1;
    }

    public String getResultData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75668dbc", new Object[]{this});
        }
        synchronized (this.c) {
            str = this.d;
        }
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
        } else if (sensorEvent == null || sensorEvent.values == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            try {
                int length = sensorEvent.values.length;
                sb.append(riy.ARRAY_START_STR);
                while (i < length) {
                    sb.append((int) (sensorEvent.values[i] * 100.0f));
                    i++;
                    if (i < length) {
                        sb.append(",");
                    }
                }
                sb.append(riy.ARRAY_END_STR);
            } catch (Throwable unused) {
            }
            synchronized (this.c) {
                this.d = sb.toString();
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = "[,,]";
        this.e = null;
    }
}
