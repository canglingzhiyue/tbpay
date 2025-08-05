package com.taobao.android.fluid.framework.hostcontainer.pageinterface.page;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(170996796);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "transferAnimationEnable", "false"));
        } catch (Throwable th) {
            TLog.loge("FullPageConfig", "isTransferAnimationEnabled error", th);
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isPullLeftPersonalEnabled", "false"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : a(str, OrangeConfig.getInstance().getConfig("ShortVideo", "ggSourceList", "[\"guangguang\",\"guangguang_follow\"]"));
    }

    private static boolean a(String str, String str2) {
        JSONArray parseArray;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str2) || (parseArray = JSONArray.parseArray(str2)) == null || (size = parseArray.size()) <= 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(parseArray.getString(i))) {
                return true;
            }
        }
        return false;
    }
}
