package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;

@TableName("alarm_temp")
/* loaded from: classes.dex */
public class btc extends bte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("err_code")

    /* renamed from: a  reason: collision with root package name */
    public String f26120a;
    @Column("err_msg")
    public String b;
    @Column(IWXUserTrackAdapter.MONITOR_ARG)
    public String d;
    @Column("success")
    public String e;

    static {
        kge.a(680065724);
    }

    public btc() {
    }

    public btc(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        super(str, str2, str6, str7);
        this.d = str3;
        this.f26120a = str4;
        this.b = str5;
        this.e = z ? "1" : "0";
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "1".equalsIgnoreCase(this.e);
    }

    @Override // tb.bte
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempAlarm{ module='" + this.f + "', monitorPoint='" + this.g + "', commitTime=" + this.h + ", access='" + this.i + "', accessSubType='" + this.j + "', arg='" + this.d + "', errCode='" + this.f26120a + "', errMsg='" + this.b + "', success='" + this.e + "'}";
    }
}
