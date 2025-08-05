package com.taobao.android.interactive_common.wxmodule;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.interactive_common.c;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.utils.WXViewUtils;
import java.util.HashMap;
import java.util.Map;
import tb.grr;
import tb.ohi;

/* loaded from: classes5.dex */
public class CXContentToolsModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @JSMethod
    public void getOriginalURL(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0910f9", new Object[]{this, jSCallback});
            return;
        }
        grr.a("CXContentToolsModule_getOriginalURL", null);
        if (jSCallback == null) {
            return;
        }
        if (WXEnvironment.isApkDebugable() && this.mWXSDKInstance != null) {
            ohi.a(this.mWXSDKInstance.O(), "该功能已下线，有疑问请咨询长锋");
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("originalURL", "");
        jSCallback.invoke(hashMap);
    }

    @JSMethod
    public int getStatusBarHeight(JSCallback jSCallback) {
        int identifier;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd90e542", new Object[]{this, jSCallback})).intValue();
        }
        if (this.mWXSDKInstance != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("context", String.valueOf(this.mWXSDKInstance.O()));
            hashMap.put("bundleUrl", String.valueOf(this.mWXSDKInstance.ak()));
            grr.a("CXContentToolsModule_getStatusBarHeight", hashMap);
        }
        try {
            if ((this.mWXSDKInstance.O() instanceof CXCommonActivity) && (identifier = this.mWXSDKInstance.O().getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                i = this.mWXSDKInstance.O().getResources().getDimensionPixelSize(identifier);
            }
        } catch (Throwable unused) {
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("statusBarHeight", Integer.valueOf(i));
        jSCallback.invoke(hashMap2);
        return i;
    }

    @JSMethod(uiThread = false)
    public int getStatusBarHeightSync() {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5345cc7", new Object[]{this})).intValue();
        }
        grr.a("CXContentToolsModule_getStatusBarHeightSync", null);
        c.a("getStatusBarHeightSync");
        try {
            if ((this.mWXSDKInstance.O() instanceof CXCommonActivity) && (identifier = this.mWXSDKInstance.O().getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                return this.mWXSDKInstance.O().getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @JSMethod
    public void removePreviousImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b162b307", new Object[]{this});
        } else {
            grr.a("CXContentToolsModule_removePreviousImage", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    @com.taobao.weex.annotation.JSMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float getScreenHeight(com.taobao.weex.bridge.JSCallback r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.interactive_common.wxmodule.CXContentToolsModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            java.lang.String r9 = "d97d4b48"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            return r9
        L1c:
            r0 = 0
            java.lang.String r1 = "CXContentToolsModule_getScreenHeight"
            tb.grr.a(r1, r0)
            com.taobao.weex.WXSDKInstance r0 = r8.mWXSDKInstance     // Catch: java.lang.Exception -> L9b
            android.content.Context r0 = r0.O()     // Catch: java.lang.Exception -> L9b
            boolean r0 = r0 instanceof com.taobao.android.interactive_common.CXCommonActivity     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L74
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> L9b
            r0.<init>()     // Catch: java.lang.Exception -> L9b
            com.taobao.weex.WXSDKInstance r1 = r8.mWXSDKInstance     // Catch: java.lang.Exception -> L9b
            android.content.Context r1 = r1.O()     // Catch: java.lang.Exception -> L9b
            com.taobao.android.interactive_common.CXCommonActivity r1 = (com.taobao.android.interactive_common.CXCommonActivity) r1     // Catch: java.lang.Exception -> L9b
            android.view.Window r1 = r1.getWindow()     // Catch: java.lang.Exception -> L9b
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> L9b
            r1.getWindowVisibleDisplayFrame(r0)     // Catch: java.lang.Exception -> L9b
            int r1 = r0.height()     // Catch: java.lang.Exception -> L9b
            int r0 = r0.width()     // Catch: java.lang.Exception -> L99
            com.taobao.weex.WXSDKInstance r3 = r8.mWXSDKInstance     // Catch: java.lang.Exception -> L72
            android.content.Context r3 = r3.O()     // Catch: java.lang.Exception -> L72
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = "status_bar_height"
            java.lang.String r5 = "dimen"
            java.lang.String r6 = "android"
            int r3 = r3.getIdentifier(r4, r5, r6)     // Catch: java.lang.Exception -> L72
            if (r3 <= 0) goto L9d
            com.taobao.weex.WXSDKInstance r4 = r8.mWXSDKInstance     // Catch: java.lang.Exception -> L72
            android.content.Context r4 = r4.O()     // Catch: java.lang.Exception -> L72
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Exception -> L72
            int r2 = r4.getDimensionPixelSize(r3)     // Catch: java.lang.Exception -> L72
            goto L9d
        L72:
            goto L9d
        L74:
            com.taobao.weex.WXSDKInstance r0 = r8.mWXSDKInstance     // Catch: java.lang.Exception -> L9b
            android.content.Context r0 = r0.O()     // Catch: java.lang.Exception -> L9b
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L9b
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Exception -> L9b
            int r0 = r0.heightPixels     // Catch: java.lang.Exception -> L9b
            com.taobao.weex.WXSDKInstance r1 = r8.mWXSDKInstance     // Catch: java.lang.Exception -> L98
            android.content.Context r1 = r1.O()     // Catch: java.lang.Exception -> L98
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L98
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Exception -> L98
            int r1 = r1.widthPixels     // Catch: java.lang.Exception -> L98
            r7 = r1
            r1 = r0
            r0 = r7
            goto L9d
        L98:
            r1 = r0
        L99:
            r0 = 0
            goto L9d
        L9b:
            r0 = 0
            r1 = 0
        L9d:
            int r1 = r1 + r2
            int r1 = r1 * 750
            int r1 = r1 / r0
            float r0 = (float) r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.String r3 = "screenHeight"
            r1.put(r3, r2)
            if (r9 == 0) goto Lb5
            r9.invoke(r1)
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.interactive_common.wxmodule.CXContentToolsModule.getScreenHeight(com.taobao.weex.bridge.JSCallback):float");
    }

    @JSMethod(uiThread = false)
    public float getScreenHeightSync() {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c80ed3db", new Object[]{this})).floatValue();
        }
        grr.a("CXContentToolsModule_getScreenHeightSync", null);
        c.a("begin getScreenHeightSync");
        try {
            if (this.mWXSDKInstance.O() instanceof CXCommonActivity) {
                Rect rect = new Rect();
                ((CXCommonActivity) this.mWXSDKInstance.O()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                i = rect.height();
                try {
                    rect.width();
                    int identifier = this.mWXSDKInstance.O().getResources().getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i2 = this.mWXSDKInstance.O().getResources().getDimensionPixelSize(identifier);
                    }
                } catch (Exception unused) {
                }
            } else {
                int i3 = this.mWXSDKInstance.O().getResources().getDisplayMetrics().heightPixels;
                try {
                    int i4 = this.mWXSDKInstance.O().getResources().getDisplayMetrics().widthPixels;
                } catch (Exception unused2) {
                }
                i = i3;
            }
        } catch (Exception unused3) {
            i = 0;
        }
        float webPxByWidth = WXViewUtils.getWebPxByWidth(i + i2);
        c.a("end getScreenHeightSync:" + webPxByWidth);
        return webPxByWidth;
    }

    @JSMethod
    public void getPrefetchData(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3996720a", new Object[]{this, jSCallback});
            return;
        }
        grr.a("CXContentToolsModule_getPrefetchData", null);
        c.a("weex getPrefetchData");
        if (jSCallback == null) {
            return;
        }
        jSCallback.invoke(new HashMap(1));
    }

    @JSMethod(uiThread = false)
    public Map getPrefetchDataSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2fb045ee", new Object[]{this});
        }
        grr.a("CXContentToolsModule_getPrefetchDataSync", null);
        c.a("weex getPrefetchDataSync");
        HashMap hashMap = new HashMap(1);
        c.a("getPrefetch Over");
        return hashMap;
    }
}
