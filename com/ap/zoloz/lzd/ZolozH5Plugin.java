package com.ap.zoloz.lzd;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.cjl;
import tb.cjm;
import tb.cjn;
import tb.kge;

/* loaded from: classes3.dex */
public class ZolozH5Plugin extends e implements INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HUMMER_FOUDATION = "hummerFoundation";
    private static final String ZOLOZ_IDENTITY = "zimIdentity";
    private static List<String> list;
    private cjm mZolozBaseH5Handler;
    private cjn mZolozEkycH5Handler;

    public static /* synthetic */ Object ipc$super(ZolozH5Plugin zolozH5Plugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-123000502);
        ArrayList arrayList = new ArrayList();
        list = arrayList;
        arrayList.add(ZOLOZ_IDENTITY);
        list.add(HUMMER_FOUDATION);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!list.contains(str)) {
            return false;
        }
        identify(str2, wVCallBackContext);
        return true;
    }

    private void identify(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205bdb5a", new Object[]{this, str, wVCallBackContext});
            return;
        }
        BioLog.i("jsapi request " + str);
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (cjm.ZIM_IDENTIFY_GET_META_INFO.equals(parseObject.getString("action"))) {
                if (this.mZolozBaseH5Handler == null) {
                    this.mZolozBaseH5Handler = new cjm();
                }
                this.mZolozBaseH5Handler.a(parseObject, wVCallBackContext.getWebview().getContext(), new cjl() { // from class: com.ap.zoloz.lzd.ZolozH5Plugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.cjl
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                            return;
                        }
                        BioLog.i("jsapi response " + jSONObject.toJSONString());
                        r rVar = new r();
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            rVar.a(entry.getKey(), entry.getValue());
                        }
                        wVCallBackContext.success(rVar);
                    }
                });
                return;
            }
            if (this.mZolozEkycH5Handler == null) {
                this.mZolozEkycH5Handler = new cjn();
            }
            this.mZolozEkycH5Handler.a(parseObject, wVCallBackContext.getWebview().getContext(), new cjl() { // from class: com.ap.zoloz.lzd.ZolozH5Plugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjl
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    BioLog.i("jsapi response " + jSONObject.toJSONString());
                    wVCallBackContext.success(jSONObject.toJSONString());
                }
            });
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }
}
