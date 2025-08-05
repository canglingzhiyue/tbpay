package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes8.dex */
public class phm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2135051728);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (cgl.c() == null) {
        } else {
            cgl.c().a(str);
        }
    }

    public void a(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
        } else if (cgl.c() == null) {
        } else {
            cgl.c().a(str, str2, list);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (cgl.c() == null) {
        } else {
            cgl.c().a(str, str2, str3);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (cgl.c() == null) {
        } else {
            cgl.c().a(str, str2);
        }
    }
}
