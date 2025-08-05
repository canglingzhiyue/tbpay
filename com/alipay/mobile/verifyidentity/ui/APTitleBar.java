package com.alipay.mobile.verifyidentity.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.ui.APTextView;
import com.alipay.mobile.verifyidentity.ui.font.TextSizeGearGetter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class APTitleBar extends APRelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TITLE_CENTER = 17;
    public static final int TITLE_LEFT = 16;
    private APLinearLayout A;
    private APButton B;
    private View C;
    private ColorStateList D;
    private APRelativeLayout E;
    private final String F;
    private final String G;
    private final String H;
    private final String I;
    private final boolean J;
    private final boolean K;
    private final boolean L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private boolean R;
    private View S;

    /* renamed from: a  reason: collision with root package name */
    private APTextView f6078a;
    private APTextView b;
    private APRelativeLayout c;
    private APImageButton d;
    private APRelativeLayout e;
    private View f;
    private APButton g;
    private APRelativeLayout h;
    private APButton i;
    public float icon_height;
    public float icon_width;
    private APRelativeLayout j;
    private View k;
    private APButton l;
    private APRelativeLayout m;
    public float margin_left_generic;
    public float margin_right;
    public float margin_right_generic;
    public float margin_seperator;
    private View n;
    private APButton o;
    private APLinearLayout p;
    private APProgressBar q;
    private APRelativeLayout r;
    private APRelativeLayout s;
    private APButton t;
    public float touch_height;
    public float touch_width;
    private APButton u;
    private View v;
    private APRelativeLayout w;
    private APImageView x;
    private APRelativeLayout y;
    private APRelativeLayout z;

    public static /* synthetic */ Object ipc$super(APTitleBar aPTitleBar, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Deprecated
    public void setBackButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1e4d59", new Object[]{this, str});
        }
    }

    public APTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = null;
        this.R = false;
        this.margin_right = 0.0f;
        this.margin_right_generic = 0.0f;
        this.margin_left_generic = 0.0f;
        this.icon_height = 0.0f;
        this.icon_width = 0.0f;
        this.touch_height = 0.0f;
        this.touch_width = 0.0f;
        this.margin_seperator = 0.0f;
        LayoutInflater.from(context).inflate(R.layout.ap_title_bar, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.viTitleBar);
        this.F = obtainStyledAttributes.getString(R.styleable.viTitleBar_vi_titleText);
        this.G = obtainStyledAttributes.getString(R.styleable.viTitleBar_vi_genericButtonText);
        this.M = obtainStyledAttributes.getResourceId(R.styleable.viTitleBar_vi_genericButtonIcon, 0);
        this.H = obtainStyledAttributes.getString(R.styleable.viTitleBar_vi_rightText);
        this.N = obtainStyledAttributes.getResourceId(R.styleable.viTitleBar_vi_rightButtonIcon, 0);
        this.I = obtainStyledAttributes.getString(R.styleable.viTitleBar_vi_leftText);
        this.O = obtainStyledAttributes.getResourceId(R.styleable.viTitleBar_vi_leftButtonIcon, 0);
        this.J = obtainStyledAttributes.getBoolean(R.styleable.viTitleBar_vi_showSwitch, false);
        this.K = obtainStyledAttributes.getBoolean(R.styleable.viTitleBar_vi_showGenericButton, false);
        this.L = obtainStyledAttributes.getBoolean(R.styleable.viTitleBar_vi_showBackButton, true);
        this.Q = obtainStyledAttributes.getResourceId(R.styleable.viTitleBar_vi_backButtonIcon, 0);
        this.P = obtainStyledAttributes.getInt(R.styleable.viTitleBar_vi_titleType, 16);
        this.D = obtainStyledAttributes.getColorStateList(R.styleable.viTitleBar_vi_titleTextColor);
        obtainStyledAttributes.recycle();
        this.margin_right_generic = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_margin_right_generic);
        this.margin_left_generic = getResources().getDimensionPixelOffset(R.dimen.title_bar_icon_margin_left_generic);
        this.margin_seperator = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_margin_seperator);
        this.margin_right = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_margin_right);
        this.icon_height = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_height);
        this.icon_width = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_width);
        this.touch_height = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_touch_height);
        this.touch_width = getResources().getDimensionPixelSize(R.dimen.title_bar_icon_touch_width);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        TextSizeGearGetter textSizeGearGetter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        this.f6078a = (APTextView) findViewById(R.id.title_bar_title);
        this.b = (APTextView) findViewById(R.id.title_bar_title_second);
        this.e = (APRelativeLayout) findViewById(R.id.title_bar_generic_button_parent);
        this.f = findViewById(R.id.title_bar_generic_button_left_line);
        this.g = (APButton) findViewById(R.id.title_bar_generic_button);
        this.d = (APImageButton) findViewById(R.id.title_bar_back_button);
        this.p = (APLinearLayout) findViewById(R.id.switch_container);
        this.h = (APRelativeLayout) findViewById(R.id.title_bar_left_button_parent);
        this.i = (APButton) findViewById(R.id.title_bar_left_button);
        this.j = (APRelativeLayout) findViewById(R.id.title_bar_right_button_parent);
        this.k = findViewById(R.id.title_bar_right_button_left_line);
        this.l = (APButton) findViewById(R.id.title_bar_right_button);
        this.z = (APRelativeLayout) findViewById(R.id.title_bar_third_button_parent);
        this.C = findViewById(R.id.title_bar_third_button_right_line);
        this.B = (APButton) findViewById(R.id.title_bar_third_button);
        this.q = (APProgressBar) findViewById(R.id.title_bar_progress);
        this.c = (APRelativeLayout) findViewById(R.id.title_bar_top_ll);
        this.m = (APRelativeLayout) findViewById(R.id.title_bar_feedback_button_parent);
        this.n = findViewById(R.id.title_bar_feedback_button_left_line);
        this.o = (APButton) findViewById(R.id.title_bar_feedback_button);
        this.r = (APRelativeLayout) findViewById(R.id.titlebar_kenel);
        this.s = (APRelativeLayout) findViewById(R.id.title_bar_left_generic_button_parent);
        this.t = (APButton) findViewById(R.id.title_bar_left_generic_button);
        this.v = findViewById(R.id.title_bar_left_line);
        this.w = (APRelativeLayout) findViewById(R.id.title_bar_top_rl);
        this.x = (APImageView) findViewById(R.id.menu_click_icon);
        this.y = (APRelativeLayout) findViewById(R.id.title_bar_title_rl);
        this.A = (APLinearLayout) findViewById(R.id.left_switch_container);
        this.E = (APRelativeLayout) findViewById(R.id.title_bar_blank_mid);
        if (getContext() != null) {
            this.u = new APButton(getContext());
        }
        APTextView aPTextView = this.f6078a;
        if (aPTextView != null) {
            aPTextView.setOnTextChangeListener(new APTextView.OnTextViewTextChangeListener() { // from class: com.alipay.mobile.verifyidentity.ui.APTitleBar.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.ui.APTextView.OnTextViewTextChangeListener
                public void onTextViewTextChange(TextView textView, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b145b3d9", new Object[]{this, textView, str});
                        return;
                    }
                    Context context = APTitleBar.this.getContext();
                    if (context == null || !(context instanceof Activity)) {
                        return;
                    }
                    ((Activity) context).setTitle(str);
                }
            });
        }
        setTitleText(this.F);
        setGenericButtonText(this.G);
        int i = this.P;
        if (i != 16 && i == 17) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.w.setLayoutParams(layoutParams);
        }
        if (this.L) {
            this.d.setVisibility(0);
            this.v.setVisibility(0);
        } else {
            this.d.setVisibility(8);
            this.v.setVisibility(8);
            this.y.setPadding(getResources().getDimensionPixelSize(R.dimen.title_bar_no_back_left_padding), 0, getResources().getDimensionPixelSize(R.dimen.title_bar_no_back_right_padding), 0);
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.ui.APTitleBar.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    Context context = APTitleBar.this.getContext();
                    ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    if (context == null || !(context instanceof Activity)) {
                        return;
                    }
                    ((Activity) context).onBackPressed();
                } catch (Exception unused) {
                }
            }
        });
        int i2 = this.Q;
        if (i2 != 0) {
            setImageBackButtonIcon(i2);
        }
        if (this.M != 0) {
            setGenericButtonIcon(getResources().getDrawable(this.M));
        }
        if (this.O != 0) {
            setLeftButtonIcon(getResources().getDrawable(this.O));
        } else {
            setLeftButtonText(this.I);
        }
        if (this.N != 0) {
            setRightButtonIcon(getResources().getDrawable(this.N));
        } else {
            setRightButtonText(this.H);
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            this.f6078a.setTextColor(colorStateList);
        }
        boolean z = this.R;
        if (z) {
            this.f6078a.setDynamicTextSize(z);
            this.b.setDynamicTextSize(this.R);
        }
        if (this.f6078a.isDynamicTextSize() && (textSizeGearGetter = APTextView.getTextSizeGearGetter()) != null && textSizeGearGetter.getCurrentGear() > 3) {
            this.f6078a.setMaxEms(7);
        }
        setGenericButtonVisiable(this.K);
        setSwitchContainerVisiable(this.J);
        a();
    }

    public void setTitleText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6918030e", new Object[]{this, charSequence});
        } else {
            this.f6078a.setText(charSequence);
        }
    }

    public void setTitleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3edfb4", new Object[]{this, str});
        } else {
            this.f6078a.setText(str);
        }
    }

    public void setSwitchContainerVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931982bf", new Object[]{this, new Boolean(z)});
            return;
        }
        APLinearLayout aPLinearLayout = this.p;
        if (!z) {
            i = 8;
        }
        aPLinearLayout.setVisibility(i);
    }

    public void setGenericButtonVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a96ac83", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = 8;
        if (z && !TextUtils.isEmpty(this.g.getText().toString())) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        APRelativeLayout aPRelativeLayout = this.e;
        if (z) {
            i = 0;
        }
        aPRelativeLayout.setVisibility(i);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.l.getVisibility() == 0 && !TextUtils.isEmpty(this.l.getText())) {
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(8);
        }
        if (this.g.getVisibility() == 0 && !TextUtils.isEmpty(this.g.getText())) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        if (this.o.getVisibility() == 0 && !TextUtils.isEmpty(this.o.getText())) {
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
        if (this.B.getVisibility() == 0 && !TextUtils.isEmpty(this.B.getText())) {
            this.C.setVisibility(0);
        } else {
            this.C.setVisibility(8);
        }
    }

    public void setImageBackButtonIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c88cb1", new Object[]{this, new Integer(i)});
        } else {
            this.d.setImageResource(i);
        }
    }

    public void setGenericButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5947fc05", new Object[]{this, str});
            return;
        }
        if (this.g != null && !TextUtils.isEmpty(str)) {
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams.width = -2;
                this.g.setLayoutParams(layoutParams);
                this.g.setText(str);
            } catch (Exception unused) {
            }
        }
        a();
    }

    public void setLeftButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ee6879", new Object[]{this, str});
            return;
        }
        this.i.setText(str);
        a();
    }

    public void setRightButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fb97ca", new Object[]{this, str});
            return;
        }
        this.l.setText(str);
        a();
    }

    public APTextView getTitleTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APTextView) ipChange.ipc$dispatch("d3bc5910", new Object[]{this}) : this.f6078a;
    }

    @Deprecated
    public APButton getBackButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APButton) ipChange.ipc$dispatch("caa127b5", new Object[]{this}) : this.u;
    }

    public APRelativeLayout getTitlebarBg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APRelativeLayout) ipChange.ipc$dispatch("bd962ca", new Object[]{this}) : this.r;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        a(this.i, this.touch_height, this.touch_width);
        a(this.l, this.touch_height, this.touch_width);
        a(this.g, this.touch_height, this.touch_width);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.redpoint_top_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.redpoint_left_padding);
        View view = this.S;
        if (view == null) {
            return;
        }
        view.layout(((this.e.getLeft() + this.g.getRight()) - (this.S.getMeasuredWidth() / 2)) + dimensionPixelSize2, (this.g.getTop() - (this.S.getMeasuredHeight() / 2)) + dimensionPixelSize, this.e.getLeft() + this.g.getRight() + (this.S.getMeasuredWidth() / 2) + dimensionPixelSize2, this.g.getTop() + (this.S.getMeasuredHeight() / 2) + dimensionPixelSize);
    }

    public void setGenericButtonIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfaab7eb", new Object[]{this, drawable});
            return;
        }
        a(drawable, (RelativeLayout.LayoutParams) this.g.getLayoutParams(), this.icon_width, this.g);
        a();
    }

    public void setLeftButtonIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40426f5f", new Object[]{this, drawable});
            return;
        }
        a(drawable, (RelativeLayout.LayoutParams) this.i.getLayoutParams(), this.icon_width, this.i);
        a();
    }

    public void setRightButtonIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80eacc70", new Object[]{this, drawable});
            return;
        }
        a(drawable, (RelativeLayout.LayoutParams) this.l.getLayoutParams(), this.icon_width, this.l);
        a();
    }

    private static void a(Drawable drawable, ViewGroup.MarginLayoutParams marginLayoutParams, float f, APButton aPButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aceb9f2", new Object[]{drawable, marginLayoutParams, new Float(f), aPButton});
        } else if (drawable == null) {
        } else {
            int intrinsicHeight = drawable.getCurrent().getIntrinsicHeight();
            int intrinsicWidth = drawable.getCurrent().getIntrinsicWidth();
            float f2 = intrinsicWidth;
            if (f2 > f) {
                intrinsicWidth = (int) f;
                intrinsicHeight = (int) ((intrinsicHeight * f) / f2);
            }
            marginLayoutParams.height = intrinsicHeight;
            marginLayoutParams.width = intrinsicWidth;
            aPButton.setBackgroundDrawable(drawable);
            int i = (int) (((f - intrinsicWidth) / 2.0f) + 0.0f);
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            StringBuilder sb = new StringBuilder("leftMargin=");
            sb.append(marginLayoutParams.leftMargin);
            sb.append(", rightMargin=");
            sb.append(marginLayoutParams.rightMargin);
        }
    }

    private static void a(APButton aPButton, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e4ffd", new Object[]{aPButton, new Float(f), new Float(f2)});
            return;
        }
        Rect rect = new Rect();
        aPButton.getHitRect(rect);
        if (rect.height() < f) {
            int height = (int) ((f - rect.height()) / 2.0f);
            rect.top -= height;
            rect.bottom += height;
        }
        if (rect.width() < f2) {
            int width = (int) ((f2 - rect.width()) / 2.0f);
            rect.left -= width;
            rect.right += width;
        }
        TouchDelegate touchDelegate = new TouchDelegate(rect, aPButton);
        if (!View.class.isInstance(aPButton.getParent())) {
            return;
        }
        ((View) aPButton.getParent()).setTouchDelegate(touchDelegate);
    }

    public APButton getGenericButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APButton) ipChange.ipc$dispatch("1c7352f1", new Object[]{this}) : this.g;
    }
}
