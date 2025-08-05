package com.taobao.search.sf.widgets.preposefilter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes8.dex */
public final class d extends ius<PreposeFilterBean, ViewGroup, com.taobao.search.sf.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f19569a;
    private ius<PreposeFilterBean, ?, com.taobao.search.sf.a> b;
    private PreposeFilterBean c;
    private boolean d;

    /* loaded from: classes8.dex */
    public static final class b implements com.taobao.search.sf.remote.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes8.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ius b;

            public a(ius iusVar) {
                this.b = iusVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (d.b(d.this)) {
                    this.b.destroyAndRemoveFromParent();
                } else {
                    d dVar = d.this;
                    ius iusVar = this.b;
                    if (iusVar == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.ViewWidget<com.taobao.search.sf.widgets.preposefilter.PreposeFilterBean, *, com.taobao.search.sf.CommonModelAdapter>");
                    }
                    d.a(dVar, iusVar);
                    this.b.attachToContainer();
                    PreposeFilterBean d = d.d(d.this);
                    if (d == null) {
                        return;
                    }
                    ius c = d.c(d.this);
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
            d.this.getActivity().runOnUiThread(new a(widget));
        }
    }

    static {
        kge.a(78076992);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "DelegatePreposeFilter";
    }

    public static final /* synthetic */ FrameLayout a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2cf11afb", new Object[]{dVar});
        }
        FrameLayout frameLayout = dVar.f19569a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    public static final /* synthetic */ void a(d dVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cf3567", new Object[]{dVar, iusVar});
        } else {
            dVar.b = iusVar;
        }
    }

    public static final /* synthetic */ boolean b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("361608e3", new Object[]{dVar})).booleanValue() : dVar.d;
    }

    public static final /* synthetic */ ius c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("8c2dfbff", new Object[]{dVar}) : dVar.b;
    }

    public static final /* synthetic */ PreposeFilterBean d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreposeFilterBean) ipChange.ipc$dispatch("39f874b3", new Object[]{dVar}) : dVar.c;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((PreposeFilterBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup] */
    @Override // tb.ius
    public /* synthetic */ ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, ium parent, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, aVar, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        this.f19569a = new FrameLayout(getActivity());
        FrameLayout frameLayout = this.f19569a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, j.a(40.0f)));
        com.taobao.search.sf.remote.c cVar = com.taobao.search.sf.remote.c.INSTANCE;
        Activity mActivity = this.mActivity;
        q.a((Object) mActivity, "mActivity");
        d dVar = this;
        com.taobao.search.sf.a model = getModel();
        FrameLayout frameLayout2 = this.f19569a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        cVar.a("preposefilter", new com.taobao.search.sf.remote.d(mActivity, dVar, model, frameLayout2, new a()), new b());
        FrameLayout frameLayout3 = this.f19569a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        return frameLayout3;
    }

    /* loaded from: classes8.dex */
    public static final class a implements iur {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.search.sf.widgets.preposefilter.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class C0799a extends com.taobao.android.searchbaseframe.util.i {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ View b;

            public C0799a(View view) {
                this.b = view;
            }

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                d.a(d.this).getLayoutParams().height = -2;
                d.a(d.this).addView(this.b);
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

        public a() {
        }

        @Override // tb.iur
        public void a(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                return;
            }
            q.c(componentView, "componentView");
            d.this.getActivity().runOnUiThread(new C0799a(componentView));
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

    public void a(PreposeFilterBean preposeFilterBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9beccc86", new Object[]{this, preposeFilterBean});
            return;
        }
        super.bindWithData(preposeFilterBean);
        this.c = preposeFilterBean;
        ius<PreposeFilterBean, ?, com.taobao.search.sf.a> iusVar = this.b;
        if (iusVar == null) {
            return;
        }
        iusVar.bindWithData(preposeFilterBean);
    }
}
