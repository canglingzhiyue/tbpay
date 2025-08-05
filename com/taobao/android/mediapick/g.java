package com.taobao.android.mediapick;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.widget.MRecyclerView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.hrz;
import tb.hsa;
import tb.hsb;
import tb.hse;
import tb.hsf;
import tb.hsg;
import tb.hsn;
import tb.hso;
import tb.kge;

/* loaded from: classes6.dex */
public final class g implements IMediaPickClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MediaPickClient";
    public static final hso sDefaultLogger;
    public static final hsg sDefaultToast;
    public i b;
    private Activity c;
    private RecyclerView d;
    private f e;
    private MRecyclerView.a f;
    private MRecyclerView.b g;
    private IMediaPickClient.PickMode h;
    private int j;
    private IMediaPickClient.a k;
    private RecyclerView.ItemDecoration q;
    private IMediaPickClient.b i = IMediaPickClient.b.h;

    /* renamed from: a  reason: collision with root package name */
    public List<Media> f14238a = new ArrayList();
    private hsg l = sDefaultToast;
    private hso m = sDefaultLogger;
    private e n = null;
    private Handler o = new Handler(Looper.getMainLooper());
    private IMediaPickClient.a p = new IMediaPickClient.a() { // from class: com.taobao.android.mediapick.g.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.mediapick.IMediaPickClient.a
        public void a(Media media, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59c3cf68", new Object[]{this, media, new Integer(i)});
            } else if (g.a(g.this) == null) {
            } else {
                g.a(g.this).a(media, i);
            }
        }

        @Override // com.taobao.android.mediapick.IMediaPickClient.a
        public void b(Media media, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938e7147", new Object[]{this, media, new Integer(i)});
            } else if (g.a(g.this) == null) {
            } else {
                g.a(g.this).b(media, i);
            }
        }

        @Override // com.taobao.android.mediapick.IMediaPickClient.a
        public void c(Media media, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd591326", new Object[]{this, media, new Integer(i)});
            } else if (g.a(g.this) == null) {
            } else {
                g.a(g.this).c(media, i);
            }
        }
    };

    public static /* synthetic */ IMediaPickClient.a a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPickClient.a) ipChange.ipc$dispatch("8ee7c9d", new Object[]{gVar}) : gVar.k;
    }

    public static /* synthetic */ f b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1065be8e", new Object[]{gVar}) : gVar.e;
    }

    static {
        kge.a(1367975603);
        kge.a(-1536089436);
        sDefaultToast = new hsf();
        sDefaultLogger = new hsn();
    }

    public static IMediaPickClient a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPickClient) ipChange.ipc$dispatch("7a3ee3c7", new Object[]{activity}) : new g(activity);
    }

    public static IMediaPickClient a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPickClient) ipChange.ipc$dispatch("77f7c2a3", new Object[]{recyclerView}) : new g(recyclerView);
    }

    private g(Activity activity) {
        this.c = activity;
        j();
    }

    private g(RecyclerView recyclerView) {
        this.d = recyclerView;
        this.c = (Activity) recyclerView.getContext();
        j();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new MRecyclerView(this.c, this);
            this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        this.f = new MRecyclerView.a(this.c, 4, this);
        this.g = new MRecyclerView.b(this.c, 0, false, this);
        ((DefaultItemAnimator) this.d.getItemAnimator()).setSupportsChangeAnimations(false);
        this.e = new f(this);
        this.e.a(hsa.class);
        this.e.a(hsb.class);
        this.e.a(hrz.class);
        this.d.setAdapter(this.e);
        a(IMediaPickClient.b.h);
        a(9);
        a(IMediaPickClient.PickMode.MULTIP);
    }

    public Activity e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("28c80bbc", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(IMediaPickClient.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15130058", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    @Deprecated
    public void a(IMediaPickClient.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151374b7", new Object[]{this, bVar});
        } else {
            b(bVar);
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void b(final IMediaPickClient.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2ef356", new Object[]{this, bVar});
            return;
        }
        if (bVar.f) {
            this.d.setLayoutManager(this.g);
            this.g.setReverseLayout(bVar.i);
            this.g.a(bVar.j);
        } else {
            this.d.setLayoutManager(this.f);
            this.f.setSpanCount(bVar.c);
            this.f.setReverseLayout(bVar.i);
            this.f.a(bVar.j);
        }
        this.d.setBackgroundColor(bVar.d);
        RecyclerView.ItemDecoration itemDecoration = this.q;
        if (itemDecoration != null) {
            this.d.removeItemDecoration(itemDecoration);
        }
        this.q = new RecyclerView.ItemDecoration() { // from class: com.taobao.android.mediapick.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                } else {
                    rect.set(bVar.e, bVar.e, bVar.e, bVar.e);
                }
            }
        };
        this.d.addItemDecoration(this.q);
        this.i = bVar;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc15390", new Object[]{this, dVar});
            return;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        this.o.post(new Runnable() { // from class: com.taobao.android.mediapick.g.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g.b(g.this).a(dVar);
                dVar.l();
            }
        });
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("84548735", new Object[]{this}) : this.e.a();
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(IMediaPickClient.PickMode pickMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204a7013", new Object[]{this, pickMode});
        } else {
            this.h = pickMode;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(Class<? extends c> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
        } else {
            this.e.a(cls);
        }
    }

    public <T extends Media> boolean c(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd59132a", new Object[]{this, t, new Integer(i)})).booleanValue();
        }
        if (!d().contains(t)) {
            hso hsoVar = this.m;
            hsoVar.a(TAG, "media:" + t + " not in picked list, unpick failed!");
            return false;
        }
        d().remove(t);
        i().b(t, i);
        k();
        return true;
    }

    public <T extends Media> boolean d(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("723b509", new Object[]{this, t, new Integer(i)})).booleanValue();
        }
        e eVar = this.n;
        if (eVar != null && eVar.a(t)) {
            hso hsoVar = this.m;
            hsoVar.a(TAG, "media:" + t + " pick event intercepted.");
            return false;
        } else if (IMediaPickClient.PickMode.MULTIP_REPEAT != g() && d().contains(t)) {
            hso hsoVar2 = this.m;
            hsoVar2.a(TAG, "media:" + t + " has already picked.");
            return false;
        } else {
            if (IMediaPickClient.PickMode.SINGLE == g()) {
                if (d().size() > 0) {
                    Media media = d().get(0);
                    d().remove(media);
                    i().b(media, i);
                }
                d().clear();
            } else if (d().size() >= h()) {
                this.l.a(e(), String.format(TextUtils.isEmpty(this.i.g) ? b.a(R.string.gg_pub_max_selection_limit) : this.i.g, Integer.valueOf(h())));
                return false;
            }
            d().add(t);
            i().a(t, i);
            k();
            return true;
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        i iVar = this.b;
        if (iVar == null) {
            c();
            return;
        }
        for (IMediaPickClient iMediaPickClient : iVar.b) {
            iMediaPickClient.c();
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public <T extends Media> boolean a(T t, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59c3cf6c", new Object[]{this, t, new Integer(i)})).booleanValue() : d(t, i);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public <T extends Media> boolean b(T t, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("938e714b", new Object[]{this, t, new Integer(i)})).booleanValue() : c(t, i);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(hsg hsgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec91509c", new Object[]{this, hsgVar});
        } else if (hsgVar == null) {
        } else {
            this.l = hsgVar;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(hso hsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec94f394", new Object[]{this, hsoVar});
        } else if (hsoVar == null) {
        } else {
            this.m = hsoVar;
        }
    }

    public hso f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hso) ipChange.ipc$dispatch("357de3b5", new Object[]{this}) : this.m;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc1c7ef", new Object[]{this, eVar});
        } else {
            this.n = eVar;
        }
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        f fVar = this.e;
        if (fVar == null) {
            return;
        }
        fVar.notifyItemChanged(i);
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f fVar = this.e;
        if (fVar == null || fVar.a() == null || this.e.a().i() == null) {
            return;
        }
        f fVar2 = this.e;
        fVar2.notifyItemRangeChanged(0, fVar2.a().i().size());
    }

    public IMediaPickClient.PickMode g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPickClient.PickMode) ipChange.ipc$dispatch("9aa6eb53", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public List<Media> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.f14238a;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public boolean a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcc3996f", new Object[]{this, iVar})).booleanValue();
        }
        if (iVar == null || this.f14238a.size() > 0) {
            return false;
        }
        this.b = iVar;
        this.f14238a = iVar.f14242a;
        return true;
    }

    @Override // com.taobao.android.mediapick.IMediaPickClient
    public void a(hse hseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9067de", new Object[]{this, hseVar});
        } else {
            this.e.a(hseVar);
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.j;
    }

    public IMediaPickClient.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPickClient.a) ipChange.ipc$dispatch("926f4260", new Object[]{this}) : this.p;
    }
}
