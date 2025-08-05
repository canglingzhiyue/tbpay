package android.taobao.mulitenv;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class EnvironmentSwitcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HTTP_VALIDATION = "http_validation";
    public static final String SPKEY_ENV = "env_taobao";
    public static final String SPKEY_PROJECT_ID = "projectid";
    public static final String SPKEY_SPDYSSLS = "spdyssls";
    public static final String SPKEY_SS = "ss";
    public static final String TLOG_LEVEL = "tlog_level";
    public static final String TLOG_TAG = "tlog_tag";
    public static final String TLOG_VERSION = "tlog_version";

    /* loaded from: classes2.dex */
    public enum EnvType {
        OnLINE(0),
        PRE(1),
        TEST(2),
        TEST_2(3);
        
        private final int value;

        EnvType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes2.dex */
    public enum HttpsValidationStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE
    }

    /* loaded from: classes2.dex */
    public enum SpdySSLStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE
    }

    /* loaded from: classes2.dex */
    public enum SpdyStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE
    }

    /* loaded from: classes2.dex */
    public enum TlogStrategy {
        ENABLE_DEGRADE,
        DISABLE_DEGRADE
    }

    static {
        kge.a(-1522439516);
    }

    public static void a(EnvType envType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe1d4d2", new Object[]{envType});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
        edit.putInt(SPKEY_ENV, envType.value);
        edit.commit();
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(SPKEY_ENV, 0);
    }

    public static SpdySSLStrategy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySSLStrategy) ipChange.ipc$dispatch("c42810cd", new Object[0]);
        }
        return SpdySSLStrategy.values()[PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(SPKEY_SPDYSSLS, SpdySSLStrategy.DISABLE_DEGRADE.ordinal())];
    }

    public static HttpsValidationStrategy c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpsValidationStrategy) ipChange.ipc$dispatch("6cfa9d44", new Object[0]);
        }
        return HttpsValidationStrategy.values()[PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(HTTP_VALIDATION, HttpsValidationStrategy.DISABLE_DEGRADE.ordinal())];
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString(SPKEY_PROJECT_ID, "");
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        int i = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(SPKEY_ENV, -1);
        if (i == -1 && ((i = Integer.parseInt(Globals.getApplication().getString(R.string.env_default))) < 0 || i >= 4)) {
            i = 0;
        }
        a(EnvType.values()[i]);
    }
}
