package tb;

import android.content.Context;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.icart.core.performance.cache.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class ipr extends idl<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1264548115);
    }

    @Override // tb.idl
    public Object a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)});
        }
        return null;
    }

    @Override // tb.idl
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        b.a();
        CartFirstPageCache.loadFirstPageCacheData(new CartFirstPageCache.b() { // from class: tb.ipr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                }
            }

            @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.b
            public void a(CartFirstPageCache.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2df42844", new Object[]{this, aVar});
                } else {
                    jqg.b("iCart", "CartFirstPageCachePreloader#CartFirstPageCache预加载成功");
                }
            }
        });
        jqg.b("iCart", "CartFirstPageCachePreloader预加载成功");
    }
}
