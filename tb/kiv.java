package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0019"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserIndexOfValueForKeyPath;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "evalWithArgs", "", "operationList", "", "dinamicParams", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "getIndexOfValueForKeyPath", "", "jsonArray", "Lcom/alibaba/fastjson/JSONArray;", "value", "", "keyPath", "getValue", "target", "name", "parseDataExpression", "dataExpression", "inputData", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kiv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_INDEXOFVALUEFORKEYPATH = -8937188514497035075L;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserIndexOfValueForKeyPath$Companion;", "", "()V", "DX_PARSER_INDEXOFVALUEFORKEYPATH", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(kiv kivVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] operationList, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, operationList, dXRuntimeContext});
        }
        q.d(operationList, "operationList");
        if (((operationList.length == 0) && operationList.length < 3) || !(operationList[0] instanceof JSONArray) || !(operationList[1] instanceof String) || !(operationList[2] instanceof String)) {
            return null;
        }
        Object obj = operationList[0];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
        }
        JSONArray jSONArray = (JSONArray) obj;
        Object obj2 = operationList[1];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj2;
        Object obj3 = operationList[2];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return Integer.valueOf(a(jSONArray, str, (String) obj3));
    }

    private final int a(JSONArray jSONArray, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40ba5297", new Object[]{this, jSONArray, str, str2})).intValue();
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            Object a2 = a(str2, jSONObject);
            if ((a2 instanceof String) && q.a(a2, (Object) str)) {
                return i;
            }
        }
        return 0;
    }

    public final Object a(String str, JSONObject inputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("abaf35f4", new Object[]{this, str, inputData});
        }
        q.d(inputData, "inputData");
        if (inputData.isEmpty()) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".", false);
        JSONObject jSONObject = inputData;
        while (stringTokenizer.hasMoreTokens()) {
            jSONObject = a(jSONObject, stringTokenizer.nextToken());
        }
        return jSONObject;
    }

    private final Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{this, obj, str});
        }
        if (obj != null && str != null) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }
}
