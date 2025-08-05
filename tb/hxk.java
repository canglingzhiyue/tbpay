package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.network.OrderRequestClient;
import com.taobao.tao.util.TaoHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f28833a;
    public static int b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    private Activity h;
    private hxs i;
    private hxn j = new hxn();
    private OrderRequestClient k;

    static {
        kge.a(325561504);
        f28833a = 3;
        b = 2;
        c = "mtop.relationrecommend.WirelessRecommend.recommend";
        d = "1.0";
        e = "appId";
        f = "1616";
        g = "params";
    }

    public hxk(Activity activity) {
        this.h = activity;
        this.i = new hxs(this.h);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        OrderRequestClient orderRequestClient = this.k;
        if (orderRequestClient != null) {
            orderRequestClient.onCancelRequest();
        }
        hxs hxsVar = this.i;
        if (hxsVar != null) {
            hxsVar.d();
        }
        this.k = null;
        this.j = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hxm c2 = hya.a(this.h).c();
        ArrayList arrayList = new ArrayList();
        if (c2 == null) {
            for (int i = 0; i < this.i.c().size(); i++) {
                hxl hxlVar = this.i.c().get(i);
                if ((hxlVar instanceof hxm) || (hxlVar instanceof hxn)) {
                    arrayList.add(hxlVar);
                }
            }
            this.i.b(arrayList);
            return;
        }
        if (!this.i.c().contains(this.j)) {
            arrayList.add(this.j);
        }
        arrayList.add(c2);
        this.i.a(arrayList, 0);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.i.a();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.i.c(f());
        this.k = new OrderRequestClient();
        this.k.initParam(c, d, TaoHelper.getTTID(), e(), new hxi(this));
        this.k.onStartRequest();
    }

    private List<hxl> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        hxm c2 = hya.a(this.h).c();
        if (c2 != null && c2.f28834a != null && !c2.f28834a.isEmpty()) {
            arrayList.add(this.j);
            arrayList.add(c2);
        }
        return arrayList;
    }

    public void a(List<? extends hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && this.i != null && !list.isEmpty()) {
            this.i.a(list);
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.i.c().size(); i++) {
                hxl hxlVar = this.i.c().get(i);
                if ((hxlVar instanceof hxo) || (hxlVar instanceof hxp) || (hxlVar instanceof hxq) || (hxlVar instanceof hxr)) {
                    arrayList.add(hxlVar);
                }
            }
            this.i.b(arrayList);
        }
    }

    public static Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(e, f);
        hashMap.put(g, "{\"count\":\"6\"}");
        return hashMap;
    }
}
