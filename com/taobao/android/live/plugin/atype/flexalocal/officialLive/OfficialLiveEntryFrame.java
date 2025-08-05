package com.taobao.android.live.plugin.atype.flexalocal.officialLive;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.hkk;
import tb.kge;
import tb.phg;
import tb.phj;
import tb.phq;
import tb.plw;
import tb.plz;
import tb.pmd;
import tb.pmt;
import tb.pmv;
import tb.pmz;
import tb.poy;
import tb.ppp;
import tb.xkw;

/* loaded from: classes6.dex */
public class OfficialLiveEntryFrame extends BaseFrame implements d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_NAME = "taolive_officiallive_entry";
    private static String TAG = null;
    private static final int TRACK_TYPE_CLICK = 0;
    private static final int TRACK_TYPE_SHOW = 1;
    public DXRootView mDxRootView;
    private ppp.a mIAppBackgroundListener;
    public VideoInfo mVideoInfo;

    public static /* synthetic */ Object ipc$super(OfficialLiveEntryFrame officialLiveEntryFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "LiveAvatarNewFrame";
    }

    public static /* synthetic */ void access$000(OfficialLiveEntryFrame officialLiveEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68d38ec", new Object[]{officialLiveEntryFrame});
        } else {
            officialLiveEntryFrame.queryDetail();
        }
    }

    static {
        kge.a(-1893680002);
        kge.a(191318335);
        kge.a(-797454141);
        TAG = "OfficialLiveEntryFrame";
    }

    public OfficialLiveEntryFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mIAppBackgroundListener = new ppp.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ppp.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // tb.ppp.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (!hkk.ao()) {
                } else {
                    OfficialLiveEntryFrame.access$000(OfficialLiveEntryFrame.this);
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        ddw.a().a(this);
        pmd.a().u().a(this.mIAppBackgroundListener);
        createDx();
    }

    private void queryDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a740", new Object[]{this});
        } else if (this.mVideoInfo == null || !b.a().b(this.mVideoInfo) || this.mVideoInfo.officialLiveInfo == null || TextUtils.isEmpty(this.mVideoInfo.liveId)) {
        } else {
            c cVar = new c(this);
            String str = this.mVideoInfo.officialLiveInfo.officialLiveId;
            String str2 = null;
            String ac = this.mFrameContext == null ? null : poy.ac(this.mFrameContext);
            if (this.mFrameContext != null) {
                str2 = poy.R(this.mFrameContext);
            }
            cVar.a(str, ac, str2);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (!b.a().a(tBLiveDataModel)) {
            return;
        }
        this.mVideoInfo = tBLiveDataModel.mVideoInfo;
        renderDx();
    }

    public void createDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a0737", new Object[]{this});
            return;
        }
        phj g = phg.g();
        if (g == null) {
            return;
        }
        g.a(this.mContext, DX_TEMPLATE_NAME, new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.officialLive.-$$Lambda$OfficialLiveEntryFrame$Le2km7dfQXg4S2cyOUJ_PhezYgQ
            @Override // tb.phj.a
            public final void onCreateView(DXRootView dXRootView) {
                OfficialLiveEntryFrame.this.lambda$createDx$14$OfficialLiveEntryFrame(dXRootView);
            }
        });
    }

    public /* synthetic */ void lambda$createDx$14$OfficialLiveEntryFrame(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca10f42", new Object[]{this, dXRootView});
        } else {
            this.mDxRootView = dXRootView;
        }
    }

    public void renderDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b74c51", new Object[]{this});
        } else if (!(this.mContainer instanceof ViewGroup)) {
        } else {
            this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.officialLive.-$$Lambda$OfficialLiveEntryFrame$_Aye9XuPzvsy9D3KkBJbz1Z-Meo
                {
                    OfficialLiveEntryFrame.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OfficialLiveEntryFrame.this.lambda$renderDx$16$OfficialLiveEntryFrame();
                }
            });
        }
    }

    public /* synthetic */ void lambda$renderDx$16$OfficialLiveEntryFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fb0a69", new Object[]{this});
            return;
        }
        final phj g = phg.g();
        if (g == null || ((ViewGroup) this.mContainer).indexOfChild(this.mDxRootView) != -1) {
            return;
        }
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView == null) {
            ddw.a().a(this);
            g.a(this.mContext, DX_TEMPLATE_NAME, new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.officialLive.-$$Lambda$OfficialLiveEntryFrame$lOdY5A1QjNb3gxGnsKtFOhBPvVY
                @Override // tb.phj.a
                public final void onCreateView(DXRootView dXRootView2) {
                    OfficialLiveEntryFrame.this.lambda$null$15$OfficialLiveEntryFrame(g, dXRootView2);
                }
            });
            return;
        }
        g.a(dXRootView, (JSONObject) JSON.toJSON(this.mVideoInfo));
        ((ViewGroup) this.mContainer).addView(this.mDxRootView);
        trackShow();
    }

    public /* synthetic */ void lambda$null$15$OfficialLiveEntryFrame(phj phjVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78913e4a", new Object[]{this, phjVar, dXRootView});
            return;
        }
        this.mDxRootView = dXRootView;
        DXRootView dXRootView2 = this.mDxRootView;
        if (dXRootView2 == null) {
            return;
        }
        phjVar.a(dXRootView2, (JSONObject) JSON.toJSON(this.mVideoInfo));
        ((ViewGroup) this.mContainer).addView(this.mDxRootView);
        trackShow();
    }

    public void trackShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb9736f", new Object[]{this});
        } else if (!b.a().a(this.mVideoInfo)) {
        } else {
            if (phg.a() != null) {
                phg.a().a(this.mFrameContext, "show_list", buildOfficialMap());
            }
            trackShowFollow();
            trackShowHead();
        }
    }

    private void trackShowHead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa09016f", new Object[]{this});
        } else {
            trackChild(1, b.a().b(this.mVideoInfo) ? "former_icon" : "official_icon");
        }
    }

    private void trackClickHead() {
        boolean equals;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce37484", new Object[]{this});
            return;
        }
        if (b.a().b(this.mVideoInfo)) {
            equals = !this.mVideoInfo.broadCaster.follow;
            str = "former_icon";
        } else {
            equals = "false".equals(this.mVideoInfo.officialLiveInfo.follow);
            str = "official_icon";
        }
        if (!equals) {
            return;
        }
        trackChild(0, str);
    }

    private void trackShowFollow() {
        boolean equals;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0c7cc0", new Object[]{this});
            return;
        }
        if (b.a().b(this.mVideoInfo)) {
            equals = !this.mVideoInfo.broadCaster.follow;
            str = "former_follow";
        } else {
            equals = "false".equals(this.mVideoInfo.officialLiveInfo.follow);
            str = a.EVENT_OFFICIAL_FOLLOW;
        }
        if (!equals) {
            return;
        }
        trackChild(1, str);
    }

    private void trackClickFollow() {
        boolean equals;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55167e95", new Object[]{this});
            return;
        }
        if (b.a().b(this.mVideoInfo)) {
            equals = !this.mVideoInfo.broadCaster.follow;
            str = "former_follow";
        } else {
            equals = "false".equals(this.mVideoInfo.officialLiveInfo.follow);
            str = a.EVENT_OFFICIAL_FOLLOW;
        }
        if (!equals) {
            return;
        }
        trackChild(0, str);
    }

    private void trackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ab904", new Object[]{this});
        } else if (phg.a() == null) {
        } else {
            phg.a().a(this.mFrameContext, "show_list", (Map<String, String>) buildOfficialMap());
        }
    }

    private HashMap<String, String> buildOfficialMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7904510d", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        VideoInfo videoInfo = this.mVideoInfo;
        if (videoInfo != null && videoInfo.broadCaster != null && b.a().a(this.mVideoInfo)) {
            hashMap.put("feed_id", this.mVideoInfo.liveId);
            hashMap.put("account_id", this.mVideoInfo.broadCaster.accountId);
            hashMap.put("officialLiveId", this.mVideoInfo.officialLiveInfo.officialLiveId);
            hashMap.put("officialAccountId", this.mVideoInfo.officialLiveInfo.accountId);
            hashMap.put("officialLive", this.mVideoInfo.officialLiveInfo.officialLive);
        }
        return hashMap;
    }

    private void trackChild(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b98c75", new Object[]{this, new Integer(i), str});
            return;
        }
        HashMap<String, String> buildOfficialMap = buildOfficialMap();
        buildOfficialMap.put("type", "officialEntry");
        if (phg.a() == null) {
            return;
        }
        if (i == 0) {
            phg.a().a(this.mFrameContext, str, (Map<String, String>) buildOfficialMap);
        } else {
            phg.a().a(this.mFrameContext, str, buildOfficialMap);
        }
    }

    public void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView == null) {
            return;
        }
        dXRootView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.officialLive.-$$Lambda$OfficialLiveEntryFrame$M4450876iurOO0VxbforBOUzmDg
            {
                OfficialLiveEntryFrame.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OfficialLiveEntryFrame.this.lambda$updateView$17$OfficialLiveEntryFrame();
            }
        });
    }

    public /* synthetic */ void lambda$updateView$17$OfficialLiveEntryFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39d7266", new Object[]{this});
            return;
        }
        phj g = phg.g();
        if (g == null) {
            return;
        }
        g.a(this.mDxRootView, (JSONObject) JSON.toJSON(this.mVideoInfo));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_official_live_entry_dx_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        release();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        release();
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        pmd.a().u().b(this.mIAppBackgroundListener);
        if (!(this.mContainer instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.mContainer).removeAllViews();
        this.mDxRootView = null;
        this.mVideoInfo = null;
    }

    private void handleOfficialEntry() {
        e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2198806", new Object[]{this});
        } else if (!b.a().a(this.mVideoInfo) || !(this.mFrameContext instanceof phq) || (p = ((phq) this.mFrameContext).p()) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("name", "@ali/alivemodx-offical-channel-playlist");
            p.a("invoke-message-component", hashMap);
            trackClick();
        }
    }

    private void handleOfficialAnchor() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abafe24f", new Object[]{this});
        } else if (!b.a().a(this.mVideoInfo)) {
        } else {
            if (b.a().b(this.mVideoInfo)) {
                str = this.mVideoInfo.liveId;
                str2 = "";
                if (this.mVideoInfo.broadCaster != null) {
                    str2 = this.mVideoInfo.broadCaster.accountId;
                    str3 = this.mVideoInfo.broadCaster.encodeAccountId;
                } else {
                    str3 = str2;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = str2;
                }
            } else {
                str = this.mVideoInfo.officialLiveInfo.officialLiveId;
                str2 = this.mVideoInfo.officialLiveInfo.accountId;
                str3 = this.mVideoInfo.officialLiveInfo.encryptAnchorId;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accountId", (Object) str2);
            jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) str3);
            jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) str);
            jSONObject.put("sourceType", (Object) "official-live");
            ddw.a().a("com.taobao.taolive.room.avatar_card_show", jSONObject, observeUniqueIdentification());
            trackClickHead();
        }
    }

    private void handleOfficialFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802d7d4b", new Object[]{this});
        } else if (!b.a().a(this.mVideoInfo)) {
        } else {
            pmt pmtVar = new pmt();
            if (b.a().b(this.mVideoInfo) && this.mVideoInfo.broadCaster != null) {
                pmtVar.c = this.mVideoInfo.liveId;
                pmtVar.f32764a = this.mVideoInfo.broadCaster.accountId;
            } else {
                pmtVar.c = this.mVideoInfo.officialLiveInfo.officialLiveId;
                pmtVar.f32764a = this.mVideoInfo.officialLiveInfo.accountId;
            }
            pmtVar.p = pmt.FOLLOW_ANCHOR_AVATAR;
            pmd.a().B().a(phg.a().a(pmtVar), new pmv() { // from class: com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pmv
                public void a(pmz pmzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                        return;
                    }
                    aj.a(OfficialLiveEntryFrame.this.mContext, plz.a(OfficialLiveEntryFrame.this.mContext, pmzVar));
                    if (b.a().b(OfficialLiveEntryFrame.this.mVideoInfo) && OfficialLiveEntryFrame.this.mVideoInfo.broadCaster != null) {
                        OfficialLiveEntryFrame.this.mVideoInfo.broadCaster.follow = true;
                        plw.a(OfficialLiveEntryFrame.this.mLiveDataModel, OfficialLiveEntryFrame.this.mFrameContext, "follow");
                    } else if (OfficialLiveEntryFrame.this.mVideoInfo != null && OfficialLiveEntryFrame.this.mVideoInfo.officialLiveInfo != null) {
                        OfficialLiveEntryFrame.this.mVideoInfo.officialLiveInfo.follow = "true";
                    }
                    OfficialLiveEntryFrame.this.updateView();
                }

                @Override // tb.pmv
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    String string = OfficialLiveEntryFrame.this.mContext.getResources().getString(R.string.taolive_comments_user_follow_fail_flexalocal);
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2;
                    }
                    aj.a(OfficialLiveEntryFrame.this.mContext, string);
                }
            });
            trackClickFollow();
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!b.a().a(this.mVideoInfo) || this.mVideoInfo.broadCaster == null) {
        } else {
            if ((xkw.EVENT_ACTION_FOLLOW.equals(str) || xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME.equals(str)) && (obj instanceof String)) {
                if (obj.equals(this.mVideoInfo.broadCaster.accountId)) {
                    this.mVideoInfo.broadCaster.follow = true;
                    updateView();
                    plw.a(this.mLiveDataModel, this.mFrameContext, "follow");
                } else if (!obj.equals(this.mVideoInfo.officialLiveInfo.accountId)) {
                } else {
                    this.mVideoInfo.officialLiveInfo.follow = "true";
                    updateView();
                }
            } else if (xkw.EVENT_ACTION_UNFOLLOW.equals(str) && (obj instanceof String)) {
                if (obj.equals(this.mVideoInfo.broadCaster.accountId)) {
                    this.mVideoInfo.broadCaster.follow = false;
                    updateView();
                } else if (!obj.equals(this.mVideoInfo.officialLiveInfo.accountId)) {
                } else {
                    this.mVideoInfo.officialLiveInfo.follow = "false";
                    updateView();
                }
            } else if (a.EVENT_OFFICIAL_FOLLOW.equals(str)) {
                handleOfficialFollow();
            } else if (a.EVENT_OFFICIAL_ANCHOR_CLICK.equals(str)) {
                handleOfficialAnchor();
            } else if (!a.EVENT_OFFICIAL_ENTRY_CLICK.equals(str)) {
            } else {
                handleOfficialEntry();
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, xkw.EVENT_ACTION_FOLLOW, xkw.EVENT_ACTION_UNFOLLOW, a.EVENT_OFFICIAL_FOLLOW, a.EVENT_OFFICIAL_ANCHOR_CLICK, a.EVENT_OFFICIAL_ENTRY_CLICK};
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

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONObject jSONObject;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo == null || netResponse == null || (jSONObject = (JSONObject) netBaseOutDo.mo1437getData()) == null) {
        } else {
            String string = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            JSONObject jSONObject2 = jSONObject.getJSONObject("officialLiveInfo");
            if (jSONObject2 == null) {
                return;
            }
            String string2 = jSONObject2.getString("officialLiveId");
            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string) || (videoInfo = this.mVideoInfo) == null || videoInfo.officialLiveInfo == null || string.equals(this.mVideoInfo.liveId)) {
                return;
            }
            OfficialLiveSwitchNextMessage officialLiveSwitchNextMessage = new OfficialLiveSwitchNextMessage();
            officialLiveSwitchNextMessage.officialLiveId = string2;
            officialLiveSwitchNextMessage.targetLiveId = string;
            officialLiveSwitchNextMessage.targetLiveDetailUrl = String.format(hkk.ap(), string2);
            ddw.a().a("com.taobao.taolive.room.switch.official.live", officialLiveSwitchNextMessage, observeUniqueIdentification());
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            q.b(TAG, "official switch quest error");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            q.b(TAG, "official switch quest error");
        }
    }
}
