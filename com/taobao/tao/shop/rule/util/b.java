package com.taobao.tao.shop.rule.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBUrlRuleResponse;
import tb.kge;
import tb.ouu;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1504330386);
    }

    public static TBUrlRuleResponse a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBUrlRuleResponse) ipChange.ipc$dispatch("6d49beba", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            TBUrlRuleResponse tBUrlRuleResponse = (TBUrlRuleResponse) JSONObject.parseObject(str2, TBUrlRuleResponse.class);
            if (!TextUtils.isEmpty(tBUrlRuleResponse.version)) {
                if (d.a(str, tBUrlRuleResponse.version)) {
                    return tBUrlRuleResponse;
                }
            }
            return null;
        } catch (Throwable th) {
            ouu.a(th, "RuleParser.parseRuleContent() throw error, bundleName=" + str + ", rule=" + str2);
            return null;
        }
    }
}
