package com.alibaba.triver.bundle.nav;

import android.content.Context;
import android.net.Uri;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-761383120);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null && parse.isHierarchical()) {
                if (!b.a(parse) && !b.c(parse)) {
                    return false;
                }
                Nav.from(context).allowEscape().toUri(parse);
                return true;
            }
            return false;
        } catch (Throwable th) {
            RVLogger.e("TriverBrowserHook", "not hierarchical uri", th);
            return false;
        }
    }
}
