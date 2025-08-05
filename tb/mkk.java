package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class mkk extends mkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long b;
    private final mkx c;
    private final boolean d;
    private final long e;
    private long f;

    public mkk(int i, Map<String, ?> map, mkx mkxVar, long j, boolean z, long j2) {
        super(i, map);
        this.c = mkxVar;
        this.e = j;
        this.d = z;
        this.b = j2;
    }

    public mkx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mkx) ipChange.ipc$dispatch("16b97723", new Object[]{this}) : this.c;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BatteryCapacityCollectResult{collectTime=" + this.b + ", typedOperation=" + this.c + ", isCharging=" + this.d + ", chargeCounter=" + this.e + ", currentNow=" + this.f + '}';
    }
}
