package android.taobao.windvane.extra.config;

import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import tb.kge;

/* loaded from: classes2.dex */
public class TBConfigListenerV1 implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-264114135);
        kge.a(-498751155);
    }

    @Override // com.taobao.orange.g
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            m.b("TBConfigReceiver", "ConfigName: " + str + " isFromLocal:" + z);
            if (!str.equalsIgnoreCase("WindVane")) {
                return;
            }
            l.b = OrangeConfig.getInstance().getConfig("WindVane", "enableGetParamByJs", "0").equals("1");
        }
    }
}
