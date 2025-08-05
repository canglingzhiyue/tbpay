package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.model.ZCacheResourceResponse;
import com.taobao.zcachecorewrapper.IZCacheCore;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static p f23657a;

    static {
        kge.a(428591985);
    }

    private p() {
    }

    public static p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("e235367d", new Object[0]);
        }
        if (f23657a == null) {
            synchronized (p.class) {
                if (f23657a == null) {
                    f23657a = new p();
                }
            }
        }
        return f23657a;
    }

    @Deprecated
    public ZCacheResourceResponse a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZCacheResourceResponse) ipChange.ipc$dispatch("68e4cf62", new Object[]{this, str}) : a(str, new HashMap());
    }

    @Deprecated
    public ZCacheResourceResponse a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZCacheResourceResponse) ipChange.ipc$dispatch("5468fc61", new Object[]{this, str, map});
        }
        ResourceResponse a2 = n.a(new ResourceRequest(str, map));
        ZCacheResourceResponse zCacheResourceResponse = new ZCacheResourceResponse();
        if (a2 == null) {
            zCacheResourceResponse.isSuccess = false;
            zCacheResourceResponse.status = 0;
            zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_RESPONSE;
        } else {
            zCacheResourceResponse.headers = a2.getHeader();
            if (zCacheResourceResponse.headers != null && zCacheResourceResponse.headers.containsKey("X-ZCache-Info")) {
                zCacheResourceResponse.zcacheInfo = zCacheResourceResponse.headers.get("X-ZCache-Info");
            } else {
                zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_HEADER;
            }
            if (a2.getError() == null) {
                zCacheResourceResponse.inputStream = new ByteArrayInputStream(a2.getData());
                zCacheResourceResponse.isSuccess = true;
                zCacheResourceResponse.status = 2;
            } else {
                zCacheResourceResponse.isSuccess = false;
                zCacheResourceResponse.status = 1;
            }
        }
        return zCacheResourceResponse;
    }

    @Deprecated
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : n.b(str);
    }

    @Deprecated
    public void a(String str, String str2, int i, final IZCacheCore.UpdateCallback updateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187f2562", new Object[]{this, str, str2, new Integer(i), updateCallback});
        } else {
            n.a(new PackRequest(str, str2), new PackUpdateFinishedCallback() { // from class: com.taobao.zcache.p.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.zcache.PackUpdateFinishedCallback
                public void finish(String str3, Error error) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("abd8ffc9", new Object[]{this, str3, error});
                        return;
                    }
                    IZCacheCore.UpdateCallback updateCallback2 = updateCallback;
                    if (updateCallback2 == null) {
                        return;
                    }
                    updateCallback2.finish(str3, new com.taobao.zcachecorewrapper.model.Error(error));
                }
            });
        }
    }

    @Deprecated
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : n.a(str, str2);
    }

    @Deprecated
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            n.b(str, null);
        }
    }

    @Deprecated
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            n.e();
        }
    }
}
