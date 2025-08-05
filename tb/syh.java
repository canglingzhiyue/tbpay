package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.v;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class syh extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private v b;
    private Context c;
    private FrameLayout d;
    private FrameLayout f;
    private LinearLayout g;
    private LinearLayout h;
    private soy i;
    private spl j;
    private boolean k;
    private boolean l;
    private ojv m;
    private boolean n;
    private TTDetailScrollerLayout.LayoutParams o;
    private Runnable p;

    /* loaded from: classes5.dex */
    public interface a {
        public static final int DEFAULT = -1;
        public static final int LOADFAILED = 0;
        public static final int RENDERFAILED = 1;

        boolean a(int i);
    }

    static {
        kge.a(-917949684);
    }

    public static /* synthetic */ Object ipc$super(syh syhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ff385dce", new Object[]{syhVar}) : syhVar.c;
    }

    public static /* synthetic */ v a(syh syhVar, v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("dc16c96c", new Object[]{syhVar, vVar});
        }
        syhVar.b = vVar;
        return vVar;
    }

    public static /* synthetic */ TTDetailScrollerLayout.LayoutParams a(syh syhVar, spl splVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("2f3dbb02", new Object[]{syhVar, splVar}) : syhVar.b(splVar);
    }

    public static /* synthetic */ boolean a(syh syhVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5c8ecf1", new Object[]{syhVar, new Integer(i)})).booleanValue() : syhVar.c(i);
    }

    public static /* synthetic */ boolean a(syh syhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5c92cc2", new Object[]{syhVar, new Boolean(z)})).booleanValue();
        }
        syhVar.k = z;
        return z;
    }

    public static /* synthetic */ FrameLayout b(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("23628322", new Object[]{syhVar}) : syhVar.d;
    }

    public static /* synthetic */ LinearLayout c(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("afc0eb2f", new Object[]{syhVar}) : syhVar.g;
    }

    public static /* synthetic */ LinearLayout d(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("3c611630", new Object[]{syhVar}) : syhVar.h;
    }

    public static /* synthetic */ v e(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("2b05e253", new Object[]{syhVar}) : syhVar.b;
    }

    public static /* synthetic */ boolean f(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a83ac15f", new Object[]{syhVar})).booleanValue() : syhVar.k;
    }

    public static /* synthetic */ ojv g(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ojv) ipChange.ipc$dispatch("ad93508f", new Object[]{syhVar}) : syhVar.m;
    }

    public static /* synthetic */ FrameLayout h(syh syhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2e16285c", new Object[]{syhVar}) : syhVar.f;
    }

    public syh(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.l = false;
        this.n = false;
        this.p = new Runnable() { // from class: tb.syh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (y.a(syh.a(syh.this))) {
                } else {
                    c.a(syh.a(syh.this), new DescNativeController.a("adjust"));
                }
            }
        };
        this.c = context;
        d dVar = null;
        this.d = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_component_container, (ViewGroup) null);
        this.f = (FrameLayout) this.d.findViewById(R.id.desc_frame);
        a(eyyVar);
        qms d = ((pir) this.mDetailContext.a().a(pkw.PARSER_ID)).h().d();
        this.i = (soy) (d != null ? d.a(this.mDetailContext.d()) : dVar);
    }

    public void b(int i) {
        TTDetailScrollerLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        v vVar = this.b;
        if (vVar instanceof DescNativeController) {
            ((DescNativeController) vVar).b(i);
            if (!j.I() || !this.n || (layoutParams = this.o) == null) {
                return;
            }
            this.n = false;
            this.d.setLayoutParams(layoutParams);
            this.d.post(this.p);
        } else if (!(vVar instanceof com.taobao.android.detail.ttdetail.skeleton.desc.web.a)) {
        } else {
            ((com.taobao.android.detail.ttdetail.skeleton.desc.web.a) vVar).b(i);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        v vVar = this.b;
        if (vVar != null) {
            return vVar.b();
        }
        return null;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        v vVar = this.b;
        if (vVar == null) {
            return;
        }
        vVar.a(i);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.d;
    }

    private void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
        } else if (eyyVar == null) {
            i.a("TTDetailDescComponent", "componentData is null");
        } else {
            final spl a2 = spl.a(eyyVar);
            if (a2 == null) {
                i.a("TTDetailDescComponent", "detailDescModel is null");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean a3 = a(a2);
            this.j = a2;
            this.h = (LinearLayout) this.d.findViewById(R.id.desc_container_linear);
            this.g = (LinearLayout) this.d.findViewById(R.id.desc_container_expand);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.syh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TTDetailScrollerLayout.LayoutParams layoutParams = new TTDetailScrollerLayout.LayoutParams(-1, -1);
                    syh syhVar = syh.this;
                    layoutParams.f11048a = syhVar;
                    syh.b(syhVar).setLayoutParams(layoutParams);
                    syh.c(syh.this).setVisibility(8);
                    syh.d(syh.this).setVisibility(8);
                    syh syhVar2 = syh.this;
                    syhVar2.e = false;
                    c.a(syh.a(syhVar2), new DescNativeController.a(AbsListWidgetInstance.KEY_SECTION_EXPAND));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) "DESC_Fold");
                    c.a(syh.a(syh.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                    if (!(syh.e(syh.this) instanceof DescNativeController)) {
                        return;
                    }
                    syh.c(syh.this).post(new Runnable() { // from class: tb.syh.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ((DescNativeController) syh.e(syh.this)).b(0);
                            }
                        }
                    });
                }
            });
            this.k = a2.g;
            if (a3) {
                this.g.setVisibility(8);
                this.h.setVisibility(8);
            } else {
                this.g.setVisibility(this.k ? 8 : 0);
                LinearLayout linearLayout = this.h;
                if (this.k) {
                    i = 8;
                }
                linearLayout.setVisibility(i);
            }
            final com.taobao.android.detail.ttdetail.skeleton.desc.natives.i iVar = new com.taobao.android.detail.ttdetail.skeleton.desc.natives.i() { // from class: tb.syh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    int i2 = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    syh.c(syh.this).setVisibility(!syh.f(syh.this) ? 8 : 0);
                    LinearLayout d = syh.d(syh.this);
                    if (!syh.f(syh.this)) {
                        i2 = 8;
                    }
                    d.setVisibility(i2);
                }

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.i
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    syh.c(syh.this).setVisibility(8);
                    syh.d(syh.this).setVisibility(8);
                }

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.i
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    int i2 = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                        return;
                    }
                    syh.c(syh.this).setVisibility(!syh.f(syh.this) ? 8 : 0);
                    LinearLayout d = syh.d(syh.this);
                    if (!syh.f(syh.this)) {
                        i2 = 8;
                    }
                    d.setVisibility(i2);
                }

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.i
                public boolean a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i2)})).booleanValue() : syh.a(syh.this, i2);
                }
            };
            if (a(a2)) {
                DescNativeController descNativeController = new DescNativeController(this.c, a2);
                descNativeController.a(iVar);
                descNativeController.a(this.mDetailContext);
                descNativeController.a(new ojv() { // from class: tb.syh.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ojv
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (syh.g(syh.this) == null) {
                        } else {
                            syh.g(syh.this).a();
                        }
                    }
                });
                this.b = descNativeController;
                descNativeController.a(new a() { // from class: tb.syh.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.syh.a
                    public boolean a(int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i2)})).booleanValue();
                        }
                        syh.a(syh.this, j.B());
                        syh.b(syh.this).setLayoutParams(syh.a(syh.this, a2));
                        com.taobao.android.detail.ttdetail.skeleton.desc.web.a aVar = new com.taobao.android.detail.ttdetail.skeleton.desc.web.a(syh.a(syh.this), a2);
                        aVar.a(iVar);
                        syh.a(syh.this, aVar);
                        syh.e(syh.this).a();
                        syh.h(syh.this).removeAllViews();
                        syh.h(syh.this).addView(syh.e(syh.this).getComponentView(null));
                        int i3 = 8;
                        syh.c(syh.this).setVisibility(syh.f(syh.this) ? 0 : 8);
                        LinearLayout d = syh.d(syh.this);
                        if (syh.f(syh.this)) {
                            i3 = 0;
                        }
                        d.setVisibility(i3);
                        return true;
                    }
                });
            } else {
                com.taobao.android.detail.ttdetail.skeleton.desc.web.a aVar = new com.taobao.android.detail.ttdetail.skeleton.desc.web.a(this.c, a2);
                this.b = aVar;
                aVar.a(iVar);
                aVar.a(this.mDetailContext);
                aVar.a(new ojv() { // from class: tb.syh.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ojv
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (syh.g(syh.this) == null) {
                        } else {
                            syh.g(syh.this).a();
                        }
                    }
                });
            }
            this.f.removeAllViews();
            this.f.addView(this.b.getComponentView(null));
            long currentTimeMillis2 = System.currentTimeMillis();
            i.a("TTDetailPerTag", "TTDetailDescComponent.initData( web: " + (true ^ a3) + "): " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public void a(ojv ojvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80b3afd", new Object[]{this, ojvVar});
        } else {
            this.m = ojvVar;
        }
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TTDetailScrollerLayout.LayoutParams b = b(this.j);
        if ((b.height != -1 || i > c()) && i > b.height) {
            return false;
        }
        b.height = i;
        this.o = b;
        this.e = false;
        this.n = true;
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        return true;
    }

    private TTDetailScrollerLayout.LayoutParams b(spl splVar) {
        int i;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("1ba56fcf", new Object[]{this, splVar});
        }
        if (splVar == null || !this.k) {
            TTDetailScrollerLayout.LayoutParams layoutParams = new TTDetailScrollerLayout.LayoutParams(-1, -1);
            layoutParams.f11048a = this;
            this.e = false;
            return layoutParams;
        }
        float f = splVar.k;
        if (Float.compare(f, 0.0f) <= 0 || (b = f.b(this.c)) <= 0) {
            i = -1;
        } else {
            i = (int) (b * f);
            i.a("TTDetailDescComponent", "parentContainerHeight:" + b + "height:" + i);
        }
        TTDetailScrollerLayout.LayoutParams layoutParams2 = new TTDetailScrollerLayout.LayoutParams(-1, i);
        layoutParams2.f11048a = this;
        this.e = splVar.g;
        return layoutParams2;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null && frameLayout.getParent() != null) {
            return ((View) this.d.getParent()).getMeasuredHeight();
        }
        return 0;
    }

    private boolean a(spl splVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff2e9ecd", new Object[]{this, splVar})).booleanValue() : splVar.d != null && splVar.d.size() > 0;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        v vVar = this.b;
        if (vVar == null) {
            return;
        }
        vVar.a();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public TTDetailScrollerLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("c38f45ed", new Object[]{this}) : b(this.j);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        v vVar = this.b;
        if (vVar == null) {
            return;
        }
        vVar.a(z, z2);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        v vVar = this.b;
        if (vVar != null) {
            vVar.didAppear();
        }
        if (this.l || !this.k) {
            return;
        }
        this.l = true;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("page", (Object) "Page_Detail");
            jSONObject2.put("eventId", (Object) 2201);
            jSONObject2.put("arg1", (Object) "Page_Detail_Show_DESC_Fold");
            jSONObject2.put("args", (Object) jSONObject);
            c.a(this.c, new h("userTrack", jSONObject2, new RuntimeAbilityParam[0]));
        } catch (Exception e) {
            i.a("TTDetailDescComponent", "Page_Detail_Show_Navigation error", e);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        v vVar = this.b;
        if (vVar != null) {
            vVar.destroy();
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeCallbacks(this.p);
    }
}
