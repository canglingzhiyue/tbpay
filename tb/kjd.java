package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0011"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRlHighlightText;", "Lcom/taobao/android/dinamicx/expression/parser/DXAbsDinamicDataParser;", "()V", "evalWithArgs", "", "operationList", "", "dinamicParams", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "parserHighText", "Lcom/alibaba/fastjson/JSONObject;", "result", "", "color", "parserText", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private static final long f30115a = -7726639891415699670L;

    public static /* synthetic */ Object ipc$super(kjd kjdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRlHighlightText$Companion;", "", "()V", "DX_PARSER_RLHIGHLIGHTTEXT", "", "getDX_PARSER_RLHIGHLIGHTTEXT", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
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
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : kjd.a();
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : f30115a;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str3 = (String) obj3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (q.a((Object) str2, (Object) "true")) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(a(str, str3));
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        if (objArr.length == 3) {
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.add(a(str));
            return jSONArray3;
        }
        if (objArr.length > 3) {
            if (objArr[3] == null) {
                JSONArray jSONArray4 = new JSONArray();
                jSONArray4.add(a(str));
                return jSONArray4;
            }
            Object obj4 = objArr[3];
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
            }
            JSONArray jSONArray5 = (JSONArray) obj4;
            if (jSONArray5 != null) {
                try {
                    Iterator<Object> it = jSONArray5.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            JSONObject jSONObject = (JSONObject) next;
                            String string = jSONObject.getString("start");
                            q.b(string, "obj.getString(\"start\")");
                            int parseInt = Integer.parseInt(string);
                            String string2 = jSONObject.getString("end");
                            q.b(string2, "obj.getString(\"end\")");
                            int parseInt2 = Integer.parseInt(string2);
                            if (parseInt >= 0 && parseInt2 >= 0 && parseInt <= parseInt2) {
                                if (parseInt <= (str != null ? Integer.valueOf(str.length()) : null).intValue()) {
                                    if (parseInt2 <= (str != null ? Integer.valueOf(str.length()) : null).intValue()) {
                                        while (parseInt < parseInt2) {
                                            linkedHashSet.add(Integer.valueOf(parseInt));
                                            parseInt++;
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        if (linkedHashSet.contains(Integer.valueOf(i))) {
                            sb2.append(str.charAt(i));
                            if (sb.length() > 0) {
                                String sb3 = sb.toString();
                                q.b(sb3, "templateString.toString()");
                                jSONArray2.add(a(sb3));
                                n.a(sb);
                            }
                        } else {
                            sb.append(str.charAt(i));
                            if (sb2.length() > 0) {
                                String sb4 = sb2.toString();
                                q.b(sb4, "templateHighString.toString()");
                                jSONArray2.add(a(sb4, str3));
                                n.a(sb2);
                            }
                        }
                        if (i == str.length() - 1) {
                            if (sb.length() > 0) {
                                String sb5 = sb.toString();
                                q.b(sb5, "templateString.toString()");
                                jSONArray2.add(a(sb5));
                            }
                            if (sb2.length() > 0) {
                                String sb6 = sb2.toString();
                                q.b(sb6, "templateHighString.toString()");
                                jSONArray2.add(a(sb6, str3));
                            }
                        }
                    }
                } catch (Throwable unused) {
                    JSONArray jSONArray6 = new JSONArray();
                    jSONArray6.add(a(str));
                    return jSONArray6;
                }
            }
        }
        return jSONArray2;
    }

    private final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "text", str);
        jSONObject2.put((JSONObject) "isHighlight", (String) false);
        return jSONObject;
    }

    private final JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc81489c", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "text", str);
        jSONObject2.put((JSONObject) "isHighlight", (String) true);
        jSONObject2.put((JSONObject) "highlightColor", str2);
        return jSONObject;
    }
}
