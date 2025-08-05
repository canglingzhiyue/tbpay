package com.taobao.mrt.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.orange.OrangeConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MRTResourceFileSystemError = 3;
    public static final int MRTResourceNoExistence = 2;
    public static final int MRTResourceRemoteUpdate = 1;
    public static final int MRTResourceUpdated = 0;

    /* renamed from: a  reason: collision with root package name */
    public static String f18256a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    private static boolean g;

    static {
        kge.a(-924050173);
        g = true;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        File filesDir = com.taobao.mrt.c.b().getFilesDir();
        f18256a = filesDir.getAbsolutePath() + File.separator + "MNNRTLib";
        b = filesDir.getAbsolutePath() + File.separator + "MNNRTModels";
        e = f18256a + File.separator + "core";
        f = f18256a + File.separator + "core" + File.separator + "innerlib";
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("MNNRTResources");
        c = sb.toString();
        d = filesDir.getAbsolutePath() + File.separator + "MNNConfig";
        b();
        try {
            g = Boolean.valueOf(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "mainFileLastModified", "true")).booleanValue();
        } catch (Throwable unused) {
        }
    }

    public static int a(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e599e46", new Object[]{mRTResourceDescription})).intValue() : a(mRTResourceDescription.resourceName, mRTResourceDescription);
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        a(b);
        a(f18256a);
        a(e);
        a(f);
        a(c);
        a(d);
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        file.mkdirs();
    }

    private static int a(String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4d2b3bc", new Object[]{str, mRTResourceDescription})).intValue();
        }
        if (mRTResourceDescription == null || TextUtils.isEmpty(mRTResourceDescription.uniqueKey)) {
            return 2;
        }
        if (TextUtils.isEmpty(mRTResourceDescription.resourceRootDirectory)) {
            return 3;
        }
        File file = new File(mRTResourceDescription.resourceRootDirectory, str);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "__mrtlock__.json");
        JSONObject b2 = b(file2);
        if (b2 == null) {
            return 2;
        }
        String optString = b2.optString("mrtuk");
        if (TextUtils.isEmpty(optString)) {
            return 2;
        }
        if (!optString.equalsIgnoreCase(mRTResourceDescription.uniqueKey)) {
            return 1;
        }
        if (g && !a(mRTResourceDescription, b2)) {
            return 1;
        }
        try {
            b2.put("lastUsedTime", System.currentTimeMillis());
            a(b2, file2);
        } catch (Exception e2) {
            com.taobao.mrt.utils.a.a("MRTFileSystem", "write json to file filed", e2);
        }
        return 0;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(a(new File(str2)));
    }

    private static boolean a(MRTResourceDescription mRTResourceDescription, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9533d54f", new Object[]{mRTResourceDescription, jSONObject})).booleanValue();
        }
        if (mRTResourceDescription == null) {
            return false;
        }
        if (!(mRTResourceDescription instanceof MRTCodeDescription)) {
            return true;
        }
        File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
        String str = mRTResourceDescription.resourceName;
        String str2 = mRTResourceDescription.associatedTask != null ? mRTResourceDescription.associatedTask.cid : null;
        if (str2 != null) {
            if (str.endsWith("_" + str2)) {
                str = str.substring(0, str.lastIndexOf("_" + str2));
            }
        }
        File a2 = a(file, str);
        if (a2 == null || !a2.exists() || jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("mainFileLastModified")) {
            try {
                jSONObject.put("mainFileLastModified", a2.lastModified());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject.optLong("mainFileLastModified") == a2.lastModified();
    }

    public static String a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            StringBuilder sb = new StringBuilder(file.getName());
            if (listFiles != null) {
                List<File> asList = Arrays.asList(listFiles);
                Collections.sort(asList, new Comparator<File>() { // from class: com.taobao.mrt.task.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public /* synthetic */ int compare(File file2, File file3) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, file2, file3})).intValue() : a(file2, file3);
                    }

                    public int a(File file2, File file3) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a3abf709", new Object[]{this, file2, file3})).intValue() : file2.getName().compareTo(file3.getName());
                    }
                });
                for (File file2 : asList) {
                    sb.append(a(file2));
                }
            }
            return com.taobao.mrt.utils.d.b(sb.toString());
        }
        return com.taobao.mrt.utils.d.b(file.getName() + com.taobao.mrt.utils.d.a(file));
    }

    public static boolean a(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9c1162d", new Object[]{str, file})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.equalsIgnoreCase(com.taobao.mrt.utils.d.a(file));
        } catch (Exception e2) {
            com.taobao.mrt.utils.a.a("MRTFileSystem", e2.getMessage(), e2);
            return false;
        }
    }

    public static boolean a(File file, File file2) {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue();
        }
        if (file == null || file2 == null || !file.exists()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    String name = nextElement.getName();
                    if (name != null) {
                        if (!name.contains("..")) {
                            if (!a(file2, arrayList, zipFile, nextElement, name)) {
                                try {
                                    com.taobao.mrt.utils.f.a(zipFile);
                                } catch (Exception unused) {
                                }
                                return false;
                            }
                        } else {
                            com.taobao.mrt.utils.a.c("MRTFileSystem", "entryName contains dangerous character");
                        }
                    }
                }
                com.taobao.mrt.utils.f.a(zipFile);
            } catch (Throwable th2) {
                th = th2;
                zipFile2 = zipFile;
                try {
                    com.taobao.mrt.utils.a.b("MRTFileSystem", th.getMessage(), th);
                    com.taobao.mrt.utils.f.a(zipFile2);
                    return true;
                } catch (Throwable th3) {
                    try {
                        com.taobao.mrt.utils.f.a(zipFile2);
                    } catch (Exception unused2) {
                    }
                    throw th3;
                }
            }
        } catch (Exception unused3) {
        }
        return true;
    }

    public static void b(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98751cf2", new Object[]{mRTResourceDescription});
        } else if (mRTResourceDescription == null || TextUtils.isEmpty(mRTResourceDescription.uniqueKey)) {
        } else {
            File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (!file.isDirectory() || !file.exists()) {
                return;
            }
            File file2 = new File(file, "__mrtlock__.json");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mrtuk", mRTResourceDescription.uniqueKey);
                jSONObject.put("lastUsedTime", System.currentTimeMillis());
                if (g) {
                    a(jSONObject, mRTResourceDescription, file);
                }
                a(jSONObject, file2);
            } catch (JSONException e2) {
                com.taobao.mrt.utils.a.a("MRTFileSystem", "write file failed", e2);
            }
        }
    }

    private static void a(JSONObject jSONObject, MRTResourceDescription mRTResourceDescription, File file) {
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0c6adc", new Object[]{jSONObject, mRTResourceDescription, file});
        } else if (!(mRTResourceDescription instanceof MRTCodeDescription) || (a2 = a(file, mRTResourceDescription.resourceName)) == null) {
        } else {
            try {
                jSONObject.put("mainFileLastModified", a2.lastModified());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static File a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("430677c4", new Object[]{file, str});
        }
        File file2 = new File(file, str + ".wl");
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 != null) {
            return file2;
        }
        File file3 = new File(file, str + ".pyc");
        return file3.exists() ? file3 : file2;
    }

    public static boolean a(JSONObject jSONObject, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb125151", new Object[]{jSONObject, file})).booleanValue() : b(jSONObject.toString(), file);
    }

    public static boolean b(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd68e9ae", new Object[]{str, file})).booleanValue();
        }
        a(file, new String[]{str}, "utf-8");
        return true;
    }

    public static JSONObject b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c7c1628e", new Object[]{file});
        }
        String c2 = c(file);
        if (c2 == null) {
            return null;
        }
        try {
            return new JSONObject(c2);
        } catch (JSONException e2) {
            com.taobao.mrt.utils.a.a("MRTFileSystem", "to json object failed", e2);
            return null;
        }
    }

    public static String c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e869f5f", new Object[]{file});
        }
        BufferedReader bufferedReader = null;
        if (file == null || !file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append("\n");
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            com.taobao.mrt.utils.a.a("MRTFileSystem", "read file failed", e);
                            com.taobao.mrt.utils.f.a(bufferedReader);
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                com.taobao.mrt.utils.f.a(bufferedReader);
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    com.taobao.mrt.utils.f.a(bufferedReader2);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable unused2) {
        }
        return sb.toString();
    }

    public static boolean b(File file, File file2) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2183b31b", new Object[]{file, file2})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            for (String str : file.list()) {
                b(new File(file, str), new File(file2, str));
            }
            return true;
        }
        try {
            return c(file, file2);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean c(File file, File file2) throws IOException {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5b6f1c", new Object[]{file, file2})).booleanValue();
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return false;
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused) {
                return false;
            }
        }
        FileChannel fileChannel3 = null;
        try {
            fileChannel2 = new FileInputStream(file).getChannel();
            try {
                fileChannel = new FileOutputStream(file2).getChannel();
            } catch (Exception unused2) {
            } catch (Throwable th) {
                fileChannel3 = fileChannel2;
                th = th;
                fileChannel = null;
            }
            try {
                fileChannel.transferFrom(fileChannel2, 0L, fileChannel2.size());
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                return true;
            } catch (Exception unused3) {
                fileChannel3 = fileChannel;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel3 != null) {
                    fileChannel3.close();
                }
                return false;
            } catch (Throwable th2) {
                fileChannel3 = fileChannel2;
                th = th2;
                if (fileChannel3 != null) {
                    fileChannel3.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Exception unused4) {
            fileChannel2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static void a(File file, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7534aa", new Object[]{file, strArr, str});
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return;
        }
        PrintWriter printWriter = null;
        try {
            try {
                if (str != null) {
                    printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), str));
                } else {
                    printWriter = new PrintWriter(new FileWriter(file));
                }
                for (String str2 : strArr) {
                    printWriter.println(str2);
                }
                com.taobao.mrt.utils.f.a(printWriter);
            } catch (Exception e2) {
                e2.printStackTrace();
                com.taobao.mrt.utils.f.a(printWriter);
            }
        } catch (Throwable th) {
            com.taobao.mrt.utils.f.a(printWriter);
            throw th;
        }
    }

    private static boolean a(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89647020", new Object[]{file, list, zipFile, zipEntry, str})).booleanValue();
        }
        File file2 = new File(file + File.separator + str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            if (!e(file2)) {
                return false;
            }
        } else if (!f(file2)) {
            return false;
        } else {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                com.taobao.mrt.utils.f.a(bufferedInputStream, bufferedOutputStream);
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream2 = bufferedOutputStream;
                com.taobao.mrt.utils.f.a(bufferedInputStream, bufferedOutputStream2);
                throw th;
            }
        }
        return true;
    }

    private static boolean e(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c14126e7", new Object[]{file})).booleanValue() : file != null && (!file.exists() ? file.mkdirs() : file.isDirectory());
    }

    private static boolean f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eeb88a8", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!e(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean d(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f396c526", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    z &= d(file2);
                }
            }
            return file.delete() & z;
        }
        return file.delete() & true;
    }
}
