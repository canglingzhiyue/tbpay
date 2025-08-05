package com.alibaba.ability.impl.sensor.listener;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.c;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class ShakeListener implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f1957a;
    private Sensor b;
    private Vibrator c;
    private float[] d;
    private int e;
    private long f;
    private long g;
    private final IApmEventListener h;
    private final Context i;
    private final String j;
    private final double k;
    private final int l;
    private final int m;
    private final boolean n;

    /* loaded from: classes2.dex */
    public enum Error {
        REGISTER_FAIL
    }

    /* loaded from: classes2.dex */
    public static final class b implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.application.common.IApmEventListener
        public final void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                ShakeListener.a(ShakeListener.this);
            } else if (i != 2) {
            } else {
                ShakeListener.b(ShakeListener.this);
            }
        }
    }

    static {
        kge.a(-1919845173);
        kge.a(499746989);
        Companion = new a(null);
    }

    public abstract void a(double d);

    public abstract void a(Error error);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public ShakeListener(Context context, String axis, double d, int i, int i2, boolean z) {
        q.d(context, "context");
        q.d(axis, "axis");
        this.i = context;
        this.j = axis;
        this.k = d;
        this.l = i;
        this.m = i2;
        this.n = z;
        this.h = new b();
    }

    public static final /* synthetic */ void a(ShakeListener shakeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a395656c", new Object[]{shakeListener});
        } else {
            shakeListener.d();
        }
    }

    public static final /* synthetic */ void b(ShakeListener shakeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0b05ed", new Object[]{shakeListener});
        } else {
            shakeListener.e();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-506452397);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Object systemService = this.i.getSystemService("sensor");
        Sensor sensor = null;
        if (!(systemService instanceof SensorManager)) {
            systemService = null;
        }
        this.f1957a = (SensorManager) systemService;
        SensorManager sensorManager = this.f1957a;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(10);
        }
        this.b = sensor;
        if (c()) {
            c.a(this.h);
        } else {
            a(Error.REGISTER_FAIL);
        }
    }

    private final boolean c() {
        Sensor sensor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        SensorManager sensorManager = this.f1957a;
        if (sensorManager != null && (sensor = this.b) != null) {
            return sensorManager.registerListener(this, sensor, 3);
        }
        return false;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1957a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.d = null;
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (c()) {
        } else {
            a(Error.REGISTER_FAIL);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.b(this.h);
        SensorManager sensorManager = this.f1957a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f1957a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.g + 50 > elapsedRealtime) {
            return;
        }
        if (sensorEvent != null && (fArr3 = this.d) != null) {
            float[] fArr4 = sensorEvent.values;
            q.b(fArr4, "event.values");
            if (b(fArr4, fArr3)) {
                float[] fArr5 = sensorEvent.values;
                q.b(fArr5, "event.values");
                double a2 = a(fArr5, fArr3);
                if (a2 > this.k) {
                    if (this.f + this.l < elapsedRealtime) {
                        this.e = 0;
                    }
                    this.e++;
                    this.f = elapsedRealtime;
                    if (this.e >= this.m) {
                        this.e = 0;
                        if (this.n) {
                            f();
                        }
                        a(a2);
                    }
                }
            }
        }
        if (sensorEvent == null || (fArr2 = sensorEvent.values) == null) {
            fArr = null;
        } else {
            fArr = Arrays.copyOf(fArr2, fArr2.length);
            q.b(fArr, "java.util.Arrays.copyOf(this, size)");
        }
        this.d = fArr;
        this.g = elapsedRealtime;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final float a(float[] fArr, float[] fArr2) {
        float sqrt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbab392e", new Object[]{this, fArr, fArr2})).floatValue();
        }
        if (fArr.length < 3 || fArr2.length < 3) {
            return 0.0f;
        }
        String str = this.j;
        switch (str.hashCode()) {
            case 88:
                if (str.equals("X")) {
                    sqrt = Math.abs(fArr[0] - fArr2[0]);
                    break;
                }
                double d = 2;
                sqrt = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d)) + ((float) Math.pow(fArr[1] - fArr2[1], d)) + ((float) Math.pow(fArr[2] - fArr2[2], d)));
                break;
            case 89:
                if (str.equals("Y")) {
                    sqrt = Math.abs(fArr[1] - fArr2[1]);
                    break;
                }
                double d2 = 2;
                sqrt = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d2)) + ((float) Math.pow(fArr[1] - fArr2[1], d2)) + ((float) Math.pow(fArr[2] - fArr2[2], d2)));
                break;
            case 90:
                if (str.equals("Z")) {
                    sqrt = Math.abs(fArr[2] - fArr2[2]);
                    break;
                }
                double d22 = 2;
                sqrt = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d22)) + ((float) Math.pow(fArr[1] - fArr2[1], d22)) + ((float) Math.pow(fArr[2] - fArr2[2], d22)));
                break;
            default:
                double d222 = 2;
                sqrt = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d222)) + ((float) Math.pow(fArr[1] - fArr2[1], d222)) + ((float) Math.pow(fArr[2] - fArr2[2], d222)));
                break;
        }
        return sqrt / 9.80665f;
    }

    private final boolean b(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fefa843", new Object[]{this, fArr, fArr2})).booleanValue() : fArr.length >= 3 && fArr2.length >= 3 && ((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) + (fArr[2] * fArr2[2]) < ((float) 0);
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.c == null) {
            Object systemService = this.i.getSystemService("vibrator");
            if (!(systemService instanceof Vibrator)) {
                systemService = null;
            }
            this.c = (Vibrator) systemService;
        }
        Vibrator vibrator = this.c;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(300L, 255));
        } else {
            vibrator.vibrate(300L);
        }
    }
}
