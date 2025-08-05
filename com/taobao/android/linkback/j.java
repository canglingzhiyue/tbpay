package com.taobao.android.linkback;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REPORT_API = "mtop.taobao.afc.back.report";

    public static void a(Context context, String str, Map<String, String> map, Handler handler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd6cc98", new Object[]{context, str, map, handler, new Integer(i)});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(false);
            mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.android.linkback.MtopRequestExecutor$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    String str2 = "onError === response= 错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    String str2 = "onSuccess === response=" + mtopResponse.getDataJsonObject();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    String str2 = "onSystemError === response=" + mtopResponse;
                }
            };
            Mtop instance = Mtop.instance(Mtop.Id.INNER, context);
            if (handler != null) {
                MtopBusiness.build(instance, mtopRequest).registerListener((IRemoteListener) iRemoteBaseListener).mo1312setConnectionTimeoutMilliSecond(i).mo1305reqMethod(MethodEnum.POST).mo1296handler(handler).startRequest();
            } else {
                MtopBusiness.build(instance, mtopRequest).registerListener((IRemoteListener) iRemoteBaseListener).mo1312setConnectionTimeoutMilliSecond(i).mo1305reqMethod(MethodEnum.POST).startRequest();
            }
        }
    }
}
