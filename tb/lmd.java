package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes7.dex */
public class lmd extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HSETEXT = 4912396181747440332L;

    static {
        kge.a(-1060205274);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        BaseSectionModel<?> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar == null || lVar == null) {
            ldf.d("HSetExtAbility", "params invalid");
            return null;
        }
        DXRuntimeContext h = lVar.h();
        if (h == null || (b = lfq.b(h)) == null) {
            return null;
        }
        String c = dlhVar.c("key");
        if (StringUtils.isEmpty(c)) {
            ldf.d("HSetExtAbility", "key is empty");
            return null;
        }
        String c2 = dlhVar.c("value");
        b.getExt().put(c, (Object) c2);
        ldf.d("HSetExtAbility", "hSetExt key: " + c + " value: " + c2);
        return new dla();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-759112195);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lmd a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lmd) ipChange.ipc$dispatch("16bdad1f", new Object[]{this, obj}) : new lmd();
        }
    }
}
