package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class iib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f29037a = new ArrayList();

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!ikw.b((CharSequence) str)) {
        } else {
            this.f29037a.add(str);
            RSoLog.c("cleaner, addPath, = " + str);
        }
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        RSoLog.c("cleaner, listUsingPath, = " + this.f29037a);
        return new ArrayList(this.f29037a);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : ikw.a((CharSequence) str) || str.replace(d.KEY_ABTEST_STORAGE_KEY_SUFFIX, "").replace("_re_Remote", "").length() != 32;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : ikw.b((CharSequence) str) && str.length() == 32;
    }
}
