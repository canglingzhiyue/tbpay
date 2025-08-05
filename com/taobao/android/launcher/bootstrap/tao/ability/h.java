package com.taobao.android.launcher.bootstrap.tao.ability;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.taobao.exp.TMSSimpleLaunchSwitch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.guc;
import tb.gve;

/* loaded from: classes5.dex */
public class h implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, LinkRule> f13069a = new ConcurrentHashMap();
    private final Context b;

    public h(Context context) {
        this.b = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        OrangeConfig.getInstance().registerListener(new String[]{"next_launch_link_rewriter"}, this, false);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (f13069a.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray(f13069a.size());
                for (Map.Entry<String, LinkRule> entry : f13069a.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", (Object) entry.getKey());
                    jSONObject.put(LinkageUtils.PolicyType.RULE, (Object) entry.getValue());
                    jSONArray.add(jSONObject);
                }
                AppMonitor.Counter.commit(gve.MODULE, "LinkRewriter", a("featureEffected", jSONArray).toJSONString(), 1.0d);
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb9346ae", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("data", obj);
        return jSONObject;
    }

    private boolean a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a974c1f", new Object[]{this, context, str, map})).booleanValue();
        }
        SharedPreferences b = b(context);
        String string = b.getString("__configVersion__", null);
        String str2 = map.get("configVersion");
        if (TextUtils.equals(string, str2)) {
            TLog.loge(gve.MODULE, "LinkRewriter", "version is not changed, discard it. local=" + string + ", remote=" + str2);
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) str2);
        AppMonitor.Counter.commit(gve.MODULE, "LinkRewriter", a("orangeUpdate", jSONObject).toJSONString(), 1.0d);
        String customConfig = OrangeConfig.getInstance().getCustomConfig(str, null);
        SharedPreferences.Editor putString = b.edit().clear().putString("__configVersion__", str2);
        if (TextUtils.equals("__empty__", customConfig)) {
            return putString.commit();
        }
        List<LinkRule> list = (List) JSON.parseObject(customConfig, new TypeReference<List<LinkRule>>() { // from class: com.taobao.android.launcher.bootstrap.tao.ability.h.1
        }, new Feature[0]);
        if (list == null) {
            return putString.commit();
        }
        for (LinkRule linkRule : list) {
            if (!TextUtils.isEmpty(linkRule.component) && a(context, linkRule)) {
                putString.putString(linkRule.name, JSON.toJSONString(linkRule));
            }
        }
        return putString.commit();
    }

    private static SharedPreferences b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("ed1f0113", new Object[]{context}) : context.getSharedPreferences("next_launch_link_rewriter", 0);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        TLog.loge(gve.MODULE, "LinkRewriter", "onConfigUpdate, namespace=" + str);
        a(this.b, str, map);
    }

    public List<LinkRule> a(Context context) {
        LinkRule a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{this, context});
        }
        TLog.loge(gve.MODULE, "LinkRewriter", "getNonModuleRules");
        Map<String, ?> all = b(context).getAll();
        ArrayList arrayList = new ArrayList(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (!"__configVersion__".equals(key) && (a2 = a(context, key)) != null && a2.nonModule) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public LinkRule a(Context context, String str) {
        LinkRule linkRule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("2296c356", new Object[]{this, context, str});
        }
        TLog.loge(gve.MODULE, "LinkRewriter", "get rule for " + str);
        try {
            linkRule = (LinkRule) JSON.parseObject(b(context).getString(str, null), new TypeReference<LinkRule>() { // from class: com.taobao.android.launcher.bootstrap.tao.ability.h.2
            }, new Feature[0]);
        } catch (Throwable unused) {
            linkRule = null;
        }
        LinkRule a2 = j.a(str);
        if (linkRule == null) {
            TLog.loge(gve.MODULE, "LinkRewriter", "no cached rule, return the builtin rule");
            return a2;
        } else if (a2 == null) {
            TLog.loge(gve.MODULE, "LinkRewriter", "no builtin rule, return the cached rule");
            return linkRule;
        } else if (linkRule.version > a2.version) {
            TLog.loge(gve.MODULE, "LinkRewriter", "rule version cache > builtin, return the cached rule");
            return linkRule;
        } else {
            TLog.loge(gve.MODULE, "LinkRewriter", "rule version cache <= builtin, return the builtin rule");
            return a2;
        }
    }

    public static LinkRule a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("1e3f484e", new Object[]{str});
        }
        for (LinkRule linkRule : f13069a.values()) {
            if (TextUtils.equals(str, linkRule.name)) {
                return linkRule;
            }
        }
        return null;
    }

    public static Pair<LinkRule, ComponentName> a(Context context, String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bcbaa312", new Object[]{context, str, uri});
        }
        if (uri.isOpaque()) {
            return Pair.create(null, new ComponentName(str, "com.taobao.browser.BrowserActivity"));
        }
        String queryParameter = uri.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter)) {
            return Pair.create(null, new ComponentName(str, "com.taobao.browser.BrowserActivity"));
        }
        return a(context, str, queryParameter);
    }

    public static Pair<LinkRule, ComponentName> a(Context context, String str, String str2) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("806afd5b", new Object[]{context, str, str2});
        }
        LinkRule b = b(context, str2);
        if (b == null) {
            componentName = new ComponentName(str, "com.taobao.browser.BrowserActivity");
        } else {
            componentName = new ComponentName(str, b.component);
        }
        return a(Pair.create(b, componentName), context, str2);
    }

    private static Pair<LinkRule, ComponentName> a(Pair<LinkRule, ComponentName> pair, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ce74219e", new Object[]{pair, context, str});
        }
        LinkRule linkRule = pair.first;
        ComponentName componentName = pair.second;
        if (componentName == null) {
            return pair;
        }
        if (!"com.taobao.browser.BrowserActivity".equals(componentName.getClassName()) && (linkRule == null || !TMSCalendarBridge.namespace.equals(linkRule.name))) {
            return pair;
        }
        long a2 = TMSSimpleLaunchSwitch.INSTANCE.a(context, str);
        if (a2 != 2 && a2 != 1) {
            return pair;
        }
        String a3 = TMSSimpleLaunchSwitch.INSTANCE.a(a2);
        return TextUtils.isEmpty(a3) ? pair : Pair.create(linkRule, new ComponentName(componentName.getPackageName(), a3));
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return false;
        }
        return !TextUtils.isEmpty(parse.getQueryParameter("__moduleName__")) || !TextUtils.isEmpty(parse.getQueryParameter("sModuleName"));
    }

    public static LinkRule c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkRule) ipChange.ipc$dispatch("7ba21c8c", new Object[]{str}) : f13069a.get(str);
    }

    public static LinkRule b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("f5531237", new Object[0]);
        }
        Iterator<LinkRule> it = f13069a.values().iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static LinkRule b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkRule) ipChange.ipc$dispatch("62c1aa17", new Object[]{context, str}) : a(context, str, false);
    }

    public static LinkRule a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("c6f15f96", new Object[]{context, str, new Boolean(z)});
        }
        LinkRule linkRule = f13069a.get(str);
        if (a(context, linkRule)) {
            return linkRule;
        }
        LinkRule b = b(context, str, z);
        if (!a(context, b)) {
            return null;
        }
        f13069a.put(str, b);
        return b;
    }

    private static boolean a(Context context, LinkRule linkRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d700b90e", new Object[]{context, linkRule})).booleanValue();
        }
        if (linkRule == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(new ComponentName(context.getPackageName(), linkRule.component));
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return true;
        }
        TLog.loge(gve.MODULE, "LinkRewriter", "cannot resolve the component: " + linkRule.component + " of " + linkRule.name + ", discard it.");
        return false;
    }

    private static LinkRule b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("8c2350f5", new Object[]{context, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return null;
        }
        if (!z) {
            return b(context, parse);
        }
        return a(context, parse);
    }

    private static LinkRule a(Context context, Uri uri) {
        Condition a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("f064e279", new Object[]{context, uri});
        }
        Iterator<LinkRule> it = new h(context).a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LinkRule next = it.next();
            if (!TextUtils.isEmpty(next.component) && (a2 = a(next, uri)) != null) {
                TLog.loge(gve.MODULE, "LinkRewriter", "found matched condition");
                if (a(context, next, a2)) {
                    return next;
                }
            }
        }
        return null;
    }

    private static boolean a(Context context, LinkRule linkRule, Condition condition) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff42a64f", new Object[]{context, linkRule, condition})).booleanValue();
        }
        if (TextUtils.equals(condition.abKey, "NONE")) {
            TLog.loge(gve.MODULE, "LinkRewriter", "abKey of biz '" + linkRule.name + "' is NONE, so it it open as default");
            return true;
        }
        if (!TextUtils.isEmpty(condition.abKey)) {
            str = "slim_afc_launch_" + linkRule.name + "_" + condition.abKey;
        } else {
            str = "slim_afc_launch_" + linkRule.name + "_" + condition.host + condition.path;
        }
        return guc.a(context, str);
    }

    private static LinkRule b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("5dd19f98", new Object[]{context, uri});
        }
        String queryParameter = uri.getQueryParameter("__moduleName__");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = uri.getQueryParameter("sModuleName");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            TLog.loge(gve.MODULE, "LinkRewriter", "moduleName is empty");
            return null;
        }
        LinkRule a2 = new h(context).a(context, queryParameter);
        if (a2 == null) {
            TLog.loge(gve.MODULE, "LinkRewriter", "no rule found for moduleName: " + queryParameter);
            return null;
        } else if (TextUtils.isEmpty(a2.component) || a(a2, uri) == null) {
            return null;
        } else {
            TLog.loge(gve.MODULE, "LinkRewriter", "found matched condition");
            if (!guc.a(context, "slim_afc_launch_off_" + a2.name)) {
                return a2;
            }
            return null;
        }
    }

    private static Condition a(LinkRule linkRule, Uri uri) {
        Condition[] conditionArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Condition) ipChange.ipc$dispatch("fe24fbfa", new Object[]{linkRule, uri});
        }
        if (!linkRule.nonModule ? a(linkRule.condition, uri) : false) {
            return linkRule.condition;
        }
        if (linkRule.conditions == null) {
            return null;
        }
        for (Condition condition : linkRule.conditions) {
            if (a(condition, uri)) {
                return condition;
            }
        }
        return null;
    }

    private static boolean a(Condition condition, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1da2753e", new Object[]{condition, uri})).booleanValue();
        }
        if (condition == null) {
            return false;
        }
        if (condition.scheme != null && !TextUtils.equals(condition.scheme, uri.getScheme())) {
            return false;
        }
        if (condition.host != null && !a(condition.host, uri.getHost())) {
            return false;
        }
        if (condition.path != null && !a(condition.path, uri.getPath())) {
            return false;
        }
        if (condition.queries == null) {
            return true;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.isEmpty()) {
            return true;
        }
        for (Map.Entry<String, String> entry : condition.queries.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("*".equals(value) && !queryParameterNames.contains(key)) {
                return false;
            }
            String queryParameter = uri.getQueryParameter(key);
            if (!"*".equals(value) && !TextUtils.equals(value, queryParameter)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.startsWith("*")) {
            return str2.endsWith(str.substring(1));
        }
        if (str.endsWith("*")) {
            return str2.startsWith(str.substring(0, str.length() - 1));
        }
        return TextUtils.equals(str2, str);
    }
}
