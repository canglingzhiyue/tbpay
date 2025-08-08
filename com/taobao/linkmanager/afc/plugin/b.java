package com.taobao.linkmanager.afc.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.plugin.b;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.kge;
import tb.knx;
import tb.kog;
import tb.koj;

/* loaded from: classes.dex */
public class b implements koj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.linkmanager.afc.plugin.b$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17667a = new int[LoginAction.values().length];

        static {
            try {
                f17667a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17667a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(728998264);
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
        try {
            aVar.J.put("autoLoginParam", (Object) aVar.t);
        } catch (Throwable unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TfcAutoLoginPlugin.getPluginMode.error.");
        }
        if (!Boolean.parseBoolean(kog.a().a("useAutoLoginPlugin", "true"))) {
            return 0;
        }
        if (StringUtils.isEmpty(aVar.t)) {
            String b = b(aVar);
            if ("sync".equals(b)) {
                return 1;
            }
            if ("async".equals(b)) {
                return 0;
            }
        }
        return "sync".equals(aVar.t) ? 1 : 0;
    }

    @Override // tb.koj
    public void a(com.taobao.flowcustoms.afc.a aVar, String str, knx knxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01b47fa", new Object[]{this, aVar, str, knxVar});
            return;
        }
        try {
            aVar.J.put("startLoginStatus", (Object) TFCCommonUtils.a());
            if (!Boolean.parseBoolean(kog.a().a("useAutoLoginPlugin", "false"))) {
                if (knxVar != null) {
                    aVar.J.put("autoLoginExecuteStatus", (Object) "false_orangeSwitch");
                    knxVar.a(true, str);
                }
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcAutoLoginPlugin === executePluginWithContext === useAutoLogin开关关闭");
            } else if (StringUtils.isEmpty(aVar.t)) {
                String b = b(aVar);
                if (!"sync".equals(b) && !"async".equals(b)) {
                    if (knxVar != null) {
                        aVar.J.put("autoLoginExecuteStatus", (Object) "false_orangeEmptyParamStrategy");
                        knxVar.a(true, str);
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", String.format("TfcAutoLoginPlugin === executePluginWithContext === autoLoginEmptyParamStrategy=%s", b));
                }
                a(aVar, knxVar, str);
                com.taobao.flowcustoms.afc.utils.c.a("linkx", String.format("TfcAutoLoginPlugin === executePluginWithContext === autoLoginEmptyParamStrategy=%s", b));
            } else {
                if (!"sync".equals(aVar.t) && !"async".equals(aVar.t)) {
                    if (knxVar != null) {
                        aVar.J.put("autoLoginExecuteStatus", (Object) "false_paramInValid");
                        knxVar.a(true, str);
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcAutoLoginPlugin === autologin.Invalid. === autologin参数不合法.不执行.");
                    return;
                }
                a(aVar, knxVar, str);
            }
        } catch (Throwable unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TfcAutoLoginPlugin.executePluginWithContext.error.");
            if (knxVar == null) {
                return;
            }
            aVar.J.put("autoLoginExecuteStatus", (Object) "false_catchError");
            knxVar.a(true, str);
        }
    }

    private void a(com.taobao.flowcustoms.afc.a aVar, knx knxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e23d13a", new Object[]{this, aVar, knxVar, str});
        } else if (!Login.checkSessionValid() && !StringUtils.isEmpty(Login.getLoginToken())) {
            aVar.J.put("autoLoginExecuteStatus", (Object) "true");
            Login.login(false);
            a(knxVar, str);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcAutoLoginPlugin === autologin === autologin执行.");
        } else {
            if (knxVar != null) {
                aVar.J.put("autoLoginExecuteStatus", (Object) "false_cannotAutoLogin");
                knxVar.a(true, str);
            }
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcAutoLoginPlugin === autologin.session有效或token为空.无须免登.不执行.");
        }
    }

    private void a(final knx knxVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf641e4d", new Object[]{this, knxVar, str});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(TbFcLinkInit.instance().mApplication, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.plugin.TfcAutoLoginPlugin$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null) {
                    } else {
                        try {
                            if (b.AnonymousClass1.f17667a[LoginAction.valueOf(intent.getAction()).ordinal()] != 1) {
                                com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcAutoLoginPlugin === registerLoginCallBack === 登录失败 ");
                                if (knxVar != null) {
                                    knxVar.a(false, str);
                                }
                            } else {
                                com.taobao.flowcustoms.afc.utils.c.a("linkx", "TfcAutoLoginPlugin === registerLoginCallBack === 登录成功 ");
                                if (knxVar != null) {
                                    knxVar.a(true, str);
                                }
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                        } catch (Throwable unused) {
                            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TfcAutoLoginPlugin.registerLoginListener.onReceive.error.");
                            knx knxVar2 = knxVar;
                            if (knxVar2 == null) {
                                return;
                            }
                            knxVar2.a(false, str);
                        }
                    }
                }
            });
        } catch (Throwable unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TfcAutoLoginPlugin.registerLoginListener.error.");
            if (knxVar == null) {
                return;
            }
            knxVar.a(false, str);
        }
    }

    private String b(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a075e0a", new Object[]{this, aVar});
        }
        String a2 = kog.a().a("autoLoginEmptyParamStrategy", "none");
        String a3 = kog.a().a("autoLoginEmptyParamStrategyABModule", "");
        if (!StringUtils.isEmpty(a3)) {
            VariationSet activate = UTABTest.activate("AFC", a3);
            aVar.J.put("autoLoginAbBucketId", (Object) Long.valueOf(activate.getExperimentBucketId()));
            Variation variation = activate.getVariation("autoLoginEmptyParamStrategy");
            if (variation != null) {
                return variation.getValueAsString("none");
            }
        }
        return a2;
    }
}
