package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes7.dex */
public class mfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null || pro.e(str)) {
        } else {
            Nav.from(context).toUri(str.trim());
        }
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if (context == null || pro.e(str)) {
        } else {
            Nav from = Nav.from(context);
            if (i != -1) {
                from.forResult(i);
            }
            from.toUri(str.trim());
        }
    }

    public static void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{context, str, bundle});
        } else if (context == null || pro.e(str)) {
        } else {
            Nav.from(context).withExtras(bundle).toUri(str.trim());
        }
    }
}
