package tb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class iwp implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f29380a;
    private Sensor b;
    private Sensor c;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private boolean h;
    private a i;
    private final AtomicBoolean j;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f29384a;
        public double b;
        public double c;

        static {
            kge.a(1356966848);
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final iwp f29385a;

        static {
            kge.a(-1293920976);
            f29385a = new iwp();
        }

        public static /* synthetic */ iwp a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (iwp) ipChange.ipc$dispatch("f062c5c", new Object[0]) : f29385a;
        }
    }

    static {
        kge.a(1298073181);
        kge.a(499746989);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public static /* synthetic */ void a(iwp iwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee829e96", new Object[]{iwpVar});
        } else {
            iwpVar.f();
        }
    }

    public static /* synthetic */ void a(iwp iwpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d1e6fe", new Object[]{iwpVar, new Boolean(z)});
        } else {
            iwpVar.a(z);
        }
    }

    public static /* synthetic */ boolean b(iwp iwpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd05a51b", new Object[]{iwpVar})).booleanValue() : iwpVar.h;
    }

    private iwp() {
        this.f = new float[3];
        this.g = new float[3];
        this.h = false;
        this.i = new a();
        this.j = new AtomicBoolean();
    }

    public static final iwp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iwp) ipChange.ipc$dispatch("f062c5c", new Object[0]) : b.a();
    }

    public void b() {
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.j.compareAndSet(false, true) || (d = d()) < 0) {
        } else {
            this.f29380a = (SensorManager) d.b().getSystemService("sensor");
            this.b = this.f29380a.getDefaultSensor(1);
            this.c = this.f29380a.getDefaultSensor(2);
            i.a(new i.a() { // from class: tb.iwp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        iwp.a(iwp.this);
                    }
                }
            }, d);
        }
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("29e7ce3d", new Object[]{this}) : this.i;
    }

    private int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : com.taobao.android.behavix.behavixswitch.a.a("motionTrackDelay", 5000);
    }

    private int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : com.taobao.android.behavix.behavixswitch.a.a("motionTrackInterval", 30000);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f29380a.registerListener(this, this.b, 2);
        this.f29380a.registerListener(this, this.c, 2);
        i.a(new i.a() { // from class: tb.iwp.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.behavix.utils.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (iwp.b(iwp.this)) {
                } else {
                    iwp.a(iwp.this, false);
                }
            }
        }, 10000L);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f29380a.unregisterListener(this, this.b);
        this.f29380a.unregisterListener(this, this.c);
        this.h = false;
        if (!z) {
            return;
        }
        i.a(new i.a() { // from class: tb.iwp.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.behavix.utils.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    iwp.a(iwp.this);
                }
            }
        }, e());
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        if (sensorEvent.sensor.getType() == 1) {
            this.d = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 2) {
            this.e = sensorEvent.values;
        }
        float[] fArr2 = this.d;
        if (fArr2 == null || (fArr = this.e) == null) {
            return;
        }
        float[] fArr3 = new float[3];
        float[] fArr4 = new float[9];
        if (!SensorManager.getRotationMatrix(fArr4, null, fArr2, fArr)) {
            return;
        }
        SensorManager.getOrientation(fArr4, fArr3);
        a aVar = new a();
        aVar.f29384a = Math.round(Math.toDegrees(fArr3[0]));
        aVar.b = -Math.round(Math.toDegrees(fArr3[1]));
        aVar.c = Math.round(Math.toDegrees(fArr3[2]));
        this.i = aVar;
        this.h = true;
        a(true);
    }
}
