package com.taobao.tao.shop.rule;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;
import com.taobao.tao.shop.rule.data.TBUrlRuleSet;
import com.taobao.tao.shop.rule.processor.RuleProcessCenter;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f21094a = false;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(-1013431764);
        }
    }

    static {
        kge.a(1416759214);
    }

    public static a a(TBUrlRuleSet tBUrlRuleSet, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("32491edf", new Object[]{tBUrlRuleSet, uri});
        }
        a aVar = new a();
        if (tBUrlRuleSet != null && tBUrlRuleSet.subRules != null) {
            Result result = new Result();
            Iterator<TBUrlRule> it = tBUrlRuleSet.subRules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                result = RuleProcessCenter.process(it.next(), uri);
                if (result.isMatch) {
                    aVar.f21094a = true;
                    if (TextUtils.isEmpty(result.target)) {
                        aVar.b = tBUrlRuleSet.target;
                    }
                    aVar.c = tBUrlRuleSet.actionAfterMatch;
                    aVar.d = tBUrlRuleSet.name;
                    aVar.e = tBUrlRuleSet.handleType;
                }
            }
            if (!result.isMatch && tBUrlRuleSet.actionAfterMiss.equals("toNext")) {
                return a(tBUrlRuleSet.successor, uri);
            }
        }
        return aVar;
    }
}
