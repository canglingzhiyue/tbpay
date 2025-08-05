package com.taobao.android.detail.core.performance.preload;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eiq;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT = "";
    public static final String FINAL_ULTRON = "final";
    public static final String INDUSTRY = "industry";
    public static final String OLD = "1.0";
    public static final String ULTRON = "2.0";

    static {
        kge.a(1854347109);
        emu.a("com.taobao.android.detail.core.performance.preload.DetailProtocolVersion");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return eiq.b(str);
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        int b = b(str);
        return b != -1 && b(str2) > b;
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if ("".equals(str)) {
            return 0;
        }
        if ("1.0".equals(str)) {
            return 1;
        }
        if ("2.0".equals(str)) {
            return 2;
        }
        return (FINAL_ULTRON.equals(str) || "industry".equals(str)) ? 3 : -1;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        return (FINAL_ULTRON.equals(str) || "industry".equals(str)) && "2.0".equals(str2);
    }
}
