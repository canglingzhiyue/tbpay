package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.flexbox.layoutmanager.component.ag;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.flexbox.layoutmanager.container.dx.a;
import com.taobao.tao.flexbox.layoutmanager.container.dx.g;
import com.taobao.tao.flexbox.layoutmanager.container.dx.j;
import com.taobao.tao.flexbox.layoutmanager.container.dx.k;
import com.taobao.tao.flexbox.layoutmanager.container.dx.l;
import com.taobao.tao.flexbox.layoutmanager.container.dx.m;
import com.taobao.tao.flexbox.layoutmanager.container.dx.n;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import java.util.HashMap;
import java.util.Map;
import tb.dkt;
import tb.fvb;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.ohd;
import tb.ohg;
import tb.rul;
import tb.rva;

/* loaded from: classes8.dex */
public class af extends Component<ViewGroup, a> implements com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private com.taobao.tao.flexbox.layoutmanager.container.dx.a f20106a;
    private ViewGroup b;
    private String c;
    private JSONObject d;
    private com.taobao.tao.flexbox.layoutmanager.core.c e = new c.a<ViewGroup, a>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.af.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            af.this = this;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, ViewGroup viewGroup, a aVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e1285b3", new Object[]{this, fVar, viewGroup, aVar, dVar});
            } else if (viewGroup == null || aVar == null) {
            } else {
                if (!StringUtils.isEmpty(aVar.c) && !StringUtils.equals(af.a(af.this), aVar.c)) {
                    af.a(af.this, aVar.c);
                    JSONObject parseObject = JSONObject.parseObject(aVar.c);
                    DinamicXEngine c = af.b(af.this).c();
                    if (c != null) {
                        c.a("refreshUrlParams", af.b(af.this).o(), parseObject, (String) null, (com.taobao.android.dinamicx.eventchain.g) null);
                        return;
                    }
                    af.a(af.this, parseObject);
                    ogg.a("DXComponent", "dx   pendingParams: " + aVar.c);
                    return;
                }
                ogg.a("DXComponent", "dx attr.src is empty or same, " + aVar.c);
            }
        }
    };

    static {
        kge.a(-1481866482);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(af afVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1780669330:
                super.parseViewParams((HashMap) objArr[0]);
                return null;
            case 112483626:
                super.onCreate((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0]);
                return null;
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* renamed from: lambda$DF8SAFf7BGV6AAD-9HOLGo9fAkA */
    public static /* synthetic */ kotlin.t m1261lambda$DF8SAFf7BGV6AAD9HOLGo9fAkA(af afVar, Boolean bool, DXResult dXResult, DXResult dXResult2) {
        return afVar.a(bool, dXResult, dXResult2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(ViewGroup viewGroup, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, viewGroup, aVar, map, new Boolean(z)});
        } else {
            a(viewGroup, aVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.af$a, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, android.view.ViewGroup] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ ViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ JSONObject a(af afVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2211cd57", new Object[]{afVar, jSONObject});
        }
        afVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String a(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e862e5e7", new Object[]{afVar}) : afVar.c;
    }

    public static /* synthetic */ String a(af afVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d8259d", new Object[]{afVar, str});
        }
        afVar.c = str;
        return str;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.container.dx.a b(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.container.dx.a) ipChange.ipc$dispatch("fb98c78c", new Object[]{afVar}) : afVar.f20106a;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        dkt l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d2a", new Object[]{this, aaVar});
            return;
        }
        super.onCreate(aaVar);
        if (this.f20106a == null) {
            this.f20106a = com.taobao.tao.flexbox.layoutmanager.container.dx.a.Companion.a(aaVar.N(), "guangguang", "guangguang", "DX");
        }
        this.f20106a.b();
        this.f20106a.d();
        DinamicXEngine c = this.f20106a.c();
        if (c == null || (l = c.l()) == null) {
            return;
        }
        l.a(String.valueOf((long) com.taobao.tao.flexbox.layoutmanager.container.dx.j.SETTABBARHIDDEN), new j.a());
        l.a(String.valueOf((long) com.taobao.tao.flexbox.layoutmanager.container.dx.g.BINDMULTITABVIDEOCONTROL), new g.a());
        l.a(String.valueOf((long) k.THEATERCARDANIM), new k.a());
        l.a(String.valueOf((long) com.taobao.tao.flexbox.layoutmanager.container.dx.m.THEATERCARDANIMSTART), new m.a());
        l.a(String.valueOf((long) com.taobao.tao.flexbox.layoutmanager.container.dx.l.THEATERCARDANIMCLEAR), new l.a());
        l.a(String.valueOf((long) com.taobao.tao.flexbox.layoutmanager.container.dx.n.SCROLLTOPOSITIONTOP), new n.a());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        if (!z) {
            return;
        }
        this.f20106a.a(((a) this.viewParams).g);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e5df323c", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void parseViewParams(HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dd246e", new Object[]{this, hashMap});
        } else {
            super.parseViewParams(hashMap);
        }
    }

    public void a(ViewGroup viewGroup, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68224cc", new Object[]{this, viewGroup, aVar, map, new Boolean(z)});
        } else {
            super.applyAttrForView(viewGroup, aVar, map, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        char c = 65535;
        if (str.hashCode() == -457335851 && str.equals(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS)) {
            c = 0;
        }
        if (c == 0) {
            return this.e;
        }
        return super.getAttributeHandler(str);
    }

    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        a.b bVar = new a.b();
        bVar.b().put("containerType", (Object) "tnode");
        bVar.b().put("enableBgImage", (Object) "true");
        bVar.b().put("enableScrollToPositionTop", (Object) "true");
        if (((a) this.viewParams).f != null) {
            bVar.b().put(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, (Object) ((a) this.viewParams).f);
        }
        DXTemplateItem a2 = a(((a) this.viewParams).f20108a);
        this.b = (ViewGroup) this.f20106a.a(((a) this.viewParams).ab, ((a) this.viewParams).aa, a2.f11925a, a2.b, a2.c, bVar, (rul<? super fvb, kotlin.t>) null, new rva() { // from class: com.taobao.tao.flexbox.layoutmanager.component.-$$Lambda$af$DF8SAFf7BGV6AAD-9HOLGo9fAkA
            @Override // tb.rva
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return af.m1261lambda$DF8SAFf7BGV6AAD9HOLGo9fAkA(af.this, (Boolean) obj, (DXResult) obj2, (DXResult) obj3);
            }
        });
        return this.b;
    }

    public /* synthetic */ kotlin.t a(Boolean bool, DXResult dXResult, DXResult dXResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kotlin.t) ipChange.ipc$dispatch("a745be84", new Object[]{this, bool, dXResult, dXResult2});
        }
        ag.a a2 = ag.a((View) this.b);
        if (a2 != null) {
            a2.a();
        }
        DinamicXEngine c = this.f20106a.c();
        if (c != null && this.d != null) {
            c.a("refreshUrlParams", this.f20106a.o(), this.d, (String) null, (com.taobao.android.dinamicx.eventchain.g) null);
            this.d = null;
        }
        return null;
    }

    private DXTemplateItem a(DXTemplateItem dXTemplateItem) {
        com.taobao.tao.flexbox.layoutmanager.container.dx.f a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("762f314e", new Object[]{this, dXTemplateItem});
        }
        if (!((a) this.viewParams).b && (a2 = com.taobao.tao.flexbox.layoutmanager.container.dx.d.INSTANCE.a(dXTemplateItem.f11925a)) != null) {
            dXTemplateItem.b = a2.b();
            dXTemplateItem.c = a2.c();
        }
        return dXTemplateItem;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        ag.a a2 = ag.a((View) this.b);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -552345454) {
            if (hashCode != 1228998971) {
                if (hashCode == 2122668806 && str.equals("onwillappear")) {
                    c = 0;
                }
            } else if (str.equals("ondestroy")) {
                c = 2;
            }
        } else if (str.equals("onwilldisappear")) {
            c = 1;
        }
        if (c == 0) {
            com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar = this.f20106a;
            if (aVar != null) {
                aVar.i();
            }
            if (a2 != null) {
                a2.a();
            }
        } else if (c == 1) {
            com.taobao.tao.flexbox.layoutmanager.container.dx.a aVar2 = this.f20106a;
            if (aVar2 != null) {
                aVar2.j();
            }
            if (a2 != null) {
                a2.b();
            }
        } else if (c == 2 && "true".equals(ohg.a().a("weitao_switch", "destoryContainerByMessage", "true"))) {
            this.f20106a.a(((a) this.viewParams).g);
        }
        return false;
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String c;

        /* renamed from: a */
        public DXTemplateItem f20108a = new DXTemplateItem();
        public boolean b = false;
        public JSONObject f = null;
        public int g = 1;

        static {
            kge.a(-838510059);
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            this.aa = ohd.b(context);
            this.ab = ohd.g(context);
            char c = 65535;
            switch (str.hashCode()) {
                case -1811739251:
                    if (str.equals("destroyStrategy")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1695523782:
                    if (str.equals("tnodePriority")) {
                        c = 3;
                        break;
                    }
                    break;
                case -457335851:
                    if (str.equals(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS)) {
                        c = 4;
                        break;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (str.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 351608024:
                    if (str.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f20108a.f11925a = oec.a(obj, "");
            } else if (c == 1) {
                this.f20108a.b = oec.a(obj, 0L);
            } else if (c == 2) {
                this.f20108a.c = oec.a(obj, "");
            } else if (c == 3) {
                this.b = oec.a(obj, false);
            } else if (c != 4) {
                if (c != 5) {
                    return;
                }
                this.g = oec.a(obj, 1);
            } else {
                this.c = oec.a(obj, "{}");
                try {
                    this.f = JSONObject.parseObject(oec.a(obj, "{}"));
                } catch (Throwable unused) {
                    ogg.a("DXComponent", "urlParams 参数错误");
                }
            }
        }
    }
}
