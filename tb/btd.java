package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;

@TableName("counter_temp")
/* loaded from: classes.dex */
public class btd extends bte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column(IWXUserTrackAdapter.MONITOR_ARG)

    /* renamed from: a  reason: collision with root package name */
    public String f26121a;
    @Column("value")
    public double b;

    static {
        kge.a(-1707579481);
    }

    public btd(String str, String str2, String str3, double d, String str4, String str5) {
        super(str, str2, str4, str5);
        this.f26121a = str3;
        this.b = d;
    }

    public btd() {
    }

    @Override // tb.bte
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempCounter{arg='" + this.f26121a + "', value=" + this.b + '}';
    }
}
