package com.alibaba.triver.triver_shop.web;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.JSInterface;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class AsyncJSAPIBridge$invokeNativeMethod$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $callToken;
    public final /* synthetic */ JSInterface.JSRoute $jsRoute;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ String $methodParam;
    public final /* synthetic */ String $nameSpace;
    public final /* synthetic */ AsyncJSAPIBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncJSAPIBridge$invokeNativeMethod$1(AsyncJSAPIBridge asyncJSAPIBridge, String str, String str2, String str3, String str4, JSInterface.JSRoute jSRoute) {
        super(0);
        this.this$0 = asyncJSAPIBridge;
        this.$nameSpace = str;
        this.$methodName = str2;
        this.$methodParam = str3;
        this.$callToken = str4;
        this.$jsRoute = jSRoute;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Object jsObject = this.this$0.getWebView().getJsObject(this.$nameSpace);
        if (!(jsObject instanceof e)) {
            return;
        }
        ((e) jsObject).executeSafe(this.$methodName, this.$methodParam, new WVCallBackContext(this.$callToken, this.$jsRoute, this.this$0.getWebView()) { // from class: com.alibaba.triver.triver_shop.web.AsyncJSAPIBridge$invokeNativeMethod$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;
            public final /* synthetic */ JSInterface.JSRoute c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r4);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void success() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4550b0a", new Object[]{this});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jsRoute, false, null, null, null, 60, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void success(r rVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8e6d6c20", new Object[]{this, rVar});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jsRoute, false, rVar == null ? null : rVar.d(), null, null, 52, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void success(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b54654", new Object[]{this, str});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str2 = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str2, jsRoute, false, str, null, null, 52, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1392128f", new Object[]{this});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jsRoute, false, null, null, null, 56, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("72e35699", new Object[]{this, str});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str2 = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str2, jsRoute, false, null, null, str, 24, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(r rVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a023d525", new Object[]{this, rVar});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jsRoute, false, null, null, rVar == null ? null : rVar.d(), 24, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                    return;
                }
                AsyncJSAPIBridge asyncJSAPIBridge = AsyncJSAPIBridge.this;
                String str3 = this.b;
                JSInterface.JSRoute jsRoute = this.c;
                q.b(jsRoute, "jsRoute");
                AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str3, jsRoute, false, null, str, str2, 8, null);
            }
        });
    }
}
