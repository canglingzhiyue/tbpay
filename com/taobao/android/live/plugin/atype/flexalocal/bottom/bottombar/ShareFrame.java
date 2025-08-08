package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.OrderList;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigResponse;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigResponseData;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.h;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.cpe;
import tb.ddv;
import tb.ddw;
import tb.hfm;
import tb.hki;
import tb.hkk;
import tb.hkl;
import tb.ibt;
import tb.kge;
import tb.phg;
import tb.plw;
import tb.sst;
import tb.tki;

/* loaded from: classes5.dex */
public class ShareFrame extends BaseFrame implements b.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_ACTION_MORE_SHARE_CLICK = "com.taobao.taolive.room.more.share.click";
    private static final String EVENT_ACTION_SHARE_CLICK = "com.taobao.taolive.room.share.click";
    private static final String EVENT_MEDIAPLATFORM_ADD_SHARE_CONFIG = "com.taolive.taolive.room.mediaplatform_addShareConfig";
    private static final String EVENT_MEDIAPLATFORM_REMOVE_SHARE_CONFIG = "com.taolive.taolive.room.mediaplatform_removeShareConfig";
    private static final String EVENT_MEDIAPLATFORM_SHOW_SHAREPANEL = "com.taolive.taolive.room.mediaplatform_show_sharepanel";
    private static final String KEY_BUSINESS_ID = "business_id";
    private boolean entranceHidden;
    private AliUrlImageView mAliUrlImageView;
    private FrameLayout mDefaultShareIcon;
    private String mInviteCode;
    private a mLiveShareBusiness;
    private View mRootView;
    private OrderList<com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a> mShareConfigList;
    private Map<String, Integer> mShareConfigOrderMap;

    static {
        kge.a(1140503693);
        kge.a(191318335);
        kge.a(-169985304);
    }

    public static /* synthetic */ Object ipc$super(ShareFrame shareFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME;
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public static /* synthetic */ void access$000(ShareFrame shareFrame, GetLiveShareConfigResponseData getLiveShareConfigResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27dcd2f", new Object[]{shareFrame, getLiveShareConfigResponseData});
        } else {
            shareFrame.onRequestSuccess(getLiveShareConfigResponseData);
        }
    }

    public static /* synthetic */ void access$100(ShareFrame shareFrame, Map map, boolean z, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f6895a", new Object[]{shareFrame, map, new Boolean(z), map2});
        } else {
            shareFrame.showShare(map, z, map2);
        }
    }

    public ShareFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.entranceHidden = false;
        this.entranceHidden = ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_SHARE_BUTTON, this.mFrameContext);
        if (this.entranceHidden) {
            return;
        }
        this.mLiveShareBusiness = new a(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ShareFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else {
                    ShareFrame.access$000(ShareFrame.this, ((GetLiveShareConfigResponse) netBaseOutDo).mo1437getData());
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    onError(i, netResponse, obj);
                }
            }
        });
    }

    private void onRequestSuccess(GetLiveShareConfigResponseData getLiveShareConfigResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323efa6c", new Object[]{this, getLiveShareConfigResponseData});
        } else if (getLiveShareConfigResponseData != null) {
            this.mInviteCode = getLiveShareConfigResponseData.shareInviteSlogan;
            if (getLiveShareConfigResponseData.shareIconBizCodes == null || getLiveShareConfigResponseData.shareIconBizCodes.isEmpty()) {
                return;
            }
            this.mShareConfigOrderMap = new HashMap();
            for (int i = 0; i < getLiveShareConfigResponseData.shareIconBizCodes.size(); i++) {
                this.mShareConfigOrderMap.put(getLiveShareConfigResponseData.shareIconBizCodes.get(i), Integer.valueOf(i));
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_share_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mRootView = view;
        this.mRootView.setVisibility(8);
        this.mAliUrlImageView = (AliUrlImageView) view.findViewById(R.id.taolive_bottombar_icon);
        this.mDefaultShareIcon = (FrameLayout) view.findViewById(R.id.taolive_bottombar_default);
        ((TUrlImageView) view.findViewById(R.id.taolive_bottombar_share_icon)).setImageResource(R.drawable.taolive_icon_share_flexalocal);
        view.setContentDescription("分享");
        hki.a(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ShareFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                ShareFrame.access$100(ShareFrame.this, null, false, null);
                if (!hkk.aa()) {
                    return;
                }
                ddw.a().a("com.taobao.taolive.room.share", ShareFrame.this.mFrameContext.G());
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mLiveDataModel = tBLiveDataModel;
        if (!hfm.a(tBLiveDataModel, this.mFrameContext) || !hfm.c()) {
            z = false;
        }
        this.mRootView.setVisibility((z || this.entranceHidden) ? 8 : 0);
        if (sst.b(this.mFrameContext)) {
            handleShareFrameVisiable(false);
        }
        updateShareIcon(null, false);
        this.mFrameContext.e().a(this);
        if (tki.a()) {
            requestInviteCodeNew(this.mFrameContext);
        } else {
            requestInviteCodeOld(tBLiveDataModel);
        }
    }

    private void requestInviteCodeOld(TBLiveDataModel tBLiveDataModel) {
        e y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0b39a2", new Object[]{this, tBLiveDataModel});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        GetLiveShareConfigRequest getLiveShareConfigRequest = new GetLiveShareConfigRequest();
        getLiveShareConfigRequest.liveId = videoInfo.liveId;
        getLiveShareConfigRequest.anchorId = videoInfo.broadCaster.accountId;
        if (!phg.d().a() && (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) && (y = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).y()) != null) {
            getLiveShareConfigRequest.liveSource = y.aJ_().a().N();
        }
        a aVar = this.mLiveShareBusiness;
        if (aVar == null) {
            return;
        }
        aVar.a(getLiveShareConfigRequest);
    }

    private void requestInviteCodeNew(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dabb8623", new Object[]{this, aVar});
        } else if (!(aVar instanceof h)) {
        } else {
            h hVar = (h) aVar;
            if (hVar.O() == null) {
                return;
            }
            hVar.O().a(this);
        }
    }

    @Override // com.taobao.taolive.sdk.mergeInfo.b.a
    public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
            return;
        }
        GetLiveShareConfigResponseData getLiveShareConfigResponseData = (GetLiveShareConfigResponseData) JSONObject.parseObject(unImportantLiveInfoResponseData.shareData, GetLiveShareConfigResponseData.class);
        if (getLiveShareConfigResponseData == null) {
            return;
        }
        onRequestSuccess(getLiveShareConfigResponseData);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.e().b(this);
    }

    private void handleShareFrameVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b66674", new Object[]{this, new Boolean(z)});
        } else if (phg.d().a() || !sst.a(this.mFrameContext) || this.mLiveDataModel == null) {
        } else {
            if (!(hfm.a(this.mLiveDataModel, this.mFrameContext) && hfm.c()) && !this.entranceHidden) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            View view = this.mRootView;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (EVENT_MEDIAPLATFORM_ADD_SHARE_CONFIG.equals(str)) {
            addShareConfig((Map) obj);
        } else if (EVENT_MEDIAPLATFORM_REMOVE_SHARE_CONFIG.equals(str)) {
            removeShareConfig((Map) obj);
        } else if ("com.taolive.taolive.room.mediaplatform_show_sharepanel".equals(str)) {
            showShare((Map) obj, false, null);
        } else if (EVENT_ACTION_SHARE_CLICK.equals(str)) {
            plw.a(this.mLiveDataModel, this.mFrameContext, "share");
        } else if (EVENT_ACTION_MORE_SHARE_CLICK.equals(str)) {
            showShare(null, false, null);
        } else if (!"com.taobao.taolive.mute_notify_showcase".equals(str) || !(obj instanceof Boolean)) {
        } else {
            handleShareFrameVisiable(((Boolean) obj).booleanValue());
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{EVENT_MEDIAPLATFORM_ADD_SHARE_CONFIG, EVENT_MEDIAPLATFORM_REMOVE_SHARE_CONFIG, "com.taolive.taolive.room.mediaplatform_show_sharepanel", EVENT_ACTION_SHARE_CLICK, EVENT_ACTION_MORE_SHARE_CLICK, "com.taobao.taolive.mute_notify_showcase"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    private void addShareConfig(Map<String, String> map) {
        Map<String, Integer> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b4077e", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get(KEY_BUSINESS_ID);
            if (StringUtils.isEmpty(str) || (map2 = this.mShareConfigOrderMap) == null || !map2.containsKey(str)) {
                return;
            }
            if (this.mShareConfigList == null) {
                this.mShareConfigList = new OrderList<>(new Comparator<com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ShareFrame.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public /* synthetic */ int compare(com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar, com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
                    }

                    public int a(com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar, com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("200c926b", new Object[]{this, aVar, aVar2})).intValue() : StringUtils.equals(aVar.b, aVar2.b) ? 0 : -1;
                    }
                }, new Comparator<com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ShareFrame.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public /* synthetic */ int compare(com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar, com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
                    }

                    public int a(com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar, com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("200c926b", new Object[]{this, aVar, aVar2})).intValue() : aVar.f13589a - aVar2.f13589a;
                    }
                });
            }
            com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar = new com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a();
            aVar.b = str;
            aVar.c = map.get("desc");
            aVar.d = map.get("icon_url");
            aVar.f13589a = this.mShareConfigOrderMap.get(str).intValue();
            this.mShareConfigList.offer(aVar);
            updateShareIcon();
        }
    }

    private void removeShareConfig(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffed821", new Object[]{this, map});
        } else if (this.mShareConfigList == null || map == null) {
        } else {
            String str = map.get(KEY_BUSINESS_ID);
            Iterator it = this.mShareConfigList.iterator();
            while (it.hasNext()) {
                com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar = (com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a) it.next();
                if (aVar.b.equals(str)) {
                    this.mShareConfigList.remove(aVar);
                    updateShareIcon();
                    return;
                }
            }
        }
    }

    private void updateShareIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0c8736", new Object[]{this});
            return;
        }
        OrderList<com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a> orderList = this.mShareConfigList;
        if (orderList != null && !orderList.isEmpty()) {
            updateShareIcon(this.mShareConfigList.get(0).d, false);
        } else {
            updateShareIcon(null, false);
        }
    }

    private void updateShareIcon(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca841354", new Object[]{this, str, new Boolean(z)});
        } else if (this.entranceHidden) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                this.mDefaultShareIcon.setVisibility(8);
                this.mAliUrlImageView.setVisibility(0);
                if (z) {
                    this.mAliUrlImageView.setSkipAutoSize(true);
                } else {
                    this.mAliUrlImageView.setSkipAutoSize(false);
                }
                this.mAliUrlImageView.setImageUrl(str);
                return;
            }
            this.mDefaultShareIcon.setVisibility(0);
            this.mAliUrlImageView.setVisibility(8);
        }
    }

    private void showShare(Map<String, String> map, boolean z, Map<String, String> map2) {
        e y;
        e y2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbd2c2d", new Object[]{this, map, new Boolean(z), map2});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
            OrderList<com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a> orderList = this.mShareConfigList;
            if (orderList != null && !orderList.isEmpty()) {
                com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.a aVar = this.mShareConfigList.get(0);
                map.put(KEY_BUSINESS_ID, aVar.b);
                map.put("desc", aVar.c);
            } else {
                map.put("invite_code", this.mInviteCode);
            }
        }
        if (z) {
            map.put("singleTarget", "wxfriend");
        }
        if (map2 != null) {
            map.put(aw.PARAM_TRACK_LIVEOPRT_ID, map2.get(aw.PARAM_TRACK_LIVEOPRT_ID));
        }
        map.put(KEY_BUSINESS_ID, "zhibo_corner");
        if (hkl.a().b() != null) {
            hkl.a().b().showShare((Activity) this.mContext, this.mLandscape, map);
        }
        HashMap hashMap = new HashMap();
        if (!phg.d().a() && (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) && (y2 = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).y()) != null) {
            hashMap.put("spm-url", y2.aJ_().a().b());
        }
        if (hkl.a().b() != null) {
            z2 = hkl.a().b().enableNewSpm4Shop();
        }
        if (z2) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else if (this.mFrameContext.m()) {
            String liveAndHomeMixSpm = hkl.a().b() != null ? hkl.a().b().getLiveAndHomeMixSpm() : null;
            if (StringUtils.isEmpty(liveAndHomeMixSpm)) {
                hashMap.put("spm-cnt", "a2141.8001249.1.1");
            } else {
                hashMap.put("spm-cnt", liveAndHomeMixSpm);
            }
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        if (!phg.d().a() && (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) && (y = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).y()) != null) {
            ibt a2 = y.aJ_().a();
            a2.b();
            hashMap.put("entrySpm", a2.r());
            hashMap.put("livesource", a2.N());
            hashMap.put("entryLiveSource", a2.p());
            hashMap.put("entrySpmPre", a2.m());
        }
        hashMap.put(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, "taobao");
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_TaobaoLive", "Button-Button-DownShare");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_PAGE, "Page_TaobaoLiveWatch");
        uTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        this.mFrameContext.e().a("com.taobao.taolive.room.start_share_from_btns", null, this.mFrameContext.G());
    }
}
