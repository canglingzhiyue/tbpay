package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UtilityImpl;

/* loaded from: classes9.dex */
public class syk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f33953a;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final syk f33954a;

        static {
            kge.a(1117336841);
            f33954a = new syk();
        }
    }

    static {
        kge.a(528536396);
    }

    public boolean a(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            z = a(a(context, "adj_adjust_range", ""));
            try {
                rty.f33380a.c("RemoteConfig", "[optAdjustAdjEnabled]", "enabled", Boolean.valueOf(z));
            } catch (Throwable th) {
                th = th;
                rty.f33380a.b("RemoteConfig", "[optAdjustAdjEnabled] error.", th, new Object[0]);
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public boolean b(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        try {
            z = a(a(context, "adj_adjust_radical_range", "40-40"));
            try {
                rty.f33380a.c("RemoteConfig", "[optAdjustAdjRadicalEnabled]", "enabled", Boolean.valueOf(z));
            } catch (Throwable th) {
                th = th;
                rty.f33380a.b("RemoteConfig", "[optAdjustAdjRadicalEnabled] error.", th, new Object[0]);
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public boolean c(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        try {
            z = a(a(context, "account_sync_range", "36-36"));
            try {
                rty.f33380a.c("RemoteConfig", "[optAccountSyncEnabled]", "enabled", Boolean.valueOf(z));
            } catch (Throwable th) {
                th = th;
                rty.f33380a.b("RemoteConfig", "[optAccountSyncEnabled] error.", th, new Object[0]);
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{this, context})).booleanValue();
        }
        try {
            return a(a(context, "recent_entrance_range", "38-38"));
        } catch (Throwable th) {
            rty.f33380a.b("RemoteConfig", "[optRecentEntranceEnabled] error.", th, new Object[0]);
            return false;
        }
    }

    public boolean e(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{this, context})).booleanValue();
        }
        try {
            z = a(a(context, "prevent_rt_kill_receiver_range", ""));
            try {
                rty.f33380a.c("RemoteConfig", "[optPreventRemoveTaskKillByReceiver]", "enabled", Boolean.valueOf(z));
            } catch (Throwable th) {
                th = th;
                rty.f33380a.b("RemoteConfig", "[optPreventRemoveTaskKillByReceiver] error.", th, new Object[0]);
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{this, context})).intValue();
        }
        int i = 20;
        try {
            i = Integer.parseInt(a(context, "prevent_rt_kill_receiver_delay", "20"));
            rty.f33380a.c("RemoteConfig", "[getPreventRemoveTaskKillByReceiverDelayTimeInSecs]", "delaySecs", Integer.valueOf(i));
        } catch (Throwable th) {
            rty.f33380a.b("RemoteConfig", "[getPreventRemoveTaskKillByReceiverDelayTimeInSecs] error.", th, new Object[0]);
        }
        return i;
    }

    public final String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{this, context, str, str2});
        }
        try {
            return context.getSharedPreferences("keepalive", 4).getString(str, str2);
        } catch (Exception e) {
            rty.f33380a.b("RemoteConfig", "getConfigFromSP fail:", null, e, "key", str);
            return str2;
        }
    }

    public static void a(syk sykVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637587", new Object[]{sykVar, str, str2});
        } else if (sykVar != null) {
            try {
            } catch (Exception e) {
                rty.f33380a.b("RemoteConfig", "saveConfigToSP fail:", null, e, "key", str, "value", str2);
            }
            if (sykVar.f33953a == null) {
                rty.f33380a.c("RemoteConfig", "saveConfigToSP context null", new Object[0]);
                return;
            }
            SharedPreferences.Editor edit = sykVar.f33953a.getSharedPreferences("keepalive", 4).edit();
            edit.putString(str, str2);
            edit.apply();
            rty.f33380a.c("RemoteConfig", "saveConfigToSP", "key", str, "value", str2);
        } else {
            throw null;
        }
    }

    public final boolean a(String str) {
        int parseInt;
        int parseInt2;
        int appKeepAliveBucketId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !UtilityImpl.isAppKeepAlive()) {
            return false;
        }
        try {
            String[] split = str.split("-");
            parseInt = Integer.parseInt(split[0]);
            parseInt2 = Integer.parseInt(split[1]);
            appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(kaq.a());
        } catch (Exception unused) {
        }
        return appKeepAliveBucketId >= parseInt && appKeepAliveBucketId <= parseInt2;
    }
}
