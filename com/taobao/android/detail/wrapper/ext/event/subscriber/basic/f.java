package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.k;
import com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.utils.VesselType;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class f implements j<k> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11275a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private DetailCoreActivity f;

    static {
        kge.a(2026647312);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kVar}) : a(kVar);
    }

    public f(DetailCoreActivity detailCoreActivity) {
        this.f = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenRecommendFloatSubscriber");
    }

    public com.taobao.android.trade.event.i a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("a5f67428", new Object[]{this, kVar});
        }
        this.f11275a = kVar.f9706a;
        this.b = kVar.c;
        this.c = kVar.d;
        this.d = kVar.b;
        this.e = kVar.a();
        this.f11275a = a(this.f11275a, this.b, this.c, this.d);
        TLog.logd("OpenRecommendFloatSubscriber", "丢进Vessel容器的Url == " + this.f11275a);
        FloatVesselFragment floatVesselFragment = new FloatVesselFragment();
        floatVesselFragment.loadUrl(VesselType.Weex, this.f11275a, null);
        floatVesselFragment.show(this.f.getSupportFragmentManager(), "");
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{this, str, str2, str3, str4});
        }
        StringBuilder sb = new StringBuilder("");
        if (!TextUtils.isEmpty(str)) {
            sb = new StringBuilder(str);
            if (str.contains("?")) {
                String str5 = str.split("\\?")[1];
                if (!TextUtils.isEmpty(str2) && !str5.contains("sellerId")) {
                    sb.append("&sellerId=");
                    sb.append(str2);
                }
                if (!TextUtils.isEmpty(str3) && !str5.contains("shopId")) {
                    sb.append("&shopId=");
                    sb.append(str3);
                }
                if (!TextUtils.isEmpty(str4) && !str5.contains("itemId")) {
                    sb.append("&itemId=");
                    sb.append(str4);
                }
                if (!str5.contains("detail_v")) {
                    sb.append("&detail_v=");
                    sb.append(com.taobao.android.detail.core.request.b.b);
                }
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("?sellerId=");
                    sb.append(str2);
                    z = true;
                }
                if (!TextUtils.isEmpty(str3)) {
                    if (!z) {
                        sb.append("?shopId=");
                    } else {
                        sb.append("&shopId=");
                    }
                    sb.append(str3);
                    z = true;
                }
                if (!TextUtils.isEmpty(str4)) {
                    if (!z) {
                        sb.append("?itemId=");
                    } else {
                        sb.append("&itemId=");
                    }
                    sb.append(str4);
                    z = true;
                }
                if (!z) {
                    sb.append("?detail_v=");
                } else {
                    sb.append("&detail_v=");
                }
                sb.append(com.taobao.android.detail.core.request.b.b);
            }
        }
        return sb.toString();
    }
}
