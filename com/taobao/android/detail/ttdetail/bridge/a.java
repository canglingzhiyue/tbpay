package com.taobao.android.detail.ttdetail.bridge;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f10510a;

    static {
        kge.a(1949849243);
        f10510a = false;
    }

    public static synchronized void a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f10510a) {
            } else {
                f10510a = true;
                aem.a().a(new C0403a());
            }
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            WVStandardEventCenter.postNotificationToJS(str, str2);
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0403a implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(575458940);
            kge.a(1845411121);
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            String th;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            if (i != 3005 || !(objArr[0] instanceof String)) {
                return null;
            }
            try {
                jSONObject = JSONObject.parseObject((String) objArr[0]);
                th = null;
            } catch (Throwable th2) {
                th = th2.toString();
                jSONObject = null;
            }
            if (jSONObject == null) {
                return new ael(false, th);
            }
            if (!"99tm".equals(jSONObject.getString("bizName"))) {
                return new ael(false, "is not 99tm channel");
            }
            if ("TBTradeDetailUpdateState".equals(jSONObject.getString("event"))) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.detail.inside.intent.action.cartUpdate");
                intent.putExtra("multiDataFromWV", (String) objArr[0]);
                intent.addCategory("android.intent.category.DEFAULT");
                LocalBroadcastManager.getInstance(aejVar.c).sendBroadcast(intent);
            } else if ("TBTradeDetailClose".equals(jSONObject.getString("event"))) {
                Intent intent2 = new Intent();
                intent2.setAction("com.taobao.detail.inside.intent.action.closePage");
                intent2.putExtra("multiDataFromWV", (String) objArr[0]);
                intent2.addCategory("android.intent.category.DEFAULT");
                LocalBroadcastManager.getInstance(aejVar.c).sendBroadcast(intent2);
            }
            return null;
        }
    }
}
