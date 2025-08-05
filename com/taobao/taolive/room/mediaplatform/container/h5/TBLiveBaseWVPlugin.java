package com.taobao.taolive.room.mediaplatform.container.h5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolivecontainer.TBLiveH5Container;
import tb.kge;
import tb.mfi;
import tb.pmd;
import tb.pnj;
import tb.pqi;
import tb.pqj;
import tb.sgp;

/* loaded from: classes8.dex */
public class TBLiveBaseWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";
    private sgp mRetentionViewHelper = new sgp();

    static {
        kge.a(160188537);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBaseWVPlugin tBLiveBaseWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        final com.taobao.tbliveinteractive.container.h5.e eVar = new com.taobao.tbliveinteractive.container.h5.e(str, str2, wVCallBackContext);
        switch (str.hashCode()) {
            case -1910655742:
                if (str.equals("readTaoLiveData")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1828246403:
                if (str.equals("destroyLiveRoomController")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1412554983:
                if (str.equals("writeTaoLiveData")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1350704967:
                if (str.equals("openRetentionView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1237788857:
                if (str.equals("createRetentionView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -645098549:
                if (str.equals("closeRetentionView")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -153529056:
                if (str.equals("UTShowExpose")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -23849236:
                if (str.equals("fetchTaskEntryLoaction")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 656954893:
                if (str.equals("commitInteractEvent")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 723633289:
                if (str.equals("UTControlClicked")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1074044202:
                if (str.equals("commitAPMAlarm")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1075999720:
                if (str.equals("commitAPMCount")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                tlog("commitAPMAlarm", str2);
                JSONObject b = pqj.b(str2);
                if (b != null) {
                    boolean booleanValue = b.getBoolean("success").booleanValue();
                    String string = b.getString("monitorPoint");
                    String string2 = b.getString("errorCode");
                    String string3 = b.getString("errorMsg");
                    JSONObject jSONObject = b.getJSONObject("args");
                    String jSONString = jSONObject != null ? jSONObject.toJSONString() : "";
                    if (booleanValue) {
                        pqi.a().a(string, jSONString);
                    } else {
                        pqi.a().a(string, jSONString, string2, string3);
                    }
                    eVar.a();
                    return true;
                }
                eVar.b("parseObject fail");
                tlog("commitAPMAlarm", "parseObject fail");
                return false;
            case 1:
                tlog("commitAPMCount", str2);
                JSONObject b2 = pqj.b(str2);
                if (b2 != null) {
                    String string4 = b2.getString("monitorPoint");
                    JSONObject jSONObject2 = b2.getJSONObject("args");
                    pqi.a().a(string4, jSONObject2 != null ? jSONObject2.toJSONString() : "", 1.0d);
                    eVar.a();
                    return true;
                }
                eVar.b("parseObject fail");
                tlog("commitAPMCount", "parseObject fail");
                return false;
            case 2:
                tlog("commitInteractEvent", str2);
                eVar.a();
                return true;
            case 3:
                tlog("UTShowExpose", str2);
                JSONObject b3 = pqj.b(str2);
                if (b3 != null) {
                    String string5 = b3.getString("arg1");
                    JSONObject jSONObject3 = b3.getJSONObject("args");
                    m.a(string5, jSONObject3);
                    ai.a(n.a(), string5, q.a(jSONObject3));
                    eVar.a();
                    return true;
                }
                eVar.b("parseObject fail");
                tlog("UTShowExpose", "parseObject fail");
                return false;
            case 4:
                tlog("UTControlClicked", str2);
                JSONObject b4 = pqj.b(str2);
                if (b4 != null) {
                    String string6 = b4.getString("arg1");
                    JSONObject jSONObject4 = b4.getJSONObject("args");
                    m.a(string6, jSONObject4);
                    ai.a(n.a(), string6, q.b(jSONObject4));
                    eVar.a();
                    return true;
                }
                eVar.b("parseObject fail");
                tlog("UTControlClicked", "parseObject fail");
                return false;
            case 5:
                r rVar = new r();
                rVar.a("bottomRightEntryX", Integer.valueOf(k.f21821a));
                rVar.a("bottomRightEntryY", Integer.valueOf(k.b));
                eVar.a(rVar);
                return true;
            case 6:
                sendLiveBroadCast(this.mContext);
                return true;
            case 7:
                tlog("writeTaoLiveData", str2);
                JSONObject b5 = pqj.b(str2);
                final String string7 = b5.getString("key");
                final String string8 = b5.getString("values");
                Coordinator.postTask(new Coordinator.TaggedRunnable("TBLiveBaseWVPlugin") { // from class: com.taobao.taolive.room.mediaplatform.container.h5.TBLiveBaseWVPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        mfi.a(string7, string8);
                        eVar.a();
                    }
                });
                return true;
            case '\b':
                tlog("readTaoLiveData", str2);
                final String string9 = pqj.b(str2).getString("key");
                Coordinator.postTask(new Coordinator.TaggedRunnable("TBLiveBaseWVPlugin") { // from class: com.taobao.taolive.room.mediaplatform.container.h5.TBLiveBaseWVPlugin.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (wVCallBackContext == null) {
                        } else {
                            Object a2 = mfi.a(string9);
                            r rVar2 = new r();
                            rVar2.a("values", a2);
                            rVar2.a("key", string9);
                            wVCallBackContext.success(rVar2);
                        }
                    }
                });
                return true;
            case '\t':
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview.getContext() instanceof Activity) {
                    Activity activity = (Activity) webview.getContext();
                    JSONObject b6 = pqj.b(str2);
                    if (b6.containsKey("url")) {
                        String a2 = this.mRetentionViewHelper.a(activity, b6.getString("url"));
                        r rVar2 = new r();
                        rVar2.a("hashCode", a2);
                        eVar.a(rVar2);
                        return true;
                    }
                }
                eVar.b();
                return false;
            case '\n':
                JSONObject b7 = pqj.b(str2);
                if (b7.containsKey("hashCode") && this.mRetentionViewHelper.a(b7.getString("hashCode"))) {
                    eVar.a();
                    return true;
                }
                r rVar3 = new r();
                rVar3.a("reason", "展示失败");
                eVar.b(rVar3);
                return false;
            case 11:
                IWVWebView webview2 = wVCallBackContext.getWebview();
                JSONObject b8 = pqj.b(str2);
                if (webview2 instanceof TBLiveH5Container) {
                    this.mRetentionViewHelper.a((TBLiveH5Container) webview2, (b8 == null || b8.isEmpty()) ? true : b8.getBoolean("popLiveRoomPage").booleanValue());
                    eVar.a();
                    return true;
                }
                r rVar4 = new r();
                rVar4.a("reason", "WebView not instance of TBLiveH5Container!");
                eVar.b(rVar4);
                return false;
            default:
                eVar.a(NO_FUNCTION);
                return true;
        }
    }

    private void sendLiveBroadCast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76ba594", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        intent.putExtra("force", "true");
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
    }

    private void tlog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{this, str, str2});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a("BaseWVPlugin_" + str, str2);
        }
    }
}
