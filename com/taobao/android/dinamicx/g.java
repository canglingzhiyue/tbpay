package com.taobao.android.dinamicx;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements com.taobao.android.dinamicx.widget.aj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.aj
    public Map<String, Object> a(String str, String str2) {
        VariationSet activate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (activate = UTABTest.activate(str, str2)) != null && (r4 = activate.iterator()) != null) {
            for (Variation variation : activate) {
                hashMap.put(variation.getName(), variation.getValue(null));
            }
        }
        return hashMap;
    }
}
