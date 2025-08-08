package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes6.dex */
public class jfc implements jeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jeo
    public boolean a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85272e00", new Object[]{this, thread, th})).booleanValue();
        }
        Pattern compile = Pattern.compile("Thread-\\d+");
        String name = thread.getName();
        return StringUtils.isEmpty(name) || compile.matcher(name).find() || thread.isDaemon();
    }
}
