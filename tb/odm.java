package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.k;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;

/* loaded from: classes6.dex */
public class odm implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OrangeConfig f31951a = OrangeConfig.getInstance();

    static {
        kge.a(1064172556);
        kge.a(-143531169);
    }

    @Override // com.taobao.android.weex_framework.adapter.k
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : this.f31951a.getConfig(str, str2, str3);
    }

    @Override // com.taobao.android.weex_framework.adapter.k
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str}) : this.f31951a.getConfigs(str);
    }

    @Override // com.taobao.android.weex_framework.adapter.k
    public void a(final String str, final k.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278891a3", new Object[]{this, str, aVar});
        } else {
            this.f31951a.registerListener(new String[]{str}, new d() { // from class: tb.odm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str2, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str2, map});
                    } else if (!str2.equals(str)) {
                    } else {
                        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str2);
                        k.a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(configs);
                    }
                }
            }, true);
        }
    }
}
