package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import tb.aco;

/* loaded from: classes2.dex */
public class MenuItemWrapperICS extends android.support.v7.view.menu.c<SupportMenuItem> implements MenuItem {
    private Method c;

    /* loaded from: classes2.dex */
    static class CollapsibleActionViewWrapper extends FrameLayout implements aco {
        final CollapsibleActionView mWrappedView;

        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.mWrappedView = (CollapsibleActionView) view;
            addView(view);
        }

        View getWrappedView() {
            return (View) this.mWrappedView;
        }

        @Override // tb.aco
        public void onActionViewCollapsed() {
            this.mWrappedView.onActionViewCollapsed();
        }

        @Override // tb.aco
        public void onActionViewExpanded() {
            this.mWrappedView.onActionViewExpanded();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends ActionProvider {

        /* renamed from: a  reason: collision with root package name */
        final android.view.ActionProvider f1361a;

        public a(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f1361a = actionProvider;
        }

        @Override // android.support.v4.view.ActionProvider
        public boolean hasSubMenu() {
            return this.f1361a.hasSubMenu();
        }

        @Override // android.support.v4.view.ActionProvider
        public View onCreateActionView() {
            return this.f1361a.onCreateActionView();
        }

        @Override // android.support.v4.view.ActionProvider
        public boolean onPerformDefaultAction() {
            return this.f1361a.onPerformDefaultAction();
        }

        @Override // android.support.v4.view.ActionProvider
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f1361a.onPrepareSubMenu(MenuItemWrapperICS.this.a(subMenu));
        }
    }

    /* loaded from: classes2.dex */
    private class b extends d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        b(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.b).onMenuItemActionCollapse(MenuItemWrapperICS.this.a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.b).onMenuItemActionExpand(MenuItemWrapperICS.this.a(menuItem));
        }
    }

    /* loaded from: classes2.dex */
    private class c extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        c(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(MenuItemWrapperICS.this.a(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }

    a a(android.view.ActionProvider actionProvider) {
        return new a(this.f1368a, actionProvider);
    }

    public void a(boolean z) {
        try {
            if (this.c == null) {
                this.c = ((SupportMenuItem) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.c.invoke(this.b, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((SupportMenuItem) this.b).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((SupportMenuItem) this.b).expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        ActionProvider supportActionProvider = ((SupportMenuItem) this.b).getSupportActionProvider();
        if (supportActionProvider instanceof a) {
            return ((a) supportActionProvider).f1361a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((SupportMenuItem) this.b).getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).getWrappedView() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((SupportMenuItem) this.b).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((SupportMenuItem) this.b).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((SupportMenuItem) this.b).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((SupportMenuItem) this.b).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((SupportMenuItem) this.b).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((SupportMenuItem) this.b).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((SupportMenuItem) this.b).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((SupportMenuItem) this.b).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((SupportMenuItem) this.b).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((SupportMenuItem) this.b).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((SupportMenuItem) this.b).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((SupportMenuItem) this.b).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((SupportMenuItem) this.b).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return a(((SupportMenuItem) this.b).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((SupportMenuItem) this.b).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((SupportMenuItem) this.b).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((SupportMenuItem) this.b).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((SupportMenuItem) this.b).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((SupportMenuItem) this.b).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((SupportMenuItem) this.b).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((SupportMenuItem) this.b).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((SupportMenuItem) this.b).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((SupportMenuItem) this.b).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ((SupportMenuItem) this.b).setSupportActionProvider(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((SupportMenuItem) this.b).setActionView(i);
        View actionView = ((SupportMenuItem) this.b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((SupportMenuItem) this.b).setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        ((SupportMenuItem) this.b).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((SupportMenuItem) this.b).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((SupportMenuItem) this.b).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((SupportMenuItem) this.b).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((SupportMenuItem) this.b).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((SupportMenuItem) this.b).mo59setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((SupportMenuItem) this.b).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((SupportMenuItem) this.b).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((SupportMenuItem) this.b).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((SupportMenuItem) this.b).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((SupportMenuItem) this.b).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((SupportMenuItem) this.b).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((SupportMenuItem) this.b).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        ((SupportMenuItem) this.b).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((SupportMenuItem) this.b).setOnActionExpandListener(onActionExpandListener != null ? new b(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((SupportMenuItem) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new c(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((SupportMenuItem) this.b).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((SupportMenuItem) this.b).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((SupportMenuItem) this.b).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((SupportMenuItem) this.b).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((SupportMenuItem) this.b).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((SupportMenuItem) this.b).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((SupportMenuItem) this.b).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((SupportMenuItem) this.b).mo60setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((SupportMenuItem) this.b).setVisible(z);
    }
}
