package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes6.dex */
public class hzr extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ULTRONSEARCHTABCLICKV2 = "729864536986042405";

    /* renamed from: a  reason: collision with root package name */
    private hzp f28869a;

    static {
        kge.a(-563160352);
    }

    public hzr(hzp hzpVar) {
        this.f28869a = hzpVar;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        hzp hzpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        JSONObject c = dlhVar == null ? null : dlhVar.c();
        if (c != null && (hzpVar = this.f28869a) != null) {
            hzpVar.a(c);
        }
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private hzp f28870a;

        static {
            kge.a(-1619209801);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public a(hzp hzpVar) {
            this.f28870a = hzpVar;
        }

        public hzr a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hzr) ipChange.ipc$dispatch("16bc0e22", new Object[]{this, obj}) : new hzr(this.f28870a);
        }
    }
}
