package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.view.menu.e;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import tb.ace;
import tb.acs;

/* loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    a mListener;
    private int mMaxWidth;
    private final android.support.design.internal.b mMenu;
    private MenuInflater mMenuInflater;
    private final android.support.design.internal.c mPresenter;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        int i2;
        this.mPresenter = new android.support.design.internal.c();
        n.a(context);
        this.mMenu = new android.support.design.internal.b(context);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.NavigationView, i, R.style.Widget_Design_NavigationView);
        ViewCompat.setBackground(this, obtainStyledAttributes.getDrawable(R.styleable.NavigationView_android_background));
        if (obtainStyledAttributes.hasValue(R.styleable.NavigationView_elevation)) {
            ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationView_elevation, 0));
        }
        ViewCompat.setFitsSystemWindows(this, obtainStyledAttributes.getBoolean(R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateList = obtainStyledAttributes.hasValue(R.styleable.NavigationView_itemIconTint) ? obtainStyledAttributes.getColorStateList(R.styleable.NavigationView_itemIconTint) : createDefaultColorStateList(16842808);
        if (obtainStyledAttributes.hasValue(R.styleable.NavigationView_itemTextAppearance)) {
            i2 = obtainStyledAttributes.getResourceId(R.styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.hasValue(R.styleable.NavigationView_itemTextColor) ? obtainStyledAttributes.getColorStateList(R.styleable.NavigationView_itemTextColor) : null;
        if (!z && colorStateList2 == null) {
            colorStateList2 = createDefaultColorStateList(16842806);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.NavigationView_itemBackground);
        this.mMenu.a(new e.a() { // from class: android.support.design.widget.NavigationView.1
            @Override // android.support.v7.view.menu.e.a
            public void a(android.support.v7.view.menu.e eVar) {
            }

            @Override // android.support.v7.view.menu.e.a
            public boolean a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
                return NavigationView.this.mListener != null && NavigationView.this.mListener.a(menuItem);
            }
        });
        this.mPresenter.a(1);
        this.mPresenter.initForMenu(context, this.mMenu);
        this.mPresenter.a(colorStateList);
        if (z) {
            this.mPresenter.d(i2);
        }
        this.mPresenter.b(colorStateList2);
        this.mPresenter.a(drawable);
        this.mMenu.a(this.mPresenter);
        addView((View) this.mPresenter.a((ViewGroup) this));
        if (obtainStyledAttributes.hasValue(R.styleable.NavigationView_menu)) {
            inflateMenu(obtainStyledAttributes.getResourceId(R.styleable.NavigationView_menu, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(obtainStyledAttributes.getResourceId(R.styleable.NavigationView_headerLayout, 0));
        }
        obtainStyledAttributes.recycle();
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = ace.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        return new ColorStateList(new int[][]{DISABLED_STATE_SET, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{a2.getColorForState(DISABLED_STATE_SET, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            this.mMenuInflater = new acs(getContext());
        }
        return this.mMenuInflater;
    }

    public void addHeaderView(View view) {
        this.mPresenter.a(view);
    }

    public int getHeaderCount() {
        return this.mPresenter.a();
    }

    public View getHeaderView(int i) {
        return this.mPresenter.c(i);
    }

    public Drawable getItemBackground() {
        return this.mPresenter.d();
    }

    public ColorStateList getItemIconTintList() {
        return this.mPresenter.b();
    }

    public ColorStateList getItemTextColor() {
        return this.mPresenter.c();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public View inflateHeaderView(int i) {
        return this.mPresenter.b(i);
    }

    public void inflateMenu(int i) {
        this.mPresenter.a(true);
        getMenuInflater().inflate(i, this.mMenu);
        this.mPresenter.a(false);
        this.mPresenter.updateMenuView(false);
    }

    @Override // android.support.design.internal.ScrimInsetsFrameLayout
    protected void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        this.mPresenter.a(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int min;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                min = this.mMaxWidth;
            }
            super.onMeasure(i, i2);
        }
        min = Math.min(View.MeasureSpec.getSize(i), this.mMaxWidth);
        i = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mMenu.b(savedState.menuState);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuState = new Bundle();
        this.mMenu.a(savedState.menuState);
        return savedState;
    }

    public void removeHeaderView(View view) {
        this.mPresenter.b(view);
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.mMenu.findItem(i);
        if (findItem != null) {
            this.mPresenter.a((android.support.v7.view.menu.g) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.mPresenter.a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.mPresenter.a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.mPresenter.d(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.mPresenter.b(colorStateList);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.mListener = aVar;
    }
}
