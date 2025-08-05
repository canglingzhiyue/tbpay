package com.ali.user.mobile.base.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserCustomToolbar extends Toolbar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;

    static {
        kge.a(-1174306970);
    }

    public static /* synthetic */ Object ipc$super(AliUserCustomToolbar aliUserCustomToolbar, String str, Object... objArr) {
        if (str.hashCode() == 547576538) {
            super.setNavigationIcon((Drawable) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(AliUserCustomToolbar aliUserCustomToolbar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9d634a", new Object[]{aliUserCustomToolbar, str});
        } else {
            aliUserCustomToolbar.setCenter(str);
        }
    }

    public AliUserCustomToolbar(Context context) {
        super(context);
        resolveAttribute(context, null, R.attr.toolbarStyle);
    }

    public AliUserCustomToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        resolveAttribute(context, attributeSet, R.attr.toolbarStyle);
    }

    public AliUserCustomToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        resolveAttribute(context, attributeSet, i);
    }

    private void resolveAttribute(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4665f646", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.Toolbar, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        if (resourceId != 0) {
            setTitleTextAppearance(context2, resourceId);
        }
        int i2 = this.mTitleTextColor;
        if (i2 != 0) {
            setTitleTextColor(i2);
        }
        obtainStyledAttributes.recycle();
        post(new Runnable() { // from class: com.ali.user.mobile.base.ui.AliUserCustomToolbar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!(AliUserCustomToolbar.this.getLayoutParams() instanceof Toolbar.LayoutParams)) {
                } else {
                    ((Toolbar.LayoutParams) AliUserCustomToolbar.this.getLayoutParams()).gravity = 17;
                }
            }
        });
    }

    @Override // android.support.v7.widget.Toolbar
    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this}) : this.mTitleText;
    }

    @Override // android.support.v7.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                this.mTitleTextView = new TextView(context);
                this.mTitleTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mTitleTextColor;
                if (i2 != 0) {
                    this.mTitleTextView.setTextColor(i2);
                }
            }
            if (this.mTitleTextView.getParent() != this) {
                addCenterView(this.mTitleTextView);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && textView.getParent() == this) {
                removeView(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    private void addCenterView(View view) {
        Toolbar.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef6ca70", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = mo114generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = mo116generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (Toolbar.LayoutParams) layoutParams2;
        }
        addView(view, layoutParams);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    public Toolbar.LayoutParams mo115generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar.LayoutParams) ipChange.ipc$dispatch("64c04e8d", new Object[]{this, attributeSet});
        }
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(getContext(), attributeSet);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    public Toolbar.LayoutParams mo116generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Toolbar.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar.LayoutParams) ipChange.ipc$dispatch("3d9b711e", new Object[]{this, layoutParams});
        }
        if (layoutParams instanceof Toolbar.LayoutParams) {
            layoutParams2 = new Toolbar.LayoutParams((Toolbar.LayoutParams) layoutParams);
        } else if (layoutParams instanceof ActionBar.LayoutParams) {
            layoutParams2 = new Toolbar.LayoutParams((ActionBar.LayoutParams) layoutParams);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = new Toolbar.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            layoutParams2 = new Toolbar.LayoutParams(layoutParams);
        }
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    public Toolbar.LayoutParams mo114generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar.LayoutParams) ipChange.ipc$dispatch("9c479e8c", new Object[]{this});
        }
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // android.support.v7.widget.Toolbar
    public void setTitleTextAppearance(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6255e9", new Object[]{this, context, new Integer(i)});
            return;
        }
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView == null) {
            return;
        }
        textView.setTextAppearance(context, i);
    }

    @Override // android.support.v7.widget.Toolbar
    public void setTitleTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abcb539c", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTitleTextColor = i;
        TextView textView = this.mTitleTextView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    @Override // android.support.v7.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a35ada", new Object[]{this, drawable});
            return;
        }
        super.setNavigationIcon(drawable);
        setGravityCenter();
    }

    public void setGravityCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaccf708", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.ali.user.mobile.base.ui.AliUserCustomToolbar.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AliUserCustomToolbar.access$000(AliUserCustomToolbar.this, "mNavButtonView");
                    AliUserCustomToolbar.access$000(AliUserCustomToolbar.this, "mMenuView");
                }
            });
        }
    }

    private void setCenter(String str) {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj == null || !(obj instanceof View)) {
                return;
            }
            View view = (View) obj;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ActionBar.LayoutParams)) {
                return;
            }
            ((ActionBar.LayoutParams) layoutParams).gravity = 17;
            view.setLayoutParams(layoutParams);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }
}
