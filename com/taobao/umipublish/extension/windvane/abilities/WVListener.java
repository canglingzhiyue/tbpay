package com.taobao.umipublish.extension.windvane.abilities;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.wvplugin.a;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import tb.kge;

/* loaded from: classes9.dex */
public class WVListener implements BaseAbility.Listener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f23352a;

    static {
        kge.a(503247057);
        kge.a(-336987459);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    public WVListener(WVCallBackContext wVCallBackContext) {
        this.f23352a = wVCallBackContext;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put(a.RESULT_KEY, "HY_SUCCESS");
        this.f23352a.success(jSONObject.toJSONString());
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        r rVar = new r("HY_FAILED");
        rVar.a("errorCode", str);
        rVar.a("errorMsg", str2);
        this.f23352a.error(rVar);
    }
}
