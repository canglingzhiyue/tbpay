package com.taobao.search.weex.component;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Space;
import com.alibaba.android.enhance.nested.nested.WXCoordinatorLayout;
import com.alibaba.android.enhance.nested.nested.WXNestedHeader;
import com.alibaba.android.enhance.nested.nested.WXNestedParent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.nop;
import tb.nwl;
import tb.nwr;

/* loaded from: classes8.dex */
public class InShopSearchComponent extends WXVContainer<ViewGroup> implements WXNestedHeader.c, WXSwipeLayout.OnRefreshOffsetChangedListener, nop.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InShopSearchComponent";
    private boolean isActive;
    private WXSwipeLayout.OnRefreshOffsetChangedListener mOverScrollListener;
    private Map<String, String> mParams;
    private nwl mShopAuctionModule;
    private String mViewState;
    private Space secondFloorHelperView;

    static {
        kge.a(1507367726);
        kge.a(2010057944);
        kge.a(-400650516);
        kge.a(-569200449);
    }

    public static /* synthetic */ Object ipc$super(InShopSearchComponent inShopSearchComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -713828414:
                super.updateProperties((Map) objArr[0]);
                return null;
            case -39247480:
                return new Boolean(super.setProperty((String) objArr[0], objArr[1]));
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public InShopSearchComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.secondFloorHelperView = null;
        TLogTracker.a(r.bk());
        TLogTracker.a("InShopMain");
        if (!r.F()) {
            c.a("com.taobao.search", null);
        }
        this.mShopAuctionModule = new nwr(false);
        this.mShopAuctionModule.a(this);
        this.mShopAuctionModule.a(true);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public ViewGroup mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c190d02e", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        this.mParams = hashMap;
        this.mShopAuctionModule.a((Activity) context, hashMap);
        this.mShopAuctionModule.g();
        return (ViewGroup) this.mShopAuctionModule.a();
    }

    @WXComponentProp(name = "params")
    public void setSearchParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120d3961", new Object[]{this, str});
            return;
        }
        Map<String, String> parseSearchParams = parseSearchParams(str);
        if (this.mParams.equals(parseSearchParams)) {
            return;
        }
        this.mShopAuctionModule.a(parseSearchParams);
        this.mParams = parseSearchParams;
        this.mShopAuctionModule.b();
    }

    @WXComponentProp(name = "isNewStyle")
    public void setIsNewStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f3340e", new Object[]{this, str});
            return;
        }
        nwl nwlVar = this.mShopAuctionModule;
        if (nwlVar == null) {
            return;
        }
        nwlVar.c("true".equals(str));
    }

    @WXComponentProp(name = "enableOverScroll")
    public void enableSecondFloor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e85f46", new Object[]{this, str});
        } else if (!StringUtils.equals(str, "true")) {
        } else {
            registerPullDownEvent();
        }
    }

    private void registerPullDownEvent() {
        WXNestedHeader wXNestedHeader;
        WXNestedParent wXNestedParent;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fb90f7", new Object[]{this});
        } else if (r.s()) {
        } else {
            WXCoordinatorLayout wXCoordinatorLayout = (ViewParent) mo1286getHostView();
            while (true) {
                wXNestedHeader = null;
                if (wXCoordinatorLayout == null) {
                    wXNestedParent = null;
                    break;
                }
                wXCoordinatorLayout = wXCoordinatorLayout.getParent();
                if (wXCoordinatorLayout instanceof WXCoordinatorLayout) {
                    wXNestedParent = wXCoordinatorLayout.getComponent();
                    break;
                }
            }
            if (wXNestedParent == null) {
                return;
            }
            while (true) {
                if (i >= wXNestedParent.getChildCount()) {
                    break;
                }
                WXComponent child = wXNestedParent.getChild(i);
                if (child instanceof WXNestedHeader) {
                    wXNestedHeader = (WXNestedHeader) child;
                    break;
                }
                i++;
            }
            if (wXNestedHeader == null) {
                return;
            }
            wXNestedHeader.registerOnPullDownEventDirectly(this);
        }
    }

    private Map<String, String> parseSearchParams(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7736e627", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            parseObject = JSON.parseObject(str);
        } catch (Exception unused) {
        }
        if (parseObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String obj = value != null ? value.toString() : "";
            hashMap.put(key, obj);
            q.a(TAG, "parseSearchParams: " + key + " - " + obj);
        }
        return hashMap;
    }

    @WXComponentProp(name = "sortBarStatus")
    public void setSortBarStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78d5d76", new Object[]{this, str});
        } else if (StringUtils.equals(str, "transparent")) {
            this.mShopAuctionModule.a(2);
        } else {
            this.mShopAuctionModule.a(1);
        }
    }

    @WXComponentProp(name = "state")
    public void setViewState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2529bb", new Object[]{this, str});
            return;
        }
        this.mViewState = str;
        if (this.mShopAuctionModule == null) {
            return;
        }
        if (StringUtils.equals(str, "appear")) {
            this.mShopAuctionModule.f();
        } else {
            StringUtils.equals(str, "disappear");
        }
    }

    @WXComponentProp(name = "active")
    public void setActive(boolean z) {
        WXNestedParent findParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc6e25", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isActive = z;
        if (!this.isActive || (findParent = findParent()) == null) {
            return;
        }
        findParent.holdActiveChild(this);
    }

    @WXComponentProp(name = noa.KEY_MINI_APP)
    public void setIsMiniApp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86dcb8f", new Object[]{this, str});
        } else {
            this.mShopAuctionModule.a(str);
        }
    }

    @WXComponentProp(name = noa.KEY_MINI_APP_DETAIL_URL)
    public void setMiniAppDetailUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93505ac7", new Object[]{this, str});
        } else {
            this.mShopAuctionModule.b(str);
        }
    }

    @WXComponentProp(name = noa.KEY_MINI_APP_CATEGORY_URL)
    public void setMiniAppCategoryUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eddecba", new Object[]{this, str});
        } else {
            this.mShopAuctionModule.c(str);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean setProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fda92188", new Object[]{this, str, obj})).booleanValue() : super.setProperty(str, obj);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
        } else {
            super.updateProperties(map);
        }
    }

    private WXNestedParent findParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXNestedParent) ipChange.ipc$dispatch("ae51c7f7", new Object[]{this});
        }
        Object hostView = mo1286getHostView();
        while (true) {
            WXCoordinatorLayout wXCoordinatorLayout = (ViewGroup) hostView;
            if (wXCoordinatorLayout != null) {
                if (wXCoordinatorLayout instanceof WXCoordinatorLayout) {
                    return wXCoordinatorLayout.getComponent();
                }
                hostView = wXCoordinatorLayout.getParent();
                if (!(hostView instanceof ViewGroup)) {
                    break;
                }
            } else {
                break;
            }
        }
        return null;
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        q.a(TAG, "onActivityResume");
        TLogTracker.a("InShopMain");
        super.onActivityResume();
        nwl nwlVar = this.mShopAuctionModule;
        if (nwlVar == null) {
            return;
        }
        nwlVar.c();
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        q.a(TAG, "onActivityPause");
        super.onActivityPause();
        nwl nwlVar = this.mShopAuctionModule;
        if (nwlVar == null) {
            return;
        }
        nwlVar.d();
    }

    public void addOnRefreshOffsetChangedListener(WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcb4314", new Object[]{this, onRefreshOffsetChangedListener});
        } else {
            this.mOverScrollListener = onRefreshOffsetChangedListener;
        }
    }

    @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.OnRefreshOffsetChangedListener
    public void onOffsetChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i)});
            return;
        }
        WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener = this.mOverScrollListener;
        if (onRefreshOffsetChangedListener == null) {
            return;
        }
        onRefreshOffsetChangedListener.onOffsetChanged(i);
    }

    @JSMethod
    public void enableOverScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30eeed2b", new Object[]{this});
        } else {
            registerPullDownEvent();
        }
    }

    @JSMethod
    public void syncAddCartPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339a1496", new Object[]{this});
        } else if (this.mShopAuctionModule == null || !StringUtils.equals(this.mViewState, "appear")) {
        } else {
            this.mShopAuctionModule.j();
        }
    }

    @Override // tb.nop.a
    public void onPagePropertiesUpdate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d12d4", new Object[]{this, map});
        } else {
            fireEvent("searchcomplete", new HashMap(map));
        }
    }

    @Override // tb.nop.a
    public void onSearchRenderEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59913c45", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("renderEndTime", String.valueOf(System.currentTimeMillis()));
        fireEvent("searchrenderend", hashMap);
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        q.a(TAG, MessageID.onDestroy);
        nwl nwlVar = this.mShopAuctionModule;
        if (nwlVar == null) {
            return;
        }
        nwlVar.e();
    }
}
