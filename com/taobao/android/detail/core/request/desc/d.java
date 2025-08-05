package com.taobao.android.detail.core.request.desc;

import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static final String K_ITEM_ID = "itemId";
    public static final String K_SELLER_ID = "sellerId";
    public static final String TTID = "ttid";

    /* renamed from: a  reason: collision with root package name */
    public String f9832a;
    public String b;
    public String c;
    public Map<String, String> d;
    public Map<String, String> e;

    static {
        kge.a(-2146663925);
    }

    public d(String str, String str2, String str3) {
        this.f9832a = str;
        this.b = str2;
        this.c = str3;
        emu.a("com.taobao.android.detail.core.request.desc.DescRequestParams");
    }
}
