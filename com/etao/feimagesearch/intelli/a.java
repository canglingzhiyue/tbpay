package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.cqi;
import tb.kge;

/* loaded from: classes3.dex */
public class a implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f6688a;
    private Sensor b;
    private Sensor c;
    private float[] d;
    private float[] e;
    private boolean h;
    private boolean i;
    private final cqi k;
    private final float[] f = new float[3];
    private final float[] g = new float[3];
    private boolean j = true;

    static {
        kge.a(-1939661157);
        kge.a(499746989);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public a(Context context, cqi cqiVar) {
        this.h = true;
        this.i = true;
        this.k = cqiVar;
        this.f6688a = (SensorManager) context.getSystemService("sensor");
        SensorManager sensorManager = this.f6688a;
        if (sensorManager == null) {
            return;
        }
        this.b = sensorManager.getDefaultSensor(1);
        if (this.b == null) {
            this.h = false;
        } else {
            try {
                TLogTracker.b("CaptureSensor", "register accelerometerSensor", "sensor:" + this.b.hashCode() + ", listener:" + this);
                this.f6688a.registerListener(this, this.b, 3);
            } catch (Exception unused) {
            }
        }
        this.c = this.f6688a.getDefaultSensor(4);
        if (this.c == null) {
            this.i = false;
        } else {
            try {
                TLogTracker.b("CaptureSensor", "register gyroscopeSensor", "sensor:" + this.c.hashCode() + ", listener:" + this);
                this.f6688a.registerListener(this, this.c, 3);
            } catch (Exception unused2) {
            }
        }
        if (this.c != null || this.b != null) {
            return;
        }
        cqiVar.onDeviceStable();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f6688a == null) {
        } else {
            if (this.b != null) {
                try {
                    TLogTracker.b("CaptureSensor", "unregister accelerometerSensor", "sensor:" + this.b.hashCode() + ", listener:" + this);
                    this.f6688a.unregisterListener(this, this.b);
                } catch (Exception unused) {
                }
            }
            if (this.c == null) {
                return;
            }
            try {
                TLogTracker.b("CaptureSensor", "unregister gyroscopeSensor", "sensor:" + this.c.hashCode() + ", listener:" + this);
                this.f6688a.unregisterListener(this, this.c);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (this.d == null) {
                this.d = new float[3];
            } else {
                while (i < sensorEvent.values.length) {
                    this.f[i] = Math.abs(sensorEvent.values[i] - this.d[i]);
                    i++;
                }
            }
            a(sensorEvent, this.d);
            c();
        } else if (type != 4) {
        } else {
            if (this.e == null) {
                this.e = new float[3];
            } else {
                while (i < sensorEvent.values.length) {
                    this.g[i] = Math.abs(sensorEvent.values[i] - this.e[i]);
                    i++;
                }
            }
            a(sensorEvent, this.e);
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        float[] fArr = this.g;
        if (fArr[0] <= 0.06f && fArr[1] <= 0.06f && fArr[2] <= 0.06f) {
            z = false;
        }
        this.i = z;
        d();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        float[] fArr = this.f;
        if (fArr[0] <= 0.3f && fArr[1] <= 0.3f && fArr[2] <= 0.5f) {
            z = false;
        }
        this.h = z;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.h || this.i) {
            z = true;
        }
        if (z != this.j) {
            if (z) {
                this.k.onDeviceMove();
            } else {
                this.k.onDeviceStable();
            }
        }
        this.j = z;
    }

    private void a(SensorEvent sensorEvent, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16699fa9", new Object[]{this, sensorEvent, fArr});
        } else {
            System.arraycopy(sensorEvent.values, 0, fArr, 0, fArr.length);
        }
    }
}
