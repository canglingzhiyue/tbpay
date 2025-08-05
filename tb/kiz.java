package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserMapConcat;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "expectNewJson", "", "evalWithArgs", "", "operationList", "", "runtimeParam", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kiz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_MAP_CONCAT = -3309045306953881825L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30113a = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserMapConcat$Companion;", "", "()V", "DX_PARSER_MAP_CONCAT", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = null;
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null) {
            return new JSONObject();
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof JSONObject) {
            jSONObject = obj2;
        }
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 == null) {
            return jSONObject2;
        }
        if (objArr.length == 3) {
            Object obj3 = objArr[2];
            if (obj3 instanceof Integer) {
                z = q.a(obj3, (Object) 1);
            } else if (obj3 instanceof String) {
                z = n.a("true", (String) obj3, true);
            } else if (obj3 instanceof Boolean) {
                z = ((Boolean) obj3).booleanValue();
            }
            this.f30113a = z;
        }
        if (this.f30113a) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.putAll(jSONObject2);
            jSONObject4.putAll(jSONObject3);
            return jSONObject4;
        }
        jSONObject2.putAll(jSONObject3);
        return jSONObject2;
    }
}
