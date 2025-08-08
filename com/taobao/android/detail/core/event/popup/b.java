package com.taobao.android.detail.core.event.popup;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ehs;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActionModel f9725a;
    public Map<String, Object> b;
    public List<IDMComponent> c;

    static {
        kge.a(-1993867163);
    }

    public b(ActionModel actionModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject, Map<String, Object> map) {
        com.taobao.android.ultron.common.model.b a2;
        this.f9725a = actionModel;
        this.b = map;
        if (map != null && (a2 = a((com.taobao.android.detail.datasdk.model.viewmodel.main.b) map.get(ehs.EVENT_EXTRA_VIEWMODEL), (JSONArray) map.get(ehs.EVENT_EXTRA_EVENT_SRC))) != null) {
            this.c = a2.getComponents();
        }
        emu.a("com.taobao.android.detail.core.event.popup.OpenPopupWindowEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.c;
    }

    private com.taobao.android.ultron.common.model.b a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar, JSONArray jSONArray) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("8d52742d", new Object[]{this, bVar, jSONArray});
        }
        if (bVar == null || jSONArray == null || bVar.dmComponent == null || bVar.dmComponent == null) {
            return null;
        }
        Iterator<Map.Entry<String, Object>> it = bVar.dmComponent.getEvents().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (next.getValue().equals(jSONArray)) {
                str = next.getKey();
                break;
            }
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        for (com.taobao.android.ultron.common.model.b bVar2 : bVar.dmComponent.getEventMap().get(str)) {
            if (bVar2.getType().equals(this.f9725a.type)) {
                return bVar2;
            }
        }
        return null;
    }
}
