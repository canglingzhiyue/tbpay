package com.taobao.tao.navigation;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaobaoApplication;
import tb.omr;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_KEY_CLICK_TO_TAB_CHANGE = "CLICK_TO_TAB_CHANGE";
    public static final String EXTRA_REFERRER = "referrer";

    private static <T> T a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9798556e", new Object[]{obj}) : obj;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "uikit_navigation";
    }

    public static void a(Fragment fragment, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68c8cb0", new Object[]{fragment, str, new Long(j)});
        } else if (fragment == null) {
        } else {
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                try {
                    fragment.setArguments(arguments);
                } catch (IllegalStateException unused) {
                    omr.a("saveTimeIntoFragmentArgs", "IllegalStateException");
                }
            }
            if (arguments.getLong(str, -1L) != -1) {
                return;
            }
            arguments.putLong(str, j);
        }
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[0]) : (Context) a(TaobaoApplication.sApplication);
    }
}
