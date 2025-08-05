package tb;

import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.motu.tbrest.d;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTTracker;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;

/* loaded from: classes6.dex */
public final class tez {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final tez INSTANCE;
    public static final String MTOP_I18N_KEY = "x-app-i18n";
    public static final String UT_I18N_KEY = "x_i18n_info";

    static {
        kge.a(-2057438528);
        INSTANCE = new tez();
    }

    private tez() {
    }

    @JvmStatic
    public static final void a(String str, Language language) {
        UncaughtCrashHeader crashCaughtHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e340c907", new Object[]{str, language});
            return;
        }
        q.d(language, "language");
        tez tezVar = INSTANCE;
        String tag = language.getTag();
        q.b(tag, "language.tag");
        String c = tezVar.c(str, tag);
        INSTANCE.a(c);
        INSTANCE.b(c);
        TCrashSDK instance = TCrashSDK.instance();
        if (instance != null && (crashCaughtHeader = instance.getCrashCaughtHeader()) != null) {
            crashCaughtHeader.addHeaderInfo("languageInfo", c);
        }
        d.a().r = c;
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String d = b.d();
        Language a2 = b.a();
        q.b(a2, "Localization.getLanguage()");
        String tag = a2.getTag();
        q.b(tag, "Localization.getLanguage().tag");
        a(d, tag);
    }

    @JvmStatic
    public static final void a(String str, String languageTag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, languageTag});
            return;
        }
        q.d(languageTag, "languageTag");
        tez tezVar = INSTANCE;
        tezVar.a(tezVar.c(str, languageTag));
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (b.f()) {
            MtopSetting.removeParam(Mtop.Id.INNER, MtopParamType.HEADER, MTOP_I18N_KEY);
            TLog.logd(b.LOG_MODULE, b.LOG_MODULE, "mtop header update, not cn site, remove header x-app-i18n");
        } else {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, MTOP_I18N_KEY, str);
            TLog.logd(b.LOG_MODULE, b.LOG_MODULE, "mtop header update, x-app-i18n: " + str);
        }
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (b.f()) {
            UTTracker.removeGlobalPropertyForAllTracker(UT_I18N_KEY);
            AppMonitor.removeGlobalProperty(UT_I18N_KEY);
            TLog.logd(b.LOG_MODULE, b.LOG_MODULE, "ut param update, not cn site, remove global property x_i18n_info");
        } else {
            UTTracker.setGlobalPropertyForAllTracker(UT_I18N_KEY, str);
            AppMonitor.setGlobalProperty(UT_I18N_KEY, str);
            TLog.logd(b.LOG_MODULE, b.LOG_MODULE, "ut param update, x_i18n_info: " + str);
        }
    }

    private final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2});
        }
        return str + '.' + str2 + '.' + b();
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        TimeZone timeZone = TimeZone.getDefault();
        q.b(timeZone, "timeZone");
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            i = timeZone.getDSTSavings();
        }
        return String.valueOf((rawOffset + i) / 60000);
    }
}
