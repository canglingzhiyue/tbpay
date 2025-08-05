package com.taobao.falco;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.falco.FalcoScreenshotMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
import tb.dit;
import tb.gve;
import tb.tmt;

/* loaded from: classes7.dex */
public class FalcoScreenshotMonitorImpl implements FalcoScreenshotMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f17116a = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    private static final Pattern b = Pattern.compile(f17116a + "/[0-9]+");
    private final ContentResolver c;
    private SimpleDateFormat i;
    private Context j;
    private final Set<String> d = new HashSet();
    private boolean h = false;
    private boolean k = false;
    private Map<String, FalcoScreenshotMonitor.a> l = new HashMap();
    private final ContentObserver e = new ContentObserver(null) { // from class: com.taobao.falco.FalcoScreenshotMonitorImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
            } else if (uri == null) {
            } else {
                dit.e(new ScreenShotRunnable(FalcoScreenshotMonitorImpl.this, 4, uri, Long.valueOf(System.currentTimeMillis())));
            }
        }
    };
    private final IApmEventListener f = new IApmEventListener() { // from class: com.taobao.falco.FalcoScreenshotMonitorImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                dit.e(new ScreenShotRunnable(FalcoScreenshotMonitorImpl.this, 3, new Object[0]));
            } else if (i != 2) {
            } else {
                dit.e(new ScreenShotRunnable(FalcoScreenshotMonitorImpl.this, 2, new Object[0]));
            }
        }
    };
    private final a.InterfaceC0630a g = new a.InterfaceC0630a() { // from class: com.taobao.falco.FalcoScreenshotMonitorImpl.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                dit.e(new ScreenShotRunnable(FalcoScreenshotMonitorImpl.this, 5, new Object[0]));
            }
        }
    };

    /* loaded from: classes7.dex */
    public static class ScreenShotRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FalcoScreenshotMonitorImpl f17120a;
        public final int b;
        public final Object[] c;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes7.dex */
        @interface Definition {
        }

        public ScreenShotRunnable(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl, int i, Object... objArr) {
            this.f17120a = falcoScreenshotMonitorImpl;
            this.b = i;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.b) {
                case 0:
                    FalcoScreenshotMonitorImpl.a(this.f17120a);
                    return;
                case 1:
                    FalcoScreenshotMonitorImpl.b(this.f17120a);
                    return;
                case 2:
                    FalcoScreenshotMonitorImpl.a(this.f17120a, true);
                    FalcoScreenshotMonitorImpl.c(this.f17120a);
                    return;
                case 3:
                    FalcoScreenshotMonitorImpl.d(this.f17120a);
                    return;
                case 4:
                    FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl = this.f17120a;
                    Object[] objArr = this.c;
                    FalcoScreenshotMonitorImpl.a(falcoScreenshotMonitorImpl, (Uri) objArr[0], ((Long) objArr[1]).longValue());
                    return;
                case 5:
                    FalcoScreenshotMonitorImpl.a(this.f17120a, true);
                    return;
                case 6:
                    FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl2 = this.f17120a;
                    Object[] objArr2 = this.c;
                    FalcoScreenshotMonitorImpl.a(falcoScreenshotMonitorImpl2, (String) objArr2[0], (FalcoScreenshotMonitor.a) objArr2[1]);
                    return;
                case 7:
                    FalcoScreenshotMonitorImpl.a(this.f17120a, (String) this.c[0]);
                    return;
                default:
                    return;
            }
        }
    }

    public static /* synthetic */ void a(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bce36dd", new Object[]{falcoScreenshotMonitorImpl});
        } else {
            falcoScreenshotMonitorImpl.b();
        }
    }

    public static /* synthetic */ void a(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl, Uri uri, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d0a3fa", new Object[]{falcoScreenshotMonitorImpl, uri, new Long(j)});
        } else {
            falcoScreenshotMonitorImpl.a(uri, j);
        }
    }

    public static /* synthetic */ void a(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c84367", new Object[]{falcoScreenshotMonitorImpl, str});
        } else {
            falcoScreenshotMonitorImpl.b(str);
        }
    }

    public static /* synthetic */ void a(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl, String str, FalcoScreenshotMonitor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8150c21", new Object[]{falcoScreenshotMonitorImpl, str, aVar});
        } else {
            falcoScreenshotMonitorImpl.b(str, aVar);
        }
    }

    public static /* synthetic */ boolean a(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddf9579b", new Object[]{falcoScreenshotMonitorImpl, new Boolean(z)})).booleanValue();
        }
        falcoScreenshotMonitorImpl.k = z;
        return z;
    }

    public static /* synthetic */ void b(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d77dcfc", new Object[]{falcoScreenshotMonitorImpl});
        } else {
            falcoScreenshotMonitorImpl.c();
        }
    }

    public static /* synthetic */ void c(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f21831b", new Object[]{falcoScreenshotMonitorImpl});
        } else {
            falcoScreenshotMonitorImpl.d();
        }
    }

    public static /* synthetic */ void d(FalcoScreenshotMonitorImpl falcoScreenshotMonitorImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cb293a", new Object[]{falcoScreenshotMonitorImpl});
        } else {
            falcoScreenshotMonitorImpl.e();
        }
    }

    public FalcoScreenshotMonitorImpl(Context context) {
        this.j = context;
        this.c = context.getContentResolver();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            dit.e(new ScreenShotRunnable(this, 0, new Object[0]));
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.h) {
        } else {
            if (!tmt.a(this.j)) {
                ALog.e("falco.ScreenshotMonitor", "only main process start screenshot monitor", null, new Object[0]);
                return;
            }
            ALog.e("falco.ScreenshotMonitor", "start screenshot monitor", null, new Object[0]);
            d();
            c.a(this.f);
            c.a(this.g, false);
            this.h = true;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.h) {
        } else {
            c.b(this.f);
            c.a(this.g);
            e();
            this.d.clear();
            this.h = false;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.registerContentObserver(f17116a, true, this.e);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.unregisterContentObserver(this.e);
        }
    }

    private void a(Uri uri, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aeacc5", new Object[]{this, uri, new Long(j)});
        } else if (SceneIdentifier.isAppBackground()) {
            e();
            ALog.e("falco.ScreenshotMonitor", "[doScreenshotReport]", null, "background not allow to screenshot monitor.");
        } else if (!this.k) {
            ALog.e("falco.ScreenshotMonitor", "[doScreenshotReport]", null, "non-launched not allow to screenshot monitor.");
        } else {
            String uri2 = uri.toString();
            if (!b.matcher(uri2).matches() || !this.d.add(uri2)) {
                return;
            }
            ALog.e("falco.ScreenshotMonitor", "[doScreenshotReport]", null, "uri", uri2, "time", Long.valueOf(j));
            FalcoScreenshotStatistic falcoScreenshotStatistic = new FalcoScreenshotStatistic();
            if (FalcoGlobalTracer.get() != null && FalcoGlobalTracer.get().l() != null) {
                falcoScreenshotStatistic.clickFalcoId = FalcoGlobalTracer.get().l().a();
            }
            falcoScreenshotStatistic.uid = tmt.b();
            falcoScreenshotStatistic.pageName = SceneIdentifier.getCurrentPageNameWithFragment();
            falcoScreenshotStatistic.pageUrl = SceneIdentifier.getCurrentPageUrl();
            if (this.i == null) {
                this.i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
            falcoScreenshotStatistic.localTime = this.i.format(new Date(j));
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, FalcoScreenshotMonitor.a> entry : this.l.entrySet()) {
                    String key = entry.getKey();
                    Map<String, String> a2 = entry.getValue().a();
                    if (a2 != null && a2.size() > 0 && a2.size() <= 50) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry<String, String> entry2 : a2.entrySet()) {
                            String key2 = entry2.getKey();
                            String value = entry2.getValue();
                            if (!TextUtils.isEmpty(key2) && !TextUtils.isEmpty(value)) {
                                jSONObject2.put(key2, value);
                            }
                        }
                        jSONObject.put(key, jSONObject2);
                    }
                }
                if (jSONObject.length() > 0) {
                    falcoScreenshotStatistic.userInfo = jSONObject.toString();
                }
            } catch (Exception unused) {
                ALog.e("falco.ScreenshotMonitor", "[doScreenshotReport] userinfo error.", null, new Object[0]);
            }
            ALog.e("falco.ScreenshotMonitor", "[doScreenshotReport]", null, gve.TAG, falcoScreenshotStatistic.toString());
            AppMonitor.getInstance().commitStat(falcoScreenshotStatistic);
        }
    }

    @Override // com.taobao.falco.FalcoScreenshotMonitor
    public boolean a(String str, FalcoScreenshotMonitor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e39927a", new Object[]{this, str, aVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.length() > 100 || aVar == null) {
            return false;
        }
        dit.e(new ScreenShotRunnable(this, 6, str, aVar));
        return true;
    }

    @Override // com.taobao.falco.FalcoScreenshotMonitor
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.length() > 100) {
            return false;
        }
        dit.e(new ScreenShotRunnable(this, 7, str));
        return true;
    }

    private void b(String str, FalcoScreenshotMonitor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8691a95", new Object[]{this, str, aVar});
        } else {
            this.l.put(str, aVar);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.l.remove(str);
        }
    }
}
