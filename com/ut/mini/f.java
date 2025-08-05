package com.ut.mini;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.any;
import tb.apg;
import tb.apr;
import tb.aqe;
import tb.kge;
import tb.rqi;

/* loaded from: classes.dex */
public class f implements rqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24114a;
    private static boolean b;
    private static boolean c;
    private static f f;
    private boolean d = true;
    private boolean e = false;

    @Override // tb.rqi
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(f fVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7f22dc", new Object[]{fVar, map});
        } else {
            fVar.a(map);
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    static {
        kge.a(1439691647);
        kge.a(-90889597);
        f24114a = true;
        b = false;
        c = false;
        f = new f();
    }

    private f() {
    }

    public static f getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1c45d233", new Object[0]) : f;
    }

    public static void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{new Boolean(z)});
        } else {
            f24114a = z;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f24114a || b) {
        } else {
            b = true;
            File databasePath = context.getDatabasePath("ut.db");
            if (databasePath == null || !databasePath.exists()) {
                z = true;
            }
            c = z;
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!f24114a || context == null) {
        } else {
            if (this.d) {
                this.e = apg.e(context);
                c(context);
                this.d = false;
            } else if (!this.e) {
            } else {
                b();
            }
        }
    }

    private void c(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else {
            aqe.a().a(new Runnable() { // from class: com.ut.mini.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (context == null) {
                    } else {
                        HashMap hashMap = new HashMap();
                        if (f.a()) {
                            hashMap.put("_is_ft", "1");
                        } else {
                            hashMap.put("_is_ft", "0");
                        }
                        hashMap.put("_is_hl", "0");
                        f.a(f.this, hashMap);
                        apr.b("UTAppLaunch", "sendAppLaunch _is_ft", Boolean.valueOf(f.a()));
                    }
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_is_hl", "1");
        a(hashMap);
        apr.b("UTAppLaunch", "sendHotLaunch _is_hl", 1);
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new g("UT", 1023, "/tracking.init.rdy", null, null, map).build());
        }
    }

    @Override // tb.rqi
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
        } else {
            b(any.d().e());
        }
    }
}
