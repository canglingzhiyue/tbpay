package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.k;
import com.etao.feimagesearch.album.o;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cot;
import tb.cox;
import tb.dau;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c Companion;
    public static final String TAG = "AutoSize__Bottom_Album_CaptureAlbumAdapter";

    /* renamed from: a  reason: collision with root package name */
    private k f6516a;
    private List<? extends o> b;
    private int c;
    private com.etao.feimagesearch.album.thumbnail.a d;
    private int e;
    private rul<? super o, t> f;
    private boolean g;
    private ruk<t> h;
    private boolean i;
    private int j;
    private final g k;
    private Map<Integer, Integer> l;
    private boolean m;

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.album.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC0209a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0209a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ruk<t> d = a.this.d();
            if (d == null) {
                return;
            }
            d.mo2427invoke();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o b;
        public final /* synthetic */ int c;

        public b(o oVar, int i) {
            this.b = oVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.b.b(this.c);
            rul<o, t> b = a.this.b();
            if (b != null) {
                b.mo2421invoke(this.b);
            }
            if (a.a(a.this) == 2) {
                cox.a("albumshortcutpicclick", new String[0]);
            } else if (a.a(a.this) != 0) {
            } else {
                cox.a("albumpicchoose", "index", String.valueOf(this.c));
            }
        }
    }

    static {
        kge.a(872584650);
        Companion = new c(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42b09067", new Object[]{aVar})).intValue() : aVar.c;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, eVar, new Integer(i)});
        } else {
            a(eVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.etao.feimagesearch.capture.dynamic.bottom.album.e, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ e mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public final rul<o, t> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("16bbe114", new Object[]{this}) : this.f;
    }

    public final ruk<t> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("261f2bb3", new Object[]{this}) : this.h;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        static {
            kge.a(-1349432174);
        }

        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public a(g gVar, com.etao.feimagesearch.album.thumbnail.a thumbnailExecutor, int i, boolean z, rul<? super o, t> rulVar, ruk<t> rukVar) {
        q.c(thumbnailExecutor, "thumbnailExecutor");
        this.k = gVar;
        this.d = thumbnailExecutor;
        this.e = i;
        this.m = z;
        this.f = rulVar;
        this.h = rukVar;
        this.l = new LinkedHashMap();
        this.c = -1;
    }

    public final k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("544ab61", new Object[]{this}) : this.f6516a;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.g;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.j;
    }

    public e a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("154b1404", new Object[]{this, parent, new Integer(i)});
        }
        q.c(parent, "parent");
        cot.c(TAG, "onCreateViewHolder");
        g gVar = this.k;
        View a2 = gVar != null ? gVar.a(R.layout.feis_capture_item_album_image) : null;
        if (a2 == null) {
            a2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.feis_capture_item_album_image, parent, false);
        } else {
            this.j++;
        }
        return new e(parent.getContext(), this.e, this.m, this.d, a2);
    }

    public void a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139a4f13", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        cot.c(TAG, "onBindViewHolder " + i);
        if (eVar == null) {
            return;
        }
        int adapterPosition = eVar.getAdapterPosition();
        if (!this.i) {
            this.i = true;
            dau.e();
        }
        if (this.g) {
            if (adapterPosition == 0) {
                eVar.b();
                eVar.itemView.setOnClickListener(new View$OnClickListenerC0209a());
                return;
            }
            adapterPosition--;
        }
        o c2 = c(adapterPosition);
        if (c2 == null) {
            return;
        }
        eVar.a(c2);
        eVar.itemView.setOnClickListener(new b(c2, adapterPosition));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return a(this.c) + (this.g ? 1 : 0);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f6516a = null;
        this.b = null;
        this.c = -1;
        this.l.clear();
        notifyDataSetChanged();
    }

    public final int a(int i) {
        LinkedList<o> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        k kVar = this.f6516a;
        if (kVar == null) {
            return 0;
        }
        if (i == 1) {
            g = kVar.g();
        } else if (i == 2) {
            g = this.b;
        } else {
            g = kVar.e();
        }
        if (g == null) {
            return 0;
        }
        return g.size();
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.c == i) {
        } else {
            this.c = i;
            notifyDataSetChanged();
        }
    }

    public final boolean a(k kVar, List<? extends o> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fc8c0c", new Object[]{this, kVar, list, new Boolean(z)})).booleanValue();
        }
        if (list != null) {
            this.b = list;
        }
        if (kVar == null) {
            return false;
        }
        k kVar2 = this.f6516a;
        if (kVar2 != null && (!q.a(kVar2, kVar))) {
            return false;
        }
        this.f6516a = kVar;
        g();
        if (z) {
            notifyDataSetChanged();
        }
        return this.c != 2;
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f6516a == null) {
        } else {
            this.l.put(1, Integer.valueOf(d(1)));
            this.l.put(2, Integer.valueOf(d(2)));
            this.l.put(0, Integer.valueOf(d(0)));
        }
    }

    private final int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{this, new Integer(i)})).intValue();
        }
        k kVar = this.f6516a;
        if (kVar == null) {
            return 0;
        }
        if (i == 1) {
            LinkedList<o> g = kVar.g();
            if (g == null) {
                return 0;
            }
            return g.size();
        } else if (i == 2) {
            List<? extends o> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.size();
        } else {
            LinkedList<o> e = kVar.e();
            if (e == null) {
                return 0;
            }
            return e.size();
        }
    }

    public final boolean a(List<? extends o> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        this.b = list;
        return this.c == 2;
    }

    public final void a(k kVar, List<? extends o> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64a304c", new Object[]{this, kVar, list});
        } else if (kVar == null || q.a(this.f6516a, kVar)) {
        } else {
            if (list != null) {
                this.b = list;
            }
            this.f6516a = kVar;
            g();
            notifyDataSetChanged();
        }
    }

    private final o c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("ee97054c", new Object[]{this, new Integer(i)});
        }
        k kVar = this.f6516a;
        if (kVar == null) {
            return null;
        }
        int i2 = this.c;
        if (i2 == 1) {
            return kVar.g().get(i);
        }
        if (i2 == 2) {
            List<? extends o> list = this.b;
            if (list == null) {
                return null;
            }
            return list.get(i);
        }
        return kVar.e().get(i);
    }
}
