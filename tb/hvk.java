package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.t;

/* loaded from: classes6.dex */
public class hvk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return t.a().a(context).a(Uri.parse(str));
        } catch (Throwable unused) {
            return false;
        }
    }
}
