package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Location;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public final class qgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qgq INSTANCE;

    static {
        kge.a(1702063405);
        INSTANCE = new qgq();
    }

    private qgq() {
    }

    public final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("i18n_localization", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString("language_tag", null);
                }
            } catch (Exception e) {
                TLog.loge(b.LOG_MODULE, "Localization_SPUtil", String.valueOf(e.getMessage()));
            }
        }
        return null;
    }

    public final void a(Context context, String language) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, language});
            return;
        }
        q.d(language, "language");
        if (context == null || (sharedPreferences = context.getSharedPreferences("i18n_localization", 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString("language_tag", language);
        edit.apply();
    }

    public final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("i18n_localization", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString("location_code", null);
                }
            } catch (Exception e) {
                TLog.loge(b.LOG_MODULE, "Localization_SPUtil", String.valueOf(e.getMessage()));
            }
        }
        return null;
    }

    public final void b(Context context, String location) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, location});
            return;
        }
        q.d(location, "location");
        if (context == null || (sharedPreferences = context.getSharedPreferences("i18n_localization", 0)) == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putString("location_code", location);
        edit.apply();
    }

    public final String c(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
                    if (string != null) {
                        if (!(string.length() > 0)) {
                            string = null;
                        }
                        if (string != null) {
                            return string;
                        }
                    }
                    String string2 = sharedPreferences.getString("PREF_KEY_CHECKED_COUNTRY_CODE", null);
                    if (string2 != null) {
                        if (string2.length() <= 0) {
                            z = false;
                        }
                        if (!z) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            return string2;
                        }
                    }
                }
            } catch (Exception e) {
                TLog.loge(b.LOG_MODULE, "Localization_SPUtil", String.valueOf(e.getMessage()));
            }
        }
        return Location.CN.name();
    }
}
