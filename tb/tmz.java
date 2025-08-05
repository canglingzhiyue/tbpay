package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.util.b;

/* loaded from: classes8.dex */
public class tmz extends ozg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static tmz d;
    private static int e;

    static {
        kge.a(-234119751);
    }

    private tmz() {
        int i;
        int i2 = 4;
        try {
            i = b.b(OrangeConfig.getInstance().getConfig("MediaLive", "maxWarmUpLiveNums", "4"));
        } catch (Throwable unused) {
            i = 4;
        }
        e = i >= 0 ? i : i2;
    }

    public static synchronized tmz g() {
        synchronized (tmz.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tmz) ipChange.ipc$dispatch("3d34e857", new Object[0]);
            }
            if (d == null) {
                tmz tmzVar = new tmz();
                d = tmzVar;
                tmzVar.f();
            }
            return d;
        }
    }

    @Override // tb.ozg
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : e;
    }

    @Override // tb.ozg
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f32508a != null) {
        } else {
            this.f32508a = new tmy(e);
        }
    }
}
