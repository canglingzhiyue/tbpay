package com.taobao.tab2interact.core.component.browser.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes8.dex */
public class CroppedRoundCornerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long ANIMATION_DURATION = 300;
    private static final String TAG = "CroppedRoundCornerFrameLayout";
    private final Context mContext;
    private int mCurrState;
    private boolean mEnable;
    private TextView mLeftComponentBottomText;
    private LinearLayout mLeftComponentTextRoot;
    private TextView mLeftComponentTopText;
    private b mPendingJob;
    private float mShowPercent;
    private c mTargetTextSet;
    private boolean mUseAnimate;
    private ValueAnimator mValueAnimator;
    private d mVisibilityChangeListener;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface State {
        public static final int CLOSE = 0;
        public static final int OPEN = 1;
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a(boolean z);
    }

    static {
        kge.a(1981079849);
    }

    public static /* synthetic */ Object ipc$super(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public static /* synthetic */ LinearLayout access$100(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("86ee8d57", new Object[]{croppedRoundCornerFrameLayout}) : croppedRoundCornerFrameLayout.mLeftComponentTextRoot;
    }

    public static /* synthetic */ void access$200(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c9dfc4", new Object[]{croppedRoundCornerFrameLayout, new Integer(i)});
        } else {
            croppedRoundCornerFrameLayout.updateState(i);
        }
    }

    public static /* synthetic */ b access$300(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("67b645a8", new Object[]{croppedRoundCornerFrameLayout}) : croppedRoundCornerFrameLayout.mPendingJob;
    }

    public static /* synthetic */ c access$400(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4ef4e366", new Object[]{croppedRoundCornerFrameLayout}) : croppedRoundCornerFrameLayout.getShowedTextSet();
    }

    public static /* synthetic */ boolean access$500(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, c cVar, c cVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63c63f20", new Object[]{croppedRoundCornerFrameLayout, cVar, cVar2})).booleanValue() : croppedRoundCornerFrameLayout.isTextSetEqual(cVar, cVar2);
    }

    public static /* synthetic */ void access$600(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a8e39b", new Object[]{croppedRoundCornerFrameLayout});
        } else {
            croppedRoundCornerFrameLayout.clearPendingJob();
        }
    }

    public static /* synthetic */ void access$700(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df99beba", new Object[]{croppedRoundCornerFrameLayout});
        } else {
            croppedRoundCornerFrameLayout.startCloseAnim();
        }
    }

    public static /* synthetic */ void access$800(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2731c60", new Object[]{croppedRoundCornerFrameLayout, cVar});
        } else {
            croppedRoundCornerFrameLayout.startOpenAnim(cVar);
        }
    }

    public static /* synthetic */ void access$900(CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff391c8", new Object[]{croppedRoundCornerFrameLayout, new Float(f)});
        } else {
            croppedRoundCornerFrameLayout.updateShowPercent(f);
        }
    }

    public CroppedRoundCornerFrameLayout(Context context) {
        super(context);
        this.mEnable = true;
        this.mUseAnimate = true;
        this.mShowPercent = 0.0f;
        this.mCurrState = 0;
        this.mVisibilityChangeListener = null;
        this.mContext = context;
    }

    public CroppedRoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnable = true;
        this.mUseAnimate = true;
        this.mShowPercent = 0.0f;
        this.mCurrState = 0;
        this.mVisibilityChangeListener = null;
        this.mContext = context;
    }

    public CroppedRoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEnable = true;
        this.mUseAnimate = true;
        this.mShowPercent = 0.0f;
        this.mCurrState = 0;
        this.mVisibilityChangeListener = null;
        this.mContext = context;
    }

    public void initView(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bde789c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mLeftComponentTextRoot = (LinearLayout) findViewById(R.id.browser_badge_left_component);
        this.mLeftComponentTopText = (TextView) this.mLeftComponentTextRoot.findViewById(R.id.browser_badge_left_component_top_text);
        this.mLeftComponentBottomText = (TextView) this.mLeftComponentTextRoot.findViewById(R.id.browser_badge_left_component_bottom_text);
        int i5 = i2 / 2;
        this.mLeftComponentTextRoot.setPadding(0, 0, i + i5, 0);
        setLayoutParams(this, -2, i2, GravityCompat.END);
        if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i4;
        layoutParams.rightMargin = i5;
        setLayoutParams(layoutParams);
    }

    public void setTextSet(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c474249f", new Object[]{this, cVar});
            return;
        }
        TextView textView = this.mLeftComponentTopText;
        if (textView != null) {
            if (cVar == null) {
                textView.setText((CharSequence) null);
            } else {
                textView.setText(cVar.f19755a);
            }
        }
        TextView textView2 = this.mLeftComponentBottomText;
        if (textView2 == null) {
            return;
        }
        if (cVar == null) {
            textView2.setText((CharSequence) null);
        } else {
            textView2.setText(cVar.b);
        }
    }

    public void updateText(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b3d9b1", new Object[]{this, str, str2});
        } else {
            updateText(new c(str, str2));
        }
    }

    private void updateText(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd61599c", new Object[]{this, cVar});
        } else if (!this.mEnable || isTextSetEqual(cVar, this.mTargetTextSet)) {
        } else {
            Context context = this.mContext;
            com.taobao.tab2interact.core.utils.a.b(context, TAG, "changeBubbleText: " + cVar + ", mTargetTextSet: " + this.mTargetTextSet);
            this.mTargetTextSet = cVar;
            if (isTextSetEmpty(cVar)) {
                closeBubble();
            } else {
                changeBubbleText(cVar);
            }
        }
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else if (this.mEnable == z) {
        } else {
            this.mEnable = z;
            if (this.mEnable) {
                return;
            }
            this.mTargetTextSet = null;
            closeBubble();
        }
    }

    public void setUseAnimate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa351", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseAnimate = z;
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            stopAll();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3) {
            return;
        }
        updateShowPercent(this.mShowPercent);
    }

    private void changeBubbleText(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ea66e9", new Object[]{this, cVar});
        } else if (this.mUseAnimate) {
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                setNewPendingJob(true, cVar);
                return;
            }
            stopAll();
            setNewPendingJob(true, cVar);
            if (this.mCurrState == 1) {
                startCloseAnim();
            } else {
                startOpenAnim(cVar);
            }
        } else {
            stopAll();
            setTextSet(cVar);
            updateShowPercent(1.0f);
            updateState(1);
        }
    }

    private void closeBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27beb72b", new Object[]{this});
        } else if (this.mUseAnimate) {
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                setNewPendingJob(false, null);
                return;
            }
            stopAll();
            startCloseAnim();
        } else {
            stopAll();
            setTextSet(null);
            updateShowPercent(0.0f);
            updateState(0);
        }
    }

    private void startOpenAnim(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de741b15", new Object[]{this, cVar});
        } else {
            startAnim(1.0f, new a() { // from class: com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.a, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    if (CroppedRoundCornerFrameLayout.access$100(CroppedRoundCornerFrameLayout.this) != null) {
                        CroppedRoundCornerFrameLayout.this.setTextSet(cVar);
                    }
                    CroppedRoundCornerFrameLayout.access$200(CroppedRoundCornerFrameLayout.this, 1);
                }

                @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.a, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this) == null) {
                    } else {
                        if (CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this).a()) {
                            CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = CroppedRoundCornerFrameLayout.this;
                            if (CroppedRoundCornerFrameLayout.access$500(croppedRoundCornerFrameLayout, CroppedRoundCornerFrameLayout.access$400(croppedRoundCornerFrameLayout), CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this).b())) {
                                CroppedRoundCornerFrameLayout.access$600(CroppedRoundCornerFrameLayout.this);
                                return;
                            } else {
                                CroppedRoundCornerFrameLayout.access$700(CroppedRoundCornerFrameLayout.this);
                                return;
                            }
                        }
                        CroppedRoundCornerFrameLayout.access$700(CroppedRoundCornerFrameLayout.this);
                    }
                }
            });
        }
    }

    private void startCloseAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9babaee", new Object[]{this});
        } else {
            startAnim(0.0f, new a() { // from class: com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.a, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this) == null || !CroppedRoundCornerFrameLayout.access$300(CroppedRoundCornerFrameLayout.this).a()) {
                        CroppedRoundCornerFrameLayout.this.setTextSet(null);
                        CroppedRoundCornerFrameLayout.access$200(CroppedRoundCornerFrameLayout.this, 0);
                    } else {
                        CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = CroppedRoundCornerFrameLayout.this;
                        CroppedRoundCornerFrameLayout.access$800(croppedRoundCornerFrameLayout, CroppedRoundCornerFrameLayout.access$300(croppedRoundCornerFrameLayout).b());
                        CroppedRoundCornerFrameLayout.access$600(CroppedRoundCornerFrameLayout.this);
                    }
                }
            });
        }
    }

    private void updateShowPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ab597a", new Object[]{this, new Float(f)});
            return;
        }
        this.mShowPercent = f;
        LinearLayout linearLayout = this.mLeftComponentTextRoot;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setTranslationX(linearLayout.getMeasuredWidth() * (1.0f - f));
    }

    private void setNewPendingJob(boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76062db0", new Object[]{this, new Boolean(z), cVar});
        } else {
            this.mPendingJob = new b(z, cVar);
        }
    }

    private void clearPendingJob() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acab57da", new Object[]{this});
        } else {
            this.mPendingJob = null;
        }
    }

    private void stopAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfb2f46", new Object[]{this});
            return;
        }
        stopAnim();
        clearPendingJob();
    }

    private void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.mValueAnimator = null;
    }

    private void startAnim(float f, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec1080e", new Object[]{this, new Float(f), animatorListener});
            return;
        }
        this.mValueAnimator = ValueAnimator.ofFloat(this.mShowPercent, f);
        this.mValueAnimator.setDuration(300L);
        this.mValueAnimator.addListener(animatorListener);
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    CroppedRoundCornerFrameLayout.access$900(CroppedRoundCornerFrameLayout.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        this.mValueAnimator.start();
    }

    public void setVisibilityChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b91f19", new Object[]{this, dVar});
        } else {
            this.mVisibilityChangeListener = dVar;
        }
    }

    private void updateState(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
        } else if (this.mCurrState == i) {
        } else {
            this.mCurrState = i;
            d dVar = this.mVisibilityChangeListener;
            if (dVar == null) {
                return;
            }
            if (this.mCurrState == 1) {
                z = true;
            }
            dVar.a(z);
        }
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue() : getVisibility() == 0 && this.mEnable && this.mCurrState == 1;
    }

    private void setLayoutParams(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e16562a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
        }
        view.setLayoutParams(layoutParams);
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "设置布局参数，pixelWidth=" + i + "，pixelHeight=" + i2);
    }

    private c getShowedTextSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a9876cd3", new Object[]{this});
        }
        TextView textView = this.mLeftComponentTopText;
        String str = null;
        String charSequence = textView != null ? textView.getText().toString() : null;
        TextView textView2 = this.mLeftComponentBottomText;
        if (textView2 != null) {
            str = textView2.getText().toString();
        }
        return new c(charSequence, str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawCircle(getWidth(), getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.restoreToCount(saveLayer);
    }

    private boolean isTextSetEqual(c cVar, c cVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac597c34", new Object[]{this, cVar, cVar2})).booleanValue() : (cVar == null || cVar2 == null) ? cVar == null && cVar2 == null : TextUtils.equals(cVar.f19755a, cVar2.f19755a) && TextUtils.equals(cVar.b, cVar2.b);
    }

    private boolean isTextSetEmpty(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71c8014", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            return true;
        }
        return TextUtils.isEmpty(cVar.f19755a) && TextUtils.isEmpty(cVar.b);
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19755a;
        public final String b;

        static {
            kge.a(-1325800614);
        }

        public c(String str, String str2) {
            this.f19755a = str;
            this.b = str2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "topText=" + this.f19755a + ", bottomText=" + this.b;
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f19754a;
        private final c b;

        static {
            kge.a(-546334431);
        }

        public b(boolean z, c cVar) {
            this.f19754a = z;
            this.b = cVar;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f19754a;
        }

        public c b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2f3d1bf2", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1354242689);
            kge.a(1420754541);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

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

        private a() {
        }
    }
}
