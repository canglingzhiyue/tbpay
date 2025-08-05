package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import java.util.HashMap;
import java.util.Map;
import tb.bgp;
import tb.kge;

/* loaded from: classes8.dex */
public class RuleProcessCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2041357201);
    }

    public static Result process(TBUrlRule tBUrlRule, Uri uri) {
        IRuleProcessor a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("7f49a10f", new Object[]{tBUrlRule, uri});
        }
        Result result = new Result();
        return (tBUrlRule == null || (a2 = RuleFactory.a(tBUrlRule.type)) == null) ? result : a2.executor(tBUrlRule, uri);
    }

    /* loaded from: classes8.dex */
    public static class RuleFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Map<String, Class<? extends IRuleProcessor>> f21101a;

        static {
            kge.a(-206743109);
            HashMap hashMap = new HashMap();
            f21101a = hashMap;
            hashMap.put("collection", CollectionRuleProcessor.class);
            f21101a.put("combination", CombinationRuleProcessor.class);
            f21101a.put("text", TextRuleProcessor.class);
            f21101a.put(bgp.FRAGMENT, FragmentRuleProcessor.class);
            f21101a.put("parameter", ParameterRuleProcessor.class);
            f21101a.put("jsonParameter", JsonParameterRuleProcessor.class);
            f21101a.put("url", UrlRuleProcessor.class);
            f21101a.put("host", HostRuleProcessor.class);
            f21101a.put("path", PathRuleProcessor.class);
        }

        public static IRuleProcessor a(String str) {
            Class<? extends IRuleProcessor> cls = f21101a.get(str);
            if (cls != null) {
                try {
                    return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }
}
