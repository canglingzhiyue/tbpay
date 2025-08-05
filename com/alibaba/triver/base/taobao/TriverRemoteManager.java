package com.alibaba.triver.base.taobao;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.triver.base.taobao.TriverRemoteMonitorData;
import com.alibaba.triver.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.component.d;
import com.taobao.android.remoteso.component.g;
import com.taobao.android.remoteso.component.k;
import com.taobao.android.remoteso.component.l;
import com.taobao.appbundle.remote.a;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public class TriverRemoteManager implements ITriverRemoteProxy, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_FLEXA = "flexa";
    private static final String KEY_RSO = "rso";
    private static final String MODULE_AMAP = "order_map";
    private static final String MODULE_TRIVER = "triver_taobao";
    private static final String MODULE_UC = "kernelu4_7z_uc";
    private static final String TAG = "TriverRemoteManager";
    private static volatile TriverRemoteManager mInstance;

    /* renamed from: com.alibaba.triver.base.taobao.TriverRemoteManager$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3631a = new int[ITriverRemoteProxy.DependenceMode.values().length];

        static {
            try {
                f3631a[ITriverRemoteProxy.DependenceMode.UC_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3631a[ITriverRemoteProxy.DependenceMode.TRIVER_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3631a[ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3631a[ITriverRemoteProxy.DependenceMode.AMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-823442122);
        kge.a(-751523228);
        kge.a(1028243835);
    }

    public static synchronized TriverRemoteManager getInstance() {
        synchronized (TriverRemoteManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TriverRemoteManager) ipChange.ipc$dispatch("fd053bbd", new Object[0]);
            }
            if (mInstance == null) {
                mInstance = new TriverRemoteManager();
            }
            return mInstance;
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public boolean hasInstalled(ITriverRemoteProxy.DependenceMode dependenceMode, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe56d4c", new Object[]{this, dependenceMode, context})).booleanValue();
        }
        k.a a2 = k.a().a(context);
        int i = AnonymousClass3.f3631a[dependenceMode.ordinal()];
        if (i == 1) {
            a2.a(KEY_RSO, MODULE_UC);
        } else if (i == 2) {
            a2.a(KEY_FLEXA, MODULE_TRIVER);
        } else if (i == 3) {
            a2.a(KEY_RSO, MODULE_UC).a(KEY_FLEXA, MODULE_TRIVER);
        } else if (i == 4) {
            a2.a(KEY_FLEXA, "order_map");
        }
        l a3 = Remo.a(a2.a());
        boolean e = a3.e();
        TLog.loge("Triver", TAG, "check mode[" + dependenceMode.name() + "] remote install result : " + a3);
        return e;
    }

    public String checkTriverState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1ba3868", new Object[]{this}) : Remo.a(MODULE_TRIVER);
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public boolean hasInstalled(ITriverRemoteProxy.DependenceMode dependenceMode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("806a6e84", new Object[]{this, dependenceMode})).booleanValue() : hasInstalled(dependenceMode, Globals.getApplication());
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void installWithRemoUI(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44df0654", new Object[]{this, str, str2, dependenceMode, context, aVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, true, false, null);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void installWithRemoUI(String str, String str2, boolean z, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d42f37e", new Object[]{this, str, str2, new Boolean(z), dependenceMode, context, aVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, true, z, null);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void install(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb64c2e5", new Object[]{this, str, str2, dependenceMode, context, aVar});
        } else {
            install(str, str2, dependenceMode, context, aVar, null);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void install(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar, ITriverRemoteProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5936132", new Object[]{this, str, str2, dependenceMode, context, aVar, bVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, false, true, bVar);
        }
    }

    private void installInner(String str, final String str2, final ITriverRemoteProxy.DependenceMode dependenceMode, Context context, final ITriverRemoteProxy.a aVar, boolean z, boolean z2, final ITriverRemoteProxy.b bVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ef5a52", new Object[]{this, str, str2, dependenceMode, context, aVar, new Boolean(z), new Boolean(z2), bVar});
            return;
        }
        try {
            final String featureName = getFeatureName(dependenceMode);
            TriverRemoteMonitorData.InstallType installType = f.TAG.equals(str) ? TriverRemoteMonitorData.InstallType.SILENCE : TriverRemoteMonitorData.InstallType.EXPLICIT;
            if (TriverRemoteMonitorData.InstallType.EXPLICIT.equals(installType)) {
                a.b(featureName, str2);
            }
            final TriverRemoteMonitorData triverRemoteMonitorData = new TriverRemoteMonitorData();
            triverRemoteMonitorData.b(str2);
            triverRemoteMonitorData.a(str);
            triverRemoteMonitorData.a(dependenceMode);
            triverRemoteMonitorData.a(installType);
            if (hasInstalled(dependenceMode, context)) {
                triverRemoteMonitorData.a(false);
                triverRemoteMonitorData.a(0L, TriverRemoteMonitorData.Status.Success, "");
                aVar.a();
                return;
            }
            TLog.loge("Triver", TAG, "start install with mode[" + dependenceMode.name() + riy.ARRAY_END_STR);
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (TriverRemoteMonitorData.InstallType.EXPLICIT.equals(installType)) {
                a.a(featureName, str2);
            }
            final TriverRemoteMonitorData.InstallType installType2 = installType;
            try {
                k.a a2 = k.a().a(context).a(z).a(new g() { // from class: com.alibaba.triver.base.taobao.TriverRemoteManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.remoteso.component.g
                    public void onProgressChanged(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
                            return;
                        }
                        ITriverRemoteProxy.b bVar2 = bVar;
                        if (bVar2 == null) {
                            return;
                        }
                        bVar2.a(i);
                    }
                }).a(new d() { // from class: com.alibaba.triver.base.taobao.TriverRemoteManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.remoteso.component.d
                    public void a(l lVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                            return;
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                        if (lVar.e()) {
                            TLog.loge("Triver", TriverRemoteManager.TAG, "install with mode[" + dependenceMode.name() + "] success!");
                            triverRemoteMonitorData.a(uptimeMillis2, TriverRemoteMonitorData.Status.Success, "");
                            if (TriverRemoteMonitorData.InstallType.EXPLICIT.equals(installType2)) {
                                a.a(featureName, str2, uptimeMillis2);
                            }
                            aVar.a();
                            return;
                        }
                        if (1003 == lVar.c()) {
                            a.c(TriverRemoteManager.MODULE_TRIVER, str2);
                        }
                        aVar.a(lVar.toString());
                        triverRemoteMonitorData.a(uptimeMillis2, TriverRemoteMonitorData.Status.UserCancel, lVar.toString());
                        TLog.loge("Triver", TriverRemoteManager.TAG, "install with mode[" + dependenceMode.name() + "] failed!");
                    }
                });
                int i = AnonymousClass3.f3631a[dependenceMode.ordinal()];
                if (i == 1) {
                    a2.a(KEY_RSO, MODULE_UC);
                } else if (i == 2) {
                    a2.a(KEY_FLEXA, MODULE_TRIVER);
                } else if (i == 3) {
                    a2.a(KEY_RSO, MODULE_UC).a(KEY_FLEXA, MODULE_TRIVER);
                } else if (i == 4) {
                    a2.a(KEY_FLEXA, "order_map");
                }
                Remo.b(a2.a());
            } catch (Throwable th) {
                th = th;
                str3 = "Triver";
                TLog.loge(str3, TAG, th);
                TriverRemoteMonitorData triverRemoteMonitorData2 = new TriverRemoteMonitorData();
                triverRemoteMonitorData2.b(str2);
                triverRemoteMonitorData2.a(str);
                triverRemoteMonitorData2.a(dependenceMode);
                triverRemoteMonitorData2.a(0L, TriverRemoteMonitorData.Status.Fail, th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = "Triver";
        }
    }

    private String getFeatureName(ITriverRemoteProxy.DependenceMode dependenceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2114b30b", new Object[]{this, dependenceMode});
        }
        int i = AnonymousClass3.f3631a[dependenceMode.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "" : "triver_taobao+kernelu4_7z_uc" : MODULE_TRIVER : MODULE_UC;
    }
}
