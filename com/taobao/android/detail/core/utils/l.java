package com.taobao.android.detail.core.utils;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9939a;

    static {
        kge.a(-1400026645);
        f9939a = null;
        emu.a("com.taobao.android.detail.core.utils.GrayUtils");
    }

    public static boolean a() {
        String str;
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0]);
        } else {
            if (f9939a == null) {
                try {
                    str = Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
                } catch (Exception e) {
                    i.a("GrayUtils", "isGrayVersion:" + Log.getStackTraceString(e));
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                if (str.split("\\.").length == 4) {
                    z = true;
                }
                f9939a = Boolean.valueOf(z);
            }
            bool = f9939a;
        }
        return bool.booleanValue();
    }
}
