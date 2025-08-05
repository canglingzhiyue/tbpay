package tb;

import com.alibaba.ability.b;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class dlw implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_TOGGLE = "toggle";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26843a;

    static {
        kge.a(-407087745);
        kge.a(-948502777);
        Companion = new a(null);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Companion.a();
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f26843a;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1222988281);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : dlw.a();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (api.hashCode() == -868304044 && api.equals(API_TOGGLE)) {
            Boolean a2 = e.a(params, "enable", (Boolean) false);
            f26843a = a2 != null ? a2.booleanValue() : false;
            return new FinishResult(new JSONObject(ai.b(j.a("success", true))), null, 2, null);
        }
        return a$a.Companion.a("api not found");
    }
}
