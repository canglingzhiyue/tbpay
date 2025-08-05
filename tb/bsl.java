package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsl extends bsk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d = "NUTFloatViewsRecyclerViewDraggableAssembler";
    private RecyclerView.AdapterDataObserver e;

    static {
        kge.a(1308596836);
    }

    public static /* synthetic */ Object ipc$super(bsl bslVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(bsl bslVar, RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deff41ae", new Object[]{bslVar, recyclerView, adapter});
        } else {
            bslVar.a(recyclerView, adapter);
        }
    }

    private RecyclerView.Adapter b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("5dd15d30", new Object[]{this, view});
        }
        if (view instanceof RecyclerView) {
            return ((RecyclerView) view).getAdapter();
        }
        return null;
    }

    @Override // tb.bsk
    public void a(ViewGroup viewGroup, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39d30cb", new Object[]{this, viewGroup, view});
        } else if (!(view instanceof RecyclerView)) {
        } else {
            final RecyclerView.Adapter b = b(view);
            if (b == null) {
                arc.a().c("NUTFloatViewsRecyclerViewDraggableAssembler", "calculateContentViewCanDraggable", "contentView不是RecyclerView，无法获取Adapter");
                return;
            }
            a(b);
            this.e = new RecyclerView.AdapterDataObserver() { // from class: tb.bsl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1172900388) {
                        super.onChanged();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                        return;
                    }
                    super.onChanged();
                    view.post(new Runnable() { // from class: tb.bsl.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bsl.a(bsl.this, (RecyclerView) view, b);
                            }
                        }
                    });
                }
            };
            b.registerAdapterDataObserver(this.e);
            a((RecyclerView) view, b);
        }
    }

    private void a(RecyclerView.Adapter adapter) {
        RecyclerView.AdapterDataObserver adapterDataObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51b1d2b", new Object[]{this, adapter});
        } else if (adapter == null || (adapterDataObserver = this.e) == null) {
        } else {
            try {
                adapter.unregisterAdapterDataObserver(adapterDataObserver);
            } catch (Exception e) {
                arc.a().c("NUTFloatViewsRecyclerViewDraggableAssembler", "unRegisterDataObserver#error", e.getMessage());
            }
            this.e = null;
        }
    }

    private void a(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e592c259", new Object[]{this, recyclerView, adapter});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int itemCount = adapter.getItemCount();
            if (-1 == findFirstCompletelyVisibleItemPosition || -1 == findLastCompletelyVisibleItemPosition) {
                c(false);
                return;
            } else if (4 == l() && a(layoutManager, findFirstCompletelyVisibleItemPosition, findLastCompletelyVisibleItemPosition, itemCount)) {
                c(false);
                return;
            } else {
                c(true);
                return;
            }
        }
        c(true);
    }

    private boolean a(RecyclerView.LayoutManager layoutManager, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e73289f0", new Object[]{this, layoutManager, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return (i != 0 && a(layoutManager) + b(layoutManager) == i3 + (-1) && i2 == i) || Math.abs((i2 - i) + 1) >= i3 - c(layoutManager);
    }

    private int a(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7df7814a", new Object[]{this, layoutManager})).intValue() : a(layoutManager, true);
    }

    private int b(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ead4e0b", new Object[]{this, layoutManager})).intValue() : a(layoutManager, false);
    }

    private int a(RecyclerView.LayoutManager layoutManager, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40f95c50", new Object[]{this, layoutManager, new Boolean(z)})).intValue();
        }
        if (!(layoutManager instanceof VirtualLayoutManager)) {
            return 0;
        }
        for (c cVar : ((VirtualLayoutManager) layoutManager).h()) {
            if (cVar instanceof aut) {
                boolean c = ((aut) cVar).c();
                if ((z && c) || (!z && !c)) {
                    i += cVar.f();
                }
            }
        }
        return i;
    }

    private int c(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f631acc", new Object[]{this, layoutManager})).intValue() : b(layoutManager);
    }

    @Override // tb.bsk, tb.bsg, tb.bsh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        a(b(f()));
    }
}
