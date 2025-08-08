package com.taobao.android.detail.ttdetail.async.mtop;

import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncModule;
import com.taobao.android.detail.ttdetail.utils.aq;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f10497a;
    private static Handler b;
    private String c;
    private String d;
    private JSONObject e;

    /* renamed from: com.taobao.android.detail.ttdetail.async.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0402a {
        void a(JSONObject jSONObject);

        void a(String str);
    }

    static {
        kge.a(-1922962445);
        HandlerThread handlerThread = new HandlerThread("TTDetailAsyncComponent");
        f10497a = handlerThread;
        handlerThread.start();
        b = new Handler(f10497a.getLooper());
    }

    public a(AsyncModule.a aVar) {
        this.c = aVar.a();
        this.d = aVar.b();
        this.e = new JSONObject(aq.a((Map<String, Object>) aVar.c()));
    }

    public void a(final InterfaceC0402a interfaceC0402a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1e5fdc", new Object[]{this, interfaceC0402a});
        } else if (interfaceC0402a == null || StringUtils.isEmpty(this.c) || StringUtils.isEmpty(this.d) || this.e == null) {
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setData(this.e.toJSONString());
            mtopRequest.setApiName(this.c);
            mtopRequest.setVersion(this.d);
            RemoteBusiness build = RemoteBusiness.build(mtopRequest);
            build.mo1296handler(b);
            build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.async.mtop.MtopRequester$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        error("onSystemError", mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    if (mtopResponse == null || mtopResponse.getBytedata() == null || !mtopResponse.isApiSuccess()) {
                        error("onSuccess", mtopResponse);
                    }
                    interfaceC0402a.a(JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data"));
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        error("onError", mtopResponse);
                    }
                }

                private void error(String str, MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f4ec1e", new Object[]{this, str, mtopResponse});
                        return;
                    }
                    String str2 = "source=" + str;
                    try {
                        if (mtopResponse != null) {
                            str2 = str2 + ", api=" + mtopResponse.getApi() + ", isApiSuccess=" + mtopResponse.isApiSuccess() + ", ResponseErrorMsg: " + mtopResponse.getRetMsg();
                        } else {
                            str2 = str2 + "mtopResponse null";
                        }
                        interfaceC0402a.a(str2);
                        i.a("MtopRequester", str2);
                    } catch (Throwable th) {
                        i.a("MtopRequester", str2 + "exception=" + Log.getStackTraceString(th));
                    }
                }
            });
            build.mo1305reqMethod(MethodEnum.POST);
            build.startRequest();
        }
    }
}
