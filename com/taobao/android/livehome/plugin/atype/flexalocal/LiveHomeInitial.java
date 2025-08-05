package com.taobao.android.livehome.plugin.atype.flexalocal;

import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cak;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class LiveHomeInitial implements Serializable, cak {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean ONCE;
    private static final String TAG;

    static {
        kge.a(275759340);
        kge.a(85589420);
        kge.a(1028243835);
        TAG = LiveHomeInitial.class.getName();
        ONCE = new AtomicBoolean(false);
    }

    @Override // tb.cak
    public void init(Application application, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
            return;
        }
        e.c(riy.ARRAY_START_STR + TAG + "] init");
        if (!ONCE.compareAndSet(false, true)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ITaoLiveHomePageProxy.KEY, new TaoLiveHomePageX());
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            e.c(riy.ARRAY_START_STR + TAG + "] init, class load success: " + ((IProxy) ((Map.Entry) it.next()).getValue()).getClass().getName());
        }
        c.a().a(hashMap);
        c.a().a(true);
    }
}
