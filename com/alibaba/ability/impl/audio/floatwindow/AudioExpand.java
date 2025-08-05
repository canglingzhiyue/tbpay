package com.alibaba.ability.impl.audio.floatwindow;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow;
import com.alibaba.ability.impl.audio.i;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.hsy;
import tb.kge;

/* loaded from: classes2.dex */
public final class AudioExpand extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final a Companion;
    public static final String IMAGE_URL_CLOSE = "https://img.alicdn.com/imgextra/i2/O1CN01FQ2Qw01JyTMCdIX4D_!!6000000001097-2-tps-38-38.png";
    public static final String IMAGE_URL_PAUSE = "https://img.alicdn.com/imgextra/i3/O1CN01WlUn0T1GlF4P1B9Y8_!!6000000000662-2-tps-78-94.png";
    public static final String IMAGE_URL_PLAY = "https://img.alicdn.com/imgextra/i2/O1CN01rngDiY1Gy49x2Rq1X_!!6000000000690-2-tps-62-70.png";
    private static final String IMG_URL_SERCH_CLOSE = "https://img.alicdn.com/imgextra/i2/O1CN012zxMHE1WR7Z3xr0SU_!!6000000002784-2-tps-833-834.png";
    public static final float STROKE_WIDTH = 2.0f;
    public boolean defaultPlaying;
    private GradientDrawable drawable;
    private FrameLayout flCD;
    private View flClose;
    private FrameLayout flCloseLayout;
    private FrameLayout frameLayout;
    private FrameLayout frameLayoutClose;
    private TUrlImageView ivCD;
    private TUrlImageView ivClose;
    private TUrlImageView ivStatus;
    private float[] leftRadii;
    private com.alibaba.ability.impl.audio.e playParams;
    private float[] rightRadii;
    private ObjectAnimator rotateAnimation;
    private TUrlImageView searchImageView;
    private FrameLayout thisView;
    private AudioFloatWindow.a triggerListener;
    private TextView tvTitle;
    private TextView tvTitleClose;

    /* loaded from: classes2.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TUrlImageView access$getIvStatus$p = AudioExpand.access$getIvStatus$p(AudioExpand.this);
            q.a(access$getIvStatus$p);
            String imageUrl = access$getIvStatus$p.getImageUrl();
            AudioExpand.access$Companion();
            if (q.a((Object) imageUrl, (Object) AudioExpand.IMAGE_URL_PLAY)) {
                AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(0, null);
            } else {
                AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(1, null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TUrlImageView access$getIvStatus$p = AudioExpand.access$getIvStatus$p(AudioExpand.this);
            if (access$getIvStatus$p != null) {
                access$getIvStatus$p.setVisibility(4);
            }
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.0f);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.0f);
            TUrlImageView access$getIvCD$p = AudioExpand.access$getIvCD$p(AudioExpand.this);
            if (access$getIvCD$p != null) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(access$getIvCD$p, ofFloat, ofFloat2);
                q.b(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…r(cdView, scaleX, scaleY)");
                ofPropertyValuesHolder.setDuration(300L);
                ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                ofPropertyValuesHolder.start();
                com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.impl.audio.floatwindow.AudioExpand.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AudioExpand.access$getFrameLayout$p(AudioExpand.this).setVisibility(8);
                        AudioExpand.access$getFrameLayoutClose$p(AudioExpand.this).setVisibility(0);
                        AudioExpand.access$showCloseUIAndExit(AudioExpand.this);
                    }
                }, 300L);
            }
            com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.impl.audio.floatwindow.AudioExpand.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(2, null);
                    }
                }
            }, 2600L);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(3, null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int[] b;

        public e(int[] iArr) {
            this.b = iArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AudioExpand audioExpand = AudioExpand.this;
            if (this.b[0] <= 0) {
                z = false;
            }
            AudioExpand.access$showCloseTranslateAnimation(audioExpand, z);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public f(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ViewGroup.LayoutParams layoutParams = AudioExpand.this.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } catch (Throwable unused) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(AudioExpand.this.getWidth(), AudioExpand.this.getHeight());
            }
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(AudioExpand.this.getWidth(), AudioExpand.this.getHeight());
            }
            if (this.b) {
                Context context = AudioExpand.this.getContext();
                q.b(context, "context");
                marginLayoutParams.rightMargin = hsy.a(context, -2.0f);
            } else {
                Context context2 = AudioExpand.this.getContext();
                q.b(context2, "context");
                marginLayoutParams.leftMargin = hsy.a(context2, -2.0f);
            }
            AudioExpand.this.setLayoutParams(marginLayoutParams);
        }
    }

    static {
        kge.a(-35873365);
        Companion = new a(null);
    }

    public AudioExpand(Context context, AudioFloatWindow.a aVar) {
        this(context, aVar, null, 0, 12, null);
    }

    public AudioExpand(Context context, AudioFloatWindow.a aVar, AttributeSet attributeSet) {
        this(context, aVar, attributeSet, 0, 8, null);
    }

    public static final /* synthetic */ a access$Companion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5a6c838a", new Object[0]) : Companion;
    }

    public static /* synthetic */ Object ipc$super(AudioExpand audioExpand, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ FrameLayout access$getFrameLayout$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("92f76621", new Object[]{audioExpand});
        }
        FrameLayout frameLayout = audioExpand.frameLayout;
        if (frameLayout == null) {
            q.b("frameLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ FrameLayout access$getFrameLayoutClose$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("42e4b26b", new Object[]{audioExpand});
        }
        FrameLayout frameLayout = audioExpand.frameLayoutClose;
        if (frameLayout == null) {
            q.b("frameLayoutClose");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TUrlImageView access$getIvCD$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("7c0c7521", new Object[]{audioExpand}) : audioExpand.ivCD;
    }

    public static final /* synthetic */ TUrlImageView access$getIvStatus$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("b01f1f10", new Object[]{audioExpand}) : audioExpand.ivStatus;
    }

    public static final /* synthetic */ AudioFloatWindow.a access$getTriggerListener$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioFloatWindow.a) ipChange.ipc$dispatch("9a3f9086", new Object[]{audioExpand}) : audioExpand.triggerListener;
    }

    public static final /* synthetic */ void access$setFrameLayout$p(AudioExpand audioExpand, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246299af", new Object[]{audioExpand, frameLayout});
        } else {
            audioExpand.frameLayout = frameLayout;
        }
    }

    public static final /* synthetic */ void access$setFrameLayoutClose$p(AudioExpand audioExpand, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7ea3d", new Object[]{audioExpand, frameLayout});
        } else {
            audioExpand.frameLayoutClose = frameLayout;
        }
    }

    public static final /* synthetic */ void access$setIvCD$p(AudioExpand audioExpand, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb31da6d", new Object[]{audioExpand, tUrlImageView});
        } else {
            audioExpand.ivCD = tUrlImageView;
        }
    }

    public static final /* synthetic */ void access$setIvStatus$p(AudioExpand audioExpand, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e37885e", new Object[]{audioExpand, tUrlImageView});
        } else {
            audioExpand.ivStatus = tUrlImageView;
        }
    }

    public static final /* synthetic */ void access$setTriggerListener$p(AudioExpand audioExpand, AudioFloatWindow.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ee5de8", new Object[]{audioExpand, aVar});
        } else {
            audioExpand.triggerListener = aVar;
        }
    }

    public static final /* synthetic */ void access$showCloseTranslateAnimation(AudioExpand audioExpand, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4fd738", new Object[]{audioExpand, new Boolean(z)});
        } else {
            audioExpand.showCloseTranslateAnimation(z);
        }
    }

    public static final /* synthetic */ void access$showCloseUIAndExit(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245bd5b1", new Object[]{audioExpand});
        } else {
            audioExpand.showCloseUIAndExit();
        }
    }

    public /* synthetic */ AudioExpand(Context context, AudioFloatWindow.a aVar, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioExpand(Context context, AudioFloatWindow.a triggerListener, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        q.d(triggerListener, "triggerListener");
        this.triggerListener = triggerListener;
        this.defaultPlaying = true;
        initLayout();
    }

    private final void initLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.audio_expand_layout, this);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.thisView = frameLayout;
        View findViewById = frameLayout.findViewById(R.id.layout_expand);
        q.a(findViewById);
        this.frameLayout = (FrameLayout) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.layout_expand_close);
        q.a(findViewById2);
        this.frameLayoutClose = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.iv_cd);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.ivCD = (TUrlImageView) findViewById3;
        View findViewById4 = findViewById(R.id.img_search);
        q.a(findViewById4);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.setImageUrl(IMG_URL_SERCH_CLOSE);
        t tVar = t.INSTANCE;
        this.searchImageView = tUrlImageView;
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            q.b("frameLayout");
        }
        float f2 = frameLayout2.getLayoutParams().height / 2.0f;
        if (f2 <= 0) {
            f2 = 90.0f;
        }
        this.rightRadii = new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
        this.leftRadii = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
        shapeCorner();
        View findViewById5 = findViewById(R.id.fl_cd);
        if (findViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.flCD = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.iv_close);
        if (findViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.ivClose = (TUrlImageView) findViewById6;
        View findViewById7 = findViewById(R.id.fl_close);
        if (findViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.flClose = findViewById7;
        View findViewById8 = findViewById(R.id.fl_close_layout);
        if (findViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.flCloseLayout = (FrameLayout) findViewById8;
        View findViewById9 = findViewById(R.id.iv_status);
        if (findViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.ivStatus = (TUrlImageView) findViewById9;
        View findViewById10 = findViewById(R.id.tv_title);
        if (findViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.tvTitle = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.tv_title_close);
        q.b(findViewById11, "findViewById(R.id.tv_title_close)");
        this.tvTitleClose = (TextView) findViewById11;
        FrameLayout frameLayout3 = this.flCD;
        q.a(frameLayout3);
        frameLayout3.setOnClickListener(new b());
        View view = this.flClose;
        if (view != null) {
            view.setOnClickListener(new c());
        }
        TextView textView = this.tvTitle;
        if (textView == null) {
            q.b("tvTitle");
        }
        textView.setOnClickListener(new d());
        TUrlImageView tUrlImageView2 = this.ivClose;
        if (tUrlImageView2 == null) {
            q.b("ivClose");
        }
        tUrlImageView2.setImageUrl(IMAGE_URL_CLOSE);
        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(this.ivCD, "rotation", 0.0f, 360.0f);
        q.b(rotateAnimation, "rotateAnimation");
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.rotateAnimation = rotateAnimation;
        initSize();
        setBackground();
    }

    private final String getTipsFromPlayParams(com.alibaba.ability.impl.audio.e eVar) {
        Map<?, ?> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("185d865b", new Object[]{this, eVar});
        }
        String obj2 = (eVar == null || (map = eVar.d) == null || (obj = map.get("searchKey")) == null) ? null : obj.toString();
        String str = obj2;
        if (str == null || str.length() == 0) {
            obj2 = "undefined";
        }
        String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_21332);
        q.b(a2, "Localization.localizedSt….taobao_app_1012_1_21332)");
        Object[] objArr = {obj2};
        String format = String.format(a2, Arrays.copyOf(objArr, objArr.length));
        q.b(format, "java.lang.String.format(this, *args)");
        return format;
    }

    private final void showCloseUIAndExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f084d54d", new Object[]{this});
            return;
        }
        TextView textView = this.tvTitleClose;
        if (textView == null) {
            q.b("tvTitleClose");
        }
        textView.setText(getTipsFromPlayParams(this.playParams));
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f);
        TUrlImageView tUrlImageView = this.searchImageView;
        if (tUrlImageView == null) {
            q.b("searchImageView");
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tUrlImageView, ofFloat, ofFloat2);
        q.b(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…mageView, scaleX, scaleY)");
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.start();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        com.alibaba.ability.e.a(new e(iArr), 1500L);
    }

    private final void shapeCorner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84109add", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivCD;
        if (tUrlImageView == null) {
            return;
        }
        AbsFeature<? super ImageView> findFeature = tUrlImageView.findFeature(ImageShapeFeature.class);
        if (!(findFeature instanceof ImageShapeFeature)) {
            findFeature = null;
        }
        ImageShapeFeature imageShapeFeature = (ImageShapeFeature) findFeature;
        if (imageShapeFeature == null) {
            imageShapeFeature = new ImageShapeFeature();
            tUrlImageView.addFeature(imageShapeFeature);
        }
        int i = tUrlImageView.getLayoutParams().width / 2;
        if (i <= 0) {
            return;
        }
        imageShapeFeature.setShape(1);
        float f2 = i;
        imageShapeFeature.setCornerRadius(f2, f2, f2, f2);
    }

    private final void setBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91c7b7", new Object[]{this});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        q.b(context, "context");
        gradientDrawable.setStroke(hsy.a(context, 2.0f), Color.parseColor("#0DFFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#FF363636"));
        if (Build.VERSION.SDK_INT >= 16) {
            FrameLayout frameLayout = this.frameLayout;
            if (frameLayout == null) {
                q.b("frameLayout");
            }
            GradientDrawable gradientDrawable2 = gradientDrawable;
            frameLayout.setBackground(gradientDrawable2);
            FrameLayout frameLayout2 = this.frameLayoutClose;
            if (frameLayout2 == null) {
                q.b("frameLayoutClose");
            }
            frameLayout2.setBackground(gradientDrawable2);
        }
        this.drawable = gradientDrawable;
    }

    public final void layout(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749dba23", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.thisView;
        if (frameLayout == null) {
            q.b("thisView");
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = i2;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (z) {
            FrameLayout frameLayout2 = this.flCD;
            q.a(frameLayout2);
            ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
            Context context = getContext();
            q.b(context, "context");
            layoutParams5.leftMargin = hsy.a(context, 6.5f);
            FrameLayout frameLayout3 = this.flCD;
            q.a(frameLayout3);
            frameLayout3.setLayoutParams(layoutParams5);
            TextView textView = this.tvTitle;
            if (textView == null) {
                q.b("tvTitle");
            }
            ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
            Context context2 = getContext();
            q.b(context2, "context");
            layoutParams7.leftMargin = hsy.a(context2, 48.5f);
            TextView textView2 = this.tvTitle;
            if (textView2 == null) {
                q.b("tvTitle");
            }
            textView2.setGravity(19);
            TextView textView3 = this.tvTitle;
            if (textView3 == null) {
                q.b("tvTitle");
            }
            textView3.setLayoutParams(layoutParams7);
            View view = this.flClose;
            ViewGroup.LayoutParams layoutParams8 = view != null ? view.getLayoutParams() : null;
            if (layoutParams8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams8;
            FrameLayout frameLayout4 = this.flCloseLayout;
            if (frameLayout4 != null) {
                layoutParams3 = frameLayout4.getLayoutParams();
            }
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams3;
            TUrlImageView tUrlImageView = this.ivClose;
            if (tUrlImageView == null) {
                q.b("ivClose");
            }
            ViewGroup.LayoutParams layoutParams11 = tUrlImageView.getLayoutParams();
            if (layoutParams11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
            Context context3 = getContext();
            q.b(context3, "context");
            layoutParams9.leftMargin = hsy.a(context3, 134.0f);
            Context context4 = getContext();
            q.b(context4, "context");
            layoutParams10.leftMargin = hsy.a(context4, 144.5f);
            layoutParams12.gravity = 19;
            TUrlImageView tUrlImageView2 = this.ivClose;
            if (tUrlImageView2 == null) {
                q.b("ivClose");
            }
            tUrlImageView2.setLayoutParams(layoutParams12);
            FrameLayout frameLayout5 = this.flCloseLayout;
            if (frameLayout5 != null) {
                frameLayout5.setLayoutParams(layoutParams10);
            }
            GradientDrawable gradientDrawable = this.drawable;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadii(this.rightRadii);
            }
        } else {
            FrameLayout frameLayout6 = this.flCD;
            ViewGroup.LayoutParams layoutParams13 = frameLayout6 != null ? frameLayout6.getLayoutParams() : null;
            if (layoutParams13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
            Context context5 = getContext();
            q.b(context5, "context");
            layoutParams14.leftMargin = hsy.a(context5, 120.5f);
            FrameLayout frameLayout7 = this.flCD;
            if (frameLayout7 != null) {
                frameLayout7.setLayoutParams(layoutParams14);
            }
            TextView textView4 = this.tvTitle;
            if (textView4 == null) {
                q.b("tvTitle");
            }
            ViewGroup.LayoutParams layoutParams15 = textView4.getLayoutParams();
            if (layoutParams15 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
            Context context6 = getContext();
            q.b(context6, "context");
            layoutParams16.leftMargin = hsy.a(context6, 24.5f);
            TextView textView5 = this.tvTitle;
            if (textView5 == null) {
                q.b("tvTitle");
            }
            textView5.setGravity(21);
            TextView textView6 = this.tvTitle;
            if (textView6 == null) {
                q.b("tvTitle");
            }
            textView6.setLayoutParams(layoutParams16);
            View view2 = this.flClose;
            ViewGroup.LayoutParams layoutParams17 = view2 != null ? view2.getLayoutParams() : null;
            if (layoutParams17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) layoutParams17;
            FrameLayout frameLayout8 = this.flCloseLayout;
            ViewGroup.LayoutParams layoutParams19 = frameLayout8 != null ? frameLayout8.getLayoutParams() : null;
            if (layoutParams19 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams20 = (FrameLayout.LayoutParams) layoutParams19;
            TUrlImageView tUrlImageView3 = this.ivClose;
            if (tUrlImageView3 == null) {
                q.b("ivClose");
            }
            if (tUrlImageView3 != null) {
                layoutParams3 = tUrlImageView3.getLayoutParams();
            }
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams21 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams18.leftMargin = 0;
            layoutParams20.leftMargin = 0;
            layoutParams21.gravity = 21;
            TUrlImageView tUrlImageView4 = this.ivClose;
            if (tUrlImageView4 == null) {
                q.b("ivClose");
            }
            tUrlImageView4.setLayoutParams(layoutParams21);
            FrameLayout frameLayout9 = this.flCloseLayout;
            if (frameLayout9 != null) {
                frameLayout9.setLayoutParams(layoutParams20);
            }
            GradientDrawable gradientDrawable2 = this.drawable;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setCornerRadii(this.leftRadii);
            }
        }
        TUrlImageView tUrlImageView5 = this.searchImageView;
        if (tUrlImageView5 == null) {
            q.b("searchImageView");
        }
        ViewGroup.LayoutParams layoutParams22 = tUrlImageView5.getLayoutParams();
        q.a(layoutParams22);
        if (layoutParams22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams23 = (FrameLayout.LayoutParams) layoutParams22;
        TextView textView7 = this.tvTitleClose;
        if (textView7 == null) {
            q.b("tvTitleClose");
        }
        ViewGroup.LayoutParams layoutParams24 = textView7.getLayoutParams();
        q.a(layoutParams24);
        if (layoutParams24 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams25 = (FrameLayout.LayoutParams) layoutParams24;
        if (z) {
            Context context7 = getContext();
            q.b(context7, "context");
            layoutParams23.leftMargin = hsy.a(context7, 14.0f);
            Context context8 = getContext();
            q.b(context8, "context");
            layoutParams25.leftMargin = hsy.a(context8, 46.0f);
            TextView textView8 = this.tvTitleClose;
            if (textView8 == null) {
                q.b("tvTitleClose");
            }
            textView8.setGravity(19);
        } else {
            Context context9 = getContext();
            q.b(context9, "context");
            layoutParams23.leftMargin = hsy.a(context9, 129.0f);
            Context context10 = getContext();
            q.b(context10, "context");
            layoutParams25.leftMargin = hsy.a(context10, 6.5f);
            TextView textView9 = this.tvTitleClose;
            if (textView9 == null) {
                q.b("tvTitleClose");
            }
            textView9.setGravity(19);
        }
        requestLayout();
    }

    private final void initSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9873538", new Object[]{this});
        } else if (getLayoutParams() == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            setLayoutParams(layoutParams);
            invalidate();
        }
    }

    public final void play(com.alibaba.ability.impl.audio.e playParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648afe27", new Object[]{this, playParams});
            return;
        }
        q.d(playParams, "playParams");
        if (this.defaultPlaying) {
            play();
        } else {
            pause();
        }
        i iVar = playParams.c;
        TextView textView = this.tvTitle;
        if (textView == null) {
            q.b("tvTitle");
        }
        textView.setText(iVar.b);
        TUrlImageView tUrlImageView = this.ivCD;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(iVar.d);
        }
        this.playParams = playParams;
        TextView textView2 = this.tvTitleClose;
        if (textView2 == null) {
            q.b("tvTitleClose");
        }
        textView2.setText(getTipsFromPlayParams(playParams));
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivStatus;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(IMAGE_URL_PLAY);
        }
        ObjectAnimator objectAnimator = this.rotateAnimation;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.end();
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivStatus;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(IMAGE_URL_PAUSE);
        }
        ObjectAnimator objectAnimator = this.rotateAnimation;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.start();
    }

    private final void showCloseTranslateAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f51179c", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = getContext();
        q.b(context, "context");
        float f2 = hsy.a(context).widthPixels;
        FrameLayout frameLayout = this.frameLayoutClose;
        if (frameLayout == null) {
            q.b("frameLayoutClose");
        }
        if (frameLayout.getVisibility() != 0) {
            return;
        }
        ObjectAnimator animator = z ? ObjectAnimator.ofFloat(this, "translationX", 0.0f, f2) : ObjectAnimator.ofFloat(this, "translationX", 0.0f, -f2);
        q.b(animator, "animator");
        animator.setDuration(500L);
        animator.start();
    }

    public final void showOpenTranslateAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f6e830", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = getContext();
        q.b(context, "context");
        float f2 = hsy.a(context).widthPixels;
        setTranslationX(z ? f2 : -f2);
        ObjectAnimator animator = z ? ObjectAnimator.ofFloat(this, "translationX", f2, 0.0f) : ObjectAnimator.ofFloat(this, "translationX", -f2, 0.0f);
        q.b(animator, "animator");
        animator.setDuration(200L);
        animator.start();
        com.alibaba.ability.e.a(new f(z), 200L);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1898991821);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
