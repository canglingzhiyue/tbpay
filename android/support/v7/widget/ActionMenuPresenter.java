package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.GravityCompat;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.acm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ActionMenuPresenter extends android.support.v7.view.menu.b implements ActionProvider.SubUiVisibilityListener {
    private b A;
    OverflowMenuButton g;
    d h;
    a i;
    c j;
    final e k;
    int l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final SparseBooleanArray y;
    private View z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        private final float[] mTempPts;

        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            this.mTempPts = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: android.support.v7.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // android.support.v7.widget.ForwardingListener
                public android.support.v7.view.menu.n getPopup() {
                    if (ActionMenuPresenter.this.h == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.h.c();
                }

                @Override // android.support.v7.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    ActionMenuPresenter.this.c();
                    return true;
                }

                @Override // android.support.v7.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    if (ActionMenuPresenter.this.j != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.d();
                    return true;
                }
            });
        }

        @Override // android.support.v7.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.c();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.setHotspotBounds(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int openSubMenuId;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends android.support.v7.view.menu.i {
        public a(Context context, android.support.v7.view.menu.o oVar, View view) {
            super(context, oVar, view, false, R.attr.actionOverflowMenuStyle);
            if (!((android.support.v7.view.menu.g) oVar.getItem()).i()) {
                a(ActionMenuPresenter.this.g == null ? (View) ActionMenuPresenter.this.f : ActionMenuPresenter.this.g);
            }
            a(ActionMenuPresenter.this.k);
        }

        @Override // android.support.v7.view.menu.i
        protected void f() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.i = null;
            actionMenuPresenter.l = 0;
            super.f();
        }
    }

    /* loaded from: classes2.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public android.support.v7.view.menu.n a() {
            if (ActionMenuPresenter.this.i != null) {
                return ActionMenuPresenter.this.i.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        private d b;

        public c(d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.f();
            }
            View view = (View) ActionMenuPresenter.this.f;
            if (view != null && view.getWindowToken() != null && this.b.d()) {
                ActionMenuPresenter.this.h = this.b;
            }
            ActionMenuPresenter.this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d extends android.support.v7.view.menu.i {
        public d(Context context, android.support.v7.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, R.attr.actionOverflowMenuStyle);
            a(GravityCompat.END);
            a(ActionMenuPresenter.this.k);
        }

        @Override // android.support.v7.view.menu.i
        protected void f() {
            if (ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.close();
            }
            ActionMenuPresenter.this.h = null;
            super.f();
        }
    }

    /* loaded from: classes2.dex */
    private class e implements j.a {
        e() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            if (eVar instanceof android.support.v7.view.menu.o) {
                eVar.p().b(false);
            }
            j.a a2 = ActionMenuPresenter.this.a();
            if (a2 != null) {
                a2.a(eVar, z);
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean a(android.support.v7.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            ActionMenuPresenter.this.l = ((android.support.v7.view.menu.o) eVar).getItem().getItemId();
            j.a a2 = ActionMenuPresenter.this.a();
            if (a2 == null) {
                return false;
            }
            return a2.a(eVar);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.y = new SparseBooleanArray();
        this.k = new e();
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.support.v7.view.menu.b
    public android.support.v7.view.menu.k a(ViewGroup viewGroup) {
        android.support.v7.view.menu.k kVar = this.f;
        android.support.v7.view.menu.k a2 = super.a(viewGroup);
        if (kVar != a2) {
            ((ActionMenuView) a2).setPresenter(this);
        }
        return a2;
    }

    @Override // android.support.v7.view.menu.b
    public View a(android.support.v7.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.m()) {
            actionView = super.a(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo65generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public void a(Configuration configuration) {
        if (!this.t) {
            this.s = acm.a(this.b).a();
        }
        if (this.c != null) {
            this.c.a(true);
        }
    }

    public void a(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.g;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
            return;
        }
        this.n = true;
        this.m = drawable;
    }

    @Override // android.support.v7.view.menu.b
    public void a(android.support.v7.view.menu.g gVar, k.a aVar) {
        aVar.initialize(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    public void a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.initialize(this.c);
    }

    public void a(boolean z) {
        this.o = z;
        this.p = true;
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(int i, android.support.v7.view.menu.g gVar) {
        return gVar.i();
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.g) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    public Drawable b() {
        OverflowMenuButton overflowMenuButton = this.g;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (!this.n) {
            return null;
        }
        return this.m;
    }

    public void b(boolean z) {
        this.w = z;
    }

    public boolean c() {
        if (!this.o || g() || this.c == null || this.f == null || this.j != null || this.c.l().isEmpty()) {
            return false;
        }
        this.j = new c(new d(this.b, this.c, this.g, true));
        ((View) this.f).post(this.j);
        super.onSubMenuSelected(null);
        return true;
    }

    public boolean d() {
        if (this.j != null && this.f != null) {
            ((View) this.f).removeCallbacks(this.j);
            this.j = null;
            return true;
        }
        d dVar = this.h;
        if (dVar == null) {
            return false;
        }
        dVar.e();
        return true;
    }

    public boolean e() {
        return d() | f();
    }

    public boolean f() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.e();
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.j
    public boolean flagActionItems() {
        ArrayList<android.support.v7.view.menu.g> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        int i5 = 0;
        if (actionMenuPresenter.c != null) {
            arrayList = actionMenuPresenter.c.i();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.s;
        int i7 = actionMenuPresenter.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f;
        int i8 = i6;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            android.support.v7.view.menu.g gVar = arrayList.get(i11);
            if (gVar.k()) {
                i9++;
            } else if (gVar.j()) {
                i10++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.w && gVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.o && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.u) {
            int i13 = actionMenuPresenter.x;
            i3 = i7 / i13;
            i2 = i13 + ((i7 % i13) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            android.support.v7.view.menu.g gVar2 = arrayList.get(i15);
            if (gVar2.k()) {
                View a2 = actionMenuPresenter.a(gVar2, actionMenuPresenter.z, viewGroup);
                if (actionMenuPresenter.z == null) {
                    actionMenuPresenter.z = a2;
                }
                if (actionMenuPresenter.u) {
                    i3 -= ActionMenuView.measureChildForCells(a2, i2, i3, makeMeasureSpec, i5);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                gVar2.d(z);
                i4 = i;
                i16 = measuredWidth;
            } else if (gVar2.j()) {
                int groupId2 = gVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i14 > 0 && (!actionMenuPresenter.u || i3 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a3 = actionMenuPresenter.a(gVar2, actionMenuPresenter.z, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.z == null) {
                        actionMenuPresenter.z = a3;
                    }
                    if (actionMenuPresenter.u) {
                        int measureChildForCells = ActionMenuView.measureChildForCells(a3, i2, i3, makeMeasureSpec, 0);
                        i3 -= measureChildForCells;
                        if (measureChildForCells == 0) {
                            z5 = false;
                        }
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z4 = z5 & (!actionMenuPresenter.u ? i14 + i16 > 0 : i14 >= 0);
                } else {
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i15; i17++) {
                        android.support.v7.view.menu.g gVar3 = arrayList.get(i17);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.i()) {
                                i12++;
                            }
                            gVar3.d(false);
                        }
                    }
                }
                if (z4) {
                    i12--;
                }
                gVar2.d(z4);
            } else {
                i4 = i;
                gVar2.d(false);
                i15++;
                i5 = 0;
                actionMenuPresenter = this;
                i = i4;
            }
            i15++;
            i5 = 0;
            actionMenuPresenter = this;
            i = i4;
        }
        return true;
    }

    public boolean g() {
        d dVar = this.h;
        return dVar != null && dVar.g();
    }

    public boolean h() {
        return this.j != null || g();
    }

    public boolean i() {
        return this.o;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.j
    public void initForMenu(Context context, android.support.v7.view.menu.e eVar) {
        super.initForMenu(context, eVar);
        Resources resources = context.getResources();
        acm a2 = acm.a(context);
        if (!this.p) {
            this.o = a2.b();
        }
        if (!this.v) {
            this.q = a2.c();
        }
        if (!this.t) {
            this.s = a2.a();
        }
        int i = this.q;
        if (this.o) {
            if (this.g == null) {
                this.g = new OverflowMenuButton(this.f1367a);
                if (this.n) {
                    this.g.setImageDrawable(this.m);
                    this.m = null;
                    this.n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.r = i;
        this.x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.z = null;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.j
    public void onCloseMenu(android.support.v7.view.menu.e eVar, boolean z) {
        e();
        super.onCloseMenu(eVar, z);
    }

    @Override // android.support.v7.view.menu.j
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState.openSubMenuId <= 0 || (findItem = this.c.findItem(savedState.openSubMenuId)) == null) {
            return;
        }
        onSubMenuSelected((android.support.v7.view.menu.o) findItem.getSubMenu());
    }

    @Override // android.support.v7.view.menu.j
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.l;
        return savedState;
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.j
    public boolean onSubMenuSelected(android.support.v7.view.menu.o oVar) {
        boolean z = false;
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        android.support.v7.view.menu.o oVar2 = oVar;
        while (oVar2.s() != this.c) {
            oVar2 = (android.support.v7.view.menu.o) oVar2.s();
        }
        View a2 = a(oVar2.getItem());
        if (a2 == null) {
            return false;
        }
        this.l = oVar.getItem().getItemId();
        int size = oVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = oVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.i = new a(this.b, oVar, a2);
        this.i.a(z);
        this.i.b();
        super.onSubMenuSelected(oVar);
        return true;
    }

    @Override // android.support.v4.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
        } else if (this.c == null) {
        } else {
            this.c.b(false);
        }
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.j
    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f).requestLayout();
        boolean z2 = false;
        if (this.c != null) {
            ArrayList<android.support.v7.view.menu.g> k = this.c.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                ActionProvider supportActionProvider = k.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        ArrayList<android.support.v7.view.menu.g> l = this.c != null ? this.c.l() : null;
        if (this.o && l != null) {
            int size2 = l.size();
            if (size2 == 1) {
                z2 = !l.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.g == null) {
                this.g = new OverflowMenuButton(this.f1367a);
            }
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.g, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.g;
            if (overflowMenuButton != null && overflowMenuButton.getParent() == this.f) {
                ((ViewGroup) this.f).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.o);
    }
}
