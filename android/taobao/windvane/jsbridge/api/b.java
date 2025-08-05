package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f1661a;
    private a b;
    private Context c;
    private long d;
    private float e;
    private float f;
    private float g;
    private long h;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(1316519564);
        kge.a(499746989);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public b(Context context, long j) {
        this.c = context;
        this.d = j;
        a();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae7ec6", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f1661a = (SensorManager) this.c.getSystemService("sensor");
        SensorManager sensorManager = this.f1661a;
        if (sensorManager == null) {
            m.d("ShakeListener", "start: Sensors not supported");
        } else if (sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2)) {
        } else {
            this.f1661a.unregisterListener(this);
            m.d("ShakeListener", "start: Accelerometer not supported");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1661a;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1661a;
        if (sensorManager == null || sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2)) {
            return;
        }
        this.f1661a.unregisterListener(this);
        m.d("ShakeListener", "start: Accelerometer not supported");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1661a;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.f1661a = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
        } else if (sensorEvent.sensor.getType() != 1) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.h < this.d) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            float f4 = f - this.e;
            float f5 = f2 - this.f;
            float f6 = f3 - this.g;
            if (Math.sqrt((f4 * f4) + (f5 * f5) + (f6 * f6)) > 10.0d && (aVar = this.b) != null && aVar != null && Math.abs(this.e) > 0.0f && Math.abs(this.f) > 0.0f && Math.abs(this.g) > 0.0f) {
                this.b.a();
            }
            this.h = currentTimeMillis;
            this.e = f;
            this.f = f2;
            this.g = f3;
        }
    }
}
