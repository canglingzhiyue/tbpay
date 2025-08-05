package com.taobao.android.ultron.datamodel.imp.delta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.jok;
import tb.jom;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "insert";
    public static final String TAG = "OperateInsert";

    static {
        kge.a(-525862773);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.ultron.datamodel.imp.delta.a
    public void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278c96f", new Object[]{this, bVar, jSONObject, list});
        } else {
            a(bVar, jSONObject.getString("target"), jSONObject.getString(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT), jSONObject.getString("position"), list, false);
        }
    }

    private void a(com.taobao.android.ultron.datamodel.imp.b bVar, String str, String str2, String str3, List<jok> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af5cf3", new Object[]{this, bVar, str, str2, str3, list, new Boolean(z)});
            return;
        }
        List<IDMComponent> b = bVar.b();
        Map<String, DMComponent> u = bVar.u();
        DMComponent dMComponent = str3 != null ? u.get(str3) : null;
        JSONObject jSONObject = bVar.o().getJSONObject(str);
        if (jSONObject == null) {
            return;
        }
        final DMComponent a2 = com.taobao.android.ultron.datamodel.imp.a.a(bVar, jSONObject, str);
        DMComponent dMComponent2 = u.get(str2);
        if (dMComponent2 == null) {
            return;
        }
        int i = -1;
        if (dMComponent != null) {
            i = dMComponent2.getChildren().indexOf(dMComponent);
        }
        dMComponent2.getChildren().add(i + 1, a2);
        a2.setParent(dMComponent2);
        String b2 = i.b(a2, dMComponent2);
        String a3 = i.a(a2, dMComponent2);
        a2.setComponentCardGroupTag(b2);
        a2.setComponentPosition(a3);
        if (!z) {
            jom jomVar = new jom();
            jomVar.a(new ArrayList<IDMComponent>() { // from class: com.taobao.android.ultron.datamodel.imp.delta.OperateInsert$1
                {
                    add(a2);
                }
            });
            jomVar.a(dMComponent);
            jomVar.b(dMComponent2);
            list.add(jomVar);
        }
        String str4 = "null";
        if (dMComponent != null) {
            IDMComponent b3 = i.b(dMComponent, b);
            if (b3 != null && b.contains(b3)) {
                b.add(b.indexOf(b3) + 1, a2);
            } else {
                String h = bVar.h();
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("lastRender is not in renderComponent, lastRender : ");
                if (b3 != null) {
                    str4 = b3.getKey();
                }
                sb.append(str4);
                strArr[0] = sb.toString();
                UnifyLog.a(h, TAG, "insertPosition isnot null", strArr);
            }
        } else {
            IDMComponent a4 = i.a(dMComponent2, b);
            if (a4 != null && b.contains(a4)) {
                b.add(b.indexOf(a4), a2);
            } else {
                String h2 = bVar.h();
                String[] strArr2 = new String[1];
                StringBuilder sb2 = new StringBuilder();
                sb2.append("firstRender : ");
                if (a4 != null) {
                    str4 = a4.getKey();
                }
                sb2.append(str4);
                strArr2[0] = sb2.toString();
                UnifyLog.a(h2, TAG, "firstRender is not in renderComponent", strArr2);
            }
        }
        if (z && b.contains(dMComponent2)) {
            b.remove(dMComponent2);
        }
        u.put(str, a2);
        if (bVar.w() == null || !bVar.w().containsKey(str)) {
            return;
        }
        Iterator<Object> it = bVar.w().getJSONArray(str).iterator();
        String str5 = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                String str6 = (String) next;
                a(bVar, str6, str, str5, list, true);
                str5 = str6;
            }
        }
    }
}
