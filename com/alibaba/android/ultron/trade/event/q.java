package com.alibaba.android.ultron.trade.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bmz;
import tb.bnd;
import tb.bnf;
import tb.kge;

/* loaded from: classes2.dex */
public class q extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SELECT_IS_CHECKED = "isChecked";

    /* renamed from: a  reason: collision with root package name */
    private boolean f2671a = false;

    static {
        kge.a(-1627036834);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        if (!this.f.y().f()) {
            bmzVar.a((bnf) new bnd(this.h, this.f));
        }
        e();
        this.f2671a = f();
        boolean g = g();
        String a2 = a(this.h);
        if (a2 != null) {
            char c = 65535;
            int hashCode = a2.hashCode();
            if (hashCode != -274045035) {
                if (hashCode == 1793740644 && a2.equals("singleSelect")) {
                    c = 0;
                }
            } else if (a2.equals("multiSelect")) {
                c = 1;
            }
            if (c == 0) {
                b(g);
                return;
            } else if (c == 1) {
                c(g);
                return;
            }
        }
        a(g);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        JSONObject fields = this.h.getFields();
        return fields != null && (this.g instanceof com.taobao.android.ultron.datamodel.imp.b) && ((com.taobao.android.ultron.datamodel.imp.b) this.g).I() && fields.containsKey("state");
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent});
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent != null && parent.getFields() != null && parent.getFields().get("groupType") != null) {
            return (String) parent.getFields().get("groupType");
        }
        return null;
    }

    private boolean b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73527f0f", new Object[]{this, iDMComponent})).booleanValue();
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent != null && parent.getFields() != null && parent.getFields().get("optional") != null) {
            return parent.getFields().getBoolean("optional").booleanValue();
        }
        return false;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        Object b = this.d.b("viewParams");
        JSONObject fields = this.h.getFields();
        if (fields == null) {
            return false;
        }
        if (b instanceof List) {
            List list = (List) b;
            if (!list.isEmpty()) {
                return !"true".equals(String.valueOf(list.get(0)));
            }
        }
        if (!fields.containsKey("isChecked") || !fields.getBoolean("isChecked").booleanValue()) {
            z = false;
        }
        return (fields.containsKey("isChecked") || !this.f2671a) ? z : fields.getString("state").equals("sel");
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a(this.h, !z);
        this.f.w().a(this.h, this.d);
    }

    private void b(boolean z) {
        List<IDMComponent> children;
        IDMComponent h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        IDMComponent parent = this.h.getParent();
        if (parent == null || (children = parent.getChildren()) == null) {
            return;
        }
        if (b(this.h)) {
            a(this.h, !z);
        } else {
            a(this.h, true);
        }
        if (this.f.y().f() && (h = h()) != null) {
            List list = (List) h.getExtMap().get("subOperator");
            if (list == null) {
                list = new ArrayList();
                h.getExtMap().put("subOperator", list);
            }
            list.add(this.h.getKey());
        }
        for (IDMComponent iDMComponent : children) {
            if (iDMComponent != null) {
                String b = com.taobao.android.ultron.datamodel.imp.f.b(iDMComponent);
                if (!this.h.equals(iDMComponent) && !"header".equals(b) && !"footer".equals(b)) {
                    a(iDMComponent, false);
                }
            }
        }
        this.f.w().a(this.h, this.d);
    }

    private void c(boolean z) {
        List<IDMComponent> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        IDMComponent parent = this.h.getParent();
        if (parent == null || (children = parent.getChildren()) == null || z) {
            return;
        }
        a(this.h, z);
        int intValue = parent.getFields().getInteger("maxCount").intValue();
        ArrayList<IDMComponent> arrayList = new ArrayList();
        int i = 0;
        for (IDMComponent iDMComponent : children) {
            JSONObject fields = iDMComponent.getFields();
            boolean z2 = fields.containsKey("isChecked") && fields.getBoolean("isChecked").booleanValue();
            if (!fields.containsKey("isChecked") && this.f2671a) {
                z2 = fields.getString("state").equals("sel");
            }
            if (!z2) {
                arrayList.add(iDMComponent);
            } else {
                i++;
            }
        }
        if (i >= intValue) {
            for (IDMComponent iDMComponent2 : arrayList) {
                if (iDMComponent2 != null) {
                    String b = com.taobao.android.ultron.datamodel.imp.f.b(iDMComponent2);
                    if (!"header".equals(b) && !"footer".equals(b)) {
                        iDMComponent2.getFields().put("status", (Object) "disable");
                    }
                }
            }
        }
        this.f.w().a(h(), this.d);
    }

    private void a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6484868", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (iDMComponent == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isChecked", String.valueOf(z));
            if (this.f2671a) {
                hashMap.put("state", z ? "sel" : "unsel");
            }
            a(iDMComponent, hashMap);
            b(iDMComponent, hashMap);
        }
    }

    private void b(IDMComponent iDMComponent, Map<String, String> map) {
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

    private IDMComponent h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("b3be2373", new Object[]{this});
        }
        if (this.f.y().f()) {
            return (IDMComponent) this.f.y().q().first;
        }
        return this.h;
    }
}
