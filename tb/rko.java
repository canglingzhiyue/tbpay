package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.core.f;
import com.taobao.zcache.s;

@Deprecated
/* loaded from: classes9.dex */
public class rko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rko f33208a;

    static {
        kge.a(430763679);
    }

    public static rko a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rko) ipChange.ipc$dispatch("f0a1688", new Object[0]);
        }
        if (f33208a == null) {
            synchronized (rko.class) {
                if (f33208a == null) {
                    f33208a = new rko();
                }
            }
        }
        return f33208a;
    }

    public void a(final rkn rknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd343963", new Object[]{this, rknVar});
        } else {
            f.a(new s() { // from class: tb.rko.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.zcache.s
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else {
                        rknVar.firstUpdateCount(i);
                    }
                }
            }, true);
        }
    }
}
