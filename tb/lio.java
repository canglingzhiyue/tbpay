package tb;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.lks;
import tb.lkx;

/* loaded from: classes.dex */
public class lio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lkt<RecyclerView> f30657a;
    private RecyclerView.OnScrollListener b;
    private lil c;
    private View.OnAttachStateChangeListener d;
    private RecyclerView.OnChildAttachStateChangeListener e;
    private lim f;
    private lks.a<RecyclerView> g;
    private lks.c<RecyclerView> h;
    private boolean i;

    static {
        kge.a(373127735);
    }

    public static /* synthetic */ lkt a(lio lioVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkt) ipChange.ipc$dispatch("5158508b", new Object[]{lioVar}) : lioVar.f30657a;
    }

    public static /* synthetic */ void a(lio lioVar, RecyclerView recyclerView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3be076", new Object[]{lioVar, recyclerView, view, new Boolean(z)});
        } else {
            lioVar.a(recyclerView, view, z);
        }
    }

    public static /* synthetic */ boolean a(lio lioVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6892a892", new Object[]{lioVar, new Boolean(z)})).booleanValue();
        }
        lioVar.i = z;
        return z;
    }

    public lio(lkt<RecyclerView> lktVar) {
        this.f30657a = lktVar;
    }

    public void a(RecyclerView recyclerView, lij lijVar, lik likVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8696bc7b", new Object[]{this, recyclerView, lijVar, likVar});
            return;
        }
        this.b = b();
        recyclerView.addOnScrollListener(this.b);
        this.c = new lil();
        recyclerView.addOnScrollListener(this.c);
        this.d = c();
        recyclerView.addOnAttachStateChangeListener(this.d);
        this.e = a(recyclerView);
        recyclerView.addOnChildAttachStateChangeListener(this.e);
        this.f = new lim(this.f30657a);
        recyclerView.getAdapter().registerAdapterDataObserver(this.f);
        this.g = d();
        lijVar.a(this.g);
        this.h = e();
        likVar.a(this.h);
        recyclerView.setItemAnimator(new lii(f()));
    }

    public void b(RecyclerView recyclerView, lij lijVar, lik likVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410c5cfc", new Object[]{this, recyclerView, lijVar, likVar});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.b;
        if (onScrollListener != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
            this.b = null;
        }
        lil lilVar = this.c;
        if (lilVar != null) {
            recyclerView.removeOnScrollListener(lilVar);
            this.c = null;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener != null) {
            recyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.d = null;
        }
        RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener = this.e;
        if (onChildAttachStateChangeListener != null) {
            recyclerView.removeOnChildAttachStateChangeListener(onChildAttachStateChangeListener);
            this.e = null;
        }
        if (this.f != null) {
            recyclerView.getAdapter().unregisterAdapterDataObserver(this.f);
            this.f = null;
        }
        if (this.g != null) {
            lijVar.a((lks.a<RecyclerView>) null);
            this.g = null;
        }
        if (this.h == null) {
            return;
        }
        likVar.a((lks.c) null);
    }

    public void a(lik likVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d9998a", new Object[]{this, likVar});
            return;
        }
        this.h = e();
        likVar.a(this.h);
    }

    public void b(lik likVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15ca00b", new Object[]{this, likVar});
        } else if (this.h == null) {
        } else {
            likVar.a((lks.c) null);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.i;
    }

    private RecyclerView.OnScrollListener b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("c7e6bd97", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: tb.lio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                } else {
                    lio.a(lio.this).a((lkt) recyclerView, i);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    lio.a(lio.this).a((lkt) recyclerView, i, i2);
                }
            }
        };
    }

    private View.OnAttachStateChangeListener c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("2f62b23f", new Object[]{this}) : new View.OnAttachStateChangeListener() { // from class: tb.lio.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else {
                    lio.a(lio.this).a(view);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else {
                    lio.a(lio.this).b(view);
                }
            }
        };
    }

    private lks.a<RecyclerView> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.a) ipChange.ipc$dispatch("103c64ca", new Object[]{this}) : new lks.a<RecyclerView>() { // from class: tb.lio.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    lio.a(lio.this).a(i);
                }
            }

            @Override // tb.lks.a
            public void a(Canvas canvas, RecyclerView recyclerView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c157922b", new Object[]{this, canvas, recyclerView});
                } else {
                    lio.a(lio.this).a(canvas, (Canvas) recyclerView);
                }
            }
        };
    }

    private lks.c<RecyclerView> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("f21a2ea7", new Object[]{this}) : new lks.c<RecyclerView>() { // from class: tb.lio.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.c
            public /* bridge */ /* synthetic */ void a(RecyclerView recyclerView, int i) {
            }

            @Override // tb.lks.c
            public /* bridge */ /* synthetic */ void a(RecyclerView recyclerView, int i, int i2) {
            }

            @Override // tb.lks.c
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                    return;
                }
                lio.a(lio.this, z);
                lio.a(lio.this).a(z, z2);
            }
        };
    }

    private RecyclerView.OnChildAttachStateChangeListener a(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnChildAttachStateChangeListener) ipChange.ipc$dispatch("d76d9611", new Object[]{this, recyclerView}) : new RecyclerView.OnChildAttachStateChangeListener() { // from class: tb.lio.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("517542da", new Object[]{this, view});
                } else {
                    lio.a(lio.this, recyclerView, view, true);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a66017d", new Object[]{this, view});
                } else {
                    lio.a(lio.this, recyclerView, view, false);
                }
            }
        };
    }

    private void a(RecyclerView recyclerView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef4d2d8", new Object[]{this, recyclerView, view, new Boolean(z)});
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof lia)) {
            return;
        }
        int position = recyclerView.getLayoutManager().getPosition(view);
        BaseSectionModel<?> a2 = ((lia) adapter).a(position);
        if (z) {
            this.f30657a.a(position, view, a2);
        } else {
            this.f30657a.b(position, view, a2);
        }
    }

    private lkx.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkx.a) ipChange.ipc$dispatch("d3fa3de3", new Object[]{this}) : new lkx.a() { // from class: tb.lio.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkx.a
            public void a(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
                } else {
                    lio.a(lio.this).a(viewHolder);
                }
            }

            @Override // tb.lkx.a
            public void b(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
                } else {
                    lio.a(lio.this).b(viewHolder);
                }
            }

            @Override // tb.lkx.a
            public void c(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d875b4e3", new Object[]{this, viewHolder});
                } else {
                    lio.a(lio.this).c(viewHolder);
                }
            }

            @Override // tb.lkx.a
            public void d(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9ac07c2", new Object[]{this, viewHolder});
                } else {
                    lio.a(lio.this).d(viewHolder);
                }
            }
        };
    }
}
