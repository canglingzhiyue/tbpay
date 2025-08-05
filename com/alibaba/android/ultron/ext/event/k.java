package com.alibaba.android.ultron.ext.event;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.ext.event.widget.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class k extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_DISMISS = "dismiss";

    static {
        kge.a(-786691496);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
        } else if (!(eVar.a() instanceof Activity) || c() == null || !(c().get("weexPopUrl") instanceof String)) {
            String str = null;
            if (!(eVar.a() instanceof Activity)) {
                str = "content 异常" + eVar.a();
            } else if (c() == null) {
                str = "getEventFields 为空";
            } else if (!(c().get("weexPopUrl") instanceof String)) {
                str = "url 参数有问题";
            }
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            a(this.d, d(eVar), new b.a() { // from class: com.alibaba.android.ultron.ext.event.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.ext.event.widget.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        k.this.a(eVar, "dismiss");
                    }
                }
            });
        }
    }

    public void a(Context context, JSONObject jSONObject, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989f1a0", new Object[]{this, context, jSONObject, aVar});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("weexPopUrl");
            String string2 = jSONObject.getString("heightPercent");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String a2 = a(string, jSONObject2);
            com.alibaba.android.ultron.ext.event.widget.b bVar = new com.alibaba.android.ultron.ext.event.widget.b(context);
            b.C0091b c0091b = new b.C0091b();
            c0091b.a(-1);
            c0091b.a(a2);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    c0091b.a(Float.valueOf(string2).floatValue());
                } catch (Exception unused) {
                    c0091b.a(0.6f);
                }
            } else {
                c0091b.a(0.6f);
            }
            c0091b.a(true);
            c0091b.b(80);
            bVar.a(c0091b);
            bVar.a(aVar);
        }
    }

    private String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }
}
