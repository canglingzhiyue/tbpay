package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ofw;
import tb.ofy;
import tb.ogl;
import tb.ogu;
import tb.ohb;

/* loaded from: classes8.dex */
public class z extends e implements com.taobao.tao.flexbox.layoutmanager.core.s, ScrollChangeListener, FlatViewGroup.d, FlatViewGroup.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_POST_TO_CHILD = "post-to-child";
    public static final String KEY_TRACK_TARGET = "trackTarget";

    /* renamed from: a  reason: collision with root package name */
    private ac f20220a;
    private long e;
    private boolean d = false;
    private int f = 0;
    private int g = 0;
    private boolean b = false;
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.component.z.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                if (z.a(z.this) == null) {
                    return;
                }
                z.b(z.this);
                z zVar = z.this;
                zVar.sendMessage(zVar.getNode(), "onidle", null, null, null);
            } else if (i == 1) {
                z.a(z.this, true);
            } else if (i != 2) {
            } else {
                z.a(z.this, false);
            }
        }
    };

    static {
        kge.a(-1017527392);
        kge.a(-1420926486);
        kge.a(771458270);
        kge.a(-894641085);
        kge.a(1891838068);
    }

    public static /* synthetic */ Object ipc$super(z zVar, String str, Object... objArr) {
        if (str.hashCode() == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onNestScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ ogl mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ View a(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2195ac3a", new Object[]{zVar}) : zVar.view;
    }

    public static /* synthetic */ void a(z zVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c64fdc", new Object[]{zVar, new Boolean(z)});
        } else {
            zVar.c(z);
        }
    }

    public static /* synthetic */ int b(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e562f72c", new Object[]{zVar})).intValue();
        }
        int i = zVar.g;
        zVar.g = i + 1;
        return i;
    }

    public static /* synthetic */ void c(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb74c7a", new Object[]{zVar});
        } else {
            zVar.j();
        }
    }

    public static /* synthetic */ Handler d(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fdf2052b", new Object[]{zVar}) : zVar.h;
    }

    public FlatViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("c3f73431", new Object[]{this, context});
        }
        final FlatViewGroup e = ogu.e(context);
        e.bindComponent(this);
        if (oeb.a("enableFixTrackExpose", true)) {
            ohb.a(e, new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.z.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.getVisibility() != 0) {
                    } else {
                        z.a(z.this, true);
                    }
                }
            });
        }
        this.f20220a = new ac(this.node, a.a((a) this.viewParams), a.b((a) this.viewParams), this, null);
        e.addVisibilityChangedCallback(this);
        e.addSizeChangedCallback(this);
        return e;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e66c76a1", new Object[]{this}) : new a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(a.c((a) this.viewParams))) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().d(this.node, a.c((a) this.viewParams));
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(this.node, a.c((a) this.viewParams));
        }
        if (a.d((a) this.viewParams) == null) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(this.node, a.d((a) this.viewParams));
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.isEmpty(a.c((a) this.viewParams))) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(this.node);
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(a.c((a) this.viewParams));
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : a.c((a) this.viewParams);
    }

    private boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ac acVar = this.f20220a;
        if (acVar == null) {
            return false;
        }
        return acVar.a(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.view instanceof FlatViewGroup) {
            ((FlatViewGroup) this.view).removeVisibilityChangedCallback(this);
            ((FlatViewGroup) this.view).removeSizeChangedCallback(this);
        }
        ac acVar = this.f20220a;
        if (acVar != null) {
            acVar.b();
        }
        super.detach(z);
        c(false);
        this.d = false;
        this.e = 0L;
        this.f = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        Map map = eVar.d;
        switch (str.hashCode()) {
            case -1055330882:
                if (str.equals("onpagescrollstatechanged")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -654012496:
                if (str.equals("onpagerefreshstatechanged")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -552345454:
                if (str.equals("onwilldisappear")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 209131304:
                if (str.equals("scroll_state_idle_internal")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2122668806:
                if (str.equals("onwillappear")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            String a2 = oec.a(eVar.d.get("type"), "add");
            if (StringUtils.equals("page", a2) || StringUtils.equals("tab", a2)) {
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = eVar.f20300a;
                if (aaVar.J() != null && (aaVar.J().I() instanceof ofw)) {
                    final ofw ofwVar = (ofw) aaVar.J().I();
                    if (ofwVar.c() == 0) {
                        j();
                    } else {
                        ofy.a aVar = new ofy.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.z.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.ofy.a
                            public void a(int i) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                                } else if (i != 0) {
                                } else {
                                    z.c(z.this);
                                    z.d(z.this).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.z.3.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                ofwVar.b().b(r3[0]);
                                            }
                                        }
                                    });
                                }
                            }
                        };
                        final ofy.a[] aVarArr = {aVar};
                        ofwVar.b().a(aVar);
                    }
                } else {
                    j();
                }
            } else {
                j();
            }
        } else if (c == 1) {
            k();
        } else if (c != 2) {
            if (c != 3) {
                if (c == 4) {
                    j();
                }
            } else if (map != null && map.get("state") == TBRefreshHeader.RefreshState.NONE) {
                j();
            }
        } else if (map != null && oec.a(map.get("state"), -1) == 0) {
            j();
        }
        return false;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z2 = this.d;
        this.d = b(z2) && z;
        if (z2 == this.d) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.d) {
            this.e = System.currentTimeMillis();
            if (this.f < a.e((a) this.viewParams)) {
                this.f++;
                if (this.node.e("onviewappear") != null || a.f((a) this.viewParams)) {
                    hashMap.put("time", Long.valueOf(this.e));
                    hashMap.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(this.f));
                    hashMap.put("index", this.node.e("index"));
                    sendMessage(a.f((a) this.viewParams) ? 34 : 0, getNode(), "onviewappear", null, hashMap, null);
                }
            }
            h();
            if (a.g((a) this.viewParams)) {
                this.view.setBackgroundColor(-65536);
            }
            if (this.b) {
                return;
            }
            b();
            return;
        }
        i();
        if (this.f <= a.e((a) this.viewParams)) {
            long currentTimeMillis = System.currentTimeMillis();
            hashMap.put("time", Long.valueOf(currentTimeMillis));
            hashMap.put("duration", Long.valueOf(currentTimeMillis - this.e));
            hashMap.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(this.f));
            hashMap.put("index", this.node.e("index"));
            sendMessage(a.f((a) this.viewParams) ? 34 : 0, getNode(), "onviewdisappear", null, hashMap, null);
        }
        if (!this.b) {
            c();
        }
        if (!a.g((a) this.viewParams)) {
            return;
        }
        this.view.setBackgroundColor(-16776961);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (a.h((a) this.viewParams)) {
            ac acVar = this.f20220a;
            if ((acVar != null ? acVar.c() : 0) != 0) {
                z = false;
            }
        }
        if (!this.d || this.g >= a.i((a) this.viewParams) || a.j((a) this.viewParams) == null || this.h.hasMessages(0) || !z) {
            return;
        }
        this.h.sendEmptyMessageDelayed(0, a.k((a) this.viewParams));
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.h.removeMessages(0);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.h.removeMessages(2);
        this.h.removeMessages(1);
        this.h.sendEmptyMessage(1);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.h.removeMessages(2);
        this.h.removeMessages(1);
        if ((this.node.k().g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f) || !StringUtils.isEmpty(a.c((a) this.viewParams))) {
            c(false);
        } else {
            this.h.sendEmptyMessage(2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            j();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScrollStateChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!a.h((a) this.viewParams)) {
        } else {
            if (i == 0) {
                h();
            } else {
                i();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.e
    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (view != this.view) {
        } else {
            if (i == 0) {
                j();
            } else {
                k();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.d
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        boolean z2 = i3 <= 0 || i4 <= 0;
        if (i > 0 && i2 > 0) {
            z = false;
        }
        if (z2 == z) {
            return;
        }
        if (z) {
            k();
        } else {
            j();
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean d;
        private String h;
        private boolean i;
        private String j;
        private String k;
        private Map l;
        private boolean m;

        /* renamed from: a  reason: collision with root package name */
        private int f20225a = Integer.MAX_VALUE;
        private float b = 0.0f;
        private float c = 0.0f;
        private int e = 0;
        private int f = 5000;
        private int g = 1;

        static {
            kge.a(638249146);
        }

        public static /* synthetic */ float a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1c2fc0b", new Object[]{aVar})).floatValue() : aVar.b;
        }

        public static /* synthetic */ float b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1757050c", new Object[]{aVar})).floatValue() : aVar.c;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e934423", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ Map d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4c335cd3", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88132012", new Object[]{aVar})).intValue() : aVar.f20225a;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ada72924", new Object[]{aVar})).booleanValue() : aVar.m;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d33b3225", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8cf3b26", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public static /* synthetic */ int i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e634416", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("17aa13fc", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ int k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("698b5618", new Object[]{aVar})).intValue() : aVar.f;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
            if (r9.equals("debug") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.z.a.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
