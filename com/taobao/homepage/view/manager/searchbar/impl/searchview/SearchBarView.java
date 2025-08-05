package com.taobao.homepage.view.manager.searchbar.impl.searchview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.homepage.utils.o;
import com.taobao.tao.homepage.f;
import tb.gbg;
import tb.kge;
import tb.kss;
import tb.lap;
import tb.laq;
import tb.lar;
import tb.law;
import tb.ssm;

/* loaded from: classes7.dex */
public class SearchBarView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String S_ITEM = "item";
    private DXRootView mDxSearchView;
    private String mFestivalTag;
    private boolean mIsHudDevice;
    private boolean mIsScaleEnable;
    private law mLifeCycleManager;
    private a mProcessor;
    private c mSearchBarAppearStatus;
    private JSONObject mSearchDataSection;
    private final ssm mUiMonitor;

    static {
        kge.a(-1327044101);
    }

    public static /* synthetic */ Object ipc$super(SearchBarView searchBarView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SearchBarView(Context context) {
        super(context);
        this.mIsScaleEnable = f.a().d();
        this.mUiMonitor = new ssm();
        init();
    }

    public SearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsScaleEnable = f.a().d();
        this.mUiMonitor = new ssm();
        init();
    }

    public SearchBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsScaleEnable = f.a().d();
        this.mUiMonitor = new ssm();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setBackgroundColor(0);
        if (!com.taobao.homepage.utils.b.c() && !com.taobao.homepage.utils.b.b()) {
            z = false;
        }
        this.mIsHudDevice = z;
        this.mSearchBarAppearStatus = new c(this, this.mUiMonitor);
        this.mProcessor = new a();
    }

    public boolean isDX3SearchViewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f603cc", new Object[]{this})).booleanValue();
        }
        DXRootView dXRootView = this.mDxSearchView;
        return (dXRootView == null || dXRootView.getParent() == null) ? false : true;
    }

    public DXRootView getDX3SearchView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("62c6355a", new Object[]{this}) : this.mDxSearchView;
    }

    public void setHomeLifeCycleManager(law lawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cb0499", new Object[]{this, lawVar});
            return;
        }
        this.mLifeCycleManager = lawVar;
        law lawVar2 = this.mLifeCycleManager;
        if (lawVar2 == null) {
            return;
        }
        lawVar2.d().a(this.mSearchBarAppearStatus);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        law lawVar = this.mLifeCycleManager;
        if (lawVar == null) {
            return;
        }
        lawVar.d().b(this.mSearchBarAppearStatus);
    }

    public void refreshDxSearchBarView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ac29e8", new Object[]{this, jSONObject});
            return;
        }
        laq b = laq.a().a("SearchBar").b("refreshDxSearchBarView");
        o.a a2 = o.a(jSONObject.getJSONObject("template"));
        if (a2 == null) {
            b.c("compatibleDinamicTemplate == null");
            return;
        }
        DXTemplateItem a3 = f.a().b().a(a2.e());
        DXTemplateItem dXTemplateItem = null;
        DXRootView dXRootView = this.mDxSearchView;
        if (dXRootView != null) {
            dXTemplateItem = dXRootView.getDxTemplateItem();
        }
        DinamicXEngine b2 = f.a().b();
        if (dXTemplateItem != null && dXTemplateItem.equals(a3) && this.mSearchDataSection == jSONObject && !isDxConfigChange(b2)) {
            laq a4 = b.a("模板名称", dXTemplateItem.f11925a);
            a4.a("模板版本", dXTemplateItem.b + "").c("数据和模板信息都没有变;").b();
            return;
        }
        this.mSearchBarAppearStatus.b();
        checkMarginParam(b2, jSONObject);
        checkCreateView(a3, dXTemplateItem, b2, b);
        checkRenderTemplate(jSONObject, b2, a3, b);
        this.mSearchBarAppearStatus.a();
        b.b();
    }

    public void partialRefreshWidgetNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2f7eb1", new Object[]{this, str});
        } else {
            this.mProcessor.a(str, this.mDxSearchView);
        }
    }

    public void setD3BackgroundAlpha(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43da06da", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        laq b = laq.a().a("SearchBar").b("setD3BackgroundAlpha");
        if (!z) {
            b.c("forceSet为false");
            return;
        }
        DXWidgetNode findWidgetNodeById = findWidgetNodeById("bgImgView");
        if (findWidgetNodeById == null) {
            b.c("widgetNode == null").b();
            return;
        }
        View v = findWidgetNodeById.getDXRuntimeContext().v();
        if (v != null) {
            v.setAlpha(f);
        }
        b.b();
    }

    public void updateWhenFestivalChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dadc00", new Object[]{this});
            return;
        }
        laq b = laq.a().a("SearchBar").b("updateWhenFestivalChanged");
        if (this.mDxSearchView == null || this.mSearchDataSection == null) {
            b.c("mDxSearchView == null");
            return;
        }
        String a2 = FestivalMgr.a().a("global", "actionBarBackgroundColor");
        String str = this.mFestivalTag;
        if (str != null && str.equals(a2)) {
            b.c("actionBarBackgroundColor is not change.");
            return;
        }
        this.mFestivalTag = a2;
        this.mSearchBarAppearStatus.b();
        f.a().b().a(this.mDxSearchView, JSON.parseObject(this.mSearchDataSection.toJSONString()));
        this.mSearchBarAppearStatus.a();
        b.c("reRender").b();
    }

    public void onDxSearchBarViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715895f9", new Object[]{this});
        } else {
            f.a().b().b(this.mDxSearchView);
        }
    }

    public void onDxSearchBarViewDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ca774d", new Object[]{this});
        } else {
            f.a().b().a(this.mDxSearchView);
        }
    }

    public void postDXEvent(DXEvent dXEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f920c59", new Object[]{this, dXEvent, str});
            return;
        }
        DXWidgetNode findWidgetNodeById = findWidgetNodeById(str);
        if (findWidgetNodeById == null) {
            return;
        }
        findWidgetNodeById.postEvent(dXEvent);
    }

    private void checkRenderTemplate(JSONObject jSONObject, DinamicXEngine dinamicXEngine, DXTemplateItem dXTemplateItem, laq laqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec9ab1f", new Object[]{this, jSONObject, dinamicXEngine, dXTemplateItem, laqVar});
        } else if (this.mDxSearchView == null) {
            kss.a("Page_Home", 19999, "HomeSearchBarInitError", "");
            this.mUiMonitor.a(dXTemplateItem);
        } else {
            this.mFestivalTag = FestivalMgr.a().a("global", "actionBarBackgroundColor");
            this.mSearchDataSection = jSONObject;
            lar.e("bindData_" + getTemplateName(dXTemplateItem));
            dinamicXEngine.a(this.mDxSearchView, jSONObject);
            lar.f("bindData_" + getTemplateName(dXTemplateItem));
            laqVar.a("皮肤背景标记festivalTag", this.mFestivalTag).c("绑定searchBar数据");
            kss.b(jSONObject);
        }
    }

    private void checkMarginParam(DinamicXEngine dinamicXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6462241", new Object[]{this, dinamicXEngine, jSONObject});
        } else if (!(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int extMarginTopPx = getExtMarginTopPx(dinamicXEngine, getContext(), jSONObject);
            if (marginLayoutParams.topMargin == extMarginTopPx) {
                return;
            }
            marginLayoutParams.topMargin = extMarginTopPx;
            setLayoutParams(marginLayoutParams);
        }
    }

    private int getExtMarginTopPx(DinamicXEngine dinamicXEngine, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f1d4d97", new Object[]{this, dinamicXEngine, context, jSONObject})).intValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        float f = 0.0f;
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("marginTop");
            if (!TextUtils.isEmpty(string)) {
                try {
                    f = Integer.parseInt(string);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return gbg.a(dinamicXEngine, context, f);
    }

    private void checkCreateView(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2, DinamicXEngine dinamicXEngine, laq laqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c231907", new Object[]{this, dXTemplateItem, dXTemplateItem2, dinamicXEngine, laqVar});
        } else if (dXTemplateItem == null) {
        } else {
            if (dXTemplateItem.equals(dXTemplateItem2) && this.mDxSearchView != null && !isDxConfigChange(dinamicXEngine)) {
                return;
            }
            String str = "null";
            laq a2 = laqVar.c("模板信息变了;").a("原来模板名称", dXTemplateItem2 == null ? str : dXTemplateItem2.f11925a);
            if (dXTemplateItem2 != null) {
                str = dXTemplateItem2.b + "";
            }
            a2.a("原来模板版本", str).a("新模板名称", dXTemplateItem.f11925a).a("新模板版本", dXTemplateItem.b + "");
            removeAllViews();
            lar.e("createView_" + getTemplateName(dXTemplateItem));
            DXResult<DXRootView> a3 = dinamicXEngine.a(getContext(), dXTemplateItem);
            lar.f("createView_" + getTemplateName(dXTemplateItem));
            this.mDxSearchView = a3.f11780a;
            addView(a3.f11780a);
            dinamicXEngine.a(this.mDxSearchView, (DXRootView.a) this.mSearchBarAppearStatus);
            laqVar.c("dxEngine  preCreateSearchView finish");
        }
    }

    private String getTemplateName(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("885e7435", new Object[]{this, dXTemplateItem}) : dXTemplateItem != null ? dXTemplateItem.f() : "";
    }

    private boolean isDxConfigChange(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a84174c", new Object[]{this, dinamicXEngine})).booleanValue();
        }
        if (!this.mIsHudDevice || this.mIsScaleEnable == dinamicXEngine.b().y()) {
            z = false;
        }
        this.mIsScaleEnable = dinamicXEngine.b().y();
        return z;
    }

    private DXWidgetNode findWidgetNodeById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("43c84261", new Object[]{this, str});
        }
        DXRootView dXRootView = this.mDxSearchView;
        if (dXRootView == null) {
            lap.a("SearchBar", "findWidgetNodeById", "mDxSearchView == null");
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            lap.a("SearchBar", "findWidgetNodeById", "expandWidgetNode == null");
            return null;
        }
        return expandWidgetNode.queryWidgetNodeByUserId(str);
    }
}
