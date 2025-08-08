package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.Map;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class al implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "ut_exposure";

    /* renamed from: a  reason: collision with root package name */
    private Context f10687a;
    private eyx b;

    static {
        kge.a(132833269);
        kge.a(1967244270);
    }

    public al(Context context, eyx eyxVar) {
        this.f10687a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        AliUserTrackerInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null || (a2 = com.taobao.android.u.a()) == null) {
            return false;
        }
        String string = b.getString("trackPage");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        JSONObject a3 = com.taobao.android.detail.ttdetail.utils.m.a(this.b.a());
        a3.putAll(b);
        JSONObject a4 = com.taobao.android.detail.ttdetail.utils.m.a(this.f10687a);
        if (a4 != null) {
            a3.putAll(a4);
        }
        a2.a("Page_Detail", 2201, string, null, null, com.taobao.android.detail.ttdetail.utils.m.a(a3));
        try {
            odg.l().a("Page_Detail", string, null, null, com.taobao.android.detail.ttdetail.utils.m.a((Map<String, ? extends Object>) a3));
        } catch (Throwable unused) {
        }
        return true;
    }
}
