package com.taobao.android.shop.features.category;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.utils.f;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends RecyclerView.Adapter<C0578a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f15107a;
    public b b;
    public Context c;
    public View d;
    public TextView e;
    public View f;
    private int g = -1;
    private List<c> h;

    /* renamed from: com.taobao.android.shop.features.category.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0578a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f15112a;
        public TUrlImageView b;
        public View c;
        public TextView d;
        public TextView e;
        public ImageView f;
        public View g;
        public View h;

        static {
            kge.a(-1850114640);
        }

        public C0578a(View view, int i) {
            super(view);
            if (i == 0) {
                this.d = (TextView) view.findViewById(R.id.shop_category_group_item1_title);
                this.f = (ImageView) view.findViewById(R.id.shop_category_group_item1_next_img);
                this.e = (TextView) view.findViewById(R.id.shop_category_group_item1_all);
                this.g = view.findViewById(R.id.shop_category_group_item1_divider);
                this.h = view.findViewById(R.id.shop_category_group_item1_selected);
                this.g.setVisibility(0);
                this.e.setVisibility(8);
                this.f.setVisibility(0);
            } else if (i == 1) {
                this.d = (TextView) view.findViewById(R.id.shop_category_group_item1_title);
                this.f = (ImageView) view.findViewById(R.id.shop_category_group_item1_next_img);
                this.e = (TextView) view.findViewById(R.id.shop_category_group_item1_all);
                this.g = view.findViewById(R.id.shop_category_group_item1_divider);
                this.h = view.findViewById(R.id.shop_category_group_item1_selected);
                this.g.setVisibility(8);
                this.e.setVisibility(0);
                this.f.setVisibility(8);
            } else if (i == 2) {
                this.f15112a = (TextView) view.findViewById(R.id.shop_category_child_gridview_item_title);
                this.b = (TUrlImageView) view.findViewById(R.id.shop_category_child_gridview_item_img);
                this.c = view.findViewById(R.id.shop_category_child_gridview_item_selected);
            } else if (i == 3) {
                this.d = (TextView) view.findViewById(R.id.shop_category_group_all_item_title);
                this.f = (ImageView) view.findViewById(R.id.shop_category_group_all_item_next_img);
                this.g = view.findViewById(R.id.shop_category_group_all_item_divider);
                this.h = view.findViewById(R.id.shop_category_group_all_item_selected);
            } else if (i != 4) {
            } else {
                this.f15112a = (TextView) view.findViewById(R.id.shop_category_child_gridview_item_title);
                this.b = (TUrlImageView) view.findViewById(R.id.shop_category_child_gridview_item_img);
                this.c = view.findViewById(R.id.shop_category_child_gridview_item_selected);
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void OnItemClick(int i);

        void OnItemLongClick(int i);
    }

    static {
        kge.a(1325201036);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(C0578a c0578a, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, c0578a, new Integer(i)});
        } else {
            a(c0578a, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.shop.features.category.a$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ C0578a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36d34719", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.g = i;
        return i;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25d1cbf", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public a(List<c> list, Context context) {
        this.c = context;
        if (list != null) {
            this.h = list;
        } else {
            this.h = new ArrayList();
            this.h.add(new c(null, null, null, null, null, -1, -1, false));
        }
        this.h = list;
        this.f15107a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.h.get(i).f == 0 || this.h.get(i).f == 1) {
            return false;
        }
        if (this.h.get(i).f != 2 || this.h.get(i).g) {
        }
        return true;
    }

    public void a(final C0578a c0578a, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a938d6a3", new Object[]{this, c0578a, new Integer(i)});
            return;
        }
        if (this.h.get(i).f != 2) {
            c0578a.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.shop.features.category.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    int adapterPosition = c0578a.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    a.a(a.this, adapterPosition);
                    a.this.b.OnItemClick(adapterPosition);
                    a.this.a();
                    a.this.b(c0578a, adapterPosition);
                }
            });
            c0578a.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.shop.features.category.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    int adapterPosition = c0578a.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return false;
                    }
                    a.this.b.OnItemLongClick(adapterPosition);
                    return false;
                }
            });
        } else {
            c0578a.f15112a.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.shop.features.category.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    int adapterPosition = c0578a.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    a.a(a.this, adapterPosition);
                    a.this.b.OnItemClick(adapterPosition);
                    a.this.a();
                    a.this.b(c0578a, adapterPosition);
                }
            });
            c0578a.f15112a.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.shop.features.category.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    int adapterPosition = c0578a.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return false;
                    }
                    a.this.b.OnItemLongClick(adapterPosition);
                    return false;
                }
            });
        }
        c(c0578a, i);
        b(c0578a, i);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_J));
        }
        View view2 = this.f;
        if (view2 == null) {
            return;
        }
        view2.setBackgroundColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_C));
    }

    public void b(C0578a c0578a, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36738824", new Object[]{this, c0578a, new Integer(i)});
        } else if (i == this.g) {
            if (this.h.get(i).f != 0) {
                if (this.h.get(i).f == 1) {
                    this.d = c0578a.h;
                    this.e = c0578a.d;
                    c0578a.h.setVisibility(0);
                    c0578a.d.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_B));
                } else if (this.h.get(i).f != 2) {
                } else {
                    this.f = c0578a.c;
                    c0578a.c.setBackgroundColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_B));
                }
            } else if (i != 0) {
                this.d = c0578a.h;
                this.e = c0578a.d;
                c0578a.h.setVisibility(0);
                c0578a.d.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_B));
            } else if (i != 0) {
            } else {
                this.d = c0578a.h;
                c0578a.h.setVisibility(0);
                this.e = c0578a.d;
                c0578a.d.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_B));
            }
        } else if (this.h.get(i).f == 2) {
            c0578a.c.setBackgroundColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_C));
        } else if (this.h.get(i).f != 0) {
            if (this.h.get(i).f != 1) {
                return;
            }
            c0578a.h.setVisibility(8);
            c0578a.d.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_J));
        } else if (i != 0) {
            c0578a.h.setVisibility(8);
            c0578a.d.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_J));
        } else if (i != 0) {
        } else {
            c0578a.h.setVisibility(8);
            c0578a.d.setTextColor(this.c.getApplicationContext().getResources().getColor(R.color.SC_A_J));
        }
    }

    public void c(C0578a c0578a, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ae39a5", new Object[]{this, c0578a, new Integer(i)});
            return;
        }
        List<c> list = this.h;
        if (list == null || list.get(i) == null) {
            return;
        }
        if (this.h.get(i).f != 2 && this.h.get(i).f != 4) {
            c0578a.d.setText(this.h.get(i).b);
        } else if (this.h.get(i).f != 2 && this.h.get(i).f != 4) {
        } else {
            c cVar = this.h.get(i);
            if (!StringUtils.isEmpty(cVar.c)) {
                c0578a.b.setVisibility(0);
                c0578a.b.setImageUrl(cVar.c);
            } else {
                c0578a.b.setVisibility(8);
            }
            if ((c0578a.b.getVisibility() != 0 || c0578a.b.getDrawable() != null) && c0578a.b.getVisibility() != 8) {
                return;
            }
            c0578a.f15112a.setText(this.h.get(i).b);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<c> list = this.h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C0578a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0578a) ipChange.ipc$dispatch("38f56774", new Object[]{this, viewGroup, new Integer(i)});
        }
        View view = null;
        if (i == 3) {
            view = this.f15107a.inflate(R.layout.shop_category_head_view, (ViewGroup) null);
        } else if (i == 0) {
            view = this.f15107a.inflate(R.layout.shop_category_group_item_1, (ViewGroup) null);
        } else if (i == 1) {
            view = this.f15107a.inflate(R.layout.shop_category_group_item_1, (ViewGroup) null);
        } else if (i == 2 || i == 4) {
            view = this.f15107a.inflate(R.layout.shop_category_child_gridview_item, (ViewGroup) null);
            view.setLayoutParams(new AbsListView.LayoutParams((MCategoryController.width / 2) - 5, (int) (f.c() * 51.0f)));
        }
        return new C0578a(view, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.h.get(i).f == 0) {
            return i == 0 ? 3 : 0;
        } else if (this.h.get(i).f == 1) {
            return 1;
        } else {
            if (this.h.get(i).f != 2) {
                return -1;
            }
            return this.h.get(i).g ? 4 : 2;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
    }

    public void a(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.h = list;
        }
    }
}
