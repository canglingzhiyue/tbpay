package com.loc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import tb.mto;

/* loaded from: classes4.dex */
public final class ey implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    SensorManager f7780a;
    Sensor b;
    Sensor c;
    Sensor d;
    private Context s;
    public boolean e = false;
    public double f = mto.a.GEO_NOT_SUPPORT;
    public float g = 0.0f;
    private float t = 1013.25f;
    private float u = 0.0f;
    Handler h = new Handler();
    double i = mto.a.GEO_NOT_SUPPORT;
    double j = mto.a.GEO_NOT_SUPPORT;
    double k = mto.a.GEO_NOT_SUPPORT;
    double l = mto.a.GEO_NOT_SUPPORT;
    double[] m = new double[3];
    volatile double n = mto.a.GEO_NOT_SUPPORT;
    long o = 0;
    long p = 0;
    final int q = 100;
    final int r = 30;

    public ey(Context context) {
        this.s = null;
        this.f7780a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        try {
            this.s = context;
            if (this.f7780a == null) {
                this.f7780a = (SensorManager) this.s.getSystemService("sensor");
            }
            try {
                this.b = this.f7780a.getDefaultSensor(6);
            } catch (Throwable unused) {
            }
            try {
                this.c = this.f7780a.getDefaultSensor(11);
            } catch (Throwable unused2) {
            }
            try {
                this.d = this.f7780a.getDefaultSensor(1);
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            fr.a(th, "AMapSensorManager", "<init>");
        }
    }

    private void a(float[] fArr) {
        double[] dArr = this.m;
        dArr[0] = (dArr[0] * 0.800000011920929d) + (fArr[0] * 0.19999999f);
        dArr[1] = (dArr[1] * 0.800000011920929d) + (fArr[1] * 0.19999999f);
        dArr[2] = (dArr[2] * 0.800000011920929d) + (fArr[2] * 0.19999999f);
        this.i = fArr[0] - dArr[0];
        this.j = fArr[1] - dArr[1];
        this.k = fArr[2] - dArr[2];
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.o < 100) {
            return;
        }
        double d = this.i;
        double d2 = this.j;
        double d3 = (d * d) + (d2 * d2);
        double d4 = this.k;
        double sqrt = Math.sqrt(d3 + (d4 * d4));
        this.p++;
        this.o = currentTimeMillis;
        this.n += sqrt;
        if (this.p < 30) {
            return;
        }
        this.l = this.n / this.p;
        this.n = mto.a.GEO_NOT_SUPPORT;
        this.p = 0L;
    }

    private void b(float[] fArr) {
        if (fArr != null) {
            this.f = fy.a(SensorManager.getAltitude(this.t, fArr[0]));
        }
    }

    private void c(float[] fArr) {
        if (fArr != null) {
            float[] fArr2 = new float[9];
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = new float[3];
            SensorManager.getOrientation(fArr2, fArr3);
            this.u = (float) Math.toDegrees(fArr3[0]);
            float f = this.u;
            if (f <= 0.0f) {
                f += 360.0f;
            }
            this.u = (float) Math.floor(f);
        }
    }

    public final void a() {
        SensorManager sensorManager = this.f7780a;
        if (sensorManager == null || this.e) {
            return;
        }
        this.e = true;
        try {
            if (this.b != null) {
                sensorManager.registerListener(this, this.b, 3, this.h);
            }
        } catch (Throwable th) {
            fr.a(th, "AMapSensorManager", "registerListener mPressure");
        }
        try {
            if (this.c != null) {
                this.f7780a.registerListener(this, this.c, 3, this.h);
            }
        } catch (Throwable th2) {
            fr.a(th2, "AMapSensorManager", "registerListener mRotationVector");
        }
        try {
            if (this.d == null) {
                return;
            }
            this.f7780a.registerListener(this, this.d, 3, this.h);
        } catch (Throwable th3) {
            fr.a(th3, "AMapSensorManager", "registerListener mAcceleroMeterVector");
        }
    }

    public final void b() {
        SensorManager sensorManager = this.f7780a;
        if (sensorManager == null || !this.e) {
            return;
        }
        this.e = false;
        try {
            if (this.b != null) {
                sensorManager.unregisterListener(this, this.b);
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.c != null) {
                this.f7780a.unregisterListener(this, this.c);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (this.d == null) {
                return;
            }
            this.f7780a.unregisterListener(this, this.d);
        } catch (Throwable unused3) {
        }
    }

    public final double c() {
        return this.f;
    }

    public final float d() {
        return this.u;
    }

    public final double e() {
        return this.l;
    }

    public final void f() {
        try {
            b();
            this.b = null;
            this.c = null;
            this.f7780a = null;
            this.d = null;
            this.e = false;
        } catch (Throwable th) {
            fr.a(th, "AMapSensorManager", "destroy");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        try {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                if (this.d == null) {
                    return;
                }
                a((float[]) sensorEvent.values.clone());
            } else if (type != 6) {
                if (type != 11) {
                    return;
                }
                try {
                    if (this.c == null) {
                        return;
                    }
                    c((float[]) sensorEvent.values.clone());
                } catch (Throwable unused) {
                }
            } else {
                try {
                    if (this.b == null) {
                        return;
                    }
                    float[] fArr = (float[]) sensorEvent.values.clone();
                    if (fArr != null) {
                        this.g = fArr[0];
                    }
                    b(fArr);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
