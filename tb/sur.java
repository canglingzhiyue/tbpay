package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public class sur {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_DATA = "data";
    public static final String CALLBACK_DATA_LIST = "dataList";
    public static final String CALLBACK_RESULT = "result";
    public static final b Companion;
    public static final String KEY_ARGS = "args";
    public static final String KEY_NAME = "name";
    public static final String KEY_RECEIVER = "receiver";
    public static final String KEY_SENDER = "sender";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String RECEIVER_INTERACT = "Interact";
    public static final String SENDER_INTERACT = "Interact";

    /* renamed from: a  reason: collision with root package name */
    private String f33912a;
    private JSONObject b;
    private long c;
    private String d;
    private String e;
    private a f;

    /* loaded from: classes8.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(-1955473480);
        Companion = new b(null);
    }

    public sur(String name, JSONObject jSONObject, long j, String sender, String receiver, a aVar) {
        q.d(name, "name");
        q.d(sender, "sender");
        q.d(receiver, "receiver");
        this.f33912a = name;
        this.b = jSONObject;
        this.c = j;
        this.d = sender;
        this.e = receiver;
        this.f = aVar;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f33912a;
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.b;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9344ab", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public final a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c25424ab", new Object[]{this}) : this.f;
    }

    /* loaded from: classes8.dex */
    public static final class b {
        static {
            kge.a(1178696960);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String jSONString = new JSONObject(ai.a(j.a("name", this.f33912a), j.a("args", this.b), j.a("timestamp", Long.valueOf(this.c)), j.a("sender", this.d), j.a(KEY_RECEIVER, this.e))).toJSONString();
        q.b(jSONString, "jsonObject.toJSONString()");
        return jSONString;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{name=" + this.f33912a + "，timestamp=" + this.c + "，sender=" + this.d + "，receiver=" + this.e + '}';
    }
}
