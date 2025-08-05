package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
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
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.PassEventViewPager;
import com.taobao.android.live.plugin.atype.flexalocal.ui.TimePlayToastFrame;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.r;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.d;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.cgl;
import tb.ddv;
import tb.ddw;
import tb.deb;
import tb.hgs;
import tb.hgt;
import tb.hkl;
import tb.kge;
import tb.nlh;
import tb.phg;
import tb.phq;
import tb.pmd;
import tb.pnj;
import tb.poy;
import tb.poz;
import tb.ppy;
import tb.ppz;
import tb.pqa;
import tb.pqi;
import tb.tqa;
import tb.xkw;

/* loaded from: classes5.dex */
public abstract class FullScreenFrame extends BaseFrame implements View.OnClickListener, com.taobao.taolive.sdk.model.a, ddv, ppy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_ACTION_GOTO_HOME = "com.taobao.taolive.room.goto.home";
    public static final String EVENT_ADD_TIPS_VIEW = "com.taobao.taolive.room.add_tips_view";
    public static final String EVENT_BACK_TO_LIVE = "com.taobao.taolive.room.backToLive";
    public static final String EVENT_CLICK_ROOT_VIEW_FOR_REPLAY = "com.taobao.taolive.room.click_root_view";
    public static final String EVENT_DISABLE_LEFTRIGHT_SWITCH = "com.taobao.taolive.room.disable_leftright_switch";
    public static final String EVENT_ENABLE_LEFTRIGHT_SWITCH = "com.taobao.taolive.room.enable_leftright_switch";
    public static final String EVENT_LINKLIVE_INIT = "com.taobao.taolive.room_linklive_init";
    public static final String EVENT_MEDIAPLATFORM_ADDFAVOR = "com.taolive.taolive.room.mediaplatform_addfavor";
    public static final String EVENT_MEDIAPLATFORM_SCREEN_FLIPPED = "com.taobao.taolive.room.mediaplatform_screen_flipped";
    public static final String EVENT_MEDIAPLATFORM_SHOW_SHAREPANEL = "com.taolive.taolive.room.mediaplatform_show_sharepanel";
    public static final String EVENT_PREVIEW_VIDEO_FULL_SCREEN = "com.taobao.taolive.room.preview_video_full_screen";
    public static final String EVENT_PREVIEW_VIDEO_NORMAL_SCREEN = "com.taobao.taolive.room.preview_video_normal_screen";
    public static final String EVENT_ROOT_VIEW_CLICK = "com.taobao.taolive.room.root_view_click";
    public static final String EVENT_SHOW_LOGO = "com.taobao.taolive.room.show_logo";
    public static final String EVENT_SHOW_SCREEN_RECORD_BTN_FRAME = "com.taobao.taolive.room.show_screen_record_btns_frame";
    public static final String EVENT_TAOLIVE_ROOM_CLEAR_SCREEN = "com.taobao.taolive.room.clean_screen";
    public static final String EVENT_TAOLIVE_ROOM_DOUBLE_CLICK_FAVOR_SHOW = "com.taolive.taolive.room.double_click_favor_show";
    public static final String EVENT_TOPBAR_CLICK_AVATAR = "com.taobao.taolive.room.topbar_click_avatar";
    public static final String EVENT_TYPE_UPDOWNSWITCH_INIT = "com.taobao.taolive.room.updownswitch.init";
    public static final int MESSAGE_INIT_GOODS_LIST = 2147483646;
    public static final int MESSAGE_INIT_PROJECT_SCREEN_ICON = 2147483645;
    public static final int MESSAGE_INIT_PROJECT_SCREEN_OPT = 2147483643;
    public static final int MESSAGE_INIT_PROJECT_SCREEN_SEARCH = 2147483644;
    private static final String TAG = "FullScreenFrame";
    public boolean isClearScreen;
    public View mAdView;
    public long mEnterClearScreenTime;
    public View mFrontView;
    public BaseFrame mInteractPanelFrame;
    public boolean mIsEnd;
    public boolean mIsSwipeClearScreen;
    public pqa mKeyboardLayout;
    public VideoInfo mLiveDetailData;
    public PassEventViewPager mViewPager;
    public View mViewPagerBackground;
    private List<Runnable> preInflateRunnables;
    public a simpleAdapter;
    public f weakHandler;
    public final Handler workerHandler;

    static {
        kge.a(171906442);
        kge.a(-1201612728);
        kge.a(191318335);
        kge.a(-1447204300);
        kge.a(-1905361424);
    }

    public static /* synthetic */ Object ipc$super(FullScreenFrame fullScreenFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1257959318) {
            super.onDidDisappear();
            return null;
        } else if (hashCode != -309961236) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCleanUp();
            return null;
        }
    }

    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
        }
    }

    public void initAdView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32af1f", new Object[]{this});
        }
    }

    public abstract void initAll();

    public void initBoottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8368573", new Object[]{this});
        }
    }

    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
        }
    }

    public void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        }
    }

    public void initCleanView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f992ae5", new Object[]{this});
        }
    }

    public void initDoubleClickFavView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320960", new Object[]{this});
        }
    }

    public void initFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f214e095", new Object[]{this});
        }
    }

    public void initGoodListFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0091789", new Object[]{this});
        }
    }

    public void initInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2455421", new Object[]{this});
        }
    }

    public void initInteractiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496cd19a", new Object[]{this});
        }
    }

    public void initNewBottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93123f08", new Object[]{this});
        }
    }

    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        }
    }

    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        }
    }

    public void initUserRecExp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eb0cf", new Object[]{this});
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public abstract void showByStatus();

    public static /* synthetic */ void access$000(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44675c", new Object[]{fullScreenFrame});
        } else {
            fullScreenFrame.initPrivateVipFrame();
        }
    }

    public static /* synthetic */ void access$100(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c0411d", new Object[]{fullScreenFrame});
        } else {
            fullScreenFrame.initTBLiveXBackFrameInner();
        }
    }

    public static /* synthetic */ void access$200(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593c1ade", new Object[]{fullScreenFrame});
        } else {
            fullScreenFrame.initBTypeOtherFrameInner();
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "FullScreenViewPre";

        /* renamed from: a  reason: collision with root package name */
        public static final ConcurrentHashMap<Integer, View> f13729a;

        static {
            kge.a(-1038241617);
            f13729a = new ConcurrentHashMap<>();
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            q.b(TAG, "清空缓存");
            f13729a.clear();
        }

        /* loaded from: classes5.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final String f13730a;
            private final int b;
            private final WeakReference<Context> c;

            static {
                kge.a(1024191434);
                kge.a(-1390502639);
            }

            public a(int i, Context context, String str) {
                this.b = i;
                this.c = new WeakReference<>(context);
                this.f13730a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                pnj m = pmd.a().m();
                m.a(b.TAG, "预inflate " + this.f13730a);
                Context context = this.c.get();
                if (context == null) {
                    return;
                }
                try {
                    b.f13729a.put(Integer.valueOf(this.b), LayoutInflater.from(context).cloneInContext(context).inflate(this.b, (ViewGroup) null));
                } catch (Throwable th) {
                    pnj m2 = pmd.a().m();
                    m2.a(b.TAG, "pre inflate error:" + th.toString());
                }
            }
        }
    }

    public FullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mIsSwipeClearScreen = false;
        this.workerHandler = new Handler(Coordinator.getWorkerLooper());
        this.isClearScreen = false;
        this.weakHandler = new f(this);
    }

    public boolean fromUpDownSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fb1746", new Object[]{this})).booleanValue();
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mInitParams != null) {
            return "updownswitch".equalsIgnoreCase(this.mLiveDataModel.mInitParams.get("livesource"));
        }
        return false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_frame_live_flexalocal);
            this.mContainer = viewStub.inflate();
            initAll();
        }
    }

    @Override // tb.ppy
    public void setBackView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84967d", new Object[]{this, view});
            return;
        }
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager == null) {
            return;
        }
        passEventViewPager.setBackView(view);
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mFrontView);
        this.simpleAdapter = new a(arrayList);
    }

    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
        } else if (poy.v(this.mFrameContext)) {
            final boolean aw = poy.aw(this.mFrameContext);
            this.mViewPager.setOnClearClickListener(new d.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.utils.d.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    q.b(FullScreenFrame.TAG, "mViewPager, onSingleClickListener: isNeedSingleClick: " + aw);
                    if (!aw) {
                        return;
                    }
                    ddw.a().a(FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, Boolean.valueOf(!FullScreenFrame.this.isClearScreen), FullScreenFrame.this.observeUniqueIdentification());
                }

                @Override // com.taobao.taolive.sdk.utils.d.b
                public void a(int i, PointF pointF) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d16f4e0c", new Object[]{this, new Integer(i), pointF});
                        return;
                    }
                    ddw.a().a("com.taolive.taolive.room.mediaplatform_addfavor", null, FullScreenFrame.this.mFrameContext.G());
                    ddw.a().a("com.taolive.taolive.room.double_click_favor_show", pointF, FullScreenFrame.this.mFrameContext.G());
                    if (phg.a() == null) {
                        return;
                    }
                    phg.a().a(FullScreenFrame.this.mFrameContext, "doublelike_CLK", new String[0]);
                }
            }, this.mLandscape);
        } else if (!poy.aw(this.mFrameContext)) {
        } else {
            this.mViewPager.setOnClearClickListener(new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.utils.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    q.b(FullScreenFrame.TAG, "mViewPager, onClickListener");
                    ddw.a().a(FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, Boolean.valueOf(!FullScreenFrame.this.isClearScreen), FullScreenFrame.this.observeUniqueIdentification());
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
        this.mViewPager = (PassEventViewPager) this.mContainer.findViewById(R.id.taolive_viewpager);
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager != null) {
            passEventViewPager.setFrameContext(this.mFrameContext);
        }
        this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background);
        initAdapter();
        this.mViewPager.setAdapter(this.simpleAdapter);
        this.mViewPager.setCurrentItem(0);
        this.simpleAdapter.notifyDataSetChanged();
        initClearScreen();
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                ddw a2 = ddw.a();
                if (i != 0) {
                    z = false;
                }
                a2.a(FullScreenFrame.EVENT_MEDIAPLATFORM_SCREEN_FLIPPED, Boolean.valueOf(z), FullScreenFrame.this.observeUniqueIdentification());
            }
        });
    }

    /* loaded from: classes5.dex */
    public class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayList<View> b;

        static {
            kge.a(1281508227);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public a(ArrayList<View> arrayList) {
            this.b = arrayList;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.b.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View view = this.b.get(i);
            if (view != null) {
                viewGroup.removeView(view);
                viewGroup.addView(view);
            }
            return view;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else {
                viewGroup.removeView((View) obj);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ArrayList<View> arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            arrayList.clear();
        }
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        initCleanView();
        initFrontView();
        initAdView();
        initViewPager();
    }

    public void initFrontView() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9072c5", new Object[]{this});
            return;
        }
        pnj m = pmd.a().m();
        if (this.mLandscape) {
            i = R.layout.taolive_video_content_land_flexalocal;
        } else {
            i = R.layout.taolive_video_content_new_flexalocal;
        }
        if (b.f13729a.containsKey(Integer.valueOf(i)) && this.mContext == b.f13729a.get(Integer.valueOf(i)).getContext()) {
            this.mFrontView = b.f13729a.remove(Integer.valueOf(i));
            m.a("FullScreenViewPreCache", "front View  使用预创建");
        } else {
            m.a("FullScreenViewPreCache", "没有缓存 inflate ");
            this.mFrontView = LayoutInflater.from(this.mContext).inflate(i, (ViewGroup) null);
        }
        this.mFrontView.setSoundEffectsEnabled(false);
        ArrayList<Integer> arrayList = new ArrayList();
        if (!b.f13729a.containsKey(Integer.valueOf(R.layout.taolive_video_content_land_flexalocal))) {
            arrayList.add(Integer.valueOf(R.layout.taolive_video_content_land_flexalocal));
        }
        if (!b.f13729a.containsKey(Integer.valueOf(R.layout.taolive_video_content_new_flexalocal))) {
            arrayList.add(Integer.valueOf(R.layout.taolive_video_content_new_flexalocal));
        }
        this.preInflateRunnables = new ArrayList();
        for (Integer num : arrayList) {
            Runnable convertResIdToRunnable = convertResIdToRunnable(num.intValue());
            this.preInflateRunnables.add(convertResIdToRunnable);
            this.workerHandler.postDelayed(convertResIdToRunnable, 2000L);
        }
    }

    private Runnable convertResIdToRunnable(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("1735e978", new Object[]{this, new Integer(i)}) : new b.a(i, this.mContext, String.valueOf(i));
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
        } else {
            r.a((Activity) this.mContext, (ResultReceiver) null);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        nlh.a().c(this.mFrameContext != null ? this.mFrameContext.j() : null);
        pqa pqaVar = this.mKeyboardLayout;
        if (pqaVar != null) {
            pqaVar.onDestory();
            this.mKeyboardLayout = null;
        }
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager != null) {
            passEventViewPager.setAdapter(null);
        }
        a aVar = this.simpleAdapter;
        if (aVar != null) {
            aVar.a();
            this.simpleAdapter = null;
        }
        clearComponents();
        f fVar = this.weakHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ddw.a().b(this);
        b.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        nlh.a().c(this.mFrameContext != null ? this.mFrameContext.j() : null);
        f fVar = this.weakHandler;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    public void initB2BConnectingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccd0e26", new Object[]{this});
        } else if (!hgs.k() || !pmd.a().a("link")) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-connect-mic", (View) ((ViewStub) this.mFrontView.findViewById(R.id.taolive_bbconecting_stub)));
        }
    }

    public FrameLayout getPlayerControllerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ebbada", new Object[]{this}) : (FrameLayout) this.mFrontView.findViewById(R.id.taolive_player_controller_layout);
    }

    public void initH5Container() {
        BaseFrame createH5DynamicSDKFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
            return;
        }
        ViewStub viewStub = (ViewStub) this.mFrontView.findViewById(R.id.taolive_h5_container_fullscreen_stub);
        if (viewStub == null || hkl.a().b() == null || (createH5DynamicSDKFrame = hkl.a().b().createH5DynamicSDKFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) == null) {
            return;
        }
        createH5DynamicSDKFrame.onCreateView(viewStub);
        addComponent(createH5DynamicSDKFrame);
    }

    public void initPrivateVip() {
        VideoInfo u;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d451", new Object[]{this});
        } else if (!hgs.f() || (u = poy.u(this.mFrameContext)) == null || u.accessInfo == null) {
        } else {
            if (u.accessInfo.access) {
                if (TextUtils.equals("PRIVATE", u.accessInfo.accessType)) {
                    format = "欢迎进入会员专属直播间";
                } else {
                    format = TextUtils.equals("VIP", u.accessInfo.accessType) ? String.format("欢迎%s\n进入您的专属直播间！", pmd.a().q().b()) : "";
                }
                if (TextUtils.isEmpty(format)) {
                    return;
                }
                hgt.b(this.mContext, format);
            } else if (c.a().d()) {
                initPrivateVipFrame();
            } else {
                c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            FullScreenFrame.access$000(FullScreenFrame.this);
                        }
                    }
                });
            }
        }
    }

    private void initPrivateVipFrame() {
        BaseFrame createPrivateVipFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cbcdca", new Object[]{this});
        } else if (com.taobao.android.live.plugin.proxy.f.p() == null || (createPrivateVipFrame = com.taobao.android.live.plugin.proxy.f.p().createPrivateVipFrame(this.mContext, this.mLandscape, this.mLiveDataModel, (ViewStub) this.mFrontView.findViewById(R.id.taolive_privatevip_container_stub))) == null) {
        } else {
            addComponent(createPrivateVipFrame);
        }
    }

    @Override // tb.ppy
    public Object getControllerHolder(ViewGroup viewGroup) {
        FrameLayout playerControllerView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("598b610e", new Object[]{this, viewGroup});
        }
        if (this.mFrontView == null || (playerControllerView = getPlayerControllerView()) == null) {
            return null;
        }
        playerControllerView.removeAllViews();
        playerControllerView.setVisibility(0);
        LayoutInflater from = LayoutInflater.from(this.mContext);
        int i2 = R.layout.taolive_replay_progress_bar_flexalocal;
        if (viewGroup == null) {
            viewGroup = playerControllerView;
        }
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(i2, viewGroup);
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = new com.taobao.taolive.sdk.ui.media.playercontrol.a();
        aVar.f21955a = viewGroup2.findViewById(R.id.taolive_video_bar);
        aVar.c = (ImageView) viewGroup2.findViewById(R.id.taolive_video_enter_btn);
        aVar.d = (TextView) viewGroup2.findViewById(R.id.taolive_video_total_view);
        aVar.e = (TextView) viewGroup2.findViewById(R.id.taolive_video_time_view);
        aVar.f = (SeekBar) viewGroup2.findViewById(R.id.taolive_video_seekbar);
        aVar.i = R.drawable.taolive_video_play;
        aVar.j = R.drawable.taolive_video_pause;
        aVar.h = (TextView) this.mFrontView.findViewById(R.id.taolive_controller_playrate_icon);
        if (!pmd.a().a("videoRate")) {
            aVar.h.setVisibility(8);
        } else {
            TextView textView = aVar.h;
            if (!hgs.l()) {
                i = 8;
            }
            textView.setVisibility(i);
        }
        if (phg.a() != null) {
            phg.a().a(this.mFrameContext, "Show-MultiSpeed", (HashMap<String, String>) null);
        }
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
        nlh.a().a(this.mContext, this.mFrameContext);
        VideoInfo a2 = k.a(this.mLiveDataModel);
        if (a2 == null || a2.broadCaster == null) {
            return;
        }
        this.mLiveDetailData = a2;
        initTopBar();
        initBottomBar();
        initBoottomGuide();
        initNewBottomGuide();
        initRoomWatermark(a2);
        initTBLiveXBackFrame();
        if (com.taobao.android.live.plugin.atype.flexalocal.fullscreen.a.a()) {
            initGoodsListFrameAsync();
        } else {
            initGoodListFrame();
        }
        showByStatus();
        initMediaPlatform();
        if (!enableWarmMockHideH5() && !poy.am(this.mFrameContext)) {
            initH5Container();
        }
        initTimePlayToast();
        initInteractPanel(null);
        initPrivateVip();
        initInteractiveRightComponent();
        initUserTask();
        initRank();
    }

    private boolean enableWarmMockHideH5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e289cac", new Object[]{this})).booleanValue() : u.bb() == 2 || u.bb() == 6;
    }

    private void initGoodsListFrameAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b23e51a", new Object[]{this});
            return;
        }
        this.mFrontView.requestLayout();
        Message obtain = Message.obtain(this.weakHandler);
        obtain.what = MESSAGE_INIT_GOODS_LIST;
        if (Build.VERSION.SDK_INT >= 22) {
            obtain.setAsynchronous(false);
        }
        this.weakHandler.sendMessage(obtain);
    }

    private void initUserTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf365a7", new Object[]{this});
            return;
        }
        FloatingUserTaskFrame floatingUserTaskFrame = new FloatingUserTaskFrame(this.mContext, this.mFrameContext);
        floatingUserTaskFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_user_task));
        floatingUserTaskFrame.setIUserTaskEventListener(new com.taobao.android.live.plugin.atype.flexalocal.usertask.c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.c
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    ddw.a().a(str, str2, FullScreenFrame.this.observeUniqueIdentification());
                }
            }
        });
        addComponent(floatingUserTaskFrame);
    }

    public void initTBLiveXBackFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584204df", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity o = this.mFrameContext.o();
        if (o != null && o.abilityCompontent != null && !o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips)) {
            return;
        }
        if (v.e(pmd.a().d().a("tblive_x_back", "XBackEnable", "true"))) {
            if (!hgs.g()) {
                return;
            }
            if (c.a().d()) {
                initTBLiveXBackFrameInner();
            } else {
                c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            FullScreenFrame.access$100(FullScreenFrame.this);
                        }
                    }
                });
            }
        } else if (!hgs.g() || !poy.i(this.mFrameContext) || TextUtils.isEmpty(poy.j(this.mFrameContext))) {
        } else {
            if (c.a().d()) {
                initTBLiveXBackFrameInner();
            } else {
                c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            FullScreenFrame.access$100(FullScreenFrame.this);
                        }
                    }
                });
            }
        }
    }

    private void initTBLiveXBackFrameInner() {
        BaseFrame createRightBackwardTipsFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db5ce65", new Object[]{this});
        } else if (com.taobao.android.live.plugin.proxy.f.p() == null || (createRightBackwardTipsFrame = com.taobao.android.live.plugin.proxy.f.p().createRightBackwardTipsFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) == null) {
        } else {
            createRightBackwardTipsFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_right_mid_tips_stub));
            addComponent(createRightBackwardTipsFrame);
        }
    }

    public void initTimePlayToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0bcd5d", new Object[]{this});
            return;
        }
        TimePlayToastFrame timePlayToastFrame = new TimePlayToastFrame(this.mContext, this.mLandscape, this.mFrameContext);
        timePlayToastFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_time_play_bottom_toast));
        addComponent(timePlayToastFrame);
    }

    public void initMediaPlatform() {
        BaseFrame createMediaPlatformFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else if (hkl.a().b() == null || (createMediaPlatformFrame = hkl.a().b().createMediaPlatformFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) == null) {
        } else {
            createMediaPlatformFrame.onCreateView(null);
            addComponent(createMediaPlatformFrame);
        }
    }

    public void initInteractPanel(final deb debVar) {
        ViewGroup viewGroup;
        final View a2;
        View j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f624f594", new Object[]{this, debVar});
        } else if (this.mInteractPanelFrame != null) {
        } else {
            ATaoLiveOpenEntity taoliveOpenLiveRoomEntity = hkl.a().b() != null ? hkl.a().b().getTaoliveOpenLiveRoomEntity(this.mFrameContext) : null;
            ViewGroup viewGroup2 = (taoliveOpenLiveRoomEntity == null || taoliveOpenLiveRoomEntity.uiCompontent == null || taoliveOpenLiveRoomEntity.uiCompontent.a() == null || (j = taoliveOpenLiveRoomEntity.uiCompontent.a().j()) == null) ? null : (ViewGroup) j.findViewById(hkl.a().a(IRRoomProxy.R_ID_TAOLIVE_OPEN_INTERACT_PANEL_FRAME));
            if (viewGroup2 != null) {
                View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_interact_container_flexalocal, (ViewGroup) null);
                viewGroup = (ViewGroup) inflate.findViewById(R.id.taolive_interact_list_container);
                a2 = inflate.findViewById(R.id.taolive_interact_cover);
                viewGroup2.addView(inflate);
            } else {
                viewGroup = (ViewGroup) k.a(this.mContext, R.id.taolive_interact_list_container);
                a2 = k.a(this.mContext, R.id.taolive_interact_cover);
                if (hgs.b()) {
                    viewGroup = (ViewGroup) this.mContainer.findViewById(R.id.taolive_interact_list_container);
                    a2 = this.mContainer.findViewById(R.id.taolive_interact_cover);
                }
            }
            this.mFrameContext.k().a(this, "tl-interact-panel", viewGroup, new deb() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.deb, tb.dec
                public void a(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d2b08e2", new Object[]{this, baseFrame});
                        return;
                    }
                    FullScreenFrame.this.mInteractPanelFrame = baseFrame;
                    if (baseFrame instanceof ppz) {
                        ((ppz) baseFrame).setCoverView(a2);
                    }
                    deb debVar2 = debVar;
                    if (debVar2 == null) {
                        return;
                    }
                    debVar2.a(baseFrame);
                }

                @Override // tb.deb, tb.dec
                public void b(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba182001", new Object[]{this, baseFrame});
                        return;
                    }
                    deb debVar2 = debVar;
                    if (debVar2 == null) {
                        return;
                    }
                    debVar2.b(baseFrame);
                }
            });
        }
    }

    private void showInitInteractPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4892d4c8", new Object[]{this});
            return;
        }
        if (phg.a() != null) {
            phg.a().a(this.mFrameContext, "morefunction", new String[0]);
        }
        if (this.mFrameContext != null && this.mFrameContext.o() != null) {
            this.mFrameContext.o().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
        BaseFrame baseFrame = this.mInteractPanelFrame;
        if (baseFrame != null) {
            baseFrame.show();
        } else {
            initInteractPanel(new deb() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass10 anonymousClass10, String str, Object... objArr) {
                    if (str.hashCode() == -1172824063) {
                        super.b((BaseFrame) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.deb, tb.dec
                public void b(BaseFrame baseFrame2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba182001", new Object[]{this, baseFrame2});
                        return;
                    }
                    super.b(baseFrame2);
                    FullScreenFrame.this.mInteractPanelFrame.show();
                }
            });
        }
    }

    public void initRank() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964e93e3", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_REWARD_RANK, this.mFrameContext) || !hgs.m()) {
        } else {
            ViewStub viewStub = (ViewStub) findViewById(R.id.taolive_rank_stub);
            if (viewStub == null && (view = this.mFrontView) != null) {
                viewStub = (ViewStub) view.findViewById(R.id.taolive_rank_stub);
            }
            this.mFrameContext.k().a((BaseFrame) this, "tl-rank", viewStub);
        }
    }

    public void initBTypeOtherFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1f40f0", new Object[]{this});
            return;
        }
        try {
            if (c.a().d()) {
                initBTypeOtherFrameInner();
            } else {
                c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        try {
                            FullScreenFrame.access$200(FullScreenFrame.this);
                        } catch (Throwable th) {
                            e.c("[FullScreenFrame#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            e.c("[FullScreenFrame#initBTypeOtherFrame]  error: " + th.getMessage());
        }
    }

    private void initBTypeOtherFrameInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc074f4", new Object[]{this});
        } else if (com.taobao.android.live.plugin.proxy.f.p() == null) {
        } else {
            com.taobao.android.live.plugin.proxy.f.p().initBTypeOtherFrame(this, this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
            e.c("[FullScreenFrame#initBTypeOtherFrameInner] success");
        }
    }

    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        int a2 = hkl.a().a(IRRoomProxy.R_ID_TAOLIVE_CLOSE_BTN);
        if (EVENT_PREVIEW_VIDEO_NORMAL_SCREEN.equals(str)) {
            if (this.mContainer.findViewById(a2) == null) {
                return;
            }
            this.mContainer.findViewById(a2).setVisibility(0);
        } else if (EVENT_PREVIEW_VIDEO_FULL_SCREEN.equals(str)) {
            if (this.mContainer.findViewById(a2) == null) {
                return;
            }
            this.mContainer.findViewById(a2).setVisibility(8);
        } else if (EVENT_TOPBAR_CLICK_AVATAR.equals(str)) {
            try {
                showAccountInfo();
            } catch (Exception unused) {
            }
        } else if (EVENT_SHOW_SCREEN_RECORD_BTN_FRAME.equals(str)) {
            showInitInteractPanel();
        } else if (EVENT_ENABLE_LEFTRIGHT_SWITCH.equals(str)) {
            PassEventViewPager passEventViewPager = this.mViewPager;
            if (passEventViewPager == null) {
                return;
            }
            passEventViewPager.setCanScroll(true);
        } else if (EVENT_DISABLE_LEFTRIGHT_SWITCH.equals(str)) {
            PassEventViewPager passEventViewPager2 = this.mViewPager;
            if (passEventViewPager2 == null) {
                return;
            }
            passEventViewPager2.setCanScroll(false);
        } else if (TextUtils.equals(str, EVENT_TAOLIVE_ROOM_CLEAR_SCREEN)) {
            this.isClearScreen = ((Boolean) obj).booleanValue();
            PassEventViewPager passEventViewPager3 = this.mViewPager;
            if (this.isClearScreen) {
                i = 4;
            }
            passEventViewPager3.setVisibility(i);
            if (this.isClearScreen) {
                this.mEnterClearScreenTime = SystemClock.elapsedRealtime();
                trackEnterClearScreen();
                return;
            }
            trackLeaveClearScreen();
        } else if (!xkw.EVENT_SHOW_QA.equals(str) || !(obj instanceof String)) {
        } else {
            showQAH5(obj.toString());
        }
    }

    public void trackEnterClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a3bd13", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("interact_type", this.mIsSwipeClearScreen ? "slide" : "click");
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.mFrameContext, "clear_screen_enter", hashMap);
    }

    public void trackLeaveClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931edb54", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.mEnterClearScreenTime));
        hashMap.put("interact_type", this.mIsSwipeClearScreen ? "slide" : "click");
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.mFrameContext, "clear_screen_leave", hashMap);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.isClearScreen) {
            trackLeaveClearScreen();
        }
        if (this.mFrameContext != null && this.mFrameContext.a() != null) {
            this.mFrameContext.a().clear();
        }
        List<Runnable> list = this.preInflateRunnables;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            this.workerHandler.removeCallbacks(runnable);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{EVENT_PREVIEW_VIDEO_NORMAL_SCREEN, EVENT_PREVIEW_VIDEO_FULL_SCREEN, xkw.EVENT_LINKLIVE_START, xkw.EVENT_LINKLIVE_STOP, EVENT_SHOW_LOGO, EVENT_TOPBAR_CLICK_AVATAR, EVENT_SHOW_SCREEN_RECORD_BTN_FRAME, EVENT_BACK_TO_LIVE, EVENT_ADD_TIPS_VIEW, EVENT_ROOT_VIEW_CLICK, EVENT_ENABLE_LEFTRIGHT_SWITCH, EVENT_DISABLE_LEFTRIGHT_SWITCH, EVENT_LINKLIVE_INIT, EVENT_MEDIAPLATFORM_SHOW_SHAREPANEL, EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, "com.taobao.taolive.room.ubee_for_morelive", xkw.EVENT_SHOW_QA, xkw.EVENT_CLEAR_SCREEN_NEW, "com.taobao.taolive.room.init_sab_atmosphere", tqa.EVENT_DISMISS_SAB_ATMOSHPERE, xkw.EVENT_CHANGE_CONTAINER_OFFSET, xkw.EVENT_CAN_SHOW_POP_LAYER, "com.taobao.taolive.room.hot_item_subscribe_success", xkw.c, xkw.d, xkw.f34361a, xkw.EVENT_CLEAR_SCREEN_IMMERSIVE, xkw.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER};
    }

    @Override // tb.ppy
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

    private void showQAH5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eede68b", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (hkl.a().b() != null && hkl.a().b().platformUtilsShouldOpenOnce("true", str)) {
                return;
            }
            HashMap hashMap = new HashMap();
            float g = com.taobao.taolive.room.utils.d.g() * hgs.n();
            hashMap.put("x", "0");
            hashMap.put("y", String.valueOf(com.taobao.taolive.room.utils.d.a((com.taobao.taolive.room.utils.d.g() - com.taobao.taolive.room.utils.d.g(this.mContext)) - g)));
            hashMap.put("width", String.valueOf(-1));
            hashMap.put("height", String.valueOf(com.taobao.taolive.room.utils.d.a(g)));
            hashMap.put("modal", "true");
            hashMap.put("exitAnimation", "1");
            hashMap.put("enterAnimation", "1");
            hashMap.put("bizData", "showQAH5");
            pqi.a().a("alive_interactive_count_action", "showQAH5_addContainer", 1.0d);
            if (!(this.mFrameContext instanceof phq) || ((phq) this.mFrameContext).p() == null) {
                return;
            }
            ((phq) this.mFrameContext).p().b(poz.a(this.mContext, n.b(this.mFrameContext)), str, hashMap);
        }
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 2147483646) {
        } else {
            pmd.a().m().a(TAG, "initGoodsListFrame");
            initGoodListFrame();
        }
    }
}
