package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.skeleton.recommend.d;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_DOUBLE_COLUMN = 2;
    public static final int TYPE_SINGLE_COLUMN = 1;

    /* renamed from: a  reason: collision with root package name */
    private Context f10946a;
    private eyx b;
    private final List<com.taobao.android.detail.ttdetail.component.module.d> c = new ArrayList(0);
    private f d;
    private com.taobao.android.detail.ttdetail.skeleton.recommend.b e;
    private boolean f;
    private boolean g;

    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.ViewHolder {
        static {
            kge.a(-1478770785);
        }

        public b(View view) {
            super(view);
        }
    }

    static {
        kge.a(-1507671338);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389a34d6", new Object[]{eVar});
        } else {
            eVar.d();
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daad18c2", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.g = z;
        return z;
    }

    public e(Context context, eyx eyxVar) {
        this.f10946a = context;
        this.b = eyxVar;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389aa935", new Object[]{this, fVar});
        } else {
            this.d = fVar;
        }
    }

    public void a(com.taobao.android.detail.ttdetail.skeleton.recommend.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3898d7b9", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public <F extends com.taobao.android.detail.ttdetail.component.module.d> void a(List<F> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.c.addAll(list);
            c();
            i.a("RecommendRecyclerAdapter", "mComponentList.size=" + this.c.size());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d dVar = new d(this.f10946a, this.b, new eyy(new JSONObject()), new DataEntry[0]);
        dVar.a(new d.a() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.skeleton.recommend.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    e.a(e.this);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.skeleton.recommend.d.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    e.a(e.this, true);
                }
            }
        });
        this.c.add(dVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int size = this.c.size() - 1;
        if (!(a(size) instanceof d)) {
            return;
        }
        this.c.remove(size);
    }

    public List<com.taobao.android.detail.ttdetail.component.module.d> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    public <F extends com.taobao.android.detail.ttdetail.component.module.d> F a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ipChange.ipc$dispatch("e131fe26", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.c.size()) {
            return (F) this.c.get(i);
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new b((FrameLayout) LayoutInflater.from(y.a(viewGroup)).inflate(R.layout.tt_detail_main_cell_container, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (this.c.isEmpty() || viewHolder.itemView == null) {
        } else {
            boolean b2 = this.d.b();
            FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
            View childAt = frameLayout.getChildAt(0);
            com.taobao.android.detail.ttdetail.component.module.d a2 = a(i);
            if (a2 == null) {
                return;
            }
            a2.create();
            View componentView = a2.getComponentView(childAt);
            if (childAt != componentView) {
                frameLayout.removeAllViews();
                frameLayout.addView(componentView, new FrameLayout.LayoutParams(-1, -2));
            }
            if (i != getItemCount() - 1) {
                a2.willAppear();
                a2.didAppear();
            } else if (a2 instanceof d) {
                d dVar = (d) a2;
                if (this.f && !this.g) {
                    dVar.c();
                } else if (b2 && !this.g) {
                    dVar.a();
                } else {
                    dVar.b();
                    this.g = true;
                }
            }
            if (!b2 || this.f || this.g) {
                return;
            }
            int parseInt = Integer.parseInt(j.E());
            if (this.c.size() - i != parseInt && (this.c.size() > parseInt || i != this.c.size() - 1)) {
                return;
            }
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        JSONObject c = this.d.c();
        if (this.e == null || c == null || c.isEmpty()) {
            return;
        }
        i.a("RecommendRecyclerAdapter", "onPagingRequest");
        this.e.a(c);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        com.taobao.android.detail.ttdetail.component.module.d a2;
        JSONObject d;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : (!this.c.isEmpty() && (a2 = a(i)) != null && (d = a2.getComponentData().d()) != null && !d.isEmpty() && TextUtils.equals(com.taobao.android.detail.ttdetail.constant.a.STYLE_DOUBLE_COLUMN, d.getString("style"))) ? 2 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.c.size();
    }

    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f10948a;

        static {
            kge.a(-575567855);
        }

        public a(int i) {
            this.f10948a = i;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
            int spanSize = layoutParams.getSpanSize();
            int spanIndex = layoutParams.getSpanIndex();
            if (spanSize == 2) {
                return;
            }
            if (spanIndex == 0) {
                int i = this.f10948a;
                rect.left = i;
                rect.right = i / 2;
                return;
            }
            int i2 = this.f10948a;
            rect.left = i2 / 2;
            rect.right = i2;
        }
    }
}
