package com.taobao.taolive.room.minilive;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class MiniLiveFullScreenFrame extends BaseFrame implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int NoWifiTips = 1000;
    private MiniLiveCoverImgViewFrame coverImgViewFrame;
    private IBTypeRoomProxy.AbsFavorCountFrame favorCountFrame;
    private Handler mHandler;
    private boolean mHasSetUp;
    private boolean mLiveEnd;
    private View mMiniLiveBg;
    private MiniLiveChatFrame mMiniLiveChatFrame;
    private TextView mNoWifiTips;

    static {
        kge.a(-1715469533);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(MiniLiveFullScreenFrame miniLiveFullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -340027132:
                super.show();
                return null;
            case 188604040:
                super.onStop();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(MiniLiveFullScreenFrame miniLiveFullScreenFrame, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957591ca", new Object[]{miniLiveFullScreenFrame, videoInfo});
        } else {
            miniLiveFullScreenFrame.initFavorCountFrame(videoInfo);
        }
    }

    public MiniLiveFullScreenFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mHandler = new Handler(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_minilive_frame);
            this.mContainer = viewStub.inflate();
            this.mNoWifiTips = (TextView) this.mContainer.findViewById(R.id.taolive_minilive_no_wifi_tips);
            this.mMiniLiveBg = this.mContainer.findViewById(R.id.taolive_minilive_bg);
        }
    }

    public void onCreateView2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca507979", new Object[]{this, view});
            return;
        }
        this.mContainer = view;
        this.mContainer.setVisibility(0);
        ((ViewGroup) this.mContainer).removeAllViews();
        LayoutInflater.from(this.mContext).inflate(R.layout.taolive_minilive_frame, (ViewGroup) this.mContainer);
        this.mNoWifiTips = (TextView) this.mContainer.findViewById(R.id.taolive_minilive_no_wifi_tips);
        this.mMiniLiveBg = this.mContainer.findViewById(R.id.taolive_minilive_bg);
        this.mMiniLiveBg.setVisibility(4);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mHasSetUp = false;
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void refresh(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2ed821", new Object[]{this, viewGroup});
            return;
        }
        if (viewGroup != null && this.mContainer != null) {
            if (this.mContainer.getParent() != null) {
                ((ViewGroup) this.mContainer.getParent()).removeView(this.mContainer);
            }
            viewGroup.addView(this.mContainer);
        }
        if (this.favorCountFrame == null || poy.u(this.mFrameContext) == null) {
            return;
        }
        this.favorCountFrame.updateFavorCount(poy.u(this.mFrameContext).praiseCount);
    }

    public void setUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03222b0", new Object[]{this, new Boolean(z)});
        } else if (this.mHasSetUp) {
        } else {
            this.mHasSetUp = true;
            this.mLiveEnd = z;
            initAll();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
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
        MiniLiveChatFrame miniLiveChatFrame = this.mMiniLiveChatFrame;
        if (miniLiveChatFrame == null) {
            return;
        }
        miniLiveChatFrame.destroyPresenter();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        if (this.mMiniLiveChatFrame == null) {
            return;
        }
        j.m(this.mFrameContext);
        this.mMiniLiveChatFrame.recoverPresenter();
    }

    private void initAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183da678", new Object[]{this});
        } else {
            setUpView();
        }
    }

    private void setUpView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf59269", new Object[]{this});
        } else if (this.mLiveEnd) {
        } else {
            initShowcase();
            initChat();
            initFavorCount();
        }
    }

    private void initShowcase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acce16e4", new Object[]{this});
        } else if (this.mContainer == null) {
        } else {
            MiniLiveShowcaseFrame miniLiveShowcaseFrame = new MiniLiveShowcaseFrame(this.mContext, this.mFrameContext);
            miniLiveShowcaseFrame.onCreateView((ViewStub) this.mContainer.findViewById(R.id.taolive_minilive_showcase_stub));
            miniLiveShowcaseFrame.setStartAnimView(this.mContainer.findViewById(R.id.taolive_minilive_showcase_anim_start));
            addComponent(miniLiveShowcaseFrame);
        }
    }

    private void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        } else if (this.mContainer == null) {
        } else {
            this.mMiniLiveChatFrame = new MiniLiveChatFrame(this.mContext, this.mFrameContext);
            this.mMiniLiveChatFrame.onCreateView((ViewStub) this.mContainer.findViewById(R.id.minilive_chat_recyclerview));
            addComponent(this.mMiniLiveChatFrame);
        }
    }

    private void initFavorCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530fd2a8", new Object[]{this});
            return;
        }
        final VideoInfo u = poy.u(this.mFrameContext);
        if (u == null || this.mContainer == null) {
            return;
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d()) {
            initFavorCountFrame(u);
        } else {
            com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.room.minilive.MiniLiveFullScreenFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.c.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        MiniLiveFullScreenFrame.access$000(MiniLiveFullScreenFrame.this, u);
                    }
                }
            });
        }
    }

    private void initFavorCountFrame(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25adc09a", new Object[]{this, videoInfo});
        } else if (f.p() == null) {
        } else {
            this.favorCountFrame = f.p().createFavorCountFrame(this.mContext, videoInfo.praiseCount, videoInfo.favorIcon, false, (ViewStub) this.mContainer.findViewById(R.id.taolive_minilive_favor_count_stub));
            IBTypeRoomProxy.AbsFavorCountFrame absFavorCountFrame = this.favorCountFrame;
            if (absFavorCountFrame == null) {
                return;
            }
            addComponent(absFavorCountFrame);
        }
    }

    public void showCoverImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903af47a", new Object[]{this, str});
        } else if (this.mContainer == null) {
        } else {
            if (this.coverImgViewFrame == null) {
                this.coverImgViewFrame = new MiniLiveCoverImgViewFrame(this.mContext, false, this.mFrameContext);
                this.coverImgViewFrame.onCreateView((ViewStub) this.mContainer.findViewById(R.id.taolive_error_stub_minilive));
                addComponent(this.coverImgViewFrame);
            }
            this.coverImgViewFrame.show(str);
        }
    }

    public void hideCoverImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c4d975", new Object[]{this});
            return;
        }
        MiniLiveCoverImgViewFrame miniLiveCoverImgViewFrame = this.coverImgViewFrame;
        if (miniLiveCoverImgViewFrame == null) {
            return;
        }
        miniLiveCoverImgViewFrame.hide();
    }

    public void showEnd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e5c8af", new Object[]{this, str});
        } else if (this.mContainer == null) {
        } else {
            MiniLiveEndViewFrame miniLiveEndViewFrame = new MiniLiveEndViewFrame(this.mContext, false, this.mFrameContext);
            miniLiveEndViewFrame.setCoverImg(str);
            miniLiveEndViewFrame.onCreateView((ViewStub) this.mContainer.findViewById(R.id.taolive_end_stub_minilive));
            addComponent(miniLiveEndViewFrame);
        }
    }

    public void showNoWifiTips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44869ab2", new Object[]{this});
        } else if (this.mNoWifiTips == null || this.mHandler == null || aa.d() || this.mContext == null || !d.b(this.mContext)) {
        } else {
            long c = ae.c("showMobileNetHintTime4MiniLive");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c < v.b(pmd.a().d().a("tblive", "autoPlayTimeIntervalOfShowingToastForForShopLive", AgooConstants.REPORT_NOT_ENCRYPT)) * 60 * 60 * 1000) {
                return;
            }
            this.mNoWifiTips.setVisibility(0);
            this.mHandler.sendEmptyMessageDelayed(1000, 3000L);
            ae.a("showMobileNetHintTime4MiniLive", currentTimeMillis);
        }
    }

    private void hidNoWifiTips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249f0b8", new Object[]{this});
            return;
        }
        TextView textView = this.mNoWifiTips;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1000) {
            hidNoWifiTips();
        }
        return false;
    }
}
