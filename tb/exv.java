package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.factory.manager.a;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class exv extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27637a;
    public double b;
    public String c;
    public String d;
    public String e;
    public List<Event> f;
    public List<Event> g;

    static {
        kge.a(364530846);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 21004;
    }

    public exv(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f = new ArrayList();
        this.g = new ArrayList();
        a(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.navbar.NavBarItemViewModel");
    }

    private void a(ComponentModel componentModel, final NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c0c238", new Object[]{this, componentModel, nodeBundle});
        } else if (componentModel != null) {
            JSONObject jSONObject = componentModel.mapping;
            this.f27637a = jSONObject.getString("accessHint");
            this.b = jSONObject.getDoubleValue("titleSizeRatio");
            this.c = jSONObject.getString("value");
            this.d = jSONObject.getString("componentId");
            this.e = jSONObject.getString("positionKey");
            for (ActionModel actionModel : componentModel.actionModelList) {
                this.f.add(a.a().a(actionModel, nodeBundle));
            }
            JSONArray jSONArray = jSONObject.getJSONArray("secondActions");
            if (jSONArray == null || jSONArray.size() == 0) {
                return;
            }
            this.g = c.a(jSONArray, new g<Event>() { // from class: tb.exv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.trade.event.Event, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ Event b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public Event a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Event) ipChange2.ipc$dispatch("5ae8defa", new Object[]{this, obj}) : a.a().a(new ActionModel((JSONObject) obj), nodeBundle);
                }
            });
        }
    }
}
