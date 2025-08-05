package android.taobao.windvane.extra.uc;

import android.taobao.windvane.config.j;
import android.taobao.windvane.config.q;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.webview.a;
import android.taobao.windvane.webview.b;
import android.taobao.windvane.webview.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class WVCoreSettings {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DOWNLOAD = 1;
    public static final int INNER = 0;
    public static final int U420 = 2;
    public static final int U430 = 3;
    private static WVCoreSettings instance;
    public List<a> coreEventCallbacks;
    public List<b> coreEventCallbacks2;

    static {
        kge.a(1952882303);
    }

    public static WVCoreSettings getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCoreSettings) ipChange.ipc$dispatch("b02c5aa4", new Object[0]);
        }
        if (instance == null) {
            synchronized (WVCoreSettings.class) {
                if (instance == null) {
                    instance = new WVCoreSettings();
                }
            }
        }
        return instance;
    }

    public static void setCorePolicy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb550389", new Object[]{new Integer(i)});
        } else {
            j.commonConfig.R = i;
        }
    }

    public static void setDownloadCore(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345bbf33", new Object[]{new Integer(i)});
        } else {
            j.commonConfig.aa = i;
        }
    }

    public static void setInputSupportedDomains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe5c21a", new Object[]{str});
        } else {
            j.commonConfig.u.h = str;
        }
    }

    public void removeEventCallback2(b bVar) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbfa97b", new Object[]{this, bVar});
        } else if (bVar == null || (list = this.coreEventCallbacks2) == null) {
        } else {
            list.remove(bVar);
        }
    }

    public void notifyCoreEventCallback2Success() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d159904f", new Object[]{this});
            return;
        }
        List<b> list = this.coreEventCallbacks2;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            bVar.onUCCorePrepared();
        }
        this.coreEventCallbacks2.clear();
    }

    public void notifyCoreEventCallback2Fail(b bVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185ef3f", new Object[]{this, bVar, cVar});
        } else if (bVar == null) {
        } else {
            bVar.onUCCoreInitFailed(cVar);
            List<b> list = this.coreEventCallbacks2;
            if (list == null) {
                return;
            }
            list.remove(bVar);
        }
    }

    public void notifyCoreEventCallback2Fail(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f012d8", new Object[]{this, cVar});
            return;
        }
        List<b> list = this.coreEventCallbacks2;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            bVar.onUCCoreInitFailed(cVar);
        }
        this.coreEventCallbacks2.clear();
    }

    public void notifyCoreEventCallbackSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba52b33", new Object[]{this});
            return;
        }
        List<b> list = this.coreEventCallbacks2;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            bVar.onUCCorePrepared();
        }
        this.coreEventCallbacks2.clear();
    }

    public void setCoreEventCallback2(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8822afe", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (WVCore.getInstance().isUCSupport()) {
                bVar.onUCCorePrepared();
                return;
            }
            if (this.coreEventCallbacks2 == null) {
                this.coreEventCallbacks2 = new CopyOnWriteArrayList();
            }
            if (!this.coreEventCallbacks2.contains(bVar)) {
                this.coreEventCallbacks2.add(bVar);
            }
            try {
                Class.forName("android.taobao.windvane.extra.uc.WVUCWebView");
            } catch (Throwable unused) {
            }
        }
    }

    public void setCoreEventCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e11c95", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (WVCore.getInstance().isUCSupport()) {
                aVar.onUCCorePrepared();
                return;
            }
            if (this.coreEventCallbacks == null) {
                if (j.commonConfig.au) {
                    this.coreEventCallbacks = new CopyOnWriteArrayList();
                } else {
                    this.coreEventCallbacks = new ArrayList();
                }
            }
            if (!this.coreEventCallbacks.contains(aVar)) {
                this.coreEventCallbacks.add(aVar);
            }
            try {
                Class.forName("android.taobao.windvane.extra.uc.WVUCWebView");
            } catch (Throwable unused) {
            }
        }
    }

    public static void setWebMultiPolicy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffda5223", new Object[]{new Integer(i)});
        } else {
            q.configData.f1570a = i;
        }
    }

    public static void setGpuMultiPolicy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9414677b", new Object[]{new Integer(i)});
        } else {
            q.configData.b = i;
        }
    }
}
