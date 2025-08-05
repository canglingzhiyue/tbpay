package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.p;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import android.webkit.ValueCallback;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.c;

/* loaded from: classes4.dex */
public class euk extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String l = "TBSharedModule";
    private static String m = "showSharedMenu";
    private static String n = "businessId";
    private static String o = "title";
    private static String p = "image";
    private static String q = "url";
    private static String r = "text";
    private static String s = "detailData";
    private static String t = "toolsFirst";
    private static String u = "templateParams";

    /* renamed from: a  reason: collision with root package name */
    public c f27580a;
    public p b;

    public static /* synthetic */ Object ipc$super(euk eukVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public euk(c cVar) {
        this.f27580a = cVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        if (this.b == null) {
            a(this.d);
        }
        final h hVar = new h();
        JSONObject jSONObject = new JSONObject();
        final JSONObject c = c();
        a(jSONObject, hVar, c);
        a(jSONObject, c);
        hVar.f = jSONObject.toJSONString();
        l.b().a(this.b, hVar, new IJsApiFailedCallBack() { // from class: tb.euk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
            public void fail(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("534fc72f", new Object[]{this, str});
                } else {
                    euw.a(c, hVar.f);
                }
            }
        }, new IJsApiSucceedCallBack() { // from class: tb.euk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
            public void succeed(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str});
                }
            }
        });
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        a(jSONObject2, jSONObject3, t);
        a(jSONObject2, jSONObject3, s);
        jSONObject.put(u, (Object) jSONObject3);
    }

    private void a(JSONObject jSONObject, h hVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9c2e08", new Object[]{this, jSONObject, hVar, jSONObject2});
            return;
        }
        hVar.d = l;
        hVar.e = m;
        a(jSONObject2, jSONObject, n, o, p, q, r);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe98bb7", new Object[]{this, jSONObject, jSONObject2, strArr});
        } else if (jSONObject != null && jSONObject2 != null && strArr != null) {
            for (String str : strArr) {
                if (jSONObject.containsKey(str)) {
                    jSONObject2.put(str, jSONObject.get(str));
                }
            }
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b = new p(context, new IWVWebView() { // from class: tb.euk.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.webview.IWVWebView
                public Context _getContext() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Context) ipChange2.ipc$dispatch("78ce3197", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public boolean _post(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("32066a08", new Object[]{this, runnable})).booleanValue();
                    }
                    return false;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void addJsObject(String str, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public boolean back() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
                    }
                    return false;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void clearCache() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8aded33c", new Object[]{this});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void evaluateJavascript(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void fireEvent(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public Context getContext() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Context) ipChange2.ipc$dispatch("e1727078", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public String getDataOnActive() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("8b602214", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public Object getJsObject(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public String getUrl() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public String getUserAgentString() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("a06231a4", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public View getView() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (View) ipChange2.ipc$dispatch("576a35e4", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void hideLoadingView() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a7409c66", new Object[]{this});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void loadUrl(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("89757c7a", new Object[]{this, str});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void refresh() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad3d31e2", new Object[]{this});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void setDataOnActive(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("714294e2", new Object[]{this, str});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void setUserAgentString(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("260bd7ba", new Object[]{this, str});
                    }
                }

                @Override // android.taobao.windvane.webview.IWVWebView
                public void showLoadingView() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c8f114b", new Object[]{this});
                    }
                }
            });
        }
    }
}
