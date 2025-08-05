package com.taobao.android.interactive_sdk;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Nav.from(activity).toUri(str);
        }
    }
}
