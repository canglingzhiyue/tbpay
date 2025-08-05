package com.taobao.tab2interact.core.component.browser.data;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.skq;

/* loaded from: classes8.dex */
public class BrowserTaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f19742a = new HashMap();
    private final Map<String, Map<String, String>> b = new HashMap();
    private String c = "browse_task_normal";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface BROWSE_TASK_STATE_DEF {
    }

    static {
        kge.a(-1916776859);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "browse_task_normal";
        }
        this.c = str;
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserTaskManager", "当前正在执行的浏览任务类型设为:" + this.c);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : "browse_task_normal".equals(str);
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : !str2.equals(this.f19742a.put(str, str2));
    }

    public Pair<String, Boolean> a(BrowserBadgeModel browserBadgeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7cad179a", new Object[]{this, browserBadgeModel});
        }
        if (browserBadgeModel == null) {
            return null;
        }
        BrowserBadgeModel.a aVar = browserBadgeModel.g;
        String str = aVar == null ? "browse_task_normal" : aVar.f19737a;
        boolean a2 = a(str, browserBadgeModel.c ? "finish" : "inProgress");
        if (a2) {
            a(str);
        }
        return new Pair<>(str, Boolean.valueOf(a2));
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "browse_task_normal";
        }
        String str2 = this.f19742a.get(str);
        return str2 == null ? "unknown" : str2;
    }

    public Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa35996a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "browse_task_normal";
        }
        return this.b.get(str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        Map<String, String> d = d(this.c);
        if (d == null) {
            return null;
        }
        return d.get("extParams");
    }

    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        String b = b(map);
        if (TextUtils.isEmpty(b) || "finish".equals(this.f19742a.get(b))) {
            return false;
        }
        this.b.put(b, map);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserTaskManager", "尝试更新任务" + b + "的页面query成功:" + map);
        return true;
    }

    public String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        if (map == null || !map.containsKey("extParams")) {
            return null;
        }
        try {
            String string = JSONObject.parseObject(map.get("extParams")).getString("browserTaskType");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (!skq.p().contains(string)) {
                return null;
            }
            return string;
        } catch (Exception e) {
            com.taobao.tab2interact.core.utils.a.a(this, "BrowserTaskManager", "尝试获链接特殊任务名字异常", e);
            return null;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = "browse_task_normal";
        this.f19742a.clear();
        this.b.clear();
    }
}
