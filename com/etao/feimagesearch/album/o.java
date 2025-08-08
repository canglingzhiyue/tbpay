package com.etao.feimagesearch.album;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.tao.shop.common.ShopConstants;
import tb.kge;

/* loaded from: classes3.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f6497a;
    private String b;
    private int c;
    private boolean d;
    private String e;
    private long f;
    private String g;
    private long h;
    private int i;
    private Uri j;
    private boolean k;

    static {
        kge.a(1307766728);
    }

    public o(long j, String str, int i, long j2, boolean z) {
        this.k = false;
        this.f6497a = j;
        this.b = str;
        this.c = i;
        this.f = j2;
        this.k = z;
    }

    public o(long j, String str, String str2, long j2, long j3, boolean z) {
        this.k = false;
        this.f6497a = j;
        this.b = str;
        this.e = str2;
        this.f = j2;
        String str3 = Build.BRAND;
        if (!z && ("Xiaomi".equals(str3) || "Redmi".equals(str3))) {
            this.h = j3;
        } else {
            this.h = j3 / 1000;
        }
        this.g = m();
        this.d = true;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : this.h <= ((long) i);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.h <= 0;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.g;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.h;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.f;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.f6497a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.b;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.c;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : StringUtils.isEmpty(this.b) ? FactoryType.TYPE_INVALID : !this.k ? "unknown" : this.b.contains("com.ss.android.ugc.aweme") ? "douyin" : this.b.contains("com.xunmeng.pinduoduo") ? "pinduoduo" : this.b.contains("com.xingin.xhs") ? "xiaohongshu" : this.b.contains("com.taobao.taobao") ? "taobao" : this.b.contains("com.smile.gifmaker") ? "kuaishou" : this.b.contains("com.jingdong.app.mall") ? "jingdong" : this.b.contains("com.shizhuang.duapp") ? "dewu" : this.b.contains("com.achievo.vipshop") ? "weipinhui" : this.b.contains("com.dangdang.buy2") ? "dangdang" : this.b.contains("com.taobao.idlefish") ? "xianyu" : this.b.contains("com.") ? "other" : "";
    }

    public Uri j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("43b90728", new Object[]{this});
        }
        Uri uri = this.j;
        if (uri != null) {
            return uri;
        }
        return ContentUris.withAppendedId(c() ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f6497a);
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.i;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else {
            this.j = uri;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.k;
    }

    private String m() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        int i2 = (int) this.h;
        int i3 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        int i4 = (i2 - (i3 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
        String str = c(i4) + ":" + c(i - (i4 * 60));
        if (i3 == 0) {
            return str;
        }
        return c(i3) + ":" + str;
    }

    private static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)});
        }
        if (i < 10) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    public o o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("60b9c10f", new Object[]{this});
        }
        o oVar = new o(this.f6497a, this.b, this.c, this.f, this.k);
        oVar.d = this.d;
        oVar.e = this.e;
        oVar.g = this.g;
        oVar.h = this.h;
        oVar.i = this.i;
        oVar.j = this.j;
        return oVar;
    }
}
