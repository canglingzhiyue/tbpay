package mtopsdk.mtop.network;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface NetParam {
    public static final int BSSID = 2;
    public static final int SSID = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }

    /* loaded from: classes9.dex */
    public interface NetParamKey {
        public static final String BSSID = "BSSID";
        public static final String SSID = "SSID";
    }
}
