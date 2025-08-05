package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.c;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ehh extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public ehe g;
    public ehe h;
    public ehe i;
    public ehe j;
    public ehg k;

    static {
        kge.a(-1368424949);
    }

    public static /* synthetic */ Object ipc$super(ehh ehhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.navbar.NavBarViewModel";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ehh() {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
            com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r1 = (com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel) r1
            r5.<init>(r1)
            r2 = 0
            r5.d = r2
            tb.ehe r2 = new tb.ehe
            r2.<init>(r1, r0)
            r5.g = r2
            tb.ehe r2 = r5.g
            java.lang.String r3 = "ꁺ"
            r2.c = r3
            r3 = 4600427019358961664(0x3fd8000000000000, double:0.375)
            r2.b = r3
            r5.c()
            tb.ehe r2 = new tb.ehe
            r2.<init>(r1, r0)
            r5.j = r2
            tb.ehe r0 = r5.j
            java.lang.String r1 = "ꁪ"
            r0.c = r1
            r0.b = r3
            r5.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ehh.<init>():void");
    }

    public ehh(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        this.d = false;
        if (bVar != null) {
            ResourceNode l = eqb.l(bVar);
            if (l != null && l.salePromotion != null) {
                this.b = l.salePromotion.f;
                this.e = l.salePromotion.h;
                if (!TextUtils.isEmpty(l.salePromotion.g)) {
                    this.d = true;
                    try {
                        this.c = c.a(l.salePromotion.g);
                    } catch (Exception unused) {
                        this.c = 0;
                    }
                }
            }
            ItemNode c = eqb.c(bVar);
            if (c != null && c.images != null && !c.images.isEmpty()) {
                this.f = c.images.get(0);
            }
        }
        a();
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.datasdk.factory.manager.b l = emx.a(this.mNodeBundle.h()).b().l();
        for (ComponentModel componentModel : this.component.children) {
            try {
                epe d = l.d(componentModel, this.mNodeBundle);
                if (d instanceof ehe) {
                    ehe eheVar = (ehe) d;
                    if ("left".equals(eheVar.e)) {
                        this.g = eheVar;
                    } else if ("center".equals(eheVar.e)) {
                        this.h = eheVar;
                    } else if ("custom".equals(eheVar.e)) {
                        this.i = eheVar;
                    } else if ("right".equals(eheVar.e)) {
                        this.j = eheVar;
                    }
                } else if (d instanceof ehg) {
                    this.k = (ehg) d;
                }
            } catch (Exception e) {
                i.a("ActionBarViewModel", "Make widget view model exception.", e);
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ehe eheVar = this.g;
        if (eheVar == null) {
            return;
        }
        eheVar.events = new ArrayList();
        this.g.events.add(new enq());
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ehe eheVar = this.j;
        if (eheVar == null) {
            return;
        }
        eheVar.children = new ArrayList();
    }

    public ehh(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        this.d = false;
        if (bVar != null) {
            ResourceNode l = eqb.l(bVar);
            if (l != null && l.salePromotion != null) {
                this.b = l.salePromotion.f;
                this.e = l.salePromotion.h;
                if (!TextUtils.isEmpty(l.salePromotion.g)) {
                    this.d = true;
                    try {
                        this.c = c.a(l.salePromotion.g);
                    } catch (Exception unused) {
                        this.c = 0;
                    }
                }
            }
            ItemNode c = eqb.c(bVar);
            if (c != null && c.images != null && !c.images.isEmpty()) {
                this.f = c.images.get(0);
            }
        }
        b();
        d();
    }

    private List<IDMComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (this.dmComponent.getChildren() != null && !this.dmComponent.getChildren().isEmpty()) {
            if (this.mNodeBundle != null && this.mNodeBundle.b) {
                a(arrayList, this.dmComponent.getChildren().get(0));
            } else {
                arrayList.addAll(this.dmComponent.getChildren().get(0).getChildren());
            }
            if (this.dmComponent.getChildren().size() > 1) {
                arrayList.add(this.dmComponent.getChildren().get(1));
            }
        }
        return arrayList;
    }

    private void a(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ac5f9b", new Object[]{this, list, iDMComponent});
        } else if (iDMComponent != null) {
            if (iDMComponent.getChildren() == null || iDMComponent.getChildren().size() == 0) {
                list.add(iDMComponent);
                return;
            }
            for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                a(list, iDMComponent2);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        eox m = emx.a(this.mNodeBundle.h()).b().m();
        for (IDMComponent iDMComponent : e()) {
            try {
                epe d = m.d(iDMComponent, this.mNodeBundle);
                if (d instanceof ehe) {
                    ehe eheVar = (ehe) d;
                    if ("left".equals(eheVar.e)) {
                        this.g = eheVar;
                    } else if ("center".equals(eheVar.e)) {
                        this.h = eheVar;
                    } else if ("custom".equals(eheVar.e)) {
                        this.i = eheVar;
                    } else if ("right".equals(eheVar.e)) {
                        this.j = eheVar;
                    }
                } else if (d instanceof ehg) {
                    this.k = (ehg) d;
                }
            } catch (Exception e) {
                i.a("ActionBarViewModel", "Make widget view model exception.", e);
            }
        }
    }
}
