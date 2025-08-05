package com.taobao.android.msoa.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "a";

    public static <T> T a(String str, String str2) {
        try {
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException e) {
            AdapterForTLog.loge(TAG, e.toString());
            return null;
        } catch (IllegalAccessException e2) {
            AdapterForTLog.loge(TAG, e2.toString());
            return null;
        } catch (InstantiationException e3) {
            AdapterForTLog.loge(TAG, e3.toString());
            return null;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, th.toString());
            return null;
        }
    }

    public static Class b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("93c6af2a", new Object[]{str, str2});
        }
        try {
            return Class.forName(str2);
        } catch (ClassNotFoundException e) {
            AdapterForTLog.loge(TAG, e.toString());
            return null;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, th.toString());
            return null;
        }
    }
}
