package com.taobao.android.waitpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Intent f15832a;
    private final Context b;

    static {
        kge.a(-1927019380);
        kge.a(-847150288);
    }

    public h(Activity activity) {
        this.b = activity;
        this.f15832a = activity.getIntent();
    }

    @Override // com.taobao.android.waitpay.e
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        Map<String, String> d = d();
        d.putAll(com.taobao.android.purchase.aura.helper.c.b(this.b));
        d.putAll(com.taobao.android.purchase.aura.helper.c.a(this.b, f()));
        return d;
    }

    @Override // com.taobao.android.waitpay.e
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : d();
    }

    @Override // com.taobao.android.waitpay.e
    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : d();
    }

    private Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        Map<String, String> a2 = a(this.f15832a.getData());
        a2.putAll(e());
        return a2;
    }

    private JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        String stringExtra = this.f15832a.getStringExtra("openFrom");
        String stringExtra2 = this.f15832a.getStringExtra("pageType");
        Uri data = this.f15832a.getData();
        if (data != null) {
            stringExtra = StringUtils.isEmpty(stringExtra) ? data.getQueryParameter("openFrom") : null;
            stringExtra2 = StringUtils.isEmpty(stringExtra2) ? data.getQueryParameter("pageType") : null;
        }
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(stringExtra)) {
            jSONObject.put("openFrom", (Object) stringExtra);
        }
        if (!StringUtils.isEmpty(stringExtra2)) {
            jSONObject.put("pageType", (Object) stringExtra2);
        }
        return jSONObject;
    }

    private Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(Uri.decode("appName"), "tborder");
        hashMap.put(Uri.decode("appVersion"), "1.0");
        return hashMap;
    }

    private Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{this, uri});
        }
        if (uri == null || uri.isOpaque()) {
            return new HashMap();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            hashMap.put(Uri.decode(encodedQuery.substring(i, indexOf2)), Uri.decode(indexOf2 < indexOf ? encodedQuery.substring(indexOf2 + 1, indexOf) : ""));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return hashMap;
    }
}
