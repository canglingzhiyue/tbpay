package com.ta.audid.upload;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class HttpUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CONNECTION_TIME_OUT = 10000;
    private static final int MAX_READ_CONNECTION_STREAM_TIME_OUT = 10000;
    private static final long TIME_SCOPE = 1800000;

    static {
        kge.a(-668383501);
        System.setProperty("http.keepAlive", "true");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARN: Type inference failed for: r10v3, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ta.audid.upload.HttpResponse sendRequest(java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.upload.HttpUtils.sendRequest(java.lang.String, java.lang.String, boolean):com.ta.audid.upload.HttpResponse");
    }
}
