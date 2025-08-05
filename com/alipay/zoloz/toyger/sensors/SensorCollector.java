package com.alipay.zoloz.toyger.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SensorCollector implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_DATA_GYROSCOPE = 0;
    public static final int TYPE_DATA_ROTATION_VECTOR = 1;

    /* renamed from: a  reason: collision with root package name */
    private SensorCollectorListener f6293a;
    private SensorManager b;
    private Sensor c;
    private Sensor d;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public void setSensorCollectorListener(SensorCollectorListener sensorCollectorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc01c239", new Object[]{this, sensorCollectorListener});
        } else {
            this.f6293a = sensorCollectorListener;
        }
    }

    public void releaseSensorCollector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6176f973", new Object[]{this});
        } else {
            this.b.unregisterListener(this);
        }
    }

    public SensorCollector(Context context) {
        this.b = (SensorManager) context.getSystemService("sensor");
        this.c = this.b.getDefaultSensor(4);
        this.d = this.b.getDefaultSensor(11);
        this.b.registerListener(this, this.c, 10000);
        this.b.registerListener(this, this.d, 10000);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
        } else if (sensorEvent == null) {
        } else {
            if (sensorEvent.sensor.getType() == 4) {
                this.f6293a.onSensorChanged(0, sensorEvent.values, sensorEvent.timestamp);
            } else if (sensorEvent.sensor.getType() != 11) {
            } else {
                this.f6293a.onSensorChanged(1, a(sensorEvent.values), sensorEvent.timestamp);
            }
        }
    }

    private float[] a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("2715510e", new Object[]{this, fArr});
        }
        float[] fArr2 = new float[9];
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] fArr3 = new float[3];
        SensorManager.getOrientation(fArr2, fArr3);
        return fArr3;
    }
}
