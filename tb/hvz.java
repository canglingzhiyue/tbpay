package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes6.dex */
public final class hvz extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "-5756070486399014857";

    /* renamed from: a  reason: collision with root package name */
    private final hwa f28822a = new hwa();

    static {
        kge.a(-1836725187);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar == null) {
            return new dla();
        }
        if (lVar.a() == null || dlhVar == null) {
            return new dla();
        }
        this.f28822a.a();
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(653202964);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvz a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvz) ipChange.ipc$dispatch("16bc0016", new Object[]{this, obj}) : new hvz();
        }
    }
}
