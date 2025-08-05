package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.g;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0002J9\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/android/adam/aura/AuraIntercept;", "Lcom/taobao/android/adam/intercept/IIntercepter;", "()V", "generateNewTemplate", "Lcom/alibaba/fastjson/JSONObject;", "originData", "generateNewTemplates", "", "Lcom/alibaba/fastjson/JSONArray;", "process", "Lcom/taobao/android/adam/Result;", "next", "Lcom/taobao/android/adam/IChain;", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "chainContext", "Lcom/taobao/android/adam/ChainContext;", "(Lcom/taobao/android/adam/IChain;Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/adam/ChainContext;)Lcom/taobao/android/adam/Result;", "adam_android_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class dnh implements dnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1561731808);
        kge.a(52393184);
    }

    @Override // tb.dnm
    public dnd a(dnc next, DXEvent dXEvent, Object[] objArr, dmz dmzVar) {
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("2f23671d", new Object[]{this, next, dXEvent, objArr, dmzVar});
        }
        q.c(next, "next");
        Object obj = null;
        if ((dmzVar != null ? dmzVar.a() : null) == null || dmzVar.b() == null) {
            dnd a4 = next.a(dXEvent, objArr, dmzVar);
            q.a((Object) a4, "next.executeChain(event, args, chainContext)");
            return a4;
        }
        Map<String, Object> userCtx = dmzVar.b();
        Object obj2 = userCtx.get("event_adam_config");
        if (!(obj2 instanceof JSONObject)) {
            obj2 = null;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        Object obj3 = jSONObject != null ? jSONObject.get("componentKeys") : null;
        if (!(obj3 instanceof String[])) {
            obj3 = null;
        }
        Object obj4 = (String[]) obj3;
        Object obj5 = userCtx.get("global_adam_config");
        if (!(obj5 instanceof JSONObject)) {
            obj5 = null;
        }
        JSONObject jSONObject2 = (JSONObject) obj5;
        if (!(obj4 instanceof String[])) {
            obj4 = jSONObject2 != null ? jSONObject2.get("sourceCode") : null;
        }
        Object obj6 = userCtx.get("auraTemplates");
        if (obj6 instanceof JSONArray) {
            obj = obj6;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null || jSONArray.isEmpty()) {
            dnd a5 = dnd.a();
            q.a((Object) a5, "Result.failedResult()");
            return a5;
        }
        if (obj4 != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = obj4 instanceof JSONArray;
            boolean z2 = obj4 instanceof Object[];
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (z) {
                    JSONArray jSONArray2 = (JSONArray) obj4;
                    if (next2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                    JSONObject jSONObject3 = (JSONObject) next2;
                    if (jSONArray2.contains(jSONObject3.get("code")) && (a2 = a(jSONObject3)) != null) {
                        arrayList.add(a2);
                    }
                } else if (z2) {
                    String[] strArr = (String[]) obj4;
                    if (next2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                    JSONObject jSONObject4 = (JSONObject) next2;
                    if (g.a(strArr, jSONObject4.get("code")) && (a3 = a(jSONObject4)) != null) {
                        arrayList.add(a3);
                    }
                } else {
                    continue;
                }
            }
            q.a((Object) userCtx, "userCtx");
            userCtx.put("templates", arrayList);
        } else {
            q.a((Object) userCtx, "userCtx");
            userCtx.put("templates", a(jSONArray));
        }
        dnd a6 = next.a(dXEvent, objArr, dmzVar);
        q.a((Object) a6, "next.executeChain(event, args, chainContext)");
        return a6;
    }

    private final List<JSONObject> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            arrayList.add(a((JSONObject) next));
        }
        return arrayList;
    }

    private final JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "name", (String) jSONObject.get("code"));
        jSONObject3.put((JSONObject) "version", (String) jSONObject.get("version"));
        jSONObject3.put((JSONObject) "url", (String) jSONObject.get("url"));
        return jSONObject2;
    }
}
