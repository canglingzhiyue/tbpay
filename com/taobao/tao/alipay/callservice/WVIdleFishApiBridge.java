package com.taobao.tao.alipay.callservice;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class WVIdleFishApiBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WVIdleFishApiBridge wVIdleFishApiBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"alipayCallService".equals(str)) {
            return false;
        }
        alipayCallService(str2, wVCallBackContext);
        return true;
    }

    private void alipayCallService(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3410db", new Object[]{this, str, wVCallBackContext});
        } else if (this.mContext == null || !(this.mContext instanceof Activity)) {
        } else {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString("bizType");
            String string2 = parseObject.getString("sign_params");
            String string3 = parseObject.getString(MtopJSBridge.MtopJSParam.ACCOUNT_SITE);
            if (string == null || string2 == null) {
                return;
            }
            callService((Activity) this.mContext, string, string2, string3, new b() { // from class: com.taobao.tao.alipay.callservice.WVIdleFishApiBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.alipay.callservice.b
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    } else if (wVCallBackContext == null) {
                    } else {
                        r rVar = new r();
                        a(rVar, "result", str3);
                        a(rVar, ZimMessageChannel.K_RPC_RES_CODE, str2);
                        wVCallBackContext.success(rVar);
                    }
                }

                @Override // com.taobao.tao.alipay.callservice.b
                public void b(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str2, str3});
                    } else if (wVCallBackContext == null) {
                    } else {
                        r rVar = new r();
                        a(rVar, "result", str3);
                        a(rVar, ZimMessageChannel.K_RPC_RES_CODE, str2);
                        wVCallBackContext.error(rVar);
                    }
                }

                private void a(r rVar, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9824492", new Object[]{this, rVar, str2, str3});
                        return;
                    }
                    try {
                        rVar.a(str2, new org.json.JSONObject(str3));
                    } catch (JSONException unused) {
                        rVar.a(str2, str3);
                    }
                }
            });
        }
    }

    private void callService(Activity activity, String str, String str2, String str3, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d12ca4e", new Object[]{this, activity, str, str2, str3, bVar});
        } else if (str == null || str2 == null) {
        } else {
            a.a().a(activity, str, str2, str3, bVar);
        }
    }
}
