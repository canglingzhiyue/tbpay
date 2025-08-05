package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.his;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.plx;
import tb.ply;
import tb.pqj;
import tb.rhu;
import tb.tqa;
import tb.xkw;

/* loaded from: classes5.dex */
public class ChatFrame3 extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ChatFrame3";
    private FrameLayout mAuctionFrameLayout;
    public com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d mChatController;
    private final Runnable mFourthRenderTask;
    private final Handler mMainHandler;
    private final d.a mMessageListener;
    private final Runnable mThirdRenderTask;
    private int offset;
    private ValueAnimator onSabAtmosphereDismissAnimator;
    private ValueAnimator onSabAtmosphereShowAnimator;
    private int originalHeight;

    static {
        kge.a(-532948058);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(ChatFrame3 chatFrame3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 588897590:
                super.onVideoStatusChanged(((Number) objArr[0]).intValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-chat";
    }

    public static /* synthetic */ void access$000(ChatFrame3 chatFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44de9b40", new Object[]{chatFrame3});
        } else {
            chatFrame3.onThirdRender();
        }
    }

    public static /* synthetic */ void access$100(ChatFrame3 chatFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2557f141", new Object[]{chatFrame3});
        } else {
            chatFrame3.onFourthTrigger();
        }
    }

    public static /* synthetic */ int access$200(ChatFrame3 chatFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d14735", new Object[]{chatFrame3})).intValue() : chatFrame3.originalHeight;
    }

    public static /* synthetic */ int access$202(ChatFrame3 chatFrame3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("703edfb2", new Object[]{chatFrame3, new Integer(i)})).intValue();
        }
        chatFrame3.originalHeight = i;
        return i;
    }

    public static /* synthetic */ int access$300(ChatFrame3 chatFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e64a9d36", new Object[]{chatFrame3})).intValue() : chatFrame3.offset;
    }

    public static /* synthetic */ int access$302(ChatFrame3 chatFrame3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ef049d1", new Object[]{chatFrame3, new Integer(i)})).intValue();
        }
        chatFrame3.offset = i;
        return i;
    }

    public static /* synthetic */ ValueAnimator access$400(ChatFrame3 chatFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("f8a24ca8", new Object[]{chatFrame3}) : chatFrame3.onSabAtmosphereShowAnimator;
    }

    public static /* synthetic */ ValueAnimator access$402(ChatFrame3 chatFrame3, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("74c08292", new Object[]{chatFrame3, valueAnimator});
        }
        chatFrame3.onSabAtmosphereShowAnimator = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ ValueAnimator access$500(ChatFrame3 chatFrame3, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("47a801c9", new Object[]{chatFrame3, new Integer(i), new Integer(i2)}) : chatFrame3.getValueAnimator(i, i2);
    }

    public static /* synthetic */ ValueAnimator access$600(ChatFrame3 chatFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("5f9470aa", new Object[]{chatFrame3}) : chatFrame3.onSabAtmosphereDismissAnimator;
    }

    public ChatFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                JSONObject b;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 1072 || !(obj instanceof String) || !ply.m() || (b = pqj.b(String.valueOf(obj))) == null || ChatFrame3.this.mLiveDataModel == null || ChatFrame3.this.mLiveDataModel.mVideoInfo == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    ChatFrame3.this.mChatController.h();
                    if (b.getIntValue("switchStatus") == 1) {
                        ChatFrame3.this.hide();
                        hashMap.put("switchStatus", "1");
                    } else {
                        ChatFrame3.this.show();
                        hashMap.put("switchStatus", "0");
                        VideoInfo videoInfo = ChatFrame3.this.mLiveDataModel.mVideoInfo;
                        if (videoInfo != null) {
                            ChatFrame3.this.mFrameContext.e().a(xkw.EVENT_ADD_ITEM_LISTS, videoInfo, ChatFrame3.this.mFrameContext == null ? null : ChatFrame3.this.mFrameContext.G());
                        }
                    }
                    phg.a().a(ChatFrame3.this.mFrameContext, 19999, "pmCommentSwitchStatus", hashMap);
                }
            }
        };
        this.mThirdRenderTask = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ChatFrame3.access$000(ChatFrame3.this);
                }
            }
        };
        this.mFourthRenderTask = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ChatFrame3.access$100(ChatFrame3.this);
                }
            }
        };
        this.mChatController = new com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d(this.mContext, this.mFrameContext.b, this.mFrameContext);
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_message_new_3_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mChatController.a(this.mContainer);
        com.taobao.android.live.plugin.proxy.e.c("ChatFrame3: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mChatController.a(tBLiveDataModel);
        ddw.a().a(this);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1072;
            }
        });
        show();
        if (!p.B()) {
            return;
        }
        this.mMainHandler.postDelayed(this.mThirdRenderTask, b.p());
        this.mMainHandler.postDelayed(this.mFourthRenderTask, b.q());
    }

    private void onThirdRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c886805", new Object[]{this});
        } else {
            this.mChatController.s();
        }
    }

    private void onFourthTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9497d3a6", new Object[]{this});
        } else {
            this.mChatController.D();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar == null) {
            return;
        }
        dVar.b(i);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar == null) {
            return;
        }
        dVar.g();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar == null) {
            return;
        }
        dVar.g();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
            return;
        }
        super.onVideoStatusChanged(i);
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar == null) {
            return;
        }
        dVar.a(i);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (p.B()) {
            this.mMainHandler.removeCallbacks(this.mThirdRenderTask);
            this.mMainHandler.removeCallbacks(this.mFourthRenderTask);
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar = this.mChatController;
        if (dVar != null) {
            dVar.e();
        }
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        ddw.a().b(this);
        if (!hkk.P()) {
            return;
        }
        cancelAnimator();
    }

    @Override // tb.ddv
    public void onEvent(String str, final Object obj) {
        com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.d dVar;
        int i;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.showcase.control".equals(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            Map<String, String> map = (Map) obj;
            if (!checkLiveId(map)) {
                return;
            }
            String str2 = map.get("eventType");
            if (tqa.AUCTION_CARD_SHOW.equals(str2)) {
                String str3 = map.get("data");
                try {
                    if (TextUtils.isEmpty(str3) || (intValue = JSON.parseObject(str3).getIntValue("cardHeight")) < 0) {
                        return;
                    }
                    updatePosition(com.taobao.taolive.room.utils.d.a(this.mContext, 370.0f), com.taobao.taolive.room.utils.d.a(this.mContext, intValue) + com.taobao.taolive.room.utils.d.a(this.mContext, 4.0f));
                } catch (Exception e) {
                    plx.b("AuctionLiveFrame", e.getMessage());
                }
            } else if (!tqa.AUCTION_CARD_HIDE.equals(str2)) {
            } else {
                updatePosition(0, 0);
            }
        } else if (hkk.P() && "com.taobao.taolive.room.sab_atmosphere_show".equals(str) && (obj instanceof Integer)) {
            getComponentView().post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (ChatFrame3.access$200(ChatFrame3.this) == 0 && ChatFrame3.access$300(ChatFrame3.this) == 0) {
                        ChatFrame3 chatFrame3 = ChatFrame3.this;
                        ChatFrame3.access$202(chatFrame3, chatFrame3.getComponentView().getMeasuredHeight());
                        ChatFrame3.access$302(ChatFrame3.this, ((Integer) obj).intValue() / 3);
                    }
                    q.b(ChatFrame3.TAG, "onSabAtmosphereShow# originalHeight=" + ChatFrame3.access$200(ChatFrame3.this) + ", offset=" + ChatFrame3.access$300(ChatFrame3.this));
                    if (ChatFrame3.access$200(ChatFrame3.this) <= 0 || ChatFrame3.access$300(ChatFrame3.this) <= 0) {
                        return;
                    }
                    ChatFrame3 chatFrame32 = ChatFrame3.this;
                    ChatFrame3.access$402(chatFrame32, ChatFrame3.access$500(chatFrame32, ChatFrame3.access$200(chatFrame32), ChatFrame3.access$200(ChatFrame3.this) - ChatFrame3.access$300(ChatFrame3.this)));
                    if (ChatFrame3.access$600(ChatFrame3.this) != null && ChatFrame3.access$600(ChatFrame3.this).isRunning()) {
                        ChatFrame3.access$600(ChatFrame3.this).cancel();
                    }
                    ChatFrame3.access$400(ChatFrame3.this).start();
                }
            });
        } else if (hkk.P() && "com.taobao.taolive.room.sab_atmosphere_dismiss".equals(str)) {
            q.b(TAG, "onSabAtmosphereDismiss# originalHeight=" + this.originalHeight + ", offset=" + this.offset);
            int i2 = this.originalHeight;
            if (i2 <= 0 || (i = this.offset) <= 0) {
                return;
            }
            this.onSabAtmosphereDismissAnimator = getValueAnimator(i2 - i, i2);
            ValueAnimator valueAnimator = this.onSabAtmosphereShowAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.onSabAtmosphereShowAnimator.cancel();
            }
            this.onSabAtmosphereDismissAnimator.start();
        } else if (a.KEY_ANCHOR_RESPONSE_VIEW.equals(str)) {
            if (!hkk.f() || (dVar = this.mChatController) == null || !(obj instanceof String)) {
                return;
            }
            dVar.b(TextUtils.equals((String) obj, "false"));
        } else if (!"com.taobao.taolive.room.goods_list_showing".equals(str)) {
        } else {
            Object gLConfig = com.taobao.android.live.plugin.proxy.f.m().getGLConfig(null, "glPerformanceExclusive");
            if (!(gLConfig instanceof Boolean) || !((Boolean) gLConfig).booleanValue()) {
                his.b(TAG, "gl event | state false.");
            } else if (!(obj instanceof Boolean)) {
            } else {
                his.b(TAG, "gl event | show=" + obj);
                if (((Boolean) obj).booleanValue()) {
                    onPause();
                } else {
                    onResume();
                }
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.showcase.control", "com.taobao.taolive.room.sab_atmosphere_show", "com.taobao.taolive.room.sab_atmosphere_dismiss", a.KEY_ANCHOR_RESPONSE_VIEW, "com.taobao.taolive.room.goods_list_showing"};
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

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : getComponentName();
    }

    private void updatePosition(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fba6b9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mAuctionFrameLayout == null && (this.mContext instanceof Activity)) {
            ViewStub viewStub = (ViewStub) ((Activity) this.mContext).findViewById(R.id.taolive_room_auction_stub);
            viewStub.setLayoutResource(R.layout.taolive_frame_auction_flexalocal);
            this.mAuctionFrameLayout = (FrameLayout) viewStub.inflate();
        }
        FrameLayout frameLayout = this.mAuctionFrameLayout;
        if (frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
            return;
        }
        try {
            layoutParams.width = i;
            layoutParams.height = i2;
            if (layoutParams.width > 0 && layoutParams.height > 0) {
                this.mAuctionFrameLayout.setLayoutParams(layoutParams);
                this.mAuctionFrameLayout.setVisibility(0);
                return;
            }
            this.mAuctionFrameLayout.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    private boolean checkLiveId(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8741a573", new Object[]{this, map})).booleanValue();
        }
        if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
            return false;
        }
        String str = map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        if (!TextUtils.isEmpty(str)) {
            return str.equals(this.mLiveDataModel.mVideoInfo.liveId);
        }
        return false;
    }

    private ValueAnimator getValueAnimator(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("9b66e6cd", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatFrame3.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                rhu.a(ChatFrame3.this.getComponentView(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                rhu.b(ChatFrame3.this.getComponentView(), ChatFrame3.access$200(ChatFrame3.this) - ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(250L);
        return ofInt;
    }

    private void cancelAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57237f88", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.onSabAtmosphereShowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.onSabAtmosphereDismissAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (this.originalHeight <= 0 || this.offset <= 0) {
            return;
        }
        rhu.a(getComponentView(), this.originalHeight);
        rhu.b(getComponentView(), 0);
        this.originalHeight = 0;
        this.offset = 0;
    }
}
