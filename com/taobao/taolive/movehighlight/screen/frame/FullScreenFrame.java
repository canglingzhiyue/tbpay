package com.taobao.taolive.movehighlight.screen.frame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.movehighlight.view.PassEventViewPagerHighlight;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.d;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import tb.cgl;
import tb.kge;
import tb.pfb;
import tb.pfo;
import tb.pgo;
import tb.pgt;
import tb.pmd;

/* loaded from: classes8.dex */
public abstract class FullScreenFrame extends BaseFrame implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pfb highlightLocalAdapter;
    public boolean isClearScreen;
    public View mAdView;
    public View mFrontView;
    public VideoInfo mLiveDetailData;
    public PassEventViewPagerHighlight mViewPager;
    public View mViewPagerBackground;
    public pgt simpleAdapter;

    static {
        kge.a(-489581747);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(FullScreenFrame fullScreenFrame, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
        }
    }

    public abstract void initAvatarCard();

    public abstract void initGoodListFrame();

    public abstract void initHighligtFrame(VideoInfo videoInfo);

    public abstract void initRoomWatermark(VideoInfo videoInfo);

    public abstract void initSubscribeCard();

    public abstract void initTBLiveXBackFrame(VideoInfo videoInfo);

    public abstract void initTopBar();

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public static /* synthetic */ pfb access$000(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfb) ipChange.ipc$dispatch("d129eafd", new Object[]{fullScreenFrame}) : fullScreenFrame.highlightLocalAdapter;
    }

    public FullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.isClearScreen = false;
        this.highlightLocalAdapter = pfb.a(aVar);
    }

    public void initAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183da678", new Object[]{this});
            return;
        }
        initEvents();
        initView();
        setUpView();
    }

    private void initEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
        } else if (this.highlightLocalAdapter.k() == null) {
        } else {
            this.highlightLocalAdapter.k().a(new pgo() { // from class: com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pgo
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    } else {
                        FullScreenFrame.this.handleRoomCleanScreen(obj);
                    }
                }
            });
        }
    }

    public void setBackView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84967d", new Object[]{this, view});
            return;
        }
        PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
        if (passEventViewPagerHighlight == null) {
            return;
        }
        passEventViewPagerHighlight.setBackView(view);
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mFrontView);
        this.simpleAdapter = new pgt(arrayList);
    }

    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
        } else {
            this.mViewPager.setOnClearClickListener(new d.a() { // from class: com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.utils.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (FullScreenFrame.access$000(FullScreenFrame.this).k() == null) {
                    } else {
                        FullScreenFrame.access$000(FullScreenFrame.this).k().a(Boolean.valueOf(!FullScreenFrame.this.isClearScreen));
                    }
                }
            }, this.mLandscape);
        }
    }

    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        this.mViewPager = (PassEventViewPagerHighlight) this.mContainer.findViewById(R.id.taolive_viewpager_highlight);
        this.mViewPager.setFrameContext(this.mFrameContext);
        this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background_highlight);
        initAdapter();
        this.mViewPager.setAdapter(this.simpleAdapter);
        this.mViewPager.setCurrentItem(0);
        this.simpleAdapter.notifyDataSetChanged();
        initClearScreen();
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        initFrontView();
        initViewPager();
    }

    public void initFrontView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9072c5", new Object[]{this});
            return;
        }
        this.mFrontView = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_video_content_highlight, (ViewGroup) null);
        if (c.d()) {
            final double c = b.c(this.mContext) * c.c();
            this.mFrontView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getY() > c) {
                        FullScreenFrame.this.mViewPager.setCanScroll(false);
                    } else {
                        FullScreenFrame.this.mViewPager.setCanScroll(true);
                    }
                    return false;
                }
            });
        }
        this.mFrontView.setSoundEffectsEnabled(false);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
        if (passEventViewPagerHighlight != null) {
            passEventViewPagerHighlight.setAdapter(null);
            this.mViewPager = null;
        }
        pgt pgtVar = this.simpleAdapter;
        if (pgtVar != null) {
            pgtVar.a();
            this.simpleAdapter = null;
        }
        clearComponents();
    }

    public FrameLayout getPlayerControllerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ebbada", new Object[]{this}) : (FrameLayout) this.mFrontView.findViewById(R.id.taolive_player_controller_layout);
    }

    public com.taobao.taolive.sdk.ui.media.playercontrol.a getControllerHolder(ViewGroup viewGroup) {
        FrameLayout playerControllerView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.playercontrol.a) ipChange.ipc$dispatch("836c4024", new Object[]{this, viewGroup});
        }
        if (this.mFrontView == null || (playerControllerView = getPlayerControllerView()) == null) {
            return null;
        }
        playerControllerView.removeAllViews();
        playerControllerView.setVisibility(0);
        LayoutInflater from = LayoutInflater.from(this.mContext);
        int i2 = R.layout.taolive_replay_progress_bar_highlight;
        if (viewGroup == null) {
            viewGroup = playerControllerView;
        }
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(i2, viewGroup);
        pfo.a(this.mContext, k.a(this.mLiveDataModel), (FrameLayout) viewGroup2.findViewById(R.id.taolive_highlight_goods_entry), this.mFrameContext);
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = new com.taobao.taolive.sdk.ui.media.playercontrol.a();
        aVar.f21955a = viewGroup2.findViewById(R.id.taolive_video_bar);
        aVar.c = (ImageView) viewGroup2.findViewById(R.id.taolive_video_enter_btn);
        aVar.d = (TextView) viewGroup2.findViewById(R.id.taolive_video_total_view);
        aVar.e = (TextView) viewGroup2.findViewById(R.id.taolive_video_time_view);
        aVar.f = (SeekBar) viewGroup2.findViewById(R.id.taolive_video_seekbar);
        aVar.i = R.drawable.taolive_highlight_video_play;
        aVar.j = R.drawable.taolive_highlight_video_pause;
        aVar.h = (TextView) this.mFrontView.findViewById(R.id.taolive_controller_playrate_icon);
        if (!pmd.a().a("videoRate")) {
            aVar.h.setVisibility(8);
        } else {
            TextView textView = aVar.h;
            if (!u.af()) {
                i = 8;
            }
            textView.setVisibility(i);
        }
        o.a(this.mFrameContext, "Show-MultiSpeed", (HashMap<String, String>) null);
        return aVar;
    }

    private void showAccountInfo() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ea36c5", new Object[]{this});
        } else if (cgl.o() == null || (videoInfo = this.mLiveDetailData) == null || videoInfo.broadCaster == null || this.mLiveDetailData.roomType == 13) {
        } else {
            cgl.o().a(this.mContext, this.mLiveDetailData.broadCaster, false);
        }
    }

    public void setUpView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf59269", new Object[]{this});
            return;
        }
        VideoInfo a2 = k.a(this.mLiveDataModel);
        if (a2 == null || a2.broadCaster == null) {
            return;
        }
        this.mLiveDetailData = a2;
        initHighligtFrame(a2);
        initRoomWatermark(a2);
        initTopBar();
        initGoodListFrame();
        initAvatarCard();
        initSubscribeCard();
        initTBLiveXBackFrame(a2);
    }

    public void handleRoomCleanScreen(Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc47c15", new Object[]{this, obj});
            return;
        }
        this.isClearScreen = ((Boolean) obj).booleanValue();
        PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
        if (passEventViewPagerHighlight == null) {
            return;
        }
        if (this.isClearScreen) {
            i = 4;
        }
        passEventViewPagerHighlight.setVisibility(i);
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        View view = this.mFrontView;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.taolive_ubee_container_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return this.mFrontView.findViewById(R.id.taolive_ubee_container);
    }
}
