package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class o implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static o i;
    private static final Object j;
    private static final Set<Integer> k;
    private static final Set<Integer> l;
    private static final Set<Integer> m;

    /* renamed from: a  reason: collision with root package name */
    public t f2243a;
    private HandlerThread b;
    private Handler c;
    private final Context d;
    private float[] e;
    private float[] f;
    private float[] g;
    private double[] h;
    private Set<Integer> p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final Set<Integer> n = new HashSet();
    private ArrayList<a> t = new ArrayList<>();
    private final List<Set<Integer>> o = w.b(k, l, m);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void a(double d, double d2, double d3);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i2)});
        }
    }

    static {
        kge.a(2130958777);
        kge.a(499746989);
        j = new Object();
        k = w.a((Object[]) new Integer[]{15});
        l = w.a((Object[]) new Integer[]{11});
        m = w.a((Object[]) new Integer[]{1, 2});
    }

    private o(Context context) {
        this.d = context.getApplicationContext();
    }

    public static o a(Context context) {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("49cd693", new Object[]{context});
        }
        synchronized (j) {
            if (i == null) {
                i = new o(context);
            }
            oVar = i;
        }
        return oVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca203f28", new Object[]{this, aVar});
            return;
        }
        ArrayList<a> arrayList = this.t;
        if (arrayList == null || arrayList.contains(aVar)) {
            return;
        }
        this.t.add(aVar);
    }

    public boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("575af0ad", new Object[]{this, aVar})).booleanValue();
        }
        ArrayList<a> arrayList = this.t;
        if (arrayList == null) {
            return false;
        }
        if (aVar == null) {
            arrayList.clear();
            return true;
        }
        return arrayList.remove(aVar);
    }

    private boolean b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.s) {
            return false;
        }
        if (this.p != null) {
            String b = b();
            com.alibaba.android.bindingx.core.h.b("[OrientationDetector] register sensor:" + b);
            return a(this.p, i2, true);
        }
        d();
        for (Set<Integer> set : this.o) {
            this.p = set;
            if (a(this.p, i2, true)) {
                String b2 = b();
                com.alibaba.android.bindingx.core.h.b("[OrientationDetector] register sensor:" + b2);
                return true;
            }
        }
        this.s = true;
        this.p = null;
        this.g = null;
        this.h = null;
        return false;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.s) {
            return "NOT_AVAILABLE";
        }
        Set<Integer> set = this.p;
        return set == k ? "GAME_ROTATION_VECTOR" : set == l ? "ROTATION_VECTOR" : set == m ? "ACCELEROMETER_MAGNETIC" : "NOT_AVAILABLE";
    }

    public boolean a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        com.alibaba.android.bindingx.core.h.b("[OrientationDetector] sensor started");
        boolean b = b(i2);
        if (b) {
            a(true);
        }
        return b;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.h.b("[OrientationDetector] sensor stopped");
        a(new HashSet(this.n));
        a(false);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type == 1) {
            if (!this.r) {
                return;
            }
            a(fArr, this.e);
        } else if (type == 2) {
            if (!this.r) {
                return;
            }
            if (this.e == null) {
                this.e = new float[3];
            }
            float[] fArr2 = this.e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        } else if (type == 11) {
            if (!this.q || this.p != l) {
                return;
            }
            b(fArr, this.h);
            double[] dArr = this.h;
            a(dArr[0], dArr[1], dArr[2]);
        } else if (type == 15) {
            if (!this.q) {
                return;
            }
            b(fArr, this.h);
            double[] dArr2 = this.h;
            a(dArr2[0], dArr2[1], dArr2[2]);
        } else {
            com.alibaba.android.bindingx.core.h.d("unexpected sensor type:" + type);
        }
    }

    private static double[] a(float[] fArr, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("b9bb06a3", new Object[]{fArr, dArr});
        }
        if (fArr.length != 9) {
            return dArr;
        }
        if (fArr[8] > 0.0f) {
            dArr[0] = Math.atan2(-fArr[1], fArr[4]);
            dArr[1] = Math.asin(fArr[7]);
            dArr[2] = Math.atan2(-fArr[6], fArr[8]);
        } else if (fArr[8] < 0.0f) {
            dArr[0] = Math.atan2(fArr[1], -fArr[4]);
            dArr[1] = -Math.asin(fArr[7]);
            dArr[1] = dArr[1] + (dArr[1] >= mto.a.GEO_NOT_SUPPORT ? -3.141592653589793d : 3.141592653589793d);
            dArr[2] = Math.atan2(fArr[6], -fArr[8]);
        } else {
            double d = -1.5707963267948966d;
            if (fArr[6] > 0.0f) {
                dArr[0] = Math.atan2(-fArr[1], fArr[4]);
                dArr[1] = Math.asin(fArr[7]);
                dArr[2] = -1.5707963267948966d;
            } else if (fArr[6] < 0.0f) {
                dArr[0] = Math.atan2(fArr[1], -fArr[4]);
                dArr[1] = -Math.asin(fArr[7]);
                dArr[1] = dArr[1] + (dArr[1] >= mto.a.GEO_NOT_SUPPORT ? -3.141592653589793d : 3.141592653589793d);
                dArr[2] = -1.5707963267948966d;
            } else {
                dArr[0] = Math.atan2(fArr[3], fArr[0]);
                if (fArr[7] > 0.0f) {
                    d = 1.5707963267948966d;
                }
                dArr[1] = d;
                dArr[2] = 0.0d;
            }
        }
        if (dArr[0] < mto.a.GEO_NOT_SUPPORT) {
            dArr[0] = dArr[0] + 6.283185307179586d;
        }
        return dArr;
    }

    private void b(float[] fArr, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fefa0bd", new Object[]{this, fArr, dArr});
            return;
        }
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.f, 0, 4);
            SensorManager.getRotationMatrixFromVector(this.g, this.f);
        } else {
            SensorManager.getRotationMatrixFromVector(this.g, fArr);
        }
        a(this.g, dArr);
        for (int i2 = 0; i2 < 3; i2++) {
            dArr[i2] = Math.toDegrees(dArr[i2]);
        }
    }

    private void a(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbab393e", new Object[]{this, fArr, fArr2});
        } else if (fArr == null || fArr2 == null || !SensorManager.getRotationMatrix(this.g, null, fArr, fArr2)) {
        } else {
            a(this.g, this.h);
            a(Math.toDegrees(this.h[0]), Math.toDegrees(this.h[1]), Math.toDegrees(this.h[2]));
        }
    }

    private t c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("1d2a8864", new Object[]{this});
        }
        t tVar = this.f2243a;
        if (tVar != null) {
            return tVar;
        }
        SensorManager sensorManager = (SensorManager) this.d.getSystemService("sensor");
        if (sensorManager != null) {
            this.f2243a = new u(sensorManager);
        }
        return this.f2243a;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.q = z;
        if (!z || this.p != m) {
            z2 = false;
        }
        this.r = z2;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.g == null) {
            this.g = new float[9];
        }
        if (this.h == null) {
            this.h = new double[3];
        }
        if (this.f != null) {
            return;
        }
        this.f = new float[4];
    }

    private boolean a(Set<Integer> set, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bc7fbcc", new Object[]{this, set, new Integer(i2), new Boolean(z)})).booleanValue();
        }
        HashSet<Integer> hashSet = new HashSet(set);
        hashSet.removeAll(this.n);
        if (hashSet.isEmpty()) {
            return true;
        }
        boolean z2 = false;
        for (Integer num : hashSet) {
            boolean a2 = a(num.intValue(), i2);
            if (!a2 && z) {
                a(hashSet);
                return false;
            } else if (a2) {
                this.n.add(num);
                z2 = true;
            }
        }
        return z2;
    }

    private void a(Iterable<Integer> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5a2571", new Object[]{this, iterable});
            return;
        }
        for (Integer num : iterable) {
            if (this.n.contains(num)) {
                c().a(this, num.intValue());
                this.n.remove(num);
            }
        }
    }

    private boolean a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        t c = c();
        if (c != null) {
            return c.a(this, i2, i3, e());
        }
        return false;
    }

    public void a(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d0ab16", new Object[]{this, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        ArrayList<a> arrayList = this.t;
        if (arrayList == null) {
            return;
        }
        try {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(d, d2, d3);
            }
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.h.a("[OrientationDetector] ", th);
        }
    }

    private Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a01d14da", new Object[]{this});
        }
        if (this.c == null) {
            this.b = new HandlerThread("DeviceOrientation");
            this.b.start();
            this.c = new Handler(this.b.getLooper());
        }
        return this.c;
    }
}
