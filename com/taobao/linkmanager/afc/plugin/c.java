package com.taobao.linkmanager.afc.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.linkmanager.afc.plugin.c;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import tb.kge;
import tb.knx;
import tb.koj;

/* loaded from: classes.dex */
public class c implements koj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f17668a;
    private String b;
    private boolean c = false;

    /* renamed from: com.taobao.linkmanager.afc.plugin.c$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17669a = new int[LoginAction.values().length];

        static {
            try {
                f17669a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17669a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(152434727);
        kge.a(-1094153819);
    }

    @Override // tb.koj
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.koj
    public int a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc9b6d88", new Object[]{this, aVar})).intValue();
        }
        return 1;
    }

    public static /* synthetic */ void a(c cVar, String str, com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82bc009", new Object[]{cVar, str, aVar});
        } else {
            cVar.a(str, aVar);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad9d896", new Object[]{cVar})).booleanValue() : cVar.c;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5061ec86", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.c = z;
        return z;
    }

    @Override // tb.koj
    public void a(com.taobao.flowcustoms.afc.a aVar, String str, knx knxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01b47fa", new Object[]{this, aVar, str, knxVar});
            return;
        }
        this.b = aVar.q;
        if (TextUtils.isEmpty(this.b)) {
            if (knxVar != null) {
                knxVar.a(true, str);
            }
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcLoginPlugin === executePluginWithContext === loginToken为空,不免登");
            return;
        }
        this.f17668a = System.currentTimeMillis() + "";
        boolean c = c(aVar);
        aVar.J.put("useLoginTokenOptimize", (Object) Boolean.valueOf(c));
        if (c) {
            if (TextUtils.isEmpty(Login.getLoginToken()) || !Login.checkSessionValid()) {
                this.c = true;
                a(TbFcLinkInit.instance().mApplication, str, knxVar, aVar);
                b(aVar);
            } else if (knxVar != null) {
                knxVar.a(true, str);
            }
        } else {
            this.c = true;
            a(TbFcLinkInit.instance().mApplication, str, knxVar, aVar);
            b(aVar);
        }
        a("flow_in_before_login", aVar);
    }

    private void b(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43742d56", new Object[]{this, aVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, this.b);
        bundle.putString("source", aVar.i);
        Login.login(false, bundle);
    }

    private boolean c(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa4ced1b", new Object[]{this, aVar})).booleanValue();
        }
        boolean a2 = ABGlobal.a(aVar.K, "taobao", "tbspeed", "afc_login_token_opt");
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcLoginPlugin === shouldUseLoginTokenOptimize ===  " + a2);
        return a2;
    }

    private void a(String str, com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27330fdf", new Object[]{this, str, aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userId", Login.getUserId());
        hashMap.put(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, Login.getLoginToken());
        hashMap.put("useLoginTokenOptimize", String.valueOf(aVar.J.getBoolean("useLoginTokenOptimize")));
        String str2 = this.b;
        com.taobao.flowcustoms.afc.utils.b.a(1013, str, str2, this.f17668a + "", hashMap);
    }

    private void a(Context context, final String str, final knx knxVar, final com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a665772", new Object[]{this, context, str, knxVar, aVar});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.plugin.TfcLoginPlugin$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (intent == null) {
                    } else {
                        if (c.AnonymousClass1.f17669a[LoginAction.valueOf(intent.getAction()).ordinal()] != 1) {
                            if (knxVar != null && c.a(c.this)) {
                                knxVar.a(true, str);
                                c.a(c.this, false);
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                        }
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcLoginPlugin === registerLoginCallBack === 登录成功 isAutoLogin = " + c.a(c.this));
                        if (c.a(c.this)) {
                            knx knxVar2 = knxVar;
                            if (knxVar2 != null) {
                                knxVar2.a(true, str);
                            }
                            c.a(c.this, "flow_in_after_login", aVar);
                            c.a(c.this, false);
                        }
                        LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                    }
                }
            });
        }
    }
}
