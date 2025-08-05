package tb;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class jfk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f29521a;

    /* loaded from: classes6.dex */
    private interface a {
        c a();
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f29523a;
        public final String b;

        public c(String str, String str2) {
            this.f29523a = str;
            this.b = str2;
        }
    }

    public jfk(Context context, String str) {
        this.f29521a = Build.VERSION.SDK_INT >= 30 ? new b(context, str) : new d();
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("66ef3e70", new Object[]{this}) : this.f29521a.a();
    }

    /* loaded from: classes6.dex */
    public static class d implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jfk.a
        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("66ef3e70", new Object[]{this});
            }
            return null;
        }

        private d() {
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Context f29522a;
        private final String b;
        private final SharedPreferences c;

        public b(Context context, String str) {
            this.f29522a = context;
            this.b = str;
            this.c = kgo.a(this.f29522a, "ApplicationExitImpl", 0);
        }

        @Override // tb.jfk.a
        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("66ef3e70", new Object[]{this});
            }
            try {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f29522a.getSystemService(ActivityManager.class)).getHistoricalProcessExitReasons(this.f29522a.getPackageName(), b(), 1);
                c();
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                if (!it.hasNext()) {
                    return null;
                }
                ApplicationExitInfo next = it.next();
                String valueOf = String.valueOf(next.getReason());
                String applicationExitInfo = next.toString();
                return new c(valueOf + "/-1", applicationExitInfo);
            } catch (Exception e) {
                jfj.b(e);
                return null;
            }
        }

        private int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c.getInt(this.b, 0);
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.c.edit().putInt(this.b, Process.myPid()).apply();
            }
        }
    }
}
