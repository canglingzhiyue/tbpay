package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.u;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.d;
import com.alibaba.fastjson2.util.e;
import com.alibaba.fastjson2.util.i;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class arr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONReader.c f25535a;
    private static AtomicBoolean b;

    public static /* synthetic */ JSONReader.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONReader.c) ipChange.ipc$dispatch("353cc32f", new Object[0]) : f25535a;
    }

    static {
        kge.a(-1797973391);
        b = new AtomicBoolean(false);
        JSONReader.c b2 = JSONFactory.b();
        f25535a = b2;
        b2.a($$Lambda$LS0jSaaqVn1tGDsQ7NTpMRRi1s.INSTANCE);
        f25535a.b($$Lambda$Qw3nmyClOGKd5nO5XDVBdrsVYCI.INSTANCE);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!b.compareAndSet(false, true)) {
        } else {
            try {
                d.class.getName();
                TypeUtils.class.getName();
                JSONReader.class.getName();
                JSONObject.class.getName();
                u.class.getName();
                doe.class.getName();
                aod.class.getName();
                e.class.getName();
                i.class.getName();
                TypeUtils.class.getName();
                JSONArray.class.getName();
            } catch (Throwable unused) {
            }
        }
    }

    public static a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3a1db2df", new Object[0]) : a.a(new a());
    }

    public static <T> b a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c25d9892", new Object[]{cls}) : b.a(new b(cls));
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Future<com.alibaba.fastjson.JSONObject> f25536a;
        public aod b;

        static {
            kge.a(1806313806);
        }

        public static /* synthetic */ a a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fedd76ae", new Object[]{aVar}) : aVar.c();
        }

        private a() {
            this.b = null;
            this.b = new aod(arr.c());
        }

        private a c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1bfb7c7e", new Object[]{this});
            }
            this.f25536a = arq.a(new Callable<com.alibaba.fastjson.JSONObject>() { // from class: tb.arr.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
                @Override // java.util.concurrent.Callable
                public /* synthetic */ com.alibaba.fastjson.JSONObject call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
                }

                public com.alibaba.fastjson.JSONObject a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (com.alibaba.fastjson.JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this});
                    }
                    a.this.b.aS();
                    if (a.this.b.g()) {
                        return null;
                    }
                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                    a.this.b.a((Map) jSONObject, 0L);
                    return jSONObject;
                }
            });
            return this;
        }

        public a a(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4db281b9", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            }
            if (bArr != null && i2 > 0 && bArr.length >= i + i2) {
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                allocate.put(bArr, i, i2);
                allocate.flip();
                this.b.a(allocate);
            }
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("583fe940", new Object[]{this});
            }
            aod aodVar = this.b;
            aodVar.a(aodVar.J);
            return this;
        }

        public com.alibaba.fastjson.JSONObject b() throws ExecutionException, InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.f25536a.get();
        }
    }

    /* loaded from: classes3.dex */
    public static class b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Future<T> f25538a;
        public Class<T> b;
        public aod c;

        static {
            kge.a(-576788593);
        }

        public static /* synthetic */ b a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ed607d4e", new Object[]{bVar}) : bVar.c();
        }

        private b(Class<T> cls) {
            this.c = null;
            this.b = cls;
            this.c = new aod(arr.c());
        }

        private b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1bfb7c9d", new Object[]{this});
            }
            this.f25538a = arq.a(new Callable<T>() { // from class: tb.arr.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public T call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        return (T) ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                    }
                    if ((arr.c().e() & JSONReader.Feature.FieldBased.mask) != 0) {
                        z = true;
                    }
                    bu a2 = arr.c().w.a(b.this.b, z);
                    b.this.c.aS();
                    T t = (T) a2.a(b.this.c, b.this.b, (Object) null, 0L);
                    b.this.c.a(t);
                    if (!b.this.c.b() && (arr.c().e() & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                        throw new JSONException(b.this.c.d("input not end"));
                    }
                    return t;
                }
            });
            return this;
        }

        public b a(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4db281d8", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            }
            if (bArr != null && i2 > 0 && bArr.length >= i + i2) {
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                allocate.put(bArr, i, i2);
                allocate.flip();
                this.c.a(allocate);
            }
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("583fe95f", new Object[]{this});
            }
            aod aodVar = this.c;
            aodVar.a(aodVar.J);
            return this;
        }

        public T b() throws ExecutionException, InterruptedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.f25538a.get();
        }
    }
}
