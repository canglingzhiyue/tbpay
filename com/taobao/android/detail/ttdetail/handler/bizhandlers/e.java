package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncModule;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustState";
    public static final String KEY_BE_REPLACED = "beReplaced";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_TARGET_REPLACEMENT = "targetReplacement";
    public static final String KEY_TO_REPLACE = "toReplace";

    /* renamed from: a  reason: collision with root package name */
    private Context f10697a;
    private eyx b;

    static {
        kge.a(-1572019473);
        kge.a(1967244270);
    }

    public e(Context context, eyx eyxVar) {
        this.f10697a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b2;
        com.taobao.android.detail.ttdetail.component.module.d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b2 = aVar.b()) == null || (a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr)) == null) {
            return false;
        }
        if (new b(a2, b2).a()) {
            a2.updateComponent();
        }
        return true;
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f10698a;
        private com.taobao.android.detail.ttdetail.component.module.d b;
        private JSONObject c;

        static {
            kge.a(-2061197716);
        }

        public b(com.taobao.android.detail.ttdetail.component.module.d dVar, JSONObject jSONObject) {
            this.b = dVar;
            this.c = jSONObject;
            b();
        }

        public boolean a() {
            List<AsyncModule.KVMapping> a2;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            a aVar = this.f10698a;
            if (aVar != null && (a2 = aVar.a(this.c)) != null && !a2.isEmpty() && (jSONObject = this.c.getJSONObject("payload")) != null) {
                return com.taobao.android.detail.ttdetail.async.b.a(jSONObject, a2, this.b.getComponentData());
            }
            return false;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.c.getJSONObject(com.taobao.android.detail.wrapper.ultronengine.event.s.WRITE_BACK_ROUTES) != null) {
                this.f10698a = new d();
            } else if (this.c.getJSONArray("dataMergeParams") == null) {
            } else {
                this.f10698a = new c();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1083786655);
        }

        public abstract List<AsyncModule.KVMapping> a(JSONObject jSONObject);

        private a() {
        }

        public String a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9e721362", new Object[]{this, str, jSONObject});
            }
            if (jSONObject == null) {
                return str;
            }
            String string = jSONObject.getString("beReplaced");
            String string2 = jSONObject.getString("toReplace");
            return (string == null || string2 == null) ? str : str.replace(string, string2);
        }
    }

    /* loaded from: classes5.dex */
    public static class d extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(238273301);
        }

        private d() {
            super();
        }

        @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.e.a
        public List<AsyncModule.KVMapping> a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(com.taobao.android.detail.wrapper.ultronengine.event.s.WRITE_BACK_ROUTES);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = jSONObject.getJSONObject("targetReplacement");
            for (String str : jSONObject2.keySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("source", (Object) str);
                jSONObject4.put("target", (Object) a(jSONObject2.getString(str), jSONObject3));
                arrayList.add(new AsyncModule.KVMapping(jSONObject4));
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1323868253);
        }

        public c() {
            super();
        }

        @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.e.a
        public List<AsyncModule.KVMapping> a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
            }
            JSONArray jSONArray = jSONObject.getJSONArray("dataMergeParams");
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject("targetReplacement");
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    String string = jSONObject3.getString("sourcePath");
                    String string2 = jSONObject3.getString("targetPath");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        String a2 = a(string2, jSONObject2);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("source", (Object) string);
                        jSONObject4.put("target", (Object) a2);
                        arrayList.add(new AsyncModule.KVMapping(jSONObject4));
                    }
                }
            }
            return arrayList;
        }
    }
}
