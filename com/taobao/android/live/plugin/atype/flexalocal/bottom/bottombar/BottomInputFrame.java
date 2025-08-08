package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.utils.j;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.w;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.hfo;
import tb.hfp;
import tb.hfq;
import tb.hfr;
import tb.hki;
import tb.kge;
import tb.phg;
import tb.ply;
import tb.pqj;
import tb.xkw;

/* loaded from: classes5.dex */
public class BottomInputFrame extends BaseFrame implements View.OnClickListener, ddv, hfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CLOSE_COMMENTS = 1;
    private static final String EVENT_BACK_TO_LIVE = "com.taobao.taolive.room.backToLive";
    private static final String EVENT_INPUT_SHOW = "com.taobao.taolive.room.input_show";
    private static final String EVENT_REPLAY_BACK_TO_LIVE = "com.taobao.taolive.room.replay_backToLive";
    private static final String EVENT_TIMESHIFT_VISIBILITYCHANGE_FOR_REPLAY = "com.taobao.taolive.room.timeshift.visibititlychange.replay";
    private static final String ICON_URL = "https://img.alicdn.com/tfs/TB1tRmcyHr1gK0jSZR0XXbP8XXa-48-48.png";
    public View mBackToLive;
    private AliUrlImageView mBackToLiveImg;
    private TextView mBackToLiveText;
    private FrameLayout mBottomInputScan;
    private TUrlImageView mBottomInputScanAnim;
    private TextView mChatView;
    private int mCommentStatus;
    private String mLiveId;
    private final d.a mMessageListener;
    private long mOpenPageTime;
    private long mTimeShiftStart;
    private hfr quickCommentController;

    static {
        kge.a(-1287268147);
        kge.a(-1201612728);
        kge.a(191318335);
        kge.a(1730800951);
    }

    public static /* synthetic */ Object ipc$super(BottomInputFrame bottomInputFrame, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "commentInput";
    }

    public static /* synthetic */ int access$000(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d65f6b0", new Object[]{bottomInputFrame})).intValue() : bottomInputFrame.mCommentStatus;
    }

    public static /* synthetic */ int access$002(BottomInputFrame bottomInputFrame, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4168dddb", new Object[]{bottomInputFrame, new Integer(i)})).intValue();
        }
        bottomInputFrame.mCommentStatus = i;
        return i;
    }

    public static /* synthetic */ void access$100(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7556d1dc", new Object[]{bottomInputFrame});
        } else {
            bottomInputFrame.setDefaultInputHint();
        }
    }

    public static /* synthetic */ TUrlImageView access$1000(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("2403240e", new Object[]{bottomInputFrame}) : bottomInputFrame.mBottomInputScanAnim;
    }

    public static /* synthetic */ hfr access$200(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hfr) ipChange.ipc$dispatch("dc4efc77", new Object[]{bottomInputFrame}) : bottomInputFrame.quickCommentController;
    }

    public static /* synthetic */ long access$300(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e538880e", new Object[]{bottomInputFrame})).longValue() : bottomInputFrame.mOpenPageTime;
    }

    public static /* synthetic */ String access$402(BottomInputFrame bottomInputFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3de2bbf", new Object[]{bottomInputFrame, str});
        }
        bottomInputFrame.mLiveId = str;
        return str;
    }

    public static /* synthetic */ void access$500(BottomInputFrame bottomInputFrame, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbabc975", new Object[]{bottomInputFrame, videoInfo});
        } else {
            bottomInputFrame.showBackLiveBtn(videoInfo);
        }
    }

    public static /* synthetic */ void access$600(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0b1977", new Object[]{bottomInputFrame});
        } else {
            bottomInputFrame.hideBackLiveBtn();
        }
    }

    public static /* synthetic */ TextView access$700(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("fab5bb0a", new Object[]{bottomInputFrame}) : bottomInputFrame.mBackToLiveText;
    }

    public static /* synthetic */ AliUrlImageView access$800(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("78b10257", new Object[]{bottomInputFrame}) : bottomInputFrame.mBackToLiveImg;
    }

    public static /* synthetic */ FrameLayout access$900(BottomInputFrame bottomInputFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("307a3985", new Object[]{bottomInputFrame}) : bottomInputFrame.mBottomInputScan;
    }

    public BottomInputFrame(Context context, a aVar) {
        super(context, aVar);
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                BottomInputFrame.this = this;
            }

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                JSONObject b;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i == 1072 && (obj instanceof String)) {
                    if (!ply.m() || (b = pqj.b(String.valueOf(obj))) == null || BottomInputFrame.this.mLiveDataModel == null || BottomInputFrame.this.mLiveDataModel.mVideoInfo == null) {
                        return;
                    }
                    BottomInputFrame.access$002(BottomInputFrame.this, b.getIntValue("switchStatus"));
                    BottomInputFrame.access$100(BottomInputFrame.this);
                    BottomInputFrame.this.mLiveDataModel.mVideoInfo.commentSwitchStatus = BottomInputFrame.access$000(BottomInputFrame.this);
                } else if (i != 10085 || !(obj instanceof String) || !ply.m() || BottomInputFrame.access$000(BottomInputFrame.this) == 1 || BottomInputFrame.this.isLandscape() || BottomInputFrame.this.mLiveDataModel == null || BottomInputFrame.this.mLiveDataModel.mVideoInfo == null || BottomInputFrame.access$200(BottomInputFrame.this) == null || !StringUtils.equals(BottomInputFrame.this.mLiveDataModel.mVideoInfo.roomStatus, "1")) {
                } else {
                    BottomInputFrame.access$200(BottomInputFrame.this).a(BottomInputFrame.access$300(BottomInputFrame.this), String.valueOf(obj));
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_input_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mChatView = (TextView) view.findViewById(R.id.taolive_chat_msg_btn);
        this.mChatView.setOnClickListener(this);
        TextView textView = this.mChatView;
        textView.setContentDescription(((Object) this.mChatView.getText()) + "，");
        hki.b(this.mChatView);
        this.mBackToLive = view.findViewById(R.id.taolive_timeplay_back_to_live);
        this.mBackToLiveImg = (AliUrlImageView) view.findViewById(R.id.tblive_icon_back_to_live_img);
        this.mBackToLiveText = (TextView) view.findViewById(R.id.tblive_icon_back_to_live_text);
        this.mBackToLive.setVisibility(8);
        this.mBackToLive.setOnClickListener(this);
        this.mBottomInputScan = (FrameLayout) view.findViewById(R.id.taolive_bottom_input_scan);
        this.mBottomInputScanAnim = (TUrlImageView) view.findViewById(R.id.taolive_bottom_input_scan_anim);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.quickCommentController = new hfp(this);
        this.mFrameContext.e().a(this);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                BottomInputFrame.this = this;
            }

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1072 || i == 10085;
            }
        });
        checkTimePlayMode(tBLiveDataModel);
        if (j.a(tBLiveDataModel)) {
            w.a(this.mContext, "主播已关闭评论功能");
        }
        setDefaultInputHint();
        this.mOpenPageTime = System.currentTimeMillis();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.mFrameContext != null && this.mFrameContext.d() != null) {
            this.mFrameContext.d().a();
        }
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        this.mFrameContext.e().b(this);
        hfr hfrVar = this.quickCommentController;
        if (hfrVar == null) {
            return;
        }
        hfrVar.e();
    }

    private void setDefaultInputHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90a5039", new Object[]{this});
        } else if (this.mCommentStatus == 1) {
            setHint("评论已关闭");
        } else {
            setHint(this.mContext.getResources().getString(R.string.taolive_liveroom_chat_msg_btn_text_flexalocal));
        }
    }

    private void setHint(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5062bda", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (textView = this.mChatView) == null) {
        } else {
            textView.setText(str);
        }
    }

    public void checkTimePlayMode(TBLiveDataModel tBLiveDataModel) {
        final VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5521cc", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || videoInfo.broadCaster == null) {
        } else {
            if ("2".equals(videoInfo.roomStatus)) {
                if (this.mFrameContext == null || this.mFrameContext.d() == null) {
                    return;
                }
                this.mFrameContext.d().a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        BottomInputFrame.this = this;
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        } else if (netBaseOutDo == null || netBaseOutDo.mo1437getData() == null) {
                        } else {
                            LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = (LiveDetailMessinfoResponseData) pqj.a(pqj.a(netBaseOutDo.mo1437getData()), LiveDetailMessinfoResponseData.class);
                            if (liveDetailMessinfoResponseData != null && !StringUtils.isEmpty(liveDetailMessinfoResponseData.hasLive)) {
                                BottomInputFrame.access$402(BottomInputFrame.this, liveDetailMessinfoResponseData.hasLive);
                                BottomInputFrame.access$500(BottomInputFrame.this, videoInfo);
                                return;
                            }
                            BottomInputFrame.access$600(BottomInputFrame.this);
                            BottomInputFrame.access$402(BottomInputFrame.this, null);
                        }
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                            return;
                        }
                        BottomInputFrame.access$600(BottomInputFrame.this);
                        BottomInputFrame.access$402(BottomInputFrame.this, null);
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSystemError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                            return;
                        }
                        BottomInputFrame.access$600(BottomInputFrame.this);
                        BottomInputFrame.access$402(BottomInputFrame.this, null);
                    }
                });
            } else if (this.mFrameContext.i() != null && this.mFrameContext.i().b() == VideoStatus.VIDEO_TIMESHIFT_STATUS && "1".equals(videoInfo.roomStatus)) {
                showBackLiveBtn(videoInfo);
            } else {
                hideBackLiveBtn();
            }
        }
    }

    private void hideBackLiveBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52854e", new Object[]{this});
            return;
        }
        TextView textView = this.mChatView;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.mBackToLive;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void showBackLiveBtn(VideoInfo videoInfo) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fc283a", new Object[]{this, videoInfo});
        } else if (videoInfo == null) {
        } else {
            TextView textView = this.mChatView;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view2 = this.mBackToLive;
            if (view2 != null && view2.getVisibility() != 0) {
                this.mTimeShiftStart = System.currentTimeMillis();
                this.mBackToLive.setVisibility(0);
                HashMap<String, String> hashMap = new HashMap<>();
                if (videoInfo.broadCaster != null) {
                    hashMap.put("account_id", videoInfo.broadCaster.accountId);
                }
                hashMap.put("feed_id", videoInfo.liveId);
                hashMap.put("istimeshift", "1");
                if (!phg.d().a() && phg.a() != null) {
                    hashMap.put("item_id", phg.a().c(this.mFrameContext));
                }
                hashMap.put("show_time", Long.toString(System.currentTimeMillis()));
                if (phg.a() != null) {
                    phg.a().a(this.mFrameContext, "Show-Gotolive", hashMap);
                }
            }
            if ("2".equals(videoInfo.roomStatus)) {
                this.mBackToLiveText.setText(this.mContext.getResources().getText(R.string.taolive_timeplay_back_to_live_1_new_flexalocal));
                this.mBackToLiveImg.setSkipAutoSize(true);
                this.mBackToLiveImg.setImageUrl(ICON_URL);
                if (phg.a() != null) {
                    phg.a().a(this.mFrameContext, "Show-PlaybackToLive", (HashMap<String, String>) null);
                }
            } else if ("1".equals(videoInfo.roomStatus) && this.mFrameContext.i().b().equals(VideoStatus.VIDEO_TIMESHIFT_STATUS)) {
                this.mBackToLiveText.setText("主播正在直播中");
                this.mBackToLiveImg.setSkipAutoSize(true);
                this.mBackToLiveImg.setImageUrl(ICON_URL);
                if (phg.a() != null) {
                    phg.a().a(this.mFrameContext, "Show-PlaybackToLive", (HashMap<String, String>) null);
                }
            } else {
                TextView textView2 = this.mBackToLiveText;
                if (textView2 != null) {
                    textView2.setText(this.mContext.getResources().getText(R.string.taolive_timeplay_back_to_live_new_flexalocal));
                }
                AliUrlImageView aliUrlImageView = this.mBackToLiveImg;
                if (aliUrlImageView != null) {
                    aliUrlImageView.setSkipAutoSize(false);
                    this.mBackToLiveImg.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01gcSUph26gX0bOH03L_!!6000000007691-2-tps-64-64.png");
                }
            }
            if (this.mBackToLiveText == null || (view = this.mBackToLive) == null || this.mBackToLiveImg == null) {
                return;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    BottomInputFrame.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    int measuredWidth = BottomInputFrame.this.mBackToLive.getMeasuredWidth();
                    int measuredHeight = BottomInputFrame.this.mBackToLive.getMeasuredHeight();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        int i = measuredWidth / measuredHeight;
                        if (i < 2) {
                            BottomInputFrame.access$700(BottomInputFrame.this).setText("直播");
                            BottomInputFrame.access$700(BottomInputFrame.this).setTextSize(1, 10.0f);
                        } else if (i < 3) {
                            BottomInputFrame.access$700(BottomInputFrame.this).setText("回直播");
                        }
                        BottomInputFrame.access$800(BottomInputFrame.this).setVisibility(8);
                    }
                    BottomInputFrame.this.mBackToLive.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    private void backToLive() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e3d355", new Object[]{this});
        } else if (this.mLiveDataModel == null || (videoInfo = this.mLiveDataModel.mVideoInfo) == null || videoInfo.broadCaster == null) {
        } else {
            if ("2".equals(videoInfo.roomStatus)) {
                this.mFrameContext.e().a(EVENT_REPLAY_BACK_TO_LIVE, this.mLiveId, observeUniqueIdentification());
                if (phg.a() == null) {
                    return;
                }
                phg.a().a(this.mFrameContext, "PlaybackToLive", new String[0]);
                return;
            }
            HashMap hashMap = new HashMap();
            if (videoInfo != null) {
                if (videoInfo.broadCaster != null) {
                    hashMap.put("account_id", videoInfo.broadCaster.accountId);
                }
                hashMap.put("feed_id", videoInfo.liveId);
            }
            hashMap.put("istimeshift", "1");
            hashMap.put("duration", (System.currentTimeMillis() - this.mTimeShiftStart) + "");
            if (!phg.d().a() && phg.a() != null) {
                hashMap.put("item_id", phg.a().c(this.mFrameContext));
            }
            hashMap.put("click_time", Long.toString(System.currentTimeMillis()));
            if (phg.a() != null) {
                phg.a().a(this.mFrameContext, "Gotolive", (Map<String, String>) hashMap);
            }
            w.a(this.mContext, this.mContext.getResources().getText(R.string.taolive_timeplay_back_to_toast3_flexalocal));
            this.mFrameContext.e().a("com.taobao.taolive.room.backToLive", null, this.mFrameContext.G());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IBTypeRoomProxy.d nonageServiceX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (this.mFrameContext != null && this.mFrameContext.z() != null && this.mFrameContext.z().M()) {
            this.mFrameContext.e().a(xkw.e, "assembly", observeUniqueIdentification());
        }
        if (view.getId() == R.id.taolive_chat_msg_btn) {
            if (c.a().d() && f.p() != null && f.p().getNonageServiceX() != null && (nonageServiceX = f.p().getNonageServiceX()) != null && (this.mContext instanceof Activity) && nonageServiceX.a((Activity) this.mContext, "评论")) {
                return;
            }
            showInputMethod(null);
        } else if (view.getId() != R.id.taolive_timeplay_back_to_live) {
        } else {
            backToLive();
        }
    }

    private void showInputMethod(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab00bf50", new Object[]{this, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        hfr hfrVar = this.quickCommentController;
        if (hfrVar != null && hfrVar.b()) {
            map.put("enableQuickComment", pqj.a(this.quickCommentController.c()));
            map.put(hfr.REPORT_QUICK_COMMENT, pqj.a(this.quickCommentController.d()));
        }
        this.mFrameContext.e().a("com.taobao.taolive.room.input_show", map, observeUniqueIdentification());
    }

    private void setBottomInputScanAnim(boolean z) {
        AlphaAnimation alphaAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6651e222", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(100L);
            alphaAnimation.setAnimationListener(new AnonymousClass5());
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            alphaAnimation.setAnimationListener(new AnonymousClass6());
        }
        FrameLayout frameLayout = this.mBottomInputScan;
        if (frameLayout == null) {
            return;
        }
        frameLayout.startAnimation(alphaAnimation);
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame$5 */
    /* loaded from: classes5.dex */
    public class AnonymousClass5 implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$MWtGUAoiKUGBx6qlrpVluoYwKGc(AnonymousClass5 anonymousClass5) {
            anonymousClass5.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        public AnonymousClass5() {
            BottomInputFrame.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                hfo.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.-$$Lambda$BottomInputFrame$5$MWtGUAoiKUGBx6qlrpVluoYwKGc
                    {
                        BottomInputFrame.AnonymousClass5.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomInputFrame.AnonymousClass5.lambda$MWtGUAoiKUGBx6qlrpVluoYwKGc(BottomInputFrame.AnonymousClass5.this);
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (BottomInputFrame.access$900(BottomInputFrame.this) == null || BottomInputFrame.access$1000(BottomInputFrame.this) == null) {
            } else {
                BottomInputFrame.access$900(BottomInputFrame.this).setVisibility(0);
                BottomInputFrame.access$1000(BottomInputFrame.this).setSkipAutoSize(true);
                BottomInputFrame.access$1000(BottomInputFrame.this).setImageUrl(hfr.BOTTOM_INPUT_SCAN_ANIM);
            }
        }
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame$6 */
    /* loaded from: classes5.dex */
    public class AnonymousClass6 implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$_E8MSiVQV61EhoS2qvvsY2Mxdu4(AnonymousClass6 anonymousClass6) {
            anonymousClass6.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }

        public AnonymousClass6() {
            BottomInputFrame.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                hfo.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.-$$Lambda$BottomInputFrame$6$_E8MSiVQV61EhoS2qvvsY2Mxdu4
                    {
                        BottomInputFrame.AnonymousClass6.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomInputFrame.AnonymousClass6.lambda$_E8MSiVQV61EhoS2qvvsY2Mxdu4(BottomInputFrame.AnonymousClass6.this);
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (BottomInputFrame.access$900(BottomInputFrame.this) == null) {
            } else {
                BottomInputFrame.access$900(BottomInputFrame.this).setVisibility(8);
            }
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        hfr hfrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (hfr.SHOW_INPUT_EVENT.equals(str)) {
            HashMap hashMap = null;
            if (obj instanceof HashMap) {
                hashMap = (HashMap) obj;
            }
            showInputMethod(hashMap);
        } else if (!hfr.HIDE_QUICK_COMMENT_EVENT.equals(str) || (hfrVar = this.quickCommentController) == null) {
        } else {
            hfrVar.a();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{EVENT_TIMESHIFT_VISIBILITYCHANGE_FOR_REPLAY, hfr.SHOW_INPUT_EVENT, hfr.HIDE_QUICK_COMMENT_EVENT};
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

    @Override // tb.hfq
    public void showQuickCommentGuide(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a425b7be", new Object[]{this, str});
        } else {
            hfo.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.-$$Lambda$BottomInputFrame$Ic4d0m7zRD1TcX2JSj0WlLjV1yE
                {
                    BottomInputFrame.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BottomInputFrame.this.lambda$showQuickCommentGuide$34$BottomInputFrame(str);
                }
            });
        }
    }

    public /* synthetic */ void lambda$showQuickCommentGuide$34$BottomInputFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d0086", new Object[]{this, str});
        } else if (v.f(str)) {
        } else {
            setHint(str);
            setBottomInputScanAnim(true);
        }
    }

    @Override // tb.hfq
    public void hideQuickCommentGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d56dcf", new Object[]{this});
        } else {
            hfo.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.-$$Lambda$BottomInputFrame$X8lMyhh3TaNAR53xrmk3VAXkiXA
                {
                    BottomInputFrame.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BottomInputFrame.this.lambda$hideQuickCommentGuide$35$BottomInputFrame();
                }
            });
        }
    }

    public /* synthetic */ void lambda$hideQuickCommentGuide$35$BottomInputFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b92882", new Object[]{this});
            return;
        }
        setDefaultInputHint();
        setBottomInputScanAnim(false);
    }
}
