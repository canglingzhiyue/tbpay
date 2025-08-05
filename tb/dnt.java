package tb;

import com.alibaba.android.ultron.event.ext.s;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class dnt extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DAMUPDATECOMPONENT = "-4159790982239500966";

    static {
        kge.a(-394675089);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXRuntimeContext h;
        final bny b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        dla dlaVar = new dla();
        if (lVar == null || dlhVar == null || !(dlhVar.f("updateFields") instanceof JSONObject) || (b = Util.b((h = lVar.h()))) == null) {
            return dlaVar;
        }
        Object a2 = h.a();
        if (a2 instanceof Map) {
            final Object obj = ((Map) a2).get(d.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj instanceof IDMComponent) {
                if ("false".equals(dlhVar.c(s.FIELD_KEY_NEED_MERGE))) {
                    ((IDMComponent) obj).getFields().clear();
                }
                if (h.s() == null) {
                    return dlaVar;
                }
                Util.a(((IDMComponent) obj).getFields(), (JSONObject) dlhVar.f("updateFields"));
                h.s().post(new Runnable() { // from class: tb.dnt.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(obj);
                        try {
                            b.a(arrayList);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
        return dlaVar;
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-145705914);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public dnt a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dnt) ipChange.ipc$dispatch("16ba0fd8", new Object[]{this, obj}) : new dnt();
        }
    }
}
