package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.JSInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $callToken;
    public final /* synthetic */ String $currentUrl;
    public final /* synthetic */ JSInterface.JSRoute $jsRoute;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ String $methodParam;
    public final /* synthetic */ String $nameSpace;
    public final /* synthetic */ CommonAsyncJSAPIBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge, String str, String str2, String str3, String str4, JSInterface.JSRoute jSRoute, String str5) {
        super(0);
        this.this$0 = commonAsyncJSAPIBridge;
        this.$nameSpace = str;
        this.$methodName = str2;
        this.$methodParam = str3;
        this.$callToken = str4;
        this.$jsRoute = jSRoute;
        this.$currentUrl = str5;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
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
        ((e) jsObject).executeSafe(this.$methodName, this.$methodParam, new WVCallBackContext(this.this$0.getWebView()) { // from class: android.taobao.windvane.extra.jsbridge.CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                this.currentUrlFromAsyncChannel = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$currentUrl;
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void success() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4550b0a", new Object[]{this});
                    return;
                }
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jsRoute, false, r.RET_SUCCESS.d(), false, 20, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void success(r rVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8e6d6c20", new Object[]{this, rVar});
                    return;
                }
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jsRoute, false, rVar != null ? rVar.d() : null, rVar != null ? rVar.a() : false, 4, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void success(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b54654", new Object[]{this, str});
                    return;
                }
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str2 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str2, jsRoute, false, str, false, 20, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1392128f", new Object[]{this});
                    return;
                }
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jsRoute, false, null, false, 24, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("72e35699", new Object[]{this, str});
                    return;
                }
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str2 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str2, jsRoute, false, new r(str).d(), false, 16, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(r rVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a023d525", new Object[]{this, rVar});
                    return;
                }
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jsRoute, false, rVar != null ? rVar.d() : null, false, 16, null);
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                    return;
                }
                r rVar = new r("HY_FAILED");
                rVar.a(str, str2);
                CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0;
                String str3 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken;
                JSInterface.JSRoute jsRoute = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$jsRoute;
                q.b(jsRoute, "jsRoute");
                CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str3, jsRoute, false, rVar.d(), false, 16, null);
            }
        });
    }
}
