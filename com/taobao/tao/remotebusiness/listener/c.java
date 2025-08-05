package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteProcessListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(341294154);
    }

    public static MtopListener a(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        Object newProxyInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            newProxyInstance = ipChange.ipc$dispatch("f498c8b0", new Object[]{mtopBusiness, mtopListener});
        } else {
            ArrayList arrayList = new ArrayList();
            if (mtopListener instanceof IRemoteProcessListener) {
                arrayList.add(MtopCallback.MtopProgressListener.class);
                arrayList.add(MtopCallback.MtopHeaderListener.class);
            }
            if ((mtopListener instanceof IRemoteCacheListener) || mtopBusiness.mtopProp.useCache) {
                arrayList.add(MtopCallback.MtopCacheListener.class);
            }
            arrayList.add(mtopListener instanceof IMtopStreamListener ? MtopCallback.MtopStreamListener.class : MtopCallback.MtopFinishListener.class);
            newProxyInstance = Proxy.newProxyInstance(MtopListener.class.getClassLoader(), (Class[]) arrayList.toArray(new Class[arrayList.size()]), new a(mtopBusiness, mtopListener));
        }
        return (MtopListener) newProxyInstance;
    }
}
