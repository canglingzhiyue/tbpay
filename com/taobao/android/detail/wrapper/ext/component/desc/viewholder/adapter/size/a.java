package com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.request.size.model.RoleSize;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends RecyclerView.Adapter<RoleSizeRecyclerViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_FIRST_COLUMN_WIDTH;
    public static final int DEFAULT_TEXT_PADDING;
    public static final int DEFAULT_TEXT_SIZE;
    public static final int DEFAULT_WIDTH;

    /* renamed from: a  reason: collision with root package name */
    private List<RoleSize.SizeDo> f11157a;
    private List<RoleSize.SizeDo> b;
    private boolean c;
    private View d;
    private BitSet e = new BitSet();
    private Context f;

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RoleSizeRecyclerViewHolder roleSizeRecyclerViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, roleSizeRecyclerViewHolder, new Integer(i)});
        } else {
            a(roleSizeRecyclerViewHolder, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeRecyclerViewHolder, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ RoleSizeRecyclerViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    static {
        kge.a(1476392429);
        DEFAULT_WIDTH = epo.b(75);
        DEFAULT_FIRST_COLUMN_WIDTH = epo.b(90);
        DEFAULT_TEXT_PADDING = epo.b(5);
        DEFAULT_TEXT_SIZE = epo.b(10);
    }

    public a(Context context) {
        this.f = context;
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeRecyclerViewAdapter");
    }

    public void a(List<RoleSize.SizeDo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.f11157a = list;
        if (this.f11157a != null) {
            this.b = new ArrayList();
            for (RoleSize.SizeDo sizeDo : this.f11157a) {
                this.b.add(new RoleSize.SizeDo(sizeDo));
            }
        }
        notifyDataSetChanged();
    }

    public List<RoleSize.SizeDo> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public RoleSizeRecyclerViewHolder a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoleSizeRecyclerViewHolder) ipChange.ipc$dispatch("3ced37df", new Object[]{this, viewGroup, new Integer(i)}) : new RoleSizeRecyclerViewHolder(View.inflate(this.f, R.layout.x_detail_listitem_role_size_chart, null), this.f);
    }

    public void a(RoleSizeRecyclerViewHolder roleSizeRecyclerViewHolder, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e4e718", new Object[]{this, roleSizeRecyclerViewHolder, new Integer(i)});
            return;
        }
        int i3 = ((this.c ? this.b.get(i) : this.f11157a.get(i)).maxLength * DEFAULT_TEXT_SIZE) + (DEFAULT_TEXT_PADDING << 1);
        int i4 = DEFAULT_FIRST_COLUMN_WIDTH;
        if (i4 > i3) {
            i3 = i4;
        }
        View view = this.d;
        if (view != null) {
            i2 = view.getMeasuredWidth();
        }
        if (i2 > 0 && getItemCount() * i3 < i2) {
            i3 = i2 / getItemCount();
        }
        a(roleSizeRecyclerViewHolder.tvColumnTitle, i3);
        a(roleSizeRecyclerViewHolder.tvColumnVal, i3);
        roleSizeRecyclerViewHolder.fillData(this.f11157a.get(i), this.b.get(i), this.c, i, this.e);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<RoleSize.SizeDo> list = this.f11157a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        view.setLayoutParams(layoutParams);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        notifyDataSetChanged();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        BitSet bitSet = this.e;
        return bitSet != null && bitSet.cardinality() > 0;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.d = view;
        }
    }
}
