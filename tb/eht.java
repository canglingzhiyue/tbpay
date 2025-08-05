package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import java.util.Map;

/* loaded from: classes4.dex */
public class eht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private egc f27314a = new egc();

    static {
        kge.a(307894728);
    }

    public eht() {
        emu.a("com.taobao.android.detail.core.open.event.EventRegister");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        i.b("EventRegister", "destroy");
        this.f27314a = null;
    }

    public void a(eon eonVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c62f", new Object[]{this, eonVar, new Integer(i)});
        } else {
            this.f27314a.a(eonVar, i);
        }
    }

    public Event a(ActionModel actionModel, b bVar, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Event) ipChange.ipc$dispatch("e14b476", new Object[]{this, actionModel, bVar, jSONObject, map}) : this.f27314a.a(actionModel, bVar, jSONObject, map);
    }

    public egc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (egc) ipChange.ipc$dispatch("16b5c29c", new Object[]{this}) : this.f27314a;
    }
}
