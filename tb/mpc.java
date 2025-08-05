package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public class mpc extends mpa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(mpc mpcVar, String str, Object... objArr) {
        if (str.hashCode() == -1393197671) {
            super.a((Activity) objArr[0], (Map) objArr[1], ((Number) objArr[2]).longValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mpc(long j) {
        super(j);
    }

    public mpc(String str, long j) {
        super(str, j);
    }

    @Override // tb.mpa, com.taobao.monitor.impl.trace.b.a
    public void a(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf57d99", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        super.a(activity, map, j);
        Object obj = map.get("blackPage");
        if (obj != null && activity.getClass().getName().equals(obj.toString())) {
            this.d = null;
        }
        if (!map.containsKey("isAfcColdContext")) {
            return;
        }
        this.e.a("isAfcColdContext", map.get("isAfcColdContext"));
    }
}
