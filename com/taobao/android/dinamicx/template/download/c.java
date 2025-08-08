package com.taobao.android.dinamicx.template.download;

import android.content.res.AssetManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fxb;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f11930a;

    static {
        kge.a(-570012846);
        f11930a = new ConcurrentHashMap<>(50);
    }

    public static boolean a(File file, long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4345b6f2", new Object[]{file, jArr})).booleanValue();
        }
        if (jArr.length <= 0 || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            jArr[0] = jArr[0] + file.length();
            return file.delete();
        } else if (!file.isDirectory()) {
            return true;
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return file.delete();
            }
            boolean z = false;
            for (File file2 : listFiles) {
                z = a(file2, jArr);
            }
            return z ? file.delete() : z;
        }
    }

    public static byte[] a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(fxb.ASSET_DIR)) {
            return c(str);
        }
        return e(str);
    }

    public static JSONObject a(String str, String str2) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc81489c", new Object[]{str, str2});
        }
        try {
            bArr = a(fxb.ASSET_DIR + str + str2);
        } catch (Throwable unused) {
            if (DinamicXEngine.j()) {
                StringBuilder sb = new StringBuilder(str);
                sb.append("未使用内置模板索引文件" + str2);
                fuw.c("DXTemplateInfoManager", sb.toString());
            }
            bArr = null;
        }
        if (bArr != null && bArr.length != 0) {
            try {
                return JSON.parseObject(new String(bArr));
            } catch (Throwable th) {
                if (DinamicXEngine.j()) {
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append("内置模板索引文件格式错误" + str2);
                    fuw.a("DXTemplateInfoManager", th, sb2.toString());
                }
            }
        }
        return null;
    }

    public static byte[] c(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("792658a9", new Object[]{str}) : a(AssetsDelegate.proxy_open(DinamicXEngine.i().getAssets(), str));
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        if (inputStream == null) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(2048);
        } catch (Throwable th2) {
            byteArrayOutputStream = null;
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static String a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        try {
            return new String(b(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] b(File file) throws IOException {
        int read;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("affe333d", new Object[]{file});
        }
        long length = file.length();
        if (length > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        while (true) {
            int read2 = fileInputStream.read(bArr, i, i2 - i);
            if (read2 > 0) {
                i += read2;
            } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                break;
            } else {
                if (i2 <= 2147483639 - i2) {
                    i2 = Math.max(i2 << 1, 8192);
                } else if (i2 == 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                } else {
                    i2 = 2147483639;
                }
                bArr = Arrays.copyOf(bArr, i2);
                bArr[i] = (byte) read;
                i++;
            }
        }
        fileInputStream.close();
        return i2 == i ? bArr : Arrays.copyOf(bArr, i);
    }

    private static byte[] e(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("71297667", new Object[]{str}) : b(new File(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static boolean a(String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7f5c57f", new Object[]{str, bArr, new Boolean(z)})).booleanValue();
        }
        if (fqi.aO() && f11930a.containsKey(str)) {
            fux.b("存在正在写的文件 " + str);
            DinamicXEngine.j();
            s sVar = new s("dinamicx");
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_TEMPLATE, DXMonitorConstant.DX_MONITOR_TEMPLATE_WRITE, s.DX_TEMPLATE_IO_WRITE_ERROR_60039);
            aVar.e = Thread.currentThread().getName() + "存在正在写的文件 " + str;
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        File file = new File(str);
        File file2 = new File(file.getParent());
        ?? r7 = -1;
        r7 = -1;
        try {
            try {
                if (fqi.aO()) {
                    f11930a.put(str, "");
                }
                if (!file2.exists()) {
                    r7 = file2.mkdirs();
                }
                if (fqi.ax() && file.exists() && !z) {
                    fux.b(str + "file 已经存在，无需在进行写入");
                    try {
                        if (fqi.aO()) {
                            f11930a.remove(str);
                        }
                    } catch (IOException unused) {
                    }
                    return true;
                }
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bufferedOutputStream2.write(bArr);
                    try {
                        bufferedOutputStream2.close();
                        if (fqi.aO()) {
                            f11930a.remove(str);
                        }
                    } catch (IOException unused2) {
                    }
                    return true;
                } catch (Exception e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (file.exists()) {
                        file.delete();
                    }
                    s sVar2 = new s("DinamicX_File");
                    s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_TEMPLATE, DXMonitorConstant.DX_MONITOR_TEMPLATE_WRITE, s.DX_TEMPLATE_IO_WRITE_ERROR);
                    aVar2.e = Thread.currentThread().getName() + " " + str + " dir.exist？ " + file2.exists() + "   mkdirRet " + r7 + " getFreeSpace " + file2.getFreeSpace() + str + com.taobao.android.dinamicx.exception.a.a(e);
                    sVar2.c.add(aVar2);
                    com.taobao.android.dinamicx.monitor.b.a(sVar2);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused3) {
                            return false;
                        }
                    }
                    if (fqi.aO()) {
                        f11930a.remove(str);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                    if (fqi.aO()) {
                        f11930a.remove(str);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(DXTemplateItem dXTemplateItem, byte[] bArr, String str, i iVar, s sVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df6ed2a", new Object[]{dXTemplateItem, bArr, str, iVar, sVar})).booleanValue();
        }
        if (dXTemplateItem == null || bArr == null || iVar == null || StringUtils.isEmpty(str)) {
            sVar.c.add(new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, 60002));
            return false;
        }
        HashMap hashMap = new HashMap();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new ByteArrayInputStream(bArr)));
            z = false;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                byte[] bArr2 = new byte[8192];
                String name = nextEntry.getName();
                if (!nextEntry.getName().contains("../") && !nextEntry.isDirectory()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String str2 = str + name;
                    File file = new File(new File(str2).getParent());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    while (true) {
                        int read = zipInputStream.read(bArr2, 0, 8192);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (dXTemplateItem.g == null) {
                        dXTemplateItem.g = new f();
                    }
                    if (fxb.DX_MAIN_TEMPLATE_NAME.equalsIgnoreCase(name)) {
                        dXTemplateItem.g.f11934a = str2;
                    } else {
                        if (dXTemplateItem.g.b == null) {
                            dXTemplateItem.g.b();
                        }
                        dXTemplateItem.g.b.put(name, str2);
                    }
                    hashMap.put(str2, byteArray);
                    byteArrayOutputStream.flush();
                    z = true;
                }
            }
            zipInputStream.close();
        } catch (Throwable th) {
            hashMap.clear();
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_UNZIP_ERROR);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
            sVar.c.add(aVar);
            z = false;
        }
        if (z) {
            if (dXTemplateItem.g == null || StringUtils.isEmpty(dXTemplateItem.g.f11934a)) {
                s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, s.DX_TEMPLATE_UNZIP_ERROR);
                aVar2.e = "模板zip中缺少main.dx";
                sVar.c.add(aVar2);
                return false;
            } else if (fqi.aQ()) {
                boolean a2 = iVar.a(dXTemplateItem, hashMap);
                fux.b(dXTemplateItem.b() + "onUnzipFinished " + a2);
                return a2;
            } else {
                iVar.a(dXTemplateItem, hashMap);
            }
        }
        return z;
    }

    public static String[] d(String str) {
        AssetManager assets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("52e2b884", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || (assets = DinamicXEngine.i().getAssets()) == null) {
            return null;
        }
        try {
            return AssetsDelegate.proxy_list(assets, str);
        } catch (IOException unused) {
            return null;
        }
    }
}
