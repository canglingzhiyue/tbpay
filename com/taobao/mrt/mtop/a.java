package com.taobao.mrt.mtop;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f18248a;

    static {
        kge.a(1446955411);
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f766d0cc", new Object[0]);
            }
            if (f18248a == null) {
                f18248a = new a();
            }
            return f18248a;
        }
    }

    public void a(b bVar, Map<String, String> map, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3a22fc", new Object[]{this, bVar, map, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(bVar.f18249a);
        mtopRequest.setVersion(bVar.b);
        mtopRequest.setNeedEcode(bVar.d);
        mtopRequest.setNeedSession(bVar.c);
        if (map == null || map.isEmpty()) {
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(bVar.e));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            if (bVar.e != null) {
                hashMap.putAll(bVar.e);
            }
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        String str = c.f18243a;
        if (!StringUtils.isEmpty(str)) {
            build.mo1332ttid(str);
        } else {
            com.taobao.mrt.utils.a.b("DataSender", "TTID为空！");
        }
        build.mo1342showLoginUI(bVar.g);
        build.mo1305reqMethod(bVar.f);
        build.requestContext = bVar;
        if (bVar.h) {
            build.mo1335useWua();
        }
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mrt.mtop.DataSender$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onSuccess(i, mtopResponse, baseOutDo, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onError(i, mtopResponse, obj);
            }
        });
        build.startRequest();
    }
}
