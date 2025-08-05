package tb;

import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.d;
import com.taobao.rxm.schedule.a;
import com.taobao.rxm.schedule.b;
import com.taobao.rxm.schedule.e;
import com.taobao.rxm.schedule.j;
import com.taobao.rxm.schedule.k;
import com.taobao.rxm.schedule.l;
import com.taobao.rxm.schedule.m;
import com.taobao.rxm.schedule.n;

/* loaded from: classes.dex */
public class nin implements d, k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean h;

    /* renamed from: a  reason: collision with root package name */
    private final j f31486a;
    private l b;
    private j c;
    private j d;
    private boolean e;
    private final int f;
    private final int g;

    static {
        kge.a(-1977388768);
        kge.a(1012312362);
        kge.a(-465947178);
        h = true;
    }

    public nin() {
        this(null, 3, 6, 8, 5, 1500, 3, 5, 2, -1);
    }

    public nin(j jVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(jVar, i, i2, i3, i4, i5, i6, i7, i8, -1);
    }

    public nin(j jVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(jVar, i, i2, i3, i4, i5, i6, i7, i8, i9, false);
    }

    public nin(j jVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        this(jVar, i, i2, i3, i4, i5, i6, i7, i8, i9, z, true);
    }

    public nin(j jVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2) {
        if (jVar == null || z) {
            this.f31486a = new b("Phenix-Scheduler", i, i2, i3, i4, i5);
        } else {
            this.f31486a = new com.taobao.rxm.schedule.d(jVar, i2, i4, i5);
        }
        this.f = i7;
        this.g = i8;
        if (i9 > 0) {
            this.b = new e(this.f31486a, this.f, i9, z);
        } else {
            this.b = new a(this.f31486a, this.f);
        }
        if (z && !z2) {
            this.c = this.f31486a;
        } else {
            this.c = new a(this.f31486a, i6);
        }
    }

    @Override // com.taobao.phenix.loader.network.d
    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.e == z) {
            Object[] objArr = new Object[1];
            objArr[0] = z ? "SLOW" : "FAST";
            niw.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed not changed, still %s", objArr);
        } else {
            if (z) {
                niw.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed changed from FAST to SLOW", new Object[0]);
                this.b.a(this.g);
            } else {
                niw.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed changed from SLOW to FAST", new Object[0]);
                this.b.a(this.f);
            }
            this.e = z;
        }
    }

    @Override // com.taobao.rxm.schedule.k
    public j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("b23c38ac", new Object[]{this}) : this.f31486a;
    }

    @Override // com.taobao.rxm.schedule.k
    public j b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("c72500ed", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.rxm.schedule.k
    public j c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dc0dc92e", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.rxm.schedule.k
    public j d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("f0f6916f", new Object[]{this}) : this.f31486a;
    }

    @Override // com.taobao.rxm.schedule.k
    public j e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("5df59b0", new Object[]{this});
        }
        if (this.d == null) {
            this.d = h ? new n() : new m();
        }
        return this.d;
    }
}
