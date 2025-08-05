package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.extension.UCExtension;

/* loaded from: classes5.dex */
public class gry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e9f77", new Object[]{activity, intent});
        } else if (intent == null || activity == null) {
        } else {
            if (intent.getFlags() == 33554432) {
                Nav.from(activity).withCategory(mbn.BROWSER_ONLY_CATEGORY).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).skipPreprocess().disableTransition().disallowLoopback().toUri(intent.getData());
            } else {
                Nav.from(activity).withCategory(mbn.BROWSER_ONLY_CATEGORY).skipPreprocess().disableTransition().disallowLoopback().toUri(intent.getData());
            }
        }
    }
}
