package com.alibaba.triver.triver_shop.newShop.view;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.view.l;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public final class i extends RecyclerView.Adapter<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f3987a;
    private final int b;
    private final List<String> c;
    private final l.b d;
    private final com.alibaba.triver.triver_shop.newShop.data.d e;
    private j f;
    private a g;
    private int h;
    private final HashMap<Integer, b> i;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-688178918);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == -1324657775) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ List a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dde2066e", new Object[]{iVar}) : iVar.c;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("e2824929", new Object[]{iVar}) : iVar.e;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
        } else {
            a(bVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.alibaba.triver.triver_shop.newShop.view.i$b, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }

    public i(int i, int i2, List<String> dataList, l.b statusModel, com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        kotlin.jvm.internal.q.d(dataList, "dataList");
        kotlin.jvm.internal.q.d(statusModel, "statusModel");
        kotlin.jvm.internal.q.d(shopData, "shopData");
        this.f3987a = i;
        this.b = i2;
        this.c = dataList;
        this.d = statusModel;
        this.e = shopData;
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.e;
        this.h = dVar.f(dVar.p(), this.e.q());
        this.i = new HashMap<>();
    }

    public final j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("47187c58", new Object[]{this}) : this.f;
    }

    public final void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256d5718", new Object[]{this, jVar});
        } else {
            this.f = jVar;
        }
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c94109c", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7024b91d", new Object[]{this}) : this.g;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.h;
    }

    public b a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("54494a8f", new Object[]{this, parent, new Integer(i)});
        }
        kotlin.jvm.internal.q.d(parent, "parent");
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, this.b));
        textView.setGravity(16);
        return new b(this, textView, this.d);
    }

    public void a(b viewholder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fc8d68", new Object[]{this, viewholder, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.d(viewholder, "viewholder");
        viewholder.a(i);
        this.i.put(Integer.valueOf(i), viewholder);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.c.size();
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9484fb", new Object[]{this, bVar});
            return;
        }
        super.onViewRecycled(bVar);
        if (bVar == null) {
            return;
        }
        this.i.remove(Integer.valueOf(bVar.b()));
        bVar.d();
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        b bVar = this.i.get(Integer.valueOf(i));
        if (bVar == null) {
            return;
        }
        bVar.b(i);
    }

    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f3988a;
        private final TextView b;
        private final l.b c;
        private int d;
        private final a e;
        private final View.OnClickListener f;

        /* loaded from: classes3.dex */
        public static final class a implements l.b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.triver.triver_shop.newShop.view.l.b.a
            public void a(l.b statusModel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("81b30ed8", new Object[]{this, statusModel});
                    return;
                }
                kotlin.jvm.internal.q.d(statusModel, "statusModel");
                b.this.c();
            }
        }

        /* renamed from: com.alibaba.triver.triver_shop.newShop.view.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0146b implements a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0146b() {
            }

            @Override // com.alibaba.triver.triver_shop.newShop.view.i.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                b.a(bVar, bVar.a());
            }
        }

        /* loaded from: classes3.dex */
        public static final class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ i b;

            public c(i iVar) {
                this.b = iVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b bVar = b.this;
                b.a(bVar, bVar.b());
                com.alibaba.triver.triver_shop.newShop.ext.b.a("cycleIndexNavClickTask", new InfinityCycleAdapter$ViewHolder$targetViewClickListener$1$1(this.b, b.this));
            }
        }

        static {
            kge.a(-923756901);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i this$0, TextView targetView, l.b statusModel) {
            super(targetView);
            kotlin.jvm.internal.q.d(this$0, "this$0");
            kotlin.jvm.internal.q.d(targetView, "targetView");
            kotlin.jvm.internal.q.d(statusModel, "statusModel");
            this.f3988a = this$0;
            this.b = targetView;
            this.c = statusModel;
            this.f = new c(this.f3988a);
            this.e = new a();
        }

        public static final /* synthetic */ void a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15fc8d68", new Object[]{bVar, new Integer(i)});
            } else {
                bVar.c(i);
            }
        }

        public static final /* synthetic */ void a(b bVar, TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e9ae1a9", new Object[]{bVar, textView});
            } else {
                bVar.a(textView);
            }
        }

        public final TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.b;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            this.c.a(this.e);
            this.d = i;
            this.b.setText((CharSequence) i.a(this.f3988a).get(i % i.a(this.f3988a).size()));
            b(i);
            e();
        }

        private final void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                return;
            }
            this.f3988a.a(i);
            a b = this.f3988a.b();
            if (b != null) {
                b.a();
            }
            j a2 = this.f3988a.a();
            if (a2 != null) {
                a2.a(i);
            }
            b(this.b);
            this.f3988a.a(new C0146b());
        }

        private final void a(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
                return;
            }
            String str = "#99ffffff";
            String str2 = (!this.c.d() || (!this.c.c() && (!this.c.b() || !this.c.a() || i.b(this.f3988a).o() != 0))) ? "#4c111111" : str;
            if (!this.c.e() || this.c.g() != 0) {
                str = str2;
            }
            textView.setTextSize(1, 17.0f);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setTextColor(Color.parseColor(str));
        }

        private final void b(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d9ea7b", new Object[]{this, textView});
                return;
            }
            String str = "#ffffff";
            String str2 = (!this.c.d() || (!this.c.c() && (!this.c.b() || !this.c.a() || i.b(this.f3988a).o() != 0))) ? "#111111" : str;
            if (!this.c.e() || this.c.g() != 0) {
                str = str2;
            }
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(1, 17.0f);
            textView.setTextColor(Color.parseColor(str));
        }

        public final void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            this.d = i;
            if (i == this.f3988a.c()) {
                c(i);
            } else {
                a(this.b);
            }
            this.b.setOnClickListener(this.f);
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            if (this.d == this.f3988a.c()) {
                c(this.d);
            } else {
                a(this.b);
            }
            this.b.setOnClickListener(this.f);
            e();
        }

        private final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            int d = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 27);
            if (this.c.b()) {
                this.b.setGravity(16);
                if (this.d == 0) {
                    this.b.setPadding(0, 0, d, 0);
                    return;
                } else {
                    this.b.setPadding(d, 0, d, 0);
                    return;
                }
            }
            this.b.setGravity(16);
            if (this.d == 0) {
                this.b.setPadding(0, 0, d, 0);
            } else {
                this.b.setPadding(d, 0, d, 0);
            }
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                this.c.b(this.e);
            }
        }
    }
}
