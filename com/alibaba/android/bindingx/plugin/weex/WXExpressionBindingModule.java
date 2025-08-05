package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.internal.l;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class WXExpressionBindingModule extends WXSDKEngine.DestroyableModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.alibaba.android.bindingx.core.d mExpressionBindingCore;
    private com.alibaba.android.bindingx.core.i mPlatformManager;

    @JSMethod
    @Deprecated
    public void enableBinding(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c208f9d", new Object[]{this, str, str2});
            return;
        }
        if (this.mPlatformManager == null) {
            this.mPlatformManager = WXBindingXModule.createPlatformManager(this.mWXSDKInstance);
        }
        if (this.mExpressionBindingCore != null) {
            return;
        }
        this.mExpressionBindingCore = new com.alibaba.android.bindingx.core.d(this.mPlatformManager);
        this.mExpressionBindingCore.a("scroll", new d.b<com.alibaba.android.bindingx.core.e, Context, com.alibaba.android.bindingx.core.i>() { // from class: com.alibaba.android.bindingx.plugin.weex.WXExpressionBindingModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public com.alibaba.android.bindingx.core.e a(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.bindingx.core.e) ipChange2.ipc$dispatch("400a90e5", new Object[]{this, context, iVar, objArr}) : new g(context, iVar, objArr);
            }
        });
    }

    @JSMethod
    @Deprecated
    public void createBinding(String str, String str2, String str3, List<Map<String, Object>> list, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaf6769", new Object[]{this, str, str2, str3, list, jSCallback});
            return;
        }
        try {
            com.alibaba.android.bindingx.core.c.a("weex", this.mWXSDKInstance != null ? this.mWXSDKInstance.ak() : null);
        } catch (Throwable unused) {
        }
        enableBinding(null, null);
        this.mExpressionBindingCore.a(str, null, str2, null, l.a((String) null, str3), list, null, new d.a() { // from class: com.alibaba.android.bindingx.plugin.weex.WXExpressionBindingModule.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.a
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    return;
                }
                JSCallback jSCallback2 = jSCallback;
                if (jSCallback2 == null) {
                    return;
                }
                jSCallback2.invokeAndKeepAlive(obj);
            }
        }, this.mWXSDKInstance == null ? null : this.mWXSDKInstance.O(), this.mWXSDKInstance == null ? null : this.mWXSDKInstance.N(), null, new Object[0]);
    }

    @JSMethod
    @Deprecated
    public void disableBinding(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b903cf98", new Object[]{this, str, str2});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mExpressionBindingCore;
        if (dVar == null) {
            return;
        }
        dVar.a(str, str2);
    }

    @JSMethod
    @Deprecated
    public void disableAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277025a0", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mExpressionBindingCore;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mExpressionBindingCore;
        if (dVar == null) {
            return;
        }
        dVar.a();
        this.mExpressionBindingCore = null;
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mExpressionBindingCore;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mExpressionBindingCore;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }
}
