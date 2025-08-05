package com.alibaba.security.realidentity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class s3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "s3";
    public static final float h = -1.0f;

    /* renamed from: a  reason: collision with root package name */
    public y3 f3511a;
    public final Context b;
    public SensorManager c;
    public float d = -1.0f;
    public float e = -1.0f;
    public SensorEventListener f = new a();

    /* loaded from: classes3.dex */
    public class a implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            } else if (sensorEvent == null || (sensor = sensorEvent.sensor) == null) {
            } else {
                if (sensor.getType() == 5) {
                    s3.a(s3.this, sensorEvent.values[0]);
                    if (s3.a(s3.this) != null) {
                        s3.a(s3.this).onIlluminanceChangedListener(sensorEvent.values[0]);
                    }
                }
                if (sensorEvent.sensor.getType() != 8) {
                    return;
                }
                s3.b(s3.this, sensorEvent.values[0]);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "rpsdk-sensorGetter");
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y3 f3514a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Handler c;
        public final /* synthetic */ ThreadPoolExecutor d;

        /* loaded from: classes3.dex */
        public class a implements SensorEventListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float[] f3515a;
            public final /* synthetic */ long b;
            public final /* synthetic */ CountDownLatch c;

            public a(float[] fArr, long j, CountDownLatch countDownLatch) {
                this.f3515a = fArr;
                this.b = j;
                this.c = countDownLatch;
            }

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
                    return;
                }
                try {
                    try {
                        this.f3515a[0] = sensorEvent.values[0];
                        String a2 = s3.a();
                        com.alibaba.security.realidentity.a.c(a2, "name:" + sensorEvent.sensor.getName() + "\tvalue:" + sensorEvent.values[0] + "\tcost:" + (System.currentTimeMillis() - this.b));
                    } catch (Exception e) {
                        com.alibaba.security.realidentity.a.a(s3.a(), e);
                    }
                } finally {
                    this.c.countDown();
                }
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float[] f3516a;

            public b(float[] fArr) {
                this.f3516a = fArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.this.f3514a.onIlluminanceChangedListener(this.f3516a[0]);
                }
            }
        }

        public c(y3 y3Var, int i, Handler handler, ThreadPoolExecutor threadPoolExecutor) {
            this.f3514a = y3Var;
            this.b = i;
            this.c = handler;
            this.d = threadPoolExecutor;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f3514a == null) {
                com.alibaba.security.realidentity.a.b(s3.a(), "sensorCallback is null");
                return;
            }
            s3 s3Var = s3.this;
            s3.a(s3Var, (SensorManager) s3.c(s3Var).getApplicationContext().getSystemService("sensor"));
            if (s3.b(s3.this) == null) {
                this.f3514a.onIlluminanceChangedListener(-1.0f);
                return;
            }
            Sensor defaultSensor = s3.b(s3.this).getDefaultSensor(this.b);
            if (defaultSensor == null) {
                this.f3514a.onIlluminanceChangedListener(-1.0f);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            float[] fArr = new float[1];
            a aVar = new a(fArr, currentTimeMillis, countDownLatch);
            s3.b(s3.this).registerListener(aVar, defaultSensor, 3);
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                com.alibaba.security.realidentity.a.a(s3.a(), e);
            }
            this.c.post(new b(fArr));
            if (s3.b(s3.this) != null) {
                s3.b(s3.this).unregisterListener(aVar, defaultSensor);
            }
            this.d.shutdown();
        }
    }

    public s3(Context context) {
        this.b = context;
    }

    public static /* synthetic */ float a(s3 s3Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c66d0a3e", new Object[]{s3Var, new Float(f)})).floatValue();
        }
        s3Var.d = f;
        return f;
    }

    public static /* synthetic */ float b(s3 s3Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8959739d", new Object[]{s3Var, new Float(f)})).floatValue();
        }
        s3Var.e = f;
        return f;
    }

    public static /* synthetic */ Context c(s3 s3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ce9b42c", new Object[]{s3Var}) : s3Var.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.c;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f);
        }
        this.c = null;
        this.f = null;
    }

    public static /* synthetic */ y3 a(s3 s3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (y3) ipChange.ipc$dispatch("c62a5ab4", new Object[]{s3Var}) : s3Var.f3511a;
    }

    public static /* synthetic */ SensorManager b(s3 s3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SensorManager) ipChange.ipc$dispatch("c23ea406", new Object[]{s3Var}) : s3Var.c;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.e;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : g;
    }

    public void b(y3 y3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e3cf79", new Object[]{this, y3Var});
            return;
        }
        SensorManager sensorManager = (SensorManager) this.b.getSystemService("sensor");
        this.c = sensorManager;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            Sensor defaultSensor2 = this.c.getDefaultSensor(8);
            this.c.registerListener(this.f, defaultSensor, 3);
            this.c.registerListener(this.f, defaultSensor2, 3);
        }
        this.f3511a = y3Var;
    }

    public static /* synthetic */ SensorManager a(s3 s3Var, SensorManager sensorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SensorManager) ipChange.ipc$dispatch("4779984", new Object[]{s3Var, sensorManager});
        }
        s3Var.c = sensorManager;
        return sensorManager;
    }

    private void a(int i, y3 y3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77389ab", new Object[]{this, new Integer(i), y3Var});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.submit(new c(y3Var, i, new Handler(Looper.getMainLooper()), threadPoolExecutor));
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.d;
    }

    public void a(y3 y3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a260b8", new Object[]{this, y3Var});
        } else {
            a(5, y3Var);
        }
    }
}
