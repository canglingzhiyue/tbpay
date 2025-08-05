package com.taobao.android.live.plugin.atype.flexalocal.good.goodframe;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPageInfo;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPopupView;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.core.b;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.goodlist.f;
import com.taobao.taolive.sdk.goodlist.h;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.HashMap;
import java.util.List;
import tb.ddv;
import tb.ddw;
import tb.hib;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hjs;
import tb.hkk;
import tb.kge;
import tb.phg;
import tb.pox;
import tb.xkw;

/* loaded from: classes5.dex */
public abstract class AbstractGoodFrame extends BaseFrame implements a<EnterGoodsData>, f, ddv, pox<EnterGoodsData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AbstractGoodListFrame";
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    public View mCover;
    private String mDefaultCategoryId;
    private h mFrameEventListener;
    public ItemGroupPopupView mGoodGroupPopupView;
    public c mGoodLiveContext;
    public ViewGroup mGoodsListContainer;
    public com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f mGoodsView;
    private long mInitTime;
    public ViewGroup mItemGroupContainer;
    public String mLiveId;
    public String presetTopItemId;

    static {
        kge.a(-362956439);
        kge.a(-189160491);
        kge.a(191318335);
        kge.a(-462660079);
        kge.a(-1754585422);
    }

    public static /* synthetic */ Object ipc$super(AbstractGoodFrame abstractGoodFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != -1257959318) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDidDisappear();
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "GoodsFrame";
    }

    @Override // com.taobao.taolive.sdk.goodlist.f
    public BaseFrame getFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("3229a038", new Object[]{this}) : this;
    }

    public abstract boolean isKandian();

    @Override // tb.pox
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        }
    }

    public AbstractGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(activity, z, tBLiveDataModel, aVar);
        this.mContext = activity;
        this.mLiveId = str;
        initCover(view);
    }

    @Override // tb.pox
    public void onResult(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94422f21", new Object[]{this, enterGoodsData});
            return;
        }
        if (this.mFrameContext != null && this.mFrameContext.g() != null) {
            this.mFrameContext.g().remove(aw.PARAM_ITEM_HOLD_TYPE);
            this.mFrameContext.g().remove(aw.PARAM_ITEM_IDS);
        }
        checkEnterUnderTakeNew(enterGoodsData);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.a
    public void openGoodsPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e84fb01", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "openInsideDetailError");
        ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap, this.mFrameContext.G());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.a
    public void openInsideDetail(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6034925c", new Object[]{this, enterGoodsData});
        } else {
            checkEnterUnderTakeNew(enterGoodsData);
        }
    }

    public void goodRelatedInit() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ed8c65", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
        } else {
            this.mInitTime = System.currentTimeMillis();
            this.mLiveId = this.mLiveDataModel.mVideoInfo.liveId;
            if (this.mLiveDataModel.mInitParams != null) {
                this.mDefaultCategoryId = this.mLiveDataModel.mInitParams.get(aw.PARAM_CATEGORY_ID);
            }
            b bVar = null;
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r() == null) {
                str = null;
                str2 = null;
            } else {
                str = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r().a();
                str2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r().b();
            }
            this.mGoodLiveContext = c.a(this.mContext, this.mLiveDataModel, this.mLandscape).a(false).b(isKandian()).c(hiq.a(this.mFrameContext)).a(new e()).a(str, str2, getTransparentParams(this.mLiveDataModel)).a(this.mFrameContext != null ? this.mFrameContext.z() : null).a();
            this.mGoodLiveContext.a(this.mFrameContext);
            if (this.mFrameContext != null) {
                this.mGoodLiveContext.b(this.mFrameContext.f8395a);
                this.mFrameContext.a((r) this.mGoodLiveContext);
                if (this.mFrameContext.g() != null) {
                    this.mGoodLiveContext.P = this.mFrameContext.g().get(aw.PARAM_ITEM_IDS);
                    this.mGoodLiveContext.Q = this.mFrameContext.g().get(aw.PARAM_SJSD_ITEM_ID);
                    if (TextUtils.isEmpty(this.mDefaultCategoryId)) {
                        this.mDefaultCategoryId = this.mFrameContext.g().get(aw.PARAM_CATEGORY_ID);
                    }
                }
            }
            if (this.mFrameContext != null) {
                bVar = this.mFrameContext.f();
            }
            e x = this.mGoodLiveContext.x();
            c cVar = this.mGoodLiveContext;
            x.a(cVar, bVar, cVar.f13841a, this, this);
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(this.mContext, this.mLiveDataModel, this.mGoodLiveContext, true);
            h hVar = this.mFrameEventListener;
            if (hVar != null) {
                hVar.a(this.mLiveDataModel);
            }
            registerLifeCycle();
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.f
    public void setContainer(ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6df32c4", new Object[]{this, viewGroup, viewGroup2});
            return;
        }
        this.mGoodsListContainer = viewGroup;
        this.mItemGroupContainer = viewGroup2;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.t()) {
            return;
        }
        his.a(TAG, "onResume | this=" + this);
        com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f fVar = this.mGoodsView;
        if (fVar == null) {
            return;
        }
        fVar.m();
    }

    public void initGoodListPopup(c cVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e467dee4", new Object[]{this, cVar, hashMap});
            return;
        }
        ViewGroup viewGroup = this.mGoodsListContainer;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getParent() == null && this.mItemGroupContainer != null && this.mGoodLiveContext.l()) {
            ((ViewGroup) this.mItemGroupContainer.getParent()).addView(this.mGoodsListContainer, 0);
        }
        try {
            this.mGoodsListContainer.removeAllViews();
        } catch (Exception e) {
            his.b(TAG, "initGoodListPopup | e=" + e);
        }
        this.mGoodsListContainer.setVisibility(8);
        VideoInfo videoInfo = this.mLiveDataModel == null ? null : this.mLiveDataModel.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        this.mGoodsView = new com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c(cVar, this.mGoodsListContainer);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (videoInfo.broadCaster != null) {
            hashMap.put(WXConstantsOut.SHOPID, videoInfo.broadCaster.shopId);
            hashMap.put("creatorId", videoInfo.broadCaster.accountId);
        }
        hashMap.put("orderUrl", getOrderUrl(videoInfo.topBarEntranceUrl));
        hashMap.put("cartsEntranceUrl", videoInfo.cartsEntranceUrl);
        hashMap.put("roomStatus", videoInfo.roomStatus);
        hashMap.put("extraWeexUrlList", JSONObject.toJSONString(videoInfo.extraWeexUrlList));
        hashMap.put("itemListType", videoInfo.itemListType);
        hashMap.put("itemListShowType", videoInfo.itemListShowType);
        if (videoInfo.extraGoodsTabList != null && !videoInfo.extraGoodsTabList.isEmpty()) {
            try {
                hashMap.put("extraGoodsTabList", JSONObject.toJSONString(videoInfo.extraGoodsTabList));
            } catch (Throwable th) {
                his.b(TAG, "extraGoodsTabList to json error: " + th.getMessage());
            }
        } else {
            his.b(TAG, "extraGoodsTabList null or empty");
        }
        this.mGoodsView.setLiveInfos(hashMap);
    }

    @Override // com.taobao.taolive.sdk.goodlist.f
    public void show(boolean z, HashMap<String, String> hashMap, long j, boolean z2) {
        g gVar;
        ATaoLiveOpenEntity o;
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb45d33", new Object[]{this, new Boolean(z), hashMap, new Long(j2), new Boolean(z2)});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
            his.b(TAG, "show | mLiveDataModel is null. mLiveId=" + this.mLiveId + " this=" + this);
        } else {
            hib.a(!(!z ? this.mGoodsView != null : this.mItemGroupContainer != null), this.mGoodLiveContext, (hashMap == null || TextUtils.isEmpty(hashMap.get("from"))) ? false : "wyswyg".equals(hashMap.get("from")));
            ItemGroupPageInfo itemGroupPageInfo = null;
            if (this.mFrameContext == null) {
                gVar = null;
            } else if (!this.mFrameContext.S()) {
                his.b(TAG, "setCanShowPopFlag,GoodFrame处理，禁止显示浮层，canShowPop=false");
                return;
            } else {
                gVar = this.mFrameContext.z();
            }
            c cVar = this.mGoodLiveContext;
            if (cVar == null) {
                this.mGoodLiveContext = c.a(this.mContext, this.mLiveDataModel, this.mLandscape).a(z2).b(isKandian()).c(hiq.a(this.mFrameContext)).a(com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r().c()).a(new e()).a(gVar).a();
                this.mGoodLiveContext.a(this.mFrameContext);
            } else {
                cVar.b(z2);
            }
            if (!phg.d().a() && this.mFrameContext != null && (o = this.mFrameContext.o()) != null && o.abilityCompontent != null && !o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame)) {
                this.mGoodLiveContext.a(true);
                his.b(TAG, "setDisableExplainFunction");
            }
            String str = hashMap != null ? hashMap.get("glopenfrom") : "";
            if (TextUtils.isEmpty(str)) {
                str = hashMap != null ? hashMap.get("from") : "";
            }
            if (z && hir.j()) {
                this.mItemGroupContainer.setVisibility(0);
                ItemGroupPopupView itemGroupPopupView = this.mGoodGroupPopupView;
                if (itemGroupPopupView != null) {
                    itemGroupPopupView.destroy();
                }
                if (hashMap.containsKey("data")) {
                    itemGroupPageInfo = (ItemGroupPageInfo) JSON.parseObject(hashMap.get("data"), ItemGroupPageInfo.class);
                }
                if (itemGroupPageInfo == null || !itemGroupPageInfo.checkInfo()) {
                    his.b(TAG, "show | pageInfo is null or params is empty. pageInfo=" + itemGroupPageInfo);
                    return;
                }
                this.mGoodGroupPopupView = new ItemGroupPopupView(this.mGoodLiveContext, this.mItemGroupContainer);
                this.mGoodGroupPopupView.setPageInfo(this.mGoodsView, itemGroupPageInfo);
                this.mGoodGroupPopupView.show();
            } else {
                if (this.mGoodsView == null) {
                    initGoodListPopup(this.mGoodLiveContext, hashMap);
                }
                if (this.mGoodsView != null) {
                    if (hashMap != null && j2 <= 0) {
                        j2 = l.a(hashMap.get("bizTopItemId"), -1L);
                    }
                    if (j2 <= 0) {
                        j2 = l.a(this.presetTopItemId, -1L);
                    }
                    this.presetTopItemId = null;
                    String str2 = TextUtils.isEmpty(this.mDefaultCategoryId) ? j2 > 0 ? "0" : null : this.mDefaultCategoryId;
                    String str3 = hashMap != null ? hashMap.get(aw.PARAM_CATEGORY_ID) : "";
                    if (TextUtils.isEmpty(str3)) {
                        str3 = str2;
                    }
                    this.mGoodsView.a(str3, j2, str);
                    this.mDefaultCategoryId = null;
                }
            }
            View view = this.mCover;
            if (view != null) {
                view.setVisibility(0);
            }
            h hVar = this.mFrameEventListener;
            if (hVar != null) {
                hVar.a(z, hashMap, str);
            }
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("clickSource", str);
            hashMap2.put("glopenfrom", str);
            hashMap2.put("glShowTime", "" + (System.currentTimeMillis() - this.mInitTime));
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r() != null) {
                hashMap2.put("session_id", com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r().c());
            }
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b(ag.CLICK_GOODS_LIST, hashMap2);
            }
            if (this.mGoodLiveContext.E() != null) {
                this.mGoodLiveContext.E().d();
            }
            hiq.a(this.mFrameContext, true);
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.f
    public void setFrameEventListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d9ba5a", new Object[]{this, hVar});
        } else {
            this.mFrameEventListener = hVar;
        }
    }

    public void initCover(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a087084", new Object[]{this, view});
            return;
        }
        this.mCover = view;
        View view2 = this.mCover;
        if (view2 == null) {
            return;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                if (AbstractGoodFrame.this.mFrameContext != null && AbstractGoodFrame.this.mFrameContext.z() != null && AbstractGoodFrame.this.mFrameContext.z().M()) {
                    AbstractGoodFrame.this.mFrameContext.e().a(xkw.d, "assembly", AbstractGoodFrame.this.mFrameContext.G());
                }
                AbstractGoodFrame.this.hide();
            }
        });
        delegateToButton(this.mCover);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        if (this.mGoodLiveContext.E() != null) {
            this.mGoodLiveContext.E().d().a();
        }
        ItemGroupPopupView itemGroupPopupView = this.mGoodGroupPopupView;
        if (itemGroupPopupView != null) {
            itemGroupPopupView.destroyWithAnimation();
            this.mGoodGroupPopupView = null;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f fVar = this.mGoodsView;
        if (fVar != null && fVar.isShowing()) {
            this.mGoodsView.hide();
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
        h hVar = this.mFrameEventListener;
        if (hVar != null) {
            hVar.b();
        }
        hiq.a(this.mFrameContext, false);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        onDestroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        his.a(TAG, "onDestroy | this=" + this);
        this.mDefaultCategoryId = null;
        unregisterLifeCycle();
        com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f fVar = this.mGoodsView;
        if (fVar != null) {
            if (fVar.isShowing()) {
                this.mGoodsView.hide();
            }
            this.mGoodsView.destroy();
            this.mGoodsView = null;
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
        c cVar = this.mGoodLiveContext;
        if (cVar != null) {
            cVar.z();
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(this.mFrameContext == null ? null : (c) this.mFrameContext.c());
        this.presetTopItemId = null;
    }

    private void registerLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e41e8ee", new Object[]{this});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.t()) {
        } else {
            unregisterLifeCycle();
            this.mActivityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    } else if (AbstractGoodFrame.this.mContext != activity || AbstractGoodFrame.this.mGoodsView == null) {
                    } else {
                        his.a(AbstractGoodFrame.TAG, "onActivityResumed | this=" + AbstractGoodFrame.this);
                        AbstractGoodFrame.this.mGoodsView.m();
                    }
                }
            };
            if (!(this.mContext instanceof Activity)) {
                return;
            }
            ((Activity) this.mContext).getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        }
    }

    private void unregisterLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546323f5", new Object[]{this});
        } else if (this.mActivityLifecycleCallbacks == null || !(this.mContext instanceof Activity)) {
        } else {
            ((Activity) this.mContext).getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            this.mActivityLifecycleCallbacks = null;
        }
    }

    private static String getTransparentParams(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9379d1de", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel != null && tBLiveDataModel.mInitParams != null) {
            return tBLiveDataModel.mInitParams.get(aw.PARAM_TRANSPARENT_PARAMS);
        }
        return null;
    }

    public void checkEnterUnderTakeNew(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb3bd76", new Object[]{this, enterGoodsData});
        } else if (enterGoodsData == null) {
            his.b(TAG, "checkEnterUnderTakeNew | enterLiveItemData is null.");
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
        } else {
            this.mGoodLiveContext.e = enterGoodsData.itemHoldType;
            this.mGoodLiveContext.f = enterGoodsData.holdItemIds;
            if (hir.R() && hjs.a(this.mFrameContext, (Activity) this.mContext, this.mLiveDataModel.mVideoInfo, enterGoodsData)) {
                return;
            }
            if (TextUtils.equals(hjs.UNDER_TAKE_ITEM_GROUP_LIST, enterGoodsData.itemHoldType) && enterGoodsData.itemGroupListInfo != null) {
                if (!hir.r()) {
                    his.b(TAG, "checkEnterUnderTakeNew| type=itemGroupList, orange is false.");
                    return;
                }
                his.b(TAG, "checkEnterUnderTakeNew| type=itemGroupList    id=" + enterGoodsData.itemGroupListInfo);
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("from", "wyswyg");
                hashMap.put("popId", enterGoodsData.popId);
                hashMap.put("data", enterGoodsData.itemGroupListInfo.toJSONString());
                show(true, hashMap, -1L, false);
            } else if (!u.ar() || !TextUtils.equals(hjs.UNDER_TAKE_GOODS_LIST, enterGoodsData.itemHoldType)) {
            } else {
                long a2 = hjs.a(enterGoodsData);
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put("bizTopItemId", Long.toString(a2));
                hashMap2.put("from", "wyswyg");
                hashMap2.put("popId", enterGoodsData.popId);
                show(false, hashMap2, a2, false);
            }
        }
    }

    private String getOrderUrl(List<VideoInfo.GoodTopEntrance> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f470dd1", new Object[]{this, list});
        }
        if (list != null && !list.isEmpty()) {
            for (VideoInfo.GoodTopEntrance goodTopEntrance : list) {
                if (goodTopEntrance.type == 3) {
                    return goodTopEntrance.entranceUrl;
                }
            }
        }
        return null;
    }

    private static void delegateToButton(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5de279", new Object[]{view});
        } else if (view == null) {
        } else {
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == -1796852737) {
                        super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view2, accessibilityNodeInfoCompat});
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                }
            });
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.goods.force_goods_timeout"};
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (hkk.ac() && "com.taobao.taolive.goods.force_goods_timeout".equals(str) && (fVar = this.mGoodsView) != null) {
            fVar.q();
        } else if ("com.taobao.taolive.inside.detail.open".equals(str)) {
            if (this.mFrameContext != null) {
                this.mFrameContext.f(true);
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f fVar2 = this.mGoodsView;
            if (fVar2 == null) {
                return;
            }
            fVar2.a(false);
        } else if (!"com.taobao.taolive.inside.detail.close".equals(str)) {
        } else {
            if (this.mFrameContext != null) {
                this.mFrameContext.f(false);
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f fVar3 = this.mGoodsView;
            if (fVar3 == null) {
                return;
            }
            fVar3.a(true);
        }
    }
}
