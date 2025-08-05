package com.taobao.android.searchbaseframe.parse;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class c<BEAN extends TypedBean, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b<? extends BEAN, CTX>> f14995a = new ConcurrentHashMap();
    private final b b;
    private final b c;
    private imn d;

    static {
        kge.a(1598735576);
    }

    public c(imn imnVar, b bVar, b bVar2) {
        this.b = bVar;
        this.c = bVar2;
        this.d = imnVar;
    }

    public TypedBean a(JSONObject jSONObject, CTX ctx) {
        b<? extends BEAN, CTX> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedBean) ipChange.ipc$dispatch("ae171091", new Object[]{this, jSONObject, ctx});
        }
        String a2 = a(jSONObject);
        if (a2 == null) {
            return null;
        }
        if (a(a2) && this.b != null) {
            bVar = WXSDKEngine.isRemoteInstalled() ? this.b : null;
        } else if (!b(a2) || (bVar = this.c) == null) {
            bVar = this.f14995a.get(a2);
        }
        if (bVar == null) {
            k b = this.d.b();
            b.b("BaseParserRegistration", "no parser for " + a2);
            return null;
        }
        return (TypedBean) bVar.a(jSONObject, ctx);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return TypedBean.isWeex(str);
        }
        return false;
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return TypedBean.isMuise(str);
        }
        return false;
    }

    public void a(b<? extends BEAN, CTX> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44be03f", new Object[]{this, bVar});
            return;
        }
        String b = bVar.b();
        if (this.f14995a.containsKey(b)) {
            k b2 = this.d.b();
            b2.b("BaseParserRegistration", "register parser type exist already: " + b);
        }
        this.f14995a.put(b, bVar);
    }

    public void a(String str, b<? extends BEAN, CTX> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4cb909", new Object[]{this, str, bVar});
            return;
        }
        if (this.f14995a.containsKey(str)) {
            k b = this.d.b();
            b.b("BaseParserRegistration", "register parser type exist already: " + str);
        }
        this.f14995a.put(str, bVar);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        String string = jSONObject.getString("tItemType");
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("type");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return null;
    }

    public static void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{jSONObject, str});
        } else {
            jSONObject.put("tItemType", (Object) str);
        }
    }
}
