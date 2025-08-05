package tb;

import android.content.Context;

/* loaded from: classes.dex */
public interface nyf {
    public static final int CLOSE_TYPE = 2;
    public static final int MOBILE_FLOW_AND_WIFI_TYPE = 1;
    public static final int ONLY_WIFI_TYPE = 0;

    boolean isAutoPlayVideoUnderCurrentNetwork(Context context);

    boolean isAutoPlayVideoUnderWifi(Context context, boolean z);
}
