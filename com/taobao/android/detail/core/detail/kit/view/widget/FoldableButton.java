package com.taobao.android.detail.core.detail.kit.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class FoldableButton extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BACK_ALPHA = 225;
    private static final int BORDER_WIDTH = 1;
    private static final int DEFAULT_CONTENT_TEXT_COLOR;
    private static final int DEFAULT_CONTENT_TEXT_SIZE;
    private static final int DEFAULT_ICONFONT_TEXT_SIZE;
    private static final int DEFAULT_ICON_TEXT_COLOR;
    private static final int DEFAULT_ICON_TEXT_SIZE;
    private static final int IS_SLIDE_DECREASE = 0;
    private static final int IS_SLIDE_INCREASE = 1;
    private static final String TAG = "FoldableButton";
    private int backgroundColor;
    private boolean canClick;
    private String contentText;
    private int contentTextColor;
    private float contentTextSize;
    private TextView contentView;
    private float default_content_icon_space;
    private float degrees;
    private float gapBetweenCircles;
    private float height;
    private Drawable icon;
    private float iconHeight;
    private String iconText;
    private int iconTextColor;
    private float iconTextSize;
    private TextView iconTitleView;
    private String iconUrl;
    private LinearLayout iconView;
    private float iconWidth;
    private boolean initWithFolded;
    private boolean inited;
    private boolean isFolded;
    private boolean isIconRotatable;
    private boolean isIncrease;
    private DetailImageView ivIcon;
    private boolean leftStart;
    private Handler mHandler;
    private a mLeftCircle;
    private a mRightCircle;
    private float maxWidth;
    private c onClickListener;
    private d onFoldStatusChangeListener;
    private Paint paint;
    private float radius;
    private RectF rectF;
    private float rotateDegrees;
    private FoldableButton sfb;
    private float step;
    private float stepRatio;
    private int textHeight;
    private int textWidth;
    private float width;
    private float windowWidth;
    private WindowManager wm;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public float f9586a;
        public float b;
        public float c;

        static {
            kge.a(-169330988);
        }

        public a() {
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(FoldableButton foldableButton);
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    private void calculateContentToShow(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4321f932", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public static /* synthetic */ Object ipc$super(FoldableButton foldableButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == 623593120) {
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ void access$100(FoldableButton foldableButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9596e7", new Object[]{foldableButton});
        } else {
            foldableButton.calculateFieldsWhenDecrease();
        }
    }

    public static /* synthetic */ void access$200(FoldableButton foldableButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d641568", new Object[]{foldableButton});
        } else {
            foldableButton.calculateFieldsWhenIncrease();
        }
    }

    public static /* synthetic */ void access$300(FoldableButton foldableButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3293e9", new Object[]{foldableButton});
        } else {
            foldableButton.reSetContentTextViewLayoutParams();
        }
    }

    static {
        kge.a(-2096881856);
        DEFAULT_CONTENT_TEXT_COLOR = Color.parseColor("#333333");
        DEFAULT_ICON_TEXT_COLOR = Color.parseColor("#333333");
        DEFAULT_CONTENT_TEXT_SIZE = (int) (epo.f27511a * 13.0f);
        DEFAULT_ICONFONT_TEXT_SIZE = (int) (epo.f27511a * 17.0f);
        DEFAULT_ICON_TEXT_SIZE = (int) (epo.f27511a * 9.0f);
    }

    public FoldableButton(Context context) {
        this(context, null);
    }

    public FoldableButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FoldableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.contentText = "";
        this.iconText = "";
        this.step = 80.0f;
        this.degrees = 0.0f;
        this.stepRatio = 0.16f;
        this.default_content_icon_space = 0.0f;
        this.isIncrease = true;
        this.isFolded = false;
        this.leftStart = false;
        this.isIconRotatable = false;
        this.initWithFolded = false;
        this.inited = false;
        this.mHandler = initHandler();
        init(context, attributeSet);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.FoldableButton");
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        initSelf();
        initFields(context, attributeSet);
        initData();
        initContentTextView(context);
        initIconView(context);
        initIconViewRotate();
    }

    private void initSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce188703", new Object[]{this});
            return;
        }
        setOrientation(0);
        setPadding(0, 0, 0, 0);
        if (this.leftStart) {
            setGravity(3);
        } else {
            setGravity(5);
        }
        this.wm = (WindowManager) getContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        this.windowWidth = this.wm.getDefaultDisplay().getWidth();
        this.sfb = this;
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mLeftCircle = new a();
        this.mRightCircle = new a();
        this.paint = new Paint(1);
        this.paint.setColor(-1);
    }

    private void initFields(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22393b36", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FoldableButton);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.FoldableButton_fb_backgroundColor, Color.parseColor("#e3ffffff"));
        this.contentTextColor = obtainStyledAttributes.getColor(R.styleable.FoldableButton_contentTextColor, DEFAULT_CONTENT_TEXT_COLOR);
        this.contentTextSize = obtainStyledAttributes.getDimension(R.styleable.FoldableButton_contentTextSize, DEFAULT_CONTENT_TEXT_SIZE);
        this.contentText = obtainStyledAttributes.getString(R.styleable.FoldableButton_contentText);
        this.iconTextColor = obtainStyledAttributes.getColor(R.styleable.FoldableButton_iconTextColor, DEFAULT_ICON_TEXT_COLOR);
        this.iconTextSize = obtainStyledAttributes.getDimension(R.styleable.FoldableButton_iconTextSize, DEFAULT_ICON_TEXT_SIZE);
        this.iconText = obtainStyledAttributes.getString(R.styleable.FoldableButton_iconText);
        this.degrees = obtainStyledAttributes.getFloat(R.styleable.FoldableButton_iconRotateDegree, 90.0f);
        this.stepRatio = obtainStyledAttributes.getFloat(R.styleable.FoldableButton_stepRatio, 0.08f);
        this.icon = obtainStyledAttributes.getDrawable(R.styleable.FoldableButton_icon);
        float f = this.stepRatio;
        if (f < 0.0f || f > 1.0f) {
            this.stepRatio = 0.16f;
        }
        this.isIconRotatable = obtainStyledAttributes.getBoolean(R.styleable.FoldableButton_iconRotatable, false);
        this.maxWidth = obtainStyledAttributes.getDimension(R.styleable.FoldableButton_maxWidth, this.windowWidth);
        this.initWithFolded = obtainStyledAttributes.getBoolean(R.styleable.FoldableButton_initFolded, true);
        this.isFolded = this.initWithFolded;
        this.default_content_icon_space = obtainStyledAttributes.getDimension(R.styleable.FoldableButton_contentIconSpace, 10.0f);
        this.leftStart = obtainStyledAttributes.getBoolean(R.styleable.FoldableButton_iconLeft, false);
        this.radius = obtainStyledAttributes.getDimension(R.styleable.FoldableButton_radius, epo.f27511a * 22.0f);
        obtainStyledAttributes.recycle();
    }

    private void initContentTextView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0821926", new Object[]{this, context});
            return;
        }
        this.contentTextColor = DEFAULT_CONTENT_TEXT_COLOR;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = new TextView(context);
        textView.setTag("content");
        textView.setLayoutParams(layoutParams);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxWidth(epo.b(250));
        textView.setGravity(17);
        textView.setText(this.contentText);
        textView.setTextSize(0, this.contentTextSize);
        textView.setTextColor(this.contentTextColor);
        if (Build.VERSION.SDK_INT > 17) {
            textView.setTextAlignment(4);
        }
        this.contentView = textView;
        addView(textView, layoutParams);
        requestLayout();
    }

    private void initIconView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21618bf3", new Object[]{this, context});
            return;
        }
        this.iconTextColor = DEFAULT_CONTENT_TEXT_COLOR;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.ivIcon = new DetailImageView(context);
        this.ivIcon.setLayoutParams(layoutParams2);
        this.ivIcon.setPadding(0, 0, 0, 0);
        this.ivIcon.setImageDrawable(this.icon);
        this.ivIcon.setScaleType(ImageView.ScaleType.CENTER_CROP);
        linearLayout.addView(this.ivIcon, layoutParams2);
        linearLayout.setTag("icon");
        this.iconView = linearLayout;
        addView(this.iconView, layoutParams);
        requestLayout();
    }

    private void initIconViewRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ac46f0", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.iconView;
        if (linearLayout == null) {
            return;
        }
        if (this.initWithFolded) {
            linearLayout.setRotation(0.0f);
        } else {
            linearLayout.setRotation(this.degrees);
        }
    }

    private Handler initHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8a3f8185", new Object[]{this}) : new b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (this.width == 0.0f) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getTag() != null) {
                    if (childAt.getTag().equals("content")) {
                        this.contentView = (TextView) childAt;
                    } else if (childAt.getTag().equals("icon")) {
                        this.iconView = (LinearLayout) childAt;
                    }
                }
            }
            if (this.contentView == null || this.iconView == null) {
                setMeasuredDimension((int) this.width, (int) this.height);
                super.onMeasure(i, i2);
            }
            measureChild(this.contentView, i, i2);
            this.textWidth = this.contentView.getMeasuredWidth();
            this.textHeight = this.contentView.getMeasuredHeight();
            measureChild(this.iconView, i, i2);
            this.iconWidth = this.iconView.getMeasuredWidth();
            this.iconHeight = this.iconView.getMeasuredHeight();
            setWidthAndHeight(i, i2);
            this.rotateDegrees = this.degrees;
            this.step = (int) ((this.width - this.iconWidth) * this.stepRatio);
        }
        setMeasuredDimension((int) Math.ceil(this.width), (int) Math.ceil(this.height));
    }

    private void setWidthAndHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701eeb61", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.height = this.radius * 2.0f;
        } else {
            this.height = View.MeasureSpec.getSize(i2);
            float f = this.height;
            float f2 = this.radius;
            if (f < f2 * 2.0f) {
                this.height = f2 * 2.0f;
            }
        }
        this.radius = this.height / 2.0f;
        float f3 = this.radius;
        this.iconWidth = f3 * 2.0f;
        this.iconHeight = f3 * 2.0f;
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            float f4 = this.maxWidth;
            if (f4 > 0.0f) {
                int i3 = this.textWidth;
                float f5 = this.radius;
                float f6 = this.iconWidth;
                float f7 = this.default_content_icon_space;
                if (i3 + f5 + f6 + f7 < f4) {
                    this.width = i3 + f5 + f6 + f7;
                }
            }
            this.width = this.maxWidth;
        } else {
            this.width = View.MeasureSpec.getSize(i);
            float f8 = this.width;
            float f9 = this.maxWidth;
            if (f8 > f9) {
                this.width = f9;
            }
        }
        reSetContentTextViewLayoutParams();
        reSetIconViewLayoutParams();
        if (!this.inited) {
            initCirclePositions();
            this.inited = true;
        }
        this.gapBetweenCircles = Math.abs(this.mRightCircle.f9586a - this.mLeftCircle.f9586a);
    }

    private void initCirclePositions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9139d1", new Object[]{this});
        } else if (!this.initWithFolded) {
            a aVar = this.mLeftCircle;
            float f = this.radius;
            aVar.f9586a = (int) f;
            aVar.b = (int) f;
            aVar.c = f;
            a aVar2 = this.mRightCircle;
            aVar2.f9586a = this.width - f;
            aVar2.b = (int) f;
            aVar2.c = f;
        } else if (this.leftStart) {
            a aVar3 = this.mLeftCircle;
            float f2 = this.radius;
            aVar3.f9586a = f2;
            aVar3.b = f2;
            aVar3.c = f2;
            a aVar4 = this.mRightCircle;
            aVar4.f9586a = f2;
            aVar4.b = f2;
            aVar4.c = f2;
        } else {
            a aVar5 = this.mLeftCircle;
            float f3 = this.width;
            float f4 = this.radius;
            aVar5.f9586a = f3 - f4;
            aVar5.b = f4;
            aVar5.c = f4;
            a aVar6 = this.mRightCircle;
            aVar6.f9586a = f3 - f4;
            aVar6.b = f4;
            aVar6.c = f4;
        }
    }

    private void reSetContentTextViewLayoutParams() {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269495d3", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.contentView.getLayoutParams();
        if (layoutParams2 != null && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
        }
        layoutParams.height = -2;
        layoutParams.width = (int) (((this.width - this.radius) - this.iconWidth) - this.default_content_icon_space);
        layoutParams.gravity = 16;
        this.contentView.setLayoutParams(layoutParams);
    }

    private void reSetIconViewLayoutParams() {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc3b104", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.iconView.getLayoutParams();
        if (layoutParams2 != null && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = new LinearLayout.LayoutParams((int) this.iconWidth, (int) this.iconHeight);
        }
        layoutParams.width = (int) (this.iconWidth - 1.0f);
        layoutParams.height = (int) (this.iconHeight - 1.0f);
        this.iconView.setBackgroundDrawable(com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b.a((int) ((this.height / 2.0f) - 1.0f), -1));
        this.iconView.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        this.paint.setColor(this.backgroundColor);
        drawRect(canvas);
        super.dispatchDraw(canvas);
    }

    private void drawRect(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487b676", new Object[]{this, canvas});
            return;
        }
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        RectF rectF = new RectF((int) Math.ceil(this.mLeftCircle.f9586a - this.radius), 0.0f, (int) Math.ceil(this.mRightCircle.f9586a + this.radius), (int) Math.ceil(this.height));
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(-1);
        this.paint.setAlpha(BACK_ALPHA);
        RectF rectF2 = new RectF((int) Math.ceil((this.mLeftCircle.f9586a - this.radius) + 1.0f), 1.0f, (int) Math.ceil((this.mRightCircle.f9586a + this.radius) - 1.0f), ((int) Math.ceil(this.height)) - 1);
        float f2 = this.radius;
        canvas.drawRoundRect(rectF2, f2 - 1.0f, f2 - 1.0f, this.paint);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.leftStart) {
            TextView textView = this.contentView;
            float f = this.mLeftCircle.f9586a;
            float f2 = this.radius;
            textView.layout((int) (f + f2 + this.default_content_icon_space), (int) (f2 - (this.textHeight / 2)), (int) this.mRightCircle.f9586a, (int) (this.radius + (this.textHeight / 2)));
            this.iconView.layout((int) (this.mLeftCircle.f9586a - this.radius), (int) ((this.mLeftCircle.b - this.radius) - 1.0f), (int) (this.mLeftCircle.f9586a + this.radius), (int) (this.mLeftCircle.b + this.radius));
        } else {
            this.contentView.layout((int) this.mLeftCircle.f9586a, (int) ((this.height / 2.0f) - (this.textHeight / 2)), (int) ((this.width - this.iconWidth) - this.default_content_icon_space), (int) (this.mLeftCircle.b + (this.textHeight / 2)));
            this.iconView.layout((int) ((this.mRightCircle.f9586a - this.radius) + 1.0f), 1, (int) ((this.mRightCircle.f9586a + this.radius) - 1.0f), (int) (this.height - 1.0f));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.canClick = judgeCanClick(motionEvent.getX(), motionEvent.getY());
            if (!this.canClick) {
                return super.onTouchEvent(motionEvent);
            }
        } else if (action == 1 && this.canClick && this.onClickListener != null && isEnabled()) {
            this.onClickListener.a(this.sfb);
        }
        return true;
    }

    private boolean judgeCanClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1e5a35a", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (this.isIncrease) {
            if (f < this.width && f2 < this.height) {
                return true;
            }
        } else if (this.leftStart) {
            float f3 = this.radius;
            if (f < f3 * 2.0f && f2 < f3 * 2.0f) {
                return true;
            }
        } else {
            float f4 = this.width;
            float f5 = this.radius;
            if (f4 - (f5 * 2.0f) < f && f < f4 && f2 < f5 * 2.0f) {
                return true;
            }
        }
        return false;
    }

    public boolean isIncrease() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44960417", new Object[]{this})).booleanValue() : this.isIncrease;
    }

    public void startFold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19014e8a", new Object[]{this});
            return;
        }
        setEnabled(false);
        this.isIncrease = false;
        this.mHandler.sendEmptyMessageDelayed(0, 16L);
    }

    public void startUnFold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1847fc3", new Object[]{this});
            return;
        }
        setEnabled(false);
        this.isIncrease = true;
        this.mHandler.sendEmptyMessageDelayed(1, 40L);
    }

    public void startChangeFoldStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6b45ac", new Object[]{this});
        } else if (!this.isFolded) {
            startFold();
        } else {
            startUnFold();
        }
    }

    public boolean isFolded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f386db5", new Object[]{this})).booleanValue() : this.isFolded;
    }

    public void setOnFoldStatusChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a034daee", new Object[]{this, dVar});
        } else {
            this.onFoldStatusChangeListener = dVar;
        }
    }

    public void setOnClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de722252", new Object[]{this, cVar});
        } else {
            this.onClickListener = cVar;
        }
    }

    private void calculateFieldsWhenDecrease() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6762365e", new Object[]{this});
            return;
        }
        this.gapBetweenCircles = Math.abs(this.mRightCircle.f9586a - this.mLeftCircle.f9586a);
        if (this.gapBetweenCircles >= this.radius) {
            if (this.leftStart) {
                this.mRightCircle.f9586a -= this.step;
            } else {
                this.mLeftCircle.f9586a += this.step;
            }
            if (this.isIconRotatable && (linearLayout2 = this.iconView) != null) {
                this.rotateDegrees = this.degrees * (this.gapBetweenCircles / (this.width - (this.radius * 2.0f)));
                linearLayout2.setRotation(this.rotateDegrees);
            }
            calculateContentToShow(false, true);
            this.mHandler.sendEmptyMessageDelayed(0, 16L);
            return;
        }
        calculateContentToShow(true, true);
        if (this.leftStart) {
            this.mRightCircle.f9586a = (int) this.radius;
        } else {
            this.mLeftCircle.f9586a = (int) (this.width - this.radius);
        }
        this.gapBetweenCircles = 0.0f;
        if (this.isIconRotatable && (linearLayout = this.iconView) != null) {
            this.rotateDegrees = 0.0f;
            linearLayout.setRotation(this.rotateDegrees);
        }
        setEnabled(true);
        this.isFolded = true;
    }

    private void calculateFieldsWhenIncrease() {
        float f;
        float f2;
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e4ba02", new Object[]{this});
            return;
        }
        this.gapBetweenCircles = Math.abs(this.mRightCircle.f9586a - this.mLeftCircle.f9586a);
        if (this.gapBetweenCircles <= this.width - (3.0f * this.radius)) {
            if (this.leftStart) {
                this.mRightCircle.f9586a += this.step;
            } else {
                this.mLeftCircle.f9586a -= this.step;
            }
            calculateContentToShow(false, false);
            if (this.isIconRotatable && (linearLayout = this.iconView) != null) {
                this.rotateDegrees = this.degrees * (this.gapBetweenCircles / (this.width - (this.radius * 2.0f)));
                linearLayout.setRotation(this.rotateDegrees);
            }
            this.mHandler.sendEmptyMessageDelayed(1, 16L);
            return;
        }
        if (this.leftStart) {
            this.mRightCircle.f9586a = (int) (f - f2);
        } else {
            this.mLeftCircle.f9586a = (int) f2;
        }
        calculateContentToShow(true, false);
        this.gapBetweenCircles = this.width - this.radius;
        if (this.isIconRotatable) {
            this.rotateDegrees = this.degrees;
            LinearLayout linearLayout2 = this.iconView;
            if (linearLayout2 != null) {
                linearLayout2.setRotation(this.rotateDegrees);
            }
        }
        setEnabled(true);
        this.isFolded = false;
    }

    /* loaded from: classes4.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(565926937);
        }

        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                FoldableButton.access$100(FoldableButton.this);
            } else if (i == 1) {
                FoldableButton.access$200(FoldableButton.this);
            }
            FoldableButton.access$300(FoldableButton.this);
            FoldableButton.this.invalidate();
        }
    }

    public String getContentText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5d488e9", new Object[]{this}) : this.contentText;
    }

    public void setContentText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc73c315", new Object[]{this, str});
            return;
        }
        this.contentText = str;
        this.contentView.setText(str);
        requestLayout();
    }

    public int getContentTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b3f2c2d", new Object[]{this})).intValue() : this.contentView.getCurrentTextColor();
    }

    public void setContentTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb9807d", new Object[]{this, new Integer(i)});
            return;
        }
        this.contentTextColor = i;
        this.contentView.setTextColor(i);
    }

    public float getContentTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbdf2028", new Object[]{this})).floatValue() : this.contentTextSize;
    }

    public void setContentTextSizeDP(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e779c8", new Object[]{this, new Float(f)});
            return;
        }
        this.contentTextSize = f;
        this.contentView.setTextSize(1, f);
        requestLayout();
    }

    public DetailImageView getIconView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("3b6423fc", new Object[]{this}) : this.ivIcon;
    }

    public String getIconText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("273eadbd", new Object[]{this}) : this.iconTitleView.getText().toString();
    }

    public void setIconText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b746459", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.iconText = str;
        this.iconTitleView.setText(str);
    }

    public int getIconTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dbaef01", new Object[]{this})).intValue() : this.iconTitleView.getCurrentTextColor();
    }

    public void setIconTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cee7c1", new Object[]{this, new Integer(i)});
            return;
        }
        this.iconTextColor = i;
        this.iconTitleView.setTextColor(i);
    }

    public float getIconTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8435b2d4", new Object[]{this})).floatValue() : this.iconTitleView.getTextSize();
    }

    public void setIconTextSizeDP(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837efb04", new Object[]{this, new Float(f)});
            return;
        }
        this.iconTextSize = f;
        this.iconTitleView.setTextSize(1, f);
        requestLayout();
    }

    public float getDegrees() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df8d4ae8", new Object[]{this})).floatValue() : this.degrees;
    }

    public void setDegrees(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486576d4", new Object[]{this, new Float(f)});
        } else {
            this.degrees = f;
        }
    }

    public float getStepRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("890591e0", new Object[]{this})).floatValue() : this.stepRatio;
    }

    public void setStepRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa37bdc", new Object[]{this, new Float(f)});
        } else {
            this.stepRatio = f;
        }
    }

    public void setFolded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1d190b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isFolded = z;
        if (this.isFolded) {
            startFold();
        } else {
            startUnFold();
        }
        requestLayout();
    }

    public boolean isLeftStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2678369c", new Object[]{this})).booleanValue() : this.leftStart;
    }

    public void setLeftStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b871fc74", new Object[]{this, new Boolean(z)});
            return;
        }
        this.leftStart = z;
        requestLayout();
    }

    public float getMaxWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f83caf", new Object[]{this})).floatValue() : this.maxWidth;
    }

    public void setMaxWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e62955", new Object[]{this, new Float(f)});
            return;
        }
        this.maxWidth = f;
        requestLayout();
    }

    public boolean isCanClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30c7a26d", new Object[]{this})).booleanValue() : this.canClick;
    }

    public void setCanClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7242953", new Object[]{this, new Boolean(z)});
            return;
        }
        this.canClick = z;
        setEnabled(z);
    }
}
