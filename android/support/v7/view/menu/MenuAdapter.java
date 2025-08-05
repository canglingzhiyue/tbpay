package android.support.v7.view.menu;

import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class MenuAdapter extends BaseAdapter {
    static final int ITEM_LAYOUT = R.layout.abc_popup_menu_item_layout;
    e mAdapterMenu;
    private int mExpandedIndex = -1;
    private boolean mForceShowIcon;
    private final LayoutInflater mInflater;
    private final boolean mOverflowOnly;

    public MenuAdapter(e eVar, LayoutInflater layoutInflater, boolean z) {
        this.mOverflowOnly = z;
        this.mInflater = layoutInflater;
        this.mAdapterMenu = eVar;
        findExpandedIndex();
    }

    void findExpandedIndex() {
        g r = this.mAdapterMenu.r();
        if (r != null) {
            ArrayList<g> l = this.mAdapterMenu.l();
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

    public e getAdapterMenu() {
        return this.mAdapterMenu;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> l = this.mOverflowOnly ? this.mAdapterMenu.l() : this.mAdapterMenu.i();
        return this.mExpandedIndex < 0 ? l.size() : l.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.mForceShowIcon;
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public g mo56getItem(int i) {
        ArrayList<g> l = this.mOverflowOnly ? this.mAdapterMenu.l() : this.mAdapterMenu.i();
        int i2 = this.mExpandedIndex;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return l.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(ITEM_LAYOUT, viewGroup, false);
        }
        k.a aVar = (k.a) view;
        if (this.mForceShowIcon) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.initialize(mo56getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }
}
