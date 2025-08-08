package com.etao.feimagesearch.model;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6809a;
    private Uri b;
    private String c;
    private String d;
    private long e;
    private long f;
    private String g;

    static {
        kge.a(58593394);
    }

    public abstract Intent a();

    public abstract void a(Uri.Builder builder);

    public abstract Uri b();

    public e() {
        this.f = 0L;
    }

    public e(e eVar) {
        this.f = 0L;
        this.f6809a = eVar.getPssource();
        this.c = eVar.getSellerId();
        this.d = eVar.getShopId();
        this.e = eVar.getPreloadKey();
        this.f = eVar.getSessionId();
        this.g = eVar.g;
    }

    public void setPageSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38992730", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String getPageSpm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6cf44f6e", new Object[]{this}) : this.g;
    }

    public void updateSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253780f", new Object[]{this});
        } else {
            this.f = SystemClock.elapsedRealtime();
        }
    }

    public long getSessionId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2d5ee96", new Object[]{this})).longValue() : this.f;
    }

    public long getPreloadKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("afd1a607", new Object[]{this})).longValue() : this.e;
    }

    public void setPreloadKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813a2c85", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public boolean isInShop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58256d90", new Object[]{this})).booleanValue();
        }
        if (com.etao.feimagesearch.config.b.am()) {
            return false;
        }
        return !StringUtils.isEmpty(this.c) || !StringUtils.isEmpty(this.d);
    }

    public final void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        this.b = uri;
        String queryParameter = uri.getQueryParameter("pssource");
        if (queryParameter == null && com.etao.feimagesearch.config.b.cL()) {
            queryParameter = "";
        }
        setPssource(queryParameter);
        setSellerId(uri.getQueryParameter("sellerId"));
        setShopId(uri.getQueryParameter("shopId"));
        String queryParameter2 = uri.getQueryParameter("sessionId");
        try {
            if (!StringUtils.isEmpty(queryParameter2)) {
                this.f = Long.parseLong(queryParameter2);
            }
        } catch (Exception unused) {
            this.f = -1L;
        }
        String queryParameter3 = uri.getQueryParameter("pageSpm");
        if (StringUtils.isEmpty(queryParameter3)) {
            return;
        }
        this.g = queryParameter3;
    }

    public final void b(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1655047", new Object[]{this, builder});
            return;
        }
        builder.appendQueryParameter("pssource", getPssource());
        if (StringUtils.isEmpty(this.g) || !com.etao.feimagesearch.config.b.bc()) {
            return;
        }
        builder.appendQueryParameter("spm", this.g);
    }

    public Intent createJumpIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f2fe66", new Object[]{this});
        }
        Intent a2 = a();
        Uri.Builder buildUpon = b().buildUpon();
        b(buildUpon);
        a(buildUpon);
        a2.setData(buildUpon.build());
        return a2;
    }

    public String getPssource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b02a625", new Object[]{this}) : this.f6809a;
    }

    public void setPssource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02f78f1", new Object[]{this, str});
        } else {
            this.f6809a = str;
        }
    }

    public Uri getRawUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("53eb965b", new Object[]{this}) : this.b;
    }

    public void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getSellerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("822c6289", new Object[]{this}) : this.c;
    }

    public void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getShopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this}) : this.d;
    }
}
