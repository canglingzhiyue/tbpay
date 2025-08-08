package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.RollingNumberView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.liz;
import tb.xnb;

/* loaded from: classes7.dex */
public class RollingNumberView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CREATE_NUMBER_COUNT = 20;
    private static final int NEED_CREATE_RANDOM_NUMBER_COUNT = 18;
    private static final int ROLL_NUMBER_INTERVAL;
    private static final String TAG = "RollingNumberView";
    private Integer mDoAnimationCount;
    private final List<a> mInitPositionList;
    private boolean mIsBold;
    private boolean mIsDoingAnimation;
    private long mLastDoAnimationEndTime;
    private int mRollDuration;
    private int mRollInterval;
    private int mRollNumberViewHeight;
    private int mRollRepetitionCount;
    private int mTextColor;
    private String mTextFont;
    private int mTextSize;
    private int mTextSpace;
    private final List<CustomTextView> mTextViewList;
    private final List<TranslateAnimation> mTranslateAnimationList;

    public static /* synthetic */ Object ipc$super(RollingNumberView rollingNumberView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List access$000(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("35887f92", new Object[]{rollingNumberView}) : rollingNumberView.mTextViewList;
    }

    public static /* synthetic */ int access$100(RollingNumberView rollingNumberView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("185670d3", new Object[]{rollingNumberView, str})).intValue() : rollingNumberView.getAnimationCount(str);
    }

    public static /* synthetic */ boolean access$202(RollingNumberView rollingNumberView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a3bd5f", new Object[]{rollingNumberView, new Boolean(z)})).booleanValue();
        }
        rollingNumberView.mIsDoingAnimation = z;
        return z;
    }

    public static /* synthetic */ long access$300(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cd4758c", new Object[]{rollingNumberView})).longValue() : rollingNumberView.mLastDoAnimationEndTime;
    }

    public static /* synthetic */ long access$302(RollingNumberView rollingNumberView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("981e96de", new Object[]{rollingNumberView, new Long(j)})).longValue();
        }
        rollingNumberView.mLastDoAnimationEndTime = j;
        return j;
    }

    public static /* synthetic */ Integer access$400(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("83b9db00", new Object[]{rollingNumberView}) : rollingNumberView.mDoAnimationCount;
    }

    static {
        kge.a(-2124484623);
        ROLL_NUMBER_INTERVAL = ldj.a("rollNumberInterval", 100);
    }

    public RollingNumberView(Context context) {
        this(context, null);
    }

    public RollingNumberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RollingNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTranslateAnimationList = new ArrayList();
        this.mTextViewList = new ArrayList();
        this.mInitPositionList = new ArrayList();
        setOrientation(0);
    }

    public void setRollingViewStyleAttributes(xnb xnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ed084b", new Object[]{this, xnbVar});
            return;
        }
        reset();
        this.mRollDuration = xnbVar.b();
        this.mRollInterval = xnbVar.c();
        this.mRollRepetitionCount = xnbVar.d();
        this.mRollNumberViewHeight = xnbVar.i();
        this.mTextSize = xnbVar.e();
        this.mTextColor = xnbVar.g();
        this.mTextSpace = xnbVar.h();
        this.mIsBold = xnbVar.a();
        this.mTextFont = xnbVar.j();
        String f = xnbVar.f();
        int a2 = b.a(f);
        int a3 = b.a(String.valueOf((int) Float.parseFloat(f)));
        createIntegerPartNumber(f, a3);
        if (a2 == a3) {
            return;
        }
        createDecimalPartNumber(f, a3, a2);
    }

    public void startAnimation(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927f4253", new Object[]{this, str});
        } else if (this.mIsDoingAnimation) {
            ldf.d(TAG, "正在做动画");
        } else if (getMeasuredHeight() <= 0) {
            ldf.d(TAG, "视图未渲染出来");
        } else {
            ldf.d(TAG, "开始动画");
            for (final int i = 0; i < this.mTextViewList.size(); i++) {
                final CustomTextView customTextView = this.mTextViewList.get(i);
                this.mInitPositionList.add(new a(customTextView.getLeft(), customTextView.getTop()));
                postDelayed(new Runnable() { // from class: com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.-$$Lambda$RollingNumberView$SIlrBMRcf3mP3UcISKs3LaBBvs8
                    @Override // java.lang.Runnable
                    public final void run() {
                        RollingNumberView.this.lambda$startAnimation$7$RollingNumberView(customTextView, i, str);
                    }
                }, i * ROLL_NUMBER_INTERVAL);
            }
            this.mIsDoingAnimation = true;
        }
    }

    public /* synthetic */ void lambda$startAnimation$7$RollingNumberView(CustomTextView customTextView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f67130a", new Object[]{this, customTextView, new Integer(i), str});
        } else {
            triggerNumberAnimation(customTextView, i, str);
        }
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        this.mIsDoingAnimation = false;
        if (this.mTranslateAnimationList.isEmpty()) {
            ldf.d(TAG, "当前没有在执行的动画");
            return;
        }
        for (int i = 0; i < this.mTranslateAnimationList.size(); i++) {
            this.mTranslateAnimationList.get(i).cancel();
            CustomTextView customTextView = this.mTextViewList.get(i);
            a aVar = this.mInitPositionList.get(i);
            int a2 = aVar.a();
            int b = aVar.b();
            customTextView.layout(a2, b, customTextView.getWidth() + a2, customTextView.getHeight() + b);
        }
        this.mTranslateAnimationList.clear();
        ldf.d(TAG, "停止动画");
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        stopAnimation();
        removeAllViews();
        this.mTextViewList.clear();
    }

    private void createDecimalPartNumber(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79969562", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        addView(createTextView(".", layoutParams));
        for (int i3 = i + 1; i3 <= i2; i3++) {
            int numericValue = Character.getNumericValue(str.charAt(i3));
            ldf.d(TAG, "创建小数部分，当前是第" + i3 + "个数，当前的数字是：" + numericValue);
            CustomTextView createTextView = createTextView(getText(numericValue), new FrameLayout.LayoutParams(-2, this.mRollNumberViewHeight * 20));
            addView(createTextView);
            this.mTextViewList.add(createTextView);
        }
    }

    private CustomTextView createTextView(String str, FrameLayout.LayoutParams layoutParams) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomTextView) ipChange.ipc$dispatch("51a18c66", new Object[]{this, str, layoutParams});
        }
        CustomTextView customTextView = new CustomTextView(getContext());
        customTextView.setTextSize(0, this.mTextSize);
        customTextView.setTextColor(this.mTextColor);
        customTextView.setText(str);
        customTextView.setGravity(1);
        b.a(customTextView, this.mIsBold, this.mTextFont);
        if (Build.VERSION.SDK_INT >= 21 && (i = this.mTextSpace) != 0) {
            customTextView.setLetterSpacing(i);
        }
        layoutParams.gravity = 80;
        customTextView.setLayoutParams(layoutParams);
        return customTextView;
    }

    private void createIntegerPartNumber(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e5974", new Object[]{this, str, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int numericValue = Character.getNumericValue(str.charAt(i2));
            ldf.d(TAG, "创建整数部分，当前是第" + i2 + "个数，当前的数字是：" + numericValue);
            CustomTextView createTextView = createTextView(getText(numericValue), new FrameLayout.LayoutParams(-2, this.mRollNumberViewHeight * 20));
            addView(createTextView);
            this.mTextViewList.add(createTextView);
        }
    }

    private void triggerNumberAnimation(CustomTextView customTextView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8b649b", new Object[]{this, customTextView, new Integer(i), str});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -customTextView.getHeightBeforeLastLine());
        translateAnimation.setDuration(this.mRollDuration);
        Animation.AnimationListener createAnimationListener = createAnimationListener(translateAnimation, this.mRollRepetitionCount, this.mRollInterval, i, str, customTextView);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setAnimationListener(createAnimationListener);
        customTextView.startAnimation(translateAnimation);
        this.mTranslateAnimationList.add(translateAnimation);
    }

    private String getText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = i; i2 <= 9; i2++) {
            sb.append(i2);
            sb.append("\n");
        }
        int i3 = 18 - (9 - i);
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(i4 % 10);
            sb.append("\n");
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.RollingNumberView$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ int f17363a;
        public final /* synthetic */ int b;
        public final /* synthetic */ CustomTextView c;
        public final /* synthetic */ TranslateAnimation d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        private int h = 0;

        /* renamed from: lambda$ipjr6QtahocKaosUjHf--1g4h20 */
        public static /* synthetic */ void m1082lambda$ipjr6QtahocKaosUjHf1g4h20(CustomTextView customTextView, TranslateAnimation translateAnimation) {
            a(customTextView, translateAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        public AnonymousClass1(int i, int i2, CustomTextView customTextView, TranslateAnimation translateAnimation, int i3, String str) {
            RollingNumberView.this = r1;
            this.f17363a = i;
            this.b = i2;
            this.c = customTextView;
            this.d = translateAnimation;
            this.e = i3;
            this.f = str;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                return;
            }
            ldf.d(RollingNumberView.TAG, "开始做动画了，当前的index是：" + this.f17363a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            int i = this.h + 1;
            this.h = i;
            if (i < this.b) {
                RollingNumberView rollingNumberView = RollingNumberView.this;
                final CustomTextView customTextView = this.c;
                final TranslateAnimation translateAnimation = this.d;
                rollingNumberView.postDelayed(new Runnable() { // from class: com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.-$$Lambda$RollingNumberView$1$ipjr6QtahocKaosUjHf--1g4h20
                    @Override // java.lang.Runnable
                    public final void run() {
                        RollingNumberView.AnonymousClass1.m1082lambda$ipjr6QtahocKaosUjHf1g4h20(CustomTextView.this, translateAnimation);
                    }
                }, this.e);
                ldf.d(RollingNumberView.TAG, "执行下一轮动画，当前是第" + this.h + "次");
            }
            if (!(this.h == this.b && this.f17363a == RollingNumberView.access$000(RollingNumberView.this).size() - 1)) {
                return;
            }
            String str = this.f;
            liz.b(str, String.valueOf(System.currentTimeMillis()) + '_' + RollingNumberView.access$100(RollingNumberView.this, this.f));
            RollingNumberView.access$202(RollingNumberView.this, false);
            RollingNumberView.access$302(RollingNumberView.this, System.currentTimeMillis());
            ldf.d(RollingNumberView.TAG, "记录动画次数，当前动画次数是： " + RollingNumberView.access$400(RollingNumberView.this) + "当前做完动画的时间是： " + RollingNumberView.access$300(RollingNumberView.this));
        }

        public static /* synthetic */ void a(CustomTextView customTextView, TranslateAnimation translateAnimation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("851d2ec2", new Object[]{customTextView, translateAnimation});
            } else {
                customTextView.startAnimation(translateAnimation);
            }
        }
    }

    private Animation.AnimationListener createAnimationListener(TranslateAnimation translateAnimation, int i, int i2, int i3, String str, CustomTextView customTextView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation.AnimationListener) ipChange.ipc$dispatch("bab34e60", new Object[]{this, translateAnimation, new Integer(i), new Integer(i2), new Integer(i3), str, customTextView}) : new AnonymousClass1(i3, i, customTextView, translateAnimation, i2, str);
    }

    private int getAnimationCountFromSp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f300606c", new Object[]{this, str})).intValue();
        }
        String a2 = liz.a(str, "");
        if (StringUtils.isEmpty(a2)) {
            ldf.d(TAG, "value == null");
            return 0;
        }
        String[] split = a2.split("_");
        if (split.length <= 1) {
            ldf.d(TAG, "数组长度不符合规范");
            return 0;
        }
        String str2 = split[1];
        String str3 = split[0];
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
            if (b.a(Long.parseLong(str3))) {
                ldf.d(TAG, "距离上一次超过24小时了");
                return 0;
            }
            return Integer.parseInt(str2);
        }
        ldf.d(TAG, "数值异常，number： " + str2);
        return 0;
    }

    private int getAnimationCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ca990a5", new Object[]{this, str})).intValue();
        }
        if (this.mDoAnimationCount == null) {
            this.mDoAnimationCount = Integer.valueOf(getAnimationCountFromSp(str));
        } else if (b.a(this.mLastDoAnimationEndTime)) {
            this.mDoAnimationCount = 0;
            ldf.d(TAG, "过了0点了，重置疲劳度");
        }
        Integer valueOf = Integer.valueOf(this.mDoAnimationCount.intValue() + 1);
        this.mDoAnimationCount = valueOf;
        return valueOf.intValue();
    }
}
