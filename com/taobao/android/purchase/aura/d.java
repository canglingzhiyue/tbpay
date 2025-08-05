package com.taobao.android.purchase.aura;

import android.app.Activity;
import com.ali.adapt.api.AtlasServiceFinder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.awi;
import tb.dsr;
import tb.dsu;
import tb.dsv;
import tb.dsw;
import tb.dsx;
import tb.dug;
import tb.icr;
import tb.ics;
import tb.ict;
import tb.icu;
import tb.icx;
import tb.idp;
import tb.idw;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends dsr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "purchase";

    /* renamed from: a  reason: collision with root package name */
    private final Activity f14731a;
    private final icu c;
    private final ict d;
    private final ics e;
    private final dug f;
    private final icr b = new icr();
    private final idp g = new idp();

    static {
        kge.a(1425276239);
    }

    @Override // com.taobao.android.buy.internal.b
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "Page_ConfirmOrder";
    }

    public d(Activity activity, HashMap<String, Object> hashMap, c cVar, a aVar) {
        this.f14731a = activity;
        this.c = new icu(hashMap);
        this.d = new ict(activity);
        this.e = new ics(activity);
        this.f = new idw(activity, cVar, aVar);
    }

    @Override // com.taobao.android.buy.internal.b
    public Activity b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("233c125f", new Object[]{this}) : this.f14731a;
    }

    @Override // com.taobao.android.buy.internal.b
    public dsu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsu) ipChange.ipc$dispatch("2618c835", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.buy.internal.b
    public dsx f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsx) ipChange.ipc$dispatch("357c1350", new Object[]{this}) : this.c;
    }

    @Override // tb.dsr, com.taobao.android.buy.internal.b
    public dsw a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsw) ipChange.ipc$dispatch("2d45ec4", new Object[]{this, activity}) : this.d;
    }

    @Override // com.taobao.android.buy.internal.b
    public dug g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dug) ipChange.ipc$dispatch("3d2dbe22", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.android.buy.internal.b
    public dsv e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsv) ipChange.ipc$dispatch("2dca6db3", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.buy.internal.b
    public awi.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (awi.a) ipChange.ipc$dispatch("8592cac7", new Object[]{this}) : this.g;
    }

    @Override // tb.dsr, com.taobao.android.buy.internal.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            AtlasServiceFinder.getInstance().registerService(icx.a.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService");
        }
    }
}
