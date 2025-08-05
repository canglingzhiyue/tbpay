package com.taobao.android.tbabilitykit;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.Window;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.x;
import tb.aln;
import tb.als;
import tb.dms;
import tb.hsv;
import tb.kge;

/* loaded from: classes6.dex */
public final class g implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SUBSCRIBE = "subscribe";
    public static final String API_UNSUBSCRIBE = "unsubscribe";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, hsv> f15337a = new LinkedHashMap();

    /* loaded from: classes6.dex */
    public static final class b implements hsv.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f15338a;

        public b(aln alnVar) {
            this.f15338a = alnVar;
        }

        @Override // tb.hsv.d
        public boolean a(KeyEvent e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e8cd358", new Object[]{this, e})).booleanValue();
            }
            kotlin.jvm.internal.q.d(e, "e");
            if (e.getKeyCode() != 4) {
                return false;
            }
            if (e.getAction() == 1) {
                this.f15338a.a((ExecuteResult) new FinishResult(new JSONObject(ai.b(kotlin.j.a("keyCode", "back"))), "onKeyUp"));
            }
            return true;
        }
    }

    static {
        kge.a(1171668024);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(466764160);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        Context f = context.f().f();
        if (!(f instanceof Activity)) {
            f = dms.a(context.g());
            if (!(f instanceof Activity)) {
                return new ErrorResult("500", "env.getContext is null or invalid", (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
        }
        String a2 = com.alibaba.ability.e.a(params, "keyCode", "");
        int hashCode = api.hashCode();
        if (hashCode == 514841930) {
            if (api.equals("subscribe")) {
                if (this.f15337a.get(a2) == null) {
                    if (a2 != null && a2.hashCode() == 3015911 && a2.equals("back")) {
                        Window window = ((Activity) f).getWindow();
                        kotlin.jvm.internal.q.b(window, "act.window");
                        hsv hsvVar = new hsv(window, new b(callback));
                        hsvVar.a();
                        this.f15337a.put("back", hsvVar);
                        return null;
                    }
                    return new ErrorResult("400", "keyCode " + a2 + " is invalid", (Map) null, 4, (kotlin.jvm.internal.o) null);
                }
                return new ErrorResult("500", "keyCode " + a2 + " is already subscribe", (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
        } else if (hashCode == 583281361 && api.equals("unsubscribe")) {
            Map<String, hsv> map = this.f15337a;
            if (map == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            hsv hsvVar2 = (hsv) x.i(map).remove(a2);
            if (hsvVar2 == null) {
                return new ErrorResult("400", "keyCode " + a2 + " is invalid or already unsubscribe", (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
            hsvVar2.b();
            return new FinishResult(null, null, 3, null);
        }
        a$a.a aVar = a$a.Companion;
        return aVar.a("api " + api + " not found");
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        try {
            Map<String, hsv> map = this.f15337a;
            for (hsv hsvVar : map.values()) {
                hsvVar.b();
            }
            map.clear();
        } catch (Throwable unused) {
        }
    }
}
