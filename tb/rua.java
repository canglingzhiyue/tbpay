package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;

/* loaded from: classes9.dex */
public class rua implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ syk f33382a;

    static {
        kge.a(528536395);
        kge.a(-1209827241);
    }

    public rua(syk sykVar) {
        this.f33382a = sykVar;
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        try {
            syk.a(this.f33382a, "normal_switch", OrangeConfig.getInstance().getConfig("keepalive", "normal_switch", "true"));
            syk.a(this.f33382a, "adj_adjust_range", OrangeConfig.getInstance().getConfig("keepalive", "adj_adjust_range", ""));
            syk.a(this.f33382a, "adj_adjust_radical_range", OrangeConfig.getInstance().getConfig("keepalive", "adj_adjust_radical_range", "40-40"));
            syk.a(this.f33382a, "prevent_rt_kill_receiver_range", OrangeConfig.getInstance().getConfig("keepalive", "prevent_rt_kill_receiver_range", ""));
            syk.a(this.f33382a, "account_sync_range", OrangeConfig.getInstance().getConfig("keepalive", "account_sync_range", "36-36"));
            syk.a(this.f33382a, "recent_entrance_range", OrangeConfig.getInstance().getConfig("keepalive", "recent_entrance_range", "38-38"));
            syk.a(this.f33382a, "reduce_account_range", OrangeConfig.getInstance().getConfig("keepalive", "reduce_account_range", "39-39"));
            syk.a(this.f33382a, "prevent_rt_kill_receiver_delay", OrangeConfig.getInstance().getConfig("keepalive", "prevent_rt_kill_receiver_delay", "20"));
            syk.a(this.f33382a, "r_e_kill_delay", OrangeConfig.getInstance().getConfig("keepalive", "r_e_kill_delay", "2880"));
        } catch (Exception e) {
            rty.f33380a.b("RemoteConfig", "[onConfigUpdate] error.", null, e);
        }
    }
}
