package com.taobao.wireless.link.download;

import android.taobao.windvane.jsbridge.e;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class DownLoadJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CANCEL_APK_DOWNLOAD = "cancel_apk_download";
    private static final String ACTION_PAUSE_APK_DOWNLOAD = "pause_apk_download";
    private static final String ACTION_RESUME_APK_DOWNLOAD = "resume_apk_download";
    private static final String ACTION_START_APK_DOWNLOAD = "start_apk_download";
    public static final String CLASSNAME_ACTION_DOWNLOAD = "DownLoadJsBridge";
    private ConcurrentHashMap<Integer, String> packageNames = new ConcurrentHashMap<>();

    static {
        kge.a(-2008818966);
    }

    public static /* synthetic */ Object ipc$super(DownLoadJsBridge downLoadJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r21, java.lang.String r22, android.taobao.windvane.jsbridge.WVCallBackContext r23) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.link.download.DownLoadJsBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private int startJsDownload(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7) {
        Variation variation;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d566c173", new Object[]{this, str, str2, str3, str4, str5, str6, new Boolean(z), new Boolean(z2), str7})).intValue();
        }
        if (!z2) {
            z3 = (!z || (variation = EVO.activateSync("link", RemoteMessageConst.NOTIFICATION, null, null).getVariation("visibilityNotification")) == null) ? false : variation.getValueAsBoolean(false);
        }
        return DownloadCenter.a().a(str, str2, str3, str4, str5, str6, z3, str7, new b(this.mContext, str, str3, str4));
    }
}
