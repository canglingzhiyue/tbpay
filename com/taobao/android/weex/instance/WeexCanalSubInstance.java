package com.taobao.android.weex.instance;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.g;
import tb.jub;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexCanalSubInstance extends WeexDOMInstance implements jub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeexCanalMainInstance f15868a;

    static {
        kge.a(-1134322694);
        kge.a(1751677537);
    }

    public static /* synthetic */ Object ipc$super(WeexCanalSubInstance weexCanalSubInstance, String str, Object... objArr) {
        if (str.hashCode() == 743373420) {
            return super.getExtend((Class) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static WeexCanalSubInstance a(Context context, String str, String str2, WeexCanalMainInstance weexCanalMainInstance, JSONObject jSONObject, b bVar, jvb jvbVar, WeexInstanceImpl weexInstanceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCanalSubInstance) ipChange.ipc$dispatch("98244fed", new Object[]{context, str, str2, weexCanalMainInstance, jSONObject, bVar, jvbVar, weexInstanceImpl, new Integer(i)});
        }
        g gVar = new g(context, str, str2, WeexInstanceInternalMode.CANAL_SUB, WeexRenderType.UNICORN);
        gVar.h = weexCanalMainInstance;
        gVar.f = jSONObject;
        gVar.g = bVar;
        gVar.i = weexInstanceImpl;
        gVar.j = i;
        if (gVar.g == null) {
            gVar.g = new b();
        }
        if (gVar.g.a() == null) {
            gVar.g.a(new WeexUnicornConfig());
        }
        gVar.g.a().c().put("enable-share-thread", "false");
        WeexCanalSubInstance weexCanalSubInstance = new WeexCanalSubInstance(gVar);
        weexCanalSubInstance.bindJSThread(weexCanalMainInstance.getJSThreadHandler());
        postInstanceCreate(weexCanalSubInstance, jvbVar);
        return weexCanalSubInstance;
    }

    private WeexCanalSubInstance(g gVar) {
        super(gVar);
        this.f15868a = (WeexCanalMainInstance) gVar.h;
    }

    public String a(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{this, strArr}) : this.f15868a.a().a(getAdapterMUSInstance(), strArr);
    }

    @Override // com.taobao.android.weex.instance.WeexDOMInstance, com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls}) : cls == jub.class ? this : (T) super.getExtend(cls);
    }

    @Override // tb.jub
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a((WeexValue) null);
        }
    }

    public void a(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b510c124", new Object[]{this, weexValue});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.createAppContext(this.mNativePtr, weexValue);
        }
    }
}
