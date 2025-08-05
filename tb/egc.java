package tb;

import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.factory.manager.a;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class egc extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<Pair<Integer, eon>> b = new ArrayList<>();

    static {
        kge.a(-2077051176);
    }

    public egc() {
        emu.a("com.taobao.android.detail.core.factory.impl.EventFactoryManager");
    }

    public void a(eon eonVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c62f", new Object[]{this, eonVar, new Integer(i)});
        } else {
            a(eonVar, i, this.b);
        }
    }

    @Override // com.taobao.android.detail.datasdk.factory.manager.a
    public Event a(ActionModel actionModel, b bVar, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("e14b476", new Object[]{this, actionModel, bVar, jSONObject, map});
        }
        for (int size = this.b.size() - 1; size >= 0; size--) {
            Event a2 = ((eon) this.b.get(size).second).a(actionModel, bVar, jSONObject, map);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
