package com.etao.feimagesearch.videosearch.result;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.q;
import tb.cud;
import tb.kge;

/* loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter<com.etao.feimagesearch.videosearch.result.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cud b;
    private InterfaceC0252a c;

    /* renamed from: a  reason: collision with root package name */
    private final List<cud> f7091a = new ArrayList();
    private final ThreadPoolExecutor d = new ThreadPoolExecutor(1, 10, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: com.etao.feimagesearch.videosearch.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0252a {
        void a(cud cudVar, int i);
    }

    /* loaded from: classes4.dex */
    public static final class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7092a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, r});
            }
            q.c(r, "r");
            return new Thread(r, "NewResultThumbAdapter_" + this.f7092a.getAndIncrement());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a.this.a(this.b);
            InterfaceC0252a a2 = a.a(a.this);
            if (a2 == null) {
                return;
            }
            a2.a((cud) a.b(a.this).get(this.b), this.b);
        }
    }

    static {
        kge.a(-1763820065);
    }

    public a() {
        this.d.allowCoreThreadTimeOut(true);
    }

    public static final /* synthetic */ InterfaceC0252a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0252a) ipChange.ipc$dispatch("335a1d19", new Object[]{aVar}) : aVar.c;
    }

    public static final /* synthetic */ List b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("61b31199", new Object[]{aVar}) : aVar.f7091a;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(com.etao.feimagesearch.videosearch.result.b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
        } else {
            a(bVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.etao.feimagesearch.videosearch.result.b, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ com.etao.feimagesearch.videosearch.result.b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public com.etao.feimagesearch.videosearch.result.b a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.videosearch.result.b) ipChange.ipc$dispatch("a91f2402", new Object[]{this, parent, new Integer(i)});
        }
        q.c(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.feis_item_new_object, parent, false);
        q.a((Object) inflate, "LayoutInflater.from(pare…ew_object, parent, false)");
        Context context = parent.getContext();
        q.a((Object) context, "parent.context");
        return new com.etao.feimagesearch.videosearch.result.b(context, inflate, this.d);
    }

    public void a(com.etao.feimagesearch.videosearch.result.b holder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff20395", new Object[]{this, holder, new Integer(i)});
            return;
        }
        q.c(holder, "holder");
        holder.a(this.f7091a.get(i));
        holder.itemView.setOnClickListener(new c(i));
    }

    public final cud a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cud) ipChange.ipc$dispatch("f03692c", new Object[]{this});
        }
        if (this.f7091a.size() != 0) {
            return this.f7091a.get(0);
        }
        return null;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f7091a.size() == 0) {
        } else {
            cud cudVar = this.b;
            if (cudVar != null) {
                if (cudVar == null) {
                    q.a();
                }
                cudVar.h = false;
            }
            this.b = this.f7091a.get(i);
            cud cudVar2 = this.b;
            if (cudVar2 == null) {
                q.a();
            }
            cudVar2.h = true;
            notifyDataSetChanged();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.shutdownNow();
        for (cud cudVar : this.f7091a) {
            Bitmap bitmap = cudVar.p;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public final void a(cud result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e423e766", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        if (this.f7091a.isEmpty()) {
            result.h = true;
            this.b = result;
        }
        this.f7091a.add(result);
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f7091a.size();
    }

    public final void a(InterfaceC0252a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb60a132", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        this.c = listener;
    }
}
