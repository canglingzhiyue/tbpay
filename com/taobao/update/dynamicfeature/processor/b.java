package com.taobao.update.dynamicfeature.processor;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.bgx;
import tb.bgy;
import tb.kge;
import tb.rgg;

/* loaded from: classes9.dex */
public class b implements com.taobao.update.framework.b<com.taobao.update.dynamicfeature.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1670360566);
        kge.a(-386319410);
    }

    @Override // com.taobao.update.framework.b
    public void execute(com.taobao.update.dynamicfeature.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431fae6e", new Object[]{this, bVar});
            return;
        }
        bVar.stage = rgg.ARG_EXTRAT;
        File file = new File(bVar.downloadPath);
        File file2 = null;
        try {
            file2 = new bgx(bVar.context, String.valueOf(bVar.featureUpdateData.featureUpdateVersion)).d();
            a(file, file2);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Iterator<FeatureUpdateData.FeatureInfo> it = bVar.featureUpdateData.updateFeatures.iterator();
        while (it.hasNext()) {
            if (!new File(file2, it.next().featureName + bgy.APK_EXTENSION).exists()) {
                bVar.success = false;
                bVar.errorCode = -5;
                bVar.errorMsg = Constants.getMsg(-5);
                return;
            }
        }
    }

    private void a(File file, File file2) {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3abf716", new Object[]{this, file, file2});
            return;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement.getName().endsWith(bgy.SO_EXTENSION) && !new File(file2, StringUtils.replace(nextElement.getName(), new String[]{bgy.SO_EXTENSION}, new String[]{bgy.APK_EXTENSION}).toString()).exists()) {
                            a(zipFile.getInputStream(nextElement), nextElement.getName().substring(0, nextElement.getName().length() - 3), file2);
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e = e2;
                    zipFile2 = zipFile;
                    e.printStackTrace();
                    try {
                        zipFile2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        zipFile.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
    }

    private void a(InputStream inputStream, String str, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13498cec", new Object[]{this, inputStream, str, file});
            return;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, str + bgy.APK_EXTENSION)));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.close();
                    inputStream.close();
                    return;
                }
            }
        } catch (Exception unused2) {
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            inputStream.close();
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            inputStream.close();
            throw th;
        }
    }
}
