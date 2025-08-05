package com.taobao.android.xsearchplugin.weex.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends WXSDKInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0626a f16275a;
    private a b;
    private h c;

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2);
    }

    static {
        kge.a(1007864655);
    }

    public d(Context context) {
        super(context);
    }

    public void a(a.InterfaceC0626a interfaceC0626a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd64708", new Object[]{this, interfaceC0626a});
        } else {
            this.f16275a = interfaceC0626a;
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9e4e176b", new Object[]{this}) : this.b;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f4d0e5", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public h b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8235da63", new Object[]{this}) : this.c;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e64f2be", new Object[]{this, hVar});
        } else {
            this.c = hVar;
        }
    }
}
