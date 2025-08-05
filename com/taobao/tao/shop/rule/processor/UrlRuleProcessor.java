package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import com.taobao.tao.shop.rule.util.c;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes8.dex */
public class UrlRuleProcessor implements IRuleProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1827227934);
        kge.a(-1464426972);
    }

    @Override // com.taobao.tao.shop.rule.processor.IRuleProcessor
    public Result executor(TBUrlRule tBUrlRule, Uri uri) {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7addac2b", new Object[]{this, tBUrlRule, uri});
        }
        Result result = new Result();
        String str = uri.getHost() + uri.getPath();
        if (TextUtils.isEmpty(str)) {
            return result;
        }
        String lowerCase = str.toLowerCase();
        if (c.a(tBUrlRule.regex)) {
            equals = Pattern.compile(tBUrlRule.content).matcher(lowerCase).find();
        } else {
            equals = lowerCase.equals(tBUrlRule.content);
        }
        if (equals) {
            result.isMatch = true;
            result.isShop = true;
            result.target = tBUrlRule.target;
        }
        return result;
    }
}
