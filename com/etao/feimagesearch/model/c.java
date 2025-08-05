package com.etao.feimagesearch.model;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.com;
import tb.kge;

/* loaded from: classes3.dex */
public class c extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f6808a;
    public static Class sActivityClass;
    public static String sActivityUrl;
    private boolean b;
    private boolean c;
    private Map<String, String> d;

    static {
        kge.a(-41959877);
        HashSet hashSet = new HashSet();
        f6808a = hashSet;
        hashSet.add("sellerId");
        f6808a.add("shopId");
        f6808a.add("pssource");
    }

    private c() {
        this.c = false;
        this.d = new HashMap();
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this}) : this.d;
    }

    public c(e eVar) {
        super(eVar);
        this.c = false;
        this.d = new HashMap();
    }

    public c(b bVar) {
        super(bVar);
        this.c = false;
        this.d = new HashMap();
        this.d.putAll(bVar.getExtraParams());
    }

    public Uri createNavUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("31cb88a3", new Object[]{this});
        }
        if (TextUtils.isEmpty(sActivityUrl)) {
            return null;
        }
        Uri.Builder buildUpon = b().buildUpon();
        b(buildUpon);
        a(buildUpon);
        if (this.c) {
            buildUpon.appendQueryParameter(d.KEY_SHOW_SYS_HISTORY_TAB, String.valueOf(true));
        }
        return buildUpon.build();
    }

    @Override // com.etao.feimagesearch.model.e
    public Intent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this});
        }
        Intent intent = new Intent(com.b(), sActivityClass);
        intent.addFlags(603979776);
        return intent;
    }

    public boolean isFromSys() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47de1e44", new Object[]{this})).booleanValue() : this.b;
    }

    public void setFromSys(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7882f7cc", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // com.etao.feimagesearch.model.e
    public Uri b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("def15b20", new Object[]{this}) : Uri.parse(sActivityUrl);
    }

    @Override // com.etao.feimagesearch.model.e
    public void a(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b8a4a8", new Object[]{this, builder});
            return;
        }
        if (!TextUtils.isEmpty(getSellerId())) {
            builder.appendQueryParameter("sellerId", getSellerId());
        }
        if (!TextUtils.isEmpty(getShopId())) {
            builder.appendQueryParameter("shopId", getShopId());
        }
        builder.appendQueryParameter(d.KEY_FROM_SYS, String.valueOf(this.b));
        try {
            if (this.d.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : this.d.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
    }

    public static c parseFromIntent(Intent intent) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f6868f7a", new Object[]{intent});
        }
        c cVar = new c();
        if (intent == null || (data = intent.getData()) == null) {
            return cVar;
        }
        cVar.a(data);
        cVar.setFromSys(data.getBooleanQueryParameter(d.KEY_FROM_SYS, false));
        cVar.c = data.getBooleanQueryParameter(d.KEY_SHOW_SYS_HISTORY_TAB, false);
        try {
            if (data.getQueryParameterNames() != null) {
                for (String str : data.getQueryParameterNames()) {
                    if (!f6808a.contains(str) && (queryParameter = data.getQueryParameter(str)) != null) {
                        cVar.d.put(str, queryParameter);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return cVar;
    }

    public boolean isShowSysHistoryTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13dfd612", new Object[]{this})).booleanValue() : this.c;
    }

    public void setShowSysHistoryTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f993be", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
