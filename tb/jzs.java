package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.e;

/* loaded from: classes.dex */
public class jzs extends jzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f29900a.b("lastStartProcessTime", j);
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        this.f29900a.b("startProcessSystemTime", j);
        f(j);
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.f29900a.b("startProcessSystemClockTime", j);
        }
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else {
            this.f29900a.b("startAppOnCreateSystemTime", j);
        }
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
        } else {
            this.f29900a.b("startAppOnCreateSystemClockTime", j);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f29900a.b("isFullNewInstall", z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f29900a.b("isFirstLaunch", z);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (mpa.WARM.equals(str)) {
            str = mpa.HOT;
        }
        this.f29900a.b("launchType", str);
    }

    private static void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = e.a().b().getSharedPreferences("apm", 0).edit();
        edit.putLong("lastStartProcessTime", j);
        edit.apply();
    }
}
