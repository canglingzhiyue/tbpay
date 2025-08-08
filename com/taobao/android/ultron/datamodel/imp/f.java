package com.taobao.android.ultron.datamodel.imp;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultron.common.utils.ErrorConstants;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.bga;
import tb.jnr;
import tb.jok;
import tb.jol;
import tb.jom;
import tb.jon;
import tb.jou;
import tb.jpv;
import tb.jqf;
import tb.jqg;
import tb.jqi;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class f implements jou {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;
    private static String d;
    private IDMComponent b;
    private jnr f;
    private boolean g;
    private boolean h;
    private String i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15780a = false;
    private boolean e = true;

    static {
        kge.a(283303236);
        kge.a(-1670080804);
        c = "CardGroupTag";
        d = "PositionTag";
    }

    public void a(jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb98c6a", new Object[]{this, jnrVar});
        } else {
            this.f = jnrVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean a(b bVar, JSONObject jSONObject) {
        List<IDMComponent> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0def882", new Object[]{this, bVar, jSONObject})).booleanValue();
        }
        String str = "ultron";
        if (bVar.F() != null) {
            try {
                this.f15780a = i.a(new BigInteger(bVar.F()), i.FEATURE_TAG_ID);
            } catch (Exception e) {
                UnifyLog.a(bVar.h(), "ParseModule", "parseComponents exception", e.getMessage());
                bga.a.a(StringUtils.isEmpty(bVar.h()) ? str : bVar.h(), "ParseModule.protocolFeatureCheck", e);
            }
        }
        if (jSONObject == null) {
            return false;
        }
        h.b(bVar, jSONObject);
        try {
            if (jSONObject.getBooleanValue("reload")) {
                g = e(bVar, jSONObject);
            } else {
                g = g(bVar, jSONObject);
            }
            if (!StringUtils.isEmpty(bVar.h())) {
                str = bVar.h();
            }
            if (g == null) {
                UnifyLog.a(bVar.h(), "ParseModule", "parseComponents", "新奥创协议解析为空");
                bga.a.a(str, "ParseModule.parseResponse", ErrorConstants.PARSE_COMPONENT_LIST_EMPTY.errorCode(), ErrorConstants.PARSE_COMPONENT_LIST_EMPTY.errorMessage());
                return false;
            }
            if (g.isEmpty()) {
                jqg.b("ParseModule", str + "|output component list is empty");
            }
            bVar.a(jSONObject);
            bVar.b(g);
            return true;
        } catch (Throwable th) {
            if (!StringUtils.isEmpty(bVar.h())) {
                str = bVar.h();
            }
            bga.a.a(str, "ParseModule.parseResponse", th);
            jqg.a("ParseModule", "exception|" + str + "|parseComponents|error=" + th.getMessage());
            return false;
        }
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("d245ed6d", new Object[]{this}) : this.b;
    }

    @Override // tb.jou
    public List<IDMComponent> a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6f358cb", new Object[]{this, bVar, str});
        }
        try {
            this.i = bVar.h();
            List<IDMComponent> a2 = a(bVar, str, null, false, jqi.a(this.i, "ultronReuseComponentWhenDelta", false) && jqf.a(bVar.z()));
            if (a2 != null && !a2.isEmpty()) {
                a(bVar, a2);
                c(bVar);
            } else {
                String h = bVar.h();
                UnifyLog.a(h, "ParseModule", "getComponentsByRoot output is empty", "rootComponentKey:" + str);
            }
            return a2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            n.a((b) null, list, this.g);
        }
    }

    public void a(b bVar, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96489a3", new Object[]{this, bVar, list});
        } else {
            n.a(bVar, list, this.g);
        }
    }

    private List<IDMComponent> b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e173fb96", new Object[]{this, bVar});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = bVar.n().getJSONArray("delta").iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                String string = jSONObject.getString("opType");
                String string2 = jSONObject.getString("target");
                String string3 = jSONObject.getString(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT);
                String string4 = jSONObject.getString("position");
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1335458389:
                        if (string.equals("delete")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (string.equals("insert")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1068795718:
                        if (string.equals("modify")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -934641255:
                        if (string.equals("reload")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1094496948:
                        if (string.equals("replace")) {
                            c2 = 0;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    a(bVar, string, string2, string3, string4, arrayList);
                } else if (c2 == 1) {
                    a(bVar, string, string2, string3, string4, arrayList, false);
                } else if (c2 == 2) {
                    b(bVar, string, string2, string3, string4, arrayList);
                } else if (c2 == 3) {
                    c(bVar, string, string2, string3, string4, arrayList);
                } else if (c2 == 4) {
                    a(bVar, string2, jSONObject.getJSONArray("operations"), arrayList);
                }
            }
        }
        bVar.H().addAll(arrayList);
        return bVar.b();
    }

    private void a(b bVar, String str, String str2, String str3, String str4, List<jok> list) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e647cb", new Object[]{this, bVar, str, str2, str3, str4, list});
            return;
        }
        List<IDMComponent> b = bVar.b();
        Map<String, DMComponent> map = bVar.c;
        DMComponent dMComponent = map.get(str2);
        if (dMComponent == null) {
            UnifyLog.a(bVar.h(), "ParseModule", "replaceOp target is null", new String[0]);
            bga.a.a(bVar.h(), "ParseModule.replaceOp", ErrorConstants.PARSE_DELTA_TARGET_NULL.errorCode(), ErrorConstants.PARSE_DELTA_TARGET_NULL.errorMessage());
            return;
        }
        DMComponent a2 = a(bVar, bVar.o().getJSONObject(str2), str2);
        DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
        if (dMComponent2 == null) {
            return;
        }
        int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
        if (indexOf == -1) {
            UnifyLog.a(bVar.h(), "ParseModule", "target component index is -1", new String[0]);
        }
        dMComponent2.getChildren().remove(indexOf);
        dMComponent2.getChildren().add(indexOf, a2);
        a2.setParent(dMComponent2);
        ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
        if (extMap2 != null && (extMap = a2.getExtMap()) != null) {
            for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                extMap.put(entry.getKey(), entry.getValue());
            }
        }
        String a3 = a(a2, dMComponent2);
        String b2 = b(a2, dMComponent2);
        a(a2, a3);
        b(a2, b2);
        jon jonVar = new jon();
        jonVar.a(a2);
        jonVar.b(dMComponent);
        jonVar.a(indexOf);
        list.add(jonVar);
        int indexOf2 = b.indexOf(dMComponent);
        b.remove(indexOf2);
        b.add(indexOf2, a2);
        map.put(str2, a2);
    }

    private void a(b bVar, String str, String str2, String str3, String str4, List<jok> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe36469", new Object[]{this, bVar, str, str2, str3, str4, list, new Boolean(z)});
            return;
        }
        List<IDMComponent> b = bVar.b();
        Map<String, DMComponent> map = bVar.c;
        DMComponent dMComponent = str4 != null ? map.get(str4) : null;
        JSONObject jSONObject = bVar.o().getJSONObject(str2);
        if (jSONObject == null) {
            bga.a.a(bVar.h(), "ParseModule.insertOp", ErrorConstants.PARSE_DELTA_TARGET_NULL.errorCode(), ErrorConstants.PARSE_DELTA_TARGET_NULL.errorMessage());
            return;
        }
        final DMComponent a2 = a(bVar, jSONObject, str2);
        DMComponent dMComponent2 = map.get(str3);
        if (dMComponent2 == null) {
            bga.a.a(bVar.h(), "ParseModule.insertOp", ErrorConstants.PARSE_DELTA_PARENT_NULL.errorCode(), ErrorConstants.PARSE_DELTA_PARENT_NULL.errorMessage());
            return;
        }
        int i = -1;
        if (dMComponent != null) {
            i = dMComponent2.getChildren().indexOf(dMComponent);
        }
        dMComponent2.getChildren().add(i + 1, a2);
        a2.setParent(dMComponent2);
        String a3 = a(a2, dMComponent2);
        String b2 = b(a2, dMComponent2);
        a(a2, a3);
        b(a2, b2);
        if (!z) {
            jom jomVar = new jom();
            jomVar.a(new ArrayList<IDMComponent>() { // from class: com.taobao.android.ultron.datamodel.imp.ParseModule$1
                {
                    add(a2);
                }
            });
            jomVar.a(dMComponent);
            jomVar.b(dMComponent2);
            list.add(jomVar);
        }
        String str5 = "null";
        if (dMComponent != null) {
            IDMComponent b3 = b(dMComponent, b);
            if (b3 != null && b.indexOf(b3) >= 0) {
                b.add(b.indexOf(b3) + 1, a2);
            } else {
                String h = bVar.h();
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("lastRender is not in renderComponent, lastRender : ");
                if (b3 != null) {
                    str5 = b3.getKey();
                }
                sb.append(str5);
                strArr[0] = sb.toString();
                UnifyLog.a(h, "ParseModule", "insertPosition isnot null", strArr);
            }
        } else {
            IDMComponent a4 = a(dMComponent2, b);
            if (a4 != null && b.indexOf(a4) >= 0) {
                b.add(b.indexOf(a4), a2);
            } else {
                String h2 = bVar.h();
                String[] strArr2 = new String[1];
                StringBuilder sb2 = new StringBuilder();
                sb2.append("firstRender : ");
                if (a4 != null) {
                    str5 = a4.getKey();
                }
                sb2.append(str5);
                strArr2[0] = sb2.toString();
                UnifyLog.a(h2, "ParseModule", "firstRender is not in renderComponent", strArr2);
            }
        }
        if (z && b.contains(dMComponent2)) {
            b.remove(dMComponent2);
        }
        map.put(str2, a2);
        if (bVar.w() == null || !bVar.w().containsKey(str2)) {
            return;
        }
        Iterator<Object> it = bVar.w().getJSONArray(str2).iterator();
        String str6 = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                String str7 = (String) next;
                a(bVar, str, str7, str2, str6, list, true);
                str6 = str7;
            }
        }
    }

    private void b(b bVar, String str, String str2, String str3, String str4, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5a84aa", new Object[]{this, bVar, str, str2, str3, str4, list});
            return;
        }
        List<IDMComponent> b = bVar.b();
        Map<String, DMComponent> map = bVar.c;
        DMComponent dMComponent = map.get(str2);
        if (dMComponent == null) {
            UnifyLog.a(bVar.h(), "ParseModule", "delete target is null", new String[0]);
            bga.a.a(bVar.h(), "ParseModule.deleteOp", ErrorConstants.PARSE_DELTA_TARGET_NULL.errorCode(), ErrorConstants.PARSE_DELTA_TARGET_NULL.errorMessage());
            return;
        }
        DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
        if (dMComponent2 == null) {
            UnifyLog.a(bVar.h(), "ParseModule", "delete target's parent is null", new String[0]);
            bga.a.a(bVar.h(), "ParseModule.deleteOp", ErrorConstants.PARSE_DELTA_PARENT_NULL.errorCode(), ErrorConstants.PARSE_DELTA_PARENT_NULL.errorMessage());
            return;
        }
        int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
        if (b.remove(dMComponent)) {
            jol jolVar = new jol();
            jolVar.a(dMComponent);
            jolVar.a(indexOf);
            list.add(jolVar);
        }
        map.remove(str2);
        dMComponent2.getChildren().remove(indexOf);
        dMComponent.setParent(null);
        bVar.c(str2, dMComponent2.componentKey);
        if (dMComponent.getChildren() == null) {
            return;
        }
        List<IDMComponent> children = dMComponent.getChildren();
        for (int size = children.size() - 1; size >= 0; size--) {
            b(bVar, str, children.get(size).getKey(), str2, str4, list);
        }
    }

    private void c(b bVar, String str, String str2, String str3, String str4, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cec189", new Object[]{this, bVar, str, str2, str3, str4, list});
            return;
        }
        bVar.b();
        DMComponent dMComponent = bVar.c.get(str2);
        if (dMComponent == null) {
            UnifyLog.a(bVar.h(), "ParseModule", "reload target is null", new String[0]);
            bga.a.a(bVar.h(), "ParseModule.reloadOp", ErrorConstants.PARSE_DELTA_TARGET_NULL.errorCode(), ErrorConstants.PARSE_DELTA_TARGET_NULL.errorMessage());
        }
        JSONObject jSONObject = bVar.o().getJSONObject(str2).getJSONObject("events");
        dMComponent.onReloadEvent(h(bVar, jSONObject));
        dMComponent.setEvents(jSONObject);
    }

    private void a(b bVar, String str, JSONArray jSONArray, List<jok> list) {
        ArrayMap<String, Object> extMap;
        Pattern pattern;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e217015", new Object[]{this, bVar, str, jSONArray2, list});
        } else if (jSONArray2 == null || jSONArray.isEmpty()) {
            UnifyLog.a(bVar.h(), "ParseModule", "modify operations is null", new String[0]);
        } else {
            Map<String, DMComponent> map = bVar.c;
            DMComponent dMComponent = map.get(str);
            if (dMComponent == null) {
                UnifyLog.a(bVar.h(), "ParseModule", "local target component is null", new String[0]);
                bga.a.a(bVar.h(), "ParseModule.modifyOp", ErrorConstants.PARSE_DELTA_TARGET_NULL.errorCode(), ErrorConstants.PARSE_DELTA_TARGET_NULL.errorMessage());
                return;
            }
            DMComponent a2 = a(dMComponent);
            if (a2 == null) {
                UnifyLog.a(bVar.h(), "ParseModule", "modify target component is null", new String[0]);
                return;
            }
            JSONObject jSONObject = bVar.o().getJSONObject(str);
            if (jSONObject == null) {
                UnifyLog.a(bVar.h(), "ParseModule", "modify source component is null", new String[0]);
                return;
            }
            JSONObject data = a2.getData();
            Pattern compile = Pattern.compile("[`${}]");
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("type");
                String string2 = jSONObject2.getString("target");
                String string3 = jSONObject2.getString("source");
                if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3)) {
                    pattern = compile;
                } else {
                    Matcher matcher = compile.matcher(string2);
                    Matcher matcher2 = compile.matcher(string3);
                    String trim = matcher.replaceAll("").trim();
                    String trim2 = matcher2.replaceAll("").trim();
                    pattern = compile;
                    boolean z = trim.startsWith("fields") || trim.startsWith("events");
                    boolean z2 = trim2.startsWith("fields") || trim2.startsWith("events");
                    if (!z || !z2) {
                        UnifyLog.a(bVar.h(), "ParseModule", "modify operations node path format is invalid ", new String[0]);
                        i++;
                        jSONArray2 = jSONArray;
                        compile = pattern;
                    } else {
                        a(data, trim.split("\\."), a(jSONObject, trim2.split("\\.")), string);
                    }
                }
                i++;
                jSONArray2 = jSONArray;
                compile = pattern;
            }
            a2.writeBackDataAndReloadEvent(data, false);
            bVar.o().put(str, (Object) a2.getData());
            DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
            if (dMComponent2 == null) {
                return;
            }
            int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
            if (indexOf == -1) {
                UnifyLog.a(bVar.h(), "ParseModule", "target component index is -1", new String[0]);
            }
            dMComponent2.getChildren().remove(indexOf);
            dMComponent2.getChildren().add(indexOf, a2);
            a2.setParent(dMComponent2);
            ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
            if (extMap2 != null && (extMap = a2.getExtMap()) != null) {
                for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                    extMap.put(entry.getKey(), entry.getValue());
                }
            }
            String a3 = a(a2, dMComponent2);
            String b = b(a2, dMComponent2);
            a(a2, a3);
            b(a2, b);
            jon jonVar = new jon();
            jonVar.a(a2);
            jonVar.b(dMComponent);
            jonVar.a(indexOf);
            list.add(jonVar);
            List<IDMComponent> b2 = bVar.b();
            int indexOf2 = b2.indexOf(dMComponent);
            b2.remove(indexOf2);
            b2.add(indexOf2, a2);
            map.put(str, a2);
        }
    }

    private DMComponent a(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("52a735d8", new Object[]{this, dMComponent});
        }
        try {
            return new DMComponent(JSONObject.parseObject(dMComponent.getData().toJSONString()), dMComponent.getContainerType(), JSONObject.parseObject(dMComponent.getContainerInfo().toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Object a(JSONObject jSONObject, String[] strArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e72ab7b", new Object[]{this, jSONObject, strArr});
        }
        while (strArr.length > 1) {
            String str = strArr[0];
            if (str.endsWith(riy.ARRAY_END_STR)) {
                int indexOf = str.indexOf(riy.ARRAY_START_STR);
                JSONArray jSONArray = jSONObject.getJSONArray(str.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str.substring(indexOf + 1, str.length() - 1));
                } catch (Throwable unused) {
                    i = 0;
                }
                if (i < jSONArray.size()) {
                    jSONObject = jSONArray.getJSONObject(i);
                    strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
                }
            } else {
                jSONObject = jSONObject.getJSONObject(str);
                strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
            }
        }
        return jSONObject.get(strArr[0]);
    }

    private void a(JSONObject jSONObject, String[] strArr, Object obj, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323167bd", new Object[]{this, jSONObject, strArr, obj, str});
        } else if (strArr.length == 1) {
            if ("remove".equals(str)) {
                jSONObject.remove(str);
            } else if (!"add".equals(str) && !"update".equals(str)) {
            } else {
                jSONObject.put(strArr[0], obj);
            }
        } else {
            String str2 = strArr[0];
            if (str2.endsWith(riy.ARRAY_END_STR)) {
                int indexOf = str2.indexOf(riy.ARRAY_START_STR);
                JSONArray jSONArray = jSONObject.getJSONArray(str2.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str2.substring(indexOf + 1, str2.length() - 1));
                } catch (Throwable unused) {
                }
                if (jSONArray == null || i >= jSONArray.size()) {
                    return;
                }
                a(jSONArray.getJSONObject(i), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
                return;
            }
            a(jSONObject.getJSONObject(str2), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
        }
    }

    private IDMComponent a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ab9f3461", new Object[]{this, iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList<IDMComponent> arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = jpv.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        for (IDMComponent iDMComponent2 : arrayList) {
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    private IDMComponent b(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("9ed12c00", new Object[]{this, iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = jpv.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size++) {
            IDMComponent iDMComponent2 = (IDMComponent) arrayList.get(size);
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.taobao.android.ultron.common.model.IDMComponent> e(com.taobao.android.ultron.datamodel.imp.b r19, com.alibaba.fastjson.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.imp.f.e(com.taobao.android.ultron.datamodel.imp.b, com.alibaba.fastjson.JSONObject):java.util.List");
    }

    @Override // tb.jou
    public void b(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1584e7f", new Object[]{this, bVar, jSONObject});
            return;
        }
        if (this.f == null) {
            z = false;
        }
        if (!z) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.containsKey("extendBlock") ? jSONObject2.getBoolean("extendBlock").booleanValue() : false) {
                    arrayList.add(str);
                }
            }
        }
        Map<String, ExtendBlock> A = bVar.A();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            if (A.containsKey(str2) && !arrayList2.contains(str2)) {
                arrayList2.add(str2);
            }
        }
        this.f.a(arrayList2);
    }

    @Override // tb.jou
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.b = iDMComponent;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{this, bVar});
            return;
        }
        String G = bVar.G();
        JSONObject n = bVar.n();
        if (StringUtils.isEmpty(G)) {
            G = n.getString("root");
        }
        if (StringUtils.isEmpty(G)) {
            bga.a.a(bVar.h(), "FullResponseParse", ErrorConstants.PROTOCOL_ROOT_KEY_EMPTY.errorCode(), ErrorConstants.PROTOCOL_ROOT_KEY_EMPTY.errorMessage());
        } else {
            bVar.a(a(bVar, G));
        }
    }

    @Override // tb.jou
    public void c(b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d1a480", new Object[]{this, bVar, jSONObject});
        } else if (jSONObject != null && bVar != null) {
            if ((bVar.f("container") && !bVar.j().isEmpty() && jqi.a(bVar.h(), "ultronParseContainerUseCacheSwitch", true)) || (jSONObject2 = jSONObject.getJSONObject("container")) == null || (jSONArray = jSONObject2.getJSONArray("data")) == null) {
                return;
            }
            List<com.taobao.android.ultron.common.model.a> d2 = bVar.d();
            if (d2 == null) {
                d2 = new ArrayList<>();
                bVar.c(d2);
            }
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    a(d2, new com.taobao.android.ultron.common.model.a(jSONObject3));
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("type");
                    if (jSONArray2 != null) {
                        int size2 = jSONArray2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            bVar.j().put(jSONArray2.getString(i2), jSONObject3);
                        }
                    }
                }
            }
        }
    }

    private void a(List<com.taobao.android.ultron.common.model.a> list, com.taobao.android.ultron.common.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce6a249", new Object[]{this, list, aVar});
            return;
        }
        for (com.taobao.android.ultron.common.model.a aVar2 : list) {
            if (StringUtils.isStringEqual(aVar2.b, aVar.b) && StringUtils.isStringEqual(aVar2.c, aVar.c) && StringUtils.isStringEqual(aVar2.e, aVar.e)) {
                return;
            }
        }
        list.add(aVar);
    }

    private String b(b bVar, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c1dbc3e5", new Object[]{this, bVar, str}) : (str == null || (jSONObject = bVar.j().get(str)) == null) ? "native" : jSONObject.getString("containerType");
    }

    private JSONObject c(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8f65155a", new Object[]{this, bVar, str});
        }
        if (str != null) {
            return bVar.j().get(str);
        }
        return null;
    }

    private void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832ee470", new Object[]{this, bVar});
            return;
        }
        Map<String, DMComponent> u = bVar.u();
        JSONArray r = bVar.r();
        if (r == null) {
            r = new JSONArray();
            bVar.p().put("request", (Object) r);
        }
        Iterator<Object> it = r.iterator();
        while (it.hasNext()) {
            DMComponent dMComponent = u.get((String) it.next());
            if (dMComponent != null) {
                dMComponent.setLinkageType(LinkageType.REQUEST);
            }
        }
    }

    private void f(b bVar, JSONObject jSONObject) {
        JSONObject o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("333da683", new Object[]{this, bVar, jSONObject});
        } else if (bVar == null || jSONObject == null || (o = bVar.o()) == null) {
        } else {
            o.putAll(jSONObject);
        }
    }

    private List<IDMComponent> g(b bVar, JSONObject jSONObject) {
        String[] a2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fadbd43", new Object[]{this, bVar, jSONObject});
        }
        List<IDMComponent> b = bVar.b();
        Map<String, DMComponent> v = bVar.v();
        if (jSONObject == null || v == null || v.size() == 0) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 == null) {
            bga.a.a(bVar.h(), "AdjustResponseParse", ErrorConstants.PROTOCOL_DATA_EMPTY.errorCode(), ErrorConstants.PROTOCOL_DATA_EMPTY.errorMessage());
            return b;
        }
        d(bVar, jSONObject3);
        f(bVar, jSONObject3);
        for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject4 = (JSONObject) entry.getValue();
            DMComponent dMComponent = v.get(key);
            if (dMComponent != null) {
                try {
                    String string = dMComponent.getFields().getString("cornerType");
                    if (!StringUtils.isEmpty(string) && jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("fields")) != null) {
                        jSONObject2.put("cornerType", (Object) string);
                    }
                    if (key != null && this.f15780a && (a2 = a(key)) != null && a2.length == 2) {
                        jSONObject4.put("tag", (Object) a2[0]);
                        jSONObject4.put("id", (Object) a2[1]);
                    }
                    dMComponent.onReload(bVar, jSONObject4);
                    dMComponent.onReloadEvent(h(bVar, jSONObject4.getJSONObject("events")));
                } catch (Throwable th) {
                    bga.a.a(StringUtils.isEmpty(bVar.h()) ? "ultron" : bVar.h(), "parseAdjustResponseJson", th);
                }
            }
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("linkage");
        if (jSONObject5 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject5.entrySet()) {
                if ("common".equals(entry2.getKey())) {
                    JSONObject jSONObject6 = (JSONObject) entry2.getValue();
                    if (jSONObject6 != null) {
                        JSONObject q = bVar.q();
                        if (q != null) {
                            for (Map.Entry<String, Object> entry3 : jSONObject6.entrySet()) {
                                q.put(entry3.getKey(), entry3.getValue());
                            }
                        } else {
                            bVar.l(jSONObject6);
                        }
                    }
                } else {
                    bVar.p().put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        c(bVar);
        return b;
    }

    public DMComponent a(b bVar, JSONObject jSONObject, String str) {
        String[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("3201be40", new Object[]{this, bVar, jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        if (str != null && this.f15780a && (a2 = a(str)) != null && a2.length == 2) {
            jSONObject.put("tag", (Object) a2[0]);
            jSONObject.put("id", (Object) a2[1]);
        }
        String string = jSONObject.getString("type");
        jSONObject.getString("tag");
        DMComponent dMComponent = new DMComponent(jSONObject, b(bVar, string), c(bVar, string), h(bVar, jSONObject.getJSONObject("events")));
        dMComponent.setComponentKey(str);
        return dMComponent;
    }

    private DMComponent a(b bVar, JSONObject jSONObject, String str, DMComponent dMComponent) {
        String[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("8cec8f78", new Object[]{this, bVar, jSONObject, str, dMComponent});
        }
        if (jSONObject == null || dMComponent == null) {
            return null;
        }
        if (str != null && this.f15780a && (a2 = a(str)) != null && a2.length == 2) {
            jSONObject.put("tag", (Object) a2[0]);
            jSONObject.put("id", (Object) a2[1]);
        }
        String string = jSONObject.getString("type");
        String b = b(bVar, string);
        JSONObject c2 = c(bVar, string);
        Map<String, List<com.taobao.android.ultron.common.model.b>> h = h(bVar, jSONObject.getJSONObject("events"));
        dMComponent.onReload(bVar, jSONObject);
        dMComponent.onReloadEvent(h);
        dMComponent.setContainerType(b);
        dMComponent.setContainerInfo(c2);
        dMComponent.setComponentKey(str);
        if (jqi.a(bVar.h(), "ultronReloadComponentClearExtMap", false)) {
            dMComponent.getExtMap().clear();
        }
        return dMComponent;
    }

    public static String[] a(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || (indexOf = str.indexOf("_")) <= 0 || indexOf >= str.length() - 1) {
            return null;
        }
        return new String[]{str.substring(0, indexOf), str.substring(indexOf + 1, str.length())};
    }

    private Map<String, List<com.taobao.android.ultron.common.model.b>> h(b bVar, JSONObject jSONObject) {
        com.taobao.android.ultron.common.model.b i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4ce917fa", new Object[]{this, bVar, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!StringUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (i = i(bVar, (JSONObject) next)) != null) {
                        arrayList.add(i);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    private com.taobao.android.ultron.common.model.b i(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("4e5bd1df", new Object[]{this, bVar, jSONObject});
        }
        List<IDMComponent> list = null;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        String string2 = jSONObject2 == null ? "" : jSONObject2.getString("nextRenderRoot");
        if (this.e && !StringUtils.isEmpty(string2)) {
            list = a(bVar, string2);
        }
        return new DMEvent(string, jSONObject2, list, jSONObject.getIntValue("option"));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.taobao.android.ultron.common.model.IDMComponent> a(com.taobao.android.ultron.datamodel.imp.b r19, java.lang.String r20, com.taobao.android.ultron.datamodel.imp.DMComponent r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.imp.f.a(com.taobao.android.ultron.datamodel.imp.b, java.lang.String, com.taobao.android.ultron.datamodel.imp.DMComponent, boolean, boolean):java.util.List");
    }

    private String a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c42d0ab8", new Object[]{this, iDMComponent, iDMComponent2});
        }
        String str = null;
        if (iDMComponent != null && iDMComponent.getFields() != null && "true".equals(iDMComponent.getCardGroup())) {
            str = iDMComponent.getKey();
        }
        return (iDMComponent2 == null || iDMComponent2.getExtMap() == null || iDMComponent2.getExtMap().get(c) == null || StringUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get(c)))) ? str : (String) iDMComponent2.getExtMap().get(c);
    }

    private String b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2bf9697", new Object[]{this, iDMComponent, iDMComponent2});
        }
        String str = null;
        if (iDMComponent != null && iDMComponent.getFields() != null && iDMComponent.getPosition() != null) {
            str = iDMComponent.getPosition();
        }
        return (iDMComponent2 == null || iDMComponent2.getExtMap() == null || iDMComponent2.getExtMap().get(d) == null || StringUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get(d)))) ? str : (String) iDMComponent2.getExtMap().get(d);
    }

    private void a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a050eeb6", new Object[]{this, iDMComponent, str});
        } else if (StringUtils.isEmpty(str) || iDMComponent.getExtMap() == null) {
        } else {
            iDMComponent.getExtMap().put(c, str);
        }
    }

    private void b(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2681c15", new Object[]{this, iDMComponent, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            iDMComponent.getExtMap().put(d, str);
        }
    }

    public static String b(IDMComponent iDMComponent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("759a0cf5", new Object[]{iDMComponent});
        }
        if (iDMComponent != null && iDMComponent.getExtMap() != null && (obj = iDMComponent.getExtMap().get(d)) != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    @Override // tb.jou
    public void d(b bVar, JSONObject jSONObject) {
        c t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724afa81", new Object[]{this, bVar, jSONObject});
        } else if (bVar == null || (t = bVar.t()) == null) {
        } else {
            t.b().a(jSONObject);
        }
    }
}
