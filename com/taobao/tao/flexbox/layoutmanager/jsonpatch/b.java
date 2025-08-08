package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.ohe;
import tb.riy;

/* loaded from: classes8.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSON f20414a;
    private EnumSet<CompatibilityFlags> b;

    static {
        kge.a(-249783986);
        kge.a(-1248613334);
    }

    public b(JSON json, EnumSet<CompatibilityFlags> enumSet) {
        this.f20414a = json;
        this.b = enumSet;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jsonpatch.d
    public boolean a(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{this, list, list2})).booleanValue();
        }
        JSON a2 = a(list, Operation.MOVE);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        return a(list) | a(list2, a2 instanceof JSONArray ? ((JSONArray) a2).get(Integer.parseInt(replaceAll)) : ((JSONObject) a2).get(replaceAll));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jsonpatch.d
    public boolean b(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b37b7cf", new Object[]{this, list, list2})).booleanValue();
        }
        JSON a2 = a(list, Operation.COPY);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        return a(list2, a2 instanceof JSONArray ? ((JSONArray) a2).get(Integer.parseInt(replaceAll)) : ((JSONObject) a2).get(replaceAll));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jsonpatch.d
    public boolean a(List<String> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeecd4f9", new Object[]{this, list, obj})).booleanValue();
        }
        if (list.isEmpty()) {
            a(Operation.ADD, "path is empty , path : ");
            return false;
        }
        JSON a2 = a(list, Operation.ADD);
        if (list.get(list.size() - 1).replaceAll("\"", "").equals("") && list.size() == 1) {
            this.f20414a = (JSON) obj;
            return true;
        } else if (a2 instanceof JSONArray) {
            a(list, obj, (JSONArray) a2);
            return true;
        } else {
            return a(list, (JSONObject) a2, obj);
        }
    }

    private boolean a(List<String> list, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c3530d7", new Object[]{this, list, jSONObject, obj})).booleanValue() : !a(jSONObject.put(list.get(list.size() - 1).replaceAll("\"", ""), obj), obj);
    }

    private boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if ((obj instanceof CharSequence) && obj2 == null) {
            return StringUtils.isEmpty((CharSequence) obj);
        }
        if ((obj2 instanceof CharSequence) && obj == null) {
            return StringUtils.isEmpty((CharSequence) obj2);
        }
        return false;
    }

    private void a(List<String> list, Object obj, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b519a1d", new Object[]{this, list, obj, jSONArray});
            return;
        }
        String str = list.get(list.size() - 1);
        if ("-".equals(str)) {
            jSONArray.add(obj);
        } else {
            jSONArray.add(a(str.replaceAll("\"", ""), jSONArray.size(), false), obj);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jsonpatch.d
    public boolean b(List<String> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7edcc3a", new Object[]{this, list, obj})).booleanValue();
        }
        if (list.isEmpty()) {
            a(Operation.REPLACE, "path is empty");
            return false;
        }
        JSON a2 = a(list, Operation.REPLACE);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        if ((replaceAll == null || replaceAll.length() == 0) && list.size() == 1) {
            this.f20414a = (JSON) obj;
            return true;
        } else if (a2 instanceof JSONObject) {
            return !a(((JSONObject) a2).put(replaceAll, obj), obj);
        } else if (a2 instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) a2;
            return !a(jSONArray.set(a(replaceAll, jSONArray.size() - 1, false), obj), obj);
        } else {
            Operation operation = Operation.REPLACE;
            a(operation, "noSuchPath in source, path provided : " + b(list));
            return false;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.jsonpatch.d
    public boolean a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (list.isEmpty()) {
            a(Operation.REMOVE, "path is empty");
            return false;
        }
        JSON a2 = a(list, Operation.REMOVE);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        if (a2 instanceof JSONObject) {
            Object remove = ((JSONObject) a2).remove(replaceAll);
            return remove != null && (!(remove instanceof CharSequence) || !StringUtils.isEmpty((CharSequence) remove));
        } else if (a2 instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) a2;
            jSONArray.mo1572remove(a(replaceAll, jSONArray.size() - 1, this.b.contains(CompatibilityFlags.REMOVE_NONE_EXISTING_ARRAY_ELEMENT)));
            return true;
        } else {
            Operation operation = Operation.REMOVE;
            a(operation, "noSuchPath in source, path provided : " + b(list));
            return false;
        }
    }

    private void a(Operation operation, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec61d52", new Object[]{this, operation, str});
            return;
        }
        throw new JsonPatchApplicationException(riy.ARRAY_START_STR + operation + " Operation] " + str);
    }

    private JSON a(List<String> list, Operation operation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("7724a798", new Object[]{this, list, operation});
        }
        JSON json = (JSON) a(this.f20414a, list.subList(0, list.size() - 1), 1);
        if (json == null) {
            a(operation, "noSuchPath in source, path provided: " + b(list));
        }
        return json;
    }

    private Object a(Object obj, List<String> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6efdbe84", new Object[]{this, obj, list, new Integer(i)});
        }
        if (i >= list.size()) {
            return obj;
        }
        String str = list.get(i);
        if (obj instanceof JSONArray) {
            Object obj2 = ((JSONArray) obj).get(Integer.parseInt(str.replaceAll("\"", "")));
            if (obj2 != null) {
                return a(obj2, list, i + 1);
            }
            return null;
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.containsKey(str)) {
                return null;
            }
            return a(jSONObject.get(str), list, i + 1);
        }
    }

    private int a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352a7d6", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0) {
                throw new JsonPatchApplicationException("index Out of bound, index is negative");
            }
            if (parseInt <= i || z) {
                return parseInt;
            }
            throw new JsonPatchApplicationException("index Out of bound, index is greater than " + i);
        } catch (NumberFormatException unused) {
            throw new JsonPatchApplicationException("Object operation on array target");
        }
    }

    private static String b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{list});
        }
        ohe.a a2 = ohe.a();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            a2.a(it.next() + "/");
        }
        return a2.toString();
    }
}
