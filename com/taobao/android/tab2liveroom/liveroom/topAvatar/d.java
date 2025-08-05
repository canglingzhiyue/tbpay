package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.d;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ohd;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LiveSecondRefreshManager";

    /* renamed from: a */
    private Context f15316a;
    private int b;
    private CustomSwipeRefreshLayout c;
    private a d;
    private final Handler e;
    private LinearLayout f;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(String str);

        void a(String str, Object obj);

        void b();

        void b(View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom);

        void c();

        void d(boolean z);

        void e(boolean z);

        void f(boolean z);
    }

    static {
        kge.a(69246595);
    }

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff88d03", new Object[]{view, motionEvent})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void lambda$wyUTMVE5Ytrwl8cCQp7LhCsyxMU(d dVar) {
        dVar.f();
    }

    public /* synthetic */ d(b bVar, AnonymousClass1 anonymousClass1) {
        this(bVar);
    }

    public static /* synthetic */ Handler a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("50f78d62", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ a b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b46cf230", new Object[]{dVar}) : dVar.d;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f88dc20d", new Object[]{this}) : this.d;
    }

    private d(b bVar) {
        this.e = new Handler(Looper.getMainLooper());
        this.f15316a = bVar.f15318a;
        this.b = (int) bVar.f;
        a(bVar.d);
        a(this.f15316a, bVar.b, bVar.c);
        if (!com.taobao.android.tab2liveroom.liveroom.topAvatar.b.a(bVar.g, bVar.h, bVar.i) || this.f15316a == null) {
            return;
        }
        this.d = new com.taobao.android.tab2liveroom.liveroom.topAvatar.b(bVar.a(this));
    }

    public void a(Context context, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9dedd3", new Object[]{this, context, viewGroup, view});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            this.c = new CustomSwipeRefreshLayout(context, view, a(context), this.b);
        } else {
            customSwipeRefreshLayout.setTarget(view);
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.-$$Lambda$d$wyUTMVE5Ytrwl8cCQp7LhCsyxMU
            {
                d.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.lambda$wyUTMVE5Ytrwl8cCQp7LhCsyxMU(d.this);
            }
        });
        viewGroup.removeView(view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.b + ohd.b(context, 10);
        viewGroup.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(this.c.getSecondView(), layoutParams);
        this.c.setSecondStageState(false);
        this.c.addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.c.bringFirstView2Front();
    }

    public /* synthetic */ void f() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.d == null || (customSwipeRefreshLayout = this.c) == null || !customSwipeRefreshLayout.isFirstStageShowing()) {
        } else {
            this.d.b();
        }
    }

    public void a(ViewGroup viewGroup, View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b984e571", new Object[]{this, viewGroup, view, taoliveOpenLiveRoom});
            return;
        }
        a(taoliveOpenLiveRoom);
        a(this.f15316a, viewGroup, view);
        this.d.b(view, taoliveOpenLiveRoom);
    }

    private void a(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cbf4", new Object[]{this, taoliveOpenLiveRoom});
        } else {
            ((RecyclerView) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getRecyclerView, new Object[0])).setTag(CustomSwipeRefreshLayout.getRecyclerViewTagId(), true);
        }
    }

    private ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        if (!oeb.cF()) {
            return new LinearLayout(context);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = new LinearLayout(context);
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f.setOrientation(1);
        TNodeImageView tNodeImageView = new TNodeImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ohd.b(context, 70), ohd.b(context, 40));
        layoutParams.gravity = 1;
        tNodeImageView.setLayoutParams(layoutParams);
        tNodeImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01WSPJcG1N8Uxrvceno_!!6000000001525-2-tps-140-81.png");
        this.f.addView(tNodeImageView);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = ohd.b(context, 11);
        layoutParams2.leftMargin = ohd.b(context, 10);
        layoutParams2.rightMargin = ohd.b(context, 10);
        layoutParams2.bottomMargin = ohd.b(context, 10);
        textView.setLayoutParams(layoutParams2);
        textView.setText("暂时没有直播中的\n关注主播");
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setGravity(1);
        this.f.addView(textView);
        linearLayout.addView(this.f);
        this.f.setOnTouchListener($$Lambda$d$zF_UFdlOTweNcmrQAiq3_slVZAo.INSTANCE);
        return linearLayout;
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316a1660", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return;
        }
        customSwipeRefreshLayout.setOnRefreshListener(new AnonymousClass1(aVar, i));
    }

    /* renamed from: com.taobao.android.tab2liveroom.liveroom.topAvatar.d$1 */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 implements CustomSwipeRefreshLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a b;
        public final /* synthetic */ int c;

        /* renamed from: lambda$aRIveX5JFZ-ZWdNA8T9eME_x7rg */
        public static /* synthetic */ void m1024lambda$aRIveX5JFZZWdNA8T9eME_x7rg(AnonymousClass1 anonymousClass1, com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a aVar) {
            anonymousClass1.a(aVar);
        }

        public AnonymousClass1(com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a aVar, int i) {
            d.this = r1;
            this.b = aVar;
            this.c = i;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.b.a();
            if (this.c <= 0) {
                return;
            }
            d.a(d.this).removeCallbacksAndMessages(null);
            Handler a2 = d.a(d.this);
            final com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a aVar = this.b;
            a2.postDelayed(new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.-$$Lambda$d$1$aRIveX5JFZ-ZWdNA8T9eME_x7rg
                @Override // java.lang.Runnable
                public final void run() {
                    d.AnonymousClass1.m1024lambda$aRIveX5JFZZWdNA8T9eME_x7rg(d.AnonymousClass1.this, aVar);
                }
            }, this.c);
        }

        public /* synthetic */ void a(com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f955fd03", new Object[]{this, aVar});
            } else {
                d.this.a(aVar);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout.a
        public void a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (d.b(d.this) == null) {
            } else {
                if (z) {
                    d.b(d.this).e(z2);
                } else {
                    d.b(d.this).f(z2);
                }
            }
        }
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f955fd03", new Object[]{this, aVar});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setRefreshing(false);
        }
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return;
        }
        customSwipeRefreshLayout.setFirstStageView(view, z);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return;
        }
        customSwipeRefreshLayout.showFirstStageWhenStart();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return;
        }
        customSwipeRefreshLayout.closeFirstStageView();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return false;
        }
        return customSwipeRefreshLayout.isFirstStageShowing();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return;
        }
        customSwipeRefreshLayout.setEnableFirstStage(z);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.c;
        if (customSwipeRefreshLayout == null) {
            return;
        }
        customSwipeRefreshLayout.setFirstBlankView(this.f);
    }

    public CustomSwipeRefreshLayout e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomSwipeRefreshLayout) ipChange.ipc$dispatch("64517f54", new Object[]{this}) : this.c;
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        if (a() != null) {
            a().d(false);
            if (videoInfo != null && videoInfo.broadCaster != null) {
                a().a(videoInfo.broadCaster.accountId);
            }
        }
        a((com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.a) null);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(str, obj);
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Context f15318a;
        public ViewGroup b;
        public View c;
        public TaoliveOpenLiveRoom d;
        public com.taobao.android.tab2liveroom.liveroom.a e;
        public float f;
        public String g;
        public String h;
        public boolean i;
        public Map j;
        public d k;

        static {
            kge.a(-201026552);
        }

        public b a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f0733334", new Object[]{this, context});
            }
            this.f15318a = context;
            return this;
        }

        public b a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("52ddb30d", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public b a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("84b10ea", new Object[]{this, view});
            }
            this.c = view;
            return this;
        }

        public b a(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c95ad520", new Object[]{this, taoliveOpenLiveRoom});
            }
            this.d = taoliveOpenLiveRoom;
            return this;
        }

        public b a(com.taobao.android.tab2liveroom.liveroom.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("db46e2ae", new Object[]{this, aVar});
            }
            this.e = aVar;
            return this;
        }

        public b a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8be3f83c", new Object[]{this, new Float(f)});
            }
            this.f = f;
            return this;
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5426722", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1e43b8c1", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8e69c6a8", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public b a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f6eb14d7", new Object[]{this, map});
            }
            this.j = map;
            return this;
        }

        public b a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f8c3c430", new Object[]{this, dVar});
            }
            this.k = dVar;
            return this;
        }

        public d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("369a1eea", new Object[]{this}) : new d(this, null);
        }
    }
}
