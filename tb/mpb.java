package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;

/* loaded from: classes.dex */
public class mpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public mpa a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpa) ipChange.ipc$dispatch("daae3c4c", new Object[]{this, new Long(j)});
        }
        b();
        a();
        if (!d.m) {
            return null;
        }
        return new mpa(j);
    }

    public mpa a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpa) ipChange.ipc$dispatch("1a98b216", new Object[]{this, str, new Long(j)});
        }
        b();
        a();
        if (StringUtils.isEmpty(str)) {
            if (!d.m) {
                return null;
            }
            return new mpc(j);
        } else if (!d.m) {
            return null;
        } else {
            return new mpc(str, j);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (d.m) {
        } else {
            SharedPreferences.Editor edit = e.a().b().getSharedPreferences("apm", 0).edit();
            edit.putString(mor.KEY_LAST_LAUNCH_SESSION, "");
            edit.apply();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (mnd.x != 1) {
            z = true;
        }
        mnd.x = 1;
        if (!d.G) {
            return;
        }
        mpo.a().a(new mor(z));
        mpo.a().a(true);
    }
}
