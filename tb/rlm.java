package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.a;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlm extends rln<UserTrackDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;

    static {
        kge.a(1461601856);
    }

    public static /* synthetic */ Object ipc$super(rlm rlmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public rlm(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // tb.rln
    public void a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa89db5", new Object[]{this, userTrackDO});
        } else {
            rkq.d().m().a(this.b, b(userTrackDO), DAIComputeService.TaskPriority.NORMAL, null, this.f33224a);
        }
    }

    private Map<String, Object> b(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2eb1f62b", new Object[]{this, userTrackDO});
        }
        if (userTrackDO.getEventId() == -19999) {
            return a.b(userTrackDO);
        }
        return a.d(userTrackDO);
    }
}
