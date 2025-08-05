package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.g;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/adam/parser/DXDataParserAdamConfig;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "evalWithArgs", "", "operationList", "", "dinamicParams", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "Companion", "adam_android_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class dnn extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final long DX_PARSER_ADAMCONFIG = -4438251361709622285L;

    static {
        kge.a(1856039729);
        Companion = new a(null);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        rvz a2 = rwf.a(g.f(objArr), 2);
        int a3 = a2.a();
        int b = a2.b();
        int c = a2.c();
        if (c < 0 ? a3 >= b : a3 <= b) {
            while (true) {
                Object obj = "";
                if (q.a(objArr[a3], (Object) bao.CACHE_KEY_TEMPLATE_INFO)) {
                    if (jSONObject.get(bao.CACHE_KEY_TEMPLATE_INFO) == null) {
                        jSONObject.put((JSONObject) bao.CACHE_KEY_TEMPLATE_INFO, (String) new JSONArray());
                    }
                    Object obj2 = jSONObject.get(bao.CACHE_KEY_TEMPLATE_INFO);
                    if (obj2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                    }
                    JSONArray jSONArray = (JSONArray) obj2;
                    int i = a3 + 1;
                    if (objArr.length > i) {
                        obj = objArr[i];
                    }
                    jSONArray.add(obj);
                } else {
                    JSONObject jSONObject2 = jSONObject;
                    String obj3 = objArr[a3].toString();
                    int i2 = a3 + 1;
                    if (objArr.length > i2) {
                        obj = objArr[i2];
                    }
                    jSONObject2.put((JSONObject) obj3, (String) obj);
                }
                if (a3 == b) {
                    break;
                }
                a3 += c;
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "parserAdamConfigPrefix", (String) jSONObject);
        return jSONObject3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/adam/parser/DXDataParserAdamConfig$Companion;", "", "()V", "DX_PARSER_ADAMCONFIG", "", "adam_android_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1811067591);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
