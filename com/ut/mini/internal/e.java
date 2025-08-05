package com.ut.mini.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.analytics.core.sync.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.any;
import tb.apr;
import tb.kge;
import tb.rqi;

/* loaded from: classes.dex */
public class e implements rqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f24121a;
    private static e b;

    @Override // tb.rqi
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
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

    @Override // tb.rqi
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
        }
    }

    static {
        kge.a(-1875034720);
        kge.a(-90889597);
        f24121a = 0;
        b = new e();
    }

    private e() {
    }

    public static e getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("aeb4cd2a", new Object[0]) : b;
    }

    @Override // tb.rqi
    public void onActivityCreated(Activity activity, Bundle bundle) {
        String scheme;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (f24121a != 0) {
        } else {
            Intent intent = activity.getIntent();
            if (intent == null) {
                apr.c("RealtimeDebugSwitch", q.MSGTYPE_INTERVAL, Integer.valueOf(f24121a));
                return;
            }
            Uri data = intent.getData();
            if (data == null || (scheme = data.getScheme()) == null || !scheme.startsWith("ut.")) {
                return;
            }
            apr.c("RealtimeDebugSwitch", "scheme", scheme);
            String queryParameter = data.getQueryParameter("debugkey");
            String queryParameter2 = data.getQueryParameter("from");
            if (!scheme.startsWith("ut.")) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("debug_api_url", "https://muvp.alibaba-inc.com/online/UploadRecords.do");
            if (queryParameter == null) {
                hashMap.put("debug_key", "");
            } else {
                hashMap.put("debug_key", queryParameter);
            }
            if (queryParameter2 == null) {
                hashMap.put("from", "");
            } else {
                hashMap.put("from", queryParameter2);
            }
            if (!TextUtils.isEmpty(data.getQueryParameter("store"))) {
                a(hashMap, true);
                hashMap.put("debug_store", "true");
            } else {
                a(hashMap, false);
            }
            hashMap.put("debug_sampling_option", "true");
            f.getInstance().turnOnRealTimeDebug(hashMap);
        }
    }

    @Override // tb.rqi
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            f24121a--;
        }
    }

    @Override // tb.rqi
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            f24121a++;
        }
    }

    private void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor edit = any.d().e().getSharedPreferences("UTRealTimeDebug", 0).edit();
            if (map != null && z) {
                edit.putString("debug_api_url", map.get("debug_api_url"));
                edit.putString("debug_key", map.get("debug_key"));
                edit.putLong("debug_date", System.currentTimeMillis());
            } else {
                edit.putLong("debug_date", 0L);
            }
            edit.commit();
        } catch (Exception unused) {
        }
    }
}
