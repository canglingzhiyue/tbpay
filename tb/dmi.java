package tb;

import android.content.Context;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes4.dex */
public final class dmi implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET = "get";
    public static final String API_REMOVE = "remove";
    public static final String API_SET = "set";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f26852a;

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26853a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ als d;

        public b(String str, String str2, Ref.ObjectRef objectRef, als alsVar) {
            this.f26853a = str;
            this.b = str2;
            this.c = objectRef;
            this.d = alsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            String obj2;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Pair[] pairArr = new Pair[7];
                pairArr[0] = j.a("api", "get");
                pairArr[1] = j.a("fileName", this.f26853a);
                pairArr[2] = j.a("key", this.b);
                T t = this.c.element;
                if (t != 0 && (obj2 = t.toString()) != null) {
                    i = obj2.length();
                }
                pairArr[3] = j.a("len", Integer.valueOf(i));
                pairArr[4] = j.a("bizId", this.d.f().d());
                pairArr[5] = j.a("namespace", this.d.f().e());
                Map<String, Object> e = this.d.e();
                pairArr[6] = j.a("url", (e == null || (obj = e.get("url")) == null) ? null : obj.toString());
                AppMonitor.Alarm.commitSuccess("Megability", "LocalStorageSizeStat", new JSONObject(ai.b(pairArr)).toJSONString());
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26854a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ als d;

        public c(String str, String str2, Object obj, als alsVar) {
            this.f26854a = str;
            this.b = str2;
            this.c = obj;
            this.d = alsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            String obj2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Pair[] pairArr = new Pair[7];
                pairArr[0] = j.a("api", "set");
                pairArr[1] = j.a("fileName", this.f26854a);
                pairArr[2] = j.a("key", this.b);
                Object obj3 = this.c;
                String str = null;
                pairArr[3] = j.a("len", (obj3 == null || (obj2 = obj3.toString()) == null) ? null : Integer.valueOf(obj2.length()));
                pairArr[4] = j.a("bizId", this.d.f().d());
                pairArr[5] = j.a("namespace", this.d.f().e());
                Map<String, Object> e = this.d.e();
                if (e != null && (obj = e.get("url")) != null) {
                    str = obj.toString();
                }
                pairArr[6] = j.a("url", str);
                AppMonitor.Alarm.commitSuccess("Megability", "LocalStorageSizeStat", new JSONObject(ai.b(pairArr)).toJSONString());
            } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-224382503);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1408559151);
        kge.a(-948502777);
        Companion = new a(null);
        f26852a = new bfy("mega-local-storage-stat", 1);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Object] */
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
        String a2 = e.a(params, "fileName", "");
        q.a((Object) a2);
        String a3 = e.a(params, "key", (String) null);
        Context f = context.f().f();
        if (a3 == null || f == null) {
            return new ErrorResult("400", "NullParams, k=" + a3 + ", ctx=" + f, (Map) null, 4, (o) null);
        }
        int hashCode = api.hashCode();
        if (hashCode == -934610812) {
            if (api.equals("remove")) {
                dmh.a(f, a2, a3, null);
                return new FinishResult(null, null, 3, null);
            }
            return new ErrorResult("501", (String) null, (Map) null, 6, (o) null);
        }
        if (hashCode == 102230) {
            if (api.equals("get")) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = dmh.a(f, a2, a3);
                bfy.a(f26852a, new b(a2, a3, objectRef, context), 0L, null, 6, null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", objectRef.element);
                t tVar = t.INSTANCE;
                return new FinishResult(jSONObject, null, 2, null);
            }
        } else if (hashCode == 113762 && api.equals("set")) {
            Object obj = params.get("value");
            dmh.a(f, a2, a3, obj);
            bfy.a(f26852a, new c(a2, a3, obj, context), 0L, null, 6, null);
            return new FinishResult(null, null, 3, null);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (o) null);
    }
}
