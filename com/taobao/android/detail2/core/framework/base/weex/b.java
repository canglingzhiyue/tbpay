package com.taobao.android.detail2.core.framework.base.weex;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(321725212);
        kge.a(543928825);
        kge.a(944534148);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void a(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266c25a8", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350b2c8a", new Object[]{this, aVar, view});
        }
    }

    public void a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b69cca8", new Object[]{this, aVar, jSONObject});
        }
    }

    public void a(a aVar, ContainerError containerError, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3c650a", new Object[]{this, aVar, containerError, str});
        }
    }

    public void a(a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d2861e", new Object[]{this, aVar, str, jSONObject});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5805a85c", new Object[]{this, aVar, str, str2});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void b(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaa9547", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void b(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3887703b", new Object[]{this, aVar, str, str2});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void c(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1909381a", new Object[]{this, aVar, str, str2});
        }
    }
}
