package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.framework.b;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes9.dex */
public class rfj implements b<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f33112a = -1;

    static {
        kge.a(1435128342);
        kge.a(-386319410);
    }

    public static int differentDays(Date date, Date date2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("580ac66c", new Object[]{date, date2})).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i2 = calendar.get(6);
        int i3 = calendar2.get(6);
        int i4 = calendar.get(1);
        int i5 = calendar2.get(1);
        if (i4 == i5) {
            return i3 - i2;
        }
        while (i4 < i5) {
            i = ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) ? i + fwk.DEFAULT_EXPIRED_TIME : i + 366;
            i4++;
        }
        return i + (i3 - i2);
    }

    @Override // com.taobao.update.framework.b
    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (apkUpdateContext.skipUpdate()) {
            apkUpdateContext.success = false;
            apkUpdateContext.errorCode = -53;
        } else if (!apkUpdateContext.background || apkUpdateContext.isForceUpdate()) {
        } else {
            MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
            int i = this.f33112a;
            if (i == -1) {
                i = a.get(mainUpdateData.version);
            }
            this.f33112a = i;
            if (mainUpdateData.remindCount <= 0 || this.f33112a >= mainUpdateData.remindCount) {
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -52;
                apkUpdateContext.exceedUpdateTimes = true;
                return;
            }
            this.f33112a++;
            a.update(mainUpdateData.version, mainUpdateData.remindCount);
        }
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MINITAO_FROM_DAY = "minitao_fromday";
        public static final String MINITAO_NOTIFICATION = "minitao_notification";

        static {
            kge.a(923742353);
        }

        public static void update(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab067fa9", new Object[]{str, new Integer(i)});
            } else if (TextUtils.isEmpty(str) || i <= 0) {
            } else {
                int i2 = get(str);
                SharedPreferences.Editor edit = getDatabase().edit();
                String a2 = a(str);
                if (i2 <= 0) {
                    edit.clear();
                    edit.putInt(a2, 1);
                } else if (i2 < i) {
                    edit.putInt(a2, i2 + 1);
                }
                edit.commit();
            }
        }

        public static void clear(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("769f891e", new Object[]{str});
                return;
            }
            SharedPreferences.Editor edit = getDatabase().edit();
            String a2 = a(str);
            edit.clear();
            edit.putInt(a2, 0);
            edit.commit();
        }

        public static int get(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1161055a", new Object[]{str})).intValue();
            }
            if (!TextUtils.isEmpty(str)) {
                return getDatabase().getInt(a(str), -1);
            }
            return -1;
        }

        private static String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            return str + format;
        }

        public static SharedPreferences getDatabase() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("8734e5cc", new Object[0]) : UpdateRuntime.getContext().getSharedPreferences("notification_record", 0);
        }
    }
}
