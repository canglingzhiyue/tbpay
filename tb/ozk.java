package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.util.b;

/* loaded from: classes8.dex */
public class ozk extends ozg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ozk d;
    private static int e;

    static {
        kge.a(1293121572);
    }

    private ozk() {
        int i;
        int i2 = 4;
        try {
            i = b.b(OrangeConfig.getInstance().getConfig("MediaLive", "maxPlayerNums", "2"));
        } catch (Throwable unused) {
            i = 4;
        }
        if (i <= 4 && i >= 0) {
            i2 = i;
        }
        e = i2;
    }

    public static synchronized ozk g() {
        synchronized (ozk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ozk) ipChange.ipc$dispatch("3d32d178", new Object[0]);
            }
            if (d == null) {
                ozk ozkVar = new ozk();
                d = ozkVar;
                ozkVar.f();
            }
            return d;
        }
    }

    @Override // tb.ozg
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f32508a != null) {
        } else {
            this.f32508a = new ozj(e);
        }
    }

    @Override // tb.ozg
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : e;
    }
}
