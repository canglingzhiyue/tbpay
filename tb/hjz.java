package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.CalendarConfig;
import com.taobao.desktop.channel.calendar.CalendarInsertData;
import com.taobao.desktop.channel.calendar.api.c;
import com.taobao.desktop.channel.calendar.b;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes6.dex */
public abstract class hjz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DAY = 86400000;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(boolean z);
    }

    static {
        kge.a(1367832869);
    }

    public static /* synthetic */ String a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d97c20e", new Object[]{str, new Long(j)}) : b(str, j);
    }

    public static boolean a(Context context, CalendarConfig calendarConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4464c9d7", new Object[]{context, calendarConfig})).booleanValue();
        }
        if (calendarConfig == null) {
            return false;
        }
        String str = calendarConfig.title;
        long a2 = a(calendarConfig.time);
        return c.a(context, b(str, a2), a2, a2 + 3600000);
    }

    public static void a(final Context context, CalendarConfig calendarConfig, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2763ee", new Object[]{context, calendarConfig, aVar});
        } else if (calendarConfig == null) {
        } else {
            final String str = calendarConfig.title;
            final String str2 = calendarConfig.content;
            final String str3 = calendarConfig.url;
            final long a2 = a(calendarConfig.time);
            final long j = calendarConfig.days;
            final long j2 = calendarConfig.previousMinutes;
            c.a(context, new c.a() { // from class: tb.hjz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    boolean z = false;
                    for (int i = 0; i < j; i++) {
                        try {
                            long j3 = a2 + (hjz.DAY * i);
                            String a3 = hjz.a(str, j3);
                            if (!c.a(context, a3, j3, j3 + 3600000)) {
                                CalendarInsertData calendarInsertData = new CalendarInsertData();
                                calendarInsertData.setTitle(a3);
                                calendarInsertData.setContent(str2);
                                calendarInsertData.setReminderTime(j3);
                                calendarInsertData.setKeepTime(3600000L);
                                calendarInsertData.setTargetUrl(str3);
                                calendarInsertData.setPreviousMinutes(j2);
                                if (!StringUtils.isEmpty(b.a(context, calendarInsertData))) {
                                }
                            }
                            z = true;
                        } catch (Throwable unused) {
                        }
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(z);
                }

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }
            });
        }
    }

    public static void b(final Context context, CalendarConfig calendarConfig, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d58d6f", new Object[]{context, calendarConfig, aVar});
        } else if (calendarConfig == null) {
        } else {
            final String str = calendarConfig.title;
            final long a2 = a(calendarConfig.time);
            final long j = calendarConfig.days;
            c.a(context, new c.a() { // from class: tb.hjz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    boolean z = false;
                    for (int i = 0; i < j; i++) {
                        Context context2 = context;
                        String str2 = str;
                        long j2 = a2;
                        long j3 = hjz.DAY * i;
                        String a3 = hjz.a(str2, j2 + j3);
                        long j4 = a2;
                        z = c.b(context2, a3, j4 + j3, (j4 + j3) + 3600000) || z;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(z);
                }

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }
            });
        }
    }

    private static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(11, (int) j);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private static String b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea37ed0f", new Object[]{str, new Long(j)});
        }
        return str + b(j);
    }

    private static String b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)}) : new SimpleDateFormat("-MMdd").format(new Date(j));
    }
}
