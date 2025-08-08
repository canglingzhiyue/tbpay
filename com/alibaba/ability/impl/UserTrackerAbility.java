package com.alibaba.ability.impl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.aln;
import tb.als;
import tb.alt;
import tb.kge;

/* loaded from: classes2.dex */
public final class UserTrackerAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1828a = "click";
    private final String b = g4.b.i;
    private final String c = "expose";
    private final String d = "updateNextProp";
    private final String e = "other";
    private final String f = "clickWithPageName";

    static {
        kge.a(1633925318);
    }

    public static /* synthetic */ Object ipc$super(UserTrackerAbility userTrackerAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final String getCLICK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc75c267", new Object[]{this}) : this.f1828a;
    }

    public final String getENTER() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dea57317", new Object[]{this}) : this.b;
    }

    public final String getEXPOSE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e141f49f", new Object[]{this}) : this.c;
    }

    public final String getUPDATE_NEXT_PROP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326299ca", new Object[]{this}) : this.d;
    }

    public final String getCUSTOM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed13fb12", new Object[]{this}) : this.e;
    }

    public final String getCLICK_WITH_PAGENAME() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f28d0373", new Object[]{this}) : this.f;
    }

    private final void a(Context context, String str, int i, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ce8f5a", new Object[]{this, context, str, new Integer(i), str2, str3, str4, str5, str6, map});
        } else if (q.a((Object) str, (Object) this.f1828a)) {
            a(str2, str3, map);
        } else if (q.a((Object) str, (Object) this.c)) {
            a(str2, i, str4, str5, str6, map);
        } else if (q.a((Object) str, (Object) this.b)) {
            a(context, str2, str3, map);
        } else if (q.a((Object) str, (Object) this.e)) {
            b(str2, str4, map);
        } else if (q.a((Object) str, (Object) this.d)) {
            a(map);
        } else if (!q.a((Object) str, (Object) this.f)) {
        } else {
            a(str2, this.f1828a, str3, map);
        }
    }

    private final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = !StringUtils.isEmpty(str) ? new UTHitBuilders.UTControlHitBuilder(str, str2) : new UTHitBuilders.UTControlHitBuilder(str2);
            uTControlHitBuilder.setProperties(map);
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.b(uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().send(uTControlHitBuilder.build());
        }
    }

    private final void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{this, context, str, str2, map});
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageName(context, str);
        UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
        q.b(uTAnalytics2, "UTAnalytics.getInstance()");
        uTAnalytics2.getDefaultTracker().updatePageProperties(context, map);
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        UTAnalytics uTAnalytics3 = UTAnalytics.getInstance();
        q.b(uTAnalytics3, "UTAnalytics.getInstance()");
        uTAnalytics3.getDefaultTracker().updatePageUrl(context, Uri.parse(str2));
    }

    private final void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            return;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str, i < 0 ? 2201 : i, str2, str3, str4, map);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }

    private final void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(map);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    private final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updateNextPageProperties(map);
    }

    @Deprecated(message = "")
    private final void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
        } else if (str != null && str2 != null && str3 != null && map != null) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append(entry.getValue());
                    stringBuffer.append(",");
                }
                TBS.Adv.ctrlClickedOnPage(str, CT.Button, str3, stringBuffer.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final ExecuteResult a(als context, f params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("1ffd481d", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        alt b = context.b();
        Context f = b != null ? b.f() : null;
        String a2 = params.a();
        String str = a2 == null ? "" : a2;
        String b2 = params.b();
        String str2 = b2 == null ? "" : b2;
        String c = params.c();
        a(f, str, -1, str2, c == null ? "" : c, "", "", "", params.d());
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context, g params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("ba9e0a9e", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        alt b = context.b();
        Context f = b != null ? b.f() : null;
        String a2 = params.a();
        String str = a2 == null ? "" : a2;
        int b2 = params.b();
        String c = params.c();
        String str2 = c == null ? "" : c;
        String d = params.d();
        a(f, str, b2, str2, d == null ? "" : d, params.e(), params.f(), params.g(), params.h());
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context, e params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("855c859c", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        b(params.a(), params.b(), params.c());
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context, h params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("553ecd1f", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(params.a(), params.b(), params.c(), params.d(), params.e(), params.f());
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("97a84cf", new Object[]{this, context});
        }
        q.d(context, "context");
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
        alt b = context.b();
        defaultTracker.pageAppearDonotSkip(b != null ? b.f() : null);
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult b(als context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("2396036e", new Object[]{this, context});
        }
        q.d(context, "context");
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
        alt b = context.b();
        defaultTracker.pageDisAppear(b != null ? b.f() : null);
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context, i params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("efdf8fa0", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updateNextPageUtparam(params.a());
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context, j params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("8a805221", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
        alt b = context.b();
        defaultTracker.updatePageUtparam(b != null ? b.f() : null, params.a());
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult c(als context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("3db1820d", new Object[]{this, context});
        }
        q.d(context, "context");
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
        alt b = context.b();
        defaultTracker.skipPage(b != null ? b.f() : null);
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult a(als context, aln callback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("4ecd9982", new Object[]{this, context, callback});
        }
        q.d(context, "context");
        q.d(callback, "callback");
        alt b = context.b();
        if ((b != null ? b.f() : null) instanceof Activity) {
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.b(uTAnalytics, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
            alt b2 = context.b();
            Context f = b2 != null ? b2.f() : null;
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            str = defaultTracker.getPageSpmUrl((Activity) f);
            q.b(str, "UTAnalytics.getInstance(…getContext() as Activity)");
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put((JSONObject) "spmUrl", str);
        callback.a(new FinishResult(jSONObject, null, 2, null));
        return new FinishResult(null, null, 2, null);
    }

    public final ExecuteResult b(als context, aln callback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e30c0921", new Object[]{this, context, callback});
        }
        q.d(context, "context");
        q.d(callback, "callback");
        alt b = context.b();
        if ((b != null ? b.f() : null) instanceof Activity) {
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.b(uTAnalytics, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
            alt b2 = context.b();
            Context f = b2 != null ? b2.f() : null;
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            str = defaultTracker.getPageSpmPre((Activity) f);
            q.b(str, "UTAnalytics.getInstance(…getContext() as Activity)");
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put((JSONObject) "spmPre", str);
        callback.a(new FinishResult(jSONObject, null, 2, null));
        return new FinishResult(null, null, 2, null);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        ErrorResult a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        try {
            switch (api.hashCode()) {
                case -1354815177:
                    if (api.equals("commit")) {
                        a2 = a(context, new f(params));
                        break;
                    }
                    a$a.a aVar = a$a.Companion;
                    a2 = aVar.a("api " + api + " not found");
                    break;
                case -1025553932:
                    if (api.equals("pageDisAppear")) {
                        a2 = b(context);
                        break;
                    }
                    a$a.a aVar2 = a$a.Companion;
                    a2 = aVar2.a("api " + api + " not found");
                    break;
                case -602290666:
                    if (api.equals("commitut")) {
                        a2 = a(context, new g(params));
                        break;
                    }
                    a$a.a aVar22 = a$a.Companion;
                    a2 = aVar22.a("api " + api + " not found");
                    break;
                case -114154543:
                    if (api.equals(m.CUSTOM_ADVANCE)) {
                        a2 = a(context, new h(params));
                        break;
                    }
                    a$a.a aVar222 = a$a.Companion;
                    a2 = aVar222.a("api " + api + " not found");
                    break;
                case 768062724:
                    if (api.equals(m.PAGE_APPEAR)) {
                        a2 = a(context);
                        break;
                    }
                    a$a.a aVar2222 = a$a.Companion;
                    a2 = aVar2222.a("api " + api + " not found");
                    break;
                case 985529912:
                    if (api.equals(m.GET_PAGE_SPM_PRE)) {
                        a2 = b(context, callback);
                        break;
                    }
                    a$a.a aVar22222 = a$a.Companion;
                    a2 = aVar22222.a("api " + api + " not found");
                    break;
                case 985534724:
                    if (api.equals(m.GET_PAGE_SPM_URL)) {
                        a2 = a(context, callback);
                        break;
                    }
                    a$a.a aVar222222 = a$a.Companion;
                    a2 = aVar222222.a("api " + api + " not found");
                    break;
                case 1421600451:
                    if (api.equals("updateNextPageUtparam")) {
                        a2 = a(context, new i(params));
                        break;
                    }
                    a$a.a aVar2222222 = a$a.Companion;
                    a2 = aVar2222222.a("api " + api + " not found");
                    break;
                case 1487963043:
                    if (api.equals("commitEvent")) {
                        a2 = a(context, new e(params));
                        break;
                    }
                    a$a.a aVar22222222 = a$a.Companion;
                    a2 = aVar22222222.a("api " + api + " not found");
                    break;
                case 1880007478:
                    if (api.equals(m.UPDATE_PAGE_UTPARAM)) {
                        a2 = a(context, new j(params));
                        break;
                    }
                    a$a.a aVar222222222 = a$a.Companion;
                    a2 = aVar222222222.a("api " + api + " not found");
                    break;
                case 2145313966:
                    if (api.equals(m.SKIP_PAGE)) {
                        a2 = c(context);
                        break;
                    }
                    a$a.a aVar2222222222 = a$a.Companion;
                    a2 = aVar2222222222.a("api " + api + " not found");
                    break;
                default:
                    a$a.a aVar22222222222 = a$a.Companion;
                    a2 = aVar22222222222.a("api " + api + " not found");
                    break;
            }
            return a2;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new ErrorResult("500", message, (Map) null, 4, (o) null);
        }
    }
}
