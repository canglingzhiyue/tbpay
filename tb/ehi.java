package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.utils.c;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ehi extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27310a;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public ehe f;
    public ehe g;
    public ehe h;
    public ehe i;
    public ehe j;
    public JSONObject k;
    public ehe m;

    static {
        kge.a(1328599499);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.navbar.TTNavBarViewModel";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ehi() {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
            com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r1 = (com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel) r1
            r5.<init>(r1)
            r2 = 0
            r5.c = r2
            tb.ehe r2 = new tb.ehe
            r2.<init>(r1, r0)
            r5.f = r2
            tb.ehe r2 = r5.f
            java.lang.String r3 = "ꁺ"
            r2.c = r3
            r3 = 4600427019358961664(0x3fd8000000000000, double:0.375)
            r2.b = r3
            r5.b()
            tb.ehe r2 = new tb.ehe
            r2.<init>(r1, r0)
            r5.j = r2
            tb.ehe r0 = r5.j
            java.lang.String r1 = "ꁪ"
            r0.c = r1
            r0.b = r3
            r5.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ehi.<init>():void");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        eox m = emx.a(this.mNodeBundle.h()).b().m();
        for (IDMComponent iDMComponent : this.dmComponent.getChildren()) {
            try {
                epe d = m.d(iDMComponent, this.mNodeBundle);
                if (d instanceof ehe) {
                    ehe eheVar = (ehe) d;
                    if ("back".equals(eheVar.e)) {
                        this.f = eheVar;
                    } else if ("search".equals(eheVar.e)) {
                        this.g = eheVar;
                    } else if ("share".equals(eheVar.e)) {
                        this.h = eheVar;
                    } else if ("cart".equals(eheVar.e)) {
                        this.i = eheVar;
                    } else if ("collect".equals(eheVar.e)) {
                        this.m = eheVar;
                    } else if ("more".equals(eheVar.e)) {
                        this.j = eheVar;
                    }
                }
            } catch (Exception e) {
                i.a(com.taobao.android.detail.core.performance.i.a("TTNavBarViewModel", BTags.TTNavBar), "Make widget view model exception.", e);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ehe eheVar = this.f;
        if (eheVar == null) {
            return;
        }
        eheVar.events = new ArrayList();
        this.f.events.add(new enq());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ehe eheVar = this.j;
        if (eheVar == null) {
            return;
        }
        eheVar.children = new ArrayList();
    }

    public ehi(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        this.c = false;
        if (bVar != null) {
            ResourceNode l = eqb.l(bVar);
            if (l != null && l.salePromotion != null) {
                this.f27310a = l.salePromotion.f;
                this.d = l.salePromotion.h;
                if (!StringUtils.isEmpty(l.salePromotion.g)) {
                    this.c = true;
                    try {
                        this.b = c.a(l.salePromotion.g);
                    } catch (Exception unused) {
                        this.b = 0;
                    }
                }
            }
            ItemNode c = eqb.c(bVar);
            if (c != null && c.images != null && !c.images.isEmpty()) {
                this.e = c.images.get(0);
            }
            try {
                JSONObject jSONObject = bVar.l().getJSONArray("apiStack").getJSONObject(0);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                this.k = (jSONObject2 == null ? jSONObject.getJSONObject("value") : jSONObject2).getJSONObject("anchorpoint");
            } catch (Exception e) {
                String a2 = com.taobao.android.detail.core.performance.i.a("TTNavBarViewModel", BTags.TTNavBar);
                i.a(a2, "anchorpoint parse exception:" + e.getMessage());
            }
            String a3 = com.taobao.android.detail.core.performance.i.a("TTNavBarViewModel", BTags.TTNavBar);
            StringBuilder sb = new StringBuilder();
            sb.append("anchorpoint:");
            JSONObject jSONObject3 = this.k;
            sb.append(jSONObject3 != null ? JSON.toJSONString(jSONObject3) : "null");
            i.d(a3, sb.toString());
        }
        a();
        c();
    }
}
