package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.util.b;

/* loaded from: classes8.dex */
public class ozi extends ozg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ozi d;
    private static int e;

    static {
        kge.a(497449891);
    }

    private ozi() {
        int i;
        int i2 = 4;
        try {
            i = b.b(OrangeConfig.getInstance().getConfig("MediaLive", "maxPlayerNums", "4"));
        } catch (Throwable unused) {
            i = 4;
        }
        if (i <= 4 && i >= 0) {
            i2 = i;
        }
        e = i2;
    }

    public static synchronized ozi g() {
        synchronized (ozi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ozi) ipChange.ipc$dispatch("3d32d13a", new Object[0]);
            }
            if (d == null) {
                ozi oziVar = new ozi();
                d = oziVar;
                oziVar.f();
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
            this.f32508a = new ozh(e);
        }
    }

    @Override // tb.ozg
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : e;
    }
}
