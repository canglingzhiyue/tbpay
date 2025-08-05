package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.detail.activity.DetailActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class dwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LinkedList<a> f27028a;
    public static HashMap<String, DetailActivity> b;
    private static boolean c;
    private static int d;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public DetailActivity f27029a;

        static {
            kge.a(930694080);
        }

        public a(DetailActivity detailActivity) {
            this.f27029a = detailActivity;
        }
    }

    static {
        kge.a(-595512012);
        c = false;
        d = 2;
        f27028a = new LinkedList<>();
        b = new HashMap<>();
    }

    public static void a(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba43f7", new Object[]{detailActivity});
        } else if (detailActivity == null) {
        } else {
            Iterator<a> it = f27028a.iterator();
            while (it.hasNext()) {
                if (it.next().f27029a == detailActivity) {
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = "webview register plugin " + (currentTimeMillis2 - currentTimeMillis);
            f27028a.add(new a(detailActivity));
            b.put(detailActivity.toString(), detailActivity);
            if (f27028a.size() <= d) {
                return;
            }
            DetailActivity detailActivity2 = f27028a.poll().f27029a;
            b.remove(detailActivity2.toString());
            detailActivity2.finish();
        }
    }

    public static void b(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8092de56", new Object[]{detailActivity});
            return;
        }
        a aVar = null;
        Iterator<a> it = f27028a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (detailActivity == next.f27029a) {
                aVar = next;
                break;
            }
        }
        if (aVar == null) {
            return;
        }
        f27028a.remove(aVar);
        b.remove(aVar.f27029a.toString());
    }

    public static DetailActivity a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailActivity) ipChange.ipc$dispatch("256e341", new Object[]{str}) : b.get(str);
    }
}
