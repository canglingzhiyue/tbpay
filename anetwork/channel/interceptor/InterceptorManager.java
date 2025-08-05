package anetwork.channel.interceptor;

import android.support.v4.util.Pair;
import anet.channel.util.ALog;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes.dex */
public class InterceptorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.InterceptorManager";
    private static final CopyOnWriteArrayList<Interceptor> interceptors;
    private static Interceptor privacyInterceptor;
    private static Interceptor securityInterceptor;

    static {
        kge.a(1804155456);
        interceptors = new CopyOnWriteArrayList<>();
        securityInterceptor = null;
        privacyInterceptor = null;
    }

    private InterceptorManager() {
    }

    public static void addInterceptor(Interceptor interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde0e5ad", new Object[]{interceptor});
        } else if (interceptors.contains(interceptor) || interceptor == null) {
        } else {
            interceptors.add(interceptor);
            boolean contains = interceptor.toString().toLowerCase().contains(Baggage.Amnet.CFG_SSL);
            boolean contains2 = interceptor.toString().toLowerCase().contains("aliprivacyext");
            if (contains) {
                securityInterceptor = interceptor;
            }
            if (contains2) {
                privacyInterceptor = interceptor;
            }
            ALog.e(TAG, "[Interceptor] addInterceptor", null, BindingXConstants.KEY_INTERCEPTORS, interceptors.toString(), "securityInterceptor", securityInterceptor, "privacyInterceptor", privacyInterceptor);
        }
    }

    public static Pair<Integer, Interceptor> getInterceptor(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e26d3d18", new Object[]{new Integer(i), new Long(j)});
        }
        while (i < interceptors.size()) {
            Interceptor interceptor = interceptors.get(i);
            if (((2 & j) == 0 || interceptor != privacyInterceptor) && ((1 & j) == 0 || interceptor != securityInterceptor)) {
                return new Pair<>(Integer.valueOf(i), interceptor);
            }
            i++;
        }
        return new Pair<>(Integer.valueOf(i), null);
    }

    public static void removeInterceptor(Interceptor interceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426bc72a", new Object[]{interceptor});
        } else if (!interceptors.contains(interceptor)) {
        } else {
            interceptors.remove(interceptor);
        }
    }

    public static Interceptor getInterceptor(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interceptor) ipChange.ipc$dispatch("b400bccb", new Object[]{new Integer(i)}) : interceptors.get(i);
    }

    public static boolean contains(Interceptor interceptor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("356e7dcc", new Object[]{interceptor})).booleanValue() : interceptors.contains(interceptor);
    }

    public static int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[0])).intValue() : interceptors.size();
    }
}
