package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.live.home.widget.tab.XTabLayout;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.morelive.TaoMoreLiveRoomFrame;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.taolivemorelive.morelive.business.TabMenuResponseData;
import com.taobao.taolive.uikit.view.TBLiveImageView;
import com.taobao.taolivehome.homepage2.MainController;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.nmf;
import tb.pql;
import tb.pqn;
import tb.pqq;
import tb.tki;

/* loaded from: classes8.dex */
public class TaoMoreLiveFrame extends TaoMoreLiveRoomFrame implements XTabLayout.b, com.taobao.taolive.sdk.adapter.network.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean firstSlideInto;
    private d mColorSwitcher;
    private ViewStub mContentStub;
    private boolean mDXInit;
    private ImageView mMoreLiveBackImg;
    private TBLiveImageView mMoreLiveBackLiveGuide;
    private c mPagerAdapter;
    private View mRootViewBackground;
    private XTabLayout mTabLayout;
    public g mTaoMoreLiveView;
    private List<TabMenuResponseData.TopTab> mTopTabs;
    private ViewPager mViewPager;

    public static /* synthetic */ Object ipc$super(TaoMoreLiveFrame taoMoreLiveFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1775111991:
                super.hide();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.b
    public void onTabReselected(XTabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cddb74e", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.b
    public void onTabUnselected(XTabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54d4c34", new Object[]{this, dVar});
        }
    }

    public static /* synthetic */ ViewStub access$002(TaoMoreLiveFrame taoMoreLiveFrame, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("fc75545b", new Object[]{taoMoreLiveFrame, viewStub});
        }
        taoMoreLiveFrame.mContentStub = viewStub;
        return viewStub;
    }

    public static /* synthetic */ void access$100(TaoMoreLiveFrame taoMoreLiveFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214577a8", new Object[]{taoMoreLiveFrame, str});
        } else {
            taoMoreLiveFrame.onRequestSuccess(str);
        }
    }

    public TaoMoreLiveFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.firstSlideInto = true;
        this.mContentStub = null;
        if (this.mContainer == null) {
            this.mContentStub = new ViewStub(this.mContext);
            this.mContainer = new FrameLayout(this.mContext);
            ((FrameLayout) this.mContainer).addView(this.mContentStub, new FrameLayout.LayoutParams(-1, -1));
            this.mContentStub.setLayoutResource(R.layout.taolive_more_live_container_new);
            this.mContentStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.TaoMoreLiveFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewStub.OnInflateListener
                public void onInflate(ViewStub viewStub, View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7762d6fd", new Object[]{this, viewStub, view});
                        return;
                    }
                    TaoMoreLiveFrame.this.initContainer();
                    TaoMoreLiveFrame.access$002(TaoMoreLiveFrame.this, null);
                }
            });
        }
    }

    public void setMoreLiveBackground(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb86e4c8", new Object[]{this, new Float(f)});
            return;
        }
        View view = this.mRootViewBackground;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public void initContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa12d58", new Object[]{this});
            return;
        }
        if (this.mContainer == null) {
            this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_more_live_container_new, (ViewGroup) null);
        }
        this.mRootViewBackground = this.mContainer.findViewById(R.id.taolive_morelive_background);
        this.mViewPager = (ViewPager) this.mContainer.findViewById(R.id.taolive_more_viewpager);
        this.mTabLayout = (XTabLayout) this.mContainer.findViewById(R.id.taolive_more_tab_layout);
        this.mColorSwitcher = new d(this.mContainer, this.mTabLayout);
        this.mColorSwitcher.a(true);
        this.mMoreLiveBackImg = (ImageView) this.mContainer.findViewById(R.id.taolive_morelive_back_img);
        ImageView imageView = this.mMoreLiveBackImg;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.TaoMoreLiveFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (pql.a().d() == null) {
                    } else {
                        pql.a().d().b();
                        TaoMoreLiveFrame.this.trackMoreLiveExitClick("left");
                    }
                }
            });
        }
        this.mMoreLiveBackLiveGuide = (TBLiveImageView) this.mContainer.findViewById(R.id.taolive_more_backlive_guide);
        this.mMoreLiveBackLiveGuide.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.TaoMoreLiveFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (pql.a().d() == null) {
                } else {
                    pql.a().d().b();
                    TaoMoreLiveFrame.this.trackMoreLiveExitClick("right");
                }
            }
        });
    }

    public void requestMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76422a15", new Object[]{this});
        } else if (tki.a()) {
            getUnImportantLiveInfo(this.mFrameContext);
        } else {
            requestMenuOLd();
        }
    }

    private void getUnImportantLiveInfo(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1f6611", new Object[]{this, aVar});
        } else if (!(aVar instanceof h)) {
        } else {
            h hVar = (h) aVar;
            if (hVar.O() == null) {
                return;
            }
            hVar.O().a(new b.a() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.TaoMoreLiveFrame.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
                    } else if (unImportantLiveInfoResponseData == null || l.e(unImportantLiveInfoResponseData.tabInfoData)) {
                    } else {
                        TaoMoreLiveFrame.access$100(TaoMoreLiveFrame.this, unImportantLiveInfoResponseData.tabInfoData);
                    }
                }
            });
        }
    }

    private void onRequestSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de2a084", new Object[]{this, str});
            return;
        }
        try {
            this.mTopTabs = ((TabMenuResponseData) JSON.parseObject(str, TabMenuResponseData.class)).bottomTab.get(0).topTab;
        } catch (Exception unused) {
        }
    }

    private void requestMenuOLd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe912e0", new Object[]{this});
        } else {
            new com.taobao.taolive.taolivemorelive.morelive.business.a(this).a(this.mLiveDataModel);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        requestMenu();
    }

    public void initMoreView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ace0051", new Object[]{this});
            return;
        }
        if (this.mTopTabs == null) {
            this.mTopTabs = getDefaultTab();
        }
        if (this.mViewPager == null) {
            return;
        }
        int enterIndex = getEnterIndex(this.mTopTabs, true);
        this.mViewPager.setOffscreenPageLimit(this.mTopTabs.size());
        this.mPagerAdapter = new c(this.mTopTabs, this.mFrameContext, this.mContext);
        this.mViewPager.setAdapter(this.mPagerAdapter);
        if (enterIndex != 0) {
            setViewpagerCurrent(enterIndex);
        }
        XTabLayout xTabLayout = this.mTabLayout;
        if (xTabLayout != null) {
            xTabLayout.setupWithViewPager(this.mViewPager);
            this.mTabLayout.setOnTabSelectedListener(this);
        }
        this.mViewPager.setCurrentItem(enterIndex);
    }

    @Override // com.taobao.taolive.sdk.morelive.TaoMoreLiveRoomFrame
    public void pageShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fca6881", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewStub viewStub = this.mContentStub;
        if (viewStub != null) {
            viewStub.inflate();
        }
        if (!z && pql.a().e() != null) {
            pql.a().e().b();
            pql.a().a(false);
            setMoreLiveBackground(0.0f);
            if (n.a() == null) {
                return;
            }
            n.a().i(false);
            return;
        }
        pql.a().a(true);
        if (n.a() != null) {
            n.a().i(true);
        }
        if (this.firstSlideInto) {
            MainController.a(null);
            this.mDXInit = true;
            initMoreView();
            this.firstSlideInto = false;
        } else if (this.mViewPager != null) {
            if (this.mTopTabs == null) {
                this.mTopTabs = getDefaultTab();
            }
            int enterIndex = getEnterIndex(this.mTopTabs, false);
            if (enterIndex != -1) {
                this.mViewPager.setCurrentItem(enterIndex);
            }
        }
        if (!z) {
            return;
        }
        setMoreLiveBackground(1.0f);
        if (pql.a().e() != null) {
            pql.a().e().a();
        }
        showMoreLive();
        trackMoreLiveShow();
        pql.a().b(false);
    }

    public void showMoreLive() {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2350f585", new Object[]{this});
        } else if (this.mPagerAdapter == null || (viewPager = this.mViewPager) == null) {
        } else {
            int currentItem = viewPager.getCurrentItem();
            Object instantiateItem = this.mPagerAdapter.instantiateItem((ViewGroup) this.mViewPager, currentItem);
            this.mColorSwitcher.a(false);
            if (instantiateItem instanceof e) {
                this.mTaoMoreLiveView = (e) instantiateItem;
                this.mTaoMoreLiveView.a(true, currentItem);
            } else if (instantiateItem instanceof f) {
                this.mTaoMoreLiveView = (f) instantiateItem;
                this.mTaoMoreLiveView.a(true, currentItem);
            }
            pql.a().d(null);
            if (this.mMoreLiveBackLiveGuide == null) {
                return;
            }
            if (!pqn.b()) {
                this.mMoreLiveBackLiveGuide.setVisibility(8);
            } else if (currentItem == 0) {
                this.mMoreLiveBackLiveGuide.setVisibility(8);
            } else {
                this.mMoreLiveBackLiveGuide.setVisibility(0);
                pqq.d(this.mFrameContext, "morelive_rightexit", null);
            }
        }
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.b
    public void onTabSelected(XTabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87d7c5b", new Object[]{this, dVar});
            return;
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || dVar == null) {
            return;
        }
        viewPager.setCurrentItem(dVar.k());
        showMoreLive();
        if (this.mTaoMoreLiveView == null) {
            return;
        }
        TabMenuResponseData.TopTab topTab = this.mTopTabs.get(dVar.k());
        HashMap hashMap = new HashMap();
        if (topTab != null) {
            hashMap.put("typePosition", String.valueOf(dVar.k()));
            hashMap.put("typeName-type", topTab.channelType);
            hashMap.put("typeName-id", topTab.channelId);
        }
        String l = pql.a().l();
        if (!l.e(l)) {
            hashMap.put("trackInfoTrans", l);
        }
        pqq.b(this.mFrameContext, "moreliveTab", hashMap);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netResponse == null || netResponse.getBytedata() == null || l.e(new String(netResponse.getBytedata()))) {
        } else {
            try {
                onRequestSuccess(netResponse.getDataJsonObject().toString());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            super.show();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            super.hide();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    public void trackMoreLiveExitClick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c57c2f", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("position", str);
        pqq.b(this.mFrameContext, "morelive_exit_clck", hashMap);
    }

    public void trackMoreLiveShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64cc7970", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showstatus", pql.a().h());
        String b = pql.a().b();
        if (!l.e(b)) {
            hashMap.put("maidianTrans", b);
        }
        String l = pql.a().l();
        if (!l.e(l)) {
            hashMap.put("trackInfoTrans", l);
        }
        String i = pql.a().i();
        if (!l.e(i)) {
            try {
                String string = JSON.parseObject(i).getString("operatorId");
                if (!l.e(string)) {
                    hashMap.put("hotType", string);
                }
            } catch (Exception unused) {
            }
        }
        hashMap.put("entryType", pql.a().k() ? "click" : "slide");
        pqq.d(this.mFrameContext, "morelive_show", hashMap);
        List<TabMenuResponseData.TopTab> list = this.mTopTabs;
        if (list == null) {
            return;
        }
        for (TabMenuResponseData.TopTab topTab : list) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("typeName-type", topTab.channelType);
            hashMap2.put("typeName-id", topTab.channelId);
            if (!l.e(l)) {
                hashMap2.put("trackInfoTrans", l);
            }
            pqq.d(this.mFrameContext, "show-moreliveTab", hashMap2);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        g gVar = this.mTaoMoreLiveView;
        if (gVar != null) {
            gVar.m();
        }
        this.firstSlideInto = true;
        this.mPagerAdapter = null;
        this.mTopTabs = null;
        pql.a().a(false);
        if (!this.mDXInit) {
            return;
        }
        MainController.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    private List<TabMenuResponseData.TopTab> getDefaultTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bf74916", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        TabMenuResponseData.TopTab topTab = new TabMenuResponseData.TopTab();
        topTab.name = "精选";
        topTab.channelType = "jingxuan";
        topTab.isDefault = "true";
        topTab.channelId = "0";
        arrayList.add(topTab);
        TabMenuResponseData.TopTab topTab2 = new TabMenuResponseData.TopTab();
        topTab2.name = nmf.TEXT_UNFOLLOW_DEFAULT;
        topTab2.channelType = "follow";
        topTab2.isDefault = "false";
        topTab2.channelId = "0";
        arrayList.add(topTab2);
        return arrayList;
    }

    private int getEnterIndex(List<TabMenuResponseData.TopTab> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b022f7f", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        TabMenuResponseData.TopTab f = pql.a().f();
        pql.a().a((TabMenuResponseData.TopTab) null);
        if (f != null) {
            if (!pql.a().k() && pqn.c()) {
                getRemenParam();
            }
            String str = f.channelId;
            String str2 = f.channelType;
            if (!l.e(str) && !l.e(str2)) {
                for (int i = 0; i < list.size(); i++) {
                    TabMenuResponseData.TopTab topTab = list.get(i);
                    if (str2.equals(topTab.channelType) && str.equals(topTab.channelId)) {
                        return i;
                    }
                }
            }
        } else if (!z) {
            return -1;
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if ("true".equals(list.get(i2).isDefault)) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public void getRemenParam() {
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85506007", new Object[]{this});
            return;
        }
        DXRootView j = pql.a().j();
        if (j == null) {
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = j.getExpandWidgetNode().queryWidgetNodeByUserId("remenEntrySlider");
        if (!(queryWidgetNodeByUserId instanceof DXSliderLayout)) {
            return;
        }
        int pageIndex = ((DXSliderLayout) queryWidgetNodeByUserId).getPageIndex();
        JSONObject data = j.getData();
        if (data == null || (jSONArray = data.getJSONArray(pqn.e())) == null || jSONArray.size() <= 0 || (jSONObject = jSONArray.getJSONObject(pageIndex)) == null) {
            return;
        }
        TabMenuResponseData.TopTab topTab = new TabMenuResponseData.TopTab();
        topTab.isDefault = "true";
        topTab.channelId = jSONObject.getString("channelId");
        topTab.channelType = jSONObject.getString("channelType");
        topTab.name = jSONObject.getString("title");
        pql.a().a(topTab);
        String string = jSONObject.getString("extParam");
        if (!l.e(string)) {
            pql.a().d(string);
        }
        String string2 = jSONObject.getString("topAccountList");
        if (l.e(string2)) {
            return;
        }
        pql.a().b(string2);
    }

    private void setViewpagerCurrent(int i) {
        try {
            Field declaredField = Class.forName("android.support.v4.view.ViewPager").getDeclaredField("mCurItem");
            declaredField.setAccessible(true);
            declaredField.setInt(this.mViewPager, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
