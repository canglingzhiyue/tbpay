package a.a.a.a.a.a.a.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDCoreSDK;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.rpc.model.IifaaClientRequest;
import com.alipay.android.phone.iifaa.did.rpc.service.IifaaDidService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.taobao.login4android.api.Login;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONTokener;
import tb.ifh;
import tb.ipg;
import tb.iqg;
import tb.iqh;

/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: a.a.a.a.a.a.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0002a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1043a;
        public final /* synthetic */ WVCallBackContext b;

        public RunnableC0002a(String str, WVCallBackContext wVCallBackContext) {
            this.f1043a = str;
            this.b = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(JSONObject.parseObject(this.f1043a), this.b);
        }
    }

    public final String a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("tb_sid", Login.getSid());
        hashMap.put("brand", Build.BRAND);
        hashMap.put("device_model", Build.MODEL);
        hashMap.put("os_type", Build.BRAND);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("app_name", context.getPackageName());
        try {
            hashMap.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return JSONObject.toJSONString(hashMap);
    }

    public final void a(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        char c;
        JSONObject b;
        long currentTimeMillis = System.currentTimeMillis();
        String string = jSONObject.getString("action");
        int hashCode = string.hashCode();
        if (hashCode != -419195774) {
            if (hashCode == 1948305743 && string.equals("initDID")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (string.equals("fetchVerifiableCredentialsAndDisclose")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            b = ((ipg) DIDCoreSDK.getTrustedCertService()).b(getContext(), jSONObject);
        } else if (c != 1) {
            b = new JSONObject();
            b.put("resultCode", (Object) DIDResult.a.WRONG_PARAMS);
            b.put("message", (Object) "wrong params");
        } else {
            b = ((ipg) DIDCoreSDK.getTrustedCertService()).a(getContext(), jSONObject);
        }
        r rVar = new r();
        try {
            rVar.a(new org.json.JSONObject(new JSONTokener(b.toJSONString())));
        } catch (JSONException e) {
            rVar.a("resultCode", DIDResult.a.FAILED_EXCP);
            rVar.a("message", "结果 JSON 转换异常");
            e.printStackTrace();
        }
        iqh a2 = iqh.a();
        a2.b("IifaaDidTBJsBridge", "processIfaaDIDCmd action:" + string + "\nresult:" + rVar.d());
        wVCallBackContext.success(rVar);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        HashMap hashMap = new HashMap();
        hashMap.put("action", string);
        hashMap.put("resultCode", b.getString("resultCode"));
        hashMap.put("message", b.getString("message"));
        hashMap.put("time_cost", String.valueOf(currentTimeMillis2));
        String a3 = ifh.a();
        if (!TextUtils.isEmpty(a3)) {
            hashMap.put(com.taobao.tao.messagekit.base.network.a.KEY_DID, a3);
        }
        String string2 = jSONObject.getString("token");
        if (!TextUtils.isEmpty(string2)) {
            hashMap.put("biz_token", string2);
        }
        Context context = getContext();
        try {
            hashMap.put("ext_info", a(context));
            MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(context.getApplicationContext());
            IifaaDidService iifaaDidService = (IifaaDidService) mpaasRpcServiceImpl.getRpcProxy(IifaaDidService.class);
            mpaasRpcServiceImpl.getRpcInvokeContext(iifaaDidService).setGwUrl(iqg.a().b(context.getApplicationContext()));
            IifaaClientRequest iifaaClientRequest = new IifaaClientRequest();
            iifaaClientRequest.clientLog = JSONObject.toJSONString(hashMap);
            iqh a4 = iqh.a();
            a4.a("IifaaDidTBJsBridge", "request: " + JSONObject.toJSONString(iifaaClientRequest));
            boolean clientLogDispatch = iifaaDidService.clientLogDispatch(iifaaClientRequest);
            iqh a5 = iqh.a();
            a5.a("IifaaDidTBJsBridge", "resp: " + clientLogDispatch);
        } catch (Exception e2) {
            iqh.a().c("IifaaDidTBJsBridge", "事件上报接口请求异常");
            iqh.a().c("IifaaDidTBJsBridge", e2.getLocalizedMessage());
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        if (!"didProcessCmd".equals(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        new Thread(new RunnableC0002a(str2, wVCallBackContext), "IifaaDidTBJsBridge").start();
        return true;
    }
}
