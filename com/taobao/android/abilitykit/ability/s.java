package com.taobao.android.abilitykit.ability;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class s implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_PHONECALL = "call";
    public static final a Companion;
    public static final String PHONECALL = "-6497110954824747617";

    static {
        kge.a(1973735067);
        kge.a(-948502777);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(1686336547);
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
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            return a$a.Companion.b("NoCtx");
        }
        if (api.hashCode() == 3045982 && api.equals("call")) {
            Intent intent = new Intent("android.intent.action.DIAL");
            String a2 = com.alibaba.ability.e.a(params, "uri", (String) null);
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z && (a2 = com.alibaba.ability.e.a(params, "tel", (String) null)) == null) {
                return a$a.Companion.b("Empty Tel");
            }
            intent.setData(Uri.parse(a2));
            try {
                f.startActivity(intent);
                return new FinishResult(null, null, 3, null);
            } catch (ActivityNotFoundException unused) {
                return a$a.Companion.b("Device Not Support");
            }
        }
        return a$a.Companion.a("Api Not Found");
    }
}
