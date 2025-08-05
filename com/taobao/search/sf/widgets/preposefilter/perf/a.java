package com.taobao.search.sf.widgets.preposefilter.perf;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.sf.remote.c;
import com.taobao.search.sf.remote.d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes8.dex */
public final class a extends ius<RecyclerPreposeFilterBean, ViewGroup, com.taobao.search.sf.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f19575a;
    private ius<RecyclerPreposeFilterBean, ?, com.taobao.search.sf.a> b;
    private RecyclerPreposeFilterBean c;
    private boolean d;

    /* loaded from: classes8.dex */
    public static final class b implements com.taobao.search.sf.remote.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.search.sf.widgets.preposefilter.perf.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class RunnableC0802a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ius b;

            public RunnableC0802a(ius iusVar) {
                this.b = iusVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.b(a.this)) {
                    this.b.destroyAndRemoveFromParent();
                } else {
                    a aVar = a.this;
                    ius iusVar = this.b;
                    if (iusVar == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.ViewWidget<com.taobao.search.sf.widgets.preposefilter.perf.RecyclerPreposeFilterBean, *, com.taobao.search.sf.CommonModelAdapter>");
                    }
                    a.a(aVar, iusVar);
                    this.b.attachToContainer();
                    RecyclerPreposeFilterBean d = a.d(a.this);
                    if (d == null) {
                        return;
                    }
                    ius c = a.c(a.this);
                    if (c == null) {
                        q.a();
                    }
                    c.bindWithData(d);
                }
            }
        }

        public b() {
        }

        @Override // com.taobao.search.sf.remote.b
        public void a(ius<?, ? extends View, ?> widget) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee67ccb1", new Object[]{this, widget});
                return;
            }
            q.c(widget, "widget");
            a.this.getActivity().runOnUiThread(new RunnableC0802a(widget));
        }
    }

    static {
        kge.a(1067828624);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1303831088) {
            super.bindWithData(objArr[0]);
            return null;
        } else if (hashCode != -211767613) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onComponentDestroy();
            return null;
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "DRecyclerPreposeWidget";
    }

    public static final /* synthetic */ FrameLayout a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("95cefdc6", new Object[]{aVar});
        }
        FrameLayout frameLayout = aVar.f19575a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    public static final /* synthetic */ void a(a aVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8349087c", new Object[]{aVar, iusVar});
        } else {
            aVar.b = iusVar;
        }
    }

    public static final /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cd5f616", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public static final /* synthetic */ ius c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("8f97cc8e", new Object[]{aVar}) : aVar.b;
    }

    public static final /* synthetic */ RecyclerPreposeFilterBean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerPreposeFilterBean) ipChange.ipc$dispatch("c02d317f", new Object[]{aVar}) : aVar.c;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((RecyclerPreposeFilterBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup] */
    @Override // tb.ius
    public /* synthetic */ ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity, ium parent, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, aVar, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        this.f19575a = new FrameLayout(getActivity());
        FrameLayout frameLayout = this.f19575a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, j.a(40.0f)));
        c cVar = c.INSTANCE;
        Activity mActivity = this.mActivity;
        q.a((Object) mActivity, "mActivity");
        a aVar = this;
        com.taobao.search.sf.a model = getModel();
        FrameLayout frameLayout2 = this.f19575a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        cVar.a("recycler_preposefilter", new d(mActivity, aVar, model, frameLayout2, new C0800a()), new b());
        FrameLayout frameLayout3 = this.f19575a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        return frameLayout3;
    }

    /* renamed from: com.taobao.search.sf.widgets.preposefilter.perf.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0800a implements iur {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.search.sf.widgets.preposefilter.perf.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class C0801a extends i {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ View b;

            public C0801a(View view) {
                this.b = view;
            }

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                a.a(a.this).getLayoutParams().height = -2;
                a.a(a.this).addView(this.b);
            }
        }

        @Override // tb.iur
        public void b(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, componentView});
            } else {
                q.c(componentView, "componentView");
            }
        }

        public C0800a() {
        }

        @Override // tb.iur
        public void a(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                return;
            }
            q.c(componentView, "componentView");
            a.this.getActivity().runOnUiThread(new C0801a(componentView));
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        this.d = true;
    }

    public void a(RecyclerPreposeFilterBean recyclerPreposeFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2b7097", new Object[]{this, recyclerPreposeFilterBean});
            return;
        }
        super.bindWithData(recyclerPreposeFilterBean);
        this.c = recyclerPreposeFilterBean;
        ius<RecyclerPreposeFilterBean, ?, com.taobao.search.sf.a> iusVar = this.b;
        if (iusVar == null) {
            return;
        }
        iusVar.bindWithData(recyclerPreposeFilterBean);
    }
}
