package com.alibaba.android.ultron.trade.event;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bmz;
import tb.bne;
import tb.bnf;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(641495102);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f() {
        a();
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        com.taobao.android.ultron.common.model.b g = g();
        if (g == null) {
            return;
        }
        List<IDMComponent> components = g.getComponents();
        if (a(components)) {
            bmzVar.a((bnf) new bne(components));
            h();
            this.f.w().a(f(), bmzVar);
        }
        this.f.y().a(true);
    }

    private IDMComponent f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("68961171", new Object[]{this});
        }
        Pair<IDMComponent, com.taobao.android.ultron.common.model.b> q = this.f.y().q();
        if (q != null) {
            return (IDMComponent) q.first;
        }
        return null;
    }

    private com.taobao.android.ultron.common.model.b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("5776a5f7", new Object[]{this});
        }
        Pair<IDMComponent, com.taobao.android.ultron.common.model.b> q = this.f.y().q();
        if (q != null) {
            return (com.taobao.android.ultron.common.model.b) q.second;
        }
        return null;
    }

    private void h() {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f.y().f()) {
            IDMComponent f = f();
            com.taobao.android.ultron.common.model.b g = g();
            if (f == null || g == null || (components = g.getComponents()) == null) {
                return;
            }
            int size = components.size();
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < size; i++) {
                IDMComponent iDMComponent = components.get(i);
                jSONObject.put(iDMComponent.getKey(), (Object) iDMComponent.getData().toJSONString());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", (Object) jSONObject);
            a(g, jSONObject2);
        }
    }

    private boolean a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null && a(iDMComponent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(IDMComponent iDMComponent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue();
        }
        JSONObject stashData = iDMComponent.getStashData();
        JSONObject data = iDMComponent.getData();
        if (stashData != null && data != null) {
            try {
                z = a(data, stashData);
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : jSONObject.keySet()) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
