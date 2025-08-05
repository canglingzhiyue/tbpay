package com.alibaba.security.realidentity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class e3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int l = 500;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f3387a;
    public int b;
    public int c;
    public Calendar e;
    public a j;
    public long d = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = 0;
    public int k = 1;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public e3(a aVar) {
        this.j = aVar;
    }

    public void a(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65847b5e", new Object[]{this, sensorEvent});
            return;
        }
        Sensor sensor = sensorEvent.sensor;
        if (sensor == null) {
            return;
        }
        if (this.f) {
            a();
        } else if (sensor.getType() != 1) {
        } else {
            float[] fArr = sensorEvent.values;
            int i = (int) fArr[0];
            int i2 = (int) fArr[1];
            int i3 = (int) fArr[2];
            Calendar calendar = Calendar.getInstance();
            this.e = calendar;
            long timeInMillis = calendar.getTimeInMillis();
            this.e.get(13);
            if (this.i != 0) {
                int abs = Math.abs(this.f3387a - i);
                int abs2 = Math.abs(this.b - i2);
                int abs3 = Math.abs(this.c - i3);
                if (Math.sqrt((abs * abs) + (abs2 * abs2) + (abs3 * abs3)) > 1.4d) {
                    this.i = 2;
                } else {
                    if (this.i == 2) {
                        this.d = timeInMillis;
                        this.g = true;
                    }
                    if (this.g && timeInMillis - this.d > 500 && !this.f) {
                        this.g = false;
                        a aVar = this.j;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                    this.i = 1;
                }
            } else {
                this.d = timeInMillis;
                this.i = 1;
            }
            this.f3387a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = 0;
        this.g = false;
        this.f3387a = 0;
        this.b = 0;
        this.c = 0;
    }
}
