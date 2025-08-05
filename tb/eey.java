package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.Map;

/* loaded from: classes4.dex */
public class eey implements j<edq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27256a;

    static {
        kge.a(-1095253247);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edq edqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edqVar}) : a(edqVar);
    }

    public eey(DetailCoreActivity detailCoreActivity) {
        this.f27256a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.dinamic.DinamicTapEventSubscriber");
    }

    public i a(edq edqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("14f12009", new Object[]{this, edqVar});
        }
        enf a2 = a();
        b bVar = this.f27256a.y().t.f10055a;
        if (a2 == null) {
            return i.FAILURE;
        }
        ActionModel a3 = a2.a(edqVar.a());
        if (a3 != null) {
            JSONObject jSONObject = a3.params;
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    entry.setValue(com.taobao.android.detail.core.utils.j.a(bVar.a(), entry.getValue()));
                }
            }
            Event a4 = ehs.a(this.f27256a, a3, bVar, null, null);
            if (a4 != null) {
                f.a(this.f27256a).a(a4);
            }
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private enf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enf) ipChange.ipc$dispatch("f0437e1", new Object[]{this});
        }
        end endVar = this.f27256a.y().h;
        if (endVar == null || endVar.b == null) {
            return null;
        }
        eng engVar = endVar.b;
        if (engVar.f27460a == null || engVar.f27460a.isEmpty()) {
            return null;
        }
        com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) engVar.f27460a.get(0);
        if (bVar.component == null) {
            return null;
        }
        return bVar.component.getProtocolManager();
    }
}
