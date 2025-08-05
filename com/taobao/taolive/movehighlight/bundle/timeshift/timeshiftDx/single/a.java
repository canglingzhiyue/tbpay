package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import java.util.Map;
import tb.ibq;
import tb.kge;
import tb.pfx;

/* loaded from: classes8.dex */
public class a implements ibq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DXRootView f21449a;
    private com.taobao.alilive.aliliveframework.frame.a b;

    static {
        kge.a(-966048141);
        kge.a(-1580083194);
    }

    @Override // tb.ibq
    public void a(LiveTimemovingModel liveTimemovingModel, int i, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6017a50", new Object[]{this, liveTimemovingModel, new Integer(i), dXRuntimeContext});
        }
    }

    public a(DXRootView dXRootView, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f21449a = dXRootView;
        this.b = aVar;
    }

    @Override // tb.ibq
    public void a(String str, DXRuntimeContext dXRuntimeContext) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aaa423", new Object[]{this, str, dXRuntimeContext});
            return;
        }
        DXRootView dXRootView = this.f21449a;
        if (dXRootView == null || (data = dXRootView.getData()) == null) {
            return;
        }
        pfx.a().a(this.f21449a, (JSONObject) data.clone(), this.b);
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else {
            this.f21449a = dXRootView;
        }
    }

    @Override // tb.ibq
    public void a(String str, Map<String, String> map, DXRuntimeContext dXRuntimeContext) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437d5b44", new Object[]{this, str, map, dXRuntimeContext});
            return;
        }
        DXRootView dXRootView = this.f21449a;
        if (dXRootView == null || (data = dXRootView.getData()) == null) {
            return;
        }
        JSONObject jSONObject = data.getJSONObject("personalityData");
        if (jSONObject != null) {
            jSONObject.putAll(map);
        }
        pfx.a().a(this.f21449a, (JSONObject) data.clone(), this.b);
    }
}
