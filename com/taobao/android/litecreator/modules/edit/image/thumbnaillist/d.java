package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.e;
import com.taobao.android.litecreator.util.ab;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.gzq;
import tb.gzr;
import tb.gzs;
import tb.gzt;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends RecyclerView.Adapter<gzr> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_TAG_MEDIA_IMAGE = "MEDIA_IMAGE";
    public static final String TYPE_TAG_MEDIA_VIDEO = "MEDIA_VIDEO";
    public static final String TYPE_TAG_TEMPLATE_MULTI = "TEMPLATE_MULTI";
    private ThumbnailItem c;
    private RecyclerView e;
    private int f;
    private boolean g;
    private b h;
    private boolean i;
    private Bitmap k;
    private final Context l;
    private ItemTouchHelper m;
    private String n;
    private String o;
    private boolean p;
    private g q;
    private Vibrator t;

    /* renamed from: a  reason: collision with root package name */
    private int f13351a = 9;
    private boolean d = true;
    private int j = 5;
    private int b = 0;
    private ArrayList<ThumbnailItem> r = new ArrayList<>();
    private ArrayList<ThumbnailItem> s = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(int i);

        void a(int i, int i2);

        void a(int i, View view);

        void a(int i, boolean z, boolean z2);
    }

    static {
        kge.a(694120663);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -1079446313) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ArrayList a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("20c6ac01", new Object[]{dVar}) : dVar.s;
    }

    public static /* synthetic */ void a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756863c", new Object[]{dVar, new Integer(i)});
        } else {
            dVar.e(i);
        }
    }

    public static /* synthetic */ int b(d dVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce626d30", new Object[]{dVar, new Integer(i)})).intValue() : dVar.f(i);
    }

    public static /* synthetic */ ArrayList b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1fed3b60", new Object[]{dVar}) : dVar.r;
    }

    public static /* synthetic */ int c(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("956e5431", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.f = i;
        return i;
    }

    public static /* synthetic */ b c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("196b6ea6", new Object[]{dVar}) : dVar.h;
    }

    public static /* synthetic */ ThumbnailItem d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThumbnailItem) ipChange.ipc$dispatch("add99ac8", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ String e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19fb89dd", new Object[]{dVar}) : dVar.n;
    }

    public static /* synthetic */ int f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("51e3a9f5", new Object[]{dVar})).intValue() : dVar.b;
    }

    public static /* synthetic */ boolean g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d42e5ee5", new Object[]{dVar})).booleanValue() : dVar.c();
    }

    public static /* synthetic */ int h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("567913b3", new Object[]{dVar})).intValue() : dVar.f13351a;
    }

    public static /* synthetic */ ItemTouchHelper i(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemTouchHelper) ipChange.ipc$dispatch("d62a7dd0", new Object[]{dVar}) : dVar.m;
    }

    public static /* synthetic */ void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0e7d7e", new Object[]{dVar});
        } else {
            dVar.f();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(gzr gzrVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, gzrVar, new Integer(i)});
        } else {
            a(gzrVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.gzr, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ gzr mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public d(Context context, b bVar) {
        this.l = context;
        this.h = bVar;
        this.k = BitmapFactory.decodeResource(this.l.getResources(), R.drawable.video_frame_place_holder);
        this.t = (Vibrator) this.l.getSystemService("vibrator");
    }

    private List<ThumbnailItem> a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82a24116", new Object[]{this, str, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(a(str));
        }
        return arrayList;
    }

    public ThumbnailItem a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThumbnailItem) ipChange.ipc$dispatch("3ecbe36", new Object[]{this, str}) : new ThumbnailItem(str);
    }

    private void a(ThumbnailRecyclerview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72adaa1e", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f13351a = aVar.f13348a;
            this.d = aVar.e;
            this.n = aVar.d;
            this.o = aVar.c;
            this.j = aVar.b;
            this.p = aVar.f;
            this.i = aVar.g;
        }
    }

    private int a(List<ThumbnailItem> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a074bd", new Object[]{this, list, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(this.o)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ThumbnailItem thumbnailItem = list.get(i2);
            if (i2 != i && thumbnailItem != null && TextUtils.equals(this.o, thumbnailItem.typeTag)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return 0;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            ThumbnailItem thumbnailItem2 = list.get(((Integer) arrayList.get(i3)).intValue());
            list.remove(thumbnailItem2);
            list.add(i, thumbnailItem2);
        }
        return size;
    }

    public void a(List<ThumbnailItem> list, ThumbnailRecyclerview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76beb64d", new Object[]{this, list, aVar});
        } else if (list == null || list.isEmpty()) {
        } else {
            a(aVar);
            this.s.clear();
            this.r.clear();
            a(list, 0);
            this.r.addAll(list);
            this.s.addAll(a("PLACEHOLDER", this.j));
            this.s.addAll(list);
            if (b()) {
                this.s.add(a("ADD_BUTTON"));
                this.s.addAll(a("PLACEHOLDER", this.j - 1));
            } else {
                this.s.addAll(a("PLACEHOLDER", this.j));
            }
            notifyDataSetChanged();
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        final int g = g(i);
        boolean b2 = b();
        this.r.remove(this.s.remove(g));
        if (!b2) {
            int size = this.r.size();
            int i2 = this.j;
            final int i3 = size + i2;
            if (i2 > 0) {
                this.s.set(i3, a("ADD_BUTTON"));
            } else {
                this.s.add(i3, a("ADD_BUTTON"));
            }
            notifyItemRangeChanged(g, this.s.size() - g);
            au.a(new Runnable() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int i4 = g;
                    if (i4 == i3) {
                        d.a(d.this, i4 - 1);
                    } else {
                        d.a(d.this, i4);
                    }
                }
            }, 100L);
            return;
        }
        notifyItemRangeRemoved(g, 1);
        notifyItemRangeChanged(g, this.s.size() - g);
        if (g == this.r.size() + this.j) {
            e(g - 1);
        } else {
            e(g);
        }
    }

    public List<ThumbnailItem> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.r;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
            return;
        }
        int g = g(i);
        if (g < 0 || g >= getItemCount()) {
            return;
        }
        notifyItemChanged(g, Integer.valueOf(g));
    }

    private void a(List<ThumbnailItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        int size = list.size();
        int size2 = this.r.size() + this.j;
        this.r.addAll(list);
        this.s.addAll(size2, list);
        a(size2, size);
    }

    private void a(final int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!b()) {
            int i3 = i2 + i;
            if (this.j > 0) {
                this.s.set(i3, a("PLACEHOLDER"));
                notifyItemRangeChanged(i, this.s.size() - i);
            } else {
                this.s.remove(i3);
                notifyItemRemoved(i3);
            }
        } else {
            notifyItemRangeInserted(i, i2);
        }
        au.c(new Runnable() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.a(d.this, i);
                }
            }
        });
    }

    private void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (!b()) {
            int i4 = i + i2;
            if (this.j > 0) {
                this.s.set(i4, a("PLACEHOLDER"));
            } else {
                this.s.remove(i4);
            }
        }
        int i5 = this.j;
        notifyItemRangeChanged(i5, this.s.size() - i5);
        final int i6 = (i3 + this.j) - 1;
        au.c(new Runnable() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.a(d.this, i6);
                }
            }
        });
    }

    public void b(List<ThumbnailItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            if (!TextUtils.isEmpty(this.o)) {
                int size = list.size();
                int size2 = this.r.size() + this.j;
                this.r.addAll(list);
                this.s.addAll(size2, list);
                a(this.r, 0);
                int a2 = a(this.s, this.j);
                if (a2 > 0) {
                    a(size2, size, a2);
                    return;
                } else {
                    a(size2, size);
                    return;
                }
            }
            a(list);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa8f4d7", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.e = recyclerView;
        this.q = (g) recyclerView.getLayoutManager();
        e eVar = new e();
        eVar.a(new e.a() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.e.a
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                ab.a(d.a(d.this), i, i2);
                ab.a(d.b(d.this), d.b(d.this, i), d.b(d.this, i2));
                d.c(d.this).a(d.b(d.this, i), d.b(d.this, i2));
            }

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.e.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                d.c(d.this).a(d.b(d.this, i), true, d.d(d.this).equals(d.a(d.this).get(i)));
                d.this.d(i);
            }

            @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.e.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : d.e(d.this);
            }
        });
        this.m = new ItemTouchHelper(eVar);
        this.m.attachToRecyclerView(recyclerView);
    }

    public gzr a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzr) ipChange.ipc$dispatch("56b17dcb", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 1) {
            return new gzt(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_thumbnail_list_normal_item, viewGroup, false));
        }
        if (i == 2) {
            this.h.a();
            return new gzq(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_thumbnail_list_add_item, viewGroup, false));
        }
        return new gzs(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_thumbnail_list_media_item, viewGroup, false), this.d, this.i);
    }

    public void a(final gzr gzrVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3fe98a", new Object[]{this, gzrVar, new Integer(i)});
            return;
        }
        if (getItemViewType(i) == 0) {
            ((gzs) gzrVar).a(this.k);
            a(gzrVar, new a() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.a
                public void a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    } else if (d.f(d.this) != i2) {
                        boolean equals = d.d(d.this).equals(d.a(d.this).get(i2));
                        d.a(d.this, i2);
                        d.c(d.this).a(d.b(d.this, i2), false, equals);
                    } else if (!d.g(d.this)) {
                    } else {
                        d.this.a(true);
                        d.c(d.this).a(d.b(d.this, i2), gzrVar.itemView);
                    }
                }
            });
            if (!a(this.s.get(i))) {
                a(gzrVar);
            }
        } else if (getItemViewType(i) == 2) {
            a(gzrVar, new a() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.a
                public void a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    } else {
                        d.c(d.this).a(d.h(d.this) - d.b(d.this).size());
                    }
                }
            });
        }
        ThumbnailItem thumbnailItem = this.s.get(i);
        if (this.b != i) {
            z = false;
        }
        gzrVar.a(thumbnailItem, i, z);
    }

    private void a(final gzr gzrVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682a1a79", new Object[]{this, gzrVar, aVar});
        } else {
            gzrVar.a(new gzr.a() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gzr.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(gzrVar.getAdapterPosition());
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Vibrator vibrator = this.t;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.t.vibrate(50L);
    }

    private boolean a(ThumbnailItem thumbnailItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b5451b0", new Object[]{this, thumbnailItem})).booleanValue() : TextUtils.equals(thumbnailItem.typeTag, this.n);
    }

    private void a(final gzr gzrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb441c99", new Object[]{this, gzrVar});
        } else {
            gzrVar.a(new gzr.b() { // from class: com.taobao.android.litecreator.modules.edit.image.thumbnaillist.d.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gzr.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    d dVar = d.this;
                    d.c(dVar, d.f(dVar));
                    d.i(d.this).startDrag(gzrVar);
                    d.j(d.this);
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < this.j || i > this.r.size() + this.j) {
            return 1;
        }
        if (i != this.r.size() + this.j) {
            return 0;
        }
        return b() ? 2 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.s.size();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.litecreator.util.c.a(this.k);
        Iterator<ThumbnailItem> it = this.r.iterator();
        while (it.hasNext()) {
            com.taobao.android.litecreator.util.c.a(it.next().coverThumbnail);
        }
        for (int i = 0; i < this.e.getChildCount(); i++) {
            RecyclerView recyclerView = this.e;
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            if (childViewHolder instanceof gzs) {
                ((gzs) childViewHolder).a();
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.r.size() < this.f13351a;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            e(g(i));
        }
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= getItemCount()) {
        } else {
            u.a("ThumbnailListAdapter", "aYou thumbnail setSelectedIndex, mSelectedIndex=" + this.b + " ,mLastTabIndex=" + this.f + " ,position=" + i);
            int i2 = this.f;
            if (i != i2) {
                this.b = i;
                notifyItemChanged(i2, Integer.valueOf(i2));
                notifyItemChanged(i, Integer.valueOf(i));
                this.q.smoothScrollToPosition(this.e, new RecyclerView.State(), i);
            }
            this.c = this.s.get(i);
            this.f = i;
        }
    }

    private int f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0a9cea9", new Object[]{this, new Integer(i)})).intValue() : i - this.j;
    }

    private int g(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b25ea748", new Object[]{this, new Integer(i)})).intValue() : i + this.j;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= getItemCount()) {
        } else {
            this.b = i;
            int indexOf = this.s.indexOf(this.c);
            notifyItemChanged(indexOf, Integer.valueOf(indexOf));
            notifyItemChanged(i, Integer.valueOf(i));
            this.q.smoothScrollToPosition(this.e, new RecyclerView.State(), i);
            this.c = this.s.get(i);
            this.f = i;
            u.a("ThumbnailListAdapter", "ayou thumbnail setSelectedIndexByDrag, mSelectedIndex=" + this.b + " ,mLastTabIndex=" + this.f + " ,position=" + i);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : (this.p || this.r.size() > 1) && !d();
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.g;
    }
}
