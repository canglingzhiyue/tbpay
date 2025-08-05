package com.taobao.themis.utils;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TypeUtils";

    static {
        kge.a(-745853967);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            Log.e(TAG, "parse long exception.", th);
            return 0L;
        }
    }
}
