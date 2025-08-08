package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.browser.jsbridge.TBNative;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.nom;
import tb.oec;
import tb.ofz;
import tb.oga;
import tb.ogb;

/* loaded from: classes5.dex */
public class GGSecWebViewPage extends ofz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f13218a;
    private WVUCWebView b;
    private a d;
    private boolean c = false;
    private Handler e = new Handler(Looper.getMainLooper());
    private Runnable f = new Runnable() { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.GGSecWebViewPage.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (GGSecWebViewPage.a(GGSecWebViewPage.this)) {
            } else {
                GGSecWebViewPage.b(GGSecWebViewPage.this).postDelayed(this, 100L);
            }
        }
    };

    /* loaded from: classes5.dex */
    public abstract class a implements Runnable {
        public Object b;

        static {
            kge.a(1685387178);
            kge.a(-1390502639);
        }

        public a(Object obj) {
            this.b = obj;
        }
    }

    static {
        kge.a(923236786);
    }

    public static /* synthetic */ Object ipc$super(GGSecWebViewPage gGSecWebViewPage, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ofz
    public boolean dH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1c4f86", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void a(GGSecWebViewPage gGSecWebViewPage, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86cde41", new Object[]{gGSecWebViewPage, obj});
        } else {
            gGSecWebViewPage.b(obj);
        }
    }

    public static /* synthetic */ boolean a(GGSecWebViewPage gGSecWebViewPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49692da9", new Object[]{gGSecWebViewPage})).booleanValue() : gGSecWebViewPage.g();
    }

    public static /* synthetic */ Handler b(GGSecWebViewPage gGSecWebViewPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7f554d60", new Object[]{gGSecWebViewPage}) : gGSecWebViewPage.e;
    }

    public GGSecWebViewPage() {
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a("TNode", 19999, "GGSecWebViewPageCreate", null, null, "");
    }

    @Override // tb.ofz
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    @Override // tb.ofz
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else if (!(obj instanceof String)) {
        } else {
            f();
            if (this.c) {
                b(obj);
            } else {
                this.d = new a(obj) { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.GGSecWebViewPage.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            GGSecWebViewPage.a(GGSecWebViewPage.this, this.b);
                        }
                    }
                };
            }
        }
    }

    private void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse((String) obj);
            for (String str : parse.getQueryParameterNames()) {
                jSONObject.put(str, (Object) parse.getQueryParameter(str));
            }
        } catch (Throwable unused) {
        }
        if (jSONObject.isEmpty()) {
            return;
        }
        String jSONString = jSONObject.toJSONString();
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a("TNode", 19999, "GGSecWebViewPageUpdate", jSONString, null, "");
        this.b.fireEvent("guangguangOnUserChange", jSONString);
    }

    @Override // tb.ofz
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.fireEvent("guangguangOnUserReset", new JSONObject().toJSONString());
    }

    @Override // tb.ofz
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.f13218a = context;
        return LayoutInflater.from(context).inflate(R.layout.layout_second_page, (ViewGroup) null);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = new WVUCWebView(this.f13218a);
            this.b.loadUrl(i());
            q.a(this.b, "WVNative", SecPageBackPlugin.class);
            q.a(this.b, WindvanePluginRegister.WVWindowInfoPlugin.CLASS_NAME, GGWindowInfoPlugin.class);
            q.a(this.b, GGUTPlugin.CLASS_NAME, GGUTPlugin.class);
            this.e.post(this.f);
            ((ViewGroup) b(this.f13218a)).addView(this.b, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView != null && !wVUCWebView.isDestroied() && this.b.getProgress() < 100) {
            return false;
        }
        h();
        return true;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.c = true;
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        oec.a((Runnable) aVar, 100L);
        this.d = null;
    }

    @Override // tb.ofz
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
            q.a(this.b);
        }
        Handler handler = this.e;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // tb.ofz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.onResume();
    }

    @Override // tb.ofz
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.onPause();
    }

    private String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : new Uri.Builder().scheme("https").authority(j()).path("/app/mtb/personal-homepage/pages/index/index.html").appendQueryParameter("disableNav", nom.VALUE_YES).appendQueryParameter("loadmode", "dynamic").build().toString();
    }

    private String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        try {
            return EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.PRE.getValue() ? "market.wapa.taobao.com" : "market.m.taobao.com";
        } catch (Throwable unused) {
            return "market.m.taobao.com";
        }
    }

    /* loaded from: classes5.dex */
    public static final class GGUTPlugin extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_NAME = "track";
        public static final String CLASS_NAME = "WVPageTrackerPlugin";

        static {
            kge.a(1992679876);
        }

        public static /* synthetic */ Object ipc$super(GGUTPlugin gGUTPlugin, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            Map firstPageProperty;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!"track".equals(str)) {
                return false;
            }
            JSONObject parseObject = JSONObject.parseObject(str2);
            if (parseObject == null) {
                wVCallBackContext.error();
                return true;
            }
            String currentUrl = ((WVUCWebView) this.mWebView).getCurrentUrl();
            try {
                JSONArray jSONArray = parseObject.getJSONArray("spm-cnt");
                String string = jSONArray.getString(0);
                String string2 = jSONArray.getString(1);
                parseObject.put("spm-cnt", (Object) (string + "." + string2 + ".0.0"));
            } catch (Exception unused) {
            }
            if (StringUtils.isEmpty(currentUrl) || parseObject == null) {
                wVCallBackContext.error();
                return true;
            }
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.mContext, currentUrl);
            Map<String, String> json2Map = json2Map(parseObject);
            if ((this.mWebView.getContext() instanceof ogb) && (firstPageProperty = ((ogb) this.mWebView.getContext()).getFirstPageProperty()) != null) {
                Object a2 = com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) this.mWebView.getContext()).a();
                String str3 = null;
                if (firstPageProperty.get("spm-cnt") != null) {
                    str3 = firstPageProperty.get("spm-cnt");
                }
                try {
                    if (a2 instanceof String) {
                        Uri parse = Uri.parse((String) a2);
                        String queryParameter = parse.getQueryParameter("spm");
                        str3 = str3;
                        if (queryParameter != null) {
                            str3 = queryParameter;
                        }
                        String queryParameter2 = parse.getQueryParameter(aw.PARAM_UT_PARAMS);
                        if (queryParameter2 != null) {
                            JSONObject parseObject2 = JSON.parseObject(Uri.decode(queryParameter2.toString()));
                            Object obj = json2Map.get(ag.KEY_UTPARAM_URL);
                            if (obj == null) {
                                obj = new JSONObject();
                            }
                            if (obj != null && !(obj instanceof Map)) {
                                obj = JSON.parseObject(obj.toString());
                            }
                            if (parseObject2 != null) {
                                ((Map) obj).putAll(parseObject2);
                                json2Map.put(ag.KEY_UTPARAM_URL, JSON.toJSONString(obj));
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                if (str3 != null) {
                    json2Map.put("spm-url", str3);
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.mContext, json2Map);
            if (this.mWebView.getContext() instanceof ogb) {
                ((ogb) this.mWebView.getContext()).setSecondPageName(currentUrl);
                ((ogb) this.mWebView.getContext()).setSecondPageProperty(json2Map);
            }
            return true;
        }

        private Map<String, String> json2Map(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5551f7cc", new Object[]{this, jSONObject});
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return hashMap;
        }
    }

    /* loaded from: classes5.dex */
    public static final class SecPageBackPlugin extends TBNative {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(24236808);
        }

        public static /* synthetic */ Object ipc$super(SecPageBackPlugin secPageBackPlugin, String str, Object... objArr) {
            if (str.hashCode() == -1126948911) {
                return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.browser.jsbridge.TBNative, android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!"nativeBack".equals(str)) {
                return super.execute(str, str2, wVCallBackContext);
            }
            back(wVCallBackContext, str2);
            return true;
        }

        @WindVaneInterface
        public void back(WVCallBackContext wVCallBackContext, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e631bf35", new Object[]{this, wVCallBackContext, str});
                return;
            }
            wVCallBackContext.success();
            oga<?> findSecPageWrapper = findSecPageWrapper((Activity) wVCallBackContext.getWebview().getContext());
            if (findSecPageWrapper == null) {
                return;
            }
            findSecPageWrapper.g();
        }

        private oga<?> findSecPageWrapper(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oga) ipChange.ipc$dispatch("cc467cd8", new Object[]{this, activity});
            }
            if (activity instanceof ogb) {
                return ((ogb) activity).findSecPageWrapper();
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class GGWindowInfoPlugin extends WindvanePluginRegister.WVWindowInfoPlugin {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(720229059);
        }

        public static /* synthetic */ Object ipc$super(GGWindowInfoPlugin gGWindowInfoPlugin, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.android.layoutmanager.setup.WindvanePluginRegister.WVWindowInfoPlugin, android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT.equals(str)) {
                return false;
            }
            r rVar = new r();
            rVar.b();
            rVar.a("height", Integer.valueOf(getStatusBarHeight(this.mContext)));
            wVCallBackContext.success(rVar);
            return true;
        }

        private int getStatusBarHeight(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
            }
            try {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier <= 0) {
                    return 0;
                }
                return context.getResources().getDimensionPixelSize(identifier);
            } catch (Throwable unused) {
                return 0;
            }
        }
    }
}
