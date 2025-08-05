package com.taobao.taobao.internal.helper;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbabilitykit.m;
import com.taobao.taobao.internal.helper.AbilityParams;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AbilityPop";

    public static void a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa971818", new Object[]{activity, str, str2, str3});
            return;
        }
        String str4 = "showWeexPopOfPaySuccessPage: url=" + str3;
        alu aluVar = new alu(new alr(str, "weex2Pop").a((Context) activity));
        AbilityParams abilityParams = new AbilityParams();
        abilityParams.popId = str2;
        abilityParams.bizId = str;
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.f21211a = com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT;
        bVar.b = "false";
        bVar.d = "#FFFFFF";
        bVar.e = 0.8f;
        bVar.c = "activity";
        abilityParams.popConfig = bVar;
        abilityParams.url = str3;
        aluVar.b("stdPop", m.API_WEEX2, new alq().a(activity.getWindow().getDecorView()), (JSONObject) JSON.toJSON(abilityParams), new alo() { // from class: com.taobao.taobao.internal.helper.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                String str5;
                String str6;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else if (executeResult instanceof FinishResult) {
                } else {
                    String str7 = "";
                    if (executeResult instanceof ErrorResult) {
                        ErrorResult errorResult = (ErrorResult) executeResult;
                        str7 = errorResult.a();
                        str6 = errorResult.b();
                        str5 = errorResult.f();
                    } else {
                        str5 = str7;
                        str6 = str5;
                    }
                    AdapterForTLog.loge(a.TAG, "code=" + str7 + ",message=" + str6 + ",type=" + str5);
                }
            }
        });
    }
}
