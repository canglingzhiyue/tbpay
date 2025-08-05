package com.taobao.android.zlz.service;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cjg;
import tb.cjh;
import tb.cji;
import tb.cjj;
import tb.cjk;
import tb.cjm;
import tb.cjn;

/* loaded from: classes6.dex */
public class ZlzService extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "ZlzService";
    public static final String TAG = "ZlzBridgeExtension";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (a.a().b() == null) {
            a.a().a(this.mContext);
        }
        String str3 = "execute: action=" + str;
        try {
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
        }
        if (cjm.ZIM_IDENTIFY_GET_META_INFO.equals(str)) {
            String b = cjg.b(this.mContext);
            if (b != null && !"".equals(b)) {
                r rVar = new r();
                rVar.a("metaInfo", b);
                wVCallBackContext.success(rVar);
            }
            wVCallBackContext.error("metainfo is null");
        } else if ("downloadFaceModel".equals(str)) {
            cjg.c().a(this.mContext, new cjk() { // from class: com.taobao.android.zlz.service.ZlzService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjk
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    r rVar2 = new r();
                    rVar2.a("result", Boolean.valueOf(z));
                    wVCallBackContext.success(rVar2);
                }
            });
        } else if ("checkModelReady".equals(str)) {
            boolean e2 = cjg.c().e();
            r rVar2 = new r();
            rVar2.a("result", Boolean.valueOf(e2));
            wVCallBackContext.success(rVar2);
        } else if (!cjn.ZIM_IDENTIFY_START_EKYC.equals(str)) {
            if ("deliveryContext".equals(str)) {
                a.a().a(this.mContext);
                wVCallBackContext.success();
            }
            return false;
        } else {
            JSONObject parseObject = JSON.parseObject(str2);
            cjh cjhVar = new cjh();
            cjhVar.f26310a = parseObject.getString("eKYCId");
            cjhVar.d = parseObject.getString("eKYCConfig");
            cjhVar.c.put("hummerContext", this.mContext);
            cjg.c().a(cjhVar, new cjj() { // from class: com.taobao.android.zlz.service.ZlzService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjj
                public void a(cji cjiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e38b2ab6", new Object[]{this, cjiVar});
                        return;
                    }
                    r rVar3 = new r();
                    rVar3.a("code", Integer.valueOf(cjiVar.f26311a));
                    rVar3.a("subCode", cjiVar.b);
                    rVar3.a("result", cjiVar.c);
                    rVar3.a("extInfo", cjiVar.e);
                    wVCallBackContext.success(rVar3);
                }
            });
        }
        return false;
    }
}
