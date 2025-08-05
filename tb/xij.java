package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.internal.utils.c;
import com.alibaba.android.nextrpc.streamv2.request.b;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.wvplugin.a;
import com.taobao.tao.stream.d;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;
import kotlin.text.n;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.util.ErrorConstant;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010(\u001a\u00020\bJ\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0*H\u0002J)\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0*2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0-H\u0002¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u00100\u001a\u00020\u0014H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "", "mtopStreamResponse", "Lcom/taobao/tao/stream/MtopStreamResponse;", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "(Lcom/taobao/tao/stream/MtopStreamResponse;Lcom/alibaba/android/nextrpc/streamv2/request/Request;)V", "SUCCESS_STR", "", "attachedResponseStat", "", "", "getAttachedResponseStat", "()Ljava/util/Map;", "isBizSuccess", "", "()Z", "setBizSuccess", "(Z)V", "jsonBody", "Lcom/alibaba/fastjson/JSONObject;", "getJsonBody", "()Lcom/alibaba/fastjson/JSONObject;", "setJsonBody", "(Lcom/alibaba/fastjson/JSONObject;)V", "mapHeaders", "", "", "getMapHeaders", "getMtopStreamResponse", "()Lcom/taobao/tao/stream/MtopStreamResponse;", "seqNum", "getSeqNum", "()I", "setSeqNum", "(I)V", "strBody", "getStrBody", "()Ljava/lang/String;", "traceId", "getAndParseTraceId", "getCodeAndMsg", "Lkotlin/Pair;", "getCodeAndMsgByRet", a.RESULT_KEY, "", "([Ljava/lang/String;)Lkotlin/Pair;", "parseAttachedResponseStat", "parseBodyJSON", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class xij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34311a;
    private final d b;
    private final Map<String, List<String>> c;
    private JSONObject d;
    private final String e;
    private final Map<String, Integer> f;
    private int g;
    private boolean h;
    private String i;
    private final b j;

    public xij(d mtopStreamResponse, b request) {
        JSONObject j;
        q.d(mtopStreamResponse, "mtopStreamResponse");
        q.d(request, "request");
        this.f34311a = "\"ret\":[\"SUCCESS::调用成功\"],\"v\"";
        this.g = -1;
        this.i = "";
        this.b = mtopStreamResponse;
        this.j = request;
        Map<String, List<String>> map = mtopStreamResponse.g;
        q.b(map, "mtopStreamResponse.headerFields");
        this.c = map;
        if (mtopStreamResponse.e != null) {
            byte[] bArr = mtopStreamResponse.e;
            q.b(bArr, "mtopStreamResponse.bytedata");
            this.e = new String(bArr, kotlin.text.d.UTF_8);
        } else {
            this.e = "";
        }
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_PARSE_JSON_OBJECT);
        if (q.a((Object) request.f(), (Object) true)) {
            j = new JSONObject();
        } else {
            j = j();
        }
        this.d = j;
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_PARSE_JSON_OBJECT);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_PARSE_STAT);
        this.f = i();
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_PARSE_STAT);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_PARSE_RET);
        Pair<String, String> k = k();
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_PARSE_RET);
        mtopStreamResponse.f21113a = k.getFirst();
        mtopStreamResponse.b = k.getSecond();
        this.h = q.a((Object) "SUCCESS", (Object) mtopStreamResponse.f21113a);
    }

    public final d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("db956a24", new Object[]{this}) : this.b;
    }

    public final Map<String, List<String>> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.c;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
    }

    public final Map<String, Integer> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.f;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.h;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.i.length() > 0) {
            z = true;
        }
        if (z) {
            return this.i;
        }
        List<String> list = this.c.get(HttpConstant.EAGLE_EYE_ID_2);
        if (list == null || !(!list.isEmpty())) {
            return "";
        }
        this.i = (String) p.h((List<? extends Object>) list);
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Map<java.lang.String, java.lang.Integer> i() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xij.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "d67b6a5"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L15:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.c
            java.lang.String r1 = "mtop-nextrpc-attached-responses-stat"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L28
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.c
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            goto L3c
        L28:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.c
            java.lang.String r1 = "MTOP-nextrpc-attached-responses-stat"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L3b
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.c
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L46
            java.lang.Object r0 = kotlin.collections.p.i(r0)     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.UnsupportedEncodingException -> Lee
            if (r0 != 0) goto L48
        L46:
            java.lang.String r0 = ""
        L48:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.io.UnsupportedEncodingException -> Lee
            int r1 = r1.length()     // Catch: java.io.UnsupportedEncodingException -> Lee
            if (r1 != 0) goto L52
            r2 = 1
        L52:
            if (r2 == 0) goto L5c
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.io.UnsupportedEncodingException -> Lee
            r0.<init>()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.UnsupportedEncodingException -> Lee
            return r0
        L5c:
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.String r1 = "URLDecoder.decode(temp, \"UTF-8\")"
            kotlin.jvm.internal.q.b(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> Lee
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.String r1 = "jsonObject"
            kotlin.jvm.internal.q.b(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.io.UnsupportedEncodingException -> Lee
            r1.<init>()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Set r0 = r0.entrySet()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.UnsupportedEncodingException -> Lee
        L7f:
            boolean r2 = r0.hasNext()     // Catch: java.io.UnsupportedEncodingException -> Lee
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r0.next()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.Object r3 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lee
            boolean r3 = r3 instanceof java.lang.Integer     // Catch: java.io.UnsupportedEncodingException -> Lee
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.Object r2 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lee
            r1.put(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> Lee
            goto L7f
        L9f:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.io.UnsupportedEncodingException -> Lee
            int r2 = r1.size()     // Catch: java.io.UnsupportedEncodingException -> Lee
            int r2 = kotlin.collections.ai.a(r2)     // Catch: java.io.UnsupportedEncodingException -> Lee
            r0.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Set r1 = r1.entrySet()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Iterator r1 = r1.iterator()     // Catch: java.io.UnsupportedEncodingException -> Lee
        Lba:
            boolean r2 = r1.hasNext()     // Catch: java.io.UnsupportedEncodingException -> Lee
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r1.next()     // Catch: java.io.UnsupportedEncodingException -> Lee
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.Object r3 = r3.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.Object r2 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lee
            if (r2 == 0) goto Le1
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.io.UnsupportedEncodingException -> Lee
            int r2 = r2.intValue()     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.io.UnsupportedEncodingException -> Lee
            r0.put(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> Lee
            goto Lba
        Le1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.io.UnsupportedEncodingException -> Lee
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)     // Catch: java.io.UnsupportedEncodingException -> Lee
            throw r0     // Catch: java.io.UnsupportedEncodingException -> Lee
        Le9:
            java.util.Map r0 = kotlin.collections.ai.c(r0)     // Catch: java.io.UnsupportedEncodingException -> Lee
            return r0
        Lee:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xij.i():java.util.Map");
    }

    private final JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this});
        }
        if (this.b.i == null) {
            if (this.b.e != null) {
                Object parseObject = JSONObject.parseObject(this.b.e, JSONObject.class, new Feature[0]);
                q.b(parseObject, "JSONObject.parseObject(m…, JSONObject::class.java)");
                return (JSONObject) parseObject;
            }
            return new JSONObject();
        }
        JSONObject jSONObject = this.b.i;
        q.b(jSONObject, "mtopStreamResponse.originFastJsonObject");
        return jSONObject;
    }

    private final Pair<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f48add5b", new Object[]{this});
        }
        if (this.b.h != null) {
            String[] strArr = this.b.h;
            q.b(strArr, "mtopStreamResponse.ret");
            return a(strArr);
        }
        if (this.e.length() == 0) {
            if (!TextUtils.isEmpty(this.b.f21113a) && !TextUtils.isEmpty(this.b.b)) {
                return new Pair<>(this.b.f21113a, this.b.b);
            }
            return new Pair<>(ErrorConstant.ERRCODE_JSONDATA_BLANK, ErrorConstant.ERRMSG_JSONDATA_BLANK);
        }
        if (q.a((Object) this.j.f(), (Object) true)) {
            if (c.a() && n.b((CharSequence) this.e, this.f34311a, 0, false, 6, (Object) null) != -1) {
                return new Pair<>("SUCCESS", "调用成功");
            }
            this.d = j();
            UnifyLog.d("NextRPC", "getCodeAndMsg disableJSONParse optimize failed", new Object[0]);
        }
        if (!this.d.isEmpty()) {
            try {
                JSONArray jSONArray = this.d.getJSONArray(a.RESULT_KEY);
                if (jSONArray != null) {
                    String[] strArr2 = new String[jSONArray.size()];
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        strArr2[i] = jSONArray.get(i).toString();
                    }
                    this.b.h = strArr2;
                    return a(strArr2);
                }
            } catch (Exception unused) {
                return new Pair<>(ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR, ErrorConstant.ERRMSG_JSONDATA_PARSE_ERROR);
            }
        }
        return new Pair<>("", "");
    }

    private final Pair<String, String> a(String[] strArr) {
        List a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("b6b0b620", new Object[]{this, strArr});
        }
        if (!(strArr.length == 0)) {
            String str = strArr[0];
            if (StringUtils.isNotBlank(str)) {
                q.a((Object) str);
                List<String> split = new Regex("::").split(str, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            a2 = p.c(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                a2 = p.a();
                Object[] array = a2.toArray(new String[0]);
                if (array != null) {
                    String[] strArr2 = (String[]) array;
                    if (strArr2 != null && strArr2.length > 1) {
                        return new Pair<>(strArr2[0], strArr2[1]);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        return new Pair<>("", "");
    }
}
