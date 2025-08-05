package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.task.BehaviXTaskType;
import com.taobao.android.behavix.task.a;
import com.taobao.android.behavix.task.b;
import java.util.Map;

/* loaded from: classes4.dex */
public class dsn extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1869519460);
    }

    public static /* synthetic */ Object ipc$super(dsn dsnVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dsn(BehaviXTaskType behaviXTaskType, Map<String, Object> map, b bVar) {
        super(behaviXTaskType, map, bVar);
    }

    @Override // com.taobao.android.behavix.task.a
    public void a() {
        drp drpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.d == null || (drpVar = (drp) this.d.get("baseNode")) == null) {
            return;
        }
        a(drpVar.d, drpVar.h, drpVar);
    }

    private void a(String str, String str2, drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2626bb0a", new Object[]{this, str, str2, drpVar});
        } else if (!"leave".equals(str2)) {
        } else {
            a(str);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            com.taobao.android.behavix.adapter.b.a().a(str, str2);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            a(str, "BXBatch_PageLeave");
        }
    }
}
