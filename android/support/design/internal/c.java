package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.o;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c implements android.support.v7.view.menu.j {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f1142a;
    android.support.v7.view.menu.e b;
    b c;
    LayoutInflater d;
    int e;
    boolean f;
    ColorStateList g;
    ColorStateList h;
    Drawable i;
    int j;
    final View.OnClickListener k = new View.OnClickListener() { // from class: android.support.design.internal.c.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.a(true);
            android.support.v7.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            boolean a2 = c.this.b.a(itemData, c.this, 0);
            if (itemData != null && itemData.isCheckable() && a2) {
                c.this.c.a(itemData);
            }
            c.this.a(false);
            c.this.updateMenuView(false);
        }
    };
    private NavigationMenuView l;
    private j.a m;
    private int n;
    private int o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends j {
        public a(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.Adapter<j> {
        private final ArrayList<d> b = new ArrayList<>();
        private android.support.v7.view.menu.g c;
        private boolean d;

        b() {
            c();
        }

        private void a(int i, int i2) {
            while (i < i2) {
                ((f) this.b.get(i)).f1146a = true;
                i++;
            }
        }

        private void c() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.clear();
            this.b.add(new C0008c());
            int size = c.this.b.i().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                android.support.v7.view.menu.g gVar = c.this.b.i().get(i3);
                if (gVar.isChecked()) {
                    a(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.a(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.b.add(new e(c.this.j, 0));
                        }
                        this.b.add(new f(gVar));
                        int size2 = this.b.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            android.support.v7.view.menu.g gVar2 = (android.support.v7.view.menu.g) subMenu.getItem(i4);
                            if (gVar2.isVisible()) {
                                if (!z2 && gVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.a(false);
                                }
                                if (gVar.isChecked()) {
                                    a(gVar);
                                }
                                this.b.add(new f(gVar2));
                            }
                        }
                        if (z2) {
                            a(size2, this.b.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i) {
                        i2 = this.b.size();
                        boolean z3 = gVar.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            this.b.add(new e(c.this.j, c.this.j));
                        }
                        z = z3;
                    } else if (!z && gVar.getIcon() != null) {
                        a(i2, this.b.size());
                        z = true;
                    }
                    f fVar = new f(gVar);
                    fVar.f1146a = z;
                    this.b.add(fVar);
                    i = groupId;
                }
            }
            this.d = false;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: a */
        public j mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                if (i == 1) {
                    return new i(c.this.d, viewGroup);
                }
                if (i == 2) {
                    return new h(c.this.d, viewGroup);
                }
                if (i == 3) {
                    return new a(c.this.f1142a);
                }
                return null;
            }
            return new g(c.this.d, viewGroup, c.this.k);
        }

        public void a() {
            c();
            notifyDataSetChanged();
        }

        public void a(Bundle bundle) {
            android.support.v7.view.menu.g a2;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            android.support.v7.view.menu.g a3;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.d = true;
                int size = this.b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    d dVar = this.b.get(i2);
                    if ((dVar instanceof f) && (a3 = ((f) dVar).a()) != null && a3.getItemId() == i) {
                        a(a3);
                        break;
                    }
                    i2++;
                }
                this.d = false;
                c();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d dVar2 = this.b.get(i3);
                    if ((dVar2 instanceof f) && (a2 = ((f) dVar2).a()) != null && (actionView = a2.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a2.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onViewRecycled(j jVar) {
            if (jVar instanceof g) {
                ((NavigationMenuItemView) jVar.itemView).recycle();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(j jVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ((TextView) jVar.itemView).setText(((f) this.b.get(i)).a().getTitle());
                    return;
                } else if (itemViewType != 2) {
                    return;
                } else {
                    e eVar = (e) this.b.get(i);
                    jVar.itemView.setPadding(0, eVar.a(), 0, eVar.b());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.itemView;
            navigationMenuItemView.setIconTintList(c.this.h);
            if (c.this.f) {
                navigationMenuItemView.setTextAppearance(c.this.e);
            }
            if (c.this.g != null) {
                navigationMenuItemView.setTextColor(c.this.g);
            }
            ViewCompat.setBackground(navigationMenuItemView, c.this.i != null ? c.this.i.getConstantState().newDrawable() : null);
            f fVar = (f) this.b.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(fVar.f1146a);
            navigationMenuItemView.initialize(fVar.a(), 0);
        }

        public void a(android.support.v7.view.menu.g gVar) {
            if (this.c == gVar || !gVar.isCheckable()) {
                return;
            }
            android.support.v7.view.menu.g gVar2 = this.c;
            if (gVar2 != null) {
                gVar2.setChecked(false);
            }
            this.c = gVar;
            gVar.setChecked(true);
        }

        public void a(boolean z) {
            this.d = z;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            android.support.v7.view.menu.g gVar = this.c;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.b.get(i);
                if (dVar instanceof f) {
                    android.support.v7.view.menu.g a2 = ((f) dVar).a();
                    View actionView = a2 != null ? a2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a2.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.b.size();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            d dVar = this.b.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof C0008c) {
                return 3;
            }
            if (!(dVar instanceof f)) {
                throw new RuntimeException("Unknown item type.");
            }
            return ((f) dVar).a().hasSubMenu() ? 1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0008c implements d {
        C0008c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class e implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f1145a;
        private final int b;

        public e(int i, int i2) {
            this.f1145a = i;
            this.b = i2;
        }

        public int a() {
            return this.f1145a;
        }

        public int b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f1146a;
        private final android.support.v7.view.menu.g b;

        f(android.support.v7.view.menu.g gVar) {
            this.b = gVar;
        }

        public android.support.v7.view.menu.g a() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class g extends j {
        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class h extends j {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class i extends j {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class j extends RecyclerView.ViewHolder {
        public j(View view) {
            super(view);
        }
    }

    public int a() {
        return this.f1142a.getChildCount();
    }

    public k a(ViewGroup viewGroup) {
        if (this.l == null) {
            this.l = (NavigationMenuView) this.d.inflate(R.layout.design_navigation_menu, viewGroup, false);
            if (this.c == null) {
                this.c = new b();
            }
            this.f1142a = (LinearLayout) this.d.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.l, false);
            this.l.setAdapter(this.c);
        }
        return this.l;
    }

    public void a(int i2) {
        this.n = i2;
    }

    public void a(ColorStateList colorStateList) {
        this.h = colorStateList;
        updateMenuView(false);
    }

    public void a(Drawable drawable) {
        this.i = drawable;
        updateMenuView(false);
    }

    public void a(WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.o != systemWindowInsetTop) {
            this.o = systemWindowInsetTop;
            if (this.f1142a.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.l;
                navigationMenuView.setPadding(0, this.o, 0, navigationMenuView.getPaddingBottom());
            }
        }
        ViewCompat.dispatchApplyWindowInsets(this.f1142a, windowInsetsCompat);
    }

    public void a(android.support.v7.view.menu.g gVar) {
        this.c.a(gVar);
    }

    public void a(View view) {
        this.f1142a.addView(view);
        NavigationMenuView navigationMenuView = this.l;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void a(boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(z);
        }
    }

    public ColorStateList b() {
        return this.h;
    }

    public View b(int i2) {
        View inflate = this.d.inflate(i2, (ViewGroup) this.f1142a, false);
        a(inflate);
        return inflate;
    }

    public void b(ColorStateList colorStateList) {
        this.g = colorStateList;
        updateMenuView(false);
    }

    public void b(View view) {
        this.f1142a.removeView(view);
        if (this.f1142a.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.l;
            navigationMenuView.setPadding(0, this.o, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public ColorStateList c() {
        return this.g;
    }

    public View c(int i2) {
        return this.f1142a.getChildAt(i2);
    }

    @Override // android.support.v7.view.menu.j
    public boolean collapseItemActionView(android.support.v7.view.menu.e eVar, android.support.v7.view.menu.g gVar) {
        return false;
    }

    public Drawable d() {
        return this.i;
    }

    public void d(int i2) {
        this.e = i2;
        this.f = true;
        updateMenuView(false);
    }

    @Override // android.support.v7.view.menu.j
    public boolean expandItemActionView(android.support.v7.view.menu.e eVar, android.support.v7.view.menu.g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean flagActionItems() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public int getId() {
        return this.n;
    }

    @Override // android.support.v7.view.menu.j
    public void initForMenu(Context context, android.support.v7.view.menu.e eVar) {
        this.d = LayoutInflater.from(context);
        this.b = eVar;
        this.j = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // android.support.v7.view.menu.j
    public void onCloseMenu(android.support.v7.view.menu.e eVar, boolean z) {
        j.a aVar = this.m;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.c.a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 == null) {
                return;
            }
            this.f1142a.restoreHierarchyState(sparseParcelableArray2);
        }
    }

    @Override // android.support.v7.view.menu.j
    public Parcelable onSaveInstanceState() {
        if (Build.VERSION.SDK_INT >= 11) {
            Bundle bundle = new Bundle();
            if (this.l != null) {
                SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
                this.l.saveHierarchyState(sparseArray);
                bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
            }
            b bVar = this.c;
            if (bVar != null) {
                bundle.putBundle("android:menu:adapter", bVar.b());
            }
            if (this.f1142a != null) {
                SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
                this.f1142a.saveHierarchyState(sparseArray2);
                bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
            }
            return bundle;
        }
        return null;
    }

    @Override // android.support.v7.view.menu.j
    public boolean onSubMenuSelected(o oVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void setCallback(j.a aVar) {
        this.m = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public void updateMenuView(boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a();
        }
    }
}
