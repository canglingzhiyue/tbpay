package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.b;
import com.taobao.informationflowdataservice.dataservice.utils.environment.c;

/* loaded from: classes7.dex */
public class lxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f30973a;

    static {
        kge.a(941348873);
        f30973a = new c();
    }

    private static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2df297a1", new Object[0]) : f30973a;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (a() == null) {
        } else {
            String str3 = riy.ARRAY_START_STR + str + "] " + str2;
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (a() == null) {
        } else {
            String str3 = riy.ARRAY_START_STR + str + "] " + str2;
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (a() == null) {
        } else {
            String str3 = riy.ARRAY_START_STR + str + "] " + str2;
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (a() == null) {
        } else {
            String str3 = riy.ARRAY_START_STR + str + "] " + str2;
        }
    }
}
