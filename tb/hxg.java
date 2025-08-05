package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes6.dex */
public class hxg extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORDERIMAGELOADCOMPLETE = "6062322397365941454";

    /* renamed from: a  reason: collision with root package name */
    private final ria f28828a;

    static {
        kge.a(601199823);
    }

    public hxg(ria riaVar) {
        this.f28828a = riaVar;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        ria riaVar = this.f28828a;
        if (riaVar == null) {
            return new dla();
        }
        riaVar.a();
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ria f28829a;

        static {
            kge.a(-16896858);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public a(ria riaVar) {
            this.f28829a = riaVar;
        }

        public hxg a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hxg) ipChange.ipc$dispatch("16bc054b", new Object[]{this, obj}) : new hxg(this.f28829a);
        }
    }
}
