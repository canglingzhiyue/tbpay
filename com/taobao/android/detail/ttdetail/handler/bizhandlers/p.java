package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.dkt;
import tb.dll;
import tb.dlr;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class p implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPop";

    /* renamed from: a  reason: collision with root package name */
    private Context f10720a;
    private eyx b;

    static {
        kge.a(-190028310);
        kge.a(1967244270);
    }

    public p(Context context, eyx eyxVar) {
        this.f10720a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        View c = com.taobao.android.detail.ttdetail.utils.a.c(runtimeAbilityParamArr);
        if (c == null) {
            Context context = this.f10720a;
            if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
                c = window.getDecorView();
            }
        }
        if (c == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenPopImplementor", "not found root view");
            return false;
        }
        dlr dlrVar = new dlr();
        dlrVar.a(this.f10720a);
        dlrVar.a(c);
        new dkt().a(b, dlrVar, (dll) null);
        return true;
    }
}
