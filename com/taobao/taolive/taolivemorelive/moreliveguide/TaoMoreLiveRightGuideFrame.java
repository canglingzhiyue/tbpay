package com.taobao.taolive.taolivemorelive.moreliveguide;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.sdk.DinamicSdkManager;
import com.taobao.taobao.R;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.taolivemorelive.moreliveguide.business.MoreGuideSlideTipsResponseData;
import com.taobao.taolive.taolivemorelive.view.a;
import com.taobao.taolive.taolivemorelive.view.b;
import com.taobao.taolivehome.homepage2.MainController;
import java.util.HashMap;
import tb.ane;
import tb.mfe;
import tb.mto;
import tb.poy;
import tb.pql;
import tb.pqm;
import tb.pqn;
import tb.pqo;
import tb.pqp;
import tb.pqq;
import tb.tki;

/* loaded from: classes8.dex */
public class TaoMoreLiveRightGuideFrame extends TaoliveRoomRightGuideFrame implements Handler.Callback, d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String DINAMIC_BIZ_TYPE;
    public int IMG_BIE_ID;
    public String IMG_BIE_TYPE;
    private boolean isClearScreen;
    private JSONObject mCardInfo;
    private long mDelayShowResourceTime;
    private DXRootView mDxRootView;
    private Handler mHandler;
    private volatile boolean mHasRunAlgorithm;
    private TBLiveDataModel mLiveDataModel;
    private long mMaxUbeeShowTime;
    private ViewGroup mRootView;
    private int mRunAlgorithmNum;
    private DinamicSdkManager mSdkManager;
    private String mTemplateName;
    private boolean resourceCardShow;
    private boolean ubeeRequest;

    public static /* synthetic */ Object ipc$super(TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private void procAlgorithm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a1cb8a", new Object[]{this, str});
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb254ca2", new Object[]{taoMoreLiveRightGuideFrame, str});
        } else {
            taoMoreLiveRightGuideFrame.procAlgorithm(str);
        }
    }

    public static /* synthetic */ void access$100(TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame, MoreGuideSlideTipsResponseData moreGuideSlideTipsResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b616752", new Object[]{taoMoreLiveRightGuideFrame, moreGuideSlideTipsResponseData});
        } else {
            taoMoreLiveRightGuideFrame.onRequestSuccess(moreGuideSlideTipsResponseData);
        }
    }

    public static /* synthetic */ boolean access$202(TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e58eb384", new Object[]{taoMoreLiveRightGuideFrame, new Boolean(z)})).booleanValue();
        }
        taoMoreLiveRightGuideFrame.resourceCardShow = z;
        return z;
    }

    public static /* synthetic */ String access$300(TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a07ff94b", new Object[]{taoMoreLiveRightGuideFrame}) : taoMoreLiveRightGuideFrame.mTemplateName;
    }

    public static /* synthetic */ JSONObject access$400(TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d6357d74", new Object[]{taoMoreLiveRightGuideFrame}) : taoMoreLiveRightGuideFrame.mCardInfo;
    }

    public TaoMoreLiveRightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.DINAMIC_BIZ_TYPE = com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.DINAMIC_BIZ_TYPE;
        this.IMG_BIE_ID = 31;
        this.IMG_BIE_TYPE = com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.IMG_BIE_TYPE;
        this.mMaxUbeeShowTime = 10000L;
        this.ubeeRequest = false;
        this.mHasRunAlgorithm = false;
        this.mRunAlgorithmNum = 0;
        this.mLiveDataModel = tBLiveDataModel;
        this.mHandler = new Handler(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_more_live_guide_layout_new);
            this.mContainer = viewStub.inflate();
            DinamicXEngine dinamicXEngine = null;
            MainController.a(null);
            this.mSdkManager = LiveHomeController.a().f();
            if (this.mSdkManager == null) {
                return;
            }
            if (LiveHomeController.a().f() != null) {
                dinamicXEngine = LiveHomeController.a().f().a();
            }
            if (dinamicXEngine == null) {
                return;
            }
            dinamicXEngine.a(com.taobao.taolive.taolivemorelive.view.a.DXTBLIVETIMECOUNTVIEW_TBLIVETIMECOUNTVIEW, new a.C0914a());
            dinamicXEngine.a(b.DX_EVENT_TBLHOTENTRYTAP, new b());
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.mContainer == null) {
        } else {
            this.mRootView = (FrameLayout) this.mContainer;
            this.mRootView.setVisibility(8);
            requetTip(this.mLiveDataModel, false, null);
            if (this.mHandler == null || !pqn.d()) {
                return;
            }
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.taolivemorelive.moreliveguide.TaoMoreLiveRightGuideFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoMoreLiveRightGuideFrame.access$000(TaoMoreLiveRightGuideFrame.this, "enter_live");
                    }
                }
            }, 3000L);
        }
    }

    @Override // com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame
    public void updateClearScreenStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
        } else {
            this.isClearScreen = z;
        }
    }

    @Override // com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame
    public void updateEntryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fcaf7a", new Object[]{this});
        } else if (pqn.d()) {
        } else {
            updateEntryData4Inner();
        }
    }

    public void updateEntryData4Inner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bcbabc", new Object[]{this});
        } else if (this.isClearScreen || pql.a().c()) {
        } else {
            HashMap hashMap = new HashMap();
            if (pql.a().e() != null && pql.a().e().c() != null) {
                hashMap.put("feedList", pql.a().e().c());
                hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, poy.a(this.mFrameContext));
                hashMap.put("entryLiveSource", poy.R(this.mFrameContext));
                hashMap.put("platform", "android");
                VideoInfo a2 = k.a(this.mLiveDataModel);
                if (a2 != null && a2.broadCaster != null) {
                    hashMap.put("curAccountId", a2.broadCaster.accountId);
                    hashMap.put("curLiveId", a2.liveId);
                }
            }
            requetTip(this.mLiveDataModel, true, JSON.toJSONString(hashMap));
            this.ubeeRequest = true;
        }
    }

    private void requetTip(TBLiveDataModel tBLiveDataModel, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb620dc9", new Object[]{this, tBLiveDataModel, new Boolean(z), str});
        } else if (tki.a()) {
            getUnImportantLiveInfo(this.mFrameContext);
        } else {
            requetTipOld(tBLiveDataModel, z, str);
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
            hVar.O().a(new b.a() { // from class: com.taobao.taolive.taolivemorelive.moreliveguide.TaoMoreLiveRightGuideFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
                    } else if (unImportantLiveInfoResponseData == null) {
                    } else {
                        MoreGuideSlideTipsResponseData moreGuideSlideTipsResponseData = (MoreGuideSlideTipsResponseData) JSONObject.parseObject(unImportantLiveInfoResponseData.slideData, MoreGuideSlideTipsResponseData.class);
                        if (moreGuideSlideTipsResponseData != null) {
                            TaoMoreLiveRightGuideFrame.access$100(TaoMoreLiveRightGuideFrame.this, moreGuideSlideTipsResponseData);
                        } else {
                            TaoMoreLiveRightGuideFrame.this.inflateView(null);
                        }
                    }
                }

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        TaoMoreLiveRightGuideFrame.this.inflateView(null);
                    }
                }

                @Override // com.taobao.taolive.sdk.mergeInfo.b.a
                public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        TaoMoreLiveRightGuideFrame.this.inflateView(null);
                    }
                }
            });
        }
    }

    private void requetTipOld(TBLiveDataModel tBLiveDataModel, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d470b66c", new Object[]{this, tBLiveDataModel, new Boolean(z), str});
            return;
        }
        VideoInfo videoInfo = getVideoInfo();
        try {
            com.taobao.taolive.taolivemorelive.moreliveguide.business.a aVar = new com.taobao.taolive.taolivemorelive.moreliveguide.business.a(this);
            if (videoInfo == null) {
                return;
            }
            aVar.a(this.mFrameContext, tBLiveDataModel, z, str);
        } catch (Exception unused) {
        }
    }

    public VideoInfo getVideoInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this}) : poy.u(this.mFrameContext);
    }

    public void inflateView(JSONObject jSONObject) {
        JSONObject jSONObject2;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2d9d7d", new Object[]{this, jSONObject});
        } else if (this.mRootView == null || jSONObject == null) {
        } else {
            if (this.ubeeRequest) {
                jSONObject2 = jSONObject.getJSONObject("ubeeEntry");
                if (jSONObject2 != null && jSONObject2.getLong("animateTime").longValue() > 0) {
                    this.mMaxUbeeShowTime = jSONObject2.getLong("animateTime").longValue();
                }
            } else {
                jSONObject2 = this.resourceCardShow ? jSONObject.getJSONObject("resourceEntry") : jSONObject.getJSONObject("normalEntry");
            }
            if (jSONObject2 == null || l.e(this.mTemplateName)) {
                return;
            }
            if (!createMoreLiveEntryDx(this.mTemplateName, jSONObject2, true) && (viewGroup = this.mRootView) != null) {
                viewGroup.setVisibility(8);
                return;
            }
            if (!this.ubeeRequest && this.mDelayShowResourceTime > 0 && this.mCardInfo.getJSONObject("resourceEntry") != null) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.taolivemorelive.moreliveguide.TaoMoreLiveRightGuideFrame.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TaoMoreLiveRightGuideFrame.access$202(TaoMoreLiveRightGuideFrame.this, true);
                        TaoMoreLiveRightGuideFrame taoMoreLiveRightGuideFrame = TaoMoreLiveRightGuideFrame.this;
                        taoMoreLiveRightGuideFrame.createMoreLiveEntryDx(TaoMoreLiveRightGuideFrame.access$300(taoMoreLiveRightGuideFrame), TaoMoreLiveRightGuideFrame.access$400(TaoMoreLiveRightGuideFrame.this).getJSONObject("resourceEntry"), true);
                    }
                }, this.mDelayShowResourceTime);
            }
            if (!this.ubeeRequest || this.mMaxUbeeShowTime <= 0) {
                return;
            }
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.taolivemorelive.moreliveguide.TaoMoreLiveRightGuideFrame.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoMoreLiveRightGuideFrame.this.refreshEntryView();
                    }
                }
            }, this.mMaxUbeeShowTime);
        }
    }

    public boolean createMoreLiveEntryDx(String str, JSONObject jSONObject, boolean z) {
        DinamicSdkManager dinamicSdkManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1645422", new Object[]{this, str, jSONObject, new Boolean(z)})).booleanValue();
        }
        if (this.mRootView == null || this.mSdkManager == null || jSONObject == null || l.e(str)) {
            return false;
        }
        this.mRootView.removeAllViews();
        if (this.mDxRootView == null) {
            ane a2 = this.mFrameContext.z().K().a(str.hashCode());
            if (a2 != null) {
                this.mDxRootView = a2.a();
            } else {
                this.mDxRootView = this.mSdkManager.a(this.mContext, str, (mfe) null);
            }
        }
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView != null && (dinamicSdkManager = this.mSdkManager) != null) {
            if (!dinamicSdkManager.a(dXRootView, jSONObject)) {
                return false;
            }
            this.mRootView.addView(this.mDxRootView);
            this.mRootView.setVisibility(0);
        }
        pql.a().c(jSONObject.getString("showStatus"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("maidianTrans");
        if (jSONObject2 != null) {
            pql.a().a(JSON.toJSONString(jSONObject2));
        }
        if (z) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(pqm.f32822a);
            if (jSONObject3 != null) {
                pqq.c(this.mFrameContext, jSONObject3.getString("name"), new HashMap(pqp.a(jSONObject3.getString("params"))));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("showStatu", jSONObject.getString("showStatus"));
                pqq.d(this.mFrameContext, "show-moreliveEntrance", hashMap);
            }
        }
        if (this.resourceCardShow && this.mCardInfo.getJSONObject("resourceEntry") != null) {
            long j = 15000;
            if (pqn.g() > 0) {
                j = pqn.g() * getLength(this.mCardInfo.getJSONObject("resourceEntry").getString("title")) * 3;
            }
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.taolivemorelive.moreliveguide.TaoMoreLiveRightGuideFrame.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TaoMoreLiveRightGuideFrame.this.refreshEntryView();
                    TaoMoreLiveRightGuideFrame.access$202(TaoMoreLiveRightGuideFrame.this, false);
                    JSONObject jSONObject4 = TaoMoreLiveRightGuideFrame.access$400(TaoMoreLiveRightGuideFrame.this).getJSONObject("resourceEntry");
                    if (jSONObject4 == null || l.e(jSONObject4.getString("operatorId"))) {
                        return;
                    }
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("saveTime", (Object) valueOf);
                    jSONObject5.put("operatorId", (Object) jSONObject4.getString("operatorId"));
                    pqo.a("hasShowEndResources", JSON.toJSONString(jSONObject5));
                }
            }, j);
        }
        return true;
    }

    public static long getLength(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a78c8b61", new Object[]{str})).longValue();
        }
        double d = mto.a.GEO_NOT_SUPPORT;
        while (i < str.length()) {
            int i2 = i + 1;
            d += str.substring(i, i2).matches("[一-龥]") ? 1.0d : 0.5d;
            i = i2;
        }
        return Double.valueOf(Math.ceil(d)).longValue();
    }

    public void refreshEntryView() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda91823", new Object[]{this});
            return;
        }
        pql.a().b((String) null);
        JSONObject jSONObject = this.mCardInfo;
        if (jSONObject == null || createMoreLiveEntryDx(this.mTemplateName, jSONObject.getJSONObject("normalEntry"), false) || (viewGroup = this.mRootView) == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame
    public void showMoreLiveFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b74d16", new Object[]{this});
        } else {
            refreshEntryView();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.setVisibility(8);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.setVisibility(0);
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

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo == null || !(netBaseOutDo.mo1437getData() instanceof MoreGuideSlideTipsResponseData)) {
        } else {
            onRequestSuccess((MoreGuideSlideTipsResponseData) netBaseOutDo.mo1437getData());
        }
    }

    private void onRequestSuccess(MoreGuideSlideTipsResponseData moreGuideSlideTipsResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6470b95", new Object[]{this, moreGuideSlideTipsResponseData});
        } else if (!moreGuideSlideTipsResponseData.showEntry || l.e(moreGuideSlideTipsResponseData.templateName) || moreGuideSlideTipsResponseData.cardInfo == null) {
        } else {
            this.mCardInfo = moreGuideSlideTipsResponseData.cardInfo;
            this.mTemplateName = moreGuideSlideTipsResponseData.templateName;
            this.mDelayShowResourceTime = moreGuideSlideTipsResponseData.delayShowResourceTime;
            pql.a().e(moreGuideSlideTipsResponseData.trackInfoTrans);
            inflateView(moreGuideSlideTipsResponseData.cardInfo);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            inflateView(null);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            inflateView(null);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        DinamicSdkManager dinamicSdkManager = this.mSdkManager;
        if (dinamicSdkManager != null) {
            dinamicSdkManager.b();
        }
        this.mCardInfo = null;
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView != null) {
            this.mFrameContext.z().K().a(new ane(dXRootView));
            this.mDxRootView = null;
        }
        pql.a().e(null);
        pql.a().a((String) null);
        this.ubeeRequest = false;
        this.mRootView = null;
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        init();
    }
}
