package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes4.dex */
public class dhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2024378872);
    }

    public static String a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e9fa33a", new Object[]{new Long(j), str});
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat(str).format(calendar.getTime());
    }
}
