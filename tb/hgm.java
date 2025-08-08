package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.room.business.trivial.TrivialQueryResponseData;
import com.taobao.taolive.room.business.trivial.a;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.weex.common.Constants;

/* loaded from: classes5.dex */
public class hgm implements a, com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private f f28620a;
    private TrivialQueryResponseData.ChatItemCommonData b;
    private boolean c;
    private ViewGroup d;

    static {
        kge.a(-1828748604);
        kge.a(1357462942);
        kge.a(-1905361424);
    }

    /* renamed from: lambda$rX8iHIDoL_Ga-JEjWYYucl7gvmc */
    public static /* synthetic */ void m2444lambda$rX8iHIDoL_GaJEjWYYucl7gvmc(hgm hgmVar, TrivialQueryResponseData.ChatItemCommonData chatItemCommonData) {
        hgmVar.d(chatItemCommonData);
    }

    @Override // com.taobao.taolive.room.business.trivial.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ ViewGroup a(hgm hgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7e76e60b", new Object[]{hgmVar}) : hgmVar.d;
    }

    public static /* synthetic */ boolean a(hgm hgmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9173db4e", new Object[]{hgmVar, new Boolean(z)})).booleanValue();
        }
        hgmVar.c = z;
        return z;
    }

    @Override // com.taobao.taolive.room.business.trivial.a
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.d = viewGroup;
        this.f28620a = new f(this);
    }

    @Override // com.taobao.taolive.room.business.trivial.a
    public void a(final TrivialQueryResponseData.ChatItemCommonData chatItemCommonData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca3c2d2", new Object[]{this, chatItemCommonData});
        } else {
            this.f28620a.post(new Runnable() { // from class: tb.-$$Lambda$hgm$rX8iHIDoL_Ga-JEjWYYucl7gvmc
                @Override // java.lang.Runnable
                public final void run() {
                    hgm.m2444lambda$rX8iHIDoL_GaJEjWYYucl7gvmc(hgm.this, chatItemCommonData);
                }
            });
        }
    }

    public /* synthetic */ void d(TrivialQueryResponseData.ChatItemCommonData chatItemCommonData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af235d15", new Object[]{this, chatItemCommonData});
        } else if (this.c || chatItemCommonData == null || chatItemCommonData.data == null) {
        } else {
            q.b("BottomTrivialChatController", "startLoop bizType:" + chatItemCommonData.bizType);
            String string = chatItemCommonData.data.getString("permanent");
            this.c = true;
            if (StringUtils.equals("true", string)) {
                c(chatItemCommonData);
            } else {
                b(chatItemCommonData);
            }
        }
    }

    private void b(TrivialQueryResponseData.ChatItemCommonData chatItemCommonData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ce4b93", new Object[]{this, chatItemCommonData});
            return;
        }
        long b = l.b(chatItemCommonData.data.getString("initDuration"));
        chatItemCommonData.isFirstShow = true;
        c(chatItemCommonData);
        this.b = chatItemCommonData;
        this.f28620a.sendEmptyMessageDelayed(200, b * 1000);
    }

    private void c(TrivialQueryResponseData.ChatItemCommonData chatItemCommonData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f8d454", new Object[]{this, chatItemCommonData});
        } else if (this.d == null) {
        } else {
            String str = chatItemCommonData.templateName;
            String str2 = chatItemCommonData.bizType;
            String str3 = chatItemCommonData.showType;
            q.b("BottomTrivialChatController", "showPermanentBottomView bizType:" + str2 + " templateName:" + str + " showType:" + str3);
            DXRootView createDX = com.taobao.android.live.plugin.proxy.f.m().createDX(this.d.getContext(), str);
            if (createDX != null) {
                this.d.removeAllViews();
                this.d.addView(createDX);
                com.taobao.android.live.plugin.proxy.f.m().renderDX(createDX, chatItemCommonData.data);
            }
            this.d.setVisibility(0);
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.d.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.d.getMeasuredHeight(), Integer.MIN_VALUE));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.d, "translationY", this.d.getMeasuredHeight(), 0.0f).setDuration(300L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: tb.hgm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                hgm.this = this;
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                hgm.a(hgm.this, false);
            }
        });
        duration.start();
        this.c = true;
        this.d.requestLayout();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.d.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.d.getMeasuredHeight(), Integer.MIN_VALUE));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.d, "translationY", 0.0f, this.d.getMeasuredHeight()).setDuration(300L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: tb.hgm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                hgm.this = this;
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                hgm.a(hgm.this, false);
                hgm.a(hgm.this).setVisibility(8);
            }
        });
        duration.start();
        this.c = true;
        this.d.requestLayout();
    }

    @Override // com.taobao.taolive.room.business.trivial.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f fVar = this.f28620a;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        this.c = false;
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        TrivialQueryResponseData.ChatItemCommonData chatItemCommonData = this.b;
        if (chatItemCommonData == null || chatItemCommonData.data == null) {
            return;
        }
        long b = l.b(this.b.data.getString("duration"));
        long b2 = l.b(this.b.data.getString(Constants.Name.INTERVAL));
        int i = message.what;
        if (i == 100) {
            c();
            this.d.setVisibility(0);
            this.f28620a.sendEmptyMessageDelayed(200, b * 1000);
        } else if (i != 200) {
        } else {
            d();
            this.f28620a.sendEmptyMessageDelayed(100, b2 * 1000);
        }
    }
}
