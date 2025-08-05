package com.alipay.zoloz.toyger.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class ToygerTitleBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "APTitleBar";
    public float icon_height;
    public float icon_width;
    private Button mBackButton;
    private Button mLeftButton;
    private int mLeftButtonIcon;
    private View mNewFlagView;
    private Button mRightButton;
    private TextView mSecondTitleTextView;
    private Button mSoundButton;
    private LinearLayout mSwitchContainer;
    private int mTitleColor;
    private String mTitleText;
    private TextView mTitleTextView;
    public float margin_right;
    public float margin_right_generic;
    public float margin_seperator;
    public boolean needHidden;
    private boolean showBackButton;
    private boolean showSoundButton;
    public float touch_height;
    public float touch_width;

    public static /* synthetic */ Object ipc$super(ToygerTitleBar toygerTitleBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode != -244855388) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.needHidden && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    public ToygerTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.margin_right = 0.0f;
        this.margin_right_generic = 0.0f;
        this.icon_height = 0.0f;
        this.icon_width = 0.0f;
        this.touch_height = 0.0f;
        this.touch_width = 0.0f;
        this.margin_seperator = 0.0f;
        this.needHidden = false;
        LayoutInflater.from(context).inflate(R.layout.toyger_circle_title_bar, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.toyger_titleBar);
        this.mTitleText = obtainStyledAttributes.getString(R.styleable.toyger_titleBar_toyger_titleText);
        this.showBackButton = obtainStyledAttributes.getBoolean(R.styleable.toyger_titleBar_toyger_showBackButton, true);
        this.mTitleColor = obtainStyledAttributes.getColor(R.styleable.toyger_titleBar_toyger_title_color, context.getResources().getColor(17170443));
        this.mLeftButtonIcon = obtainStyledAttributes.getResourceId(R.styleable.toyger_titleBar_toyger_leftButtonIcon, 0);
        this.showSoundButton = obtainStyledAttributes.getBoolean(R.styleable.toyger_titleBar_toyger_showSoundButton, true);
        obtainStyledAttributes.recycle();
        this.icon_height = getResources().getDimensionPixelSize(R.dimen.toyger_title_bar_icon_height);
        this.icon_width = getResources().getDimensionPixelSize(R.dimen.toyger_title_bar_icon_width);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        this.mTitleTextView = (TextView) findViewById(R.id.title_bar_title);
        this.mSecondTitleTextView = (TextView) findViewById(R.id.title_bar_title_second);
        this.mBackButton = (Button) findViewById(R.id.title_bar_back_button);
        this.mSoundButton = (Button) findViewById(R.id.title_bar_sound_button);
        setTitleText(this.mTitleText);
        setTitleColer(this.mTitleColor);
        if (this.showSoundButton) {
            this.mSoundButton.setVisibility(0);
        } else {
            this.mSoundButton.setVisibility(8);
        }
        int i = this.mLeftButtonIcon;
        if (i != 0) {
            setLeftButtonIconResource(i);
        }
        initBackbutton();
    }

    public void setSoundButton(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4642f35d", new Object[]{this, new Integer(i)});
        } else {
            this.mSoundButton.setVisibility(i);
        }
    }

    public void enableSound(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac58161", new Object[]{this, new Boolean(z)});
            return;
        }
        Drawable drawable = this.mSoundButton.getCompoundDrawables()[2];
        if (z) {
            drawable.setLevel(0);
        } else {
            drawable.setLevel(1);
        }
    }

    public void setCloseButtonVisible(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd159fd2", new Object[]{this, new Integer(i)});
        } else {
            this.mBackButton.setVisibility(i);
        }
    }

    public void setSoundButtonVisible(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b829329", new Object[]{this, new Integer(i)});
        } else {
            this.mSoundButton.setVisibility(i);
        }
    }

    public void setTimeOut(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee91fd0", new Object[]{this, str});
            return;
        }
        Button button = this.mSoundButton;
        if (button == null) {
            return;
        }
        button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.mSoundButton.setVisibility(0);
        this.mSoundButton.setText(str);
        requestLayout();
    }

    public Button getTimeOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("b4810c06", new Object[]{this}) : this.mSoundButton;
    }

    public void setTitleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3edfb4", new Object[]{this, str});
        } else {
            this.mTitleTextView.setText(str);
        }
    }

    public void setTitleColer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37048105", new Object[]{this, new Integer(i)});
        } else {
            this.mTitleTextView.setTextColor(i);
        }
    }

    public void setBackButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1e4d59", new Object[]{this, str});
        } else if (!this.showBackButton) {
        } else {
            this.mBackButton.setVisibility(0);
            this.mBackButton.setText(str);
        }
    }

    public void setBackButtonListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cc68a3", new Object[]{this, onClickListener});
            return;
        }
        this.mBackButton.setVisibility(0);
        this.mBackButton.setOnClickListener(onClickListener);
    }

    public void setSoundButtonListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a8a9bf", new Object[]{this, onClickListener});
            return;
        }
        this.mSoundButton.setVisibility(0);
        this.mSoundButton.setOnClickListener(onClickListener);
    }

    public void setSwitchContainerVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931982bf", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mSwitchContainer;
        if (!z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public void attachNewFlagView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f7b4ff", new Object[]{this, view});
            return;
        }
        this.mNewFlagView = view;
        addView(this.mNewFlagView);
    }

    public void unAttachNewFlagView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14d5ab8", new Object[]{this, view});
            return;
        }
        View view2 = this.mNewFlagView;
        if (view2 == null) {
            return;
        }
        removeView(view2);
        this.mNewFlagView = null;
    }

    public void setLeftButtonListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49628183", new Object[]{this, onClickListener});
        } else {
            this.mLeftButton.setOnClickListener(onClickListener);
        }
    }

    public void setRightButtonListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9208bed2", new Object[]{this, onClickListener});
        } else {
            this.mRightButton.setOnClickListener(onClickListener);
        }
    }

    public Button getLeftButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("efe2080a", new Object[]{this}) : this.mLeftButton;
    }

    public TextView getTitleTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5646322f", new Object[]{this}) : this.mTitleTextView;
    }

    public Button getBackButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("a611ecea", new Object[]{this}) : this.mBackButton;
    }

    public TextView getSecondTitleTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("51f0809b", new Object[]{this}) : this.mSecondTitleTextView;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void setLeftButtonIconResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421953a", new Object[]{this, new Integer(i)});
        } else {
            setLeftButtonIcon(getResources().getDrawable(i));
        }
    }

    public void setRightButtonIconResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396fb6c9", new Object[]{this, new Integer(i)});
        } else {
            setRightButtonIcon(getResources().getDrawable(i));
        }
    }

    public void setLeftButtonIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40426f5f", new Object[]{this, drawable});
        } else {
            layoutButton(drawable, (LinearLayout.LayoutParams) this.mLeftButton.getLayoutParams(), 0.0f, this.margin_seperator, this.icon_width, this.mLeftButton);
        }
    }

    public void setRightButtonIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80eacc70", new Object[]{this, drawable});
        } else {
            layoutButton(drawable, (LinearLayout.LayoutParams) this.mRightButton.getLayoutParams(), this.margin_seperator, this.margin_right, this.icon_width, this.mRightButton);
        }
    }

    private void layoutButton(Drawable drawable, ViewGroup.MarginLayoutParams marginLayoutParams, float f, float f2, float f3, Button button) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a7740c", new Object[]{this, drawable, marginLayoutParams, new Float(f), new Float(f2), new Float(f3), button});
        } else if (drawable == null) {
        } else {
            int intrinsicHeight = drawable.getCurrent().getIntrinsicHeight();
            int intrinsicWidth = drawable.getCurrent().getIntrinsicWidth();
            float f4 = intrinsicWidth;
            if (f4 > f3) {
                intrinsicWidth = (int) f3;
                intrinsicHeight = (int) ((intrinsicHeight * f3) / f4);
            }
            marginLayoutParams.height = intrinsicHeight;
            marginLayoutParams.width = intrinsicWidth;
            button.setBackgroundDrawable(drawable);
            float f5 = (f3 - intrinsicWidth) / 2.0f;
            marginLayoutParams.leftMargin = (int) (f + f5);
            marginLayoutParams.rightMargin = (int) (f5 + f2);
        }
    }

    private void adjustTouchDelegate(Button button, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d294c1e8", new Object[]{this, button, new Float(f), new Float(f2)});
            return;
        }
        Rect rect = new Rect();
        button.getHitRect(rect);
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
        TouchDelegate touchDelegate = new TouchDelegate(rect, button);
        if (!View.class.isInstance(button.getParent())) {
            return;
        }
        ((View) button.getParent()).setTouchDelegate(touchDelegate);
    }

    private void initBackbutton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a7d2810", new Object[]{this});
        } else {
            this.mBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.ToygerTitleBar.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    try {
                        Context context = ToygerTitleBar.this.getContext();
                        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        if (context == null || !(context instanceof Activity)) {
                            return;
                        }
                        ((Activity) context).onBackPressed();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
