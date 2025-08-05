package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class jzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int c;

    /* renamed from: a  reason: collision with root package name */
    private LinkedHashMap<g, a> f29886a = new LinkedHashMap<>();
    private Handler b = new Handler(Looper.getMainLooper()) { // from class: tb.jzm.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message == null || message.what != jzm.b()) {
            } else {
                jzm.a(jzm.this);
            }
        }
    };

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public g f29888a;
        public JSONObject b;
        public int c;

        static {
            kge.a(-882242019);
        }
    }

    public static /* synthetic */ void a(jzm jzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f060609b", new Object[]{jzmVar});
        } else {
            jzmVar.c();
        }
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    static {
        kge.a(-1115769241);
        c = 1000;
    }

    public void a(g gVar, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cac85e", new Object[]{this, gVar, jSONObject, new Integer(i)});
            return;
        }
        a aVar = new a();
        aVar.f29888a = gVar;
        aVar.b = jSONObject;
        aVar.c = i;
        his.b("GoodsRenderDispatch", "addRenderTask | oldTask=" + this.f29886a.put(gVar, aVar) + "    index=" + aVar.c);
        this.b.sendEmptyMessage(c);
    }

    private void c() {
        a next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f29886a.size() <= 0 || (next = this.f29886a.values().iterator().next()) == null || next.f29888a == null || next.b == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (next.f29888a.d() != null) {
                next.f29888a.d().a(next.f29888a, next.b, next.c);
                hib.b();
            }
            his.b("GoodsRenderDispatch", "executeTask | tasks size=" + this.f29886a.size() + " time=" + (System.currentTimeMillis() - currentTimeMillis));
            this.f29886a.remove(next.f29888a);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        his.b("GoodsRenderDispatch", "destroy | tasks size=" + this.f29886a.size());
        this.b.removeMessages(c);
        this.f29886a.clear();
    }
}
