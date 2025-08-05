package com.taobao.weex;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.remote.e;
import com.taobao.weex.utils.Switch;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXTLogImpl;
import tb.kge;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f23508a;

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f23508a;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        f23508a = z;
        return z;
    }

    static {
        kge.a(-1972611492);
        f23508a = false;
    }

    public static void a(final Context context, final boolean z, final boolean z2, final boolean z3, final IWXInitTaskAdapter.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3711a9af", new Object[]{context, new Boolean(z), new Boolean(z2), new Boolean(z3), callback});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.weex.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!WXEnvironment.isApkDebugable()) {
                        WXTLogImpl.initWXLogWatcher();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                com.taobao.weex.remote.e.a(z ? "render" : "init", "", context, false, new e.a() { // from class: com.taobao.weex.j.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.remote.e.a
                    public void onSuccess() {
                        if (!j.a()) {
                            com.taobao.weex.remote.f.a();
                            try {
                                Class.forName("com.taobao.weex.TBWXSDKEngineImpl").getMethod("initSDKEngine", Boolean.TYPE, Boolean.TYPE).invoke(null, Boolean.valueOf(z2), Boolean.valueOf(z3));
                                j.a(true);
                            } catch (Throwable th2) {
                                WXLogUtils.e("BaseInitLauncher", th2);
                            }
                        }
                        if (callback != null) {
                            callback.onRemoteInstalled();
                        }
                    }

                    @Override // com.taobao.weex.remote.e.a
                    public void onError(String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("ac367d3a", new Object[]{this, str});
                        } else if (callback == null) {
                        } else {
                            callback.onRemoteFailed(str, str);
                        }
                    }
                });
            }
        };
        if (Switch.isSwitchOn("./delayWeexInit").booleanValue()) {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, 10000L);
        } else {
            runnable.run();
        }
    }
}
