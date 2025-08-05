package com.etao.feimagesearch.nn;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.etao.feimagesearch.util.r;
import com.etao.feimagesearch.util.v;
import com.taobao.android.searchbaseframe.util.o;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import tb.com;
import tb.cot;
import tb.cox;
import tb.cst;
import tb.dpn;
import tb.kge;

/* loaded from: classes3.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2021212140);
    }

    private static String a(String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7bbb8a4", new Object[]{str, new Boolean(z), new Boolean(z2), str2});
        }
        cot.b("UnitBuildUtil", "downloadModelFile, ignoreWifi is %b", Boolean.valueOf(z));
        int b = com.e() ? 1 : o.b();
        if (!z && b != 1) {
            return "";
        }
        cot.b("UnitBuildUtil", "model cdnUrl = %s", str);
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(cst.a(com.b(), str))) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = v.a(com.b(), str, z2, str2);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!TextUtils.isEmpty(a2)) {
            long j = currentTimeMillis2 - currentTimeMillis;
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName(), "detectModelDownloadFinish", "time", String.valueOf(j));
            cot.b("UnitBuildUtil", "detectModelDownloadFinish time= %d", Long.valueOf(j));
            return a2;
        }
        long j2 = currentTimeMillis2 - currentTimeMillis;
        cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName(), "detectModelDownloadFailed", "time", String.valueOf(j2));
        cot.b("UnitBuildUtil", "detectModelDownloadFailed time= %d", Long.valueOf(j2));
        return a2;
    }

    public static String a(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce2a666a", new Object[]{str, new Boolean(z), str2, str3});
        }
        String a2 = cst.a(com.b(), str, str2);
        String str4 = TextUtils.isEmpty(str3) ? "-1" : str3;
        if (TextUtils.isEmpty(a2)) {
            long currentTimeMillis = System.currentTimeMillis();
            String a3 = a(str, true, z, str2);
            dpn.a(NetConfig.ALINN_BIZ_NAME, str3, "0", "", !TextUtils.isEmpty(a3), (float) (System.currentTimeMillis() - currentTimeMillis));
            String pageName = StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName();
            cox.b(pageName, "selfDownload" + str4, new String[0]);
            return a3;
        }
        String pageName2 = StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName();
        cox.b(pageName2, "cacheLoad" + str4, new String[0]);
        return a2;
    }

    public static String a(String str, String str2) {
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!com.etao.feimagesearch.config.b.dh() && com.b() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(com.b().getCacheDir(), "festival");
            if (!file.exists()) {
                return "";
            }
            File file2 = new File(file, "festival.bin");
            if (!file2.exists() || file2.length() == 0) {
                return "";
            }
            BufferedInputStream bufferedInputStream2 = null;
            int length = (int) file2.length();
            byte[] bArr = new byte[length];
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedInputStream.read(bArr, 0, length);
                com.etao.feimagesearch.mnn.utils.d.a(bufferedInputStream);
                if (!TextUtils.equals(r.b(bArr), str2)) {
                    com.etao.feimagesearch.util.i.a(file2);
                    return "";
                }
                cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_TAKE.getPageName(), "preDownload", new String[0]);
                return file2.getAbsolutePath();
            } catch (Exception unused2) {
                bufferedInputStream2 = bufferedInputStream;
                com.etao.feimagesearch.mnn.utils.d.a(bufferedInputStream2);
                return "";
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
                com.etao.feimagesearch.mnn.utils.d.a(bufferedInputStream2);
                throw th;
            }
        }
        return "";
    }
}
