package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

@AURAExtensionImpl(code = "alidetail.impl.event.adjustState")
/* loaded from: classes4.dex */
public final class dwt extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustState";
    public static final String KEY_BE_REPLACED = "beReplaced";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_TARGET_REPLACEMENT = "targetReplacement";
    public static final String KEY_TO_REPLACE = "toReplace";

    /* renamed from: a  reason: collision with root package name */
    private Handler f27045a = new Handler(Looper.getMainLooper());

    static {
        kge.a(1697647387);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "adjustState";
    }

    public dwt() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.AliDetailAdjustStateEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        JSONObject c2;
        com.alibaba.android.umf.datamodel.service.rule.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        AURARenderComponent d2 = aURAEventIO.getEventModel().d();
        if (d2 == null || (c2 = aURAEventIO.getEventModel().c()) == null || (a2 = new b(d2, c2).a()) == null) {
            return;
        }
        final s b2 = b().b();
        final UMFRuleIO uMFRuleIO = new UMFRuleIO(Arrays.asList(a2));
        this.f27045a.postDelayed(new Runnable() { // from class: tb.dwt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b2.a("aura.workflow.adjustRules", uMFRuleIO, null);
                }
            }
        }, 1L);
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a f27047a;
        public AURARenderComponent b;
        public JSONObject c;

        static {
            kge.a(1842779032);
        }

        public b(AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.b = aURARenderComponent;
            this.c = jSONObject;
            b();
        }

        public com.alibaba.android.umf.datamodel.service.rule.a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("f03e9b83", new Object[]{this});
            }
            a aVar = this.f27047a;
            if (aVar == null) {
                return null;
            }
            JSONArray a2 = aVar.a(this.c);
            JSONObject jSONObject = this.c.getJSONObject("payload");
            if (jSONObject == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("kvmap", a2);
            hashMap.put("data", jSONObject);
            return bbg.a("kvmap", this.b, hashMap);
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.c.getJSONObject(com.taobao.android.detail.wrapper.ultronengine.event.s.WRITE_BACK_ROUTES) != null) {
                this.f27047a = new d();
            } else if (this.c.getJSONArray("dataMergeParams") == null) {
            } else {
                this.f27047a = new c();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1254545267);
        }

        public abstract JSONArray a(JSONObject jSONObject);

        public String a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e721362", new Object[]{this, str, jSONObject}) : (jSONObject == null || jSONObject.getString("beReplaced") == null || jSONObject.getString("toReplace") == null) ? str : str.replace(jSONObject.getString("beReplaced"), jSONObject.getString("toReplace"));
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-477241279);
        }

        @Override // tb.dwt.a
        public JSONArray a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("b99aadb6", new Object[]{this, jSONObject});
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(com.taobao.android.detail.wrapper.ultronengine.event.s.WRITE_BACK_ROUTES);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = jSONObject.getJSONObject("targetReplacement");
            for (String str : jSONObject2.keySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("source", (Object) str);
                jSONObject4.put("target", (Object) a(jSONObject2.getString(str), jSONObject3));
                jSONArray.add(jSONObject4);
            }
            return jSONArray;
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(608353673);
        }

        @Override // tb.dwt.a
        public JSONArray a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("b99aadb6", new Object[]{this, jSONObject});
            }
            JSONArray jSONArray = jSONObject.getJSONArray("dataMergeParams");
            JSONArray jSONArray2 = new JSONArray();
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
                        jSONArray2.add(jSONObject4);
                    }
                }
            }
            return jSONArray2;
        }
    }
}
