package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.onesearch.SearchWidgetUCWebView;
import com.taobao.search.mmd.util.k;
import com.taobao.taobao.R;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.nom;
import tb.nww;

/* loaded from: classes8.dex */
public class e extends ius<Void, FrameLayout, com.taobao.search.sf.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SearchWidgetUCWebView f19558a;
    private com.taobao.search.mmd.onesearch.f b;
    private com.taobao.search.mmd.onesearch.c c;
    private int e;
    private boolean f;

    static {
        kge.a(-1960486221);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFUCWebViewWidget";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public e(Activity activity, ium iumVar, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar, com.taobao.search.mmd.onesearch.f fVar) {
        super(activity, iumVar, aVar, viewGroup, iurVar);
        this.f = false;
        this.b = fVar;
        ensureView();
        subscribeEvent(this);
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.e = k.a();
        frameLayout.setId(this.e);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f = true;
        }
    }

    public void a(com.taobao.search.mmd.onesearch.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdb9656", new Object[]{this, cVar});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView != null) {
            searchWidgetUCWebView.setFilter(cVar);
        }
        this.c = cVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (getView() == 0) {
        } else {
            ((FrameLayout) getView()).getLayoutParams().height = i;
            ((FrameLayout) getView()).requestLayout();
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (this.f19558a == null) {
            g();
        }
        if (TextUtils.equals(y.a(str, "_xDisableInterception"), nom.VALUE_YES)) {
            q.i("SFUCWebViewWidget", "_xDisableInterception=YES");
            this.f19558a.setIntercept(false);
        } else {
            this.f19558a.setIntercept(true);
        }
        this.f19558a.loadUrl(str);
        q.a("SFUCWebViewWidget", "load with web view, url:" + str);
        return this.f19558a.getUrl();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f19558a = new SearchWidgetUCWebView(getActivity());
        if (this.b != null) {
            this.f19558a.setTag(R.id.tbsearch_webview_action_performer, this.b);
        }
        if (this.f) {
            this.f19558a.setWidget(this);
        }
        this.f19558a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.taobao.search.mmd.onesearch.c cVar = this.c;
        if (cVar != null) {
            this.f19558a.setFilter(cVar);
        }
        ((FrameLayout) getView()).addView(this.f19558a);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView == null) {
            return;
        }
        searchWidgetUCWebView.loadUrl("about:blank");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView == null) {
            return;
        }
        searchWidgetUCWebView.clearHistory();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView == null) {
            return;
        }
        searchWidgetUCWebView.onPause();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView == null) {
            return;
        }
        searchWidgetUCWebView.onResume();
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        onComponentDestroy();
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        } else if (this.f19558a == null) {
        } else {
            removeFromContainer();
            ((FrameLayout) getView()).removeAllViews();
            this.f19558a.destroy();
        }
    }

    public void onEventMainThread(nww.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf964a", new Object[]{this, aVar});
            return;
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView == null) {
            return;
        }
        searchWidgetUCWebView.onActivityResult(aVar.f31822a, aVar.b, aVar.c);
    }

    public WVUCWebView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("13646baa", new Object[]{this});
        }
        SearchWidgetUCWebView searchWidgetUCWebView = this.f19558a;
        if (searchWidgetUCWebView == null) {
            return null;
        }
        return searchWidgetUCWebView;
    }
}
