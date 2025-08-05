package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jrx;
import tb.jry;

/* loaded from: classes6.dex */
public class jsb implements jrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static final jrw DEFAULT;

        static {
            kge.a(-1416237720);
            DEFAULT = new jsb();
        }
    }

    static {
        kge.a(1616206416);
        kge.a(1811067990);
    }

    private jsb() {
    }

    @Override // tb.jrw
    public jrx bO_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jrx) ipChange.ipc$dispatch("10f974dd", new Object[]{this}) : new jrx.a().b(true).c(true).a(true).a(81).b(56).a();
    }

    @Override // tb.jrw
    public jry b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jry) ipChange.ipc$dispatch("16b8346c", new Object[]{this}) : new jry.a().a();
    }
}
