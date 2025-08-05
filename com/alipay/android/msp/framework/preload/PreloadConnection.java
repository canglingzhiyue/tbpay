package com.alipay.android.msp.framework.preload;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.network.http.http.PhoneCashierHttpClient;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;

/* loaded from: classes3.dex */
public class PreloadConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3 A[Catch: Throwable -> 0x0194, TryCatch #3 {Throwable -> 0x0194, blocks: (B:24:0x004f, B:26:0x0070, B:28:0x0076, B:48:0x00e3, B:49:0x00e9, B:51:0x0131, B:52:0x0134, B:54:0x013c, B:55:0x013f, B:57:0x0148, B:58:0x014f, B:31:0x0081, B:33:0x0093, B:35:0x00b0, B:37:0x00b6, B:34:0x00a2, B:38:0x00c0, B:40:0x00c6, B:42:0x00cc, B:44:0x00d2, B:46:0x00dc), top: B:82:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131 A[Catch: Throwable -> 0x0194, TryCatch #3 {Throwable -> 0x0194, blocks: (B:24:0x004f, B:26:0x0070, B:28:0x0076, B:48:0x00e3, B:49:0x00e9, B:51:0x0131, B:52:0x0134, B:54:0x013c, B:55:0x013f, B:57:0x0148, B:58:0x014f, B:31:0x0081, B:33:0x0093, B:35:0x00b0, B:37:0x00b6, B:34:0x00a2, B:38:0x00c0, B:40:0x00c6, B:42:0x00cc, B:44:0x00d2, B:46:0x00dc), top: B:82:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[Catch: Throwable -> 0x0194, TryCatch #3 {Throwable -> 0x0194, blocks: (B:24:0x004f, B:26:0x0070, B:28:0x0076, B:48:0x00e3, B:49:0x00e9, B:51:0x0131, B:52:0x0134, B:54:0x013c, B:55:0x013f, B:57:0x0148, B:58:0x014f, B:31:0x0081, B:33:0x0093, B:35:0x00b0, B:37:0x00b6, B:34:0x00a2, B:38:0x00c0, B:40:0x00c6, B:42:0x00cc, B:44:0x00d2, B:46:0x00dc), top: B:82:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148 A[Catch: Throwable -> 0x0194, TryCatch #3 {Throwable -> 0x0194, blocks: (B:24:0x004f, B:26:0x0070, B:28:0x0076, B:48:0x00e3, B:49:0x00e9, B:51:0x0131, B:52:0x0134, B:54:0x013c, B:55:0x013f, B:57:0x0148, B:58:0x014f, B:31:0x0081, B:33:0x0093, B:35:0x00b0, B:37:0x00b6, B:34:0x00a2, B:38:0x00c0, B:40:0x00c6, B:42:0x00cc, B:44:0x00d2, B:46:0x00dc), top: B:82:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.preload.PreloadConnection.a():boolean");
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return new URI(str).getAuthority();
        } catch (URISyntaxException e) {
            LogUtil.printExceptionStackTrace(e);
            return DnsValue.DOMAIN_MOBILE_GW;
        }
    }

    private static Header a(String str, Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header) ipChange.ipc$dispatch("aaa9f833", new Object[]{str, headerArr});
        }
        if (headerArr == null || headerArr.length <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (Header header : headerArr) {
            String name = header.getName();
            if (!TextUtils.isEmpty(name) && TextUtils.equals(name.toLowerCase(), lowerCase)) {
                return header;
            }
        }
        return null;
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        PhoneCashierHttpClient.newInstance().shutdown();
        LogUtil.record(1, "PreloadConnection", "Preload shutdown");
    }
}
