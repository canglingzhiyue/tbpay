package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class eez implements j<edr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27257a;

    static {
        kge.a(-1160948849);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edr edrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edrVar}) : a(edrVar);
    }

    public eez(DetailCoreActivity detailCoreActivity) {
        this.f27257a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.dinamic.UpdateComponentSubscriber");
    }

    public i a(edr edrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2898f38a", new Object[]{this, edrVar});
        }
        if (edrVar.f27215a.params == null) {
            return i.FAILURE;
        }
        String string = edrVar.f27215a.params.getString("target");
        JSONObject jSONObject = edrVar.f27215a.params.getJSONObject("data");
        if (StringUtils.isEmpty(string) || jSONObject == null) {
            return i.FAILURE;
        }
        g a2 = n.a(this.f27257a);
        if (a2 == null) {
            return i.FAILURE;
        }
        return a2.a(string, jSONObject) ? i.SUCCESS : i.FAILURE;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
