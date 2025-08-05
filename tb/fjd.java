package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fjd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_HEALTHY_GAP = 1.0f;
    public static final float DEFAULT_HEALTH_BUFFER_LEVEL = 3.5f;
    public static final float DEFAULT_POOR_BUFFER_LEVEL = 3.0f;

    /* renamed from: a  reason: collision with root package name */
    public static float f27997a;
    public static float b;
    public static float c;
    public long d = 0;
    public int e;
    public int f;
    public int g;

    static {
        kge.a(1640050435);
        f27997a = 3.5f;
        b = 3.0f;
        c = 1.0f;
    }

    public fjd() {
        f27997a = 3.5f;
        b = 3.0f;
        c = 1.0f;
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.g > 95 || ((float) d()) >= f27997a * 1000.0f;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!a() || ((float) (SystemClock.elapsedRealtime() - this.d)) <= c * 1000.0f) {
            return false;
        }
        this.d = SystemClock.elapsedRealtime();
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g <= 95 && ((float) d()) <= b * 1000.0f;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : ((int) ((this.g / 100.0f) * this.f)) - this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreLoadHealthy{currentPosition=" + this.e + ", total=" + this.f + ", bufferPercent=" + this.g + '}';
    }
}
