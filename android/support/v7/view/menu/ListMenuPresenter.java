package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ListMenuPresenter implements j, AdapterView.OnItemClickListener {
    private static final String TAG = "ListMenuPresenter";
    public static final String VIEWS_TAG = "android:menu:list";
    MenuAdapter mAdapter;
    private j.a mCallback;
    Context mContext;
    private int mId;
    LayoutInflater mInflater;
    int mItemIndexOffset;
    int mItemLayoutRes;
    e mMenu;
    ExpandedMenuView mMenuView;
    int mThemeRes;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class MenuAdapter extends BaseAdapter {
        private int mExpandedIndex = -1;

        public MenuAdapter() {
            findExpandedIndex();
        }

        void findExpandedIndex() {
            g r = ListMenuPresenter.this.mMenu.r();
            if (r != null) {
                ArrayList<g> l = ListMenuPresenter.this.mMenu.l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (l.get(i) == r) {
                        this.mExpandedIndex = i;
                        return;
                    }
                }
            }
            this.mExpandedIndex = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = ListMenuPresenter.this.mMenu.l().size() - ListMenuPresenter.this.mItemIndexOffset;
            return this.mExpandedIndex < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: getItem */
        public g mo55getItem(int i) {
            ArrayList<g> l = ListMenuPresenter.this.mMenu.l();
            int i2 = i + ListMenuPresenter.this.mItemIndexOffset;
            int i3 = this.mExpandedIndex;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return l.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ListMenuPresenter.this.mInflater.inflate(ListMenuPresenter.this.mItemLayoutRes, viewGroup, false);
            }
            ((k.a) view).initialize(mo55getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(int i, int i2) {
        this.mItemLayoutRes = i;
        this.mThemeRes = i2;
    }

    public ListMenuPresenter(Context context, int i) {
        this(i, 0);
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
    }

    @Override // android.support.v7.view.menu.j
    public boolean collapseItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean expandItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if (this.mAdapter == null) {
            this.mAdapter = new MenuAdapter();
        }
        return this.mAdapter;
    }

    @Override // android.support.v7.view.menu.j
    public int getId() {
        return this.mId;
    }

    int getItemIndexOffset() {
        return this.mItemIndexOffset;
    }

    public k getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (ExpandedMenuView) this.mInflater.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new MenuAdapter();
            }
            this.mMenuView.setAdapter((ListAdapter) this.mAdapter);
            this.mMenuView.setOnItemClickListener(this);
        }
        return this.mMenuView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r2.mInflater == null) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v7.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initForMenu(android.content.Context r3, android.support.v7.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.mThemeRes
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.mContext = r1
        Lb:
            android.content.Context r3 = r2.mContext
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.mInflater = r3
            goto L1f
        L14:
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L1f
            r2.mContext = r3
            android.view.LayoutInflater r3 = r2.mInflater
            if (r3 != 0) goto L1f
            goto Lb
        L1f:
            r2.mMenu = r4
            android.support.v7.view.menu.ListMenuPresenter$MenuAdapter r3 = r2.mAdapter
            if (r3 == 0) goto L28
            r3.notifyDataSetChanged()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.ListMenuPresenter.initForMenu(android.content.Context, android.support.v7.view.menu.e):void");
    }

    @Override // android.support.v7.view.menu.j
    public void onCloseMenu(e eVar, boolean z) {
        j.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.mMenu.a(this.mAdapter.mo55getItem(i), this, 0);
    }

    @Override // android.support.v7.view.menu.j
    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }

    @Override // android.support.v7.view.menu.j
    public Parcelable onSaveInstanceState() {
        if (this.mMenuView == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // android.support.v7.view.menu.j
    public boolean onSubMenuSelected(o oVar) {
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        new f(oVar).a((IBinder) null);
        j.a aVar = this.mCallback;
        if (aVar == null) {
            return true;
        }
        aVar.a(oVar);
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(VIEWS_TAG);
        if (sparseParcelableArray != null) {
            this.mMenuView.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.mMenuView;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(VIEWS_TAG, sparseArray);
    }

    @Override // android.support.v7.view.menu.j
    public void setCallback(j.a aVar) {
        this.mCallback = aVar;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setItemIndexOffset(int i) {
        this.mItemIndexOffset = i;
        if (this.mMenuView != null) {
            updateMenuView(false);
        }
    }

    @Override // android.support.v7.view.menu.j
    public void updateMenuView(boolean z) {
        MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
