package com.taobao.android.detail.core.performance.preload.core.task;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PreloadTaskEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME = "bizName";
    private static final String FROM = "from";
    private static final String ID = "id";
    private static final String ITEMS = "items";
    public static final String PAGE_DETAIL = "page_detail";
    private static final String PAGE_INDEX = "pageIndex";
    private static final String PAGE_TOKEN = "pageToken";
    private static final String PRELOAD_TYPE = "preloadType";
    private static final String SOURCE_FROM = "sourceFrom";
    private static final String TAG = "PreloadTaskEntity";
    public String bizName;
    public ArrayList<a> items;
    public String key;
    public String pageIndex;
    public String pageToken;
    public String preloadType;
    public String sourceFrom;

    static {
        kge.a(-723858579);
        kge.a(1028243835);
    }

    public PreloadTaskEntity() {
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity");
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.bizName + "_" + this.sourceFrom;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9788a;
        public String b;
        public Map<String, String> c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;

        static {
            kge.a(1196068362);
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("961814d3", new Object[]{jSONObject});
            }
            a aVar = new a();
            String string = jSONObject.getString("url");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
            String string2 = jSONObject.getString("itemId");
            String string3 = jSONObject.getString("itemIds");
            if (!TextUtils.isEmpty(string)) {
                aVar.d = string;
                aVar.c = p.a(string);
                if (TextUtils.isEmpty(string2)) {
                    aVar.e = a(aVar.c);
                } else {
                    aVar.e = string2;
                }
            } else if (jSONObject2 != null) {
                aVar.c = (Map) JSONObject.toJavaObject(jSONObject2, Map.class);
                aVar.e = jSONObject.getString("itemId");
            } else if (string2 != null) {
                aVar.e = jSONObject.getString("itemId");
            } else if (!TextUtils.isEmpty(string3)) {
                aVar.f = jSONObject.getString("itemIds");
            }
            return aVar;
        }

        public static String a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
            }
            if (map == null) {
                return "";
            }
            String str = map.get("id");
            return TextUtils.isEmpty(str) ? map.get("itemId") : str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Item{bizName='" + this.f9788a + "', sourceFrom='" + this.b + "', queryParams=" + this.c + ", queryUrl='" + this.d + "', itemId='" + this.e + "', itemIds='" + this.f + "'}";
        }

        public boolean equals(Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                String str2 = this.f9788a;
                if (str2 != null && str2.equals(aVar.f9788a) && (str = this.e) != null && str.equals(aVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f9788a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            String str2 = this.e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    public static PreloadTaskEntity parser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("ce39448", new Object[]{str});
        }
        try {
            PreloadTaskEntity preloadTaskEntity = new PreloadTaskEntity();
            JSONObject parseObject = JSONObject.parseObject(str);
            preloadTaskEntity.bizName = parseObject.getString("bizName");
            preloadTaskEntity.preloadType = parseObject.getString("preloadType");
            if (TextUtils.isEmpty(preloadTaskEntity.bizName)) {
                preloadTaskEntity.bizName = "page_detail";
            }
            preloadTaskEntity.sourceFrom = parseObject.getString(SOURCE_FROM);
            preloadTaskEntity.pageIndex = parseObject.getString("pageIndex");
            preloadTaskEntity.pageToken = parseObject.getString(PAGE_TOKEN);
            JSONArray jSONArray = parseObject.getJSONArray("items");
            int size = jSONArray == null ? 0 : jSONArray.size();
            ArrayList<a> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                a a2 = a.a(jSONArray.getJSONObject(i));
                if (TextUtils.isEmpty(a2.e)) {
                    ecg.d(preloadTaskEntity.sourceFrom, preloadTaskEntity.preloadType);
                } else {
                    a2.f9788a = preloadTaskEntity.bizName;
                    a2.h = preloadTaskEntity.preloadType;
                    a2.b = preloadTaskEntity.sourceFrom;
                    a2.g = preloadTaskEntity.pageToken;
                    if (TextUtils.isEmpty(a2.f) && a2.c == null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("from", a2.b);
                        hashMap.put("id", a2.e);
                        if (!TextUtils.isEmpty(a2.h)) {
                            hashMap.put("preloadType", a2.h);
                        }
                        a2.c = hashMap;
                    }
                    if (TextUtils.isEmpty(a2.f)) {
                        arrayList.add(a2);
                    } else {
                        splitItemIds(a2, arrayList);
                    }
                }
            }
            preloadTaskEntity.items = arrayList;
            return preloadTaskEntity;
        } catch (Exception e) {
            i.a(l.a(TAG), "PreloadTaskEntity parser error", e);
            return emptyEntity();
        }
    }

    private static void splitItemIds(a aVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed526f93", new Object[]{aVar, arrayList});
            return;
        }
        String[] split = aVar.f.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                a aVar2 = new a();
                aVar2.e = split[i];
                aVar2.f9788a = aVar.f9788a;
                aVar2.b = aVar.b;
                HashMap hashMap = new HashMap();
                hashMap.put("from", aVar2.b);
                hashMap.put("id", aVar2.e);
                if (!TextUtils.isEmpty(aVar.h)) {
                    hashMap.put("preloadType", aVar.h);
                }
                aVar2.c = hashMap;
                arrayList.add(aVar2);
            }
        }
    }

    public static PreloadTaskEntity emptyEntity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadTaskEntity) ipChange.ipc$dispatch("b559aac1", new Object[0]) : new PreloadTaskEntity();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTaskEntity{bizName='" + this.bizName + "', sourceFrom='" + this.sourceFrom + "', items=" + this.items + ", key='" + this.key + "', pageIndex='" + this.pageIndex + "', pageToken='" + this.pageToken + "'}";
    }

    public boolean isContainsItem(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb4ac5ac", new Object[]{this, aVar})).booleanValue();
        }
        ArrayList<a> arrayList = this.items;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.items.contains(aVar);
        }
        return false;
    }

    public String getItemsSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c5adaae", new Object[]{this});
        }
        ArrayList<a> arrayList = this.items;
        return (arrayList == null || arrayList.isEmpty()) ? "0" : String.valueOf(this.items.size());
    }

    public String getItemsId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae010f54", new Object[]{this});
        }
        ArrayList<a> arrayList = this.items;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<a> it = this.items.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().e);
            stringBuffer.append(",");
        }
        return stringBuffer.toString();
    }

    public boolean isNavPreload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc9b48bb", new Object[]{this})).booleanValue() : "nav".equals(this.preloadType);
    }
}
