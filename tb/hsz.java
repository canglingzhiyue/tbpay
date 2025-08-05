package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\t\u001a\f\u0010\b\u001a\u00020\n*\u0004\u0018\u00010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r\"\u001d\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, d2 = {"mergeObjectStarkThreadLocal", "Ljava/lang/ThreadLocal;", "Ljava/util/Stack;", "", "getMergeObjectStarkThreadLocal", "()Ljava/lang/ThreadLocal;", "targetObjectStarkThreadLocal", "getTargetObjectStarkThreadLocal", "deepClone", "Lcom/alibaba/fastjson/JSONArray;", "Lcom/alibaba/fastjson/JSONObject;", "merge", "", "Lcom/alibaba/fastjson/JSON;", "mergeObject", "megaUtils_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class hsz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Stack<Object>> f28767a = new ThreadLocal<>();
    private static final ThreadLocal<Stack<Object>> b = new ThreadLocal<>();

    public static final JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        a(jSONObject2, jSONObject);
        return jSONObject2;
    }

    public static final JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        a(jSONArray2, jSONArray);
        return jSONArray2;
    }

    public static final void a(JSON json, JSON json2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31741108", new Object[]{json, json2});
        } else if (json != null && json2 != null) {
            Stack<Object> stack = f28767a.get();
            if (stack == null) {
                stack = new Stack<>();
                f28767a.set(stack);
            }
            Stack<Object> stack2 = b.get();
            if (stack2 == null) {
                stack2 = new Stack<>();
                b.set(stack2);
            }
            stack.push(json);
            stack2.push(json2);
            while (!stack2.empty()) {
                Object pop = stack.pop();
                Object pop2 = stack2.pop();
                if (!(pop instanceof JSONObject) || !(pop2 instanceof JSONObject)) {
                    if ((pop instanceof JSONArray) && (pop2 instanceof JSONArray)) {
                        for (Object obj : (Iterable) pop2) {
                            if (obj instanceof JSONObject) {
                                JSONObject jSONObject = new JSONObject();
                                ((JSONArray) pop).add(jSONObject);
                                stack.push(jSONObject);
                                stack2.push(obj);
                            } else if (obj instanceof JSONArray) {
                                JSONArray jSONArray = new JSONArray();
                                ((JSONArray) pop).add(jSONArray);
                                stack.push(jSONArray);
                                stack2.push(obj);
                            } else {
                                ((JSONArray) pop).add(obj);
                            }
                        }
                    }
                } else {
                    for (Map.Entry entry : ((Map) pop2).entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) pop;
                            if (jSONObject2.get(entry.getKey()) instanceof JSONObject) {
                                stack.push(jSONObject2.get(entry.getKey()));
                                stack2.push(entry.getValue());
                            } else {
                                JSONObject jSONObject3 = new JSONObject();
                                ((Map) pop).put(entry.getKey(), jSONObject3);
                                stack.push(jSONObject3);
                                stack2.push(entry.getValue());
                            }
                        } else if (value instanceof JSONArray) {
                            JSONArray jSONArray2 = new JSONArray();
                            ((Map) pop).put(entry.getKey(), jSONArray2);
                            stack.push(jSONArray2);
                            stack2.push(entry.getValue());
                        } else {
                            ((Map) pop).put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
            stack.clear();
            stack2.clear();
        }
    }
}
