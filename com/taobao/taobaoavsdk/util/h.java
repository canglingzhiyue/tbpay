package com.taobao.taobaoavsdk.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kge;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1721413852);
    }

    public static <T> T a(VariationSet variationSet, String str, Class<? extends T> cls) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5bb2aeba", new Object[]{variationSet, str, cls});
        }
        if (variationSet == null || (variation = variationSet.getVariation(str)) == null) {
            return null;
        }
        String valueAsString = variation.getValueAsString(null);
        if (TextUtils.isEmpty(valueAsString)) {
            return null;
        }
        try {
            return (T) JSON.parseObject(valueAsString, cls);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taolive.sdk.utils.a.TAG, "invalid json", th);
            return null;
        }
    }
}
