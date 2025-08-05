package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.request.b;
import com.alibaba.android.icart.core.data.request.c;
import com.alibaba.android.icart.core.data.request.d;
import com.alibaba.android.icart.core.data.request.e;
import com.alibaba.android.icart.core.data.request.f;
import com.alibaba.android.icart.core.data.request.g;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1422420284);
    }

    public static b a(bcb bcbVar, RequestConfig.RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("758cad2c", new Object[]{bcbVar, requestType});
        }
        if (requestType == RequestConfig.RequestType.LOAD_CACHE_DATA) {
            return new c(bcbVar);
        }
        if (requestType == RequestConfig.RequestType.QUERY_CART_PAGE) {
            return new e(bcbVar);
        }
        if (requestType == RequestConfig.RequestType.QUERY_CART_NEXT_PAGE) {
            return new d(bcbVar);
        }
        if (requestType == RequestConfig.RequestType.UPDATE) {
            return new g(bcbVar);
        }
        if (requestType != RequestConfig.RequestType.UPDATE_STRUCTURE) {
            return null;
        }
        return new f(bcbVar);
    }
}
