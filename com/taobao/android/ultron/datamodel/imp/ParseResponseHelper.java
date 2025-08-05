package com.taobao.android.ultron.datamodel.imp;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.joh;
import tb.joj;
import tb.kge;

/* loaded from: classes6.dex */
public class ParseResponseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f15769a;
    private boolean b = false;
    private Map<String, Object> c = new HashMap();
    private AsyncTask<Void, Void, joh> d;
    private volatile joh e;

    /* loaded from: classes6.dex */
    public static class TemplateInfo implements Serializable {
        public String id;
        public String version;

        static {
            kge.a(-519302203);
            kge.a(1028243835);
        }

        public TemplateInfo(String str, String str2) {
            this.id = str;
            this.version = str2;
        }
    }

    static {
        kge.a(1156250151);
    }

    public static /* synthetic */ joh a(ParseResponseHelper parseResponseHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (joh) ipChange.ipc$dispatch("69438d91", new Object[]{parseResponseHelper}) : parseResponseHelper.e;
    }

    public static /* synthetic */ joh a(ParseResponseHelper parseResponseHelper, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (joh) ipChange.ipc$dispatch("7c9f75d", new Object[]{parseResponseHelper, jSONObject, jSONArray}) : parseResponseHelper.a(jSONObject, jSONArray);
    }

    public static /* synthetic */ joh a(ParseResponseHelper parseResponseHelper, joh johVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (joh) ipChange.ipc$dispatch("3f713b24", new Object[]{parseResponseHelper, johVar});
        }
        parseResponseHelper.e = johVar;
        return johVar;
    }

    public ParseResponseHelper(b bVar) {
        this.f15769a = bVar;
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            a(mtopResponse.getBytedata());
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.e != null) {
            a(jSONObject, this.e);
        } else {
            b(jSONObject);
        }
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.b) {
            for (JSONObject jSONObject : list) {
                new g().a(this.f15769a, jSONObject, null);
            }
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        b bVar = this.f15769a;
        if (bVar == null || jSONObject == null) {
            return;
        }
        c t = bVar.t();
        if (t == null) {
            t = new c(this.f15769a.f);
            this.f15769a.a(t);
        }
        if (!jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
            jSONObject = jSONObject.getJSONObject("data");
        }
        this.b = t.a(this.f15769a, jSONObject);
        this.c.put("protocolVersion", this.f15769a.y());
        if (jSONObject == null) {
            this.c.put("reload", true);
        } else {
            this.c.put("reload", Boolean.valueOf(Boolean.TRUE.toString().equalsIgnoreCase(jSONObject.getString("reload"))));
        }
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (this.f15769a == null || bArr == null) {
        } else {
            a((JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]));
        }
    }

    public boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.size() != 1 || !jSONObject.containsKey("linkage")) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        this.f15769a.m(jSONObject2);
        this.f15769a.l(jSONObject2.getJSONObject("common"));
        this.b = true;
        return true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.c;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.c.put(str, obj);
        }
    }

    private String a(String str, Map<String, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        JSONObject jSONObject = map.get(str);
        String str2 = null;
        if (jSONObject != null) {
            str2 = jSONObject.getString("containerType");
        }
        return TextUtils.isEmpty(str2) ? "native" : str2;
    }

    private Map<String, List<com.taobao.android.ultron.common.model.b>> e(JSONObject jSONObject) {
        com.taobao.android.ultron.common.model.b f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e2b8a939", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (f = f((JSONObject) next)) != null) {
                        arrayList.add(f);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    private com.taobao.android.ultron.common.model.b f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("fc0eb462", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option"));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [com.taobao.android.ultron.datamodel.imp.ParseResponseHelper$1] */
    public void a(Context context, String str, final JSONObject jSONObject, boolean z, boolean z2) {
        String str2;
        boolean z3;
        boolean z4;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eee306", new Object[]{this, context, str, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (jSONObject == null || !z) {
        } else {
            JSONObject jSONObject3 = null;
            JSONObject jSONObject4 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            if (jSONObject4 != null && !jSONObject4.isEmpty() && (jSONObject2 = jSONObject4.getJSONObject("meta")) != null) {
                jSONObject3 = jSONObject2.getJSONObject("template");
            }
            if (jSONObject3 == null) {
                return;
            }
            final joj a2 = joj.a(context, str);
            final String string = jSONObject3.getString("id");
            final String string2 = jSONObject3.getString("version");
            if (string == null) {
                return;
            }
            if (string2 != null) {
                str2 = string + "_$_" + string2;
            } else {
                str2 = string;
            }
            final JSONArray jSONArray = jSONObject3.getJSONArray("cacheFields");
            if (TextUtils.isEmpty(str2) || jSONArray == null) {
                return;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                } else if (!jSONObject.containsKey(it.next())) {
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                JSONObject b = a2.b(str2);
                if (b != null) {
                    Iterator<Object> it2 = jSONArray.iterator();
                    z4 = false;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!jSONObject.containsKey(next)) {
                            Object obj = b.get(next);
                            if (obj != null) {
                                jSONObject.put((String) next, obj);
                            } else {
                                z4 = true;
                            }
                        }
                    }
                } else {
                    z4 = true;
                }
                if (z4) {
                    UnifyLog.a(this.f15769a.h(), "ParseResponseHelper", "processCache dataWrong", new String[0]);
                    a2.c(str2);
                }
            } else {
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Object> it3 = jSONArray.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    jSONObject5.put((String) next2, jSONObject.get(next2));
                }
                final String jSONString = jSONObject5.toJSONString();
                final String str3 = str2;
                new AsyncTask() { // from class: com.taobao.android.ultron.datamodel.imp.ParseResponseHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.AsyncTask
                    public Object doInBackground(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                        }
                        a2.a(str3, jSONString);
                        UnifyLog.c("ParseResponseHelper", "processCache save cache");
                        List<String> a3 = a2.a();
                        if (a3 == null) {
                            return null;
                        }
                        for (String str4 : new ArrayList(a3)) {
                            String[] split = str4.split("_\\$_");
                            if (split.length == 2 && TextUtils.equals(split[0], string) && !TextUtils.equals(split[1], string2)) {
                                a2.c(str4);
                                a2.d(str4);
                                UnifyLog.c("ParseResponseHelper", "processCache deleteTemplateById:" + str4);
                            }
                        }
                        return null;
                    }
                }.execute(new Object[0]);
            }
            if (!z2) {
                return;
            }
            this.e = a2.e(str2);
            if (this.e != null) {
                return;
            }
            final String str4 = str2;
            this.d = new AsyncTask<Void, Void, joh>() { // from class: com.taobao.android.ultron.datamodel.imp.ParseResponseHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.joh] */
                @Override // android.os.AsyncTask
                public /* synthetic */ joh doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public joh a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (joh) ipChange2.ipc$dispatch("d68af94f", new Object[]{this, voidArr});
                    }
                    ParseResponseHelper parseResponseHelper = ParseResponseHelper.this;
                    ParseResponseHelper.a(parseResponseHelper, ParseResponseHelper.a(parseResponseHelper, jSONObject, jSONArray));
                    if (ParseResponseHelper.a(ParseResponseHelper.this) != null) {
                        a2.a(str4, ParseResponseHelper.a(ParseResponseHelper.this));
                    }
                    return ParseResponseHelper.a(ParseResponseHelper.this);
                }
            };
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    private joh a(JSONObject jSONObject, JSONArray jSONArray) {
        String key;
        String[] a2;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (joh) ipChange.ipc$dispatch("e3d1d873", new Object[]{this, jSONObject, jSONArray});
        }
        joh johVar = new joh();
        if (jSONObject != null && jSONArray != null && !jSONArray.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject("container");
            if (jSONObject2 != null && (jSONArray2 = jSONObject2.getJSONArray("data")) != null) {
                int size = jSONArray2.size();
                StringBuilder sb = new StringBuilder("\n");
                int i2 = 0;
                while (i2 < size) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    if (jSONObject3 != null) {
                        arrayList.add(new com.taobao.android.ultron.common.model.a(jSONObject3));
                        JSONArray jSONArray4 = jSONObject3.getJSONArray("type");
                        jSONArray3 = jSONArray2;
                        int size2 = jSONArray4.size();
                        i = size;
                        int i3 = 0;
                        while (i3 < size2) {
                            int i4 = size2;
                            String string = jSONArray4.getString(i3);
                            sb.append("componentType:");
                            sb.append(string);
                            sb.append(", container:");
                            sb.append(jSONObject3.toString());
                            sb.append("\n");
                            hashMap.put(string, jSONObject3);
                            i3++;
                            size2 = i4;
                            jSONArray4 = jSONArray4;
                        }
                    } else {
                        jSONArray3 = jSONArray2;
                        i = size;
                    }
                    i2++;
                    jSONArray2 = jSONArray3;
                    size = i;
                }
            }
            if (jSONArray.contains("container")) {
                johVar.a(arrayList);
                johVar.a(hashMap);
            }
            if (jSONArray.contains("data")) {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject4 = jSONObject.getJSONObject("data");
                if (jSONObject4 != null) {
                    boolean a3 = a(i.FEATURE_TAG_ID);
                    for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                        if (entry != null && (key = entry.getKey()) != null) {
                            Object value = entry.getValue();
                            if (value instanceof JSONObject) {
                                if (key != null && a3 && (a2 = f.a(key)) != null) {
                                    if (a2.length == 2) {
                                        jSONObject.put("tag", (Object) a2[0]);
                                        jSONObject.put("id", (Object) a2[1]);
                                        JSONObject jSONObject5 = (JSONObject) value;
                                        String string2 = jSONObject5.getString("type");
                                        jSONObject5.getString("tag");
                                        DMComponent dMComponent = new DMComponent(jSONObject5, a(string2, (Map<String, JSONObject>) hashMap), hashMap.get(string2), e(jSONObject.getJSONObject("events")));
                                        dMComponent.setComponentKey(key);
                                        hashMap2.put(key, dMComponent);
                                    }
                                }
                                JSONObject jSONObject52 = (JSONObject) value;
                                String string22 = jSONObject52.getString("type");
                                jSONObject52.getString("tag");
                                DMComponent dMComponent2 = new DMComponent(jSONObject52, a(string22, (Map<String, JSONObject>) hashMap), hashMap.get(string22), e(jSONObject.getJSONObject("events")));
                                dMComponent2.setComponentKey(key);
                                hashMap2.put(key, dMComponent2);
                            }
                        }
                    }
                }
                johVar.b(hashMap2);
            }
        }
        return johVar;
    }

    public void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT) || (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) == null) {
        } else {
            String string = jSONObject2.getString("features");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f15769a.g(string);
        }
    }

    public boolean a(BigInteger bigInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eeb9323", new Object[]{this, bigInteger})).booleanValue();
        }
        if (this.f15769a.F() != null) {
            return i.a(new BigInteger(this.f15769a.F()), bigInteger);
        }
        return false;
    }

    public void a(JSONObject jSONObject, joh johVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154c8755", new Object[]{this, jSONObject, johVar});
            return;
        }
        b bVar = this.f15769a;
        if (bVar == null || jSONObject == null) {
            return;
        }
        c t = bVar.t();
        if (t == null) {
            t = new c(this.f15769a.f);
            this.f15769a.a(t);
        }
        if (johVar != null) {
            Map<String, DMComponent> b = johVar.b();
            List<com.taobao.android.ultron.common.model.a> c = johVar.c();
            Map<String, JSONObject> a2 = johVar.a();
            if (b != null) {
                this.f15769a.u().putAll(b);
                this.f15769a.a("data");
            }
            if (c != null) {
                this.f15769a.c(c);
                this.f15769a.a("container");
            }
            if (a2 != null) {
                this.f15769a.a(a2);
                this.f15769a.a("container");
            }
        } else {
            this.f15769a.a((String[]) null);
        }
        if (!jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
            jSONObject = jSONObject.getJSONObject("data");
        }
        this.b = t.a(this.f15769a, jSONObject);
        this.c.put("protocolVersion", this.f15769a.y());
        if (jSONObject == null) {
            this.c.put("reload", true);
        } else {
            this.c.put("reload", Boolean.valueOf(Boolean.TRUE.toString().equalsIgnoreCase(jSONObject.getString("reload"))));
        }
    }

    public static List<TemplateInfo> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("42cb42dd", new Object[]{context, str});
        }
        List<String> a2 = joj.a(context, str).a();
        if (a2 != null) {
            ArrayList arrayList = new ArrayList(a2.size());
            for (String str2 : a2) {
                String[] split = str2.split("_\\$_");
                if (split.length > 0) {
                    arrayList.add(new TemplateInfo(split[0], split.length == 2 ? split[1] : null));
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
}
