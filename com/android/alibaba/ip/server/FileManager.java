package com.android.alibaba.ip.server;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.runtime.Paths;
import com.android.alibaba.ip.server.InstantPatcher;
import com.android.alibaba.ip.utils.FileUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import tb.cjc;
import tb.kge;

/* loaded from: classes.dex */
public class FileManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSES_DEX_SUFFIX = ".dex";
    private static final String FILE_NAME_ACTIVE = "active";
    private static final String FOLDER_NAME_LEFT = "left";
    private static final String FOLDER_NAME_RIGHT = "right";
    private static final String RELOAD_DEX_PREFIX = "reload";
    private static final String RESOURCE_FILE_NAME = "resources.ap_";
    private static final String RESOURCE_FOLDER_NAME = "resources";
    private static final String TAG = "FileManager";
    public static final boolean USE_EXTRACTED_RESOURCES = false;
    public static Context context;
    private static boolean havePurgedTempDexFolder;

    static {
        kge.a(-142975124);
    }

    public static File getDataFolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3ba4fcf8", new Object[0]);
        }
        Context context2 = context;
        if (context2 != null) {
            return new File(Paths.getDataDirectory(context2));
        }
        return new File(Paths.getDataDirectory(cjc.f26301a));
    }

    public static File getFilesFolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2068cf37", new Object[0]);
        }
        Context context2 = context;
        if (context2 != null) {
            return new File(Paths.getMainApkFilesDirectory(context2));
        }
        return new File(Paths.getMainApkFilesDirectory(cjc.f26301a));
    }

    public static File getExternalDataFolder() {
        String externalDataDirectory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("1a72102d", new Object[0]);
        }
        Context context2 = context;
        if (context2 != null && (externalDataDirectory = Paths.getExternalDataDirectory(context2)) != null) {
            return new File(externalDataDirectory);
        }
        return null;
    }

    private static File getTempDexFileFolder(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("521e7cd8", new Object[]{file}) : new File(file, "dex-temp");
    }

    public static File getNativeLibraryFolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aab21c6a", new Object[0]);
        }
        Context context2 = context;
        if (context2 != null) {
            return new File(Paths.getMainApkDataDirectory(context2), "lib");
        }
        return new File(Paths.getMainApkDataDirectory(cjc.f26301a), "lib");
    }

    private static void delete(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258726a9", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                delete(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        Log.e(TAG, "Failed to delete file " + file);
    }

    public static InstantPatcher.FileState getTempDexFile(int i, int i2, boolean z) {
        int i3;
        String format;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatcher.FileState) ipChange.ipc$dispatch("5e1bd1d7", new Object[]{new Integer(i), new Integer(i2), new Boolean(z)});
        }
        InstantPatcher.FileState fileState = new InstantPatcher.FileState();
        File dataFolder = getDataFolder();
        File tempDexFileFolder = getTempDexFileFolder(dataFolder);
        int i5 = 3;
        while (!tempDexFileFolder.exists() && z && (!tempDexFileFolder.mkdirs() || !tempDexFileFolder.exists())) {
            Log.e("InstantPatch", "Failed to create directory " + tempDexFileFolder);
            i5 += -1;
            if (i5 <= 0) {
                break;
            }
        }
        if (!tempDexFileFolder.exists()) {
            File externalDataFolder = getExternalDataFolder();
            if (externalDataFolder == null) {
                return fileState;
            }
            tempDexFileFolder = getTempDexFileFolder(externalDataFolder);
            if (z) {
                dataFolder.mkdirs();
            }
            fileState.external = true;
        } else {
            fileState.external = false;
        }
        if (i2 == 0) {
            File[] listFiles = tempDexFileFolder.listFiles();
            if (listFiles != null) {
                i4 = -1;
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith("reload") && name.endsWith(".jar")) {
                        try {
                            int intValue = Integer.decode(name.substring(7, (name.length() + 1) - 4)).intValue();
                            if (intValue > i4) {
                                i4 = intValue;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                i4 = -1;
            }
            i3 = 2;
            format = String.format("%s%s0x%04x%s", "reload", Integer.valueOf(i), Integer.valueOf(i4 + 1), ".jar");
        } else {
            i3 = 2;
            format = String.format("%s%s0x%04x%s", "reload", Integer.valueOf(i), Integer.valueOf(i2), ".jar");
        }
        File file2 = new File(tempDexFileFolder, format);
        fileState.file = file2;
        if (Log.isLoggable("InstantPatch", i3)) {
            String str = "Writing new dex file: " + file2;
        }
        return fileState;
    }

    public static boolean writeRawBytes(File file, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12268c2b", new Object[]{file, bArr})).booleanValue();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream2.write(bArr);
                bufferedOutputStream2.flush();
                bufferedOutputStream2.close();
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (Throwable unused2) {
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    throw new RuntimeException("could not write res file");
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public static void startUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[0]);
        } else {
            getWriteFolder(true);
        }
    }

    public static File getExternalResourceFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d47b88bb", new Object[0]);
        }
        File resourceFile = getResourceFile(getReadFolder());
        if (resourceFile.exists()) {
            return resourceFile;
        }
        return null;
    }

    public static InstantPatcher.FileState writeSystemTempDexFile(int i, byte[] bArr, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatcher.FileState) ipChange.ipc$dispatch("dccb27ea", new Object[]{new Integer(i), bArr, new Integer(i2)});
        }
        InstantPatcher.FileState tempDexFile = getTempDexFile(i, i2, true);
        if (tempDexFile.file == null) {
            return tempDexFile;
        }
        if (!tempDexFile.file.exists()) {
            FileUtils.writeBytesToFile(bArr, tempDexFile.file);
            return tempDexFile;
        } else if (tempDexFile.file != null && tempDexFile.file.exists()) {
            if (FileUtils.isSameFile(tempDexFile.file, bArr)) {
                return tempDexFile;
            }
            tempDexFile.file.delete();
            FileUtils.writeBytesToFile(bArr, tempDexFile.file);
            return tempDexFile;
        } else {
            Log.e("InstantPatch", "No file to write temp dex content to");
            return tempDexFile;
        }
    }

    public static InstantPatcher.FileState writeTempDexFile(int i, String str, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatcher.FileState) ipChange.ipc$dispatch("1107039e", new Object[]{new Integer(i), str, new Integer(i2)});
        }
        InstantPatcher.FileState tempDexFile = getTempDexFile(i, i2, true);
        if (tempDexFile.file == null) {
            return tempDexFile;
        }
        if (!tempDexFile.file.exists()) {
            if (!new File(str).renameTo(tempDexFile.file)) {
                FileUtils.copyInputStreamToFile(new FileInputStream(str), tempDexFile.file);
            }
            return tempDexFile;
        } else if (tempDexFile.file != null && tempDexFile.file.exists()) {
            if (FileUtils.isSameFile(tempDexFile.file, new File(str))) {
                return tempDexFile;
            }
            tempDexFile.file.delete();
            new File(str).renameTo(tempDexFile.file);
            return tempDexFile;
        } else {
            Log.e("InstantPatch", "No file to write temp dex content to");
            return tempDexFile;
        }
    }

    public static void purgeTempDexFiles(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153068dd", new Object[]{file});
            return;
        }
        havePurgedTempDexFolder = true;
        File tempDexFileFolder = getTempDexFileFolder(file);
        if (!tempDexFileFolder.isDirectory() || (listFiles = tempDexFileFolder.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                delete(file2);
            } catch (Throwable unused) {
                Log.e("InstantPatch", "Could not delete temp dex file " + file2);
            }
        }
    }

    public static void purgeOptFiles(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1daf8d4d", new Object[]{file});
        } else if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!file2.delete()) {
                    Log.e("InstantPatch", "Could not delete temp dex file " + file2);
                }
            }
        }
    }

    public static void finishUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2f2d71", new Object[]{new Boolean(z)});
        } else if (!z) {
        } else {
            swapFolders();
        }
    }

    public static File getReadFolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("89e8298c", new Object[0]);
        }
        return new File(getDataFolder(), leftIsActive() ? "left" : "right");
    }

    private static File getResourceFile(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("99f4c6ef", new Object[]{file}) : new File(file, "resources.ap_");
    }

    public static void writeAaptResources(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7bf7da", new Object[]{str, bArr});
            return;
        }
        File resourceFile = getResourceFile(getWriteFolder(false));
        File parentFile = resourceFile.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            if (!Log.isLoggable("InstantPatch", 2)) {
                return;
            }
            String str2 = "Cannot create local resource file directory " + parentFile;
        } else if (str.equals("resources.ap_")) {
            writeRawBytes(resourceFile, bArr);
        } else {
            writeRawBytes(resourceFile, bArr);
        }
    }

    public static void swapFolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84047839", new Object[0]);
        } else {
            setLeftActive(!leftIsActive());
        }
    }

    public static void purgeResourceFiles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa651a5", new Object[0]);
            return;
        }
        File file = new File(getDataFolder(), "left");
        File file2 = new File(getDataFolder(), "right");
        File file3 = new File(getDataFolder(), "active");
        if (file.exists()) {
            delete(file);
        }
        if (file2.exists()) {
            delete(file2);
        }
        if (!file3.exists()) {
            return;
        }
        delete(file3);
    }

    public static File getWriteFolder(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("7b276b37", new Object[]{new Boolean(z)});
        }
        File file = new File(getDataFolder(), leftIsActive() ? "right" : "left");
        if (z && file.exists()) {
            delete(file);
            if (!file.mkdirs()) {
                Log.e("InstantPatch", "Failed to create folder " + file);
            }
        }
        return file;
    }

    private static boolean leftIsActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3d02f02", new Object[0])).booleanValue();
        }
        File file = new File(getDataFolder(), "active");
        if (!file.exists()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            boolean equals = "left".equals(bufferedReader.readLine());
            bufferedReader.close();
            return equals;
        } catch (IOException unused) {
            return true;
        }
    }

    private static void setLeftActive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e7ac9e", new Object[]{new Boolean(z)});
            return;
        }
        File dataFolder = getDataFolder();
        File file = new File(dataFolder, "active");
        if (file.exists()) {
            if (!file.delete()) {
                Log.e("InstantPatch", "Failed to delete file " + file);
            }
        } else if (!dataFolder.exists()) {
            if (dataFolder.mkdirs()) {
                return;
            }
            Log.e("InstantPatch", "Failed to create directory " + dataFolder);
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
            bufferedWriter.write(z ? "left" : "right");
            bufferedWriter.close();
        } catch (IOException unused) {
        }
    }
}
