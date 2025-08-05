package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;

/* loaded from: classes5.dex */
public final class ocd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(42345466);
    }

    public static boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2.getTimeInMillis() == calendar.getTimeInMillis();
    }

    public static boolean a(long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2628051f", new Object[]{new Long(j), new Long(j2), new Integer(i)})).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000 >= ((long) i);
    }
}
