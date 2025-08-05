package com.taobao.artc.internal;

import android.app.Application;
import android.content.Context;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.internal.ADefines;
import tb.kge;

/* loaded from: classes6.dex */
public class ArtcGlobal {
    public static String alinnAuthCode;
    public static Application appInstance;
    @Deprecated
    public static boolean bypassBeauty;
    @Deprecated
    public static boolean bypassVideoPreprocess;
    public static Context context;
    public static boolean isAccsConnectd;
    public static int isAccsInit;
    public static AConstants.ArtcUtType utType;

    static {
        kge.a(-771874855);
        isAccsInit = ADefines.AccsStatus.ARTC_ACCS_UNINIT.ordinal();
        isAccsConnectd = false;
        appInstance = null;
        utType = AConstants.ArtcUtType.ARTC_UT_UNKNOWN;
        alinnAuthCode = "";
        bypassVideoPreprocess = false;
        bypassBeauty = false;
    }
}
