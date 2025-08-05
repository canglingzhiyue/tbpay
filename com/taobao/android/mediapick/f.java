package com.taobao.android.mediapick;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.annotation.CellView;
import com.taobao.android.mediapick.d;
import com.taobao.android.mediapick.media.Media;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import tb.hsd;
import tb.hse;
import tb.hsk;
import tb.kge;

/* loaded from: classes6.dex */
public final class f extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f14235a;
    private hse b;
    private d c;
    private List<Class<? extends c>> d = new ArrayList();
    private List<Class<? extends Media>> e = new ArrayList();

    static {
        kge.a(-9763254);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public static /* synthetic */ d a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d1f0230", new Object[]{fVar}) : fVar.c;
    }

    public static /* synthetic */ d a(f fVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("eec34e08", new Object[]{fVar, dVar});
        }
        fVar.c = dVar;
        return dVar;
    }

    public static /* synthetic */ g b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a98cfeec", new Object[]{fVar}) : fVar.f14235a;
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

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.mediapick.f$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public f(g gVar) {
        this.f14235a = gVar;
        this.b = new hsd(gVar.e());
    }

    public void a(hse hseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9067de", new Object[]{this, hseVar});
        } else if (hseVar == null) {
        } else {
            this.b = hseVar;
        }
    }

    public void a(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc15390", new Object[]{this, dVar});
            return;
        }
        dVar.a(this.f14235a.e());
        dVar.a(new d.a() { // from class: com.taobao.android.mediapick.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.mediapick.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                f.a(f.this, dVar);
                f.this.notifyDataSetChanged();
            }
        });
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("10154ed6", new Object[]{this}) : this.c;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<? extends Media> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        d dVar = this.c;
        if (dVar != null && (i = dVar.i()) != null) {
            return i.size();
        }
        return 0;
    }

    public a a(ViewGroup viewGroup, int i) {
        c cVar;
        if (i == -1) {
            return null;
        }
        try {
            cVar = this.d.get(i).newInstance();
        } catch (Throwable unused) {
            cVar = null;
        }
        cVar.a(this.f14235a, this.b, viewGroup);
        return new a(cVar);
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb323832", new Object[]{this, aVar, new Integer(i)});
        } else {
            aVar.a(i);
        }
    }

    public void a(Class<? extends c> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
        } else if (cls == null) {
        } else {
            Type[] b = b(cls);
            if (b == null || b.length <= 0) {
                throw new RuntimeException("can't registe cellview without media type");
            }
            Class<? extends Media> cls2 = (Class) b[0];
            if (this.e.contains(cls2)) {
                int indexOf = this.e.indexOf(cls2);
                this.d.remove(indexOf);
                this.e.remove(indexOf);
            }
            this.d.add(cls);
            this.e.add(cls2);
            a(this.e.indexOf(cls2), cls);
        }
    }

    private void a(int i, Class<? extends c> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1680d02", new Object[]{this, new Integer(i), cls});
            return;
        }
        CellView cellView = (CellView) cls.getAnnotation(CellView.class);
        if (cellView == null || i == -1) {
            return;
        }
        ((RecyclerView) this.f14235a.a()).getRecycledViewPool().setMaxRecycledViews(i, cellView.cacheSize());
    }

    private Type[] b(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type[]) ipChange.ipc$dispatch("7d4832a8", new Object[]{this, cls});
        }
        if (cls == null) {
            return null;
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        if (!(genericSuperclass instanceof Class)) {
            return null;
        }
        return b((Class) genericSuperclass);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        d dVar = this.c;
        if (dVar != null) {
            return this.e.indexOf(dVar.i().get(i).getClass());
        }
        return 0;
    }

    /* loaded from: classes6.dex */
    public class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private c b;

        static {
            kge.a(-502394852);
        }

        public a(c cVar) {
            super(cVar.k);
            this.b = cVar;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (f.a(f.this) == null) {
            } else {
                T t = (T) f.a(f.this).i().get(i);
                boolean contains = f.b(f.this).d().contains(t);
                c cVar = this.b;
                cVar.i = t;
                cVar.j = i;
                cVar.a((c) t, contains);
                hsk.a("TAGMediaListAdapter", "bindData position=" + i);
            }
        }
    }
}
