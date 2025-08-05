package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.alimama.utils.c;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.homepage.datasource.b;
import java.util.Map;

/* loaded from: classes.dex */
public class ktq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_STATE = "gateway_state";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30309a;

    static {
        kge.a(2129091699);
        f30309a = false;
    }

    public static synchronized b a(OnDataSourceUpdatedListener onDataSourceUpdatedListener, String str, Map<String, b> map) {
        synchronized (ktq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("706f958c", new Object[]{onDataSourceUpdatedListener, str, map});
            }
            b bVar = map.get(str);
            if (bVar == null) {
                bVar = new ktr(onDataSourceUpdatedListener, str);
                map.put(str, bVar);
            }
            return bVar;
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        try {
            AlimamaAdvertising.instance().setApplicationContext(application);
            f30309a = c.f();
        } catch (Throwable th) {
            e.b("mCreativeView", th, new String[0]);
        }
        e.b("mCreativeView", "是否开启广告创意组件 mCreativeView = " + f30309a);
    }
}
