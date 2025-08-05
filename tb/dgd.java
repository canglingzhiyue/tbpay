package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class dgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<dgf> f26719a;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final dgd f26720a;

        static {
            kge.a(-404932147);
            f26720a = new dgd();
        }

        public static /* synthetic */ dgd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dgd) ipChange.ipc$dispatch("f03a8fd", new Object[0]) : f26720a;
        }
    }

    static {
        kge.a(1026013976);
    }

    private dgd() {
        this.f26719a = new ArrayList();
        this.f26719a.add(new dgg());
        this.f26719a.add(new dge());
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = str;
        for (dgf dgfVar : this.f26719a) {
            try {
                str2 = dgfVar.a(str2);
            } catch (Exception e) {
                UserTrackLogs.trackExceptionLog(e);
            }
        }
        e.a("handler_url", "original_uri=" + str, "new_url=" + str2);
        return str2;
    }

    public static dgd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgd) ipChange.ipc$dispatch("f03a8fd", new Object[0]) : a.a();
    }
}
