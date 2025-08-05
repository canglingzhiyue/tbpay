package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.f;
import com.etao.feimagesearch.util.ag;
import com.etao.feimagesearch.util.ah;
import com.etao.feimagesearch.util.s;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.datasource.d;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.r;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.cqt;

/* loaded from: classes3.dex */
public final class cqu extends cqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f26452a;
    private JSONObject c;

    /* loaded from: classes3.dex */
    public static final class a implements XslPageLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout.a
        public int consumePageScroll(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19c2faf7", new Object[]{this, new Integer(i)})).intValue();
            }
            cqt.a i2 = cqu.this.i();
            if (i2 == null) {
                return 0;
            }
            return i2.b(i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.searchbaseframe.datasource.d
        public void a(com.taobao.android.searchbaseframe.track.d trackEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63e35165", new Object[]{this, trackEvent});
                return;
            }
            q.c(trackEvent, "trackEvent");
            com.etao.feimagesearch.newresult.perf.a.a(trackEvent);
        }
    }

    static {
        kge.a(1160728310);
    }

    public static /* synthetic */ Object ipc$super(cqu cquVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.cqt
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.cqt
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        }
    }

    public static final /* synthetic */ JSONObject a(cqu cquVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c88eead1", new Object[]{cquVar}) : cquVar.c;
    }

    public cqu(cqt.a aVar) {
        super(aVar);
    }

    @Override // tb.cqt
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            p pVar = this.f26452a;
            if (pVar != null) {
                pVar.onActivityStart();
            }
            p pVar2 = this.f26452a;
            if (pVar2 == null) {
                return;
            }
            pVar2.onActivityResume();
        } catch (Exception unused) {
        }
    }

    @Override // tb.cqt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            p pVar = this.f26452a;
            if (pVar != null) {
                pVar.onActivityPause();
            }
            p pVar2 = this.f26452a;
            if (pVar2 == null) {
                return;
            }
            pVar2.onActivityStop();
        } catch (Exception unused) {
        }
    }

    @Override // tb.cqt
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        p pVar = this.f26452a;
        if (pVar != null && !pVar.isDestroyed()) {
            pVar.destroy();
        }
        this.f26452a = null;
    }

    @Override // tb.cqt
    public void a(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{this, activity, map});
            return;
        }
        q.c(activity, "activity");
        String bW = com.etao.feimagesearch.config.b.bW();
        TLogTracker.b("MuisePageLoad", "LoadTemplate", "templates:" + bW);
        if (TextUtils.isEmpty(bW)) {
            cqt.a i = i();
            if (i == null) {
                return;
            }
            i.a(false, -1, "模板链接为空");
            return;
        }
        a(activity);
        if (bW == null) {
            q.a();
        }
        a(activity, bW, map);
    }

    @Override // tb.cqt
    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        p pVar = this.f26452a;
        if (pVar == null) {
            return;
        }
        pVar.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(num != null ? num.intValue() : -1));
        pVar.refresh(null, null);
    }

    @Override // tb.cqt
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f26452a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "scene", "loading");
            p pVar = this.f26452a;
            if (pVar == null) {
                q.a();
            }
            pVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.cqt
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f26452a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "scene", "loadError");
            p pVar = this.f26452a;
            if (pVar == null) {
                q.a();
            }
            pVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.cqt
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.f26452a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "scene", "RecommendTag");
            jSONObject2.put((JSONObject) "action", z ? "open" : "close");
            p pVar = this.f26452a;
            if (pVar == null) {
                q.a();
            }
            pVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.cqt
    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (this.f26452a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "scene", "searchTag");
            JSONArray jSONArray2 = jSONArray;
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                z = false;
            }
            if (z) {
                jSONObject2.put((JSONObject) "action", DMComponent.RESET);
            } else {
                jSONObject2.put((JSONObject) "action", "search");
                jSONObject2.put((JSONObject) "data", (String) jSONArray);
            }
            p pVar = this.f26452a;
            if (pVar == null) {
                q.a();
            }
            pVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.cqt
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.f26452a == null) {
        } else {
            com.etao.feimagesearch.newresult.perf.a.O();
            if (jSONObject != null) {
                jSONObject.put((JSONObject) "scene", "initialItems");
            }
            p pVar = this.f26452a;
            if (pVar == null) {
                q.a();
            }
            pVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.cqt
    public void a(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else if (this.f26452a == null || str == null || TextUtils.isEmpty(str) || str2 == null || TextUtils.isEmpty(str2)) {
        } else {
            if (map == null) {
                p pVar = this.f26452a;
                if (pVar == null) {
                    return;
                }
                pVar.sendInstanceMessage(str, str2, null);
            } else if (map instanceof JSONObject) {
                p pVar2 = this.f26452a;
                if (pVar2 == null) {
                    return;
                }
                pVar2.sendInstanceMessage(str, str2, (JSONObject) map);
            } else {
                p pVar3 = this.f26452a;
                if (pVar3 == null) {
                    return;
                }
                pVar3.sendInstanceMessage(str, str2, new JSONObject(map));
            }
        }
    }

    @Override // tb.cqt
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        p pVar = this.f26452a;
        if (pVar == null) {
            return false;
        }
        if (pVar == null) {
            q.a();
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) ah.a(pVar.getRenderRoot(), XslMUSLayout.class);
        if (xslMUSLayout != null) {
            return xslMUSLayout.isReachTop();
        }
        return false;
    }

    private final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        Activity activity2 = activity;
        p a2 = com.taobao.android.weex_framework.q.a().a(activity2);
        a2.setTag(XslMUSComponent.PAGE_SCROLL_LISTENER, new a());
        a2.setTag(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK, new b());
        a2.setTag(XslMUSComponent.KEY_META_SEARCH, Boolean.valueOf(com.etao.feimagesearch.config.b.bQ()));
        a2.registerRenderListener(new c());
        ScreenType a3 = ScreenType.a(activity2);
        if (a3 != null) {
            a2.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(a3.a()));
        }
        this.f26452a = a2;
    }

    /* loaded from: classes3.dex */
    public static final class c implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            }
        }

        public c() {
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                return;
            }
            cqu.this.a(true);
            if (pVar == null) {
                q.a();
            }
            View renderRootView = pVar.getRenderRoot();
            cqt.a i = cqu.this.i();
            if (i != null) {
                q.a((Object) renderRootView, "renderRootView");
                i.a(false, renderRootView);
            }
            JSONObject a2 = cqu.a(cqu.this);
            if (a2 == null) {
                return;
            }
            com.etao.feimagesearch.newresult.perf.a.O();
            pVar.refresh(a2, null);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            f.a("irpError", "mus_render_fail " + i);
            cqt.a i2 = cqu.this.i();
            if (i2 == null) {
                return;
            }
            i2.a(false, Integer.valueOf(i), str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            cqt.a i2 = cqu.this.i();
            if (i2 == null) {
                return;
            }
            i2.b(false, Integer.valueOf(i), str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                return;
            }
            cqt.a i2 = cqu.this.i();
            if (i2 == null) {
                return;
            }
            i2.b(false, Integer.valueOf(i), str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                return;
            }
            cqt.a i2 = cqu.this.i();
            if (i2 == null) {
                return;
            }
            i2.b(false, Integer.valueOf(i), str);
        }
    }

    private final void a(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb19e01", new Object[]{this, activity, str, map});
        } else if (this.f26452a != null) {
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put("_wx_tpl=", str);
            String a2 = ag.a("https://market.taobao.com/search?", map);
            q.a((Object) a2, "UrlUtil.appendQueryParam…om/search?\", innerParams)");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    jSONObject.put((JSONObject) entry.getKey(), entry.getValue());
                }
            }
            if (com.etao.feimagesearch.config.b.ak()) {
                String uri = Uri.parse(str).buildUpon().clearQuery().build().toString();
                q.a((Object) uri, "parse.buildUpon().clearQuery().build().toString()");
                byte[] c2 = dpm.a().c(uri);
                if (c2 != null) {
                    p pVar = this.f26452a;
                    if (pVar == null) {
                        return;
                    }
                    pVar.addInstanceEnv("bundleUrl", a2);
                    r monitorInfo = pVar.getMonitorInfo();
                    q.a((Object) monitorInfo, "it.monitorInfo");
                    monitorInfo.a(a2);
                    r monitorInfo2 = pVar.getMonitorInfo();
                    q.a((Object) monitorInfo2, "it.monitorInfo");
                    monitorInfo2.d(str);
                    pVar.prepare(c2, null);
                    pVar.render(jSONObject, null);
                    return;
                }
            }
            s.Companion.a(this.f26452a, str, a2, jSONObject, null);
        }
    }
}
