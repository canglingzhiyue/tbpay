package com.taobao.android.address;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.DeliverRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, DeliverRequest deliverRequest, Map<String, String> map, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a630b4", new Object[]{context, deliverRequest, map, iRemoteBaseListener});
        } else {
            a(context, "mtop.taobao.mbis.address.recommend.pull", JSON.toJSONString(deliverRequest), map, 0, iRemoteBaseListener);
        }
    }

    public static void a(Context context, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d99516", new Object[]{context, iRemoteBaseListener});
        } else {
            a(context, "mtop.taobao.mbis.address.nls.config.get", JSON.toJSONString(""), null, 1, iRemoteBaseListener);
        }
    }

    private static void a(Context context, String str, String str2, Map<String, String> map, int i, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647676a4", new Object[]{context, str, str2, map, new Integer(i), iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(str2);
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context.getApplicationContext()), mtopRequest);
        if (map != null) {
            build.mo1297headers(map);
        }
        build.mo1305reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) iRemoteBaseListener);
        build.mo1339retryTime(i);
        build.startRequest();
    }
}
