package com.taobao.pha.tb.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.AliMSNavigationBarModule;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.k;
import com.taobao.pha.core.controller.n;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.l;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.c;
import com.taobao.pha.webview.PHAWVUCWebView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nfb;
import tb.nfc;
import tb.nfz;
import tb.ngn;
import tb.ngr;

@Deprecated
/* loaded from: classes7.dex */
public class TBPHAJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    public static /* synthetic */ Object ipc$super(TBPHAJSBridge tBPHAJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(659364952);
        TAG = TBPHAJSBridge.class.getSimpleName();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = TAG;
        ngr.c(str3, "TBPHAJSBridge action:" + str + " params:" + str2);
        if (wVCallBackContext == null) {
            ngr.b(TAG, "WVCallBackContext is null.");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            ngr.b(TAG, "action is empty.");
            return false;
        } else {
            AppController appController = PHAWVUCWebView.getAppController(wVCallBackContext.getWebview());
            if (appController == null || appController.o()) {
                ngr.b(TAG, "AppController is null or disposed.");
                return false;
            }
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return execute(appController, split[0], split[1], str2, wVCallBackContext);
            }
            String[] split2 = str.split("_");
            if (split2.length == 2) {
                return execute(appController, split2[0], split2[1], str2, wVCallBackContext);
            }
            wVCallBackContext.error(r.RET_PARAM_ERR);
            return false;
        }
    }

    private boolean execute(final AppController appController, String str, String str2, String str3, final WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e59b29", new Object[]{this, appController, str, str2, str3, wVCallBackContext})).booleanValue();
        }
        try {
            jSONObject = JSON.parseObject(str3);
        } catch (Exception e) {
            ngr.b(TAG, ngn.a(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            if (wVCallBackContext != null) {
                wVCallBackContext.error(r.RET_PARAM_ERR);
            }
            ngr.b(TAG, "Param JSON Parse error.");
            return false;
        }
        l i = p.b().i();
        if (i != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", appController.t().toString());
            hashMap.put("api", "PHAJSBridge." + str + "." + str2);
            i.a(nfc.PHA_MONITOR_MODULE, 19999, "/pha.jsapi.deprecatedJSAPI", "", "", hashMap);
        }
        ngr.b(TAG, "Deprecated API:" + str + "." + str2);
        a.InterfaceC0751a interfaceC0751a = new a.InterfaceC0751a() { // from class: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                if (wVCallBackContext2 == null) {
                    return;
                }
                if (jSONObject2 != null) {
                    wVCallBackContext2.success(jSONObject2.toString());
                } else {
                    wVCallBackContext2.success();
                }
            }

            @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
            public void a(PHAErrorType pHAErrorType, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str4});
                } else if (wVCallBackContext == null) {
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", (Object) pHAErrorType.toString());
                    jSONObject2.put("message", (Object) str4);
                    wVCallBackContext.error(jSONObject2.toJSONString());
                }
            }
        };
        char c = 65535;
        switch (str.hashCode()) {
            case -271593121:
                if (str.equals(AliMSNavigationBarModule.NAME)) {
                    c = 0;
                    break;
                }
                break;
            case 79177:
                if (str.equals(nfc.PHA_MONITOR_MODULE)) {
                    c = 1;
                    break;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    c = 4;
                    break;
                }
                break;
            case 329301056:
                if (str.equals("userTrack")) {
                    c = 2;
                    break;
                }
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            nfb.e.a(appController, str2, jSONObject, interfaceC0751a);
        } else if (c == 1) {
            a.a(appController, this.mWebView, str2, str3, wVCallBackContext);
        } else if (c == 2) {
            nfb.p.a(appController, str2, jSONObject, interfaceC0751a);
        } else if (c != 3) {
            if (c == 4) {
                ngr.a("user Deprecated API:" + str2);
            } else {
                com.taobao.pha.core.jsbridge.a o = p.b().o();
                k w = appController.w();
                nfz d = (w == null || w.d() == null) ? null : w.d();
                if (o != null && d != null) {
                    final String str4 = str + "." + str2;
                    final JSONObject jSONObject2 = jSONObject;
                    o.a(appController, d, str, str2, jSONObject, new a.InterfaceC0751a() { // from class: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                        public void a(JSONObject jSONObject3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                                return;
                            }
                            WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                            if (wVCallBackContext2 != null) {
                                if (jSONObject3 != null) {
                                    wVCallBackContext2.success(jSONObject3.toString());
                                } else {
                                    wVCallBackContext2.success();
                                }
                            }
                            ngn.a(appController, str4, jSONObject2);
                        }

                        @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                        public void a(PHAErrorType pHAErrorType, String str5) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str5});
                                return;
                            }
                            if (wVCallBackContext != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", (Object) pHAErrorType.toString());
                                jSONObject3.put("message", (Object) str5);
                                wVCallBackContext.error(jSONObject3.toJSONString());
                            }
                            ngn.a(appController, str4, jSONObject2, pHAErrorType, str5);
                        }
                    });
                }
            }
        } else if (nfc.PHA_MONITOR_MEASURE_PAGE_RENDER_FINISHED.equals(str2)) {
            appController.P().a(1);
            wVCallBackContext.success("");
        } else {
            wVCallBackContext.error("Invalid method.");
        }
        return true;
    }

    @Deprecated
    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final String f18820a;

        static {
            kge.a(-1948898138);
            f18820a = a.class.getSimpleName();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            if (r10.equals("hideSplashView") != false) goto L11;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(com.taobao.pha.core.controller.AppController r8, android.taobao.windvane.webview.IWVWebView r9, java.lang.String r10, java.lang.String r11, android.taobao.windvane.jsbridge.WVCallBackContext r12) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                r7 = 5
                if (r1 == 0) goto L1e
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r1[r6] = r8
                r1[r5] = r9
                r1[r4] = r10
                r1[r3] = r11
                r1[r2] = r12
                java.lang.String r8 = "7277fa6b"
                r0.ipc$dispatch(r8, r1)
                return
            L1e:
                r0 = -1
                int r1 = r10.hashCode()
                switch(r1) {
                    case -2115735895: goto L7e;
                    case -2101475902: goto L73;
                    case -1572000631: goto L68;
                    case -735790458: goto L5d;
                    case -595701486: goto L52;
                    case -439577013: goto L46;
                    case 261217422: goto L3d;
                    case 1089936202: goto L32;
                    case 1490029383: goto L27;
                    default: goto L26;
                }
            L26:
                goto L89
            L27:
                java.lang.String r1 = "postMessage"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 7
                goto L8a
            L32:
                java.lang.String r1 = "registerOnSwiperChange"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 5
                goto L8a
            L3d:
                java.lang.String r1 = "hideSplashView"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                goto L8a
            L46:
                java.lang.String r1 = "updatePageProperties"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 8
                goto L8a
            L52:
                java.lang.String r1 = "registerOnPageDisappear"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 2
                goto L8a
            L5d:
                java.lang.String r1 = "registerOnPageAppear"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 1
                goto L8a
            L68:
                java.lang.String r1 = "showSplashView"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 3
                goto L8a
            L73:
                java.lang.String r1 = "setCurrentSwiperItem"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 6
                goto L8a
            L7e:
                java.lang.String r1 = "setAppData"
                boolean r1 = r10.equals(r1)
                if (r1 == 0) goto L89
                r2 = 0
                goto L8a
            L89:
                r2 = -1
            L8a:
                switch(r2) {
                    case 0: goto Lae;
                    case 1: goto Laa;
                    case 2: goto La6;
                    case 3: goto La2;
                    case 4: goto L9e;
                    case 5: goto L9a;
                    case 6: goto L96;
                    case 7: goto L92;
                    case 8: goto L8e;
                    default: goto L8d;
                }
            L8d:
                goto Lb1
            L8e:
                j(r8, r9, r10, r11, r12)
                goto Lb1
            L92:
                i(r8, r9, r10, r11, r12)
                return
            L96:
                h(r8, r9, r10, r11, r12)
                return
            L9a:
                g(r8, r9, r10, r11, r12)
                return
            L9e:
                f(r8, r9, r10, r11, r12)
                return
            La2:
                e(r8, r9, r10, r11, r12)
                return
            La6:
                d(r8, r9, r10, r11, r12)
                return
            Laa:
                c(r8, r9, r10, r11, r12)
                return
            Lae:
                b(r8, r9, r10, r11, r12)
            Lb1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.a(com.taobao.pha.core.controller.AppController, android.taobao.windvane.webview.IWVWebView, java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
        }

        public static void b(AppController appController, IWVWebView iWVWebView, String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f73fac", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            try {
                ManifestModel manifestModel = (ManifestModel) JSONObject.parseObject(JSONObject.parseObject(str2).getString("data"), ManifestModel.class);
                if (manifestModel != null) {
                    appController.a(manifestModel);
                }
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.success("success to setAppData");
            } catch (JSONException unused) {
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.error("fail to setAppData");
            }
        }

        public static void c(AppController appController, final IWVWebView iWVWebView, String str, String str2, final WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b77684ed", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            c cVar = null;
            Iterator<c> it = appController.M().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                nfz pageView = next.getPageView();
                if (pageView != null) {
                    View j = pageView.j();
                    if ((j instanceof IWVWebView) && j == iWVWebView) {
                        cVar = next;
                        break;
                    }
                }
            }
            if (cVar != null) {
                cVar.registerPageAppearListener(new c.a() { // from class: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.pha.core.phacontainer.c.a
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("index", (Object) Integer.valueOf(i));
                        WVStandardEventCenter.postNotificationToJS(IWVWebView.this, "onPHAPageAppear", jSONObject.toJSONString());
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 == null) {
                            return;
                        }
                        wVCallBackContext2.success();
                    }
                });
            } else if (wVCallBackContext == null) {
            } else {
                wVCallBackContext.error("");
            }
        }

        public static void d(AppController appController, final IWVWebView iWVWebView, String str, String str2, final WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9f5ca2e", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            c cVar = null;
            Iterator<c> it = appController.M().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                nfz pageView = next.getPageView();
                if (pageView != null) {
                    View j = pageView.j();
                    if ((j instanceof IWVWebView) && j == iWVWebView) {
                        cVar = next;
                        break;
                    }
                }
            }
            if (cVar != null) {
                cVar.registerPageDisappearListener(new c.b() { // from class: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.pha.core.phacontainer.c.b
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("index", (Object) Integer.valueOf(i));
                        WVStandardEventCenter.postNotificationToJS(IWVWebView.this, "onPHAPageDisappear", jSONObject.toJSONString());
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 == null) {
                            return;
                        }
                        wVCallBackContext2.success();
                    }
                });
            } else if (wVCallBackContext == null) {
            } else {
                wVCallBackContext.error("");
            }
        }

        public static void e(AppController appController, IWVWebView iWVWebView, String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc750f6f", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            n O = appController.O();
            if (O == null) {
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.error("");
                return;
            }
            O.a();
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success();
        }

        public static void f(AppController appController, IWVWebView iWVWebView, String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ef454b0", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            n O = appController.O();
            if (O == null) {
                if (wVCallBackContext == null) {
                    return;
                }
                wVCallBackContext.error("");
                return;
            }
            O.b();
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void g(final com.taobao.pha.core.controller.AppController r3, final android.taobao.windvane.webview.IWVWebView r4, java.lang.String r5, java.lang.String r6, android.taobao.windvane.jsbridge.WVCallBackContext r7) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L1e
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r3
                r3 = 1
                r1[r3] = r4
                r3 = 2
                r1[r3] = r5
                r3 = 3
                r1[r3] = r6
                r3 = 4
                r1[r3] = r7
                java.lang.String r3 = "417399f1"
                r0.ipc$dispatch(r3, r1)
                return
            L1e:
                r5 = 0
                com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSONObject.parseObject(r6)     // Catch: java.lang.Exception -> L2c
                java.lang.String r0 = "index"
                java.lang.Integer r5 = r6.getInteger(r0)     // Catch: java.lang.Exception -> L2a
                goto L37
            L2a:
                r0 = move-exception
                goto L2e
            L2c:
                r0 = move-exception
                r6 = r5
            L2e:
                java.lang.String r1 = com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.f18820a
                java.lang.String r0 = tb.ngn.a(r0)
                tb.ngr.b(r1, r0)
            L37:
                if (r6 == 0) goto L66
                if (r5 != 0) goto L3c
                goto L66
            L3c:
                int r5 = r5.intValue()
                com.taobao.pha.core.controller.k r5 = r3.a(r5)
                if (r5 == 0) goto L5e
                com.taobao.pha.core.phacontainer.c r6 = r5.c()
                boolean r6 = r6 instanceof com.taobao.pha.core.phacontainer.ViewPagerFragment
                if (r6 != 0) goto L4f
                goto L5e
            L4f:
                com.taobao.pha.core.phacontainer.c r5 = r5.c()
                com.taobao.pha.core.phacontainer.ViewPagerFragment r5 = (com.taobao.pha.core.phacontainer.ViewPagerFragment) r5
                com.taobao.pha.tb.jsbridge.TBPHAJSBridge$a$3 r6 = new com.taobao.pha.tb.jsbridge.TBPHAJSBridge$a$3
                r6.<init>()
                r5.registerViewPagerChangeListener(r6)
                return
            L5e:
                if (r7 == 0) goto L65
                java.lang.String r3 = "Find ViewPagerFragment failed."
                r7.error(r3)
            L65:
                return
            L66:
                if (r7 == 0) goto L6d
                java.lang.String r3 = "RegisterOnViewPagerChange JSON parse failed."
                r7.error(r3)
            L6d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.g(com.taobao.pha.core.controller.AppController, android.taobao.windvane.webview.IWVWebView, java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
        }

        @Deprecated
        public static void a(AppController appController, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0fc0a4d", new Object[]{appController, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msgType", (Object) "call");
            jSONObject.put("func", (Object) "swiperChange");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("index", (Object) Integer.valueOf(i));
            jSONObject.put("param", (Object) jSONObject2);
            if (appController.J() != null) {
                appController.J().a(jSONObject);
            }
            if (appController.E() == null) {
                return;
            }
            appController.E().a("swiper_change", jSONObject, "native", "AppWorker");
            appController.E().a("swiperchange", jSONObject2, "native", "AppWorker");
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void h(com.taobao.pha.core.controller.AppController r3, android.taobao.windvane.webview.IWVWebView r4, java.lang.String r5, java.lang.String r6, android.taobao.windvane.jsbridge.WVCallBackContext r7) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 0
                if (r1 == 0) goto L1e
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r3
                r3 = 1
                r1[r3] = r4
                r3 = 2
                r1[r3] = r5
                r3 = 3
                r1[r3] = r6
                r3 = 4
                r1[r3] = r7
                java.lang.String r3 = "63f2df32"
                r0.ipc$dispatch(r3, r1)
                return
            L1e:
                r5 = 0
                com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSONObject.parseObject(r6)     // Catch: java.lang.Exception -> L33
                java.lang.String r0 = "index"
                java.lang.Integer r5 = r6.getInteger(r0)     // Catch: java.lang.Exception -> L31
                java.lang.String r0 = "smooth"
                boolean r2 = r6.getBooleanValue(r0)     // Catch: java.lang.Exception -> L31
                goto L3e
            L31:
                r0 = move-exception
                goto L35
            L33:
                r0 = move-exception
                r6 = r5
            L35:
                java.lang.String r1 = com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.f18820a
                java.lang.String r0 = tb.ngn.a(r0)
                tb.ngr.b(r1, r0)
            L3e:
                if (r6 == 0) goto L98
                if (r5 != 0) goto L43
                goto L98
            L43:
                com.taobao.pha.core.controller.k r3 = r3.w()
                if (r3 != 0) goto L51
                if (r7 == 0) goto L50
                java.lang.String r3 = "current page view controller is null"
                r7.error(r3)
            L50:
                return
            L51:
                com.taobao.pha.core.phacontainer.c r3 = r3.c()
                boolean r6 = r3 instanceof com.taobao.pha.core.phacontainer.ViewPagerFragment
                if (r6 != 0) goto L62
                if (r7 == 0) goto L61
                java.lang.String r3 = "pageFragment is not ViewPagerFragment"
                r7.error(r3)
            L61:
                return
            L62:
                com.taobao.pha.core.phacontainer.ViewPagerFragment r3 = (com.taobao.pha.core.phacontainer.ViewPagerFragment) r3
                com.taobao.pha.core.phacontainer.PageHeaderFragment r6 = r3.getPageHeaderFragment()
                if (r6 == 0) goto L90
                com.taobao.pha.core.phacontainer.PageHeaderFragment r6 = r3.getPageHeaderFragment()
                tb.nfz r6 = r6.getPageView()
                if (r6 == 0) goto L90
                com.taobao.pha.core.phacontainer.PageHeaderFragment r6 = r3.getPageHeaderFragment()
                tb.nfz r6 = r6.getPageView()
                android.view.View r6 = r6.j()
                if (r6 == r4) goto L83
                goto L90
            L83:
                int r4 = r5.intValue()
                r3.setCurrentViewPagerItem(r4, r2)
                if (r7 == 0) goto L8f
                r7.success()
            L8f:
                return
            L90:
                if (r7 == 0) goto L97
                java.lang.String r3 = "currentWebView isn't the webView of current page header"
                r7.error(r3)
            L97:
                return
            L98:
                if (r7 == 0) goto L9f
                java.lang.String r3 = "SetCurrentViewPagerItem JSON parse failed."
                r7.error(r3)
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.tb.jsbridge.TBPHAJSBridge.a.h(com.taobao.pha.core.controller.AppController, android.taobao.windvane.webview.IWVWebView, java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
        }

        public static void i(AppController appController, IWVWebView iWVWebView, String str, String str2, WVCallBackContext wVCallBackContext) {
            JSONObject jSONObject;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86722473", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            String str4 = null;
            try {
                jSONObject = JSONObject.parseObject(str2);
                try {
                    str3 = jSONObject.getString("targetOrigin");
                } catch (Exception e) {
                    e = e;
                    ngr.b(f18820a, ngn.a(e));
                    str3 = null;
                    if (jSONObject != null) {
                    }
                    ngr.b(f18820a, "JSON parse failed.");
                }
            } catch (Exception e2) {
                e = e2;
                jSONObject = null;
            }
            if (jSONObject != null || str3 == null) {
                ngr.b(f18820a, "JSON parse failed.");
            } else if ("jsengine".equals(str3)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("msgType", (Object) "call");
                jSONObject2.put("func", (Object) "message");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("data", (Object) jSONObject.getJSONObject("data"));
                if (iWVWebView != null) {
                    jSONObject3.put("origin", (Object) iWVWebView.getUrl());
                }
                jSONObject2.put("param", (Object) jSONObject3);
                if (appController.J() == null) {
                    return;
                }
                appController.J().a(jSONObject2);
            } else {
                Iterator<nfz> it = appController.y().iterator();
                while (true) {
                    if (it.hasNext()) {
                        nfz next = it.next();
                        if (next != null && next.j() == iWVWebView) {
                            str4 = next.d();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (str4 == null) {
                    ngr.b(f18820a, "Source key is null.");
                    return;
                }
                String str5 = "*";
                if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str5, str3)) {
                    str5 = ngn.b(str3);
                }
                if (appController.E() == null) {
                    return;
                }
                appController.E().a("message", jSONObject, str4, str5);
            }
        }

        public static void j(AppController appController, IWVWebView iWVWebView, String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8f169b4", new Object[]{appController, iWVWebView, str, str2, wVCallBackContext});
                return;
            }
            try {
                JSONArray parseArray = JSONObject.parseArray(str2);
                if (parseArray == null) {
                    return;
                }
                ManifestModel u = appController.u();
                for (int i = 0; i < parseArray.size(); i++) {
                    PageModel pageModel = (PageModel) parseArray.getObject(i, PageModel.class);
                    if (pageModel != null && !TextUtils.isEmpty(pageModel.getUrl())) {
                        String b = ngn.b(pageModel.getUrl());
                        if (!TextUtils.isEmpty(b)) {
                            Iterator<PageModel> it = u.pages.iterator();
                            while (it.hasNext()) {
                                PageModel next = it.next();
                                if (next.frames.size() > 0) {
                                    Iterator<PageModel> it2 = next.frames.iterator();
                                    while (it2.hasNext()) {
                                        PageModel next2 = it2.next();
                                        if (TextUtils.equals(b, ngn.b(next2.getUrl()))) {
                                            a(next2, pageModel);
                                        }
                                    }
                                } else if (TextUtils.equals(b, ngn.b(next.getUrl()))) {
                                    a(next, pageModel);
                                }
                            }
                        }
                    }
                }
                List<c> M = appController.M();
                if (M == null) {
                    return;
                }
                for (int i2 = 0; i2 < parseArray.size(); i2++) {
                    PageModel pageModel2 = (PageModel) parseArray.getObject(i2, PageModel.class);
                    if (pageModel2 != null || !TextUtils.isEmpty(pageModel2.getUrl())) {
                        String b2 = ngn.b(pageModel2.getUrl());
                        if (!TextUtils.isEmpty(b2)) {
                            for (c cVar : M) {
                                PageModel mo1202getPageModel = cVar.mo1202getPageModel();
                                if (mo1202getPageModel != null && !TextUtils.isEmpty(mo1202getPageModel.getUrl())) {
                                    String b3 = ngn.b(mo1202getPageModel.getUrl());
                                    if (b2 != null && b2.equals(b3)) {
                                        cVar.updatePageModel(pageModel2);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                ngr.b(f18820a, ngn.a(e));
            }
        }

        public static void a(PageModel pageModel, PageModel pageModel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9341d0e8", new Object[]{pageModel, pageModel2});
            } else if (pageModel == null || pageModel2 == null) {
            } else {
                if (!TextUtils.isEmpty(pageModel2.getUrl())) {
                    pageModel.setUrl(pageModel2.getUrl());
                }
                if (!TextUtils.isEmpty(pageModel2.backgroundColor)) {
                    pageModel.backgroundColor = pageModel2.backgroundColor;
                }
                pageModel.setEnableHardPullRefresh(Boolean.valueOf(pageModel2.isEnableHardPullRefresh()));
                pageModel.setEnableSoftPullRefresh(Boolean.valueOf(pageModel2.isEnableSoftPullRefresh()));
            }
        }
    }
}
