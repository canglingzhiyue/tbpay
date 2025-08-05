package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.DragParentFrameLayout;
import com.taobao.ptr.PtrBase;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class eds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f27216a;
    private static final Object c;

    public static /* synthetic */ a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4b74c48e", new Object[]{aVar});
        }
        f27216a = aVar;
        return aVar;
    }

    public static /* synthetic */ Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[0]) : c;
    }

    public static /* synthetic */ a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3e7d3ea", new Object[0]) : f27216a;
    }

    static {
        kge.a(202498144);
        c = new Object();
    }

    public static void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (!DataBizContext.ShareContext.enablePrefetchView()) {
        } else {
            bes.a(new Runnable() { // from class: tb.eds.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        synchronized (eds.c()) {
                            View inflate = LayoutInflater.from(activity).inflate(R.layout.icart_fragment_cart_v2, (ViewGroup) null, false);
                            eds.a(new a());
                            a.a(eds.d(), inflate);
                            a.a(eds.d(), (DragFloatLayer) inflate.findViewById(R.id.drag_layer));
                            a.a(eds.d(), (LinearLayout) inflate.findViewById(R.id.status_container));
                            a.b(eds.d(), (LinearLayout) inflate.findViewById(R.id.cart_top_layout));
                            a.c(eds.d(), (LinearLayout) inflate.findViewById(R.id.cart_bottom_layout));
                            a.a(eds.d(), (CartRecyclerView) inflate.findViewById(R.id.cart_recycler_view));
                            a.b(eds.d(), inflate.findViewById(R.id.ptr_loading));
                            a.a(eds.d(), (DragParentFrameLayout) inflate.findViewById(R.id.drag_parent_layout));
                            a.a(eds.d(), (PtrBase) inflate.findViewById(R.id.cart_refresh));
                            a.a(eds.d(), (ViewGroup) inflate.findViewById(R.id.cart_bottom_float_layout));
                        }
                    } catch (Throwable th) {
                        abj.a("CartViewPreLoader", th);
                    }
                }
            });
        }
    }

    public static a b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1456525a", new Object[]{activity});
        }
        synchronized (c) {
            a aVar = f27216a;
            if (aVar == null || aVar.a() == null || aVar.a().getContext() != activity) {
                return null;
            }
            f27216a = null;
            return aVar;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f27216a = null;
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f27218a;
        private DragFloatLayer<String> b;
        private LinearLayout c;
        private LinearLayout d;
        private LinearLayout e;
        private View f;
        private CartRecyclerView g;
        private DragParentFrameLayout h;
        private PtrBase i;
        private ViewGroup j;

        static {
            kge.a(-695688935);
        }

        public static /* synthetic */ View a(a aVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("cd9d272d", new Object[]{aVar, view});
            }
            aVar.f27218a = view;
            return view;
        }

        public static /* synthetic */ ViewGroup a(a aVar, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("dc76124f", new Object[]{aVar, viewGroup});
            }
            aVar.j = viewGroup;
            return viewGroup;
        }

        public static /* synthetic */ LinearLayout a(a aVar, LinearLayout linearLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("e99b09d7", new Object[]{aVar, linearLayout});
            }
            aVar.c = linearLayout;
            return linearLayout;
        }

        public static /* synthetic */ CartRecyclerView a(a aVar, CartRecyclerView cartRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CartRecyclerView) ipChange.ipc$dispatch("2c7a388f", new Object[]{aVar, cartRecyclerView});
            }
            aVar.g = cartRecyclerView;
            return cartRecyclerView;
        }

        public static /* synthetic */ DragFloatLayer a(a aVar, DragFloatLayer dragFloatLayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DragFloatLayer) ipChange.ipc$dispatch("cbb02e2f", new Object[]{aVar, dragFloatLayer});
            }
            aVar.b = dragFloatLayer;
            return dragFloatLayer;
        }

        public static /* synthetic */ DragParentFrameLayout a(a aVar, DragParentFrameLayout dragParentFrameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DragParentFrameLayout) ipChange.ipc$dispatch("3988bd1d", new Object[]{aVar, dragParentFrameLayout});
            }
            aVar.h = dragParentFrameLayout;
            return dragParentFrameLayout;
        }

        public static /* synthetic */ PtrBase a(a aVar, PtrBase ptrBase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PtrBase) ipChange.ipc$dispatch("e407b9ef", new Object[]{aVar, ptrBase});
            }
            aVar.i = ptrBase;
            return ptrBase;
        }

        public static /* synthetic */ View b(a aVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("fb75c18c", new Object[]{aVar, view});
            }
            aVar.f = view;
            return view;
        }

        public static /* synthetic */ LinearLayout b(a aVar, LinearLayout linearLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("6be5beb6", new Object[]{aVar, linearLayout});
            }
            aVar.d = linearLayout;
            return linearLayout;
        }

        public static /* synthetic */ LinearLayout c(a aVar, LinearLayout linearLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("ee307395", new Object[]{aVar, linearLayout});
            }
            aVar.e = linearLayout;
            return linearLayout;
        }

        public View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f27218a;
        }

        public DragFloatLayer<String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DragFloatLayer) ipChange.ipc$dispatch("d5be6111", new Object[]{this}) : this.b;
        }

        public LinearLayout c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("61b2a9c1", new Object[]{this}) : this.c;
        }

        public LinearLayout d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("df8a65c2", new Object[]{this}) : this.d;
        }

        public LinearLayout e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("5d6221c3", new Object[]{this}) : this.e;
        }

        public View f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : this.f;
        }

        public CartRecyclerView g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CartRecyclerView) ipChange.ipc$dispatch("93eee5c1", new Object[]{this}) : this.g;
        }

        public DragParentFrameLayout h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DragParentFrameLayout) ipChange.ipc$dispatch("f1f83d09", new Object[]{this}) : this.h;
        }

        public PtrBase i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PtrBase) ipChange.ipc$dispatch("127235ea", new Object[]{this}) : this.i;
        }

        public ViewGroup j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("3ca7b04", new Object[]{this}) : this.j;
        }
    }
}
