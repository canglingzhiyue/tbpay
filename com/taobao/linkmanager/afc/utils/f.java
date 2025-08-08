package com.taobao.linkmanager.afc.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.reduction.LoginResultBean;
import com.taobao.linkmanager.afc.utils.f;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.linkmanager.afc.utils.f$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17690a = new int[LoginAction.values().length];

        static {
            try {
                f17690a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17690a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(1634089216);
    }

    public static /* synthetic */ void b(Context context, com.taobao.linkmanager.afc.reduction.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de203429", new Object[]{context, aVar});
        } else {
            c(context, aVar);
        }
    }

    public static void a(final Context context, final com.taobao.linkmanager.afc.reduction.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53fd38a", new Object[]{context, aVar});
        } else {
            com.taobao.wireless.link.login.a.a().a(context, new com.taobao.wireless.link.login.b() { // from class: com.taobao.linkmanager.afc.utils.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.wireless.link.login.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkLoginUtils === LinkLoginFree === 获取到的免登信息：" + str);
                    if (StringUtils.isEmpty(str)) {
                        com.taobao.linkmanager.afc.reduction.a aVar2 = com.taobao.linkmanager.afc.reduction.a.this;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.b();
                        return;
                    }
                    LoginResultBean a2 = com.taobao.linkmanager.afc.reduction.c.a().a(str);
                    if (StringUtils.isEmpty(a2.loginToken)) {
                        com.taobao.linkmanager.afc.reduction.a aVar3 = com.taobao.linkmanager.afc.reduction.a.this;
                        if (aVar3 == null) {
                            return;
                        }
                        aVar3.b();
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkLoginUtils === LinkLoginFree === 免登信息不为空，开始免登");
                    f.b(context, new com.taobao.linkmanager.afc.reduction.a() { // from class: com.taobao.linkmanager.afc.utils.f.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.linkmanager.afc.reduction.a
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            } else if (com.taobao.linkmanager.afc.reduction.a.this == null) {
                            } else {
                                com.taobao.linkmanager.afc.reduction.a.this.a();
                            }
                        }

                        @Override // com.taobao.linkmanager.afc.reduction.a
                        public void b() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("57a83e9", new Object[]{this});
                            } else if (com.taobao.linkmanager.afc.reduction.a.this == null) {
                            } else {
                                com.taobao.linkmanager.afc.reduction.a.this.b();
                            }
                        }
                    });
                    Bundle bundle = new Bundle();
                    bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, a2.loginToken);
                    bundle.putString("source", a2.source);
                    Login.login(false, bundle);
                }
            });
        }
    }

    private static void c(Context context, final com.taobao.linkmanager.afc.reduction.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170094c8", new Object[]{context, aVar});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.utils.LinkLoginUtils$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkLoginUtils === registerLoginCallBack === 登录广播回调，intent：" + intent);
                    if (intent == null) {
                        return;
                    }
                    int i = f.AnonymousClass2.f17690a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i != 1) {
                        if (i == 2 && com.taobao.linkmanager.afc.reduction.a.this != null) {
                            com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkLoginUtils === registerLoginCallBack === 登录失败");
                            com.taobao.linkmanager.afc.reduction.a.this.b();
                        }
                    } else if (com.taobao.linkmanager.afc.reduction.a.this != null) {
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkLoginUtils === registerLoginCallBack === 登录成功");
                        com.taobao.linkmanager.afc.reduction.a.this.a();
                    }
                    LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "LinkLoginUtils === registerLoginCallBack === 广播解注册了");
                }
            });
        }
    }
}
