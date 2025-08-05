package com.taobao.android.live.plugin.atype.flexalocal.topbar.follow;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub.FansClubResponse;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.b;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.c;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.hgs;
import tb.hkf;
import tb.hkg;
import tb.hkh;
import tb.hki;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.kph;
import tb.kpi;
import tb.kpj;
import tb.phg;
import tb.ply;
import tb.teu;
import tb.xkw;

/* loaded from: classes6.dex */
public class FollowFrame extends BaseFrame implements View.OnClickListener, b, ddv, hkh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FollowFrame";
    private Handler handler;
    private TUrlImageView mFFCAnimView;
    private TUrlImageView mFFCLeftView;
    private TUrlImageView mFFCRightView;
    private TUrlImageView mFansClubAnimView;
    private TUrlImageView mFansClubView;
    private hkg mFavoriteGuideDialog;
    private d.a mMessageListener;
    private c mStateContext;
    private TUrlImageView mUnFavoriteAnimView;
    private TUrlImageView mUnFavoriteView;
    private View mUnFollowView;
    private TUrlImageView mWidgetIcon;
    private LinearLayout mWidgetLl;
    private TextView mWidgetTextView;
    private com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d stateManager;
    private Runnable widgetTextToIconRunnable;

    static {
        kge.a(-1186052445);
        kge.a(-408293058);
        kge.a(488330367);
        kge.a(-1201612728);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(FollowFrame followFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1512649357:
                super.onResume();
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FavorAnimView2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ View access$000(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("313b6fa9", new Object[]{followFrame}) : followFrame.mUnFollowView;
    }

    public static /* synthetic */ LinearLayout access$100(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("617099d", new Object[]{followFrame}) : followFrame.mWidgetLl;
    }

    public static /* synthetic */ void access$1000(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9cfa98", new Object[]{followFrame});
        } else {
            followFrame.widgetIconViewInAnim();
        }
    }

    public static /* synthetic */ void access$1100(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594e64b7", new Object[]{followFrame});
        } else {
            followFrame.hideUnFollow();
        }
    }

    public static /* synthetic */ void access$1200(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ffced6", new Object[]{followFrame});
        } else {
            followFrame.showWidgetText();
        }
    }

    public static /* synthetic */ void access$1300(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b138f5", new Object[]{followFrame});
        } else {
            followFrame.widgetTextViewInAnim();
        }
    }

    public static /* synthetic */ TUrlImageView access$1400(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("d8355068", new Object[]{followFrame}) : followFrame.mUnFavoriteAnimView;
    }

    public static /* synthetic */ TUrlImageView access$200(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("1f8cc477", new Object[]{followFrame}) : followFrame.mWidgetIcon;
    }

    public static /* synthetic */ TextView access$300(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("31704df8", new Object[]{followFrame}) : followFrame.mWidgetTextView;
    }

    public static /* synthetic */ void access$400(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb45ba3", new Object[]{followFrame});
        } else {
            followFrame.widgetIconToTextAnim();
        }
    }

    public static /* synthetic */ TUrlImageView access$500(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("400bdafa", new Object[]{followFrame}) : followFrame.mFansClubAnimView;
    }

    public static /* synthetic */ TUrlImageView access$600(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4ae0e27b", new Object[]{followFrame}) : followFrame.mFFCAnimView;
    }

    public static /* synthetic */ Runnable access$700(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("e88fcb94", new Object[]{followFrame}) : followFrame.widgetTextToIconRunnable;
    }

    public static /* synthetic */ Runnable access$702(FollowFrame followFrame, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7e80bed8", new Object[]{followFrame, runnable});
        }
        followFrame.widgetTextToIconRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ void access$800(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67a041f", new Object[]{followFrame});
        } else {
            followFrame.widgetTextToIconAnim();
        }
    }

    public static /* synthetic */ Handler access$900(FollowFrame followFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b5176bc8", new Object[]{followFrame}) : followFrame.handler;
    }

    public /* synthetic */ void lambda$new$18$FollowFrame(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb74010", new Object[]{this, new Integer(i), obj});
        } else if (i != 880000272) {
        } else {
            updateFansClubData();
        }
    }

    public FollowFrame(Context context, a aVar) {
        super(context, aVar);
        this.handler = new Handler(Looper.getMainLooper());
        this.stateManager = new com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d();
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.-$$Lambda$FollowFrame$kw2tTGpPpTljsrBNq4Hgiz49OCQ
            @Override // com.taobao.taolive.sdk.core.c
            public final void onMessageReceived(int i, Object obj) {
                FollowFrame.this.lambda$new$18$FollowFrame(i, obj);
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_topbar_frame_new_follow_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mUnFollowView = view.findViewById(R.id.taolive_follow_favor_unfollow);
        this.mUnFollowView.setOnClickListener(this);
        this.mUnFollowView.setImportantForAccessibility(1);
        TextView textView = (TextView) view.findViewById(R.id.taolive_unfollow_text);
        if (!TextUtils.isEmpty(textView.getText())) {
            this.mUnFollowView.setContentDescription(textView.getText());
        }
        hki.a(this.mUnFollowView);
        this.mUnFavoriteAnimView = (TUrlImageView) view.findViewById(R.id.taolive_unfavorite_anim);
        this.mUnFavoriteAnimView.setSkipAutoSize(true);
        this.mUnFavoriteAnimView.setOnClickListener(this);
        this.mUnFavoriteView = (TUrlImageView) view.findViewById(R.id.taolive_unfavorite);
        this.mUnFavoriteView.setOnClickListener(this);
        this.mFansClubView = (TUrlImageView) view.findViewById(R.id.taolive_fans_club_icon);
        this.mFansClubView.setOnClickListener(this);
        this.mFFCLeftView = (TUrlImageView) view.findViewById(R.id.taolive_favorite_with_fansclub_left_icon);
        this.mFFCLeftView.setOnClickListener(this);
        this.mFFCRightView = (TUrlImageView) view.findViewById(R.id.taolive_favorite_with_fansclub_right_icon);
        this.mFFCRightView.setOnClickListener(this);
        this.mFFCAnimView = (TUrlImageView) view.findViewById(R.id.taolive_favorite_with_fansclub_anim);
        this.mFFCAnimView.setSkipAutoSize(true);
        this.mFansClubAnimView = (TUrlImageView) view.findViewById(R.id.taolive_fans_club_icon_anim);
        this.mFansClubAnimView.setSkipAutoSize(true);
        this.mWidgetLl = (LinearLayout) view.findViewById(R.id.taolive_widget_ll);
        this.mWidgetLl.setOnClickListener(this);
        this.mWidgetTextView = (TextView) view.findViewById(R.id.taolive_widget_text_view);
        this.mWidgetIcon = (TUrlImageView) view.findViewById(R.id.taolive_widget_icon);
        this.mWidgetIcon.setSkipAutoSize(true);
        e.c("FollowFrame: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.e().a(this);
        this.mStateContext = new c(this.mContext, this, this.mFrameContext, this.mLiveDataModel, this.stateManager);
        this.mStateContext.a(this);
        if (this.mStateContext.b() != null) {
            this.mStateContext.b().d();
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(tBLiveDataModel)) {
            officialLiveHideFavoriteView();
        }
        onFollowShow();
        if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().a(tBLiveDataModel)) {
            trackShow();
        }
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 880000272;
            }
        });
    }

    private void onFollowShow() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea69f94", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || phg.a() == null) {
        } else {
            if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.mLiveDataModel)) {
                z = TextUtils.equals(this.mLiveDataModel.mVideoInfo.officialLiveInfo.follow, "true");
            } else {
                z = this.mLiveDataModel.mVideoInfo.broadCaster.follow;
            }
            if (z) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("follow_location", "avatar");
            phg.a().a(this.mFrameContext, "Show-AccountFollow", hashMap);
        }
    }

    private void trackShow() {
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb9736f", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || !com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().a(this.mLiveDataModel)) {
        } else {
            if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.mLiveDataModel)) {
                z = "false".equals(this.mLiveDataModel.mVideoInfo.officialLiveInfo.follow);
                str = com.taobao.android.live.plugin.atype.flexalocal.officialLive.a.EVENT_OFFICIAL_FOLLOW;
            } else {
                z = !this.mLiveDataModel.mVideoInfo.broadCaster.follow;
                str = "former_follow";
            }
            if (!z) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("feed_id", this.mLiveDataModel.mVideoInfo.liveId);
            hashMap.put("account_id", this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
            hashMap.put("officialLiveId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            hashMap.put("officialAccountId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.accountId);
            hashMap.put("officialLive", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLive);
            hashMap.put("type", "accountArea");
            if (phg.a() == null) {
                return;
            }
            phg.a().a(this.mFrameContext, str, hashMap);
        }
    }

    private void trackClick() {
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ab904", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || !com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().a(this.mLiveDataModel)) {
        } else {
            if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.mLiveDataModel)) {
                z = "false".equals(this.mLiveDataModel.mVideoInfo.officialLiveInfo.follow);
                str = com.taobao.android.live.plugin.atype.flexalocal.officialLive.a.EVENT_OFFICIAL_FOLLOW;
            } else {
                z = !this.mLiveDataModel.mVideoInfo.broadCaster.follow;
                str = "former_follow";
            }
            if (!z) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("feed_id", this.mLiveDataModel.mVideoInfo.liveId);
            hashMap.put("account_id", this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
            hashMap.put("officialLiveId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            hashMap.put("officialAccountId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.accountId);
            hashMap.put("officialLive", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLive);
            hashMap.put("type", "accountArea");
            if (phg.a() == null) {
                return;
            }
            phg.a().a(this.mFrameContext, str, (Map<String, String>) hashMap);
        }
    }

    private void officialLiveHideFavoriteView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438db8e1", new Object[]{this});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.mLiveDataModel)) {
        } else {
            this.mUnFavoriteAnimView.setVisibility(8);
            this.mUnFavoriteView.setVisibility(8);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c cVar = this.mStateContext;
        if (cVar == null || cVar.b() == null) {
            return;
        }
        this.mStateContext.b().b();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        if (!hkk.V()) {
            return;
        }
        this.handler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (FollowFrame.access$000(FollowFrame.this).getVisibility() != 8 || FollowFrame.access$100(FollowFrame.this).getVisibility() != 0 || FollowFrame.access$200(FollowFrame.this).getVisibility() != 0 || FollowFrame.access$300(FollowFrame.this).getVisibility() != 8 || !kpj.a(FollowFrame.this.mContext)) {
                } else {
                    FollowFrame.access$400(FollowFrame.this);
                }
            }
        }, hkk.X() * 1000);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        this.mFrameContext.e().b(this);
        if (hkk.an() && (dVar = this.stateManager) != null) {
            dVar.a();
        }
        c cVar = this.mStateContext;
        if (cVar != null && cVar.b() != null) {
            this.mStateContext.b().c();
            if (hkk.aj()) {
                this.mStateContext.d();
                this.mStateContext = null;
            }
        }
        hkg hkgVar = this.mFavoriteGuideDialog;
        if (hkgVar != null) {
            hkgVar.dismiss();
        }
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // tb.hkh
    public void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else if (hkk.a(this.mFrameContext)) {
            aj.a(this.mContext, str, true);
        } else {
            aj.a(this.mContext, str);
        }
    }

    @Override // tb.hkh
    public void showUnFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ea5ace", new Object[]{this});
            return;
        }
        this.mUnFollowView.setVisibility(0);
        this.mUnFollowView.setAlpha(1.0f);
        hideUnFavorite();
        hideUnFavoriteAnim();
        hideFansClub();
    }

    @Override // tb.hkh
    public void showUnFavorite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c58db9", new Object[]{this});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.mLiveDataModel)) {
        } else {
            this.mUnFavoriteView.setVisibility(0);
            this.mUnFavoriteView.setImageUrl(ply.S());
            hideUnFavoriteAnim();
            phg.a().a(this.mFrameContext, "Show-Favor", new HashMap<>());
        }
    }

    @Override // tb.hkh
    public void setFansClubData(FansClubResponse.FansClubResponseData fansClubResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf782ba", new Object[]{this, fansClubResponseData});
        } else if (fansClubResponseData == null) {
        } else {
            showFansClubAnim();
            this.mFansClubView.setVisibility(0);
            this.mFansClubView.setImageUrl(fansClubResponseData.clubLevelIcon);
        }
    }

    @Override // tb.hkh
    public void setUnFavoriteFansClubData(FansClubResponse.FansClubResponseData fansClubResponseData) {
        String v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c3c8ef", new Object[]{this, fansClubResponseData});
        } else if (fansClubResponseData == null) {
        } else {
            showFFCAnim();
            if (fansClubResponseData.status == 0) {
                v = hgs.u();
            } else {
                v = hgs.v();
            }
            this.mFFCLeftView.setImageUrl(v);
            this.mFFCRightView.setImageUrl(fansClubResponseData.clubLevelWithFavorIcon);
        }
    }

    private void showFansClubAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5169d9eb", new Object[]{this});
            return;
        }
        this.mFansClubAnimView.setImageUrl(hgs.s());
        this.mFansClubAnimView.setVisibility(0);
        this.mFansClubAnimView.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FollowFrame.access$500(FollowFrame.this).setVisibility(8);
                }
            }
        }, 2000L);
    }

    private void showFFCAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f16b9e", new Object[]{this});
            return;
        }
        this.mFFCAnimView.setImageUrl(hgs.t());
        this.mFFCAnimView.setVisibility(0);
        this.mFFCAnimView.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FollowFrame.access$600(FollowFrame.this).setVisibility(8);
                }
            }
        }, 2000L);
    }

    @Override // tb.hkh
    public void showFavoriteLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b25cd9f", new Object[]{this});
            return;
        }
        hkg hkgVar = this.mFavoriteGuideDialog;
        if (hkgVar != null) {
            hkgVar.dismiss();
        }
        this.mFavoriteGuideDialog = new hkg(this.mContext, this.mLiveDataModel, this.mFrameContext.b);
        this.mFavoriteGuideDialog.show();
        phg.a().a(this.mFrameContext, "Favor", new String[0]);
    }

    @Override // tb.hkh
    public void postUserGrowthEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f286f00f", new Object[]{this});
            return;
        }
        phg.e();
        getComponentView();
    }

    public void showWidgetIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d163f41", new Object[]{this});
            return;
        }
        this.mWidgetLl.setVisibility(0);
        this.mWidgetIcon.setImageUrl(hkk.U());
        this.mWidgetTextView.setVisibility(8);
        this.mWidgetIcon.setVisibility(0);
        this.mWidgetIcon.setAlpha(1.0f);
    }

    private void showWidgetText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3fcdf5", new Object[]{this});
            return;
        }
        this.mWidgetLl.setVisibility(0);
        this.mWidgetTextView.setVisibility(0);
        this.mWidgetIcon.setVisibility(8);
        this.mWidgetTextView.setAlpha(1.0f);
    }

    private void hideWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e6abad", new Object[]{this});
        } else {
            this.mWidgetLl.setVisibility(8);
        }
    }

    private void widgetIconViewInAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9511ed1f", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetIcon, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.setDuration(400L);
        animatorSet.start();
    }

    private void widgetTextViewInAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1efaad3", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetTextView, "scaleX", 0.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mWidgetTextView, "scaleY", 0.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.mWidgetTextView, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                FollowFrame.access$702(FollowFrame.this, new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            FollowFrame.access$800(FollowFrame.this);
                        }
                    }
                });
                FollowFrame.access$900(FollowFrame.this).postDelayed(FollowFrame.access$700(FollowFrame.this), Constants.STARTUP_TIME_LEVEL_1);
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.start();
    }

    private void widgetTextToIconAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee0fbbd", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetTextView, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                FollowFrame.access$300(FollowFrame.this).setVisibility(8);
                FollowFrame.access$100(FollowFrame.this).setVisibility(0);
                FollowFrame.access$200(FollowFrame.this).setVisibility(0);
                FollowFrame.access$200(FollowFrame.this).setImageUrl(hkk.U());
                FollowFrame.access$1000(FollowFrame.this);
            }
        });
        animatorSet.play(ofFloat);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    private void followOutAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf59f15", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mUnFollowView, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                FollowFrame.access$1100(FollowFrame.this);
                FollowFrame.access$1200(FollowFrame.this);
                FollowFrame.access$1300(FollowFrame.this);
            }
        });
        animatorSet.play(ofFloat);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    private void widgetIconToTextAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09e52bd", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mWidgetIcon, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                FollowFrame.access$200(FollowFrame.this).setVisibility(8);
                FollowFrame.access$1200(FollowFrame.this);
                FollowFrame.access$1300(FollowFrame.this);
            }
        });
        animatorSet.play(ofFloat);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    private void hideUnFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c31d93", new Object[]{this});
        } else {
            this.mUnFollowView.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r0.equals(com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.StateName.FAVORITE) != false) goto L12;
     */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStateChange(com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a r9, com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.onStateChange(com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a, com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state.a, boolean):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (view.getId() == R.id.taolive_favorite_with_fansclub_left_icon) {
            enableFansClubClickAction(false);
        }
        if (view.getId() == R.id.taolive_favorite_with_fansclub_right_icon) {
            enableFansClubClickAction(true);
        }
        c cVar = this.mStateContext;
        if (cVar == null || cVar.b() == null) {
            return;
        }
        this.mStateContext.b().e();
        if (!(this.mStateContext.b() instanceof hkf) || !com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().a(this.mLiveDataModel)) {
            return;
        }
        trackClick();
    }

    private void enableFansClubClickAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825d6968", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.mStateContext;
        if (cVar == null || !(cVar.b() instanceof kph)) {
            return;
        }
        ((kph) this.mStateContext.b()).c(z);
    }

    private void showUnFavoriteAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a05a6a", new Object[]{this});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(this.mLiveDataModel)) {
        } else {
            this.mUnFavoriteAnimView.setVisibility(0);
            this.mUnFavoriteAnimView.setAlpha(1.0f);
            this.mUnFavoriteAnimView.setImageUrl(ply.R());
        }
    }

    private void hideUnFavoriteAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228b356f", new Object[]{this});
        } else if (this.mUnFavoriteAnimView.getVisibility() == 8) {
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mUnFavoriteAnimView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(150L);
            ofFloat.start();
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        FollowFrame.access$1400(FollowFrame.this).setVisibility(8);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        FollowFrame.access$1400(FollowFrame.this).setVisibility(8);
                    }
                }
            });
        }
    }

    private void hideUnFavorite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2578b33e", new Object[]{this});
        } else if (this.mUnFavoriteView.getVisibility() == 8) {
        } else {
            this.mUnFavoriteView.setVisibility(8);
        }
    }

    private void setUnFavoriteWithFansClubViewVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb79a8b2", new Object[]{this, new Integer(i)});
            return;
        }
        this.mFFCLeftView.setVisibility(i);
        this.mFFCRightView.setVisibility(i);
    }

    private void setFansClubViewVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba147ed", new Object[]{this, new Integer(i)});
        } else {
            this.mFansClubView.setVisibility(i);
        }
    }

    private void updateFansClubData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e245d8d0", new Object[]{this});
            return;
        }
        c cVar = this.mStateContext;
        if (cVar == null) {
            return;
        }
        if (cVar.b() instanceof kpi) {
            this.mStateContext.b().d();
        }
        if (!(this.mStateContext.b() instanceof kph)) {
            return;
        }
        ((kph) this.mStateContext.b()).g();
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_CLOSE_FAVORITE_GUIDE_DIALOG.equals(str)) {
            hkg hkgVar = this.mFavoriteGuideDialog;
            if (hkgVar == null) {
                return;
            }
            hkgVar.dismiss();
        } else if (xkw.EVENT_JOIN_FANS_CLUB_NOTIFY_EVENT.equals(str)) {
            updateFansClubData();
        } else if (TextUtils.equals("com.taobao.taolive.room.install_widget_success", str)) {
            if (!kpj.b(this.mFrameContext, this.mLiveDataModel) || !(obj instanceof String)) {
                return;
            }
            boolean booleanValue = JSONObject.parseObject((String) obj).getBoolean("installWidgetSuccess").booleanValue();
            q.b(TAG, "installWidgetSuccess: " + booleanValue);
            this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetAddition = booleanValue;
            if (booleanValue) {
                if (this.mWidgetLl.getVisibility() != 0) {
                    return;
                }
                if (this.mWidgetIcon.getVisibility() != 0 && this.mWidgetTextView.getVisibility() != 0) {
                    return;
                }
                this.mWidgetLl.setVisibility(8);
                this.mWidgetIcon.setVisibility(8);
                this.mWidgetTextView.setVisibility(8);
                return;
            }
            this.mWidgetLl.setVisibility(0);
            this.mWidgetTextView.setVisibility(8);
            this.mWidgetIcon.setVisibility(0);
        } else if (!xkw.EVENT_H5_CONTAINER_DESTROY.equals(str)) {
        } else {
            onResume();
        }
    }

    private void hideFansClub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384db87f", new Object[]{this});
            return;
        }
        setUnFavoriteWithFansClubViewVisibility(8);
        setFansClubViewVisibility(8);
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_CLOSE_FAVORITE_GUIDE_DIALOG, xkw.EVENT_JOIN_FANS_CLUB_NOTIFY_EVENT, "com.taobao.taolive.room.install_widget_success", xkw.EVENT_H5_CONTAINER_DESTROY};
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

    private void trackWidgetShow(teu teuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c7b65f", new Object[]{this, teuVar});
        } else if (teuVar == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-avatar_anchorDesktop", null);
        }
    }
}
