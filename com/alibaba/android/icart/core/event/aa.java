package com.alibaba.android.icart.core.event;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bea;
import tb.bei;
import tb.bek;
import tb.bem;
import tb.bmz;
import tb.ifm;
import tb.jnv;
import tb.jny;
import tb.jqg;
import tb.jqh;
import tb.kge;
import tb.xia;
import tb.xib;

/* loaded from: classes2.dex */
public class aa extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CHECKED_ITEMS_CHECKED = "checkedItems";
    public static final String KEY_SELECT_IS_CHECKED = "isChecked";
    private List<IDMComponent> c = new ArrayList();

    static {
        kge.a(1354389634);
    }

    public static /* synthetic */ Object ipc$super(aa aaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df4dc5b", new Object[]{aaVar});
        } else {
            aaVar.g();
        }
    }

    public static /* synthetic */ void a(aa aaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a761d9", new Object[]{aaVar, new Boolean(z)});
        } else {
            aaVar.c(z);
        }
    }

    public static /* synthetic */ void b(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276c69fa", new Object[]{aaVar});
        } else {
            aaVar.k();
        }
    }

    public static /* synthetic */ bcb c(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("d5225cac", new Object[]{aaVar}) : aaVar.b;
    }

    public static /* synthetic */ bcb d(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("625d0e2d", new Object[]{aaVar}) : aaVar.b;
    }

    public static /* synthetic */ bbz e(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("ef97bed5", new Object[]{aaVar}) : aaVar.f25791a;
    }

    public static /* synthetic */ IDMComponent f(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c6d3cd7a", new Object[]{aaVar}) : aaVar.h;
    }

    public static /* synthetic */ IDMComponent g(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("8e031999", new Object[]{aaVar}) : aaVar.h;
    }

    public static /* synthetic */ IDMComponent h(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("553265b8", new Object[]{aaVar}) : aaVar.h;
    }

    public static /* synthetic */ bcb i(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("248285b2", new Object[]{aaVar}) : aaVar.b;
    }

    public static /* synthetic */ jny j(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("b1c1063f", new Object[]{aaVar}) : aaVar.g;
    }

    public static /* synthetic */ Context k(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6a1c6089", new Object[]{aaVar}) : aaVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e1  */
    @Override // com.alibaba.android.ultron.trade.event.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(tb.bmz r19) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.event.aa.b(tb.bmz):void");
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue() : !z && this.b.j() && !bei.a(this.h) && (!"item".equals(this.h.getTag()) || !bei.j(this.h));
    }

    private boolean a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c194cec", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (!z || !z2 || !this.b.p() || bei.c(this.g) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_PRE_LOADV2, "true");
        List<IDMComponent> c = bei.c(this.g);
        if (c != null) {
            hashMap.put(RequestConfig.CHECKED_COUNT, String.valueOf(c.size()));
        }
        this.f25791a.b(true, hashMap, new jnv() { // from class: com.alibaba.android.icart.core.event.aa.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z3, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z3), map});
                } else {
                    aa.a(aa.this);
                }
            }
        });
        return true;
    }

    private String a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        StringBuilder sb = new StringBuilder();
        List<String> a2 = bek.a(list);
        if (a2 == null || a2.size() <= 0) {
            return "";
        }
        for (int i = 0; i < a2.size(); i++) {
            String str = a2.get(i);
            sb.append(str.substring(str.indexOf("_") + 1));
            if (i < a2.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.b.j();
    }

    private void a(boolean z, final bmz bmzVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97875ed", new Object[]{this, new Boolean(z), bmzVar});
            return;
        }
        if (CheckHoldManager.a().f() == 0) {
            string = this.e.getString(R.string.cart_promotion_calculate_totalTitle_heji);
        } else {
            string = this.e.getString(R.string.cart_promotion_calculate_totalTitle_youhuiqian);
        }
        bei.a(this.g, this.e.getString(R.string.cart_promotion_calculate), string);
        bei.a(this.g, this.f25791a);
        final boolean j = this.b.j();
        this.f25791a.a(this.h, this.d, z, new jnv() { // from class: com.alibaba.android.icart.core.event.aa.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z2, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z2), map});
                    return;
                }
                aa.a(aa.this);
                bmz bmzVar2 = bmzVar;
                if (bmzVar2 == null) {
                    return;
                }
                Object b = bmzVar2.b("requestFailCallback");
                if (!(b instanceof Runnable)) {
                    return;
                }
                ((Runnable) b).run();
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                aa.a(aa.this, j);
                bmz bmzVar2 = bmzVar;
                if (bmzVar2 != null) {
                    Object b = bmzVar2.b("requestSuccessCallback");
                    if (b instanceof Runnable) {
                        ((Runnable) b).run();
                    }
                }
                if (!bea.c()) {
                    return;
                }
                aa.b(aa.this);
            }
        }, null);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        final List<IDMComponent> c = bei.c(this.g);
        if (c.size() != 1) {
            return;
        }
        jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.event.aa.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    com.alibaba.android.icart.core.data.model.a aVar = new com.alibaba.android.icart.core.data.model.a();
                    aVar.a(c);
                    aVar.a(xib.a(c, aa.c(aa.this)));
                    xia a2 = xib.a(aa.d(aa.this), c);
                    String b = a2.b();
                    if (a2.a() && b == null) {
                        return;
                    }
                    jqg.b("CartSelectSubscriber", "dispatchOrderPrefetch");
                    boolean a3 = aa.e(aa.this).l().a();
                    if (aa.f(aa.this) != null && aa.g(aa.this).getFields() != null && aa.h(aa.this).getFields().getBooleanValue("isHideCalculateBtn")) {
                        z = true;
                    }
                    Bundle a4 = xib.a(aa.j(aa.this), aVar, b, xib.a(aa.i(aa.this), a3, z));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bundle", (Object) a4);
                    ifm.a(aa.k(aa.this), UltronTradeHybridStage.ON_DATA_CHANGED, jSONObject);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void c(boolean z) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (z && !this.b.j() && (b = this.b.w().b()) != null) {
            for (IDMComponent iDMComponent : b) {
                String tag = iDMComponent.getTag();
                if ("bundle".equals(tag) || "item".equals(tag) || "shop".equals(tag)) {
                    boolean a2 = bei.a(iDMComponent);
                    boolean b2 = bei.b(iDMComponent);
                    if (!a2 && b2) {
                        bei.a(iDMComponent, "false", "isChecked");
                    }
                }
            }
        }
    }

    private void a(boolean z, boolean z2, bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00cb369", new Object[]{this, new Boolean(z), new Boolean(z2), bmzVar});
        } else if (!com.alibaba.android.ultron.trade.utils.e.a(Globals.getApplication())) {
            com.alibaba.android.icart.core.widget.d.a(this.e, com.alibaba.ability.localization.b.a(R.string.app_network_error));
            g();
        } else if (a(z2)) {
        } else {
            if (bem.j(this.b)) {
                List<IDMComponent> c = bei.c(this.g);
                if (c(c != null ? c.size() : 0) || z2 || bem.a(this.b)) {
                    if (z) {
                        if (bea.g()) {
                            g();
                        }
                        this.f25791a.i().b();
                    }
                    a(false, bmzVar);
                    return;
                }
                g();
                return;
            }
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        bei.a(this.g);
        bei.a(this.g, this.f25791a);
        this.f25791a.x().n();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        IDMComponent parent = this.h.getParent();
        if (parent == null || parent.getParent() == null) {
            return;
        }
        IDMComponent parent2 = parent.getParent();
        for (IDMComponent iDMComponent : parent2.getChildren()) {
            if (iDMComponent != null) {
                Iterator<IDMComponent> it = iDMComponent.getChildren().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    IDMComponent next = it.next();
                    if (next != null && "item".equals(next.getTag()) && !a(next) && bei.a(f(), next)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        for (IDMComponent iDMComponent2 : parent2.getChildren()) {
            if (iDMComponent2 != null && ("shop".equals(iDMComponent2.getTag()) || "bundleHeader".equals(iDMComponent2.getTag()))) {
                b(iDMComponent2, z);
                return;
            }
        }
    }

    private List<IDMComponent> a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aae6acdf", new Object[]{this, iDMComponent, new Boolean(z)});
        }
        List<IDMComponent> a2 = bei.a(iDMComponent, this.f25791a);
        for (IDMComponent iDMComponent2 : a2) {
            if (!iDMComponent2.getFields().getBooleanValue("isInvalid") || this.b.j()) {
                b(iDMComponent2, z);
            }
        }
        return a2;
    }

    private List<IDMComponent> d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bb7819de", new Object[]{this, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        IDMComponent parent = this.h.getParent();
        if (parent == null) {
            return arrayList;
        }
        for (IDMComponent iDMComponent : parent.getChildren()) {
            if (iDMComponent != null && iDMComponent.getChildren() != null && !iDMComponent.getChildren().isEmpty()) {
                for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                    if (iDMComponent2 != null && "item".equals(iDMComponent2.getTag()) && bei.a(f(), iDMComponent2)) {
                        b(iDMComponent2, z);
                        arrayList.addAll(a(iDMComponent2, z));
                        arrayList.add(iDMComponent2);
                    }
                }
            }
        }
        return arrayList;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        List<IDMComponent> m = ((com.taobao.android.ultron.datamodel.imp.b) this.g).m();
        if (bem.c(this.b)) {
            bei.b(this.b);
            return;
        }
        IDMComponent iDMComponent = null;
        boolean l = true ^ this.b.l();
        for (IDMComponent iDMComponent2 : m) {
            if (iDMComponent2 != null) {
                String tag = iDMComponent2.getTag();
                if ("item".equals(tag)) {
                    if (!a(iDMComponent2) && bei.a(f(), iDMComponent2)) {
                        l = false;
                    }
                } else if ("submit".equals(tag)) {
                    iDMComponent = iDMComponent2;
                }
            }
        }
        if (iDMComponent == null) {
            return;
        }
        b(iDMComponent, l);
    }

    private List<IDMComponent> e(boolean z) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c8110f5f", new Object[]{this, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) this.g;
        List<IDMComponent> m = bVar.m();
        if (!bem.c(this.b)) {
            if (m == null) {
                return arrayList;
            }
            for (IDMComponent iDMComponent : m) {
                if (iDMComponent != null) {
                    String tag = iDMComponent.getTag();
                    if (z || !bei.l(iDMComponent)) {
                        if (("shop".equals(tag) || "bundleHeader".equals(tag)) && bei.a(f(), iDMComponent)) {
                            b(iDMComponent, z);
                        } else if ("item".equals(tag) && bei.a(f(), iDMComponent)) {
                            b(iDMComponent, z);
                            arrayList.addAll(a(iDMComponent, z));
                            arrayList.add(iDMComponent);
                        }
                    }
                }
            }
            return arrayList;
        }
        if (this.b.d()) {
            b = this.f25791a.x().d().f();
        } else {
            b = bVar.b();
        }
        if (b == null) {
            return arrayList;
        }
        for (IDMComponent iDMComponent2 : b) {
            if (iDMComponent2 != null) {
                String tag2 = iDMComponent2.getTag();
                if (("shop".equals(tag2) || "bundleHeader".equals(tag2)) && bei.a(f(), iDMComponent2)) {
                    b(iDMComponent2, z);
                } else if ("item".equals(tag2) && bei.a(f(), iDMComponent2)) {
                    b(iDMComponent2, z);
                    arrayList.addAll(a(iDMComponent2, z));
                    arrayList.add(iDMComponent2);
                }
            }
        }
        return arrayList;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.f25791a.r().a();
        }
    }

    private void b(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fe1529", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (iDMComponent == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isChecked", String.valueOf(z));
            a(iDMComponent, hashMap);
            b(iDMComponent, hashMap);
            if (iDMComponent.getFields().getBooleanValue(bei.KEY_CAN_CHECK_IN_NORMAL)) {
                this.b.a(iDMComponent, z);
            }
            if (this.c.contains(iDMComponent)) {
                return;
            }
            this.c.add(iDMComponent);
        }
    }

    private void b(IDMComponent iDMComponent, Map<String, ? extends Object> map) {
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8516051a", new Object[]{this, iDMComponent, map});
            return;
        }
        Map<String, List<com.taobao.android.ultron.common.model.b>> eventMap = iDMComponent.getEventMap();
        if (eventMap == null || (list = eventMap.get(this.d.f())) == null) {
            return;
        }
        a(a(list, this.d.b()), map);
    }

    private com.taobao.android.ultron.common.model.b a(List<com.taobao.android.ultron.common.model.b> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("76067822", new Object[]{this, list, str});
        }
        if (list != null && !list.isEmpty()) {
            for (com.taobao.android.ultron.common.model.b bVar : list) {
                if (bVar != null && str != null && str.equals(bVar.getType())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    private boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("isChecked") && "true".equals(fields.getString("isChecked"));
    }

    private IDMComponent c(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("83592c6f", new Object[]{this, bmzVar});
        }
        Object b = bmzVar.b("eventParamOriginTriggerModel");
        if (!(b instanceof IDMComponent)) {
            return null;
        }
        return (IDMComponent) b;
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : bem.m(this.b) >= i;
    }
}
