package com.taobao.android.auth;

import android.app.Activity;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTH_BROWSER = "auth_browser";
    public static final String AUTH_INNER = "auth_inner";
    public static final String BAICHUAN_SKIP = "sso_auth";
    public static final String QUESTION = "?";

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else {
            Toast.makeText(activity, "非法的回调地址", 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0186 A[Catch: all -> 0x0146, Exception -> 0x014b, TRY_LEAVE, TryCatch #4 {Exception -> 0x014b, blocks: (B:15:0x00a4, B:29:0x00fe, B:35:0x015a, B:37:0x0186, B:28:0x00fb, B:34:0x0150, B:54:0x0202, B:59:0x0252, B:58:0x024f, B:60:0x02a0, B:62:0x02b2, B:63:0x02b5, B:65:0x02c0, B:67:0x02c6), top: B:102:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r20, android.app.Activity r21) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.auth.b.a(java.lang.String, android.app.Activity):void");
    }
}
