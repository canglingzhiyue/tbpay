package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.e;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.taobao.taobao.R;
import tb.ace;
import tb.acs;

/* loaded from: classes2.dex */
public class BottomNavigationView extends FrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int MENU_PRESENTER_ID = 1;
    private final android.support.v7.view.menu.e mMenu;
    private MenuInflater mMenuInflater;
    private final BottomNavigationMenuView mMenuView;
    private final BottomNavigationPresenter mPresenter;
    private a mReselectedListener;
    private b mSelectedListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.BottomNavigationView.SavedState.1
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
        Bundle menuPresenterState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        BottomNavigationMenuView bottomNavigationMenuView;
        ColorStateList createDefaultColorStateList;
        BottomNavigationMenuView bottomNavigationMenuView2;
        ColorStateList createDefaultColorStateList2;
        this.mPresenter = new BottomNavigationPresenter();
        n.a(context);
        this.mMenu = new android.support.design.internal.a(context);
        this.mMenuView = new BottomNavigationMenuView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.mMenuView.setLayoutParams(layoutParams);
        this.mPresenter.a(this.mMenuView);
        this.mPresenter.a(1);
        this.mMenuView.setPresenter(this.mPresenter);
        this.mMenu.a(this.mPresenter);
        this.mPresenter.initForMenu(getContext(), this.mMenu);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.BottomNavigationView, i, R.style.Widget_Design_BottomNavigationView);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomNavigationView_itemIconTint)) {
            bottomNavigationMenuView = this.mMenuView;
            createDefaultColorStateList = obtainStyledAttributes.getColorStateList(R.styleable.BottomNavigationView_itemIconTint);
        } else {
            bottomNavigationMenuView = this.mMenuView;
            createDefaultColorStateList = createDefaultColorStateList(16842808);
        }
        bottomNavigationMenuView.setIconTintList(createDefaultColorStateList);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomNavigationView_itemTextColor)) {
            bottomNavigationMenuView2 = this.mMenuView;
            createDefaultColorStateList2 = obtainStyledAttributes.getColorStateList(R.styleable.BottomNavigationView_itemTextColor);
        } else {
            bottomNavigationMenuView2 = this.mMenuView;
            createDefaultColorStateList2 = createDefaultColorStateList(16842808);
        }
        bottomNavigationMenuView2.setItemTextColor(createDefaultColorStateList2);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomNavigationView_elevation)) {
            ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomNavigationView_elevation, 0));
        }
        this.mMenuView.setItemBackgroundRes(obtainStyledAttributes.getResourceId(R.styleable.BottomNavigationView_itemBackground, 0));
        if (obtainStyledAttributes.hasValue(R.styleable.BottomNavigationView_menu)) {
            inflateMenu(obtainStyledAttributes.getResourceId(R.styleable.BottomNavigationView_menu, 0));
        }
        obtainStyledAttributes.recycle();
        addView(this.mMenuView, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            addCompatibilityTopDivider(context);
        }
        this.mMenu.a(new e.a() { // from class: android.support.design.widget.BottomNavigationView.1
            @Override // android.support.v7.view.menu.e.a
            public void a(android.support.v7.view.menu.e eVar) {
            }

            @Override // android.support.v7.view.menu.e.a
            public boolean a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
                if (BottomNavigationView.this.mReselectedListener == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                    return BottomNavigationView.this.mSelectedListener != null && !BottomNavigationView.this.mSelectedListener.a(menuItem);
                }
                a unused = BottomNavigationView.this.mReselectedListener;
                return true;
            }
        });
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
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

    public int getItemBackgroundResource() {
        return this.mMenuView.getItemBackgroundRes();
    }

    public ColorStateList getItemIconTintList() {
        return this.mMenuView.getIconTintList();
    }

    public ColorStateList getItemTextColor() {
        return this.mMenuView.getItemTextColor();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public int getSelectedItemId() {
        return this.mMenuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.mPresenter.a(true);
        getMenuInflater().inflate(i, this.mMenu);
        this.mPresenter.a(false);
        this.mPresenter.updateMenuView(true);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mMenu.b(savedState.menuPresenterState);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuPresenterState = new Bundle();
        this.mMenu.a(savedState.menuPresenterState);
        return savedState;
    }

    public void setItemBackgroundResource(int i) {
        this.mMenuView.setItemBackgroundRes(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.mMenuView.setIconTintList(colorStateList);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.mMenuView.setItemTextColor(colorStateList);
    }

    public void setOnNavigationItemReselectedListener(a aVar) {
        this.mReselectedListener = aVar;
    }

    public void setOnNavigationItemSelectedListener(b bVar) {
        this.mSelectedListener = bVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.mMenu.findItem(i);
        if (findItem == null || this.mMenu.a(findItem, this.mPresenter, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
