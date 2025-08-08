package com.alipay.mobile.security.bio.runtime.download.impl;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.bis.core.protocol.BioLibFile;
import com.alipay.bis.core.protocol.BioModelFile;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import com.alipay.mobile.security.bio.runtime.BioResManager;
import com.alipay.mobile.security.bio.runtime.download.BioDownloadItem;
import com.alipay.mobile.security.bio.runtime.download.BioResChecker;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.List;
import tb.iju;

/* loaded from: classes3.dex */
public class BioResCheckerImpl implements BioResChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5796a = null;

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResChecker
    public boolean isStaticBuild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f0c82a1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResChecker
    public void init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{this, context, str});
        } else if (StringUtils.isEmpty(str)) {
            this.f5796a = str;
        } else {
            this.f5796a = new File(context.getFilesDir(), ALBiometricsActivityParentView.p).getAbsolutePath();
        }
    }

    @Override // com.alipay.mobile.security.bio.runtime.download.BioResChecker
    public int checkRes(Context context, BioRuntimeDependency bioRuntimeDependency, List<BioDownloadItem> list, List<BioDownloadItem> list2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5714e871", new Object[]{this, context, bioRuntimeDependency, list, list2})).intValue();
        }
        for (BioModelFile bioModelFile : bioRuntimeDependency.getModelFiles()) {
            try {
                int a2 = a(context, bioModelFile);
                if (a2 == 1) {
                    i++;
                    if (list != null) {
                        list.add(bioModelFile);
                    }
                } else if (a2 == 2 && list2 != null) {
                    list2.add(bioModelFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -2;
            }
        }
        for (BioLibFile bioLibFile : bioRuntimeDependency.getLibFiles()) {
            try {
                int a3 = a(context, bioLibFile);
                if (a3 == 1) {
                    i++;
                    if (list != null) {
                        list.add(bioLibFile);
                    }
                } else if (a3 == 2 && list2 != null) {
                    list2.add(bioLibFile);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return -2;
            }
        }
        return i;
    }

    private File a(Context context, BioDownloadItem bioDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("967736df", new Object[]{this, context, bioDownloadItem});
        }
        if (StringUtils.isEmpty(bioDownloadItem.getSavePath())) {
            bioDownloadItem.setSavePath(this.f5796a);
            return new File(this.f5796a, bioDownloadItem.getFileName());
        }
        return new File(bioDownloadItem.getSavePath(), bioDownloadItem.getFileName());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.io.File r9) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.security.bio.runtime.download.impl.BioResCheckerImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r9
            java.lang.String r9 = "36082ea1"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L15:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L63 java.security.NoSuchAlgorithmException -> L66
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L63 java.security.NoSuchAlgorithmException -> L66
            java.lang.String r9 = "MD5"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r4]     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
        L25:
            int r6 = r1.read(r5, r3, r4)     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r7 = -1
            if (r6 == r7) goto L30
            r9.update(r5, r3, r6)     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            goto L25
        L30:
            byte[] r9 = r9.digest()     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r5 = 0
        L3a:
            r6 = 16
            if (r5 >= r6) goto L54
            java.lang.String r6 = "%02x"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r8 = r9[r5]     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r7[r3] = r8     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r4.append(r6)     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            int r5 = r5 + 1
            goto L3a
        L54:
            java.lang.String r9 = r4.toString()     // Catch: java.security.NoSuchAlgorithmException -> L61 java.lang.Throwable -> L76
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            return r9
        L61:
            r9 = move-exception
            goto L68
        L63:
            r9 = move-exception
            r1 = r0
            goto L77
        L66:
            r9 = move-exception
            r1 = r0
        L68:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L75
            r1.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r9 = move-exception
            r9.printStackTrace()
        L75:
            return r0
        L76:
            r9 = move-exception
        L77:
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r0 = move-exception
            r0.printStackTrace()
        L81:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.runtime.download.impl.BioResCheckerImpl.a(java.io.File):java.lang.String");
    }

    private int a(Context context, BioLibFile bioLibFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2038b5a", new Object[]{this, context, bioLibFile})).intValue();
        }
        if (BioResManager.getInstance().getCpuArchChecker().is64Bit(context)) {
            if ("armeabi".equalsIgnoreCase(bioLibFile.getArch()) || iju.ABI_ARM.equalsIgnoreCase(bioLibFile.getArch())) {
                return 0;
            }
        } else if (iju.ABI_ARM64.equalsIgnoreCase(bioLibFile.getArch())) {
            return 0;
        }
        File a2 = a(context, (BioDownloadItem) bioLibFile);
        if (!a2.exists() || !a2.isFile()) {
            return 1;
        }
        if (StringUtils.isEmpty(bioLibFile.getMd5())) {
            return 0;
        }
        return bioLibFile.getMd5().equalsIgnoreCase(a(a2)) ? 2 : 1;
    }

    private int a(Context context, BioModelFile bioModelFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184ffa36", new Object[]{this, context, bioModelFile})).intValue();
        }
        File a2 = a(context, (BioDownloadItem) bioModelFile);
        if (!a2.exists() || !a2.isFile()) {
            return 1;
        }
        if (StringUtils.isEmpty(bioModelFile.getMd5())) {
            return 0;
        }
        return bioModelFile.getMd5().equalsIgnoreCase(a(a2)) ? 2 : 1;
    }
}
