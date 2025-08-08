package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public class hvv extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPDATEMAPAREAHEIGHT = "472344406834477190";

    /* renamed from: a  reason: collision with root package name */
    private final String f28821a = "UpdateMapHeight";

    static {
        kge.a(444905006);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        JSONObject jSONObject = null;
        if (dlhVar != null && dlhVar.c() != null && lVar != null) {
            JSONObject c = dlhVar.c();
            String string = c.getString("height");
            String string2 = c.getString("nodeUserId");
            String string3 = c.getString("showLabel");
            if (StringUtils.isEmpty(string2)) {
                return new dla(null);
            }
            try {
                DXWidgetNode queryWidgetNodeByUserId = lVar.h().s().getFlattenWidgetNode().queryWidgetNodeByUserId(string2);
                if (queryWidgetNodeByUserId instanceof bwy) {
                    try {
                        if (!StringUtils.isEmpty(string)) {
                            int a2 = gbg.a(lVar.a(), Float.parseFloat(string));
                            if (a2 > 0) {
                                ((bwy) queryWidgetNodeByUserId).a(a2);
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("yOffset", (Object) string);
                                jSONObject = jSONObject2;
                            } catch (Throwable th) {
                                th = th;
                                jSONObject = jSONObject2;
                                hyn.a("UpdateMapHeight", "updateMapRect-error", th.toString());
                                hyq.c(lVar.a(), "UpdateMapHeight", "UpdateMapArea", "UpdateMapArea-error", th.toString(), null);
                                return new dla(jSONObject);
                            }
                        }
                        ((bwy) queryWidgetNodeByUserId).a(!"false".equals(string3));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (NullPointerException e) {
                hyn.a("UpdateMapHeight", "updateMapRect-NullPointer", e.toString());
                return new dla(null);
            }
        }
        return new dla(jSONObject);
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1369342203);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvv a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvv) ipChange.ipc$dispatch("16bbff9a", new Object[]{this, obj}) : new hvv();
        }
    }
}
