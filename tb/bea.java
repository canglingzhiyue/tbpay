package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class bea {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f25830a = false;
    private static final List<String> c;
    public static final String sNamespace = "cart_switch";

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        f25830a = z;
        return z;
    }

    public static /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            r();
        }
    }

    static {
        kge.a(-1279220632);
        c = new CopyOnWriteArrayList();
        f25830a = false;
        OrangeConfig.getInstance().registerListener(new String[]{"cart_switch"}, new d() { // from class: tb.bea.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!"cart_switch".equals(str)) {
                } else {
                    bea.f();
                    DataBizContext.ShareContext.updateOnlySPForOrangeChange();
                    bea.a(true);
                }
            }
        }, true);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f25830a;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : spk.a("cart_switch", "needUseLocalInCalculatePop", false);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : spk.a("aura_purchase_perf", "enableCartDataTransmit", true);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : spk.a("aura_purchase_perf", "enableICartAsyncUT", true);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : spk.a("cart_switch", "enableCouponPerf", true);
    }

    public static List<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4f19870", new Object[0]);
        }
        if (!c.isEmpty()) {
            return c;
        }
        try {
            Iterator<Object> it = JSONObject.parseArray(OrangeConfig.getInstance().getConfig("cart_switch", "widgetIds", "[\"taoTrade\",\"taoCartsMini\"]")).iterator();
            while (it.hasNext()) {
                c.add(String.valueOf(it.next()));
            }
        } catch (Exception unused) {
        }
        return c;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : spk.a("cart_switch", "enablePrefetchViewV2", true);
    }

    private static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[0]);
        } else {
            c.clear();
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : spk.a("cart_switch", "enableTouchDownPerf", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : spk.a("cart_switch", "enablePrefetchV2Perf", true);
    }
}
