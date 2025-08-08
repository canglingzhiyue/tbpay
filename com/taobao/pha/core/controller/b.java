package com.taobao.pha.core.controller;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.jsbridge.c;
import com.taobao.pha.core.tabcontainer.TabBar;
import tb.kge;
import tb.neh;
import tb.nfv;
import tb.nfz;
import tb.ngf;
import tb.ngr;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18717a;
    private final AppController b;

    static {
        kge.a(-737355515);
        f18717a = b.class.getSimpleName();
    }

    public b(AppController appController) {
        this.b = appController;
    }

    public static String a(String str, Object obj, String str2) {
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("244a69c8", new Object[]{str, obj, str2});
        }
        if (obj instanceof String) {
            obj2 = "'" + obj + "'";
        } else if (obj instanceof JSONObject) {
            obj2 = ((JSONObject) obj).toJSONString();
        } else {
            obj2 = obj.toString();
        }
        StringBuilder sb = new StringBuilder("(function(){var customEvent = new CustomEvent('");
        sb.append(str);
        if ("message".equals(str)) {
            sb.append("');customEvent.data=");
            sb.append(obj2);
        } else {
            sb.append("', {'detail':");
            sb.append(obj2);
            sb.append("})");
        }
        sb.append(";customEvent.origin='");
        sb.append(str2);
        sb.append("';dispatchEvent(customEvent);})()");
        return sb.toString();
    }

    public boolean a(String str, Object obj, String str2, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa604eb1", new Object[]{this, str, obj, str2, aVar})).booleanValue();
        }
        String str3 = null;
        if (aVar instanceof nfz) {
            str3 = ((nfz) aVar).d();
        } else if (aVar instanceof TabBar) {
            str3 = "TabBar";
        } else if (aVar instanceof neh) {
            str3 = "AppWorker";
        }
        if (str3 != null) {
            return a(str, obj, str2, str3);
        }
        ngr.b(f18717a, "unexpected target");
        return false;
    }

    public boolean a(String str, Object obj, String str2, String str3) {
        TabBar c;
        ngf i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c359a6", new Object[]{this, str, obj, str2, str3})).booleanValue();
        }
        ngr.c("Event", "name:" + str + ", source:" + str2 + ", target:" + str3 + ", data:" + obj);
        boolean equals = "*".equals(str3);
        String a2 = a(str, obj, str2);
        if (equals || "TabBar".equals(str3)) {
            if (this.b.v() != null && (c = this.b.v().c()) != null) {
                c.evaluateJavaScript(a2);
            }
            z = true;
        }
        if (equals || "AppWorker".equals(str3)) {
            if (this.b.J() != null) {
                this.b.J().evaluateJavaScript(a2);
            }
            z = true;
        }
        if (!equals && !a(str3)) {
            return z;
        }
        for (nfz nfzVar : this.b.a(str3)) {
            if (nfzVar != null) {
                nfzVar.evaluateJavaScript(a2);
                if ((nfzVar instanceof nfv) && (i = ((nfv) nfzVar).i()) != null) {
                    i.a(str, obj.toString());
                }
            }
        }
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && !"AppWorker".equals(str) && !"TabBar".equals(str);
    }
}
