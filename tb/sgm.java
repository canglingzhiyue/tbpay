package tb;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.util.n;
import android.taobao.windvane.webview.m;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.ScrollConflictWebView;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.s;
import com.uc.webview.export.extension.RenderProcessGoneDetail;
import java.util.HashMap;
import java.util.Map;
import tb.ogq;

/* loaded from: classes8.dex */
public class sgm extends Component<ViewGroup, b> implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;
    private boolean c;
    private String d;
    private ViewGroup f;
    private ViewGroup g;
    private WVUCWebView h;

    /* renamed from: a  reason: collision with root package name */
    private final String f33552a = WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG;
    private c j = new c.a<ViewGroup, b>() { // from class: tb.sgm.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(f fVar, ViewGroup viewGroup, b bVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f78ac81a", new Object[]{this, fVar, viewGroup, bVar, dVar});
            } else if (viewGroup == null || bVar == null) {
            } else {
                if (!TextUtils.isEmpty(bVar.f33559a) && !TextUtils.equals(sgm.a(sgm.this), bVar.f33559a)) {
                    sgm.a(sgm.this, bVar.f33559a);
                    ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "loadUrl url: " + sgm.a(sgm.this));
                    sgm.b(sgm.this).loadUrl(sgm.a(sgm.this));
                    sgm sgmVar = sgm.this;
                    sgm.a(sgmVar, 0, sgm.c(sgmVar), sgm.a(sgm.this), "");
                    return;
                }
                ogg.a(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "attr.src is empty or same, " + bVar.f33559a);
            }
        }
    };
    private c k = new c.a<ViewGroup, b>() { // from class: tb.sgm.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(f fVar, ViewGroup viewGroup, b bVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f78ac81a", new Object[]{this, fVar, viewGroup, bVar, dVar});
            } else if (viewGroup == null || bVar == null) {
            } else {
                if (bVar.b) {
                    ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "setBackgroundColor TRANSPARENT");
                    viewGroup.setBackgroundColor(0);
                    return;
                }
                ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "setBackgroundColor WHITE");
                viewGroup.setBackgroundColor(-1);
            }
        }
    };
    private c l = new c.a<ViewGroup, b>() { // from class: tb.sgm.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(f fVar, ViewGroup viewGroup, b bVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f78ac81a", new Object[]{this, fVar, viewGroup, bVar, dVar});
            } else if (viewGroup == null || bVar == null || sgm.b(sgm.this) == null) {
            } else {
                sgm.b(sgm.this).setWvUIModel(bVar.c ? new m(viewGroup.getContext(), sgm.b(sgm.this)) : new a(viewGroup.getContext(), sgm.b(sgm.this)));
            }
        }
    };

    static {
        kge.a(-785046475);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(sgm sgmVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1277574414:
                super.onInitAttrs((f) objArr[0], (View) objArr[1], (ogl) objArr[2], (aa.d) objArr[3]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, tb.sgm$b] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ b mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, android.view.ViewGroup] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ ViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void onInitAttrs(f fVar, ViewGroup viewGroup, b bVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c263d0e", new Object[]{this, fVar, viewGroup, bVar, dVar});
        } else {
            a(fVar, viewGroup, bVar, dVar);
        }
    }

    public static /* synthetic */ String a(sgm sgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7dcb06e1", new Object[]{sgmVar}) : sgmVar.d;
    }

    public static /* synthetic */ String a(sgm sgmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46dbbc17", new Object[]{sgmVar, str});
        }
        sgmVar.d = str;
        return str;
    }

    public static /* synthetic */ void a(sgm sgmVar, int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e3e124", new Object[]{sgmVar, new Integer(i), new Boolean(z), str, str2});
        } else {
            sgmVar.a(i, z, str, str2);
        }
    }

    public static /* synthetic */ void a(sgm sgmVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d83467", new Object[]{sgmVar, str, jSONObject});
        } else {
            sgmVar.a(str, jSONObject);
        }
    }

    public static /* synthetic */ WVUCWebView b(sgm sgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("207be57", new Object[]{sgmVar}) : sgmVar.h;
    }

    public static /* synthetic */ boolean c(sgm sgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbb64ca5", new Object[]{sgmVar})).booleanValue() : sgmVar.c;
    }

    public static /* synthetic */ ogl d(sgm sgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("54a79e10", new Object[]{sgmVar}) : sgmVar.viewParams;
    }

    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onCreateView");
        this.f = new FrameLayout(context);
        this.g = new FrameLayout(context);
        this.h = b(context);
        WVUCWebView wVUCWebView = this.h;
        wVUCWebView.setWvUIModel(new a(context, wVUCWebView));
        this.g.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
        this.f.addView(this.g, new FrameLayout.LayoutParams(-1, -1));
        return this.f;
    }

    public void a(f fVar, ViewGroup viewGroup, b bVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78ac81a", new Object[]{this, fVar, viewGroup, bVar, dVar});
            return;
        }
        super.onInitAttrs(fVar, viewGroup, bVar, dVar);
        this.k.a(fVar, (f) this.h, (WVUCWebView) bVar, dVar);
        this.l.a(fVar, (f) this.h, (WVUCWebView) bVar, dVar);
        this.j.a(fVar, (f) this.h, (WVUCWebView) bVar, dVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "getAttributeHandler attrName: " + str);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1010695135) {
            if (hashCode != 114148) {
                if (hashCode == 1577082094 && str.equals("hideDefaultErrorView")) {
                    c = 2;
                }
            } else if (str.equals("src")) {
                c = 1;
            }
        } else if (str.equals("opaque")) {
            c = 0;
        }
        if (c == 0) {
            return this.k;
        }
        if (c == 1) {
            return this.j;
        }
        if (c == 2) {
            return this.l;
        }
        return super.getAttributeHandler(str);
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7659dc27", new Object[]{this}) : new b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onHandleTNodeMessage");
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onHandleMessage name: " + str + " args: " + eVar.d);
        char c = 65535;
        switch (str.hashCode()) {
            case -552345454:
                if (str.equals("onwilldisappear")) {
                    c = 1;
                    break;
                }
                break;
            case 1228998971:
                if (str.equals("ondestroy")) {
                    c = 3;
                    break;
                }
                break;
            case 1729966319:
                if (str.equals("onforcerefresh")) {
                    c = 2;
                    break;
                }
                break;
            case 2122668806:
                if (str.equals("onwillappear")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.c = true;
            int i = this.b;
            if (2 == i) {
                a(str, JSON.parseObject(JSON.toJSONString(eVar.d)));
            } else if (3 == i && this.h != null && !TextUtils.isEmpty(this.d)) {
                ogg.a(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onHandleMessage  try reload");
                this.h.loadUrl(this.d);
            }
        } else if (c == 1) {
            this.c = false;
            if (2 == this.b) {
                a(str, JSON.parseObject(JSON.toJSONString(eVar.d)));
            }
        } else if (c == 2) {
            a(str, JSON.parseObject(JSON.toJSONString(eVar.d)));
        } else if (c == 3) {
            c();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "invoke name: " + str + " params: " + jSONObject);
        char c = 65535;
        switch (str.hashCode()) {
            case -1982943011:
                if (str.equals("goforward")) {
                    c = 2;
                    break;
                }
                break;
            case -1240638001:
                if (str.equals("goback")) {
                    c = 1;
                    break;
                }
                break;
            case -934641255:
                if (str.equals("reload")) {
                    c = 0;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            WVUCWebView wVUCWebView = this.h;
            if (wVUCWebView != null) {
                wVUCWebView.reload();
            }
        } else if (c == 1) {
            WVUCWebView wVUCWebView2 = this.h;
            if (wVUCWebView2 != null) {
                wVUCWebView2.goBack();
            }
        } else if (c == 2) {
            WVUCWebView wVUCWebView3 = this.h;
            if (wVUCWebView3 != null) {
                wVUCWebView3.goForward();
            }
        } else if (c != 3) {
            z = false;
        } else {
            a(jSONObject);
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    private void a(int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de12f2d", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
            return;
        }
        this.b = i;
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        hashMap.put("appear", Boolean.valueOf(z));
        hashMap.put("url", str);
        hashMap.put("error", str2);
        a("onstatechanged", hashMap);
    }

    public void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "sendMessage2TNode name: " + str + " args: " + map);
        sendMessage(getNode(), str, null, map, null);
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("args", (Object) jSONObject);
        a(jSONObject2);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a(jSONObject == null ? "" : jSONObject.toJSONString());
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.h == null) {
        } else {
            try {
                ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "sendToWebMessage eventName: onTNodeMessage eventData: " + str);
                WVStandardEventCenter.postNotificationToJS(this.h, "onTNodeMessage", str);
            } catch (Exception e) {
                ogg.a(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "postNotificationToJS Exception: " + e.getMessage());
            }
        }
    }

    private WVUCWebView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("5987f2d8", new Object[]{this, context});
        }
        ScrollConflictWebView scrollConflictWebView = new ScrollConflictWebView(context);
        scrollConflictWebView.setBackgroundColor(0);
        scrollConflictWebView.setTag(this);
        sgl sglVar = new sgl(context);
        sglVar.a(new sgk() { // from class: tb.sgm.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean b = false;

            @Override // tb.sgk
            public void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ea0c9b2", new Object[]{this, renderProcessGoneDetail});
                }
            }

            @Override // tb.sgk
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "webView onStart url: " + str);
                this.b = false;
                sgm sgmVar = sgm.this;
                sgm.a(sgmVar, 1, sgm.c(sgmVar), str, "");
            }

            @Override // tb.sgk
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "webView onFinish url: " + str);
                sgm sgmVar = sgm.this;
                sgm.a(sgmVar, 2, sgm.c(sgmVar), str, "");
                if (!sgm.c(sgm.this) || this.b) {
                    return;
                }
                sgm.a(sgm.this, "onwillappear", null);
                this.b = true;
            }

            @Override // tb.sgk
            public void c(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88097eb4", new Object[]{this, str});
                    return;
                }
                ogg.a(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "webView onFailed error: " + str);
                sgm sgmVar = sgm.this;
                sgm.a(sgmVar, 3, sgm.c(sgmVar), sgm.a(sgm.this), str);
            }
        });
        scrollConflictWebView.setWebViewClient(sglVar);
        return scrollConflictWebView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        c();
        this.b = 0;
        this.c = false;
        this.d = null;
        this.f = null;
        this.g = null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.h;
        if (wVUCWebView == null) {
            return;
        }
        if (wVUCWebView.getParent() != null) {
            ((ViewGroup) this.h.getParent()).removeView(this.h);
        }
        this.h.destroy();
        this.h = null;
    }

    /* loaded from: classes8.dex */
    public static class b extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_HIDE_DEFAULT_ERROR_VIEW = "hideDefaultErrorView";
        public static final String KEY_OPAQUE = "opaque";

        /* renamed from: a  reason: collision with root package name */
        public String f33559a;
        public boolean b;
        public boolean c;
        public String d;

        static {
            kge.a(1641483440);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "parseExtraViewParams key: " + str + " value: " + obj);
            char c = 65535;
            switch (str.hashCode()) {
                case -1010695135:
                    if (str.equals("opaque")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114148:
                    if (str.equals("src")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1577082094:
                    if (str.equals("hideDefaultErrorView")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1589884724:
                    if (str.equals("error-page")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f33559a = oec.a(obj, "");
            } else if (c == 1) {
                this.b = oec.a(obj, true);
            } else if (c == 2) {
                this.c = oec.a(obj, false);
            } else if (c != 3) {
            } else {
                this.d = oec.a(obj, "");
            }
        }
    }

    /* loaded from: classes8.dex */
    public class a extends m {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context b;
        private View c;

        static {
            kge.a(852707565);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1246152312) {
                super.loadErrorPage();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, WVUCWebView wVUCWebView) {
            super(context, wVUCWebView);
            this.b = context;
        }

        @Override // android.taobao.windvane.webview.m
        public void loadErrorPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            } else {
                a("ANDROID_SYS_NETWORK_ERROR");
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            if (this.c == null && (n.a(this.b) instanceof Activity)) {
                this.c = b(str);
                setErrorView(this.c);
            }
            super.loadErrorPage();
        }

        private View b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8b9126f5", new Object[]{this, str}) : ogq.a(sgm.this.getNode().N(), sgm.a(sgm.this), null, str, ((b) sgm.d(sgm.this)).d, new ogq.a() { // from class: tb.sgm.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ogq.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (sgm.b(sgm.this) == null || TextUtils.isEmpty(sgm.a(sgm.this))) {
                    } else {
                        sgm.b(sgm.this).reload();
                        a.this.hideErrorPage();
                        ogg.b(WindvanePluginRegister.WVTNodeWebViewJSBridge.TAG, "onClick errorView refresh load url: " + sgm.a(sgm.this));
                    }
                }
            });
        }
    }
}
