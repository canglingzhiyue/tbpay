package tb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes8.dex */
public final class nuc implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f31766a;
    private long b;
    private rul<? super SensorEvent, t> c;
    private rul<? super Integer, t> d;

    static {
        kge.a(1928154343);
        kge.a(499746989);
    }

    public nuc() {
        this(null, null, 3, null);
    }

    public nuc(rul<? super SensorEvent, t> rulVar, rul<? super Integer, t> rulVar2) {
        this.c = rulVar;
        this.d = rulVar2;
        this.f31766a = 200L;
    }

    public /* synthetic */ nuc(rul rulVar, rul rulVar2, int i, o oVar) {
        this((i & 1) != 0 ? null : rulVar, (i & 2) != 0 ? null : rulVar2);
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f31766a;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 0) {
            j = 200;
        }
        this.f31766a = j;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        rul<? super SensorEvent, t> rulVar = this.c;
        if (rulVar == null || sensorEvent == null || rulVar == null || (fArr = sensorEvent.values) == null || fArr.length < 3) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b < this.f31766a) {
            return;
        }
        rul<? super SensorEvent, t> rulVar2 = this.c;
        if (rulVar2 == null) {
            q.a();
        }
        rulVar2.mo2421invoke(sensorEvent);
        this.b = currentTimeMillis;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            return;
        }
        rul<? super Integer, t> rulVar = this.d;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke(Integer.valueOf(i));
    }
}
