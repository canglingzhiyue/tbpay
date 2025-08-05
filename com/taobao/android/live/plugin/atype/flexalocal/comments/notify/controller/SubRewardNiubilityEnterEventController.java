package com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller;

import android.animation.ValueAnimator;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.ConstraintLayout;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.taolive.room.adapter.alphavideo.VideoGiftView;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bxg;
import tb.fpr;
import tb.hfm;
import tb.jbr;
import tb.kge;
import tb.phq;
import tb.sad;

/* loaded from: classes5.dex */
public class SubRewardNiubilityEnterEventController implements c, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final b f13688a;
    private CopyOnWriteArrayList<NiubilityEnterEntity> b;
    private final com.taobao.alilive.aliliveframework.frame.a c;
    private final ConstraintLayout d;
    private final FrameLayout e;
    private VideoGiftView f;
    private AliUrlImageView g;
    private TextView h;
    private String i = null;
    private bxg j = null;
    private final Handler k = new Handler(Looper.getMainLooper());
    private final a l = new a();

    /* loaded from: classes5.dex */
    public static class NiubilityEnterEntity implements INetDataObject {
        public String animationMp4;
        public int moveToY;
        public String userHeadImage;
        public String userName;

        static {
            kge.a(-565635794);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public long f13695a = sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS;
        public long b = 2000;
        public long c = 800;

        static {
            kge.a(-1025119493);
        }
    }

    static {
        kge.a(-2092789106);
        kge.a(-69219860);
        kge.a(-2101054629);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 11;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e9b848", new Object[]{subRewardNiubilityEnterEventController, new Float(f)})).intValue() : subRewardNiubilityEnterEventController.a(f);
    }

    public static /* synthetic */ String a(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66617b35", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.i;
    }

    public static /* synthetic */ void a(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController, NiubilityEnterEntity niubilityEnterEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f4718c", new Object[]{subRewardNiubilityEnterEventController, niubilityEnterEntity});
        } else {
            subRewardNiubilityEnterEventController.b(niubilityEnterEntity);
        }
    }

    public static /* synthetic */ void b(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7fa3aa", new Object[]{subRewardNiubilityEnterEventController});
        } else {
            subRewardNiubilityEnterEventController.h();
        }
    }

    public static /* synthetic */ AliUrlImageView c(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("86a9e82b", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.g;
    }

    public static /* synthetic */ TextView d(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c3cc49dc", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.h;
    }

    public static /* synthetic */ a e(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ed5a658d", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.l;
    }

    public static /* synthetic */ Handler f(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("6bca11e0", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.k;
    }

    public static /* synthetic */ void g(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97aeea05", new Object[]{subRewardNiubilityEnterEventController});
        } else {
            subRewardNiubilityEnterEventController.i();
        }
    }

    public static /* synthetic */ b h(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("38f5424a", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.f13688a;
    }

    public static /* synthetic */ ConstraintLayout i(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConstraintLayout) ipChange.ipc$dispatch("679e95fb", new Object[]{subRewardNiubilityEnterEventController}) : subRewardNiubilityEnterEventController.d;
    }

    public static /* synthetic */ void j(SubRewardNiubilityEnterEventController subRewardNiubilityEnterEventController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5fe7aa2", new Object[]{subRewardNiubilityEnterEventController});
        } else {
            subRewardNiubilityEnterEventController.j();
        }
    }

    public SubRewardNiubilityEnterEventController(b bVar, phq phqVar, boolean z) {
        this.f13688a = bVar;
        this.c = phqVar;
        this.d = (ConstraintLayout) bVar.e().findViewById(R.id.fl_important_reward_enter);
        this.e = (FrameLayout) bVar.e().findViewById(R.id.fl_important_reward_enter_player);
        this.g = (AliUrlImageView) bVar.e().findViewById(R.id.fl_important_reward_enter_avatar);
        this.h = (TextView) bVar.e().findViewById(R.id.fl_important_reward_enter_name);
        this.d.getLayoutParams().width = a(750.0f);
        this.d.getLayoutParams().height = a(88.0f);
        this.d.setVisibility(8);
        int a2 = a(52.0f);
        this.g.getLayoutParams().width = a2;
        this.g.getLayoutParams().height = a2;
        this.g.setRoundeCornerView(a2, a2, a2 / 2, 0, 0);
        ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).leftMargin = a(24.0f);
        ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).topMargin = a(18.0f);
        this.h.getLayoutParams().width = a(184.0f);
        ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).leftMargin = a(4.0f);
        this.h.setTextSize(0, a(26.0f));
        this.h.setPadding(a(12.0f), 0, a(12.0f), 0);
    }

    private int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue() : Math.round((f / 750.0f) * fpr.a(this.e.getContext()));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void a() {
        b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = new CopyOnWriteArrayList<>();
        if (!g() || (bVar = this.f13688a) == null) {
            return;
        }
        boolean z2 = bVar.c() != null;
        if (this.f13688a.c().f() != null) {
            z = true;
        }
        if (!z2 || !z) {
            return;
        }
        this.f13688a.c().f().registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                SubRewardNiubilityEnterEventController.this = this;
            }

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 6002;
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b.size() > 0) {
            this.b.size();
            this.b.remove(0);
            a(this.b.get(0));
        } else {
            this.f13688a.b();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        CopyOnWriteArrayList<NiubilityEnterEntity> copyOnWriteArrayList = this.b;
        return copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        CopyOnWriteArrayList<NiubilityEnterEntity> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.f13688a.c().f().unRegisterMessageListener(this);
        this.k.removeCallbacksAndMessages(null);
        j();
        ConstraintLayout constraintLayout = this.d;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 6002 || this.c.b) {
        } else {
            this.b.add((NiubilityEnterEntity) JSONObject.parseObject((String) obj).getObject("msgData", NiubilityEnterEntity.class));
            this.f13688a.a();
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(hfm.TBLIVE_REWARD_ORANGE_GROUP, "isCanShowRewardNiubilityEnterView", "true"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void a(final NiubilityEnterEntity niubilityEnterEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1af5829", new Object[]{this, niubilityEnterEntity});
        } else if (com.taobao.android.live.plugin.proxy.c.a().e() == null || com.taobao.android.live.plugin.proxy.c.a().e().get(IGiftProxy.KEY) == null) {
            this.f13688a.b();
            m.e("SubReward", "downloadVideoGift getIGiftProxy is null.");
        } else {
            bxg createResourceDownloaderManager = f.x().createResourceDownloaderManager();
            if (createResourceDownloaderManager == null) {
                m.e("SubReward", "downloadVideoGift giftDownloader is null.");
                return;
            }
            this.j = createResourceDownloaderManager;
            this.i = niubilityEnterEntity.animationMp4;
            createResourceDownloaderManager.a(this.d.getContext(), 20000000L, new jbr() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a */
                public final String f13690a;

                @Override // tb.jbr
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    }
                }

                {
                    SubRewardNiubilityEnterEventController.this = this;
                    this.f13690a = niubilityEnterEntity.animationMp4;
                }

                @Override // tb.jbr
                public void b(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                        return;
                    }
                    if (TextUtils.equals(SubRewardNiubilityEnterEventController.a(SubRewardNiubilityEnterEventController.this), this.f13690a)) {
                        SubRewardNiubilityEnterEventController.a(SubRewardNiubilityEnterEventController.this, niubilityEnterEntity);
                    }
                    SubRewardNiubilityEnterEventController.b(SubRewardNiubilityEnterEventController.this);
                }

                @Override // tb.jbr
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    if (TextUtils.equals(SubRewardNiubilityEnterEventController.a(SubRewardNiubilityEnterEventController.this), this.f13690a)) {
                        SubRewardNiubilityEnterEventController.a(SubRewardNiubilityEnterEventController.this, niubilityEnterEntity);
                    }
                    SubRewardNiubilityEnterEventController.b(SubRewardNiubilityEnterEventController.this);
                }

                @Override // tb.jbr
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else {
                        SubRewardNiubilityEnterEventController.b(SubRewardNiubilityEnterEventController.this);
                    }
                }
            });
            createResourceDownloaderManager.a(niubilityEnterEntity.animationMp4, null);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.j = null;
        this.i = null;
    }

    private void b(NiubilityEnterEntity niubilityEnterEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd094eaa", new Object[]{this, niubilityEnterEntity});
            return;
        }
        this.d.setVisibility(0);
        this.f = new VideoGiftView(this.d.getContext());
        this.g.setImageUrl(null);
        this.h.setText((CharSequence) null);
        this.h.setAlpha(1.0f);
        this.h.setTranslationX(0.0f);
        this.e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        this.f.initPlayerController(this.d.getContext(), (LifecycleOwner) this.d.getContext());
        this.f.addObserver(new AnonymousClass3(niubilityEnterEntity));
        this.f.attachView();
        TBLiveGiftEntity tBLiveGiftEntity = new TBLiveGiftEntity();
        tBLiveGiftEntity.mAnimationMp4 = niubilityEnterEntity.animationMp4;
        this.f.startVideoGift(tBLiveGiftEntity);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f13688a.f().getContext(), R.anim.taolive_certification_in_flexalocal);
        this.d.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            {
                SubRewardNiubilityEnterEventController.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    SubRewardNiubilityEnterEventController.i(SubRewardNiubilityEnterEventController.this).startAnimation(AnimationUtils.loadAnimation(SubRewardNiubilityEnterEventController.h(SubRewardNiubilityEnterEventController.this).f().getContext(), R.anim.taolive_certification_in2_flexalocal));
                }
            }
        });
    }

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController$3 */
    /* loaded from: classes5.dex */
    public class AnonymousClass3 implements com.taobao.android.tblive.gift.biggift.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ NiubilityEnterEntity f13691a;

        public static /* synthetic */ void lambda$yV6Vkb8VccnCQK2fU6SVjcnGltY(AnonymousClass3 anonymousClass3) {
            anonymousClass3.a();
        }

        @Override // com.taobao.android.tblive.gift.biggift.a
        public void b(TBLiveGiftEntity tBLiveGiftEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3260b1e8", new Object[]{this, tBLiveGiftEntity});
            }
        }

        public AnonymousClass3(NiubilityEnterEntity niubilityEnterEntity) {
            SubRewardNiubilityEnterEventController.this = r1;
            this.f13691a = niubilityEnterEntity;
        }

        @Override // com.taobao.android.tblive.gift.biggift.a
        public void a(TBLiveGiftEntity tBLiveGiftEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c5ce689", new Object[]{this, tBLiveGiftEntity});
                return;
            }
            SubRewardNiubilityEnterEventController.c(SubRewardNiubilityEnterEventController.this).setImageUrl(this.f13691a.userHeadImage);
            SubRewardNiubilityEnterEventController.d(SubRewardNiubilityEnterEventController.this).setText(this.f13691a.userName);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(SubRewardNiubilityEnterEventController.a(SubRewardNiubilityEnterEventController.this, (float) (this.f13691a.moveToY - 31)), SubRewardNiubilityEnterEventController.a(SubRewardNiubilityEnterEventController.this, this.f13691a.moveToY));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    AnonymousClass3.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    SubRewardNiubilityEnterEventController.d(SubRewardNiubilityEnterEventController.this).setAlpha(valueAnimator.getAnimatedFraction());
                    SubRewardNiubilityEnterEventController.d(SubRewardNiubilityEnterEventController.this).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat.setDuration(SubRewardNiubilityEnterEventController.e(SubRewardNiubilityEnterEventController.this).c);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setStartDelay(SubRewardNiubilityEnterEventController.e(SubRewardNiubilityEnterEventController.this).b);
            ofFloat.start();
            SubRewardNiubilityEnterEventController.f(SubRewardNiubilityEnterEventController.this).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.-$$Lambda$SubRewardNiubilityEnterEventController$3$yV6Vkb8VccnCQK2fU6SVjcnGltY
                {
                    SubRewardNiubilityEnterEventController.AnonymousClass3.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SubRewardNiubilityEnterEventController.AnonymousClass3.lambda$yV6Vkb8VccnCQK2fU6SVjcnGltY(SubRewardNiubilityEnterEventController.AnonymousClass3.this);
                }
            }, SubRewardNiubilityEnterEventController.e(SubRewardNiubilityEnterEventController.this).f13695a);
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                SubRewardNiubilityEnterEventController.g(SubRewardNiubilityEnterEventController.this);
            }
        }

        @Override // com.taobao.android.tblive.gift.biggift.a
        public void a(String str, TBLiveGiftEntity tBLiveGiftEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39118b7f", new Object[]{this, str, tBLiveGiftEntity});
            } else {
                SubRewardNiubilityEnterEventController.g(SubRewardNiubilityEnterEventController.this);
            }
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f == null) {
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f13688a.f().getContext(), R.anim.taolive_certification_out_flexalocal);
            this.d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                {
                    SubRewardNiubilityEnterEventController.this = this;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    SubRewardNiubilityEnterEventController.h(SubRewardNiubilityEnterEventController.this).b();
                    SubRewardNiubilityEnterEventController.i(SubRewardNiubilityEnterEventController.this).setVisibility(8);
                    SubRewardNiubilityEnterEventController.j(SubRewardNiubilityEnterEventController.this);
                }
            });
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        VideoGiftView videoGiftView = this.f;
        if (videoGiftView == null) {
            return;
        }
        videoGiftView.releasePlayerController();
        this.f.detachView();
        this.e.removeAllViews();
        this.f = null;
    }
}
