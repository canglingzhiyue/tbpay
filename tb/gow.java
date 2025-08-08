package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;

/* loaded from: classes5.dex */
public abstract class gow implements gok {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bbz f28415a;

    static {
        kge.a(-948364832);
        kge.a(-343064666);
    }

    public static /* synthetic */ bbz a(gow gowVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("7e13f983", new Object[]{gowVar}) : gowVar.f28415a;
    }

    public gow(bbz bbzVar) {
        this.f28415a = bbzVar;
    }

    public void b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa83529", new Object[]{this, iDMComponent, iDMComponent2});
        } else if (iDMComponent == null || iDMComponent2 == null) {
        } else {
            a(iDMComponent, "reorderInGroup", gof.j(iDMComponent2), null);
        }
    }

    public void c(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98fd36a", new Object[]{this, iDMComponent, iDMComponent2});
        } else {
            a(iDMComponent, "joinIntoGroup", gof.j(iDMComponent2), gof.i(iDMComponent2));
        }
    }

    public void d(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887771ab", new Object[]{this, iDMComponent, iDMComponent2});
        } else {
            a(iDMComponent, "removeFromGroup", gof.j(iDMComponent2), gof.i(iDMComponent2));
        }
    }

    public void e(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575f0fec", new Object[]{this, iDMComponent, iDMComponent2});
        } else {
            a(iDMComponent, "reorderGroup", null, gof.i(iDMComponent2));
        }
    }

    private void a(IDMComponent iDMComponent, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a580ca", new Object[]{this, iDMComponent, str, str2, str3});
        } else if (iDMComponent == null) {
            bga.a.b("iCart", str, "DRAG_COMP_NULL", "dragComponent is null");
            UnifyLog.d("DragStructureRequest", "updateStructure|error|dragComponent is null");
        } else {
            Map<String, List<b>> eventMap = iDMComponent.getEventMap();
            if (eventMap == null) {
                bga.a.b("iCart", str, "DRAG_EVENT_MAP_NULL", "eventMap is null");
                UnifyLog.d("DragStructureRequest", "updateStructure|error|eventMap is null", iDMComponent.getKey());
                return;
            }
            List<b> list = eventMap.get("reorderGroupLongClick");
            if (list == null) {
                bga.a.b("iCart", str, "DRAG_GROUP_LONG_CLICK_NULL", "reorderGroupLongClick is null");
                UnifyLog.d("DragStructureRequest", "updateStructure|error|reorderGroupLongClick is null", iDMComponent.getKey());
                return;
            }
            b bVar = null;
            Iterator<b> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if ("reorderDrag".equals(next.getType())) {
                    bVar = next;
                    break;
                }
            }
            if (bVar == null) {
                return;
            }
            JSONObject fields = bVar.getFields();
            String h = bei.h(iDMComponent);
            String g = bei.g(iDMComponent);
            fields.put("type", (Object) str);
            fields.put("from", (Object) h);
            fields.put("fromBundleId", (Object) g);
            if (!StringUtils.isEmpty(str2)) {
                fields.put("to", (Object) str2);
            } else {
                fields.remove("to");
            }
            if (!StringUtils.isEmpty(str3)) {
                fields.put("toBundleId", (Object) str3);
            } else {
                fields.remove("toBundleId");
            }
            bmz I = this.f28415a.I();
            I.c("reorderGroupLongClick");
            I.a(iDMComponent);
            I.a(bVar);
            I.a(bVar.getType());
            bex.a(this.f28415a, String.format("Page_ShoppingCart_%s_reorderDrag", iDMComponent.getTag()), bex.a(fields));
            this.f28415a.b(iDMComponent, I, true, new jnv() { // from class: tb.gow.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    }
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                        return;
                    }
                    gow.a(gow.this).x().p().a(2);
                    bga.a.b("iCart", "updateStructureRequest", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    UnifyLog.d("DragStructureRequest", "updateStructureRequest|error|" + mtopResponse.getRetCode(), "|", mtopResponse.getRetMsg());
                }
            }, null);
        }
    }
}
