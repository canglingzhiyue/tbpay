package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.s;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.m;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.util.j;
import com.taobao.search.mmd.util.k;
import com.taobao.search.refactor.e;
import com.taobao.search.sf.a;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.isr;
import tb.isv;

/* loaded from: classes8.dex */
public final class nwd extends ius<t, FrameLayout, a> implements View.OnClickListener, g, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f31803a;
    private final View b;
    private TextView c;
    private boolean d;
    private boolean e;
    private FrameLayout f;
    private String g;
    private boolean h;
    private final int i;
    private final int j;

    static {
        kge.a(-1677550605);
        kge.a(-311268728);
        kge.a(502437767);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(nwd nwdVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MusFilterWidget";
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
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
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
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
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwd(Activity activity, ium parent, a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, aVar, viewGroup, iurVar);
        c d;
        q.c(activity, "activity");
        q.c(parent, "parent");
        Activity activity2 = activity;
        this.b = LayoutInflater.from(activity2).inflate(R.layout.mmd_tbsearch_tip_error, (ViewGroup) new FrameLayout(activity2), false);
        this.g = "";
        this.i = ntx.a(activity, l.a(150));
        this.j = ntx.a(activity, 0);
        subscribeScopeEvent(this, "childPageWidget");
        if (aVar == null || (d = aVar.d()) == null) {
            return;
        }
        d.subscribe(this);
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f31803a != null) {
        } else {
            if (r.bU()) {
                Activity activity = getActivity();
                q.a((Object) activity, "activity");
                if (activity.isFinishing() && (getActivity() instanceof com.taobao.android.xsearchplugin.muise.g)) {
                    Activity activity2 = getActivity();
                    if (activity2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IMUSCollector");
                    }
                    ((com.taobao.android.xsearchplugin.muise.g) activity2).a("filter leak");
                    return;
                }
            }
            p a2 = s.a(getActivity(), this, null);
            a2.registerRenderListener(this);
            this.f31803a = a2;
        }
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.f = new FrameLayout(getActivity());
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 == null) {
            q.b("filterContainer");
        }
        frameLayout2.setBackgroundColor(Color.parseColor("#8f333333"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.j);
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 == null) {
            q.b("filterContainer");
        }
        frameLayout.addView(frameLayout3, layoutParams);
        frameLayout.setBackgroundColor(Color.parseColor("#8f333333"));
        nwd nwdVar = this;
        frameLayout.setOnClickListener(nwdVar);
        View findViewById = this.b.findViewById(R.id.expandBtn);
        q.a((Object) findViewById, "errorView.findViewById(R.id.expandBtn)");
        this.c = (TextView) findViewById;
        TextView textView = this.c;
        if (textView == null) {
            q.b("retryButton");
        }
        textView.setText(b.a(R.string.app_retry));
        TextView textView2 = this.c;
        if (textView2 == null) {
            q.b("retryButton");
        }
        textView2.setOnClickListener(nwdVar);
        View findViewById2 = this.b.findViewById(R.id.tipContent);
        q.a((Object) findViewById2, "errorView.findViewById<TextView>(R.id.tipContent)");
        ((TextView) findViewById2).setText(b.a(R.string.taobao_app_1005_1_16684));
        ((ImageView) this.b.findViewById(R.id.tipLogo)).setImageResource(R.drawable.tbsearch_no_network);
        this.b.setOnClickListener(nwdVar);
        return frameLayout;
    }

    public final void onEventMainThread(nwe showMusFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de71cd39", new Object[]{this, showMusFilter});
            return;
        }
        q.c(showMusFilter, "showMusFilter");
        this.g = showMusFilter.a();
        this.h = showMusFilter.b();
        f();
        if (this.f31803a != null) {
            return;
        }
        b();
        d();
    }

    public final void onEventMainThread(isv.a after) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, after});
            return;
        }
        q.c(after, "after");
        com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> a2 = after.a();
        q.a((Object) a2, "after.ds");
        Object totalSearchResult = a2.getTotalSearchResult();
        nvr nvrVar = null;
        if (!(totalSearchResult instanceof CommonSearchResult)) {
            totalSearchResult = null;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) totalSearchResult;
        if (commonSearchResult != null) {
            nvrVar = commonSearchResult.noResultMod;
        }
        if (nvrVar == null && commonSearchResult != null) {
            i = commonSearchResult.getTotalResult();
        }
        a(i);
    }

    public final void a(c dataSource) {
        e combo;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141ef998", new Object[]{this, dataSource});
            return;
        }
        q.c(dataSource, "dataSource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) dataSource.getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null && combo.y() == null) {
            i = combo.a().totalResult;
        }
        a(i);
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "totalResults", String.valueOf(i));
        p pVar = this.f31803a;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage("MUISE", "searchFinish", jSONObject);
    }

    public final void onEventMainThread(isv.k list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a107c02", new Object[]{this, list});
            return;
        }
        q.c(list, "list");
        a model = getModel();
        q.a((Object) model, "model");
        c d = model.d();
        q.a((Object) d, "model.scopeDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) d.getTotalSearchResult();
        if ((commonSearchResult != null ? commonSearchResult.noResultMod : null) == null && commonSearchResult != null) {
            i = commonSearchResult.getTotalResult();
        }
        a(i);
    }

    private final void d() {
        Map<String, TemplateBean> templates;
        TemplateBean templateBean;
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a model = getModel();
        q.a((Object) model, "model");
        c d = model.d();
        q.a((Object) d, "model.scopeDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) d.getTotalSearchResult();
        if (commonSearchResult == null || (templates = commonSearchResult.getTemplates()) == null || (templateBean = templates.get(this.g)) == null || (pVar = this.f31803a) == null) {
            return;
        }
        String str = templateBean.url;
        String b = y.b(str, "_mus_tpl");
        String str2 = TextUtils.isEmpty(b) ? str : b;
        pVar.addInstanceEnv("contentHeight", String.valueOf(l.b(this.j)));
        nxz.Companion.a(pVar, str2, this.g, e(), null);
    }

    private final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("elderHome", String.valueOf(j.INSTANCE.a()));
        linkedHashMap.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        a model = getModel();
        q.a((Object) model, "model");
        boolean booleanParam = model.f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        linkedHashMap.put("fontSizeLevel", Integer.valueOf(m.a(booleanParam)));
        linkedHashMap.put(noa.KEY_GRAY_HAIR, String.valueOf(booleanParam));
        linkedHashMap.put("refreshAuction", String.valueOf(this.h));
        jSONObject.put((JSONObject) "status", (String) linkedHashMap);
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ensureView();
        if (this.d) {
            return;
        }
        g();
        this.d = true;
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            q.a();
        }
        q.a((Object) frameLayout, "view!!");
        frameLayout.setVisibility(0);
        a(true);
        Activity mActivity = this.mActivity;
        q.a((Object) mActivity, "mActivity");
        Window window = mActivity.getWindow();
        q.a((Object) window, "mActivity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            com.taobao.android.searchbaseframe.util.s.a((ViewGroup) decorView, (View) getView());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            Activity mActivity = this.mActivity;
            q.a((Object) mActivity, "mActivity");
            Window window = mActivity.getWindow();
            q.a((Object) window, "mActivity.window");
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) decorView).addView(getView());
        }
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.d) {
        } else {
            k();
            this.d = false;
            FrameLayout frameLayout = (FrameLayout) getView();
            if (frameLayout == null) {
                q.a();
            }
            q.a((Object) frameLayout, "view!!");
            frameLayout.setVisibility(8);
            a(false);
            Activity mActivity = this.mActivity;
            q.a((Object) mActivity, "mActivity");
            Window window = mActivity.getWindow();
            q.a((Object) window, "mActivity.window");
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            com.taobao.android.searchbaseframe.util.s.a((ViewGroup) decorView);
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        k.a(this.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.i);
        layoutParams.gravity = 80;
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            q.b("filterContainer");
        }
        frameLayout.addView(this.b, layoutParams);
        View errorView = this.b;
        q.a((Object) errorView, "errorView");
        errorView.setVisibility(0);
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        View errorView = this.b;
        q.a((Object) errorView, "errorView");
        errorView.setVisibility(8);
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "status", z ? "open" : "close");
        p pVar = this.f31803a;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage("MUISE", "filterDisplay", jSONObject);
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        p pVar = this.f31803a;
        if (pVar == null) {
            return;
        }
        pVar.destroy();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        p pVar = this.f31803a;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        p pVar2 = this.f31803a;
        if (pVar2 == null) {
            return;
        }
        pVar2.onActivityStop();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        p pVar = this.f31803a;
        if (pVar != null) {
            pVar.onActivityStart();
        }
        p pVar2 = this.f31803a;
        if (pVar2 == null) {
            return;
        }
        pVar2.onActivityResume();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        } else {
            i();
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        View renderRoot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        } else if (pVar == null || (renderRoot = pVar.getRenderRoot()) == null) {
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            FrameLayout frameLayout = this.f;
            if (frameLayout == null) {
                q.b("filterContainer");
            }
            frameLayout.addView(renderRoot, layoutParams);
            j();
        }
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Object systemService = this.mActivity.getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager == null || !inputMethodManager.isActive()) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            q.a();
        }
        q.a((Object) frameLayout, "view!!");
        inputMethodManager.hideSoftInputFromWindow(frameLayout.getWindowToken(), 0);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1688932813:
                    if (str.equals("clearParams")) {
                        d(jSONObject);
                        return true;
                    }
                    break;
                case -956863702:
                    if (str.equals("removeParams")) {
                        c(jSONObject);
                        return true;
                    }
                    break;
                case -102588025:
                    if (str.equals("addParams")) {
                        b(jSONObject);
                        return true;
                    }
                    break;
                case 485970056:
                    if (str.equals("setParams")) {
                        a(jSONObject);
                        return true;
                    }
                    break;
                case 1855494228:
                    if (str.equals("closeFilterPanel")) {
                        h();
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    private final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    String obj = value.toString();
                    a model = getModel();
                    q.a((Object) model, "model");
                    model.d().setParam(key, obj);
                }
            }
        }
    }

    private final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
        if (a2 == null) {
            return;
        }
        q.a((Object) a2, "FastJsonParseUtil.optJSO…ions, \"params\") ?: return");
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = a2.getJSONObject(i);
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("key");
                String string2 = jSONObject2.getString("value");
                a model = getModel();
                q.a((Object) model, "model");
                model.d().addParam(string, string2);
            }
        }
    }

    private final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
        if (a2 == null) {
            return;
        }
        q.a((Object) a2, "FastJsonParseUtil.optJSO…ions, \"params\") ?: return");
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = a2.getJSONObject(i);
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("key");
                String string2 = jSONObject2.getString("value");
                a model = getModel();
                q.a((Object) model, "model");
                model.d().removeParam(string, string2);
            }
        }
    }

    private final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys");
        if (a2 == null) {
            return;
        }
        q.a((Object) a2, "FastJsonParseUtil.optJSO…ptions, \"keys\") ?: return");
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            String string = a2.getString(i);
            if (!TextUtils.isEmpty(string)) {
                a model = getModel();
                q.a((Object) model, "model");
                model.d().clearParam(string);
            }
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        postEvent(new isr.c(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        TextView textView = this.c;
        if (textView == null) {
            q.b("retryButton");
        }
        if (q.a(view, textView)) {
            j();
            d();
        } else if (q.a(view, this.b)) {
        } else {
            h();
        }
    }
}
