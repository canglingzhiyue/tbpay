package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.ezm;
import tb.kge;
import tb.soc;

/* loaded from: classes5.dex */
public class an implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "locatorTo";

    /* renamed from: a  reason: collision with root package name */
    private Context f10689a;

    static {
        kge.a(1511207648);
        kge.a(1967244270);
    }

    public an(Context context) {
        this.f10689a = context;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        String string = b.getString("locatorId");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10689a, new soc(string));
        return true;
    }
}
