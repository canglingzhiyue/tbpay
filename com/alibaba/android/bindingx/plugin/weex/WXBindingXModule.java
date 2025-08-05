package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import android.view.View;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.i;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXViewUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.riy;

/* loaded from: classes2.dex */
public class WXBindingXModule extends WXSDKEngine.DestroyableModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.alibaba.android.bindingx.core.d mBindingXCore;
    private com.alibaba.android.bindingx.core.i mPlatformManager;

    public static /* synthetic */ Object ipc$super(WXBindingXModule wXBindingXModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.alibaba.android.bindingx.core.d access$000(WXBindingXModule wXBindingXModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.bindingx.core.d) ipChange.ipc$dispatch("722821bf", new Object[]{wXBindingXModule}) : wXBindingXModule.mBindingXCore;
    }

    public static /* synthetic */ com.alibaba.android.bindingx.core.d access$002(WXBindingXModule wXBindingXModule, com.alibaba.android.bindingx.core.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.bindingx.core.d) ipChange.ipc$dispatch("8f84339", new Object[]{wXBindingXModule, dVar});
        }
        wXBindingXModule.mBindingXCore = dVar;
        return dVar;
    }

    public WXBindingXModule() {
    }

    public WXBindingXModule(com.alibaba.android.bindingx.core.d dVar) {
        this.mBindingXCore = dVar;
    }

    private void prepareInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e4b36b", new Object[]{this});
            return;
        }
        if (this.mPlatformManager == null) {
            this.mPlatformManager = createPlatformManager(this.mWXSDKInstance);
        }
        if (this.mBindingXCore != null) {
            return;
        }
        this.mBindingXCore = new com.alibaba.android.bindingx.core.d(this.mPlatformManager);
        this.mBindingXCore.a("scroll", new d.b<com.alibaba.android.bindingx.core.e, Context, com.alibaba.android.bindingx.core.i>() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public com.alibaba.android.bindingx.core.e a(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.bindingx.core.e) ipChange2.ipc$dispatch("400a90e5", new Object[]{this, context, iVar, objArr}) : new g(context, iVar, objArr);
            }
        });
        this.mBindingXCore.a("pan", new d.b<com.alibaba.android.bindingx.core.e, Context, com.alibaba.android.bindingx.core.i>() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public com.alibaba.android.bindingx.core.e a(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.bindingx.core.e) ipChange2.ipc$dispatch("400a90e5", new Object[]{this, context, iVar, objArr}) : new d(context, iVar, objArr);
            }
        });
        this.mBindingXCore.a("pinch", new d.b<com.alibaba.android.bindingx.core.e, Context, com.alibaba.android.bindingx.core.i>() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public com.alibaba.android.bindingx.core.e a(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.bindingx.core.e) ipChange2.ipc$dispatch("400a90e5", new Object[]{this, context, iVar, objArr}) : new e(context, iVar, objArr);
            }
        });
        this.mBindingXCore.a("rotation", new d.b<com.alibaba.android.bindingx.core.e, Context, com.alibaba.android.bindingx.core.i>() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public com.alibaba.android.bindingx.core.e a(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.bindingx.core.e) ipChange2.ipc$dispatch("400a90e5", new Object[]{this, context, iVar, objArr}) : new f(context, iVar, objArr);
            }
        });
    }

    @JSMethod(uiThread = false)
    public void prepare(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7987b7", new Object[]{this, map});
        } else {
            prepareInternal();
        }
    }

    @JSMethod(uiThread = false)
    public Map<String, String> bind(Map<String, Object> map, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aad72a1c", new Object[]{this, map, jSCallback});
        }
        String str = null;
        try {
            com.alibaba.android.bindingx.core.c.a("weex", this.mWXSDKInstance != null ? this.mWXSDKInstance.ak() : null);
        } catch (Throwable unused) {
        }
        prepareInternal();
        com.alibaba.android.bindingx.core.d dVar = this.mBindingXCore;
        Context O = this.mWXSDKInstance == null ? null : this.mWXSDKInstance.O();
        if (this.mWXSDKInstance != null) {
            str = this.mWXSDKInstance.N();
        }
        String str2 = str;
        if (map == null) {
            map = Collections.emptyMap();
        }
        String a2 = dVar.a(O, str2, map, new d.a() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.7
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
        }, new Object[0]);
        HashMap hashMap = new HashMap(2);
        hashMap.put("token", a2);
        return hashMap;
    }

    @JSMethod(uiThread = false)
    public void bindAsync(Map<String, Object> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60462d3f", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        Map<String, String> bind = bind(map, jSCallback);
        if (jSCallback2 == null || bind == null) {
            return;
        }
        jSCallback2.invoke(bind);
    }

    @JSMethod(uiThread = false)
    public void unbind(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c175de08", new Object[]{this, map});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mBindingXCore;
        if (dVar == null) {
            return;
        }
        dVar.a(map);
    }

    @JSMethod(uiThread = false)
    public void unbindAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f807f272", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.d dVar = this.mBindingXCore;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @JSMethod(uiThread = false)
    public List<String> supportFeatures() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a54d7e34", new Object[]{this}) : Arrays.asList("pan", "orientation", "timing", "scroll", "experimentalGestureFeatures");
    }

    @JSMethod(uiThread = false)
    public void getComputedStyleAsync(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd0dfe9", new Object[]{this, str, jSCallback});
            return;
        }
        Map<String, Object> computedStyle = getComputedStyle(str);
        if (jSCallback == null) {
            return;
        }
        jSCallback.invoke(computedStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0246  */
    @com.taobao.weex.annotation.JSMethod(uiThread = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> getComputedStyle(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.getComputedStyle(java.lang.String):java.util.Map");
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (WXBindingXModule.access$000(WXBindingXModule.this) != null) {
                        WXBindingXModule.access$000(WXBindingXModule.this).a();
                        WXBindingXModule.access$002(WXBindingXModule.this, null);
                    }
                    j.a();
                }
            }, (Object) null);
        }
    }

    public static com.alibaba.android.bindingx.core.i createPlatformManager(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.bindingx.core.i) ipChange.ipc$dispatch("d1c5a8c6", new Object[]{wXSDKInstance});
        }
        final int y = wXSDKInstance == null ? 750 : wXSDKInstance.y();
        return new i.a().a(new i.d() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.i.d
            public View a(String str, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("c8786441", new Object[]{this, str, objArr});
                }
                if (objArr.length > 0 && (objArr[0] instanceof String)) {
                    return i.a((String) objArr[0], str);
                }
                return null;
            }
        }).a(new i.e() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.i.e
            public void a(View view, String str, Object obj, i.b bVar, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb2be52b", new Object[]{this, view, str, obj, bVar, map, objArr});
                } else if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String)) {
                } else {
                    String str2 = (String) objArr[0];
                    String str3 = (String) objArr[1];
                    WXComponent b = i.b(str3, str2);
                    if (b != null) {
                        j.a(str).a(b, view, obj, bVar, map);
                        return;
                    }
                    com.alibaba.android.bindingx.core.h.d("unexpected error. component not found [ref:" + str2 + ",instanceId:" + str3 + riy.ARRAY_END_STR);
                }
            }
        }).a(new i.b() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.i.b
            public double a(double d, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("91a5be89", new Object[]{this, new Double(d), objArr})).doubleValue() : WXViewUtils.getRealPxByWidth((float) d, y);
            }

            @Override // com.alibaba.android.bindingx.core.i.b
            public double b(double d, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("15d60b8a", new Object[]{this, new Double(d), objArr})).doubleValue() : WXViewUtils.getWebPxByWidth((float) d, y);
            }
        }).a();
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WXBindingXModule.access$000(WXBindingXModule.this) == null) {
                    } else {
                        WXBindingXModule.access$000(WXBindingXModule.this).b();
                    }
                }
            }, (Object) null);
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            WXBridgeManager.getInstance().post(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.WXBindingXModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WXBindingXModule.access$000(WXBindingXModule.this) == null) {
                    } else {
                        WXBindingXModule.access$000(WXBindingXModule.this).c();
                    }
                }
            }, (Object) null);
        }
    }
}
