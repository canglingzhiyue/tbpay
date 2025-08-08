package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.n;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.vessel.utils.VesselType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.eei;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.fck;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends eei<fck> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11271a;
    private JSONObject b;
    private DetailCoreActivity c;

    static {
        kge.a(995534855);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenCommonFloatVesselSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((fck) event);
    }

    public b(DetailCoreActivity detailCoreActivity) {
        this.c = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenCommonFloatVesselSubscriber");
    }

    public com.taobao.android.trade.event.i a(fck fckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("6b085a5", new Object[]{this, fckVar});
        }
        this.f11271a = fckVar.f27802a;
        if (StringUtils.isEmpty(this.f11271a)) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        this.b = fckVar.b;
        JSONObject jSONObject = this.b;
        if (jSONObject != null && !StringUtils.isEmpty(jSONObject.getString("needLogin"))) {
            try {
                if (Boolean.parseBoolean(this.b.getString("needLogin").toLowerCase()) && !epj.c().b()) {
                    epj.c().a(true);
                    return com.taobao.android.detail.core.event.a.SUCCESS;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return com.taobao.android.detail.core.event.a.FAILURE;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ttid", epo.f());
        hashMap.put("detail_v", com.taobao.android.detail.core.request.b.b);
        a();
        this.f11271a = a(this.f11271a, hashMap);
        FloatVesselFragment floatVesselFragment = new FloatVesselFragment();
        floatVesselFragment.setEventKey(n.EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE);
        floatVesselFragment.loadUrl(VesselType.Weex, this.f11271a, this.b);
        floatVesselFragment.show(this.c.getSupportFragmentManager(), "");
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!(this.c instanceof DetailActivity) || this.b == null || !Boolean.TRUE.toString().equals(this.b.getString("needAddressId"))) {
        } else {
            String aj = ((DetailActivity) this.c).aj();
            if (StringUtils.isEmpty(aj)) {
                return;
            }
            this.f11271a = a(this.f11271a, "addressId", aj);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        if (StringUtils.isEmpty(str) || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            if (map.get(str2) != null && (buildUpon.build() == null || buildUpon.build().getQuery() == null || !buildUpon.build().getQuery().contains(str2))) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
        }
        return buildUpon.toString();
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        if (str == null || str2 == null || str3 == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str4 : queryParameterNames) {
            boolean equals = str2.equals(str4);
            if (equals) {
                z = true;
            }
            clearQuery.appendQueryParameter(str4, equals ? str3 : parse.getQueryParameter(str4));
        }
        if (!z) {
            clearQuery.appendQueryParameter(str2, str3);
        }
        return clearQuery.toString();
    }
}
