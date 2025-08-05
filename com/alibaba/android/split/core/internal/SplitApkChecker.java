package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.a;
import com.alibaba.android.split.core.install.model.a;
import com.alibaba.android.split.core.internal.ApkSignatureSchemeGetter;
import com.alibaba.android.split.s;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import tb.bgu;
import tb.bgy;
import tb.bhm;
import tb.kge;
import tb.xin;

/* loaded from: classes.dex */
public final class SplitApkChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context context;
    private final ObjectInvoker objectInvoker;
    private final bgy splitFileLogic;
    private xin optService = (xin) a.a((Class<? extends Object>) xin.class, new Object[0]);
    private bgu mLogger = (bgu) a.b(bgu.class, "SplitApkChecker");

    static {
        kge.a(706021915);
    }

    public static /* synthetic */ bgy access$000(SplitApkChecker splitApkChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgy) ipChange.ipc$dispatch("4f49e023", new Object[]{splitApkChecker}) : splitApkChecker.splitFileLogic;
    }

    public SplitApkChecker(Context context, bgy bgyVar, ObjectInvoker objectInvoker) {
        this.splitFileLogic = bgyVar;
        this.objectInvoker = objectInvoker;
        this.context = context;
    }

    public final boolean verifySplitFiles(a.C0084a c0084a, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7452d7", new Object[]{this, c0084a, list})).booleanValue();
        }
        try {
            File m = this.splitFileLogic.m();
            ArrayList arrayList = new ArrayList();
            Signature[] signatures = getSignatures();
            if (signatures != null) {
                for (Signature signature : signatures) {
                    X509Certificate certificate = getCertificate(signature);
                    if (certificate != null) {
                        arrayList.add(certificate);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                File[] listFiles = m.listFiles(new FileFilter() { // from class: com.alibaba.android.split.core.internal.SplitApkChecker.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                        }
                        List list2 = list;
                        SplitApkChecker.access$000(SplitApkChecker.this);
                        return list2.contains(bgy.j(file.getName()));
                    }
                });
                if (listFiles == null) {
                    return true;
                }
                Arrays.sort(listFiles);
                for (int length = listFiles.length - 1; length >= 0; length--) {
                    File file = listFiles[length];
                    String j = bgy.j(file.getName());
                    try {
                        if (!isCertificatesValid(file.getAbsolutePath(), arrayList)) {
                            this.mLogger.d("Split verification failure:" + j + ": Certificates is inValid! ", new Object[0]);
                            if (!isMd5Right(file)) {
                                this.mLogger.d("Split verification failure:" + j + ":" + this.optService.a(file.getAbsolutePath()) + " file length:" + file.length(), new Object[0]);
                                StringBuilder sb = c0084a.b;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Split verification failure:");
                                sb2.append(j);
                                sb2.append(":");
                                sb2.append(file.length());
                                sb.append(sb2.toString());
                                bhm.a().b().a(j, 0);
                                file.delete();
                                this.mLogger.d("Split verification failure1.", new Object[0]);
                                return false;
                            }
                            this.mLogger.d("Split verification md5 right!", new Object[0]);
                        }
                        try {
                            if (this.splitFileLogic.c(j).isFile() && isRightFile(this.splitFileLogic.c(j))) {
                                this.mLogger.d(" verifiedSplitFile is exits and isRightFile !." + this.splitFileLogic.c(j).getAbsolutePath(), new Object[0]);
                            } else if (!copyIO(file, this.splitFileLogic.c(j))) {
                                this.mLogger.d("copyIO Split from unverified to verfiied File." + file.getAbsolutePath(), new Object[0]);
                                if (!copyIO(file, this.splitFileLogic.c(j)) || !isRightFile(this.splitFileLogic.c(j))) {
                                    if (this.splitFileLogic.c(j).exists()) {
                                        this.mLogger.d("Split verification failure2. verifiedSplitFile length:" + this.splitFileLogic.c(j).getAbsolutePath() + this.splitFileLogic.c(j).length(), new Object[0]);
                                        this.splitFileLogic.c(j).delete();
                                    }
                                    if (file.exists() && !isRightFile(file)) {
                                        this.mLogger.d("Split verification failure2. unverifiedSplitFile length:" + file.getAbsolutePath() + file.length(), new Object[0]);
                                        file.delete();
                                        bhm.a().b().a(j, 0);
                                    }
                                    if (!file.exists()) {
                                        bhm.a().b().a(j, 0);
                                    }
                                    c0084a.b.append("Cannot write verified split");
                                    return false;
                                }
                            } else if (!isRightFile(this.splitFileLogic.c(j))) {
                                this.mLogger.d("rename file success but file is not right", new Object[0]);
                                this.splitFileLogic.c(j).delete();
                                if (!file.exists()) {
                                    bhm.a().b().a(j, 0);
                                }
                                return false;
                            }
                        } catch (IOException e) {
                            this.mLogger.a(e, "Cannot write verified split.", new Object[0]);
                            c0084a.b.append("Cannot write verified split");
                            try {
                                if (this.splitFileLogic.c(j).exists()) {
                                    this.mLogger.d("Split verification failure3. verifiedSplitFile length:" + this.splitFileLogic.c(j).length(), new Object[0]);
                                    this.splitFileLogic.c(j).delete();
                                }
                                if (!file.exists()) {
                                    this.mLogger.d("Split verification failure3. unverifiedSplitFile length:" + file.length(), new Object[0]);
                                    bhm.a().b().a(j, 0);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            return false;
                        }
                    } catch (Exception e3) {
                        this.mLogger.a(e3, "Split verification error.", new Object[0]);
                        c0084a.b.append("Split verification error");
                        bhm.a().b().a(j, 0);
                        if (file.exists()) {
                            file.delete();
                        }
                        return false;
                    }
                }
                return true;
            }
            this.mLogger.d("No app certificates found.", new Object[0]);
            c0084a.b.append("No app certificates found");
            return false;
        } catch (IOException unused) {
            c0084a.f2432a = -11;
            c0084a.b.append("Cannot access directory for unverified splits");
            this.mLogger.d("verifySplitFiles:Cannot access directory for unverified splits.", new Object[0]);
            return false;
        }
    }

    private boolean isMd5Right(File file) {
        SplitFileInfo a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccf8964a", new Object[]{this, file})).booleanValue() : file != null && file.exists() && (a2 = ((s) com.alibaba.android.split.a.a((Class<? extends Object>) s.class, new Object[0])).a(bgy.j(file.getName()))) != null && !TextUtils.isEmpty(a2.md5) && a2.md5.equals(this.optService.a(file.getAbsolutePath()));
    }

    private boolean isRightFile(File file) {
        SplitFileInfo a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d92545f0", new Object[]{this, file})).booleanValue() : file != null && file.exists() && (a2 = ((s) com.alibaba.android.split.a.a((Class<? extends Object>) s.class, new Object[0])).a(bgy.j(file.getName()))) != null && !TextUtils.isEmpty(a2.md5) && a2.md5.equals(this.optService.a(file.getAbsolutePath()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private boolean copyIO(java.io.File r7, java.io.File r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.split.core.internal.SplitApkChecker.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r7 = 2
            r1[r7] = r8
            java.lang.String r7 = "d9623e14"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1f:
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L74
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L74
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L74
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L74
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L58
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L54
        L33:
            int r5 = r1.read(r0)     // Catch: java.lang.Throwable -> L54
            if (r5 <= 0) goto L3d
            r4.write(r0, r3, r5)     // Catch: java.lang.Throwable -> L54
            goto L33
        L3d:
            r1.close()     // Catch: java.io.IOException -> L41
            goto L45
        L41:
            r8 = move-exception
            r8.printStackTrace()
        L45:
            r4.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r8 = move-exception
            r8.printStackTrace()
        L4d:
            r7.delete()
            goto L97
        L51:
            r8 = move-exception
            r0 = r4
            goto L5c
        L54:
            r0 = r4
            goto L75
        L56:
            r8 = move-exception
            goto L5c
        L58:
            goto L75
        L5a:
            r8 = move-exception
            r1 = r0
        L5c:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r1 = move-exception
            r1.printStackTrace()
        L66:
            if (r0 == 0) goto L70
            r0.close()     // Catch: java.io.IOException -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r0.printStackTrace()
        L70:
            r7.delete()
            throw r8
        L74:
            r1 = r0
        L75:
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r1 = move-exception
            r1.printStackTrace()
        L7f:
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r0 = move-exception
            r0.printStackTrace()
        L89:
            boolean r0 = r8.exists()
            if (r0 == 0) goto L93
            r8.delete()
            goto L96
        L93:
            r7.delete()
        L96:
            r2 = 0
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.SplitApkChecker.copyIO(java.io.File, java.io.File):boolean");
    }

    public final boolean verifySplitApksFromIntent(List<Intent> list) throws IOException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d5a851a", new Object[]{this, list})).booleanValue();
        }
        for (Intent intent : list) {
            String stringExtra = intent.getStringExtra("split_id");
            if (!this.splitFileLogic.c(stringExtra).exists() || bhm.a().a(stringExtra) <= 1) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean verifySplitApksFromFile(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45d63c13", new Object[]{this, str})).booleanValue() : this.splitFileLogic.c(str).exists();
    }

    private final boolean isCertificatesValid(String str, List list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffb7749c", new Object[]{this, str, list})).booleanValue();
        }
        try {
            X509Certificate[][] certificates = ApkSignatureSchemeGetter.getCertificates(str);
            if (certificates != null && certificates.length != 0 && certificates[0].length != 0) {
                if (list.isEmpty()) {
                    this.mLogger.d(bgu.MODULE, "No certificates found for app.");
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate = (X509Certificate) it.next();
                    int length = certificates.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            continue;
                            break;
                        } else if (((ApkSignatureSchemeGetter.VerbatimX509Certificate) certificates[i][0]).getWrapped().equals(x509Certificate)) {
                            z = true;
                            continue;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        this.mLogger.d("Flexa There's an app certificate that doesn't sign the split.", new Object[0]);
                        return false;
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private final Signature[] getSignatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature[]) ipChange.ipc$dispatch("29ea9070", new Object[]{this});
        }
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static X509Certificate getCertificate(Signature signature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate) ipChange.ipc$dispatch("987df462", new Object[]{signature});
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e(bgu.MODULE, "Cannot decode certificate.", e);
            return null;
        }
    }
}
