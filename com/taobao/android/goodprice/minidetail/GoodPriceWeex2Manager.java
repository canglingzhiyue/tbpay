package com.taobao.android.goodprice.minidetail;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodPriceWeex2Manager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final GoodPriceWeex2Manager f12719a;

        static {
            kge.a(-489941586);
            f12719a = new GoodPriceWeex2Manager();
        }
    }

    static {
        kge.a(805484887);
    }

    public void preloadMiniDetailInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498d40bb", new Object[]{this, context});
        }
    }

    public static synchronized GoodPriceWeex2Manager getInstance() {
        synchronized (GoodPriceWeex2Manager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GoodPriceWeex2Manager) ipChange.ipc$dispatch("60b32ccc", new Object[0]);
            }
            return a.f12719a;
        }
    }
}
