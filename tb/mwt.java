package tb;

import android.taobao.windvane.config.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.f;

/* loaded from: classes2.dex */
public class mwt implements qfx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-880528057);
        kge.a(982079623);
    }

    @Override // tb.qfx
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : f.a(a.f, false);
    }

    @Override // tb.qfx
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : f.b(a.f, false);
    }
}
