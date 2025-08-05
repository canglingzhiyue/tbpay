package com.taobao.wireless.link.login;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alipay.mobile.accountauthbiz.IAlipayLoginService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rki;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23600a;
    public Map<String, Boolean> b;
    private IAlipayLoginService c;
    private b d;
    private ServiceConnection e;

    /* renamed from: com.taobao.wireless.link.login.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1019a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f23602a;

        static {
            kge.a(-952023072);
            f23602a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e4450379", new Object[0]) : f23602a;
        }
    }

    static {
        kge.a(-69510899);
    }

    public static /* synthetic */ IAlipayLoginService a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAlipayLoginService) ipChange.ipc$dispatch("d934fae", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ IAlipayLoginService a(a aVar, IAlipayLoginService iAlipayLoginService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayLoginService) ipChange.ipc$dispatch("73ac2863", new Object[]{aVar, iAlipayLoginService});
        }
        aVar.c = iAlipayLoginService;
        return iAlipayLoginService;
    }

    public static /* synthetic */ b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f4e4a60c", new Object[]{aVar}) : aVar.d;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e4450379", new Object[0]) : C1019a.a();
    }

    private a() {
        this.b = new HashMap();
        this.e = new ServiceConnection() { // from class: com.taobao.wireless.link.login.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                a.a(a.this, IAlipayLoginService.Stub.asInterface(iBinder));
                try {
                    String loginInfo = a.a(a.this).getLoginInfo();
                    if (a.b(a.this) != null) {
                        a.b(a.this).a(loginInfo);
                    }
                    rki.a(rki.ARG1_READ_LOGIN_FREE_FOR_TB, loginInfo, "", null);
                    rkg.a("link_tag", "LoginFreeCenter === onServiceConnected === 获取到的免登信息：" + loginInfo);
                } catch (Throwable th) {
                    try {
                        rkg.b("link_tag", "LoginFreeCenter === onServiceConnected === 获取aidl信息异常：" + th);
                        if (a.b(a.this) != null) {
                            a.b(a.this).a("");
                        }
                        try {
                            a.this.a(rjt.a().f33186a);
                        } catch (Exception e) {
                            rkg.b("link_tag", "LoginFreeCenter === onServiceConnected === 解绑异常：" + e);
                        }
                    } finally {
                        if (a.b(a.this) != null) {
                            a.b(a.this).a("");
                        }
                        try {
                            a.this.a(rjt.a().f33186a);
                        } catch (Exception e2) {
                            rkg.b("link_tag", "LoginFreeCenter === onServiceConnected === 解绑异常：" + e2);
                        }
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                a.a(a.this, (IAlipayLoginService) null);
                rkg.b("link_tag", "LoginFreeCenter === onServiceDisconnected === 解绑服务：" + componentName);
            }
        };
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        q.a(LoginFreeJsbridge.CLASSNAME_LOGINFREEJSBRIDGE, (Class<? extends e>) LoginFreeJsbridge.class);
        rkg.a("link_tag", "LoginFreeCenter === init === 免登模块初始化完成");
    }

    public void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e0528a", new Object[]{this, context, bVar});
            return;
        }
        try {
            this.d = bVar;
            Intent intent = new Intent();
            intent.setAction("com.alipay.mobile.accountauthbiz.outer.AlipayAutoLoginService");
            intent.setPackage("com.eg.android.AlipayGphone");
            boolean bindService = context.bindService(intent, this.e, 1);
            rkg.a("link_tag", "LoginFreeCenter === bindLoginService === 绑定服务：" + intent + " 绑定是否成功：" + bindService);
        } catch (Exception e) {
            rkg.b("link_tag", "LoginFreeCenter === bindLoginService === 绑定服务异常：" + e);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        context.unbindService(this.e);
        rkg.a("link_tag", "LoginFreeCenter === unBindLoginService === 解绑服务：" + this.e);
    }
}
