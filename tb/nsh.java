package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.xsearchplugin.weex.weex.g;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.d;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.b;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.taobao.weex.WXSDKInstance;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.isr;
import tb.jvm;
import tb.nqh;
import tb.nqw;
import tb.nre;

/* loaded from: classes8.dex */
public class nsh extends ius<Void, TRecyclerView, nsi> implements View.OnTouchListener, b, nqh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchDoorContext f31721a;
    private LinearLayoutManager b;
    private nqb<e> c;
    private Map<String, String> d;
    private String e;
    private final g f;
    private nsg g;

    static {
        kge.a(-1322456864);
        kge.a(-931718986);
        kge.a(-468432129);
        kge.a(670348989);
    }

    public static /* synthetic */ Object ipc$super(nsh nshVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    public static /* synthetic */ nsg a(nsh nshVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nsg) ipChange.ipc$dispatch("690ef52f", new Object[]{nshVar}) : nshVar.g;
    }

    public static /* synthetic */ String b(nsh nshVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ac7a82a", new Object[]{nshVar}) : nshVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.taobao.uikit.feature.view.TRecyclerView] */
    @Override // tb.ius
    public /* synthetic */ TRecyclerView onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : b();
    }

    public nsh(Activity activity, ium iumVar, nsi nsiVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, nsiVar, viewGroup, iurVar);
        this.e = "";
        this.f = new g();
        this.f31721a = new SearchDoorContext();
        a();
        this.g = new nsg(this);
        this.b = new LinearLayoutManager(activity);
        this.c = new nqb<>(activity, this, new e(this.f31721a, this, null));
        if (r.be()) {
            this.e = com.taobao.muniontaobaosdk.util.b.a(Login.getNick()) + nse.b(nsiVar);
            this.g.c(this.e);
        }
        this.g.a(nse.a(nsiVar), nse.b(nsiVar), this.f31721a);
        subscribeEvent(this);
        attachToContainer();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f31721a.a(getModel().b());
        }
    }

    public TRecyclerView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("9ebac613", new Object[]{this});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(this.mActivity);
        tRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tRecyclerView.setOverScrollMode(2);
        tRecyclerView.setHasFixedSize(true);
        tRecyclerView.setBackgroundResource(R.color.tbsearch_white);
        tRecyclerView.setLayoutManager(this.b);
        tRecyclerView.setAdapter(this.c);
        tRecyclerView.addFeature(new SmoothRecyclerScrollFeature());
        tRecyclerView.setOnTouchListener(this);
        if (r.bN()) {
            tRecyclerView.setRecycledViewPool(new com.taobao.android.searchbaseframe.business.srp.list.uikit.b());
        }
        return tRecyclerView;
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : getClass().getSimpleName();
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            this.f.a(wXSDKInstance);
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public void b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ac8e5", new Object[]{this, wXSDKInstance});
        } else {
            this.f.b(wXSDKInstance);
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public TemplateBean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("45058b5e", new Object[]{this, str}) : this.g.a(str);
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public jvm.c b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("ad662293", new Object[]{this, str}) : this.g.b(str);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 2) {
            ((InputMethodManager) Globals.getApplication().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }

    public void a(List<ActivateTypedBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        nqb<e> nqbVar = this.c;
        if (nqbVar == null) {
            return;
        }
        nqbVar.a((List) list);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.d = map;
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), map);
        }
    }

    public void onEventMainThread(nqw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95a32c4", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    private void a(nqw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1cb267", new Object[]{this, aVar});
            return;
        }
        ActivateBean activateBean = aVar.f31670a;
        String str = activateBean.keyword;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("q", str);
        com.taobao.search.mmd.util.e.a("Activate_" + activateBean.groupType, (ArrayMap<String, String>) arrayMap);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(activateBean.suggestRn)) {
            hashMap.put(k.KEY_SUGGEST_RN, activateBean.suggestRn);
        }
        nse.a(getModel(), getActivity(), str, hashMap, this);
    }

    public void onEventMainThread(isr.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4339768e", new Object[]{this, cVar});
        } else if (!"goToSrp".equals(cVar.f29283a)) {
        } else {
            a(cVar.b);
        }
    }

    public void onEventMainThread(nre.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b0453", new Object[]{this, eVar});
        } else {
            this.g.d(eVar.f31678a);
        }
    }

    public void onEventMainThread(final nqw.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95aa723", new Object[]{this, bVar});
        } else if (bVar.f31671a == null) {
        } else {
            d.a(this.mActivity, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16653), com.alibaba.ability.localization.b.a(R.string.app_confirm), new DialogInterface.OnClickListener() { // from class: tb.nsh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    nsh.a(nsh.this).a(bVar.f31671a);
                    dialogInterface.cancel();
                }
            }, com.alibaba.ability.localization.b.a(R.string.app_cancel), new DialogInterface.OnClickListener() { // from class: tb.nsh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        dialogInterface.cancel();
                    }
                }
            });
        }
    }

    public void onEventMainThread(nqw.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95c0440", new Object[]{this, eVar});
        } else {
            d.a(this.mActivity, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16653), com.alibaba.ability.localization.b.a(R.string.app_confirm), new DialogInterface.OnClickListener() { // from class: tb.nsh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    com.taobao.search.mmd.util.e.a("ClearHistory");
                    nsh.a(nsh.this).f(nsh.b(nsh.this));
                    dialogInterface.cancel();
                }
            }, com.alibaba.ability.localization.b.a(R.string.app_cancel), new DialogInterface.OnClickListener() { // from class: tb.nsh.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        dialogInterface.cancel();
                    }
                }
            });
        }
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        f();
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

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.g.e(this.e);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("q");
            HashMap hashMap = new HashMap();
            hashMap.put("q", string);
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String string2 = jSONObject.getString(str);
                    if (!TextUtils.isEmpty(string2)) {
                        hashMap.put(str, string2);
                    }
                }
            }
            nse.a(getModel(), getActivity(), string, hashMap, this);
        }
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.d;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.c.getItemCount(); i++) {
            if (this.c.a(i) instanceof HistoryCellBean) {
                this.c.notifyItemChanged(i);
                return;
            }
        }
    }

    @Override // tb.nqh.a
    public void onHistoryUpdated(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ee4f5", new Object[]{this, historyCellBean});
        } else if (this.c.getItemCount() <= 0) {
            ArrayList arrayList = new ArrayList();
            historyCellBean.rownnum = 1;
            arrayList.add(historyCellBean);
            this.c.a((List) arrayList);
        } else {
            for (int i = 0; i < this.c.getItemCount(); i++) {
                if (this.c.a(i) instanceof HistoryCellBean) {
                    this.c.b(i, historyCellBean);
                    return;
                }
            }
        }
    }

    @Override // tb.nqh.a
    public void onHistoryDeleted(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c853", new Object[]{this, historyCellBean});
        } else {
            f();
        }
    }
}
