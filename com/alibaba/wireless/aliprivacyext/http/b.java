package com.alibaba.wireless.aliprivacyext.http;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.c;
import com.alibaba.wireless.aliprivacyext.f;
import com.alibaba.wireless.aliprivacyext.http.annotations.Api;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f4241a = "MTopHelper";
    private static String b;

    private static Mtop a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("d71fcc8f", new Object[]{context});
        }
        String str = b;
        if (str == null) {
            return Mtop.instance(context.getApplicationContext());
        }
        return Mtop.instance(str, context.getApplicationContext());
    }

    public static void a(Context context, Object obj, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a8e343", new Object[]{context, obj, aVar});
            return;
        }
        Mtop a2 = a(context);
        MtopRequest convertToMtopRequest = ReflectUtil.convertToMtopRequest(obj);
        Api api = (Api) obj.getClass().getAnnotation(Api.class);
        if (api == null) {
            c.a(f4241a, "api not exist");
            return;
        }
        String str = f4241a;
        c.a(str, "api:" + api.name());
        convertToMtopRequest.setApiName(api.name());
        convertToMtopRequest.setVersion("1.0");
        convertToMtopRequest.setNeedEcode(true);
        MtopBuilder build = a2.build(convertToMtopRequest, (String) null);
        String str2 = f4241a;
        c.a(str2, "request:" + f.a(obj));
        build.mo1335useWua().mo1337addListener(new MtopCallback.MtopFinishListener() { // from class: com.alibaba.wireless.aliprivacyext.http.MTopHelper$a
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
            public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj2});
                    return;
                }
                a aVar2 = a.this;
                if (aVar2 == null) {
                    return;
                }
                if (mtopFinishEvent == null) {
                    aVar2.b(null);
                    return;
                }
                MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
                if (mtopResponse == null) {
                    a.this.b(null);
                    return;
                }
                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                String retCode = mtopResponse.getRetCode();
                String retMsg = mtopResponse.getRetMsg();
                com.alibaba.wireless.aliprivacyext.http.model.response.a aVar3 = new com.alibaba.wireless.aliprivacyext.http.model.response.a();
                if (dataJsonObject != null) {
                    aVar3.setData(dataJsonObject.toString());
                }
                aVar3.setRetCode(retCode);
                aVar3.setRetMsg(retMsg);
                String str3 = b.$ipChange;
                c.a(str3, "response:" + f.a(aVar3));
                if (mtopResponse.isApiSuccess()) {
                    a.this.a(aVar3);
                } else {
                    a.this.b(aVar3);
                }
            }
        }).mo1305reqMethod(api.method()).asyncRequest();
    }
}
