package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;

/* loaded from: classes5.dex */
public class afa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, a> f25298a = new ConcurrentHashMap();
    private final Map<Integer, aez> b = new ConcurrentHashMap();

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ion f25299a;

        static {
            kge.a(211464408);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final afa f25300a;

        static {
            kge.a(1759844047);
            f25300a = new afa();
        }
    }

    static {
        kge.a(1832974239);
    }

    public static afa a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (afa) ipChange.ipc$dispatch("f0247c2", new Object[0]) : b.f25300a;
    }

    private void b(int i, aez aezVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d600cc14", new Object[]{this, new Integer(i), aezVar});
        } else if (this.b.containsKey(Integer.valueOf(i))) {
        } else {
            this.b.put(Integer.valueOf(i), aezVar);
        }
    }

    private aez b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aez) ipChange.ipc$dispatch("d4e236f6", new Object[]{this, new Integer(i)});
        }
        if (!this.b.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.b.get(Integer.valueOf(i));
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        this.b.remove(Integer.valueOf(identityHashCode));
        this.f25298a.remove(Integer.valueOf(identityHashCode));
    }

    public void a(Context context, aez aezVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f83e3a", new Object[]{this, context, aezVar});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        b(identityHashCode, aezVar);
        a(identityHashCode, aezVar);
    }

    private a a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cb575712", new Object[]{this, new Integer(i)});
        }
        a aVar = this.f25298a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f25299a = new ion();
        this.f25298a.put(Integer.valueOf(i), aVar2);
        ard a2 = arc.a();
        arc.a a3 = arc.a.a().b("LightBuyDataSourceManager").a("LightBuy/common");
        a2.b("新增数据", a3.a("info", "加入新的数据源 " + i + " ;size:" + this.f25298a.size()).b());
        return aVar2;
    }

    private synchronized void a(int i, aez aezVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4230275", new Object[]{this, new Integer(i), aezVar});
        } else if (!this.f25298a.containsKey(Integer.valueOf(i))) {
            ard a2 = arc.a();
            arc.a a3 = arc.a.a().b("LightBuyDataSourceManager").a("LightBuy/common");
            a2.b("dataSource 未找到对应的identify", a3.a("info", "dataSource 未找到对应的identify " + i).b());
            afk.b("resultModule is null", null);
            aezVar.a("NO_DATA", "resultModule is null");
        } else {
            ion ionVar = this.f25298a.remove(Integer.valueOf(i)).f25299a;
            if (ionVar == null) {
                arc.a().b("bindDataChanged 成功，当前没有数据", arc.a.a().b("LightBuyDataSourceManager").a("LightBuy/common").a("info", "bindDataChanged 成功，当前没有数据").b());
                afk.b("没有数据", null);
                aezVar.a("NO_DATA", "resultModule is null");
                return;
            }
            JSONObject a4 = a(ionVar);
            if (a4.size() == 0) {
                arc.a().b("bindDataChanged 成功，当前没有数据", arc.a.a().b("LightBuyDataSourceManager").a("LightBuy/common").a("info", "bindDataChanged 成功，当前没有数据").b());
                afk.b("没有数据", null);
                aezVar.a("NO_DATA", "没有数据");
                return;
            }
            aezVar.a(a4);
        }
    }

    public synchronized void a(Context context, JSONObject jSONObject, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12e4f81", new Object[]{this, context, jSONObject, list});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        ion ionVar = a(identityHashCode).f25299a;
        if (ionVar != null) {
            if (jSONObject != null) {
                ionVar.b(jSONObject);
            }
            if (list != null && list.size() > 0) {
                ionVar.a(list);
                arc.a().b("副响应数据返回", arc.a.a().b("LightBuyDataSourceManager").a("LightBuy/common").a("info", "副响应数据返回").b());
            }
        }
        aez b2 = b(identityHashCode);
        if (b2 != null) {
            arc.a().b("通知前端更新数据", arc.a.a().a("LightBuy/preload").b());
            a(identityHashCode, b2);
            return;
        }
        arc.a().b("数据回来，数据还未bind", arc.a.a().b("LightBuyDataSourceManager").a("LightBuy/common").a("info", "数据回来，数据还未bind").b());
    }

    public synchronized void a(Context context, JSONObject jSONObject) {
        ion ionVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        ion ionVar2 = a(identityHashCode).f25299a;
        if (ionVar2 != null && jSONObject != null) {
            ionVar2.a(jSONObject);
        }
        aez b2 = b(identityHashCode);
        if (b2 != null && (ionVar = this.f25298a.remove(Integer.valueOf(identityHashCode)).f25299a) != null) {
            b2.a(a(ionVar));
        }
    }

    private synchronized JSONObject a(ion ionVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bb7464f0", new Object[]{this, ionVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject b2 = ionVar.b();
        if (b2 != null) {
            jSONObject.put("mainResponse", (Object) b2);
        }
        List<JSONObject> c = ionVar.c();
        if (c != null && !c.isEmpty()) {
            jSONObject.put("attachedResponses", (Object) c);
        }
        JSONObject a2 = ionVar.a();
        if (a2 != null) {
            jSONObject.put("requestParams", (Object) a2);
        }
        return jSONObject;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f25298a.remove(Integer.valueOf(System.identityHashCode(context)));
        }
    }
}
