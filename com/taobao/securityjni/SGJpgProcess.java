package com.taobao.securityjni;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Process;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes.dex */
public class SGJpgProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String[] DEFAULT_FILES = null;
    private static String FINISHED_FILE_NAME = null;
    private static String JPG_DIR_PREFIX = null;
    private static String JPG_PREFIX = null;
    private static String ROOT_FOLDER = null;
    private static final String TAG = "SG_Compatible";
    private static Method sOpenNonAssetMethod;
    private static boolean sOpenNonAssetMethodFetched;
    private Context ctx;

    static {
        kge.a(1110426463);
        ROOT_FOLDER = "SGLib";
        JPG_PREFIX = "yw_1222";
        JPG_DIR_PREFIX = "jpgs_";
        FINISHED_FILE_NAME = "SGJpgProcessFinished";
        DEFAULT_FILES = new String[]{"res/drawable/yw_1222.jpg", "res/drawable/yw_1222_mwua.jpg", "res/drawable/yw_1222_sharetoken.jpg"};
    }

    public SGJpgProcess(Context context) {
        this.ctx = context;
    }

    private boolean isPathSecurityValid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a128742", new Object[]{this, str})).booleanValue() : !Pattern.compile("\\S*(\\.\\.)+(%)*\\S*").matcher(str).find();
    }

    private boolean unzipByPrefix(String str, String str2, String str3, String[] strArr) {
        ZipEntry entry;
        int indexOf;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe3c9ad", new Object[]{this, str, str2, str3, strArr})).booleanValue();
        }
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    ZipFile zipFile = new ZipFile(str);
                    for (String str4 : strArr) {
                        if (isPathSecurityValid(str4) && (entry = zipFile.getEntry(str4)) != null && (indexOf = str4.indexOf(str3)) >= 0) {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            int size = (int) entry.getSize();
                            String substring = str4.substring(indexOf);
                            BufferedOutputStream bufferedOutputStream = null;
                            try {
                                fileOutputStream = new FileOutputStream(new File(str2, substring));
                                try {
                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream, size);
                                    try {
                                        byte[] bArr = new byte[size];
                                        int i = 0;
                                        while (i < size) {
                                            int read = inputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            bufferedOutputStream2.write(bArr, 0, read);
                                            i += read;
                                        }
                                        if (i != size) {
                                            try {
                                                bufferedOutputStream2.flush();
                                                bufferedOutputStream2.close();
                                                fileOutputStream.close();
                                            } catch (Exception unused) {
                                            }
                                            return false;
                                        }
                                        try {
                                            bufferedOutputStream2.flush();
                                            bufferedOutputStream2.close();
                                            fileOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception unused3) {
                                        bufferedOutputStream = bufferedOutputStream2;
                                        try {
                                            bufferedOutputStream.flush();
                                            bufferedOutputStream.close();
                                            fileOutputStream.close();
                                        } catch (Exception unused4) {
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        try {
                                            bufferedOutputStream.flush();
                                            bufferedOutputStream.close();
                                            fileOutputStream.close();
                                        } catch (Exception unused5) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused6) {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Exception unused7) {
                                fileOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException unused8) {
            }
        }
        return false;
    }

    private boolean deleteDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{this, file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            for (int i = 0; list != null && i < list.length; i++) {
                if (!deleteDir(new File(file, list[i]))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private boolean writeEmptyFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6013ca8c", new Object[]{this, file})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (file != null) {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath());
                    try {
                        fileOutputStream2.close();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                        return true;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } else {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        try {
            int myPid = Process.myPid();
            if (context == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName != null ? runningAppProcessInfo.processName : "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[]{this})).booleanValue();
        }
        try {
            return getProcessName(this.ctx).equals(this.ctx.getPackageName());
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean unzipFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67cb0a05", new Object[]{this})).booleanValue() : unzipFinished(DEFAULT_FILES);
    }

    public boolean unzipFinished(String[] strArr) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c5d182", new Object[]{this, strArr})).booleanValue();
        }
        try {
            if (this.ctx != null && isMainProcess()) {
                String absolutePath = this.ctx.getDir(ROOT_FOLDER, 0).getAbsolutePath();
                String str = this.ctx.getApplicationInfo().sourceDir;
                String str2 = null;
                if (str != null) {
                    if (new File(str).exists()) {
                        str2 = absolutePath + "/app_" + (file.lastModified() / 1000);
                    }
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdir();
                    }
                    str2 = str2 + "/pre_unzip_jpgs";
                    File file3 = new File(str2);
                    if (!file3.exists()) {
                        file3.mkdir();
                    }
                }
                File file4 = new File(str2, FINISHED_FILE_NAME);
                if (file4.exists()) {
                    return true;
                }
                if (!unzipByAssetManager(str2, JPG_PREFIX, strArr) && !unzipByPrefix(str, str2, JPG_PREFIX, strArr)) {
                    return false;
                }
                return writeEmptyFile(file4);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean unzipByAssetManager(String str, String str2, String[] strArr) {
        int indexOf;
        FileOutputStream fileOutputStream;
        int available;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9353d0c", new Object[]{this, str, str2, strArr})).booleanValue();
        }
        for (String str3 : strArr) {
            if (isPathSecurityValid(str3) && (indexOf = str3.indexOf(str2)) >= 0) {
                try {
                    InputStream openNonAsset = openNonAsset(this.ctx.getAssets(), str3);
                    if (openNonAsset == null) {
                        return false;
                    }
                    String substring = str3.substring(indexOf);
                    BufferedOutputStream bufferedOutputStream2 = null;
                    try {
                        available = openNonAsset.available();
                        fileOutputStream = new FileOutputStream(new File(str, substring));
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception unused2) {
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                    try {
                        byte[] bArr = new byte[available];
                        int i = 0;
                        while (i < available) {
                            int read = openNonAsset.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                            i += read;
                        }
                        if (i != available) {
                            try {
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                            }
                            return false;
                        }
                        try {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            fileOutputStream.close();
                        } catch (Exception unused4) {
                            return false;
                        }
                    } catch (Exception unused5) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        try {
                            bufferedOutputStream2.flush();
                            bufferedOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream2 = bufferedOutputStream;
                        try {
                            bufferedOutputStream2.flush();
                            bufferedOutputStream2.close();
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception unused7) {
                            return false;
                        }
                    }
                } catch (Exception unused8) {
                    if (str3.indexOf(MspEventTypes.ACTION_STRING_SHARETOKEN) == -1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public InputStream openNonAsset(AssetManager assetManager, String str) {
        fetchOpenNonAssetMethod();
        Method method = sOpenNonAssetMethod;
        if (method != null) {
            try {
                return (InputStream) method.invoke(assetManager, str);
            } catch (IllegalAccessException unused) {
                return null;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    private void fetchOpenNonAssetMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4780af", new Object[]{this});
        } else if (sOpenNonAssetMethodFetched) {
        } else {
            try {
                Method declaredMethod = AssetManager.class.getDeclaredMethod("openNonAsset", String.class);
                sOpenNonAssetMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sOpenNonAssetMethodFetched = true;
        }
    }
}
