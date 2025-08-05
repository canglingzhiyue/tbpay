package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fda extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27816a;
    public String b;

    static {
        kge.a(1965964587);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fda(JSONObject jSONObject) {
        emu.a("com.taobao.android.detail.wrapper.ext.event.services.OpenServicesEvent");
        if (jSONObject == null) {
            return;
        }
        this.f27816a = epw.a(jSONObject.getString("params"));
        this.b = epw.a(jSONObject.getString("passValue"));
        a(jSONObject);
    }

    private ArrayList<RightsNode.b> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6b48cb62", new Object[]{this, jSONObject}) : epw.a(jSONObject.getJSONArray("items"), new epy<RightsNode.b>() { // from class: tb.fda.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode$b] */
            @Override // tb.epy
            public /* synthetic */ RightsNode.b b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RightsNode.b a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RightsNode.b) ipChange2.ipc$dispatch("8626ab91", new Object[]{this, obj}) : new RightsNode.b((JSONObject) obj);
            }
        });
    }
}
