package com.taobao.wireless.link.pop;

import android.content.Context;
import android.taobao.windvane.util.i;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;
import tb.rkg;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1288769323);
    }

    public static boolean a(Context context, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{context, new Integer(i)})).booleanValue();
        }
        if (!a(context)) {
            rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 不在支持的请求时间段内，不请求服务端");
            rki.a(rki.ARG1_NOT_IN_REQUEST_TIME, i + "", "", null);
            return false;
        } else if (!d.b(context, i)) {
            rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 不在支持的请求场景，不请求服务端");
            rki.a(rki.ARG1_NOT_IN_REQUEST_SCENCE, "", "", null);
            return false;
        } else if (!i.a(context)) {
            rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 网络链接不正常，不请求服务端");
            rki.a(rki.ARG1_NETWORK_NOT_CONNECTED, "", "", null);
            return false;
        } else if (!rkj.c(context)) {
            rki.a(rki.ARG1_POP_NOT_IN_PERMISSION, "", "", null);
            rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 没有悬浮窗权限，不请求网络");
            return false;
        } else if (!d.a(context)) {
            rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 机型和系统版本，不支持桌面push");
            rki.a(rki.ARG1_POP_NOT_IN_WHITELIST, "", "", null);
            return false;
        } else {
            int e = d.e(context);
            try {
                i2 = Integer.parseInt(com.taobao.wireless.link.common.b.a(context, "maxMtopRequestCount", "3"));
            } catch (Exception e2) {
                rkg.b("link_tag", "PopMtopRequest === isShouldRequest == 类型转换异常：" + e2);
                i2 = 0;
            }
            if (d.a(d.f(context), rkj.a()) && e > i2) {
                rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 请求超过" + i2 + "次, 不在发起请求");
                return false;
            }
            try {
                if (Math.abs(UTDevice.getUtdid(context).hashCode()) % 100 > Integer.parseInt(com.taobao.wireless.link.common.b.a(context, "greyRandomCount", "100"))) {
                    rkg.a("link_tag", "PopMtopRequest === isShouldRequest == 未命中灰度，不发发起网络请求");
                    return false;
                }
            } catch (Exception e3) {
                rkg.b("link_tag", "PopMtopRequest === isShouldRequest == 灰度边界数据解析，类型转换异常：" + e3);
            }
            return true;
        }
    }

    private static boolean a(Context context) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            a2 = com.taobao.wireless.link.common.b.a(context, "mtopRequestPeriod", "01:45-23:15");
        } catch (Exception e) {
            rkg.b("link_tag", "PopMtopRequest === isInRequestPeriod == 异常:" + e);
        }
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String[] split = a2.split("-");
        if (split.length < 2) {
            return false;
        }
        String str = split[0];
        String str2 = split[1];
        String a3 = d.a();
        int compareTo = a3.compareTo(str);
        int compareTo2 = a3.compareTo(str2);
        if (compareTo > 0 && compareTo2 < 0) {
            rkg.a("link_tag", "PopMtopRequest === isInRequestPeriod == 当前时间点在config范围内: " + a2);
            return true;
        }
        rkg.a("link_tag", "PopMtopRequest === isInRequestPeriod == 当前时间点不在config范围内:" + a2);
        return false;
    }

    public static void b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7862e4", new Object[]{context, new Integer(i)});
            return;
        }
        int e = d.e(context);
        if (!d.a(d.f(context), rkj.a())) {
            e = 0;
        }
        if (!a(context, i)) {
            rkg.a("link_tag", "PopMtopRequest === getMsgFromServer == 校验失败，不发起网络请求");
            return;
        }
        d.a(context, e + 1);
        d.a(context, rkj.a());
        HashMap hashMap = new HashMap();
        hashMap.put("scene", "float_push_intention");
        hashMap.put("action", "PUSH");
        hashMap.put("bizKey", "AUGE_ASYNC");
        rkg.a("link_tag", "PopMtopRequest === getMsgFromServer == 请求参数：" + hashMap);
        rki.a("msg_request_type", i + "", "", null);
        com.taobao.wireless.link.mtop.a.a().a(com.taobao.wireless.link.mtop.a.GET_MSG_API, "1.0", hashMap, false, false, true, new com.taobao.wireless.link.mtop.c() { // from class: com.taobao.wireless.link.pop.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.wireless.link.mtop.c
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                rkg.a("link_tag", "PopMtopRequest === getMsgFromServer: onSuccess：" + jSONObject);
            }

            @Override // com.taobao.wireless.link.mtop.c
            public void a(JSONObject jSONObject, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str});
                    return;
                }
                rkg.b("link_tag", "PopMtopRequest === getMsgFromServer: onError：" + jSONObject + " === retMsg=" + str);
            }
        });
    }
}
