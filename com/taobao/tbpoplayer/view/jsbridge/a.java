package com.taobao.tbpoplayer.view.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.p;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.ClickableAreaParam;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.info.frequency.FrequencyManager;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.tbpoplayer.util.e;
import com.taobao.tbpoplayer.view.jsbridge.a;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bzs;
import tb.kge;
import tb.riy;
import tb.tbt;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final WeakReference<PopLayerBaseView> f22274a;

    /* renamed from: com.taobao.tbpoplayer.view.jsbridge.a$a */
    /* loaded from: classes9.dex */
    public interface InterfaceC0922a {
        void a(String str);

        void a(Map<String, Object> map);

        void b(String str);
    }

    /* loaded from: classes9.dex */
    public static abstract class b implements InterfaceC0922a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-983406564);
            kge.a(1049744307);
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            }
        }
    }

    static {
        kge.a(-838307127);
    }

    public static /* synthetic */ void lambda$d0imGqGCvqL74mY12ucf83VwAd8(InterfaceC0922a interfaceC0922a, String str) {
        a(interfaceC0922a, str);
    }

    public static /* synthetic */ void lambda$tVKvTWfr6bLqb8viLcm0IwCR8ao(PopLayerBaseView popLayerBaseView, String str, InterfaceC0922a interfaceC0922a, String str2) {
        a(popLayerBaseView, str, interfaceC0922a, str2);
    }

    public a(PopLayerBaseView popLayerBaseView) {
        this.f22274a = new WeakReference<>(popLayerBaseView);
    }

    private PopLayerBaseView k(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerBaseView) ipChange.ipc$dispatch("7bd95826", new Object[]{this, interfaceC0922a});
        }
        PopLayerBaseView popLayerBaseView = this.f22274a.get();
        if (popLayerBaseView != null) {
            return popLayerBaseView;
        }
        if (interfaceC0922a == null) {
            return null;
        }
        interfaceC0922a.a("popViewNull");
        return null;
    }

    public void a(String str, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad6bd32", new Object[]{this, str, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        Nav.from(k.getContext()).toUri(str);
        k.syncJumpToUrlInfo(str);
        if (interfaceC0922a == null) {
            return;
        }
        interfaceC0922a.b(null);
    }

    public boolean a(String str, String str2, InterfaceC0922a interfaceC0922a) {
        PopLayerBaseView k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("223f72c", new Object[]{this, str, str2, interfaceC0922a})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || ((!str2.equals("allowJumpOut") && !str2.equals("market")) || (k = k(interfaceC0922a)) == null)) {
            return false;
        }
        if (str2.equals("allowJumpOut")) {
            try {
                Nav.from(k.getContext()).allowEscape().toUri(str);
                k.syncJumpToUrlInfo(str);
                if (interfaceC0922a != null) {
                    interfaceC0922a.b(null);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.NavToUrl.allowJumpOut.error.", th);
                if (interfaceC0922a != null) {
                    interfaceC0922a.a("NavToUrl.allowJumpOut.error.");
                }
            }
        } else {
            boolean a2 = e.a(k.getContext(), (String) null);
            if (interfaceC0922a != null) {
                if (a2) {
                    interfaceC0922a.b(null);
                } else {
                    interfaceC0922a.a("market not found");
                }
                interfaceC0922a.a("NavToUrl.market.error.");
            }
        }
        return true;
    }

    public void a(String str, IWVWebView iWVWebView, final String str2, final InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe34404", new Object[]{this, str, iWVWebView, str2, interfaceC0922a});
            return;
        }
        final PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        h hVar = new h();
        hVar.d = "WVNative";
        hVar.e = "openWindow";
        hVar.f = str;
        hVar.f1664a = iWVWebView;
        l.b().a(new p(k.getContext(), iWVWebView), hVar, new IJsApiFailedCallBack() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$a$d0imGqGCvqL74mY12ucf83VwAd8
            @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
            public final void fail(String str3) {
                a.lambda$d0imGqGCvqL74mY12ucf83VwAd8(a.InterfaceC0922a.this, str3);
            }
        }, new IJsApiSucceedCallBack() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$a$tVKvTWfr6bLqb8viLcm0IwCR8ao
            @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
            public final void succeed(String str3) {
                a.lambda$tVKvTWfr6bLqb8viLcm0IwCR8ao(PopLayerBaseView.this, str2, interfaceC0922a, str3);
            }
        });
    }

    public static /* synthetic */ void a(InterfaceC0922a interfaceC0922a, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62408486", new Object[]{interfaceC0922a, str});
        } else if (interfaceC0922a == null) {
        } else {
            interfaceC0922a.a("WVCallMethod.WVNative.openWindow.failed");
        }
    }

    public static /* synthetic */ void a(PopLayerBaseView popLayerBaseView, String str, InterfaceC0922a interfaceC0922a, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c908c8", new Object[]{popLayerBaseView, str, interfaceC0922a, str2});
            return;
        }
        popLayerBaseView.syncJumpToUrlInfo(str);
        if (interfaceC0922a == null) {
            return;
        }
        interfaceC0922a.b(null);
    }

    public void a(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cdd1bc", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.displayMe(false);
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.display.done", new Object[0]);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, long j4, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58e3100", new Object[]{this, str, str2, str3, str4, str5, str6, new Long(j), new Long(j2), new Long(j3), new Long(j4), interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        String str7 = TextUtils.isEmpty(str) ? "commonJsClose" : str;
        if (!TextUtils.isEmpty(str6)) {
            k.setContentId(str6);
        }
        if (!TextUtils.isEmpty(str4)) {
            try {
                k.putOnePopExtras(JSON.parseObject(str4));
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("close.putOnePopExtras.error.", th);
            }
        }
        k.setViewTimeLineTime(j, j2, j3, j4);
        k.setUserResultInTrack(str5, false, null);
        k.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str7, str2, str3);
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.close.done", new Object[0]);
    }

    public void b(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f455f5b", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.getPopRequest().v();
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.increaseReadTimes.done", new Object[0]);
    }

    public void c(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bcecfa", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.getPopRequest().w();
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.finishPop.done", new Object[0]);
    }

    public void a(double d, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85c110e", new Object[]{this, new Double(d), interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.setPenetrateAlpha((int) (d * 255.0d));
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.setModalThreshold.done.", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.taobao.tbpoplayer.view.jsbridge.a.InterfaceC0922a r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.view.jsbridge.a.a(java.lang.String, java.lang.String, java.lang.String, com.taobao.tbpoplayer.view.jsbridge.a$a):void");
    }

    public void l(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf0e791", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        d dVar = (d) k.getPopRequest();
        Event y = dVar.y();
        jSONObject.put("uri", (Object) y.uri);
        jSONObject.put("param", (Object) dVar.B());
        jSONObject.put("nativeUri", (Object) y.curPage);
        jSONObject.put("nativeUrl", (Object) y.curPageUrl);
        String jSONObject2 = jSONObject.toString();
        if (interfaceC0922a != null) {
            interfaceC0922a.b(jSONObject2);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getTriggerEventInfo.done", new Object[0]);
    }

    public void d(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2347a99", new Object[]{this, interfaceC0922a});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) ("\"PopLayer/" + PopLayer.getReference().getVersion() + "\""));
        String jSONObject2 = jSONObject.toString();
        if (interfaceC0922a != null) {
            interfaceC0922a.b(jSONObject2);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getPopLayerVersion.done", new Object[0]);
    }

    public void e(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac0838", new Object[]{this, interfaceC0922a});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeTravelSec", (Object) Long.valueOf(bzs.a().d()));
        if (interfaceC0922a != null) {
            interfaceC0922a.b(jSONObject.toString());
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getTimeTravelSec.done", new Object[0]);
    }

    public void c(String str, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5798c4f0", new Object[]{this, str, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        d dVar = (d) k.getPopRequest();
        boolean a2 = (dVar == null || dVar.f3190a == null) ? false : com.taobao.tbpoplayer.view.a.a().a(InternalTriggerController.a(dVar.f3190a.get()), k.getUUID(), str);
        HashMap hashMap = new HashMap();
        hashMap.put("message", a2 ? "绑定成功" : "绑定失败");
        if (interfaceC0922a != null) {
            interfaceC0922a.a(hashMap);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.bindValueToNative.done", new Object[0]);
    }

    public void d(String str, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f9c8cf", new Object[]{this, str, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        d dVar = (d) k.getPopRequest();
        String b2 = (dVar == null || dVar.f3190a == null) ? "" : com.taobao.tbpoplayer.view.a.a().b(InternalTriggerController.a(dVar.f3190a.get()), k.getUUID(), str);
        HashMap hashMap = new HashMap();
        hashMap.put("value", b2);
        if (interfaceC0922a != null) {
            interfaceC0922a.a(hashMap);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.readValueFromNative.done", new Object[0]);
    }

    public void f(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552395d7", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        Map<String, Object> k2 = ((d) k.getPopRequest()).k();
        if (k2 != null) {
            if (interfaceC0922a != null) {
                interfaceC0922a.a(k2);
            }
        } else if (interfaceC0922a != null) {
            interfaceC0922a.a("noData");
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getPopCheckReturn.done", new Object[0]);
    }

    public void g(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b2376", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        String str = ((d) k.getPopRequest()).x().json;
        HashMap hashMap = new HashMap();
        hashMap.put("result", str);
        if (interfaceC0922a != null) {
            interfaceC0922a.a(hashMap);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getPopConfigInfo.done", new Object[0]);
    }

    public void h(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812b115", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        d dVar = (d) k.getPopRequest();
        FrequencyManager.FrequencyInfo c = com.alibaba.poplayer.info.frequency.b.e().c(dVar.x());
        if (c != null) {
            HashMap hashMap = new HashMap();
            long j = 0;
            if (c.popInfoMap.containsKey(Long.valueOf(c.curFIndex))) {
                j = c.popInfoMap.get(Long.valueOf(c.curFIndex)).intValue();
            }
            hashMap.put("curFrequencyIndex", Long.valueOf(c.curFIndex));
            hashMap.put("curFrequencyPopTimes", Long.valueOf(j));
            if (dVar.x().freqConfigs != null) {
                hashMap.put("curFrequencyRemainPopTimes", Long.valueOf(dVar.x().freqConfigs.freqMaxCount - j));
            }
            if (interfaceC0922a != null) {
                interfaceC0922a.a(hashMap);
            }
        } else if (interfaceC0922a != null) {
            interfaceC0922a.a("noData");
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getFrequencyInfo.done", new Object[0]);
    }

    public void a(long j, long j2, long j3, long j4, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520554bc", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.setViewTimeLineTime(j, j2, j3, j4);
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.trackTimeLineCostTime.done", new Object[0]);
    }

    public void i(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818a3eb4", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        Map<String, Object> l = k.getPopRequest().l();
        if (l != null) {
            if (interfaceC0922a != null) {
                interfaceC0922a.a(l);
            }
        } else if (interfaceC0922a != null) {
            interfaceC0922a.a("noData");
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.getLocalCrowdReturn.done", new Object[0]);
    }

    public void e(String str, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545accae", new Object[]{this, str, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.setContentId(str);
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.setPopContentId.done", new Object[0]);
    }

    public void f(String str, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2bbd08d", new Object[]{this, str, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.putOnePopExtras(JSON.parseObject(str));
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.putOnePopExtras.done", new Object[0]);
    }

    public void g(String str, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511cd46c", new Object[]{this, str, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        k.setUserResultInTrack(str, false, null);
        if (interfaceC0922a != null) {
            interfaceC0922a.b(null);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.recordUserBehavior.done", new Object[0]);
    }

    public void b(String str, String str2, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d56147", new Object[]{this, str, str2, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        if (com.taobao.tbpoplayer.view.c.a().a(str, (List) JSON.parseObject(str2, new TypeReference<ArrayList<String>>() { // from class: com.taobao.tbpoplayer.view.jsbridge.a.1
            {
                a.this = this;
            }
        }.getType(), new Feature[0]), d.b(k.getPopRequest()), k)) {
            if (interfaceC0922a != null) {
                interfaceC0922a.b(null);
            }
        } else if (interfaceC0922a != null) {
            interfaceC0922a.a("pageEventDisable");
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.addPageEventListen.done", new Object[0]);
    }

    public void c(String str, String str2, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f86cb66", new Object[]{this, str, str2, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        if (com.taobao.tbpoplayer.view.c.a().a(str, (List) JSON.parseObject(str2, new TypeReference<ArrayList<String>>() { // from class: com.taobao.tbpoplayer.view.jsbridge.a.2
            {
                a.this = this;
            }
        }.getType(), new Feature[0]), d.b(k.getPopRequest()))) {
            if (interfaceC0922a != null) {
                interfaceC0922a.b(null);
            }
        } else if (interfaceC0922a != null) {
            interfaceC0922a.a("pageEventDisable");
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.removePageEventListen.done", new Object[0]);
    }

    public void j(InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b01cc53", new Object[]{this, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            return;
        }
        if (com.taobao.tbpoplayer.view.c.a().b(d.b(k.getPopRequest()))) {
            if (interfaceC0922a != null) {
                interfaceC0922a.b(null);
            }
        } else if (interfaceC0922a != null) {
            interfaceC0922a.a("pageEventDisable");
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.removeAllPageEventListen.done", new Object[0]);
    }

    public void a(String str, JSONObject jSONObject, InterfaceC0922a interfaceC0922a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ba1e6", new Object[]{this, str, jSONObject, interfaceC0922a});
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
            if (interfaceC0922a == null) {
                return;
            }
            interfaceC0922a.a("paramInvalid");
        } else {
            jSONObject.put("type", tbt.PRE_RENDER);
            jSONObject.put(JarvisConstant.KEY_JARVIS_TRIGGER, "PopLayer");
            if (TSchedule.preloadWithConfig("PopLayer", str, Collections.singletonList(jSONObject), new ScheduleProtocolCallback() { // from class: com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                    }
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveParameter(String str2, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("1ba0efdb", new Object[]{this, str2, map})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                    }
                    return true;
                }
            })) {
                if (interfaceC0922a != null) {
                    interfaceC0922a.b(null);
                }
            } else if (interfaceC0922a != null) {
                interfaceC0922a.a("preloadFailed");
            }
            com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.preRenderUrl.done", new Object[0]);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC0922a interfaceC0922a) {
        String str9;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288ac36c", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, interfaceC0922a});
            return;
        }
        PopLayerBaseView k = k(interfaceC0922a);
        if (k == null) {
            if (interfaceC0922a == null) {
                return;
            }
            interfaceC0922a.a("");
            return;
        }
        Context context = k.getContext();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        int width = k.getWidth();
        int height = k.getHeight();
        ClickableAreaParam clickableAreaParam = new ClickableAreaParam();
        if (TextUtils.isEmpty(str) || Boolean.parseBoolean(str)) {
            str9 = "";
            z = true;
        } else {
            str9 = "";
            z = false;
        }
        k.setEnableClickArea(z);
        if (z) {
            clickableAreaParam.width = (int) a(context, percentInstance, str2, width);
            clickableAreaParam.height = (int) a(context, percentInstance, str3, height);
            clickableAreaParam.left = (int) a(context, percentInstance, str5, width);
            clickableAreaParam.right = (int) a(context, percentInstance, str6, width);
            clickableAreaParam.top = (int) a(context, percentInstance, str7, height);
            clickableAreaParam.bottom = (int) a(context, percentInstance, str8, height);
            char c = 65535;
            switch (str4.hashCode()) {
                case -1436089959:
                    if (str4.equals("rightTop")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str4.equals("center")) {
                        c = 4;
                        break;
                    }
                    break;
                case -901823641:
                    if (str4.equals("rightBottom")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55433166:
                    if (str4.equals("leftTop")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1626916114:
                    if (str4.equals("leftBottom")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                clickableAreaParam.layoutX = "left";
                clickableAreaParam.layoutY = "top";
            } else if (c == 1) {
                clickableAreaParam.layoutX = "left";
                clickableAreaParam.layoutY = "bottom";
            } else if (c == 2) {
                clickableAreaParam.layoutX = "right";
                clickableAreaParam.layoutY = "top";
            } else if (c == 3) {
                clickableAreaParam.layoutX = "right";
                clickableAreaParam.layoutY = "bottom";
            } else if (c == 4) {
                clickableAreaParam.layoutX = "center";
                clickableAreaParam.layoutY = "center";
            }
        }
        k.setClickableAreaFrame(clickableAreaParam);
        if (interfaceC0922a != null) {
            interfaceC0922a.b(str9);
        }
        com.alibaba.poplayer.utils.c.a("PopLayerJsBridgeAction.setClickArea.success.enable=%s.width=%s.height=%s.layout=%s.left=%s.right=%s.top=%s.bottom=%s", str, str2, str3, str4, str5, str6, str7, str8);
    }

    private float a(Context context, NumberFormat numberFormat, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8eb3a5ef", new Object[]{this, context, numberFormat, str, new Integer(i)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.contains(riy.MOD)) {
            try {
                float floatValue = numberFormat.parse(str).floatValue();
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                } else if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                return i * floatValue;
            } catch (ParseException e) {
                e.printStackTrace();
                return 0.0f;
            }
        }
        return g.a(context, Float.parseFloat(str));
    }
}
