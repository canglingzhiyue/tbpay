package com.ut.mini;

import android.app.Application;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.aob;
import tb.apf;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static e c;

    /* renamed from: a  reason: collision with root package name */
    private Application f24107a;
    private Map<String, UTTracker> b = new HashMap();

    static {
        kge.a(-828718474);
    }

    public static synchronized e getInstance() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("1c45d214", new Object[0]);
            }
            if (c == null) {
                c = new e();
            }
            return c;
        }
    }

    private e() {
    }

    public void initUT(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24312ee9", new Object[]{this, application});
            return;
        }
        this.f24107a = application;
        com.ut.mini.internal.f.getInstance().initialized();
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            aob.a().b(str);
        }
    }

    public void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
            return;
        }
        apr.b((String) null, "channel", str);
        aob.a().c(str);
    }

    public void turnOnDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[]{this});
        } else {
            aob.a().o();
        }
    }

    @Deprecated
    public void updateUserAccount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{this, str, str2, str3});
        } else {
            aob.a().a(str, str2, str3);
        }
    }

    public void updateUserAccount(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{this, str, str2, str3, str4});
        } else {
            aob.a().a(str, str2, str3, str4);
        }
    }

    public void updateSessionProperties(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bd97e", new Object[]{this, map});
            return;
        }
        Map<String, String> z = aob.a().z();
        HashMap hashMap = new HashMap();
        if (z != null) {
            hashMap.putAll(z);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        aob.a().a(hashMap);
    }

    public void transferLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8801825", new Object[]{this, map});
        } else {
            com.ut.mini.core.a.getInstance().transferLog(map);
        }
    }

    public void turnOnRealTimeDebug(Map map) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
        } else {
            aob.a().b(map);
        }
    }

    public void turnOffRealTimeDebug() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
        } else {
            aob.a().F();
        }
    }

    public void saveCacheDataToLocal() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3568", new Object[]{this});
        } else {
            apf.a().b();
        }
    }

    public void setSessionProperties(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7854497", new Object[]{this, map});
        } else {
            aob.a().a(map);
        }
    }

    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
        } else {
            com.alibaba.analytics.core.logbuilder.f.a().c();
        }
    }
}
