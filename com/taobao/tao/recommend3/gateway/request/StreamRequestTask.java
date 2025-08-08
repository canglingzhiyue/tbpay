package com.taobao.tao.recommend3.gateway.request;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.home.component.utils.m;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.i;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetResponse;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.global.SDKUtils;
import tb.gjv;
import tb.kge;
import tb.ksr;
import tb.lap;
import tb.lar;
import tb.oqc;
import tb.oqd;

/* loaded from: classes8.dex */
public class StreamRequestTask extends RequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AwesomeGetData l;
    private AwesomeMtopStreamListener m;

    static {
        kge.a(828551633);
    }

    public static /* synthetic */ Object ipc$super(StreamRequestTask streamRequestTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(StreamRequestTask streamRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e619568", new Object[]{streamRequestTask});
        } else {
            streamRequestTask.d();
        }
    }

    public static /* synthetic */ void a(StreamRequestTask streamRequestTask, d dVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e4bae7", new Object[]{streamRequestTask, dVar, map, new Boolean(z)});
        } else {
            streamRequestTask.a(dVar, map, z);
        }
    }

    public static /* synthetic */ void a(StreamRequestTask streamRequestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13033532", new Object[]{streamRequestTask, str});
        } else {
            streamRequestTask.b(str);
        }
    }

    public static /* synthetic */ void a(StreamRequestTask streamRequestTask, Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2b73b1", new Object[]{streamRequestTask, map, str, str2});
        } else {
            streamRequestTask.a(map, str, str2);
        }
    }

    public static /* synthetic */ void a(StreamRequestTask streamRequestTask, boolean z, boolean z2, com.taobao.tao.stream.d dVar, com.taobao.tao.stream.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3798aa", new Object[]{streamRequestTask, new Boolean(z), new Boolean(z2), dVar, bVar});
        } else {
            streamRequestTask.a(z, z2, dVar, bVar);
        }
    }

    public StreamRequestTask(AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
        super(awesomeGetRequestParams, aVar);
        this.m = new AwesomeMtopStreamListener();
        awesomeGetRequestParams.API_NAME = "mtop.taobao.wireless.home.newface.stream.get";
        this.j = awesomeGetRequestParams.API_NAME;
    }

    @Override // com.taobao.tao.recommend3.gateway.request.RequestTask
    public void a(d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c817808d", new Object[]{this, dVar, map});
        } else {
            a(dVar, map, false);
        }
    }

    private void a(d dVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad943e7", new Object[]{this, dVar, map, new Boolean(z)});
            return;
        }
        this.e = dVar;
        this.i = map;
        if (b().isEmpty()) {
            return;
        }
        this.f = a(b().iterator().next());
        if (!z && StringUtils.equals(this.f, "coldStart")) {
            String a2 = a(true);
            if (StringUtils.equals(a2, "code_sign_free")) {
                this.c.API_NAME = "mtop.taobao.wireless.home.newface.stream.newget";
            } else {
                com.taobao.android.home.component.utils.e.e("gateway.StreamRequestTask", "SignFree code value:" + a2);
                ksr.b("sign_free_error_code", a2);
            }
        } else {
            this.c.API_NAME = this.j;
        }
        this.c.tryRequest = z;
        this.b = RemoteBusiness.build((IMTOPDataObject) this.c, gjv.b);
        this.b.mo1310setBizTopic(this.f);
        this.b.mo1333upstreamCompress(true);
        this.b.streamMode(true);
        this.b.registerListener((IMtopStreamListener) this.m);
        if (this.d != null && this.d.c != null) {
            this.b.mo1305reqMethod(this.d.c);
        }
        if (map != null) {
            this.b.mo1297headers(map);
        }
        Boolean bool = (Boolean) m.a().a("enableZSTDDCompress", Boolean.class);
        if (bool != null && bool.booleanValue()) {
            this.b.mo1331supportZstdDictionary(true);
        }
        this.b.mo1296handler(com.taobao.gateway.dispatch.a.b().d());
        if (j.a("mtopStreamParse", true)) {
            this.b.mo1330supportStreamJson(true);
        }
        if (StringUtils.equals(this.f, "coldStart")) {
            this.f20907a.b("mtopRequestParams");
            this.f20907a.a("mtopRequest", 1);
        }
        if (this.d != null && this.d.d) {
            lap.a("MTopRequest", "doRequest", " 预加载请求, requestType:" + this.f);
            this.g.a(this.b, this.d, this.c);
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        if (com.taobao.homepage.utils.m.a(this.f, dVar)) {
            lap.a("MTopRequest", "doRequest", " mock本地数据直接返回, requestType =" + this.f);
            return;
        }
        lap.a("MTopRequest", "doRequest", " stream 调用网络库开始正常发起请求");
        this.k = SystemClock.uptimeMillis();
        lar.k("mtop_startRequest");
        this.b.startRequest(AwesomeGetResponse.class);
        lar.l("mtop_startRequest");
    }

    /* loaded from: classes8.dex */
    public class AwesomeMtopStreamListener implements IMtopStreamListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1645046988);
            kge.a(179613910);
        }

        public AwesomeMtopStreamListener() {
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onReceiveData(final com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
                return;
            }
            if (dVar != null) {
                StreamRequestTask.a(StreamRequestTask.this, dVar.g, dVar.f, dVar.j);
            }
            StreamRequestTask.this.a(dVar, baseOutDo);
            if (StreamRequestTask.this.c == null || dVar == null) {
                return;
            }
            com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: com.taobao.tao.recommend3.gateway.request.StreamRequestTask.AwesomeMtopStreamListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (dVar.e == null) {
                    } else {
                        StreamRequestTask.a(StreamRequestTask.this, new String(dVar.e));
                    }
                }
            });
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
                return;
            }
            if (bVar != null) {
                StreamRequestTask streamRequestTask = StreamRequestTask.this;
                if (streamRequestTask.a(streamRequestTask.f, bVar)) {
                    StreamRequestTask streamRequestTask2 = StreamRequestTask.this;
                    StreamRequestTask.a(streamRequestTask2, streamRequestTask2.e, (Map) StreamRequestTask.this.i, true);
                    return;
                }
            }
            StreamRequestTask.a(StreamRequestTask.this);
            StreamRequestTask.a(StreamRequestTask.this, false, false, null, bVar);
            i.a(false);
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onFinish(com.taobao.tao.stream.c cVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
                return;
            }
            StreamRequestTask.a(StreamRequestTask.this);
            StreamRequestTask.a(StreamRequestTask.this, true, false, null, null);
            i.a(false);
        }
    }

    private boolean a(BaseOutDo baseOutDo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf1cee6", new Object[]{this, baseOutDo, new Boolean(z)})).booleanValue();
        }
        if (baseOutDo != null && baseOutDo.mo2429getData() != null && (baseOutDo instanceof AwesomeGetResponse)) {
            AwesomeGetData mo2429getData = ((AwesomeGetResponse) baseOutDo).mo2429getData();
            if (!z) {
                return mo2429getData == null || (mo2429getData.extraParams == null && mo2429getData.renderParams == null);
            } else if (mo2429getData.containers != null && !mo2429getData.containers.isEmpty()) {
                boolean z2 = true;
                for (AwesomeGetContainerData awesomeGetContainerData : mo2429getData.containers.values()) {
                    if (awesomeGetContainerData.getBaseData() == null && awesomeGetContainerData.getDeltaData() == null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        break;
                    }
                }
                return z2;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    private void a(boolean z, boolean z2, com.taobao.tao.stream.d dVar, com.taobao.tao.stream.b bVar) {
        String str;
        String str2;
        AwesomeGetContainerData b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d54efaa", new Object[]{this, new Boolean(z), new Boolean(z2), dVar, bVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("RequestType", this.f);
        if (z) {
            ksr.a(this.c.API_NAME, this.c.VERSION, hashMap);
            return;
        }
        if (z2) {
            if (dVar == null) {
                str = "1";
                str2 = "response is null";
            } else {
                str = a(dVar);
                str2 = dVar.b;
                hashMap.put("currentId", dVar.f);
                hashMap.put(BioDetector.EXT_KEY_PAGENUM, e());
                a(dVar.g, hashMap);
            }
        } else if (bVar == null) {
            str = "0";
            str2 = "error is null";
        } else {
            str = bVar.b;
            str2 = bVar.c;
            hashMap.put("receivedDataCounts", String.valueOf(bVar.d));
            hashMap.put(ZimMessageChannel.K_RPC_RES_CODE, String.valueOf(bVar.f));
            a(bVar.f21112a, hashMap);
        }
        if ((this.l != null || ((dVar != null && StringUtils.equals(dVar.f, "2")) || (bVar != null && bVar.d == 1))) && (b = oqc.a().b().b(oqc.j().f30287a)) != null && b.getPageParams() != null && b.getBase() != null) {
            b.getPageParams().firstRequestInAdvance = -1;
            b.getBase().initCacheRequestInAdvance();
        }
        ksr.a(this.c.API_NAME, this.c.VERSION, str, str2, (String) null, (String) null, hashMap);
        if (this.e == null) {
            return;
        }
        this.e.a(str, str2);
    }

    private void a(Map<String, List<String>> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
        } else if (map == null || map.isEmpty() || map2 == null) {
        } else {
            List<String> list = map.get("s-rt");
            if (list != null && list.size() > 0) {
                map2.put("serverRT", list.get(0));
            }
            List<String> list2 = map.get(HttpHeaderConstant.X_BIN_LENGTH);
            if (list2 != null && list2.size() > 0) {
                map2.put("responseLength", list2.get(0));
            }
            List<String> list3 = map.get("eagleeye-traceid");
            if (list3 == null) {
                return;
            }
            map2.put("eyeTraceid", list3.get(0));
        }
    }

    private String a(com.taobao.tao.stream.d dVar) {
        String str;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2210e6fc", new Object[]{this, dVar});
        }
        String str2 = dVar.f21113a;
        if (!StringUtils.equals("SUCCESS", str2)) {
            return str2;
        }
        String[] strArr = dVar.h;
        return (strArr.length > 0 && (indexOf = (str = strArr[0]).indexOf("::")) > 0) ? str.substring(0, indexOf) : str2;
    }

    public boolean a(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4995c4fa", new Object[]{this, dVar, baseOutDo})).booleanValue();
        }
        if (dVar == null || baseOutDo == null) {
            a(false, true, (com.taobao.tao.stream.d) null, (com.taobao.tao.stream.b) null);
            return false;
        }
        String str = dVar.f;
        if (StringUtils.equals(str, "1")) {
            if (a(baseOutDo, true)) {
                a(false, true, dVar, (com.taobao.tao.stream.b) null);
                return false;
            }
            if (this.e != null) {
                this.l = (AwesomeGetData) baseOutDo.mo2429getData();
                this.l.isFirstReturn = true;
                this.e.a(this.l);
            }
            AwesomeGetResponse awesomeGetResponse = (AwesomeGetResponse) baseOutDo;
            if (awesomeGetResponse.mo2429getData() != null) {
                a(awesomeGetResponse.mo2429getData());
                m.a().a(awesomeGetResponse.mo2429getData().getExt());
            }
        } else if (StringUtils.equals(str, "2")) {
            if (this.l == null) {
                com.taobao.tao.stream.b bVar = new com.taobao.tao.stream.b();
                bVar.c = "lastData is Null";
                bVar.b = "2";
                bVar.d = 2;
                bVar.f21112a = dVar != null ? dVar.g : null;
                a(false, false, dVar, (com.taobao.tao.stream.b) null);
                return false;
            } else if (a(baseOutDo, false)) {
                a(false, true, dVar, (com.taobao.tao.stream.b) null);
                return false;
            } else {
                AwesomeGetData awesomeGetData = (AwesomeGetData) baseOutDo.mo2429getData();
                awesomeGetData.mergeSecondReturnData(this.l);
                awesomeGetData.isSecondReturn = true;
                if (this.e != null) {
                    this.e.a(awesomeGetData);
                }
                final String jSONString = JSON.toJSONString(awesomeGetData);
                com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: com.taobao.tao.recommend3.gateway.request.StreamRequestTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            StreamRequestTask.a(StreamRequestTask.this, jSONString);
                        }
                    }
                });
                this.l = null;
            }
        }
        return true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!StringUtils.equals(this.f, "coldStart")) {
        } else {
            this.f20907a.b("mtopRequest");
            this.f20907a.a("homeDataProcess", 1);
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        Map<String, AwesomeGetContainerParams> map = this.c.containerParams;
        if (map == null) {
            lap.a("MTopRequest", "commitScrollNextPageError", "containerParams == null");
            return "-1";
        }
        AwesomeGetContainerParams awesomeGetContainerParams = map.get(HomePageUtility.b(b()));
        if (awesomeGetContainerParams == null) {
            lap.a("MTopRequest", "commitScrollNextPageError", "awesomeGetContainerParams == null");
            return "-1";
        }
        AwesomeGetPageData awesomeGetPageData = awesomeGetContainerParams.pageParams;
        if (awesomeGetPageData == null) {
            lap.a("MTopRequest", "commitScrollNextPageError", "pageData == null");
            return "-1";
        }
        return String.valueOf(awesomeGetPageData.pageNum);
    }

    public boolean a(String str, com.taobao.tao.stream.b bVar) {
        Map<String, List<String>> map;
        List<String> list;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1edc8e0", new Object[]{this, str, bVar})).booleanValue();
        }
        if (bVar != null && StringUtils.equals(str, "coldStart") && StringUtils.equals(this.c.API_NAME, "mtop.taobao.wireless.home.newface.stream.newget")) {
            if (StringUtils.equals(bVar.b, "FAIL_SYS_USER_VALIDATE")) {
                return true;
            }
            if (bVar.f == 200 && (map = bVar.f21112a) != null && !map.isEmpty() && map.containsKey("bx-signwl-retry-ts") && (list = map.get("bx-signwl-retry-ts")) != null && list.size() > 0) {
                String str2 = list.get(0);
                if (!StringUtils.isEmpty(str2)) {
                    long j2 = 0;
                    try {
                        j = Long.parseLong(str2) * 1000;
                    } catch (NumberFormatException e) {
                        e = e;
                        j = 0;
                    }
                    try {
                        j2 = SDKUtils.getCorrectionTimeMillis() - System.currentTimeMillis();
                        com.taobao.android.home.component.utils.e.e("gateway.StreamRequestTask", "updateSignFreeConfig: " + j + ", " + j2);
                    } catch (NumberFormatException e2) {
                        e = e2;
                        com.taobao.android.home.component.utils.e.e("gateway.StreamRequestTask", "updateSignFreeConfig NumberFormatException : " + e.getMessage());
                        c.a.b("homepage_switch", "homeSignFreeTime", String.valueOf(j));
                        c.a.b("homepage_switch", "homeSignFreeTimeOffset", String.valueOf(j2));
                        return true;
                    }
                    c.a.b("homepage_switch", "homeSignFreeTime", String.valueOf(j));
                    c.a.b("homepage_switch", "homeSignFreeTimeOffset", String.valueOf(j2));
                    return true;
                }
            }
        }
        return false;
    }

    private void a(Map<String, List<String>> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{this, map, str, str2});
            return;
        }
        HashMap hashMap = null;
        String str3 = oqd.MTOP_STAGE_NETWORKREQUEST;
        if (StringUtils.equals(str, "1")) {
            hashMap = new HashMap();
            a(map, hashMap);
            hashMap.put("falcoId", str2);
            hashMap.put("homeApi", this.c.API_NAME);
            if (StringUtils.equals(this.f, "coldStart")) {
                s.f18233a.d().a("homeApi", this.c.API_NAME);
            }
        } else {
            str3 = str3 + str;
        }
        oqd.a(this.f, str3, 0L, SystemClock.uptimeMillis() - this.k, hashMap, false);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            com.taobao.tao.linklog.a.a("netRequest", "gateway.StreamRequestTask", "AwesomeGetRequestParams ：" + JSON.toJSONString(this.c) + " ---- result : " + str);
        } catch (OutOfMemoryError unused) {
            com.taobao.tao.linklog.a.b("netRequest", "gateway.StreamRequestTask", "oom, no log.", "", "");
        } catch (Throwable th) {
            com.taobao.tao.linklog.a.b("netRequest", "gateway.StreamRequestTask", "log error, no log.", "", th.getMessage());
        }
    }
}
