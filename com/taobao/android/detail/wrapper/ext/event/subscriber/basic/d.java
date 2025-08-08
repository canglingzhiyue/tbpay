package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.n;
import com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.vessel.utils.VesselType;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.fcl;
import tb.kge;

/* loaded from: classes5.dex */
public class d implements j<fcl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11273a;
    private JSONObject b;
    private DetailCoreActivity c;

    static {
        kge.a(189723709);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(fcl fclVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fclVar}) : a(fclVar);
    }

    public d(DetailCoreActivity detailCoreActivity) {
        this.c = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenFloatWeexSubscriber");
    }

    public com.taobao.android.trade.event.i a(fcl fclVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("1a585926", new Object[]{this, fclVar});
        }
        this.f11273a = fclVar.f27803a;
        if (StringUtils.isEmpty(this.f11273a)) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        this.b = fclVar.b;
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
        this.f11273a = a(this.f11273a, hashMap);
        FloatVesselFragment newInstance = FloatVesselFragment.newInstance(true);
        newInstance.setEventKey(n.EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE);
        newInstance.loadUrl(VesselType.Weex, this.f11273a, this.b);
        newInstance.show(this.c.getSupportFragmentManager(), "");
        return com.taobao.android.detail.core.event.a.SUCCESS;
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
}
