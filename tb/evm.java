package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.RightsNode;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class evm implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27599a;
    public String b;

    static {
        kge.a(-1430311626);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20025;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public evm(JSONObject jSONObject) {
        tpc.a("com.taobao.android.detail.sdk.event.services.OpenServicesEvent");
        if (jSONObject == null) {
            return;
        }
        this.f27599a = c.a(jSONObject.getString("params"));
        this.b = c.a(jSONObject.getString("passValue"));
        a(jSONObject);
    }

    private ArrayList<RightsNode.RightItem> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6b48cb62", new Object[]{this, jSONObject}) : c.a(jSONObject.getJSONArray("items"), new g<RightsNode.RightItem>() { // from class: tb.evm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.RightsNode$RightItem, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ RightsNode.RightItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RightsNode.RightItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RightsNode.RightItem) ipChange2.ipc$dispatch("3d28e86a", new Object[]{this, obj}) : new RightsNode.RightItem((JSONObject) obj);
            }
        });
    }
}
