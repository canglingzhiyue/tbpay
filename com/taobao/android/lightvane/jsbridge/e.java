package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0004¨\u0006+"}, d2 = {"Lcom/taobao/android/lightvane/jsbridge/LVCallMethodContext;", "", "webview", "Lcom/taobao/android/lightvane/webview/ILVWebView;", "(Lcom/taobao/android/lightvane/webview/ILVWebView;)V", "classInstance", "getClassInstance", "()Ljava/lang/Object;", "setClassInstance", "(Ljava/lang/Object;)V", "failCallback", "Lcom/taobao/android/lightvane/jsbridge/IJsApiFailCallBack;", "getFailCallback", "()Lcom/taobao/android/lightvane/jsbridge/IJsApiFailCallBack;", "setFailCallback", "(Lcom/taobao/android/lightvane/jsbridge/IJsApiFailCallBack;)V", "method", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "setMethod", "(Ljava/lang/reflect/Method;)V", FluidException.METHOD_NAME, "", "getMethodName", "()Ljava/lang/String;", "setMethodName", "(Ljava/lang/String;)V", "objectName", "getObjectName", "setObjectName", "params", "getParams", "setParams", "successCallback", "Lcom/taobao/android/lightvane/jsbridge/IJsApiSuccessCallBack;", "getSuccessCallback", "()Lcom/taobao/android/lightvane/jsbridge/IJsApiSuccessCallBack;", "setSuccessCallback", "(Lcom/taobao/android/lightvane/jsbridge/IJsApiSuccessCallBack;)V", "getWebview", "()Lcom/taobao/android/lightvane/webview/ILVWebView;", "setWebview", "lightvane_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.lightvane.webview.a f13290a;
    private Object b;
    private String c;
    private String d;
    private String e;
    private b f;
    private a g;

    static {
        kge.a(2014298995);
    }

    public final com.taobao.android.lightvane.webview.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.lightvane.webview.a) ipChange.ipc$dispatch("71a3adbc", new Object[]{this}) : this.f13290a;
    }

    public final void a(com.taobao.android.lightvane.webview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7253f6", new Object[]{this, aVar});
        } else {
            this.f13290a = aVar;
        }
    }

    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public final Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f44f4a", new Object[]{this, bVar});
        } else {
            this.f = bVar;
        }
    }

    public final b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f259c34f", new Object[]{this}) : this.f;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f3daeb", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public final a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8cfa85b1", new Object[]{this}) : this.g;
    }

    public e(com.taobao.android.lightvane.webview.a aVar) {
        this.f13290a = aVar;
    }
}
