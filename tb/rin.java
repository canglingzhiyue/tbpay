package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.vpm.adapter.IConfigAdapter;
import com.taobao.vpm.utils.VPMConstant;

/* loaded from: classes9.dex */
public class rin implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.vpm.adapter.IConfigAdapter
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3}) : TextUtils.isEmpty(str) ? OrangeConfig.getInstance().getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, str2, str3) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
