package com.taobao.uikit.actionbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.taobao.TBActionBar;
import android.support.v7.taobao.TIconFontTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes9.dex */
public class TBActionView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBActionView";
    private Drawable mDotOrNumBackground;
    private Drawable mIcon;
    private int mIconColor;
    private int mIconSize;
    private TIconFontTextView mIconView;
    private TUrlImageView mImageView;
    private TBPublicMenuItem mMenuItem;
    private int mMessageBackgroundColor;
    private int mMessageDotHeight;
    private int mMessageDotMarginBottom;
    private int mMessageDotMarginLeft;
    private int mMessageDotWidth;
    private int mMessageNumColor;
    private int mMessageNumSize;
    private int mMessageOneNumHeigth;
    private int mMessageOneNumMarginBottom;
    private int mMessageOneNumMarginLeft;
    private int mMessageOneNumWdith;
    private TextView mMessageTextView;
    private int mMessageTwoNumHeight;
    private int mMessageTwoNumMarginBottom;
    private int mMessageTwoNumMarginLeft;
    private int mMessageTwoNumWidth;
    private int mMinimumHeight;
    private int mMinimumWidth;
    private TextView mTextView;
    private String mTitle;

    /* renamed from: com.taobao.uikit.actionbar.TBActionView$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle = new int[TBActionBar.ActionBarStyle.values().length];
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode;

        static {
            try {
                $SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle[TBActionBar.ActionBarStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle[TBActionBar.ActionBarStyle.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode = new int[TBPublicMenuItem.MessageMode.values().length];
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.DOT_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.DOT_WITH_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        kge.a(-435642789);
    }

    public static /* synthetic */ Object ipc$super(TBActionView tBActionView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBActionView(Context context) {
        this(context, null);
    }

    public TBActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMenuItem = null;
        inflate(context, R.layout.uik_public_menu_action_view, this);
        this.mIconView = (TIconFontTextView) findViewById(R.id.uik_public_menu_action_icon);
        this.mImageView = (TUrlImageView) findViewById(R.id.uik_public_menu_action_image);
        this.mTextView = (TextView) findViewById(R.id.uik_public_menu_action_text);
        this.mMessageTextView = (TextView) findViewById(R.id.uik_public_menu_action_message);
        initAttrs(context, attributeSet);
        onMessageUpdate(null);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266d01bf", new Object[]{this, context, attributeSet});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TBActionView, 0, 0);
            try {
                this.mMinimumHeight = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMinHeight, context.getResources().getDimension(R.dimen.uik_action_view_height));
                this.mMinimumWidth = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMinWidth, context.getResources().getDimension(R.dimen.uik_action_view_width));
                this.mTitle = obtainStyledAttributes.getString(R.styleable.TBActionView_uikTitle);
                this.mIcon = obtainStyledAttributes.getDrawable(R.styleable.TBActionView_uikIcon);
                this.mIconColor = obtainStyledAttributes.getColor(R.styleable.TBActionView_uikIconColor, ContextCompat.getColor(context, R.color.uik_action_icon_normal));
                this.mIconSize = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikIconSize, context.getResources().getDimension(R.dimen.uik_action_icon_height));
                this.mMessageNumColor = obtainStyledAttributes.getColor(R.styleable.TBActionView_uikMessageTextColor, ContextCompat.getColor(context, R.color.uik_action_message_num_normal));
                this.mMessageNumSize = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageTextSize, context.getResources().getDimension(R.dimen.uik_action_message_num_size));
                this.mMessageBackgroundColor = obtainStyledAttributes.getColor(R.styleable.TBActionView_uikMessageBackgroundColor, ContextCompat.getColor(context, R.color.uik_action_message_bg_normal));
                this.mMessageDotHeight = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageDotHeight, context.getResources().getDimension(R.dimen.uik_action_message_dot_height));
                this.mMessageDotWidth = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageDotWidth, context.getResources().getDimension(R.dimen.uik_action_message_dot_width));
                this.mMessageDotMarginBottom = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageDotMarginBottom, context.getResources().getDimension(R.dimen.uik_action_message_dot_margin_bottom));
                this.mMessageDotMarginLeft = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageDotMarginLeft, context.getResources().getDimension(R.dimen.uik_action_message_dot_margin_left));
                this.mMessageOneNumHeigth = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageOneNumHeight, context.getResources().getDimension(R.dimen.uik_action_message_one_num_height));
                this.mMessageOneNumWdith = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageOneNumWidth, context.getResources().getDimension(R.dimen.uik_action_message_one_num_width));
                this.mMessageOneNumMarginBottom = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageOneNumMarginBottom, context.getResources().getDimension(R.dimen.uik_action_message_one_num_margin_bottom));
                this.mMessageOneNumMarginLeft = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageOneNumMarginLeft, context.getResources().getDimension(R.dimen.uik_action_message_one_num_margin_left));
                this.mMessageTwoNumHeight = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageTwoNumHeight, context.getResources().getDimension(R.dimen.uik_action_message_two_num_height));
                this.mMessageTwoNumWidth = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageTwoNumWidth, context.getResources().getDimension(R.dimen.uik_action_message_two_num_width));
                this.mMessageTwoNumMarginBottom = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageTwoNumMarginBottom, context.getResources().getDimension(R.dimen.uik_action_message_two_num_margin_bottom));
                this.mMessageTwoNumMarginLeft = (int) obtainStyledAttributes.getDimension(R.styleable.TBActionView_uikMessageTwoNumMarginLeft, context.getResources().getDimension(R.dimen.uik_action_message_two_num_margin_left));
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.mMinimumHeight = (int) context.getResources().getDimension(R.dimen.uik_action_view_height);
            this.mMinimumWidth = (int) context.getResources().getDimension(R.dimen.uik_action_view_width);
            this.mTitle = "ꂍ:" + b.a(R.string.app_message);
            this.mIcon = null;
            this.mIconColor = ContextCompat.getColor(context, R.color.uik_action_icon_normal);
            this.mIconSize = (int) context.getResources().getDimension(R.dimen.uik_action_icon_height);
            this.mMessageNumColor = ContextCompat.getColor(context, R.color.uik_action_message_num_normal);
            this.mMessageNumSize = (int) context.getResources().getDimension(R.dimen.uik_action_message_num_size);
            this.mMessageBackgroundColor = ContextCompat.getColor(context, R.color.uik_action_message_bg_normal);
            this.mMessageDotHeight = (int) context.getResources().getDimension(R.dimen.uik_action_message_dot_height);
            this.mMessageDotWidth = (int) context.getResources().getDimension(R.dimen.uik_action_message_dot_width);
            this.mMessageDotMarginBottom = (int) context.getResources().getDimension(R.dimen.uik_action_message_dot_margin_bottom);
            this.mMessageDotMarginLeft = (int) context.getResources().getDimension(R.dimen.uik_action_message_dot_margin_left);
            this.mMessageOneNumHeigth = (int) context.getResources().getDimension(R.dimen.uik_action_message_one_num_height);
            this.mMessageOneNumWdith = (int) context.getResources().getDimension(R.dimen.uik_action_message_one_num_width);
            this.mMessageOneNumMarginBottom = (int) context.getResources().getDimension(R.dimen.uik_action_message_one_num_margin_bottom);
            this.mMessageOneNumMarginLeft = (int) context.getResources().getDimension(R.dimen.uik_action_message_one_num_margin_left);
            this.mMessageTwoNumHeight = (int) context.getResources().getDimension(R.dimen.uik_action_message_two_num_height);
            this.mMessageTwoNumWidth = (int) context.getResources().getDimension(R.dimen.uik_action_message_two_num_width);
            this.mMessageTwoNumMarginBottom = (int) context.getResources().getDimension(R.dimen.uik_action_message_two_num_margin_bottom);
            this.mMessageTwoNumMarginLeft = (int) context.getResources().getDimension(R.dimen.uik_action_message_two_num_margin_left);
        }
        setMinimumHeight(this.mMinimumHeight);
        setMinimumWidth(this.mMinimumWidth);
        this.mIconView.setTextSize(0, this.mIconSize);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mImageView.getLayoutParams();
        int i = this.mIconSize;
        layoutParams.height = i;
        layoutParams.width = i;
        this.mImageView.setLayoutParams(layoutParams);
        this.mIconView.setTextColor(this.mIconColor);
        this.mTextView.setTextColor(this.mIconColor);
        this.mMessageTextView.setTextColor(this.mMessageNumColor);
        this.mMessageTextView.setTextSize(0, this.mMessageNumSize);
        Drawable drawable = this.mIcon;
        if (drawable != null) {
            this.mImageView.setImageDrawable(drawable);
            this.mImageView.setVisibility(0);
            this.mIconView.setVisibility(8);
            this.mTextView.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.mTitle)) {
            setTitle(this.mTitle);
        }
        this.mDotOrNumBackground = getContext().getResources().getDrawable(R.drawable.uik_action_message_dot_bg);
        updateMessageView(false);
    }

    public void onMessageUpdate(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f6c84e", new Object[]{this, tBPublicMenuItem});
        } else if (tBPublicMenuItem != null && !tBPublicMenuItem.checkValidation()) {
            Log.e(TAG, "Something wrong with you action view!");
        } else {
            this.mMenuItem = tBPublicMenuItem;
            if (tBPublicMenuItem == null || tBPublicMenuItem.getMessageMode() == TBPublicMenuItem.MessageMode.NONE) {
                this.mMessageTextView.setVisibility(8);
            } else {
                updateMessageView(false);
            }
        }
    }

    private void updateMessageView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e05664a", new Object[]{this, new Boolean(z)});
        } else if (this.mMenuItem == null) {
        } else {
            if (!z) {
                if (this.mMessageTextView.getVisibility() == 0 && this.mMessageTextView.getText().equals(this.mMenuItem.getMessage())) {
                    return;
                }
                if (this.mMessageTextView.getVisibility() == 0 && this.mMenuItem.getMessageMode() == TBPublicMenuItem.MessageMode.DOT_WITH_NUMBER && this.mMessageTextView.getText().equals("···") && Integer.valueOf(this.mMenuItem.getMessage()).intValue() > 99) {
                    return;
                }
            }
            this.mMessageTextView.setTextColor(this.mMessageNumColor);
            setContentDescription(((Object) getContentDescription()) + this.mMenuItem.getMessage());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mMessageTextView.getLayoutParams();
            int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[this.mMenuItem.getMessageMode().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    int intValue = Integer.valueOf(this.mMenuItem.getMessage()).intValue();
                    if (intValue > 99) {
                        updateMessageBackground(R.drawable.uik_action_message_more_bg);
                        layoutParams.height = this.mMessageTwoNumHeight;
                        layoutParams.width = this.mMessageTwoNumWidth;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = this.mMessageTwoNumMarginLeft;
                        layoutParams.bottomMargin = this.mMessageTwoNumMarginBottom;
                        layoutParams.rightMargin = 0;
                        layoutParams.gravity = 17;
                        if (Build.MANUFACTURER.equals("Xiaomi")) {
                            this.mMessageTextView.setText("•••");
                        } else {
                            this.mMessageTextView.setText("···");
                        }
                        this.mMessageTextView.setLayoutParams(layoutParams);
                        this.mMessageTextView.setVisibility(0);
                    } else if (intValue >= 10) {
                        updateMessageBackground(R.drawable.uik_action_message_more_bg);
                        layoutParams.height = this.mMessageTwoNumHeight;
                        layoutParams.width = this.mMessageTwoNumWidth;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = this.mMessageTwoNumMarginLeft;
                        layoutParams.bottomMargin = this.mMessageTwoNumMarginBottom;
                        layoutParams.rightMargin = 0;
                        layoutParams.gravity = 17;
                        this.mMessageTextView.setText(String.valueOf(this.mMenuItem.getMessage()));
                        this.mMessageTextView.setLayoutParams(layoutParams);
                        this.mMessageTextView.setVisibility(0);
                    } else if (intValue > 0) {
                        updateMessageBackground(R.drawable.uik_action_message_dot_bg);
                        layoutParams.height = this.mMessageOneNumHeigth;
                        layoutParams.width = this.mMessageOneNumWdith;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = this.mMessageOneNumMarginLeft;
                        layoutParams.bottomMargin = this.mMessageOneNumMarginBottom;
                        layoutParams.rightMargin = 0;
                        layoutParams.gravity = 17;
                        this.mMessageTextView.setText(String.valueOf(this.mMenuItem.getMessage()));
                        this.mMessageTextView.setLayoutParams(layoutParams);
                        this.mMessageTextView.setVisibility(0);
                    } else {
                        this.mMessageTextView.setVisibility(8);
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        this.mMessageTextView.setVisibility(8);
                    }
                } else if (!TextUtils.isEmpty(this.mMenuItem.getMessage())) {
                    updateMessageBackground(R.drawable.uik_action_message_more_bg);
                    layoutParams.height = this.mMessageTwoNumHeight;
                    layoutParams.width = -2;
                    layoutParams.topMargin = 0;
                    layoutParams.leftMargin = this.mMessageTwoNumMarginLeft;
                    layoutParams.bottomMargin = this.mMessageTwoNumMarginBottom;
                    layoutParams.rightMargin = 0;
                    layoutParams.gravity = 17;
                    this.mMessageTextView.setLayoutParams(layoutParams);
                    this.mMessageTextView.setText(this.mMenuItem.getMessage());
                    this.mMessageTextView.setVisibility(0);
                } else {
                    this.mMessageTextView.setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(this.mMenuItem.getMessage())) {
                updateMessageBackground(R.drawable.uik_action_message_dot_bg);
                layoutParams.height = this.mMessageDotHeight;
                layoutParams.width = this.mMessageDotWidth;
                layoutParams.topMargin = 0;
                layoutParams.leftMargin = this.mMessageDotMarginLeft;
                layoutParams.bottomMargin = this.mMessageDotMarginBottom;
                layoutParams.rightMargin = 0;
                layoutParams.gravity = 17;
                this.mMessageTextView.setLayoutParams(layoutParams);
                this.mMessageTextView.setText("");
                this.mMessageTextView.setVisibility(0);
            } else {
                this.mMessageTextView.setVisibility(8);
            }
            this.mMessageTextView.invalidate();
            this.mMessageTextView.requestLayout();
        }
    }

    private void updateMessageBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46743810", new Object[]{this, new Integer(i)});
            return;
        }
        this.mDotOrNumBackground = getContext().getResources().getDrawable(i);
        this.mDotOrNumBackground.mutate();
        Drawable drawable = this.mDotOrNumBackground;
        if (drawable != null && (drawable instanceof GradientDrawable)) {
            ((GradientDrawable) drawable).setColor(this.mMessageBackgroundColor);
        }
        if (Build.VERSION.SDK_INT < 16) {
            this.mMessageTextView.setBackgroundDrawable(this.mDotOrNumBackground);
        } else {
            this.mMessageTextView.setBackground(this.mDotOrNumBackground);
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.length() >= 2 && str.charAt(1) == ':') {
                this.mIconView.setText(str.substring(0, 1));
                if (str.length() > 2) {
                    setContentDescription(str.substring(2));
                }
                this.mIconView.setTextColor(this.mIconColor);
                this.mIconView.setVisibility(0);
                this.mImageView.setVisibility(8);
                this.mTextView.setVisibility(8);
                return;
            }
            this.mTextView.setText(str);
            this.mTextView.setTextColor(this.mIconColor);
            this.mTextView.setVisibility(0);
            this.mIconView.setVisibility(8);
            this.mImageView.setVisibility(8);
        }
    }

    public void setIconColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8584034", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIconColor = i;
        TIconFontTextView tIconFontTextView = this.mIconView;
        if (tIconFontTextView == null) {
            return;
        }
        tIconFontTextView.setTextColor(i);
        this.mTextView.setTextColor(i);
    }

    public void setMessageNumColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887c6cba", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMessageNumColor = i;
        TextView textView = this.mMessageTextView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public void setMessageBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133a228a", new Object[]{this, new Integer(i)});
        } else {
            updateMessageView(true);
        }
    }

    public void setMessageBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbefee8c", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMessageBackgroundColor = i;
        updateMessageView(true);
    }

    public void setDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17dcaf4b", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            this.mIcon = drawable;
            this.mImageView.setImageDrawable(drawable);
            this.mImageView.setVisibility(0);
            this.mIconView.setVisibility(8);
            this.mTextView.setVisibility(8);
        }
    }

    public void switchActionStyle(TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c06681", new Object[]{this, actionBarStyle});
            return;
        }
        int i = AnonymousClass1.$SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle[actionBarStyle.ordinal()];
        if (i == 1) {
            this.mIconColor = getContext().getResources().getColor(R.color.uik_action_icon_dark);
            this.mMessageBackgroundColor = getContext().getResources().getColor(R.color.uik_action_message_bg_dark);
            this.mMessageNumColor = getContext().getResources().getColor(R.color.uik_action_message_num_dark);
        } else if (i == 2) {
            this.mIconColor = getContext().getResources().getColor(R.color.uik_action_icon_normal);
            this.mMessageBackgroundColor = getContext().getResources().getColor(R.color.uik_action_message_bg_normal);
            this.mMessageNumColor = getContext().getResources().getColor(R.color.uik_action_message_num_normal);
        }
        this.mIconView.setTextColor(this.mIconColor);
        this.mTextView.setTextColor(this.mIconColor);
        updateMessageView(true);
    }

    public View getIconView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c9fc0e3d", new Object[]{this}) : this.mIconView;
    }
}
