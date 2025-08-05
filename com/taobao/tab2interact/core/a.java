package com.taobao.tab2interact.core;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.data.baseinfo.PageBaseInfo;
import com.taobao.tab2interact.core.data.baseinfo.TabBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sjc;
import tb.smt;
import tb.sup;
import tb.sus;

/* loaded from: classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0817a Companion;
    public static final String START_PAUSE_TRIGGER_TYPE_NAVIGATION = "navigation";
    public static final String START_PAUSE_TRIGGER_TYPE_OTHER = "other";
    public static final String START_PAUSE_TRIGGER_TYPE_TAB = "tab";

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f19718a;
    private final List<sjc> b;
    private final List<smt> c;
    private final sus d;
    private final com.taobao.tab2interact.core.data.baseinfo.a e;

    static {
        kge.a(-1607165340);
        Companion = new C0817a(null);
    }

    public a(Context context, sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager) {
        q.d(context, "context");
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        this.d = messageCenter;
        this.e = baseInfoManager;
        this.f19718a = new FrameLayout(context);
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    /* renamed from: com.taobao.tab2interact.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0817a {
        static {
            kge.a(698472620);
        }

        private C0817a() {
        }

        public /* synthetic */ C0817a(o oVar) {
            this();
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (sjc sjcVar : this.b) {
            this.d.a(sjcVar);
        }
        for (smt smtVar : this.c) {
            this.d.a(smtVar);
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (sjc sjcVar : this.b) {
            this.d.b(sjcVar);
        }
        for (smt smtVar : this.c) {
            this.d.b(smtVar);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "页面创建的时机");
        if (!this.e.a(PageBaseInfo.State.CREATE)) {
            return;
        }
        d();
        d("create", null);
    }

    public final void a(String triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, triggerType});
            return;
        }
        q.d(triggerType, "triggerType");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "页面开启的时机");
        if (!this.e.a(PageBaseInfo.State.START)) {
            return;
        }
        d("start", triggerType);
    }

    public final void b(String triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, triggerType});
            return;
        }
        q.d(triggerType, "triggerType");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "页面暂停的时机");
        if (!this.e.a(PageBaseInfo.State.STOP)) {
            return;
        }
        d("stop", triggerType);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "页面销毁的时机");
        if (!this.e.a(PageBaseInfo.State.DESTROY)) {
            return;
        }
        d("destroy", null);
        e();
    }

    public final void a(String tabId, String tabType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tabId, tabType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabType, "tabType");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "Tab创建的时机，tabId=" + tabId + "，tabType=" + tabType);
        if (!this.e.a(tabId, tabType, TabBaseInfo.State.CREATE)) {
            return;
        }
        a(tabId, tabType, "create", null);
    }

    public final void b(String tabId, String triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, tabId, triggerType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(triggerType, "triggerType");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "Tab开启的时机，tabId=" + tabId + "，triggerType=" + triggerType);
        if (!this.e.a(tabId, null, TabBaseInfo.State.START)) {
            return;
        }
        a(tabId, null, "start", triggerType);
    }

    public final void c(String tabId, String triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, tabId, triggerType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(triggerType, "triggerType");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "Tab暂停的时机，tabId=" + tabId + "，triggerType=" + triggerType);
        if (!this.e.a(tabId, null, TabBaseInfo.State.STOP)) {
            return;
        }
        a(tabId, null, "stop", triggerType);
    }

    public final void c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "Tab销毁的时机");
        if (!this.e.a(tabId, null, TabBaseInfo.State.DESTROY)) {
            return;
        }
        a(tabId, null, "destroy", null);
    }

    public final void a(Map<String, String> pageURLQuery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, pageURLQuery});
            return;
        }
        q.d(pageURLQuery, "pageURLQuery");
        com.taobao.tab2interact.core.utils.a.b(this, "InteractContainer", "页面URL参数发生改变的时机，pageURLQuery=" + pageURLQuery);
        this.e.a(pageURLQuery);
        b(pageURLQuery);
    }

    public final void a(sjc interactComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed5fa6c", new Object[]{this, interactComponent});
            return;
        }
        q.d(interactComponent, "interactComponent");
        if (!interactComponent.q()) {
            return;
        }
        this.b.add(interactComponent);
    }

    public final void a(smt interactLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff07fb3e", new Object[]{this, interactLayer});
            return;
        }
        q.d(interactLayer, "interactLayer");
        this.c.add(interactLayer);
    }

    public final FrameLayout c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("56f39b2f", new Object[]{this}) : this.f19718a;
    }

    private final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "state", str);
        if (q.a((Object) str2, (Object) "navigation")) {
            jSONObject2.put((JSONObject) "changeType", "navigation");
        } else if (q.a((Object) str2, (Object) "other")) {
            jSONObject2.put((JSONObject) "changeType", "other");
        }
        a(this.d, sup.PAGE_STATE_CHANGE_NAME, jSONObject);
    }

    private final void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "id", str);
        jSONObject2.put((JSONObject) "type", str2);
        jSONObject2.put((JSONObject) "state", str3);
        if (str4 != null) {
            int hashCode = str4.hashCode();
            if (hashCode != 114581) {
                if (hashCode != 106069776) {
                    if (hashCode == 1862666772 && str4.equals("navigation")) {
                        jSONObject2.put((JSONObject) "changeType", "navigation");
                    }
                } else if (str4.equals("other")) {
                    jSONObject2.put((JSONObject) "changeType", "other");
                }
            } else if (str4.equals("tab")) {
                jSONObject2.put((JSONObject) "changeType", "tab");
            }
        }
        a(this.d, sup.TAB_STATE_CHANGE_NAME, jSONObject);
    }

    private final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "urlQuery", (String) map);
        a(this.d, sup.PAGE_URL_QUERY_CHANGE_NAME, jSONObject);
    }

    private final void a(sus susVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcabc1f", new Object[]{this, susVar, str, jSONObject});
            return;
        }
        sup a2 = sup.Companion.a(str, jSONObject, System.currentTimeMillis(), null);
        if (a2 == null) {
            return;
        }
        susVar.a(a2);
    }
}
