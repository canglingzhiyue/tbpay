package com.taobao.wireless.link.mtop;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;
import tb.kge;
import tb.rjt;
import tb.rkg;

/* loaded from: classes9.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1809054514);
    }

    @Override // com.taobao.wireless.link.mtop.a
    public void a(String str, String str2, Map<String, String> map, boolean z, boolean z2, boolean z3, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862e53c3", new Object[]{this, str, str2, map, new Boolean(z), new Boolean(z2), new Boolean(z3), cVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || map == null) {
        } else {
            a(map);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            mtopRequest.setNeedEcode(z);
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(map));
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.wireless.link.mtop.LinkMtopCommonRequest$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null || mtopResponse == null) {
                        return;
                    }
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    cVar2.a(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null || mtopResponse == null) {
                        return;
                    }
                    cVar2.a(mtopResponse.getDataJsonObject());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null || mtopResponse == null) {
                        return;
                    }
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    cVar2.a(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                }
            };
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, rjt.a().f33186a), mtopRequest);
            if (z2) {
                build.mo1335useWua();
            }
            if (z3) {
                build.mo1340setBizId(i.ACTIONBAR_MENU_LIST);
            }
            build.mo1312setConnectionTimeoutMilliSecond(5000).mo1326setSocketTimeoutMilliSecond(5000).registerListener((IRemoteListener) iRemoteBaseListener).startRequest();
            rkg.a("link_tag", "NetRequestImp === requestData: 开始进行接口请求: " + str);
        }
    }
}
