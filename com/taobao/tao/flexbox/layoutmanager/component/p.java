package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;

/* loaded from: classes8.dex */
public class p extends Component<TNodeView, a> implements TNodeView.b, TNodeView.f, com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PreloadDelegate b;
    private TNodeView c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f20172a = false;
    private Map d = new HashMap();
    private com.taobao.tao.flexbox.layoutmanager.core.c e = new c.a<TNodeView, a>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.p.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, a aVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6607e73", new Object[]{this, aaVar, aVar, str, obj});
            } else if (!TextUtils.equals(str, "error-page")) {
            } else {
                aVar.c = oec.a(obj, "");
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, TNodeView tNodeView, a aVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c62332d8", new Object[]{this, fVar, tNodeView, aVar, dVar});
            } else if (tNodeView == null || aVar == null) {
            } else {
                tNodeView.setErrorPage(aVar.c);
            }
        }
    };

    static {
        kge.a(-162051072);
        kge.a(-1420926486);
        kge.a(881820523);
        kge.a(901460740);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1277574414:
                super.onInitAttrs((com.taobao.tao.flexbox.layoutmanager.core.f) objArr[0], (View) objArr[1], (ogl) objArr[2], (aa.d) objArr[3]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
    public void onLayoutError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834776a6", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.p$a, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : b();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.flexbox.layoutmanager.core.TNodeView, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ TNodeView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.f fVar, TNodeView tNodeView, a aVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c263d0e", new Object[]{this, fVar, tNodeView, aVar, dVar});
        } else {
            a(fVar, tNodeView, aVar, dVar);
        }
    }

    public static /* synthetic */ View a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e05c6204", new Object[]{pVar}) : pVar.view;
    }

    public static /* synthetic */ View b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a7684905", new Object[]{pVar}) : pVar.view;
    }

    public TNodeView a(Context context) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("66ddf8bd", new Object[]{this, context});
        }
        this.c = TNodeView.create(context, this.node.k(), ((a) this.viewParams).f20175a, ((a) this.viewParams).b, this);
        if (oeb.u() && this.measureResult.f20361a > 0 && this.measureResult.b > 0) {
            this.c.prelayout(this.measureResult.f20361a, this.measureResult.b);
        }
        Map i = this.node.i();
        if (i != null && (map = this.d) != null) {
            map.putAll(i);
        }
        this.c.setPendingArgs(this.d);
        this.c.setViewLayoutCallback(this);
        return this.c;
    }

    public com.taobao.tao.flexbox.layoutmanager.core.aa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("fcfaae56", new Object[]{this});
        }
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            return tNodeView.getRootNode();
        }
        PreloadDelegate preloadDelegate = this.b;
        if (preloadDelegate == null) {
            return null;
        }
        return preloadDelegate.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "error-page")) {
            return this.e;
        }
        return super.getAttributeHandler(str);
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, TNodeView tNodeView, a aVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62332d8", new Object[]{this, fVar, tNodeView, aVar, dVar});
            return;
        }
        super.onInitAttrs(fVar, tNodeView, aVar, dVar);
        this.e.a(fVar, (com.taobao.tao.flexbox.layoutmanager.core.f) tNodeView, (TNodeView) aVar, dVar);
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e79e3dca", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
    public void onLayoutCompleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
            return;
        }
        aaVar.a(this);
        aaVar.a(7, new aa.f() { // from class: com.taobao.tao.flexbox.layoutmanager.component.p.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.f
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : oec.c(p.a(p.this)) && oec.d(p.b(p.this));
            }
        });
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        d();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        ogg.a("Node onLayoutChanged, node:" + this.node + " oldW: " + i + " oldH:" + i2 + " newW:" + i3 + " newH:" + i4);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!(this.node.N() instanceof Application) || !oeb.o() || this.b != null) {
        } else {
            this.b = new PreloadDelegate(this.node.N(), this.node.k(), ((a) this.viewParams).f20175a, null, ((a) this.viewParams).b, false, 1, null);
            this.b.a(this.measureResult.f20361a, this.measureResult.b);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r5.equals("onpagemsg") != false) goto L11;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa.e r10) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.p.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa$e):boolean");
    }

    public com.taobao.tao.flexbox.layoutmanager.core.aa a(Class cls, aa.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("86a4ad88", new Object[]{this, cls, cVar, new Boolean(z)});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.a(cls, cVar, z);
    }

    public void a(aa.c cVar, List<com.taobao.tao.flexbox.layoutmanager.core.aa> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd492f21", new Object[]{this, cVar, list, new Integer(i)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a();
        if (a2 == null) {
            return;
        }
        a2.a(cVar, list, i);
    }

    public void a(Object obj, int i, List<com.taobao.tao.flexbox.layoutmanager.core.aa> list, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a48e6b0", new Object[]{this, obj, new Integer(i), list, new Boolean(z), new Boolean(z2)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = a();
        if (a2 == null) {
            return;
        }
        a2.a(obj, i, list, z, z2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            tNodeView.setViewLayoutCallback(null);
        }
        if (a() != null) {
            if (((a) this.viewParams).h) {
                sendMessage(Component.MSG_FLAG_DISAPPEAR, a(), "onwilldisappear", null, null, null);
            } else {
                sendMessage(130, a(), "onpagedisappear", null, null, null);
            }
        }
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.f
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (a() == null || this.f20172a) {
        } else {
            this.f20172a = true;
            if (((a) this.viewParams).h) {
                sendMessage(130, a(), "onwillappear", null, this.d, null);
            } else {
                sendMessage(130, a(), "onpageappear", null, this.d, null);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20175a;
        public HashMap b;
        public String c;
        @Deprecated
        public String d;
        @Deprecated
        public String e;
        @Deprecated
        public String f;
        public Map g;
        public boolean h;

        static {
            kge.a(-479085204);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            HashMap a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            this.f20175a = oec.b(hashMap.get("src"));
            this.b = new HashMap();
            String str = this.f20175a;
            if (str != null && (a2 = oec.a(Uri.parse(str))) != null) {
                this.b.putAll(a2);
            }
            Map a3 = oec.a(hashMap.get("query"), (Map) null);
            if (a3 == null || a3.isEmpty()) {
                a3 = oec.a(hashMap.get("data"), (Map) null);
            }
            if (a3 != null) {
                this.b.putAll(a3);
            }
            this.g = oec.a(hashMap.get("options"), (Map) null);
            this.h = oec.a(hashMap.get("disabled-page-tracker"), false);
            this.d = oec.b(hashMap.get("type"));
            this.e = oec.b(hashMap.get("local-src"));
            this.f = oec.b(hashMap.get("init-data-key"));
            this.c = oec.a(hashMap.get("error-page"), "");
        }
    }
}
