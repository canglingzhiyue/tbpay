package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.Map;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class aa implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "disappear";

    /* renamed from: a  reason: collision with root package name */
    private Context f10672a;
    private eyx b;

    static {
        kge.a(518018451);
        kge.a(1967244270);
    }

    public aa(Context context, eyx eyxVar) {
        this.f10672a = context;
        this.b = eyxVar;
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
        String string = b.getString("trackPage");
        if (TextUtils.isEmpty(string) || com.taobao.android.u.a() == null) {
            return false;
        }
        JSONObject a2 = com.taobao.android.detail.ttdetail.utils.m.a(this.b.a());
        a2.putAll(b);
        try {
            odg.l().b("Page_Detail", string, null, null, com.taobao.android.detail.ttdetail.utils.m.a((Map<String, ? extends Object>) a2));
        } catch (Throwable unused) {
        }
        return true;
    }
}
