package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter;

/* loaded from: classes4.dex */
public class epq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(562474873);
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.NavUtils");
    }

    public static void a(Context context, String str) {
        INavAdapter f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null || TextUtils.isEmpty(str) || (f = epj.f()) == null) {
        } else {
            f.navigateTo(context, str, null);
        }
    }

    public static void a(Context context, String str, int i) {
        INavAdapter f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if (context == null || TextUtils.isEmpty(str) || (f = epj.f()) == null) {
        } else {
            f.navigateTo(context, str, null, i);
        }
    }

    public static void a(Context context, String str, Bundle bundle) {
        INavAdapter f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{context, str, bundle});
        } else if (context == null || TextUtils.isEmpty(str) || (f = epj.f()) == null) {
        } else {
            f.navigateTo(context, str, bundle);
        }
    }
}
