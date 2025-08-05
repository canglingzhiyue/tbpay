package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.util.b;

/* loaded from: classes8.dex */
public class ozm extends ozg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ozm d;
    private static volatile int e;
    private static volatile int f;

    static {
        kge.a(1941268143);
    }

    private ozm() {
        int i;
        if (Build.VERSION.SDK_INT < 19) {
            e = 2;
            return;
        }
        int i2 = 4;
        try {
            i = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", "maxPlayerNums", "4"));
        } catch (Throwable unused) {
            i = 4;
        }
        if (i <= 4 && i >= 0) {
            i2 = i;
        }
        e = i2;
        f = i2;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21 || e == i) {
        } else {
            e = i;
            this.f32508a.resize(i);
        }
    }

    @Override // tb.ozg
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : e;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : f;
    }

    public static synchronized ozm h() {
        synchronized (ozm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ozm) ipChange.ipc$dispatch("44e47715", new Object[0]);
            }
            if (d == null) {
                ozm ozmVar = new ozm();
                d = ozmVar;
                ozmVar.f();
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
            this.f32508a = new ozl(e);
        }
    }
}
