package com.taobao.flowcustoms.afc.request.mtop;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
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
import tb.koe;

/* loaded from: classes7.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1350427022);
    }

    @Override // com.taobao.flowcustoms.afc.request.mtop.b
    public void a(String str, String str2, Map<String, String> map, boolean z, final koe koeVar, Handler handler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2c5059", new Object[]{this, str, str2, map, new Boolean(z), koeVar, handler, new Integer(i)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null) {
        } else {
            a(map);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            mtopRequest.setNeedEcode(z);
            mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.flowcustoms.afc.request.mtop.DefaultMtopAdapter$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    koe koeVar2 = koeVar;
                    if (koeVar2 == null || mtopResponse == null) {
                        return;
                    }
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    koeVar2.a(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    koe koeVar2 = koeVar;
                    if (koeVar2 == null || mtopResponse == null) {
                        return;
                    }
                    koeVar2.a(mtopResponse.getDataJsonObject());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    koe koeVar2 = koeVar;
                    if (koeVar2 == null || mtopResponse == null) {
                        return;
                    }
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    koeVar2.a(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                }
            };
            Mtop instance = Mtop.instance(AfcCustomSdk.a().f, AfcCustomSdk.a().f17167a);
            if (handler != null) {
                MtopBusiness.build(instance, mtopRequest).registerListener((IRemoteListener) iRemoteBaseListener).mo1312setConnectionTimeoutMilliSecond(i).mo1296handler(handler).startRequest();
            } else {
                MtopBusiness.build(instance, mtopRequest).registerListener((IRemoteListener) iRemoteBaseListener).mo1312setConnectionTimeoutMilliSecond(i).startRequest();
            }
        }
    }
}
