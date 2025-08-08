package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes8.dex */
public class CollectionRuleProcessor implements IRuleProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-152804927);
        kge.a(-1464426972);
    }

    @Override // com.taobao.tao.shop.rule.processor.IRuleProcessor
    public Result executor(TBUrlRule tBUrlRule, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7addac2b", new Object[]{this, tBUrlRule, uri});
        }
        if (tBUrlRule == null) {
            return new Result();
        }
        Result result = null;
        Iterator<TBUrlRule> it = tBUrlRule.subRules.iterator();
        while (it.hasNext()) {
            result = RuleProcessCenter.process(it.next(), uri);
            if (result.isMatch) {
                break;
            }
        }
        if (result.isMatch && !StringUtils.isEmpty(result.target)) {
            result.target = tBUrlRule.target;
        }
        return result;
    }
}
