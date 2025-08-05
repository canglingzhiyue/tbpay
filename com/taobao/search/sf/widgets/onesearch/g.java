package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.util.t;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.OneSearchBean;
import com.taobao.search.mmd.util.k;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.iru;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.nne;
import tb.ntx;
import tb.nwk;
import tb.nww;
import tb.nyd;

/* loaded from: classes8.dex */
public class g extends ius<a, FrameLayout, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeexPageFragment f19560a;
    private WXSDKInstance b;
    private boolean c;
    private int d;

    static {
        kge.a(2108235253);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == 593843865) {
            super.onCtxDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFWeexOnesearchWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public static /* synthetic */ ViewGroup a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("76a3ce5c", new Object[]{gVar}) : gVar.mContainer;
    }

    public static /* synthetic */ JSONObject a(g gVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2f8b6be1", new Object[]{gVar, jSONArray}) : gVar.a(jSONArray);
    }

    public static /* synthetic */ WXSDKInstance a(g gVar, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("73d8e953", new Object[]{gVar, wXSDKInstance});
        }
        gVar.b = wXSDKInstance;
        return wXSDKInstance;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc53d65f", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.c = z;
        return z;
    }

    public static /* synthetic */ boolean b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a00f5de", new Object[]{gVar})).booleanValue() : gVar.c;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((a) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public g(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        ensureView();
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.setOnClickListener(this);
        this.d = k.a();
        frameLayout.setId(this.d);
        return frameLayout;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce6457c", new Object[]{this, aVar});
        } else if (aVar == null) {
            Log.e("SFWeexOnesearchWidget", "bean为空或weex实例为空");
            d();
            e();
        } else {
            b();
            b(aVar);
            attachToContainer();
            String str = aVar.e;
            String a2 = y.a(str, com.taobao.vessel.utils.b.WX_TPL);
            Map<String, String> a3 = y.a(aVar.e);
            a3.remove(com.taobao.vessel.utils.b.WX_TPL);
            String a4 = y.a(a2, a3);
            if (!TextUtils.isEmpty(a4)) {
                aVar.e = a4;
                str = a4;
            }
            String str2 = aVar.e;
            String a5 = y.a(str, "_s_nx_from", aVar.d);
            if (TextUtils.isEmpty(str2)) {
                d();
                e();
                return;
            }
            this.c = false;
            new HashMap().put("bundleUrl", a5);
            q.a("SFWeexOnesearchWidget", "bundleUrl: " + a5);
            q.a("SFWeexOnesearchWidget", "jsUrl: " + str2);
            WeexPageFragment weexPageFragment = this.f19560a;
            if (weexPageFragment == null) {
                FragmentActivity fragmentActivity = (FragmentActivity) getActivity();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                String a6 = nne.a(nne.PAGE_NAME_NX);
                if (a6 == null) {
                    a6 = "";
                }
                try {
                    jSONObject.put("iconData", a6);
                    jSONObject.put("spm", "aaa.aaa.aaa.aaa");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.f19560a = (WeexPageFragment) WeexPageFragment.newInstanceWithUrl(fragmentActivity, WeexPageFragment.class, a5, str2, null, jSONObject.toString(), this.d, g());
                this.f19560a.setUserTrackEnable(false);
                this.f19560a.setRenderListener(new WeexPageFragment.a() { // from class: com.taobao.search.sf.widgets.onesearch.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                        if (str3.hashCode() == 578309873) {
                            super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                    }

                    @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
                    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                            return;
                        }
                        g.a(g.this, wXSDKInstance);
                        g.this.postEvent(nwk.h.a());
                        if (wXSDKInstance == null || !r.bJ()) {
                            return;
                        }
                        wXSDKInstance.a("navigator", new WXSDKInstance.e() { // from class: com.taobao.search.sf.widgets.onesearch.g.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.weex.WXSDKInstance.e
                            public WXSDKInstance.f CallModuleMethod(String str3, String str4, JSONArray jSONArray, JSONObject jSONObject2) {
                                JSONObject a7;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (WXSDKInstance.f) ipChange3.ipc$dispatch("31ade3fe", new Object[]{this, str3, str4, jSONArray, jSONObject2});
                                }
                                try {
                                    if (!TextUtils.equals("push", str4) || !TextUtils.equals(str3, "navigator") || (a7 = g.a(g.this, jSONArray)) == null) {
                                        return null;
                                    }
                                    Uri parse = Uri.parse(a7.getString("url"));
                                    if (!TextUtils.isEmpty(parse.getQueryParameter("spm"))) {
                                        return null;
                                    }
                                    a7.put("url", (Object) parse.buildUpon().appendQueryParameter("spm", g.a(g.this.getModel())).build().toString());
                                    return null;
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                        });
                    }

                    @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
                    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                        } else {
                            t.a(g.a(g.this), 0);
                        }
                    }

                    @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a
                    public void onException(WXSDKInstance wXSDKInstance, boolean z, String str3, String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str3, str4});
                            return;
                        }
                        super.onException(wXSDKInstance, z, str3, str4);
                        if (z && g.b(g.this)) {
                            q.b("SFWeexOnesearchWidget", "已经降级过了");
                            return;
                        }
                        String str5 = null;
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("down", z);
                            str5 = jSONObject2.toString();
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        nyd.a.a("weex_exception", str5, str3, str4);
                        if (z) {
                            a(str3, str4);
                        }
                        q.h("SFWeexOnesearchWidget", str3 + "\n" + str4);
                    }

                    private void a(String str3, String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                            return;
                        }
                        g.this.d();
                        g.a(g.this, true);
                        g.this.postEvent(nwk.g.a());
                    }
                });
                return;
            }
            weexPageFragment.replace(a5, str2);
        }
    }

    public static String a(iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar) {
        CommonSearchResult commonSearchResult;
        Map<String, String> map;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c461bb34", new Object[]{iruVar});
        }
        if (iruVar == null || !(iruVar.d() instanceof com.taobao.search.sf.datasource.c) || (commonSearchResult = (CommonSearchResult) ((com.taobao.search.sf.datasource.c) iruVar.d()).getTotalSearchResult()) == null || (map = commonSearchResult.getMainInfo().pageTraceArgs) == null) {
            return null;
        }
        String str = map.get("spm-cnt");
        if (TextUtils.isEmpty(str) || (split = str.split("\\.")) == null || split.length < 2) {
            return str;
        }
        return split[0] + "." + split[1] + ".pinzhuan.0";
    }

    private JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{this, jSONArray});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.isEmpty(jSONObject.getString("url"))) {
                    return jSONObject;
                }
            }
        }
        return null;
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        return "tbsearch_wx_frag_" + System.currentTimeMillis();
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6fdf7d", new Object[]{this, aVar});
            return;
        }
        int a2 = a(aVar, aVar.f, getActivity());
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) getView()).getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, a2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = a2;
        }
        ((FrameLayout) getView()).setLayoutParams(layoutParams);
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        } else {
            e();
        }
    }

    public static int a(a aVar, boolean z, Activity activity) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c38fe21d", new Object[]{aVar, new Boolean(z), activity})).intValue();
        }
        if (aVar == null) {
            return -1;
        }
        if (aVar.c == 1) {
            return aVar.b;
        }
        int dimension = (int) Globals.getApplication().getResources().getDimension(R.dimen.tbsearch_searchbar_height);
        if (!z) {
            i = (!(activity instanceof com.taobao.android.searchbaseframe.uikit.a) || !((com.taobao.android.searchbaseframe.uikit.a) activity).aF_()) ? dimension : dimension + SystemBarDecorator.getStatusBarHeight(activity);
        }
        if (aVar.c != 0) {
            return -1;
        }
        return ntx.a(activity, i);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (getView() == 0) {
        } else {
            ((FrameLayout) getView()).setVisibility(0);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (getView() == 0) {
        } else {
            ((FrameLayout) getView()).setVisibility(8);
        }
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        e();
    }

    public void onEventMainThread(nww.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf964a", new Object[]{this, aVar});
            return;
        }
        WeexPageFragment weexPageFragment = this.f19560a;
        if (weexPageFragment == null) {
            return;
        }
        weexPageFragment.onActivityResult(aVar.f31822a, aVar.b, aVar.c);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f19560a == null) {
        } else {
            q.a("SFWeexOnesearchWidget", "destroy weex instance");
            try {
                this.f19560a.destroyWeex();
                this.f19560a = null;
                this.b = null;
            } catch (Exception e) {
                q.c("SFWeexOnesearchWidget", "error destroy weex", e);
            }
        }
    }

    public WXSDKInstance f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("79f1320b", new Object[]{this}) : this.b;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int HEIGHT_MODE_EXACTLY = 1;
        public static final int HEIGHT_MODE_FULL = 0;
        public static final int HEIGHT_MODE_MATCH_PARENT = 2;
        public static final int HEIGHT_MODE_NOT_SET = -1;
        public static final int SIZE_NOT_SET = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f19563a = -1;
        public int b = -1;
        public int c = -1;
        public String d;
        public String e;
        public boolean f;

        static {
            kge.a(-956010174);
        }

        public static a a(OneSearchBean oneSearchBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4fb5747b", new Object[]{oneSearchBean});
            }
            a aVar = new a();
            aVar.c = !oneSearchBean.isFull ? 1 : 0;
            aVar.f19563a = oneSearchBean.width;
            aVar.b = oneSearchBean.height;
            aVar.d = oneSearchBean.from;
            aVar.e = oneSearchBean.url;
            aVar.f = oneSearchBean.isSearchBarHidden;
            return aVar;
        }
    }
}
