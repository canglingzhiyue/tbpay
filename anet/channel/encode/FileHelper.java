package anet.channel.encode;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.LaunchLoadZstdObject;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes2.dex */
public class FileHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CONFIG = "zstd_config";
    public static final String DEFAULT_CONFIG_PATH = "awcn_zstd_config_dir/";
    public static final String DEFAULT_PATH = "awcn_zstd_dict_dir/";
    public static final String DEFAULT_TEMPORARY_PATH = "awcn_zstd_dict_temporary_dir/";
    private static final String TAG = "awcn.FileHelper";
    public static final String ZSTD_TAG = "[zstd-d]";
    private static Comparator<File> comparator;
    private static File defaultConfigFilePath;
    private static File defaultFilePath;

    static {
        kge.a(742041924);
        defaultFilePath = null;
        defaultConfigFilePath = null;
        comparator = new Comparator<File>() { // from class: anet.channel.encode.FileHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue() : (int) (file2.lastModified() - file.lastModified());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x0013, B:9:0x002e, B:11:0x0032, B:12:0x003c, B:14:0x0042, B:18:0x004f, B:20:0x0052, B:21:0x0062, B:23:0x0068, B:25:0x0072, B:28:0x0083, B:76:0x020a, B:27:0x0079, B:29:0x00a2, B:31:0x00b1, B:33:0x00b4, B:35:0x00bc, B:74:0x0200, B:37:0x00e0, B:39:0x00eb, B:41:0x00f1, B:43:0x00f5, B:45:0x00ff, B:47:0x0105, B:49:0x0146, B:56:0x015b, B:59:0x016c, B:60:0x018b, B:62:0x0193, B:63:0x0197, B:65:0x019d, B:68:0x01c8, B:71:0x01d9, B:70:0x01d0, B:58:0x0163), top: B:88:0x0009, inners: #0, #1, #2 }] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean removeFile(java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.FileHelper.removeFile(java.lang.String, java.lang.String, boolean):boolean");
    }

    public static synchronized boolean storageFileByFileName(String str, File file, String str2, String str3) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3e2bc7f5", new Object[]{str, file, str2, str3})).booleanValue();
            }
            if (file != null) {
                try {
                } catch (Exception e) {
                    ALog.e(TAG, "[zstd-d] storageFileByFileName fail! sourceFile=" + file.getName() + " error=" + e.toString(), str, new Object[0]);
                }
                if (file.exists() && file.length() != 0) {
                    if (defaultFilePath == null) {
                        defaultFilePath = getDefaultFilePath(str, DEFAULT_PATH, ZSTD_TAG);
                    }
                    renameToFile(str, file, new File(defaultFilePath, str2), ZSTD_TAG, DEFAULT_TEMPORARY_PATH);
                    updateConfigFile(str);
                    return false;
                }
            }
            ALog.e(TAG, "[zstd-d] storageFileByFileName sourceFile null or not exist or len=0", str, new Object[0]);
            return false;
        }
    }

    public static void updateConfigFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec434d8", new Object[]{str});
            return;
        }
        if (defaultConfigFilePath == null) {
            defaultConfigFilePath = getDefaultFilePath(str, DEFAULT_CONFIG_PATH, ZSTD_TAG);
        }
        updateFile(ZstdDictHelper.zstdAttributesMap, new File(defaultConfigFilePath, DEFAULT_CONFIG), DEFAULT_CONFIG, str, DEFAULT_TEMPORARY_PATH, ZSTD_TAG);
        ALog.e(TAG, "[zstd-d] updateConfigFile success!", str, new Object[0]);
    }

    public static synchronized File[] getSortedFiles() {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File[]) ipChange.ipc$dispatch("ac5bb387", new Object[0]);
            } else if (defaultFilePath == null) {
                return null;
            } else {
                File[] listFiles = defaultFilePath.listFiles();
                if (listFiles != null) {
                    Arrays.sort(listFiles, comparator);
                }
                return listFiles;
            }
        }
    }

    public static synchronized File getDefaultFilePath(String str, String str2, String str3) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("1584219c", new Object[]{str, str2, str3});
            }
            try {
                Context context = GlobalAppRuntimeInfo.getContext();
                if (context != null) {
                    File file = new File(context.getFilesDir().getPath() + "/" + str2);
                    if (!file.exists() && file.mkdirs()) {
                        ALog.e(TAG, str3 + " getDefaultFilePath fileDir not exist! create dir", str, new Object[0]);
                    }
                    return file;
                }
            } catch (Exception e) {
                ALog.e(TAG, str3 + " getDefaultFilePath fail! error=" + e.toString(), str, new Object[0]);
            }
            return null;
        }
    }

    public static synchronized File getFile(String str, String str2, String str3, String str4) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("1a6e5a0c", new Object[]{str, str2, str3, str4});
            }
            try {
                File defaultFilePath2 = getDefaultFilePath(str, str2, str4);
                if (defaultFilePath2 != null && defaultFilePath2.exists()) {
                    String str5 = (defaultFilePath2.getAbsolutePath() + "/") + str3;
                    File file = new File(str5);
                    if (!file.exists()) {
                        if (file.createNewFile()) {
                            ALog.e(TAG, str4 + " getFile file not exist! create file success, filePath =" + str5, str, new Object[0]);
                        }
                    } else {
                        ALog.e(TAG, str4 + " getFile file exist! filePath =" + str5, str, new Object[0]);
                    }
                    return file;
                }
            } catch (Exception e) {
                ALog.e(TAG, str4 + "  getFile fail! error=" + e.toString(), str, new Object[0]);
            }
            return null;
        }
    }

    public static FileOutputStream getFileOutputStream(String str, File file, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileOutputStream) ipChange.ipc$dispatch("f94107", new Object[]{str, file, str2});
        }
        if (file == null && !file.exists() && file.length() == 0) {
            ALog.e(TAG, str2 + " getFileOutputStream file null or not exist or len = 0!", str, new Object[0]);
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ALog.e(TAG, str2 + " getFileOutputStream success", str, new Object[0]);
            return fileOutputStream;
        } catch (Exception e) {
            ALog.e(TAG, str2 + " getFileOutputStream fail! error=" + e.toString(), str, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.StringBuilder] */
    public static byte[] readFileToByteArray(LaunchLoadZstdObject launchLoadZstdObject, String str, File file, String str2) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27422ed5", new Object[]{launchLoadZstdObject, str, file, str2});
        }
        FileInputStream fileInputStream = 0;
        byte[] bArr2 = null;
        FileInputStream fileInputStream2 = null;
        if (file != null && file.exists()) {
            try {
                if (file.length() != 0) {
                    try {
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        try {
                            bArr2 = new byte[(int) file.length()];
                            fileInputStream3.read(bArr2);
                            launchLoadZstdObject.ret = 1;
                            try {
                                fileInputStream3.close();
                            } catch (Exception e) {
                                ALog.e(TAG, str2 + " readFileToByteArray fis close fail! error=" + e.toString(), str, new Object[0]);
                            }
                            return bArr2;
                        } catch (Exception e2) {
                            e = e2;
                            bArr = bArr2;
                            fileInputStream2 = fileInputStream3;
                            ALog.e(TAG, str2 + " readFileToByteArray fail! error=" + e.toString(), str, new Object[0]);
                            if (fileInputStream2 == null) {
                                return bArr;
                            }
                            try {
                                fileInputStream2.close();
                                return bArr;
                            } catch (Exception e3) {
                                fileInputStream = new StringBuilder();
                                fileInputStream.append(str2);
                                fileInputStream.append(" readFileToByteArray fis close fail! error=");
                                fileInputStream.append(e3.toString());
                                str2 = new Object[0];
                                ALog.e(TAG, fileInputStream.toString(), str, str2);
                                return bArr;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream3;
                            if (fileInputStream != 0) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e4) {
                                    ALog.e(TAG, str2 + " readFileToByteArray fis close fail! error=" + e4.toString(), str, new Object[0]);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        bArr = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        ALog.e(TAG, str2 + " readFileToByteArray file null or not exist or len = 0!", str, new Object[0]);
        return null;
    }

    private static synchronized boolean renameToFile(String str, File file, File file2, String str2, String str3) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30bb810c", new Object[]{str, file, file2, str2, str3})).booleanValue();
            } else if (file == null || file2 == null) {
                return false;
            } else {
                try {
                } catch (Exception e) {
                    ALog.e(TAG, str2 + " renameToFile fail! sourceFile=" + file.getName() + " error=" + e.toString(), str, new Object[0]);
                }
                if (file.renameTo(file2)) {
                    return true;
                }
                if (str3 != null && !str3.isEmpty()) {
                    ALog.e(TAG, str2 + " renameToFile fail! sourceFile=" + file.getName() + " ,newFile=" + file2.getName(), str, new Object[0]);
                    deleteDirectory(getDefaultFilePath(str, str3, str2), str, str2);
                    return false;
                }
                ALog.e(TAG, str2 + " renameToFile fail! tmpPath null, sourceFile=" + file.getName() + " ,newFile=" + file2.getName(), str, new Object[0]);
                return false;
            }
        }
    }

    public static synchronized <T> T loadFile(String str, File file, String str2) {
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca80519e", new Object[]{str, file, str2});
            }
            return (T) loadFile(null, str, file, str2);
        }
    }

    public static synchronized <T> T loadFile(LaunchLoadZstdObject launchLoadZstdObject, String str, File file, String str2) {
        T t;
        synchronized (FileHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ab114ec8", new Object[]{launchLoadZstdObject, str, file, str2});
            }
            FileInputStream fileInputStream = null;
            T t2 = null;
            if (file != null && file.exists() && file.length() != 0) {
                ALog.e(TAG, str2 + " loadFile start file=" + file.getName(), str, new Object[0]);
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream2);
                        t2 = (T) objectInputStream.readObject();
                        objectInputStream.close();
                        if (launchLoadZstdObject != null) {
                            launchLoadZstdObject.flag = 1;
                        }
                        ALog.e(TAG, str2 + " loadFile end ", str, "size", Long.valueOf(file.length()));
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        t = t2;
                        fileInputStream = fileInputStream2;
                        if (launchLoadZstdObject != null) {
                            launchLoadZstdObject.flag = 0;
                        }
                        ALog.e(TAG, str2 + " loadFile fail. e=" + th.toString(), str, new Object[0]);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        t2 = t;
                        return t2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    t = null;
                }
                return t2;
            }
            ALog.e(TAG, str2 + " loadFile file not exist or file len=0.", str, new Object[0]);
            if (launchLoadZstdObject != null) {
                launchLoadZstdObject.flag = -1;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[Catch: all -> 0x0116, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x000c, B:10:0x0027, B:21:0x0092, B:37:0x00e7, B:42:0x00f1, B:45:0x00f6, B:34:0x00e1, B:14:0x0042, B:16:0x006c, B:19:0x0073, B:23:0x0096, B:32:0x00b6), top: B:60:0x0003, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void updateFile(java.io.Serializable r9, java.io.File r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.FileHelper.updateFile(java.io.Serializable, java.io.File, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void deleteDirectory(File file, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92541754", new Object[]{file, str, str2});
        } else if (file == null || !file.exists()) {
            ALog.e(TAG, str2 + " deleteDirectory dir null or not exist.", str, new Object[0]);
        } else {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    ALog.e(TAG, str2 + " deleteDirectory file null", str, new Object[0]);
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteDirectory(file2, str, str2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
                ALog.e(TAG, str2 + " deleteDirectory success dir=" + file.getName(), str, new Object[0]);
            } catch (Exception e) {
                ALog.e(TAG, str2 + " deleteDirectory fail e=" + e.toString(), str, new Object[0]);
            }
        }
    }
}
