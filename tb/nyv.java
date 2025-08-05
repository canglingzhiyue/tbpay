package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes8.dex */
public class nyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-43333339);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && (nyo.f31844a.equals(str) || nyo.b.equals(str) || OrangeConfig.getInstance().getConfig("android_share", "DetailPageActivitys", "").contains(str));
    }
}
