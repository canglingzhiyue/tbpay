package com.taobao.android.weex_ability;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.b;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import tb.kge;

/* loaded from: classes6.dex */
public class g implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final JSONObject f15917a;
    private static JSONObject b;

    static {
        kge.a(-529020379);
        kge.a(-1536142366);
        JSONObject jSONObject = new JSONObject();
        f15917a = jSONObject;
        jSONObject.put("alibabafont-bold", (Object) com.taobao.tab2interact.core.utils.e.ALI_SANS_TYPEFACE_ASSET_PATH);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b != null) {
        } else {
            try {
                b = JSON.parseObject(l.a().s().a("alimuise", "font2021Config", ""));
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[0]);
        }
        JSONObject jSONObject = b;
        return jSONObject == null ? f15917a : jSONObject;
    }

    @Override // com.taobao.android.weex_framework.adapter.b
    public Typeface a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("79ebd1a8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a();
        return Typeface.createFromAsset(m.b().getAssets(), b().getString(str.toLowerCase()));
    }

    @Override // com.taobao.android.weex_framework.adapter.b
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a();
        return b().containsKey(str.toLowerCase());
    }
}
