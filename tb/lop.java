package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes7.dex */
public class lop extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long POPTABSWITCHEVENT = -215576173690112021L;

    static {
        kge.a(-532990645);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar.h() == null) {
            return new dkw(new dkv(30000, "runtimeContext为空"), true);
        }
        return new dla();
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(485069090);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lop a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lop) ipChange.ipc$dispatch("16bdb615", new Object[]{this, obj}) : new lop();
        }
    }
}
