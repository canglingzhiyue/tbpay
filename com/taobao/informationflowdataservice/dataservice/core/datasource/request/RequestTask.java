package com.taobao.informationflowdataservice.dataservice.core.datasource.request;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.gjv;
import tb.kge;
import tb.lxo;
import tb.lxp;
import tb.lxs;
import tb.lxv;

/* loaded from: classes7.dex */
public class RequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RemoteBusiness f17584a;
    private AwesomeGetRequestParams b;
    private a c;
    private b d;
    private AwesomeMtopListener e = new AwesomeMtopListener();

    static {
        kge.a(-332304373);
    }

    public static /* synthetic */ b a(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d4de8a66", new Object[]{requestTask}) : requestTask.d;
    }

    public static /* synthetic */ void a(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23aa1f3", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.a(mtopResponse);
        }
    }

    public static /* synthetic */ void b(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56c9992", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.b(mtopResponse);
        }
    }

    public RequestTask(AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
        this.b = awesomeGetRequestParams;
        this.c = aVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c.b;
    }

    public Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.b.getContainerParams().keySet();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.f17584a;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }

    public boolean a(String str, String str2) {
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        if (awesomeGetRequestParams != null && awesomeGetRequestParams.getContainerParams() != null && (awesomeGetContainerParams = this.b.getContainerParams().get(str2)) != null) {
            return str.equals(awesomeGetContainerParams.getRequestType());
        }
        return false;
    }

    public String a(String str) {
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.b;
        return (awesomeGetRequestParams == null || awesomeGetRequestParams.getContainerParams() == null || (awesomeGetContainerParams = this.b.getContainerParams().get(str)) == null) ? "" : awesomeGetContainerParams.getRequestType();
    }

    public void a(b bVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf51be5", new Object[]{this, bVar, map});
            return;
        }
        this.d = bVar;
        lxo.b("gateway2-RequestTask.execute", "");
        if (b().size() == 0) {
            return;
        }
        this.f17584a = RemoteBusiness.build((IMTOPDataObject) this.b, gjv.b);
        a aVar = this.c;
        if (aVar != null && aVar.c != null) {
            this.f17584a.mo1305reqMethod(this.c.c);
        }
        if (map != null) {
            this.f17584a.mo1297headers(map);
        }
        this.f17584a.registerListener((IRemoteListener) this.e).startRequest(AwesomeGetResponse.class);
    }

    /* loaded from: classes7.dex */
    public class AwesomeMtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-750825370);
            kge.a(-525336021);
        }

        public AwesomeMtopListener() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                onError(i, mtopResponse, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (isResponseEmpty(baseOutDo)) {
                process(false, null, mtopResponse, obj);
                com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.b("netRequest", "result_error", "网络请求结果数据为空", "gateway.RequestTask", "response is empty");
            } else {
                process(true, ((AwesomeGetResponse) baseOutDo).mo2429getData(), mtopResponse, obj);
                RequestTask.a(RequestTask.this, mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            process(false, null, mtopResponse, obj);
            RequestTask.a(RequestTask.this, mtopResponse);
        }

        private boolean isResponseEmpty(BaseOutDo baseOutDo) {
            AwesomeGetData mo2429getData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8fc1675", new Object[]{this, baseOutDo})).booleanValue();
            }
            if (baseOutDo == null || baseOutDo.mo2429getData() == null || !(baseOutDo instanceof AwesomeGetResponse) || (mo2429getData = ((AwesomeGetResponse) baseOutDo).mo2429getData()) == null || mo2429getData.getContainers() == null || mo2429getData.getContainers().isEmpty()) {
                return true;
            }
            boolean z = true;
            for (AwesomeGetContainerData awesomeGetContainerData : mo2429getData.getContainers().values()) {
                if (awesomeGetContainerData.getBaseData() == null && awesomeGetContainerData.getDeltaData() == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            }
            return z;
        }

        public void process(boolean z, AwesomeGetData awesomeGetData, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d174b88", new Object[]{this, new Boolean(z), awesomeGetData, mtopResponse, obj});
                return;
            }
            if (z) {
                if (RequestTask.a(RequestTask.this) != null) {
                    RequestTask.a(RequestTask.this).a(awesomeGetData);
                }
            } else {
                if (mtopResponse != null) {
                    if (!StringUtils.isEmpty(mtopResponse.getMtopStat().fullTraceId)) {
                        lxv.a(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "fullTraceID", mtopResponse.getMtopStat().fullTraceId);
                    } else {
                        lxv.a(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null, null);
                    }
                }
                if (RequestTask.a(RequestTask.this) != null) {
                    RequestTask.a(RequestTask.this).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }
            lxo.b("gateway2-RequestTask.process", mtopResponse.getRetCode() + "," + mtopResponse.getApi());
        }
    }

    private void a(final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (this.b == null || mtopResponse == null || mtopResponse.getMtopStat() == null) {
        } else {
            if (lxp.a()) {
                lxs.a().a(new Runnable() { // from class: com.taobao.informationflowdataservice.dataservice.core.datasource.request.RequestTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            RequestTask.b(RequestTask.this, mtopResponse);
                        }
                    }
                });
            } else {
                b(mtopResponse);
            }
            c.a(mtopResponse, c.a(this.b));
        }
    }

    private void b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
            return;
        }
        try {
            com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.a("netRequest", "gateway.RequestTask", "AwesomeGetRequestParams ：" + JSON.toJSONString(this.b) + " ---- result : " + new String(mtopResponse.getBytedata()));
        } catch (OutOfMemoryError unused) {
            com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.b("netRequest", "gateway.RequestTask", "oom, no log.", "", "");
        } catch (Throwable th) {
            com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.b("netRequest", "gateway.RequestTask", "log error, no log.", "", th.getMessage());
        }
    }
}
