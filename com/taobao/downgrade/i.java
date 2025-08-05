package com.taobao.downgrade;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static DowngradeStrategy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DowngradeStrategy) ipChange.ipc$dispatch("1d52c3c2", new Object[0]) : new DowngradeStrategy.a().a("normal").b("normal").a();
    }

    public static DowngradeStrategy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("e03f2d21", new Object[0]);
        }
        int d = c.d();
        DowngradeStrategy.a aVar = new DowngradeStrategy.a();
        aVar.a("normal");
        if (d == 1) {
            aVar.b("partDegrade");
        } else if (d == 2) {
            aVar.b("degrade");
        } else {
            aVar.b("normal");
        }
        return aVar.a();
    }

    public static DowngradeStrategy a(BusinessRule businessRule, DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DowngradeStrategy) ipChange.ipc$dispatch("2ba33b55", new Object[]{businessRule, defaultRule}) : e.a(businessRule, defaultRule);
    }

    public static DowngradeStrategy a(DefaultRule defaultRule, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DowngradeStrategy) ipChange.ipc$dispatch("297fcf1e", new Object[]{defaultRule, str}) : e.a(defaultRule, str);
    }
}
