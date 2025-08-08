package com.taobao.pha.tb.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.jsbridge.c;
import com.taobao.pha.tb.jsbridge.TBPHAJSBridge;
import tb.kge;
import tb.nfb;
import tb.nfc;
import tb.ngn;
import tb.ngr;

/* loaded from: classes.dex */
public class a extends nfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f18824a;

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-809591557);
        }

        public static void a(AppController appController, c.a aVar, final String str, String str2, final a.InterfaceC0751a interfaceC0751a) {
            com.taobao.pha.tb.jsbridge.b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54e7fa36", new Object[]{appController, aVar, str, str2, interfaceC0751a});
                return;
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Exception e) {
                ngr.b(a.f18824a, ngn.a(e));
            }
            if (jSONObject == null) {
                ngr.b(a.f18824a, "Param Parse Failed.");
                return;
            }
            String string = jSONObject.getString("callbackId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (StringUtils.isEmpty(string) || jSONObject2 == null) {
                ngr.b(a.f18824a, "Param Invalid.");
            } else if (str.indexOf(".") <= 0) {
                interfaceC0751a.a(PHAErrorType.RANGE_ERROR, "Function is error");
            } else {
                com.taobao.pha.core.jsbridge.b N = appController.N();
                if (N instanceof com.taobao.pha.tb.jsbridge.b) {
                    bVar = (com.taobao.pha.tb.jsbridge.b) N;
                } else {
                    bVar = new com.taobao.pha.tb.jsbridge.b(appController);
                    appController.a(bVar);
                }
                if (bVar == null) {
                    return;
                }
                h hVar = new h();
                hVar.f1664a = bVar.c();
                hVar.d = str.substring(0, str.indexOf("."));
                hVar.e = str.substring(str.indexOf(".") + 1);
                hVar.f = jSONObject2.toJSONString();
                l.b().a(bVar.b(), hVar, new IJsApiFailedCallBack() { // from class: com.taobao.pha.tb.jsbridge.a.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                    public void fail(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("534fc72f", new Object[]{this, str3});
                            return;
                        }
                        String str4 = a.f18824a;
                        ngr.b(str4, "WVJSApi:" + str + " fail " + str3);
                        try {
                            interfaceC0751a.a(PHAErrorType.THIRD_PARTY_ERROR, str3);
                        } catch (Exception e2) {
                            ngr.b(a.f18824a, ngn.a(e2));
                        }
                    }
                }, new IJsApiSucceedCallBack() { // from class: com.taobao.pha.tb.jsbridge.a.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
                    public void succeed(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str3});
                            return;
                        }
                        String str4 = a.f18824a;
                        ngr.b(str4, "WVJSApi:" + str + " success " + str3);
                        try {
                            interfaceC0751a.a(JSONObject.parseObject(str3));
                        } catch (Exception e2) {
                            ngr.b(a.f18824a, ngn.a(e2));
                        }
                    }
                });
            }
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1569189944) {
            super.a((AppController) objArr[0], (c.a) objArr[1], (String) objArr[2], (String) objArr[3], (JSONObject) objArr[4], (a.InterfaceC0751a) objArr[5]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(a aVar, AppController appController, c.a aVar2, String str, String str2, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ea7365", new Object[]{aVar, appController, aVar2, str, str2, jSONObject, interfaceC0751a});
        } else {
            aVar.b(appController, aVar2, str, str2, jSONObject, interfaceC0751a);
        }
    }

    public static /* synthetic */ void b(a aVar, AppController appController, c.a aVar2, String str, String str2, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4a5e84", new Object[]{aVar, appController, aVar2, str, str2, jSONObject, interfaceC0751a});
        } else {
            super.a(appController, aVar2, str, str2, jSONObject, interfaceC0751a);
        }
    }

    static {
        kge.a(148009587);
        f18824a = a.class.getSimpleName();
    }

    @Override // tb.nfb, com.taobao.pha.core.jsbridge.a
    public void a(final AppController appController, final c.a aVar, final String str, final String str2, final JSONObject jSONObject, final a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2780fc8", new Object[]{this, appController, aVar, str, str2, jSONObject, interfaceC0751a});
            return;
        }
        if (a(str + "." + str2) && Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.pha.tb.jsbridge.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, appController, aVar, str, str2, jSONObject, interfaceC0751a);
                    }
                }
            });
        } else {
            b(appController, aVar, str, str2, jSONObject, interfaceC0751a);
        }
    }

    private void b(AppController appController, c.a aVar, String str, String str2, JSONObject jSONObject, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a6eb27", new Object[]{this, appController, aVar, str, str2, jSONObject, interfaceC0751a});
        } else if (StringUtils.equals(str, "bridge")) {
            b.a(appController, aVar, str2, jSONObject.toJSONString(), interfaceC0751a);
        } else if (StringUtils.equals(str, nfc.PHA_MONITOR_MODULE)) {
            TBPHAJSBridge.a.a(appController, null, str2, jSONObject.toJSONString(), null);
        } else {
            String str3 = str + "." + str2;
            char c = 65535;
            int hashCode = str3.hashCode();
            if (hashCode != -1779208468) {
                if (hashCode == 849736674 && str3.equals("WindVane.call")) {
                    c = 1;
                }
            } else if (str3.equals("user.getUserInfo")) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    String string = jSONObject.getString("func");
                    String string2 = jSONObject.getString("param");
                    if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
                        return;
                    }
                    b.a(appController, aVar, string, string2, interfaceC0751a);
                    return;
                }
                b(this, appController, aVar, str, str2, jSONObject, interfaceC0751a);
                return;
            }
            String nick = Login.getNick();
            String userId = Login.getUserId();
            JSONObject jSONObject2 = new JSONObject();
            if (!StringUtils.isEmpty(Login.getSid()) && Login.checkSessionValid() && !StringUtils.isEmpty(nick) && !StringUtils.isEmpty(userId)) {
                jSONObject2.put(UserAbility.API_IS_LOGIN, (Object) true);
                jSONObject2.put("nick", (Object) nick);
                jSONObject2.put("userId", (Object) userId);
            } else {
                jSONObject2.put(UserAbility.API_IS_LOGIN, (Object) false);
            }
            interfaceC0751a.a(jSONObject2);
        }
    }

    @Override // tb.nfb, com.taobao.pha.core.jsbridge.a
    public void a(final AppController appController, final c.a aVar, final String str, final String str2, final JSONArray jSONArray, final a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45db4d5e", new Object[]{this, appController, aVar, str, str2, jSONArray, interfaceC0751a});
            return;
        }
        if (a(str + "." + str2) && Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.pha.tb.jsbridge.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.this.b(appController, aVar, str, str2, jSONArray, interfaceC0751a);
                    }
                }
            });
        } else {
            b(appController, aVar, str, str2, jSONArray, interfaceC0751a);
        }
    }

    public void b(AppController appController, c.a aVar, String str, String str2, JSONArray jSONArray, a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c40a1f", new Object[]{this, appController, aVar, str, str2, jSONArray, interfaceC0751a});
        } else if (!nfc.PHA_MONITOR_MODULE.equals(str) || !m.UPDATE_PAGE_PROPERTIES.equals(str2)) {
        } else {
            TBPHAJSBridge.a.a(appController, null, str2, jSONArray.toJSONString(), null);
        }
    }
}
