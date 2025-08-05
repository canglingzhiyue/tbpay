package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0002\u0010\bJ\u001d\u0010\n\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0002\u0010\bJ+\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0018"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateDebugLogKT;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "evalOneParams", "", "operationList", "", "", "([Ljava/lang/Object;)V", "evalThreeParams", "evalTwoParams", "evalWithArgs", "dinamicParams", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "getContentString", "", "value", "parseBoolean", "", "toastOption", "parseStringBoolean", "s", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class rif extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "rateFeedList";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private static final long f33163a = -67668164305500991L;

    public static /* synthetic */ Object ipc$super(rif rifVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : f33163a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateDebugLogKT$Companion;", "", "()V", "DX_PARSER_RATEDEBUGLOG", "", "getDX_PARSER_RATEDEBUGLOG", "()J", RPCDataItems.SWITCH_TAG_LOG, "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : rif.a();
        }
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                int length = objArr.length;
                if (length == 1) {
                    a(objArr);
                } else if (length == 2) {
                    b(objArr);
                } else {
                    c(objArr);
                }
                return true;
            }
        }
        return false;
    }

    private final void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else {
            b(objArr[0]);
        }
    }

    private final void b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
            return;
        }
        Object obj = objArr[0];
        b(objArr[1]);
        b(obj);
    }

    private final void c(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae345387", new Object[]{this, objArr});
            return;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object obj3 = objArr[2];
        String b = b(obj2);
        String b2 = b(obj);
        if (!a(obj3)) {
            return;
        }
        kim.a(b + " : " + b2);
    }

    private final boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str != null && (!q.a((Object) str, (Object) "false")) && !n.a(str, "0", true)) {
            if (!(str.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    private final String b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{this, obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                return "Unsupported type";
            }
            String jSONString = ((JSONArray) obj).toJSONString();
            q.b(jSONString, "value.toJSONString()");
            return jSONString;
        }
        return obj.toString();
    }
}
