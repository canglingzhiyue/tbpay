package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.FloatVesselFragment;
import com.taobao.vessel.utils.VesselType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class n implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_OPENFLOATDIALOG = "openFloatDialog";
    public static final String EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE = "open_common_float_dialog";
    public static final String EVENT_TYPE_OPENWEEXFLOAT = "openWeexFloat";
    public static final String NEED_ADDRESS_ID_KEY = "needAddressId";

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f10718a;
    private eyx b;
    private a c;
    private String d;
    private JSONObject e;

    /* loaded from: classes5.dex */
    public interface a {
        String a();
    }

    static {
        kge.a(376866455);
        kge.a(1967244270);
    }

    public n(Context context, eyx eyxVar, a aVar) {
        if (context instanceof FragmentActivity) {
            this.f10718a = (FragmentActivity) context;
        }
        this.b = eyxVar;
        this.c = aVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        FragmentActivity fragmentActivity;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (fragmentActivity = this.f10718a) == null || com.taobao.android.detail.ttdetail.utils.y.a(fragmentActivity) || (b = aVar.b()) == null) {
            return false;
        }
        this.d = b.getString("url");
        if (StringUtils.isEmpty(this.d)) {
            return false;
        }
        this.e = b;
        if (!StringUtils.isEmpty(this.e.getString("needLogin"))) {
            try {
                if (Boolean.parseBoolean(this.e.getString("needLogin").toLowerCase()) && !com.taobao.android.detail.ttdetail.utils.ao.c()) {
                    com.taobao.android.detail.ttdetail.utils.ao.a(true);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ttid", com.taobao.android.detail.ttdetail.utils.e.c());
        hashMap.put("detail_v", "3.3.2");
        a();
        this.d = a(this.d, hashMap);
        FloatVesselFragment floatVesselFragment = new FloatVesselFragment();
        floatVesselFragment.setDetailContext(this.b);
        floatVesselFragment.setOriginalAddressId(this.c.a());
        floatVesselFragment.setEventKey(EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE);
        floatVesselFragment.loadUrl(VesselType.Weex, this.d, this.e);
        floatVesselFragment.show(this.f10718a.getSupportFragmentManager(), "");
        return true;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e == null || !Boolean.TRUE.toString().equals(this.e.getString("needAddressId"))) {
        } else {
            String a2 = this.c.a();
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            this.d = a(this.d, "addressId", a2);
        }
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
