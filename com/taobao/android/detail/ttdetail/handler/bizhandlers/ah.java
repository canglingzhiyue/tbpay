package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ah implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "toast";

    /* renamed from: a  reason: collision with root package name */
    private Context f10681a;

    static {
        kge.a(834645546);
        kge.a(1967244270);
    }

    public ah(Context context) {
        this.f10681a = context;
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
        String string = b.getString("message");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        Toast.makeText(this.f10681a, string, 0).show();
        return true;
    }
}
