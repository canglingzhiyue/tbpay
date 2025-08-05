package com.taobao.android.tbabilitykit;

import com.alibaba.ability.b;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import tb.aln;
import tb.als;
import tb.ghi;
import tb.ghm;
import tb.kge;

/* loaded from: classes6.dex */
public final class d implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CHECK_VERSION_CODE = "checkVersionCode";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final String f15334a = "app_edition";
    private final String b = "1001";
    private final String c = "The edition_switcher is missing";

    static {
        kge.a(347173131);
        kge.a(-948502777);
        Companion = new a(null);
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-2118399341);
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
        if (api.hashCode() == -647176003 && api.equals(API_CHECK_VERSION_CODE)) {
            if (!a()) {
                return new ErrorResult(this.b, this.c, (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
            String a2 = com.alibaba.ability.e.a(params, "version", "");
            kotlin.jvm.internal.q.a((Object) a2);
            return new FinishResult(new JSONObject(ai.b(kotlin.j.a("result", Boolean.valueOf(a(a2))))), null, 2, null);
        }
        return a$a.Companion.a("Api not found");
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ((ghm) ghi.a(ghm.class)).isSpecifyVersionCode(str);
    }
}
