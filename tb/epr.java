package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IShareAdapter;
import com.taobao.android.detail.datasdk.protocol.model.share.ShareModel;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class epr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(198442877);
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.ShareUtils");
    }

    private static IShareAdapter a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IShareAdapter) ipChange.ipc$dispatch("8fc3023b", new Object[]{context}) : epj.g();
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        IShareAdapter a2 = a(context);
        if (context == null) {
            return;
        }
        a2.copyToClipBoard(context, str, str2);
    }

    public static void a(Activity activity, ShareModel shareModel, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa07779", new Object[]{activity, shareModel, hashMap});
            return;
        }
        IShareAdapter a2 = a(activity);
        if (activity == null) {
            return;
        }
        a2.shareItem(activity, shareModel, hashMap);
    }
}
