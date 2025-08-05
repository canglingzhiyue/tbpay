package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.g;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class cqr extends cqn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CORNER_ADDRESS = "https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png";
    public static final a Companion;
    public static final String TAG = "IrpScanLoadingWidget";

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f26437a;
    private TUrlImageView b;
    private TUrlImageView c;
    private TUrlImageView d;
    private TUrlImageView e;
    private TUrlImageView f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;
    private ValueAnimator q;
    private final boolean r;
    private final ruk<t> s;

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, it});
                return;
            }
            q.a((Object) it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) animatedValue).floatValue();
            cot.c(cqr.TAG, "onAnimationUpdate: " + floatValue);
            cqr.d(cqr.this).setTranslationY(floatValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ruk a2 = cqr.a(cqr.this);
            if (a2 == null) {
                return;
            }
            a2.mo2427invoke();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cqr.b(cqr.this);
            cqr.c(cqr.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f26442a;
        public final /* synthetic */ cqr b;

        public f(ValueAnimator valueAnimator, cqr cqrVar) {
            this.f26442a = valueAnimator;
            this.b = cqrVar;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f26442a.cancel();
            this.f26442a.removeAllListeners();
            this.f26442a.removeAllUpdateListeners();
            cqr.d(this.b).setVisibility(8);
        }
    }

    static {
        kge.a(158429926);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(cqr cqrVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ ruk a(cqr cqrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("eafb37ea", new Object[]{cqrVar}) : cqrVar.s;
    }

    public static final /* synthetic */ void b(cqr cqrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d274ed15", new Object[]{cqrVar});
        } else {
            cqrVar.eM_();
        }
    }

    public static final /* synthetic */ void c(cqr cqrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f7f396", new Object[]{cqrVar});
        } else {
            cqrVar.h();
        }
    }

    public static final /* synthetic */ TUrlImageView d(cqr cqrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("6d1d6885", new Object[]{cqrVar});
        }
        TUrlImageView tUrlImageView = cqrVar.b;
        if (tUrlImageView == null) {
            q.b("mScanLine");
        }
        return tUrlImageView;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup] */
    @Override // tb.igj
    public /* synthetic */ ViewGroup k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : en_();
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-892111186);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqr(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, ruk<t> rukVar) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.s = rukVar;
        this.o = g.a(30.0f);
        this.p = g.a(30.0f);
        this.r = eN_();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.RelativeLayout en_() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cqr.en_():android.widget.RelativeLayout");
    }

    @Override // tb.cqn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        eO_();
        ViewGroup O = O();
        if (O == null) {
            return;
        }
        O.setVisibility(0);
    }

    @Override // tb.cqn
    public void el_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c71011f", new Object[]{this});
            return;
        }
        i();
        ViewGroup O = O();
        if (O == null) {
            return;
        }
        O.setVisibility(8);
    }

    private final void eM_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678ac5de", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.c;
        if (tUrlImageView == null) {
            q.b("mLeftTopCorner");
        }
        this.g = tUrlImageView.getX();
        TUrlImageView tUrlImageView2 = this.c;
        if (tUrlImageView2 == null) {
            q.b("mLeftTopCorner");
        }
        this.h = tUrlImageView2.getY();
        TUrlImageView tUrlImageView3 = this.d;
        if (tUrlImageView3 == null) {
            q.b("mRightTopCorner");
        }
        this.i = tUrlImageView3.getX();
        TUrlImageView tUrlImageView4 = this.d;
        if (tUrlImageView4 == null) {
            q.b("mRightTopCorner");
        }
        this.j = tUrlImageView4.getY();
        TUrlImageView tUrlImageView5 = this.e;
        if (tUrlImageView5 == null) {
            q.b("mLeftBottomCorner");
        }
        this.k = tUrlImageView5.getX();
        TUrlImageView tUrlImageView6 = this.e;
        if (tUrlImageView6 == null) {
            q.b("mLeftBottomCorner");
        }
        this.l = tUrlImageView6.getY();
        TUrlImageView tUrlImageView7 = this.f;
        if (tUrlImageView7 == null) {
            q.b("mRightBottomCorner");
        }
        this.m = tUrlImageView7.getX();
        TUrlImageView tUrlImageView8 = this.f;
        if (tUrlImageView8 == null) {
            q.b("mRightBottomCorner");
        }
        this.n = tUrlImageView8.getY();
    }

    private final boolean eN_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693f9e81", new Object[]{this})).booleanValue();
        }
        PhotoFrom a2 = m().a();
        return a2 == PhotoFrom.Values.OUTER_ALBUM_LOCAL || a2 == PhotoFrom.Values.ALBUM || a2 == PhotoFrom.Values.ALBUM_SYS;
    }

    private final void eO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af4771c", new Object[]{this});
            return;
        }
        cot.c(TAG, "startAnimation");
        RelativeLayout relativeLayout = this.f26437a;
        if (relativeLayout == null) {
            q.b("mLoadingContainer");
        }
        relativeLayout.post(new e());
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.b;
        if (tUrlImageView == null) {
            q.b("mScanLine");
        }
        tUrlImageView.setVisibility(0);
        TUrlImageView tUrlImageView2 = this.b;
        if (tUrlImageView2 == null) {
            q.b("mScanLine");
        }
        float translationY = tUrlImageView2.getTranslationY() - g.a(10.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, g.a(427.0f) + translationY);
        ofFloat.addUpdateListener(new b());
        ofFloat.addListener(new c());
        q.a((Object) ofFloat, "this");
        ofFloat.setRepeatCount(10);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        this.q = ofFloat;
    }

    /* loaded from: classes3.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                cqr.d(cqr.this).setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                cqr.d(cqr.this).setVisibility(8);
            }
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            RelativeLayout relativeLayout = this.f26437a;
            if (relativeLayout == null) {
                q.b("mLoadingContainer");
            }
            relativeLayout.post(new f(valueAnimator, this));
        }
        this.q = null;
    }
}
