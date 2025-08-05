package com.taobao.trtc.audio;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.ThreadUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class b implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Runnable b;
    private final SensorManager c;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadUtils.ThreadChecker f23065a = new ThreadUtils.ThreadChecker();
    private Sensor d = null;
    private boolean e = false;

    static {
        kge.a(-467167004);
        kge.a(499746989);
    }

    public static b a(Context context, Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d73efad5", new Object[]{context, runnable}) : new b(context, runnable);
    }

    private b(Context context, Runnable runnable) {
        TrtcLog.d("TrtcProximitySensor", "TrtcProximitySensor" + a.a());
        this.b = runnable;
        this.c = (SensorManager) context.getSystemService("sensor");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        this.f23065a.checkIsOnValidThread();
        TrtcLog.d("TrtcProximitySensor", "start" + a.a());
        if (!d()) {
            return false;
        }
        this.c.registerListener(this, this.d, 3);
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f23065a.checkIsOnValidThread();
        TrtcLog.d("TrtcProximitySensor", "stop" + a.a());
        Sensor sensor = this.d;
        if (sensor == null) {
            return;
        }
        this.c.unregisterListener(this, sensor);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        this.f23065a.checkIsOnValidThread();
        return this.e;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            return;
        }
        this.f23065a.checkIsOnValidThread();
        if (sensor.getType() != 8) {
            z = false;
        }
        a.a(z);
        if (i != 0) {
            return;
        }
        TrtcLog.a("TrtcProximitySensor", "The values returned by this sensor cannot be trusted");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        this.f23065a.checkIsOnValidThread();
        a.a(sensorEvent.sensor.getType() == 8);
        if (sensorEvent.values[0] < this.d.getMaximumRange()) {
            TrtcLog.d("TrtcProximitySensor", "Proximity sensor => NEAR state");
            this.e = true;
        } else {
            TrtcLog.d("TrtcProximitySensor", "Proximity sensor => FAR state");
            this.e = false;
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        TrtcLog.d("TrtcProximitySensor", "onSensorChanged" + a.a() + ": accuracy=" + sensorEvent.accuracy + ", timestamp=" + sensorEvent.timestamp + ", distance=" + sensorEvent.values[0]);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.d != null) {
            return true;
        }
        this.d = this.c.getDefaultSensor(8);
        if (this.d == null) {
            return false;
        }
        e();
        return true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            StringBuilder sb = new StringBuilder("Proximity sensor: ");
            sb.append("name=");
            sb.append(this.d.getName());
            sb.append(", vendor: ");
            sb.append(this.d.getVendor());
            sb.append(", power: ");
            sb.append(this.d.getPower());
            sb.append(", resolution: ");
            sb.append(this.d.getResolution());
            sb.append(", max range: ");
            sb.append(this.d.getMaximumRange());
            if (Build.VERSION.SDK_INT >= 9) {
                sb.append(", min delay: ");
                sb.append(this.d.getMinDelay());
            }
            if (Build.VERSION.SDK_INT >= 20) {
                sb.append(", type: ");
                sb.append(this.d.getStringType());
            }
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", max delay: ");
                sb.append(this.d.getMaxDelay());
                sb.append(", reporting mode: ");
                sb.append(this.d.getReportingMode());
                sb.append(", isWakeUpSensor: ");
                sb.append(this.d.isWakeUpSensor());
            }
            TrtcLog.d("TrtcProximitySensor", sb.toString());
        }
    }
}
