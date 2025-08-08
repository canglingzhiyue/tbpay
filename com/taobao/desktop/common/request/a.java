package com.taobao.desktop.common.request;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.util.ReflectUtil;
import tb.khm;
import tb.khu;
import tb.khv;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static c f16958a;
    private static IRemoteBaseListener b = new IRemoteBaseListener() { // from class: com.taobao.desktop.common.request.CommonMtopRequest$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (a.f16958a == null || mtopResponse == null) {
            } else {
                a.f16958a.a(mtopResponse.getDataJsonObject().toString());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (a.f16958a == null || mtopResponse == null) {
            } else {
                c cVar = a.f16958a;
                String jSONObject = mtopResponse.getDataJsonObject().toString();
                cVar.a(jSONObject, "retMsg：" + mtopResponse.getRetMsg() + " === mappingCode：" + mtopResponse.getMappingCode() + " === responseCode：" + mtopResponse.getResponseCode());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (a.f16958a == null || mtopResponse == null) {
            } else {
                c cVar = a.f16958a;
                String jSONObject = mtopResponse.getDataJsonObject().toString();
                cVar.a(jSONObject, "retMsg：" + mtopResponse.getRetMsg() + " === mappingCode：" + mtopResponse.getMappingCode() + " === responseCode：" + mtopResponse.getResponseCode());
            }
        }
    };

    public static void a(String str, String str2, Map<String, String> map, boolean z, c cVar, Handler handler) {
        Mtop instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71992c1", new Object[]{str, str2, map, new Boolean(z), cVar, handler});
            return;
        }
        f16958a = cVar;
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(map));
        if (z) {
            MtopSetting.setAppKey(Mtop.Id.CUTE, "21646297");
            instance = Mtop.instance(Mtop.Id.CUTE, khm.a().c());
        } else {
            instance = Mtop.instance(Mtop.Id.INNER, khm.a().c());
        }
        a(instance);
        MtopBusiness build = MtopBusiness.build(instance, mtopRequest);
        build.mo1335useWua();
        if (handler != null) {
            build.mo1296handler(handler);
        }
        build.mo1312setConnectionTimeoutMilliSecond(5000).mo1326setSocketTimeoutMilliSecond(5000).registerListener((IRemoteListener) b).startRequest();
    }

    private static void a(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec661501", new Object[]{mtop});
        } else if (!khv.a()) {
        } else {
            String d = khm.a().d();
            if (!StringUtils.isEmpty(d)) {
                mtop.registerTtid(d);
            }
            int e = khm.a().e();
            khu.a("setWidgetProcessMtopSetting envIndex: " + e + ", ttid: " + d);
            if (e == 0) {
                if (EnvModeEnum.ONLINE.getEnvMode() == e) {
                    return;
                }
                mtop.switchEnvMode(EnvModeEnum.ONLINE);
            } else if (e != 1) {
            } else {
                mtop.switchEnvMode(EnvModeEnum.PREPARE);
            }
        }
    }
}
