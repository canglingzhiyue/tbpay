package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bte extends aof {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Ingore
    public static final String TAG_ACCESS = "access";
    @Ingore
    public static final String TAG_ACCESSSUBTYPE = "sub_access";
    @Ingore
    public static final String TAG_COMMITTIME = "commit_time";
    @Ingore
    public static final String TAG_MODULE = "module";
    @Ingore
    public static final String TAG_MONITOR_POINT = "monitor_point";
    @Column("module")
    public String f;
    @Column(TAG_MONITOR_POINT)
    public String g;
    @Column(TAG_COMMITTIME)
    public long h;
    @Column(TAG_ACCESS)
    public String i;
    @Column(TAG_ACCESSSUBTYPE)
    public String j;

    static {
        kge.a(684061445);
    }

    public bte() {
    }

    public bte(String str, String str2, String str3, String str4) {
        this.f = str;
        this.g = str2;
        this.h = System.currentTimeMillis() / 1000;
        this.i = str3;
        this.j = str4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempEvent{}";
    }
}
