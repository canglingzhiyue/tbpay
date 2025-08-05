package com.alipay.auth.mobile.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.auth.mobile.api.IAlipayAuthAPI;
import com.alipay.auth.mobile.api.IAlipayAuthEventHandler;
import com.alipay.auth.mobile.api.IAlipayAuthMonitor;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.alipay.auth.mobile.common.AlipayAuthUtils;
import com.alipay.auth.mobile.common.AlipayDataResolver;
import com.alipay.auth.mobile.common.LoggerUtils;
import com.alipay.auth.mobile.common.MonitorAlipayAuth;
import com.alipay.auth.mobile.exception.AlipayAuthIllegalArgumentException;
import com.alipay.auth.mobile.exception.PreAlipayAuthException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Properties;

/* loaded from: classes3.dex */
public class AlipayAuthApiImpl implements IAlipayAuthAPI {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5220a;
    private IAlipayAuthMonitor b;

    public AlipayAuthApiImpl(Context context, IAlipayAuthMonitor iAlipayAuthMonitor) {
        LoggerUtils.d("AlipayAuthApiImpl", "new instance");
        this.f5220a = context;
        this.b = iAlipayAuthMonitor;
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthAPI
    public boolean isAlipayAppInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11a75a98", new Object[]{this})).booleanValue();
        }
        try {
            this.f5220a.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            LoggerUtils.e("AlipayAuthApiImpl", "isAlipayAppInstalled Exception", e);
            return false;
        } catch (Throwable th) {
            LoggerUtils.e("AlipayAuthApiImpl", "isAlipayAppInstalled Throwable", th);
            return false;
        }
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthAPI
    public boolean isAlipayAppSurpportAPI() {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e006c97", new Object[]{this})).booleanValue();
        }
        try {
            int alipayAuthLoginSupportVersion = new AlipayDataResolver(this.f5220a).getAlipayAuthLoginSupportVersion(0);
            if (alipayAuthLoginSupportVersion < 966042200) {
                if (alipayAuthLoginSupportVersion == 0 && (packageInfo = this.f5220a.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 16384)) != null) {
                    if (packageInfo.versionCode > 93) {
                        return true;
                    }
                }
                return false;
            }
            try {
                LoggerUtils.d("AlipayAuthApiImpl", "auth login supportVersion = " + alipayAuthLoginSupportVersion);
                return true;
            } catch (Throwable th) {
                th = th;
                LoggerUtils.e("AlipayAuthApiImpl", "isAlipayAppSurpportAPI error", th);
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthAPI
    public boolean isAlipayAuthCallBack(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69191c29", new Object[]{this, intent})).booleanValue() : (intent == null || intent.getExtras() == null || !intent.getExtras().containsKey(AlipayAuthConstant.AuthState.AUTH_STATE_KEY)) ? false : true;
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthAPI
    public void handleIntent(Intent intent, IAlipayAuthEventHandler iAlipayAuthEventHandler) throws AlipayAuthIllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acac31e", new Object[]{this, intent, iAlipayAuthEventHandler});
        } else if (intent == null) {
            LoggerUtils.d("AlipayAuthApiImpl", "intent 为  null");
            throw new AlipayAuthIllegalArgumentException("intent can not be null");
        } else if (iAlipayAuthEventHandler == null) {
            LoggerUtils.d("AlipayAuthApiImpl", "eventHandler 为  null ,业务方需传递一个非空实例");
            throw new AlipayAuthIllegalArgumentException("callabck IAlipaySSOEventHandler object can not be null");
        } else {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("code");
                String string2 = extras.getString("msg");
                String string3 = extras.getString("token");
                boolean z = extras.getBoolean("success");
                int i = extras.getInt(AlipayAuthConstant.AuthState.AUTH_STATE_KEY);
                MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CanHandleCallback");
                if (z && !TextUtils.isEmpty(string3)) {
                    iAlipayAuthEventHandler.alipayAuthSuccess(string3);
                    LoggerUtils.d("AlipayAuthApiImpl", "get authToken success");
                    new Properties().put("authToken", string3);
                    MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CallbackSucess");
                } else if (3001 == i) {
                    iAlipayAuthEventHandler.alipayAuthDidCancel();
                    LoggerUtils.d("AlipayAuthApiImpl", "user cancel");
                    MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CallbackCancel");
                } else if (3002 == i) {
                    iAlipayAuthEventHandler.alipayAuthDidCancel();
                    LoggerUtils.d("AlipayAuthApiImpl", "user change account");
                    MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CallbackCancel");
                } else if (TextUtils.isEmpty(string3)) {
                    iAlipayAuthEventHandler.alipayAuthFailure();
                    LoggerUtils.d("AlipayAuthApiImpl", "token is empty");
                    MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CallbackError");
                } else {
                    iAlipayAuthEventHandler.alipayAuthFailure();
                    LoggerUtils.d("AlipayAuthApiImpl", "auth other failture");
                    MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CallbackError");
                }
                LoggerUtils.d("AlipayAuthApiImpl", "alipay auth back data:code=" + string + " msg=" + string2 + " token=" + string3 + " success=" + z);
                return;
            }
            LoggerUtils.d("AlipayAuthApiImpl", "alipay auth back data: intent.getExtras() is null");
            iAlipayAuthEventHandler.alipayAuthFailure();
            MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_CallbackError");
        }
    }

    @Override // com.alipay.auth.mobile.api.IAlipayAuthAPI
    public void openAlipayAuth(Activity activity, String str, String str2, String str3, String str4) throws AlipayAuthIllegalArgumentException, PreAlipayAuthException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c72e1bd", new Object[]{this, activity, str, str2, str3, str4});
        } else if (!isAlipayAppInstalled()) {
            throw new PreAlipayAuthException("alipay has not install");
        } else {
            if (!isAlipayAppSurpportAPI()) {
                throw new PreAlipayAuthException("alipay auth api not support");
            }
            if (activity == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                throw new AlipayAuthIllegalArgumentException("one or some must need param is null");
            }
            Properties properties = new Properties();
            properties.put("appkey", str);
            properties.put("packageName", str3);
            MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_Open", properties);
            String encrypt = AlipayAuthUtils.encrypt(this.f5220a, str, str2, this.b);
            String valueOf = String.valueOf(System.currentTimeMillis());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appKey", str);
            linkedHashMap.put("timestamp", valueOf);
            linkedHashMap.put("uuid", encrypt);
            String atlasSignData = AlipayAuthUtils.atlasSignData(this.f5220a, str, AlipayAuthUtils.strJoint(linkedHashMap), this.b);
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String encode = URLEncoder.encode(encrypt, "utf-8");
                HashMap hashMap = new HashMap();
                hashMap.put("packageName", str3);
                hashMap.put(AlipayAuthConstant.FULL_CLASS_NAME, str4);
                hashMap.put("uuid", encode);
                hashMap.put("timestamp", valueOf);
                hashMap.put(AlipayAuthConstant.SIGN_DATA, atlasSignData);
                hashMap.put("appKey", str);
                String strJoint = AlipayAuthUtils.strJoint(AlipayAuthConstant.ALIPAY_URI, hashMap);
                LoggerUtils.d("AlipayAuthApiImpl", strJoint);
                intent.setData(Uri.parse(strJoint));
                activity.startActivity(intent);
                Properties properties2 = new Properties();
                properties2.put("openURL", strJoint);
                MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_Jump2AliPay", properties2);
            } catch (Throwable th) {
                MonitorAlipayAuth.getInstance().monitorAlipayAuth(this.b, "AliPayAuth_Jump2AliPay_Fail");
                throw new PreAlipayAuthException("pre auth login process error", th);
            }
        }
    }
}
