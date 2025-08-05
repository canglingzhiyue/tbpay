package com.taobao.tab2interact.core.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* loaded from: classes8.dex */
    public interface a {
        void a(MtopResponse mtopResponse);

        void b(MtopResponse mtopResponse);
    }

    /* loaded from: classes8.dex */
    public static abstract class b<Data> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(84607445);
        }

        public abstract String a();

        public abstract String b();

        public abstract boolean c();

        public abstract Map<String, String> d();

        public abstract Data f();

        public abstract void setApi(String str);

        public abstract void setData(Data data);

        public abstract void setHeaders(Map<String, String> map);

        public abstract void setNeedSession(boolean z);

        public abstract void setVersion(String str);
    }

    static {
        kge.a(1213183396);
        INSTANCE = new c();
    }

    private c() {
    }

    public static final /* synthetic */ void a(c cVar, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11c1472", new Object[]{cVar, mtopResponse, aVar});
        } else {
            cVar.a(mtopResponse, aVar);
        }
    }

    public static final /* synthetic */ void b(c cVar, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dca3df3", new Object[]{cVar, mtopResponse, aVar});
        } else {
            cVar.b(mtopResponse, aVar);
        }
    }

    public final void a(b<?> requestParams, final a onRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f4e82f", new Object[]{this, requestParams, onRequestListener});
            return;
        }
        q.d(requestParams, "requestParams");
        q.d(onRequestListener, "onRequestListener");
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(requestParams.a());
        mtopRequest.setVersion(requestParams.b());
        mtopRequest.setNeedSession(requestParams.c());
        mtopRequest.setData(JSONObject.toJSONString(requestParams.f()));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1297headers(requestParams.d());
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tab2interact.core.utils.MtopUtils$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    c.a(c.INSTANCE, mtopResponse, c.a.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    c.b(c.INSTANCE, mtopResponse, c.a.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    c.b(c.INSTANCE, mtopResponse, c.a.this);
                }
            }
        });
        build.startRequest();
    }

    private final void a(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa351061", new Object[]{this, mtopResponse, aVar});
        } else {
            aVar.a(mtopResponse);
        }
    }

    private final void b(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15df2a2", new Object[]{this, mtopResponse, aVar});
        } else {
            aVar.b(mtopResponse);
        }
    }
}
