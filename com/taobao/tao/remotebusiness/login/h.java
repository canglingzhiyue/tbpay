package com.taobao.tao.remotebusiness.login;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.orq;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "mtopsdk.RemoteLogin";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, c> f21037a;

    static {
        kge.a(91453108);
        f21037a = new ConcurrentHashMap();
    }

    public static c a(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("86de1cbe", new Object[]{mtop});
        }
        String instanceId = mtop == null ? Mtop.Id.INNER : mtop.getInstanceId();
        c cVar = f21037a.get(instanceId);
        if (cVar == null) {
            synchronized (h.class) {
                cVar = f21037a.get(instanceId);
                if (cVar == null) {
                    b a2 = b.a(mtop == null ? null : mtop.getMtopConfig().context);
                    if (a2 == null) {
                        TBSdkLog.e(TAG, instanceId + " [getLogin]loginImpl is null");
                        throw new LoginNotImplementException(instanceId + " [getLogin] Login Not Implement!");
                    }
                    f21037a.put(instanceId, a2);
                    cVar = a2;
                }
            }
        }
        return cVar;
    }

    public static void a(Mtop mtop, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560f8aac", new Object[]{mtop, cVar});
        } else if (cVar == null) {
        } else {
            synchronized (h.class) {
                String instanceId = mtop == null ? Mtop.Id.INNER : mtop.getInstanceId();
                f21037a.put(instanceId, cVar);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, instanceId + " [setLoginImpl] set loginImpl=" + cVar);
                }
            }
        }
    }

    public static void a(Mtop mtop, String str, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe1b45", new Object[]{mtop, str, new Boolean(z), obj});
            return;
        }
        c a2 = a(mtop);
        String concatStr = StringUtils.concatStr(mtop == null ? Mtop.Id.INNER : mtop.getInstanceId(), StringUtils.isBlank(str) ? "DEFAULT" : str);
        String str2 = null;
        g gVar = a2 instanceof g ? (g) a2 : null;
        if (!"DEFAULT".equals(str)) {
            str2 = str;
        }
        boolean b = gVar != null ? gVar.b(str2) : a2.isLogining();
        if (SwitchConfig.getInstance().checkLoginStatus() && b) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                return;
            }
            TBSdkLog.e(TAG, concatStr + " [login] loginsdk is logining");
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e(TAG, concatStr + " [login]call login");
        }
        if (obj != null && (a2 instanceof b)) {
            ((b) a2).a(obj);
        }
        f a3 = f.a(mtop, str);
        if (gVar == null) {
            a2.login(a3, z);
        }
        a3.sendEmptyMessageDelayed(911104, orq.FRAME_CHECK_TIMEOUT);
    }

    public static void a(Mtop mtop, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc350633", new Object[]{mtop, bundle});
        } else if (!(a(mtop) instanceof d) || !TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
        } else {
            String instanceId = mtop == null ? Mtop.Id.INNER : mtop.getInstanceId();
            TBSdkLog.i(TAG, instanceId + " [setSessionInvalid] bundle=" + bundle);
        }
    }

    public static boolean a(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("295a608f", new Object[]{mtop, str})).booleanValue();
        }
        c a2 = a(mtop);
        g gVar = a2 instanceof g ? (g) a2 : null;
        if ("DEFAULT".equals(str)) {
            str = null;
        }
        if (gVar != null ? gVar.b(str) : a2.isLogining()) {
            return false;
        }
        return gVar != null ? gVar.a(str) : a2.isSessionValid();
    }

    public static e b(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c7b3de87", new Object[]{mtop, str});
        }
        c a2 = a(mtop);
        if (a2 instanceof g) {
            if ("DEFAULT".equals(str)) {
                str = null;
            }
            return ((g) a2).c(str);
        }
        return a2.getLoginContext();
    }

    @Deprecated
    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("deceaf23", new Object[0]) : b(null, null);
    }
}
