package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ar;
import tb.alo;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ad implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "stdPop.showH5";

    /* renamed from: a  reason: collision with root package name */
    private Activity f10675a;

    static {
        kge.a(1466903747);
        kge.a(1967244270);
    }

    public ad(Context context) {
        if (context instanceof Activity) {
            this.f10675a = (Activity) context;
        }
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
        Activity activity = this.f10675a;
        ExecuteResult a2 = ar.a(activity, activity.getWindow().getDecorView(), "stdPop", com.taobao.android.tbabilitykit.m.API_H5, b, new alo() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.StdPopShowH5Implementor$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        });
        if (!(a2 instanceof ErrorResult)) {
            return true;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("StdPopShowH5Implementor", "execute error:" + ((ErrorResult) a2).a());
        return false;
    }
}
