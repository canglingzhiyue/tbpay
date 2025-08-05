package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.RewardFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.hfm;
import tb.hix;
import tb.kge;
import tb.phg;
import tb.phq;
import tb.plx;
import tb.pmd;
import tb.pnk;
import tb.sef;
import tb.xkw;

/* loaded from: classes5.dex */
public class RewardFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RewardFrame";
    public static HashSet<String> sRewardEnterHistory;
    private View mRootView;

    public static /* synthetic */ Object ipc$super(RewardFrame rewardFrame, String str, Object... objArr) {
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-bottom-reward";
    }

    public static /* synthetic */ boolean access$000(RewardFrame rewardFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d7e59ab", new Object[]{rewardFrame})).booleanValue() : rewardFrame.isNonage();
    }

    public static /* synthetic */ void access$100(RewardFrame rewardFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664b76f2", new Object[]{rewardFrame, str});
        } else {
            rewardFrame.showRewardPanel(str);
        }
    }

    static {
        kge.a(-2113515617);
        sRewardEnterHistory = new HashSet<>();
    }

    public RewardFrame(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_reward_layout_flexalocal;
    }

    private boolean isNonage() {
        IBTypeRoomProxy.d nonageServiceX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("260b6767", new Object[]{this})).booleanValue();
        }
        if (!phg.d().a() && f.p() != null && f.p().getNonageServiceX() != null && (nonageServiceX = f.p().getNonageServiceX()) != null && (this.mContext instanceof Activity)) {
            return nonageServiceX.a((Activity) this.mContext, "打赏");
        }
        return false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (hfm.a(tBLiveDataModel, this.mFrameContext)) {
            this.mRootView.setVisibility(0);
            this.mRootView.setOnClickListener(new AnonymousClass1());
            VideoInfo.AdmireInfo admireInfo = tBLiveDataModel.mVideoInfo.admireInfo;
            if (admireInfo.giftIsNeedBackGround) {
                this.mRootView.setBackgroundResource(R.drawable.taolive_bottombar_bg_flexalocal);
            } else {
                this.mRootView.setBackgroundColor(0);
            }
            TUrlImageView tUrlImageView = (TUrlImageView) this.mRootView.findViewById(R.id.iv_taolive_reward);
            String str = admireInfo.giftIcon;
            if (TextUtils.isEmpty(str)) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN014NmoZJ1rDw2gRLkL5_!!6000000005598-2-tps-108-108.png");
            } else {
                tUrlImageView.setImageUrl(str);
            }
            if (TextUtils.equals(phg.a().c(), phg.a().b()) && "1".equals(getFrameContext().g().get(aw.PARAM_OPEN_REWARD_PANEL))) {
                showRewardPanel(null);
            }
            String str2 = getFrameContext().g().get(aw.PARAM_INTENT_URL);
            if (str2 != null) {
                Uri parse = Uri.parse(str2);
                if ("1".equals(parse.getQueryParameter(aw.PARAM_OPEN_REWARD_IS_FROM_NOTICE))) {
                    String queryParameter = parse.getQueryParameter(aw.PARAM_OPEN_REWARD_GIFT_ID);
                    String queryParameter2 = parse.getQueryParameter(aw.PARAM_OPEN_REWARD_SOURCE_LIVE_ID);
                    String queryParameter3 = parse.getQueryParameter(aw.PARAM_OPEN_REWARD_SENDER_USER_NICK);
                    String str3 = this.mContext.toString() + queryParameter2 + queryParameter3;
                    if (sRewardEnterHistory.contains(str3)) {
                        return;
                    }
                    sRewardEnterHistory.add(str3);
                    com.taobao.android.live.plugin.atype.flexalocal.bottom.control.reward.net.a aVar = new com.taobao.android.live.plugin.atype.flexalocal.bottom.control.reward.net.a(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.RewardFrame.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                            }
                        }

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                            }
                        }

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onSystemError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                            }
                        }

                        {
                            RewardFrame.this = this;
                        }
                    });
                    if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                        aVar.a(this.mLiveDataModel.mVideoInfo.liveId, this.mLiveDataModel.mVideoInfo.broadCaster.encodeAccountId, queryParameter2, queryParameter, queryParameter3);
                    }
                }
            }
            if (((phq) this.mFrameContext).C() == null) {
                return;
            }
            ((phq) this.mFrameContext).C().a(new sef.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.-$$Lambda$RewardFrame$QYe6s_-KWfAeQKYNthRmi-XVb8c
                @Override // tb.sef.a
                public final View getView() {
                    return RewardFrame.this.lambda$onDataReceived$31$RewardFrame();
                }
            });
            return;
        }
        this.mRootView.setVisibility(8);
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.RewardFrame$1 */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$v7qenlnmlbopqHhTAuBFeKPl8uo(AnonymousClass1 anonymousClass1) {
            anonymousClass1.a();
        }

        public AnonymousClass1() {
            RewardFrame.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (c.a().d()) {
                if (RewardFrame.access$000(RewardFrame.this)) {
                    return;
                }
                RewardFrame.access$100(RewardFrame.this, null);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.-$$Lambda$RewardFrame$1$v7qenlnmlbopqHhTAuBFeKPl8uo
                    {
                        RewardFrame.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        RewardFrame.AnonymousClass1.lambda$v7qenlnmlbopqHhTAuBFeKPl8uo(RewardFrame.AnonymousClass1.this);
                    }
                }, 2000L);
            }
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (c.a().d()) {
                RewardFrame.access$100(RewardFrame.this, null);
            } else {
                Context context = RewardFrame.this.getComponentView().getContext();
                if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                    return;
                }
                hix.a(context, context.getString(R.string.taolive_reward_remote_installing));
            }
        }
    }

    public /* synthetic */ View lambda$onDataReceived$31$RewardFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("aba4ed44", new Object[]{this}) : this.mContainer;
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
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
        } else {
            super.onCleanUp();
        }
    }

    private void showRewardPanel(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a67569", new Object[]{this, str});
            return;
        }
        pnk q = pmd.a().q();
        if (q != null) {
            if (!q.c()) {
                q.a((Activity) this.mContext, new pnk.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.RewardFrame.3
                    {
                        RewardFrame.this = this;
                    }
                });
            } else {
                this.mFrameContext.e().a(xkw.EVENT_SHOW_REWARD_PANEL, str, this.mFrameContext == null ? null : this.mFrameContext.G());
            }
        } else {
            plx.b("RewardFrame", "loginAdapter null");
        }
        phg.a().a(this.mFrameContext, "Gift", (Map<String, String>) new HashMap());
    }
}
