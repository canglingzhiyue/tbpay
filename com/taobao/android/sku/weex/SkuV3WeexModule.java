package com.taobao.android.sku.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuV3WeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Sku_V3_Detail";

    static {
        kge.a(-1367607490);
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            return WXSDKEngine.registerModule("Sku_V3_Detail", SkuV3WeexModule.class);
        } catch (Throwable unused) {
            return false;
        }
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map, final JSCallback jSCallback, final JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4edb11", new Object[]{this, map, jSCallback, jSCallback2});
        } else {
            e.a(4, map, new a() { // from class: com.taobao.android.sku.weex.SkuV3WeexModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.weex.a
                public void a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                    } else if (jSCallback == null) {
                    } else {
                        jSCallback.invoke((objArr == null || objArr.length <= 0) ? null : objArr[0]);
                    }
                }

                @Override // com.taobao.android.sku.weex.a
                public void b(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                    } else if (jSCallback == null) {
                    } else {
                        jSCallback.invokeAndKeepAlive((objArr == null || objArr.length <= 0) ? null : objArr[0]);
                    }
                }
            }, new a() { // from class: com.taobao.android.sku.weex.SkuV3WeexModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.weex.a
                public void a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                    } else if (jSCallback2 == null) {
                    } else {
                        jSCallback2.invoke((objArr == null || objArr.length <= 0) ? null : objArr[0]);
                    }
                }

                @Override // com.taobao.android.sku.weex.a
                public void b(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                    } else if (jSCallback2 == null) {
                    } else {
                        jSCallback2.invokeAndKeepAlive((objArr == null || objArr.length <= 0) ? null : objArr[0]);
                    }
                }
            });
        }
    }
}
