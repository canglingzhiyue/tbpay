package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes6.dex */
public class hty implements ddc, ddh, ddi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(942023001);
        kge.a(893314682);
        kge.a(-596762178);
        kge.a(-802537112);
    }

    @Override // tb.ddc
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    @Override // tb.ddh
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // tb.ddh
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }
}
