package com.alibaba.ability.impl.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.alibaba.ability.e;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.ssrcore.util.SsrLoginOption;
import tb.aam$a;
import tb.alm;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public class ClipboardAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET = "get";
    public static final String API_SET = "set";
    public static final aam$a Companion;

    static {
        kge.a(-210893226);
        Companion = new aam$a(null);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        Context applicationContext;
        String str;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null || (applicationContext = f.getApplicationContext()) == null) {
            return new ErrorResult("400", "NoAppCtx", (Map) null, 4, (o) null);
        }
        int hashCode = api.hashCode();
        if (hashCode != 102230) {
            if (hashCode == 113762 && api.equals("set")) {
                String a2 = e.a(params, "text", (String) null);
                if (a2 == null) {
                    a2 = e.a(params, "value", (String) null);
                }
                if (a2 == null) {
                    return new ErrorResult("400", "NoValue", (Map) null, 4, (o) null);
                }
                Object systemService = applicationContext.getSystemService("clipboard");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
                }
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("commentValue", a2));
                if (!q.a((Object) e.a(params, SsrLoginOption.SILENT, (Boolean) true), (Object) true)) {
                    Toast.makeText(applicationContext, b.a(R.string.app_copy_success), 0).show();
                }
                return new FinishResult(null, null, 3, null);
            }
        } else if (api.equals("get")) {
            Object systemService2 = applicationContext.getSystemService("clipboard");
            if (systemService2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
            ClipData primaryClip = ((ClipboardManager) systemService2).getPrimaryClip();
            if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (coerceToText = itemAt.coerceToText(applicationContext)) == null || (str = coerceToText.toString()) == null) {
                str = "";
            }
            callback.a(new FinishResult(new JSONObject(ai.a(j.a("result", str))), "onSuccess"));
            return null;
        }
        return new ErrorResult("404", (String) null, (Map) null, 6, (o) null);
    }
}
