package com.android.alibaba.ip.runtime;

import com.android.alibaba.ip.server.InstantPatcher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes3.dex */
public class ApplicationPatch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NORMAL_CHANGE = 0;
    public static final int RES_CHANGE = 2;
    public static final int SYSCALL_CHANGE = 1;
    public final byte[] data;
    public final int mChange;
    public final int patchVersion;
    public final String path;

    static {
        kge.a(-638232874);
    }

    public int getChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f1bf820", new Object[]{this})).intValue() : this.mChange;
    }

    public int getPatchVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a58ce760", new Object[]{this})).intValue() : this.patchVersion;
    }

    public ApplicationPatch(String str, int i, int i2) {
        this.path = str;
        this.mChange = i;
        this.patchVersion = i2;
        this.data = new byte[0];
    }

    public ApplicationPatch(String str, int i, byte[] bArr, int i2) {
        this.path = str;
        this.mChange = i;
        this.patchVersion = i2;
        this.data = bArr;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008b -> B:41:0x009a). Please submit an issue!!! */
    public static List<ApplicationPatch> makePatch(String str, int i) {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b06234ef", new Object[]{str, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (file.exists()) {
            ZipFile zipFile2 = null;
            try {
                try {
                    try {
                        zipFile = new ZipFile(file);
                        try {
                            ZipEntry entry = zipFile.getEntry(InstantPatcher.RES_PATCH);
                            if (entry != null) {
                                arrayList.add(new ApplicationPatch(InstantPatcher.RES_PATCH, 2, input2byte(zipFile.getInputStream(entry)), i));
                            }
                            if (zipFile.getEntry(InstantPatcher.CLASSES_DEX) != null) {
                                arrayList.add(new ApplicationPatch(str, 0, i));
                            }
                            ZipEntry entry2 = zipFile.getEntry(InstantPatcher.SYS_CALL_CLASSES_DEX);
                            if (entry2 != null) {
                                arrayList.add(new ApplicationPatch(str, 1, input2byte(zipFile.getInputStream(entry2)), i));
                            }
                            zipFile.close();
                        } catch (IOException e) {
                            e = e;
                            zipFile2 = zipFile;
                            e.printStackTrace();
                            if (zipFile2 != null) {
                                zipFile2.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        return arrayList;
    }

    public static final byte[] input2byte(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("78a8d0a1", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public byte[] getBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this}) : this.data;
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this}) : this.path;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ApplicationPatch{path='" + this.path + "', patchVersion=" + this.patchVersion + '}';
    }
}
