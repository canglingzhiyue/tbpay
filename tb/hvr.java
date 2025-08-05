package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.order.bundle.widget.recycle.b;

/* loaded from: classes6.dex */
public class hvr extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BINDINGXSCROLLANIMINIT = "-7119874910818693679";

    /* renamed from: a  reason: collision with root package name */
    private b f28816a;

    static {
        kge.a(-341648777);
    }

    public static /* synthetic */ b a(hvr hvrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3504c6bd", new Object[]{hvrVar}) : hvrVar.f28816a;
    }

    public hvr(b bVar) {
        this.f28816a = bVar;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar != null) {
            final JSONObject c = dlhVar.c();
            if (this.f28816a != null && lVar != null && lVar.i() != null) {
                lVar.i().post(new Runnable() { // from class: tb.hvr.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            hvr.a(hvr.this).a(c);
                        }
                    }
                });
            }
        }
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f28818a;

        static {
            kge.a(1755269710);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public a(b bVar) {
            this.f28818a = bVar;
        }

        public hvr a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvr) ipChange.ipc$dispatch("16bbff1e", new Object[]{this, obj}) : new hvr(this.f28818a);
        }
    }
}
