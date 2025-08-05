package com.taobao.android.launcher.bootstrap.tao.ability.dispatch;

import android.os.Message;
import android.taobao.safemode.k;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.h;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.gtx;
import tb.guc;
import tb.gvk;
import tb.xmf;
import tb.xmg;
import tb.xmi;

/* loaded from: classes5.dex */
public class Dispatchers {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ACTIVITY = "Activity";
    public static final String TYPE_RECEIVER = "Receiver";
    public static final String TYPE_SERVICE = "Service";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Type {
    }

    public static xmf a(Message message, String str, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xmf) ipChange.ipc$dispatch("bc12a2b", new Object[]{message, str, gtxVar}) : a(message, str, gtxVar, null);
    }

    public static xmf a(Message message, String str, gtx gtxVar, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xmf) ipChange.ipc$dispatch("6361a40b", new Object[]{message, str, gtxVar, kVar});
        }
        h.b("Dispatchers", "create Dispatcher with type=" + str + ", msg.what=" + message.what + ", process=" + gtxVar.b);
        if (TextUtils.equals(gtxVar.f28453a, gtxVar.b) || TextUtils.equals(LauncherRuntime.PROCESS_SAFEMODE, gtxVar.b)) {
            return a(message, str, kVar);
        }
        if (!guc.a(null, "ngActivityThread")) {
            return new xmg(message, str);
        }
        return new xmi(message, str);
    }

    private static xmf a(Message message, String str, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xmf) ipChange.ipc$dispatch("c325cce6", new Object[]{message, str, kVar});
        }
        if (TYPE_ACTIVITY.equals(str) && kVar != null && gvk.a(gvk.a(kVar)) == 1) {
            return new xmg(message, str);
        }
        if (guc.a(null, "ngActivityThreadMain" + str)) {
            return new xmi(message, str);
        }
        return new xmg(message, str);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo("NGQoSDispatchers" + str, str2);
    }
}
