package tb;

import com.alibaba.android.nextrpc.streamv2.request.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/response/AttachedResponse;", "", "jsonHeaders", "Lcom/alibaba/fastjson/JSONObject;", "strBody", "", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "(Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Lcom/alibaba/android/nextrpc/streamv2/request/Request;)V", "bizName", "getBizName", "()Ljava/lang/String;", "isSuccess", "", "()Z", "jsonBody", "getJsonBody", "()Lcom/alibaba/fastjson/JSONObject;", "getJsonHeaders", "seqNum", "", "getSeqNum", "()I", "getStrBody", "parseBizName", "parseSeqNum", "parseSuccess", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class xih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f34309a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;

    public xih(JSONObject jsonHeaders, String strBody, b request) {
        JSONObject parseObject;
        q.d(jsonHeaders, "jsonHeaders");
        q.d(strBody, "strBody");
        q.d(request, "request");
        this.f34309a = jsonHeaders;
        this.c = strBody;
        if (q.a((Object) request.f(), (Object) true)) {
            parseObject = new JSONObject();
        } else {
            parseObject = JSONObject.parseObject(strBody);
            q.b(parseObject, "JSONObject.parseObject(strBody)");
        }
        this.b = parseObject;
        this.d = g();
        this.e = i();
        this.f = h();
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f34309a;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    private final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : String.valueOf(this.f34309a.get("bizName"));
    }

    private final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        Object obj = this.f34309a.get("seqNum");
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        Integer d = n.d(String.valueOf(obj));
        if (d == null) {
            return -1;
        }
        return d.intValue();
    }

    private final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        Object obj = this.f34309a.get("success");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(String.valueOf(obj));
    }
}
