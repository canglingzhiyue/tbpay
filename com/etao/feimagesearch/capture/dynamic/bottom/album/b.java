package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.k;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6519a;
    private List<k> b;
    private Context c;
    private com.etao.feimagesearch.album.thumbnail.a d;
    private rul<? super k, t> e;

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.album.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC0210b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ k c;

        public View$OnClickListenerC0210b(k kVar) {
            this.c = kVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            rul a2 = b.a(b.this);
            if (a2 == null) {
                return;
            }
            a2.mo2421invoke(this.c);
        }
    }

    static {
        kge.a(2127089980);
    }

    public static final /* synthetic */ rul a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("3b0864ea", new Object[]{bVar}) : bVar.e;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, aVar, new Integer(i)});
        } else {
            a(aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.etao.feimagesearch.capture.dynamic.bottom.album.b$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public b(Context ctx, boolean z, com.etao.feimagesearch.album.thumbnail.a thumbnailExecutor, rul<? super k, t> rulVar) {
        q.c(ctx, "ctx");
        q.c(thumbnailExecutor, "thumbnailExecutor");
        this.c = ctx;
        this.f6519a = z;
        this.d = thumbnailExecutor;
        this.e = rulVar;
    }

    public final void a(List<k> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.b = list;
            notifyDataSetChanged();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        notifyDataSetChanged();
    }

    public a a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("eed47b8a", new Object[]{this, parent, new Integer(i)});
        }
        q.c(parent, "parent");
        View rootView = LayoutInflater.from(this.c).inflate(R.layout.feis_album_folder_list_item, parent, false);
        q.a((Object) rootView, "rootView");
        return new a(rootView, this.f6519a, this.d);
    }

    public void a(a aVar, int i) {
        List<k> list;
        int adapterPosition;
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1aae58d", new Object[]{this, aVar, new Integer(i)});
        } else if (aVar == null || (list = this.b) == null || (kVar = list.get((adapterPosition = aVar.getAdapterPosition()))) == null) {
        } else {
            if (kVar.f()) {
                aVar.d().a(kVar.e().get(0), aVar.c());
            }
            aVar.a().setText(kVar.a());
            if (adapterPosition == 0) {
                aVar.b().setVisibility(8);
            } else {
                aVar.b().setVisibility(0);
                aVar.b().setText(kVar.c());
            }
            aVar.itemView.setOnClickListener(new View$OnClickListenerC0210b(kVar));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<k> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private TextView f6520a;
        private TextView b;
        private TUrlImageView c;
        private final com.etao.feimagesearch.album.thumbnail.d d;

        static {
            kge.a(1019911984);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView, boolean z, com.etao.feimagesearch.album.thumbnail.a thumbnailExecutor) {
            super(itemView);
            q.c(itemView, "itemView");
            q.c(thumbnailExecutor, "thumbnailExecutor");
            View findViewById = itemView.findViewById(R.id.folder_list_name);
            TextView textView = (TextView) findViewById;
            textView.setTextSize(1, z ? 21.0f : 16.0f);
            q.a((Object) findViewById, "itemView.findViewById<Te…lder) 21f else 16f)\n    }");
            this.f6520a = textView;
            View findViewById2 = itemView.findViewById(R.id.folder_list_count);
            TextView textView2 = (TextView) findViewById2;
            textView2.setTextSize(1, z ? 18.0f : 13.0f);
            q.a((Object) findViewById2, "itemView.findViewById<Te…lder) 18f else 13f)\n    }");
            this.b = textView2;
            View findViewById3 = itemView.findViewById(R.id.folder_list_thumb);
            q.a((Object) findViewById3, "itemView.findViewById(R.id.folder_list_thumb)");
            this.c = (TUrlImageView) findViewById3;
            this.d = new com.etao.feimagesearch.album.thumbnail.d(thumbnailExecutor);
        }

        public final TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.f6520a;
        }

        public final TextView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f7e0415d", new Object[]{this}) : this.b;
        }

        public final TUrlImageView c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("44403452", new Object[]{this}) : this.c;
        }

        public final com.etao.feimagesearch.album.thumbnail.d d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.etao.feimagesearch.album.thumbnail.d) ipChange.ipc$dispatch("fd7fb228", new Object[]{this}) : this.d;
        }
    }
}
