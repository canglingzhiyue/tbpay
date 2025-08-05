package com.taobao.android.launcher.bootstrap.tao.ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.HashMap;
import java.util.Map;
import tb.gvw;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, LinkRule> f13075a = new HashMap();

    static {
        LinkRule a2 = a();
        LinkRule b = b();
        LinkRule c = c();
        f13075a.put(a2.name, a2);
        f13075a.put(b.name, b);
        f13075a.put(c.name, c);
    }

    public static LinkRule a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkRule) ipChange.ipc$dispatch("1e3f484e", new Object[]{str}) : f13075a.get(str);
    }

    private static LinkRule a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("76f20e58", new Object[0]);
        }
        LinkRule linkRule = new LinkRule();
        linkRule.name = "tnode";
        linkRule.component = "com.taobao.android.layoutmanager.container.MultiPageContainerActivity";
        Condition condition = new Condition();
        condition.scheme = "https";
        condition.host = "h5.m.taobao.com";
        condition.path = "/tnode/index.htm";
        linkRule.condition = condition;
        HashMap hashMap = new HashMap();
        hashMap.put(gvw.CONFIG_LAUNCH, "0");
        hashMap.put("sKeep", "1");
        condition.queries = hashMap;
        return linkRule;
    }

    private static LinkRule b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("f5531237", new Object[0]);
        }
        LinkRule linkRule = new LinkRule();
        linkRule.name = "fullpagevideo";
        linkRule.component = "com.taobao.android.layoutmanager.container.MultiPageContainerActivity";
        Condition condition = new Condition();
        condition.scheme = "https";
        condition.host = "market.m.taobao.com";
        condition.path = "/app/tb-source-app/video-fullpage/pages/index2";
        linkRule.condition = condition;
        HashMap hashMap = new HashMap();
        hashMap.put(gvw.CONFIG_LAUNCH, "0");
        hashMap.put("sKeep", "1");
        condition.queries = hashMap;
        return linkRule;
    }

    private static LinkRule c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("73b41616", new Object[0]);
        }
        LinkRule linkRule = new LinkRule();
        linkRule.name = TMSCalendarBridge.namespace;
        linkRule.component = "com.taobao.themis.container.app.TMSActivity";
        RestoreStrategy restoreStrategy = new RestoreStrategy();
        restoreStrategy.ignoredPages = "com.alibaba.triver.container.TriverMainActivity";
        linkRule.strategy = restoreStrategy;
        Condition condition = new Condition();
        condition.scheme = "https";
        condition.host = "m.duanqu.com";
        condition.path = "/";
        linkRule.condition = condition;
        HashMap hashMap = new HashMap();
        hashMap.put(gvw.CONFIG_LAUNCH, "0");
        hashMap.put("sKeep", "1");
        hashMap.put(com.taobao.themis.kernel.i.APP_ID, "*");
        condition.queries = hashMap;
        return linkRule;
    }
}
