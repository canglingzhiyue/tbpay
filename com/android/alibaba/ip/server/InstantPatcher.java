package com.android.alibaba.ip.server;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.common.IPatchVerifier;
import com.android.alibaba.ip.common.PatchClassHolder;
import com.android.alibaba.ip.common.PatchInfo;
import com.android.alibaba.ip.common.PatchResult;
import com.android.alibaba.ip.runtime.ApplicationPatch;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.runtime.PatchesLoader;
import com.android.alibaba.ip.utils.PreferencesUtils;
import com.android.alibaba.ip.utils.ThreadUtils;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes.dex */
public class InstantPatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSES_DEX = "classes.dex";
    public static final int HAS_PATCHED = 1;
    private static final String INSTANT_BASE_VERSION = "instant_base_Version";
    private static final String INSTANT_DISABLED_CLAZZES = "instant_disabled_clazzes";
    private static final String INSTANT_PATCH_HAS_RESOUECE = "instant_patch_has_resource";
    private static final String INSTANT_PATCH_HAS_SYSTERM_CALL = "instant_patch_has_system_call";
    private static final String INSTANT_PATCH_PRIORITY = "instant_patch_priority";
    private static final String INSTANT_PATCH_VERSION = "instant_patch_version";
    public static final int NO_DEX_AND_RES = 4;
    public static final int PATCH_FAILED = 3;
    private static final String PATCH_INFO_FILE_NAME = "instant_patch";
    public static final int PATCH_MODIFIED = 2;
    public static final int PATCH_NOT_MATCH = 5;
    public static final int PATCH_RES_FAILED = 6;
    public static final int PATCH_SUCCESS = 0;
    public static final String RES_PATCH = "resources.ap_";
    public static final String SYS_CALL_CLASSES_DEX = "classes2.dex";
    private static final String TAG = "InstantPatcher";
    public static volatile boolean handled;
    public static volatile boolean hasResources;
    public static volatile boolean hasSystemCall;
    private static InstantPatcher sInstantPatcher;
    private final Context context;
    private String packageName;
    private PatchesLoader.PatchLoaderListener patchLoaderListener;
    private IPatchVerifier patchVerifier;
    private PatchInfo savePatchInfo = null;
    private boolean isMainProcess = true;
    private Map<String, List<String>> mDisabledClazzes = new HashMap();

    /* loaded from: classes3.dex */
    public static class FileState {
        public boolean external;
        public File file;

        static {
            kge.a(796206218);
        }
    }

    public static /* synthetic */ PatchesLoader.PatchLoaderListener access$000(InstantPatcher instantPatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PatchesLoader.PatchLoaderListener) ipChange.ipc$dispatch("721f7c02", new Object[]{instantPatcher}) : instantPatcher.patchLoaderListener;
    }

    public static /* synthetic */ List access$100(InstantPatcher instantPatcher, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("337a6a52", new Object[]{instantPatcher, new Integer(i)}) : instantPatcher.getDisabledClazz(i);
    }

    static {
        kge.a(114653977);
        handled = false;
        sInstantPatcher = null;
        hasResources = false;
        hasSystemCall = false;
    }

    public IPatchVerifier getPatchVerifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPatchVerifier) ipChange.ipc$dispatch("a838efa4", new Object[]{this}) : this.patchVerifier;
    }

    public void setiPatchVerifier(IPatchVerifier iPatchVerifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01b8cfb", new Object[]{this, iPatchVerifier});
        } else {
            this.patchVerifier = iPatchVerifier;
        }
    }

    public void setPatchLoaderListener(PatchesLoader.PatchLoaderListener patchLoaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62fcb4d", new Object[]{this, patchLoaderListener});
        } else {
            this.patchLoaderListener = patchLoaderListener;
        }
    }

    public static InstantPatcher create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatcher) ipChange.ipc$dispatch("f4aa1a87", new Object[]{context});
        }
        if (sInstantPatcher == null) {
            sInstantPatcher = new InstantPatcher(context.getPackageName(), context);
        }
        return sInstantPatcher;
    }

    private InstantPatcher(String str, Context context) {
        this.context = context;
        this.packageName = str;
        FileManager.context = context;
    }

    public void setDisabledClazzes(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a6daa", new Object[]{this, str, list});
            return;
        }
        this.mDisabledClazzes.put(str, list);
        if (list.size() <= 0 || StringUtils.isEmpty(str)) {
            return;
        }
        PreferencesUtils.putString(this.context, PATCH_INFO_FILE_NAME, INSTANT_DISABLED_CLAZZES, JSON.toJSONString(this.mDisabledClazzes)).apply();
    }

    private static boolean isResourcePath(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a26ece72", new Object[]{str})).booleanValue() : str.equals(RES_PATCH) || str.startsWith("res/");
    }

    public void applyPatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0cd901", new Object[]{this});
            return;
        }
        final PatchInfo patchInfo = getPatchInfo();
        if (StringUtils.isEmpty(patchInfo.baseVersion)) {
            Log.e("InstantPatcher", "no patch");
            return;
        }
        final PatchResult patchResult = new PatchResult();
        try {
            if (!this.context.getPackageManager().getPackageInfo(this.packageName, 0).versionName.equals(patchInfo.baseVersion)) {
                Log.e("InstantPatcher", "patch miss match");
                if (!this.isMainProcess) {
                    return;
                }
                purge();
                return;
            }
            if (hasResources) {
                Log.e("InstantPatcher", "start patch res......");
                try {
                    MonkeyPatcher.monkeyPatchExistingResources(this.context, FileManager.getExternalResourceFile().getAbsolutePath());
                } catch (Exception e) {
                    patchResult.resCode = 6;
                    patchResult.msg = e.getMessage();
                    e.printStackTrace();
                }
            }
            try {
                final FileState tempDexFile = FileManager.getTempDexFile(0, patchInfo.patchVersion, false);
                if ((tempDexFile.file == null || !tempDexFile.file.exists()) && !hasResources) {
                    purge();
                    Log.e("InstantPatcher", "no patchFile");
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.android.alibaba.ip.server.-$$Lambda$InstantPatcher$Ae_669F1l6UqtRcnYp2_4JW0orA
                    @Override // java.lang.Runnable
                    public final void run() {
                        InstantPatcher.this.lambda$applyPatch$0$InstantPatcher(tempDexFile, patchResult, patchInfo);
                    }
                };
                if (patchInfo.priority == 0) {
                    ThreadUtils.asyncExecute(runnable);
                } else if (patchInfo.priority != 1) {
                } else {
                    ThreadUtils.syncExecute(runnable);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$applyPatch$0$InstantPatcher(FileState fileState, PatchResult patchResult, PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a40b1e", new Object[]{this, fileState, patchResult, patchInfo});
            return;
        }
        if (fileState.file != null && fileState.file.exists()) {
            handlePatch(fileState, patchResult, patchInfo.patchVersion, false);
            if (patchResult.resCode != 0) {
                Log.e("InstantPatcher", "patch failed :" + fileState.file.getPath());
            }
        }
        if (patchResult.resCode == 0) {
            if (hasSystemCall) {
                Log.e("InstantPatcher", "readSystemFile");
                FileState readSystemFileState = readSystemFileState(patchInfo);
                if (readSystemFileState.file != null && readSystemFileState.file.exists()) {
                    Log.e("InstantPatcher", "handleSystemPatch");
                    handlePatch(readSystemFileState, patchResult, patchInfo.patchVersion, false);
                }
            }
            Log.e("InstantPatcher", "patch success");
            return;
        }
        purge();
    }

    private FileState readSystemFileState(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileState) ipChange.ipc$dispatch("87625b8a", new Object[]{this, patchInfo}) : FileManager.getTempDexFile(1, patchInfo.patchVersion, false);
    }

    private void clearPatchInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59017d50", new Object[]{this});
            return;
        }
        this.savePatchInfo = null;
        PreferencesUtils.clear(this.context, PATCH_INFO_FILE_NAME).apply();
    }

    private void clearPatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d447102", new Object[]{this});
            return;
        }
        try {
            File dataFolder = FileManager.getDataFolder();
            File externalDataFolder = FileManager.getExternalDataFolder();
            File file = new File(optPathFor(this.context.getCacheDir()));
            File file2 = new File(optPathFor(this.context.getExternalCacheDir()));
            if (externalDataFolder != null) {
                FileManager.purgeTempDexFiles(externalDataFolder);
            }
            FileManager.purgeTempDexFiles(dataFolder);
            FileManager.purgeOptFiles(file);
            FileManager.purgeOptFiles(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void purge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc867b2", new Object[]{this});
            return;
        }
        clearPatchInfo();
        clearPatch();
        FileManager.purgeResourceFiles();
    }

    private static boolean hasResources(List<ApplicationPatch> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("688fb8a7", new Object[]{list})).booleanValue();
        }
        for (ApplicationPatch applicationPatch : list) {
            if (isResourcePath(applicationPatch.getPath())) {
                return true;
            }
        }
        return false;
    }

    private void handleResourcePatch(ApplicationPatch applicationPatch, String str, PatchResult patchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3c357d", new Object[]{this, applicationPatch, str, patchResult});
            return;
        }
        try {
            FileManager.startUpdate();
            FileManager.writeAaptResources(str, applicationPatch.getBytes());
            FileManager.finishUpdate(true);
            MonkeyPatcher.mergeResFile(new File(this.context.getApplicationInfo().sourceDir), FileManager.getExternalResourceFile().getAbsolutePath());
        } catch (Throwable th) {
            patchResult.resCode = 6;
            patchResult.msg = th.getMessage();
            patchResult.t = th;
        }
    }

    public PatchResult handlePatches(String str, PatchInfo patchInfo) throws IOException {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchResult) ipChange.ipc$dispatch("4d3e7e52", new Object[]{this, str, patchInfo});
        }
        ZipFile zipFile2 = null;
        PatchResult patchResult = new PatchResult();
        try {
            if (hasPatched(patchInfo)) {
                patchResult.resCode = 1;
                return patchResult;
            }
            try {
                handled = true;
            } catch (Exception e) {
                e = e;
            }
            if (StringUtils.isEmpty(str) || !new File(str).exists()) {
                handled = false;
                return patchResult;
            } else if (this.patchVerifier != null && !isApkInDebug() && !this.patchVerifier.authenticate(new File(str))) {
                patchResult.resCode = 2;
                handled = false;
                return patchResult;
            } else {
                zipFile = new ZipFile(str);
                try {
                    ZipEntry entry = zipFile.getEntry(CLASSES_DEX);
                    ZipEntry entry2 = zipFile.getEntry(RES_PATCH);
                    if (entry == null && entry2 == null) {
                        patchResult.resCode = 4;
                        handled = false;
                        zipFile.close();
                        return patchResult;
                    } else if (!authenticate(patchInfo.baseVersion)) {
                        patchResult.resCode = 5;
                        handled = false;
                        zipFile.close();
                        return patchResult;
                    } else {
                        List<ApplicationPatch> makePatch = ApplicationPatch.makePatch(str, patchInfo.patchVersion);
                        hasResources = hasResources(makePatch);
                        handlePatches(makePatch, patchResult);
                        if (patchResult.resCode == 0) {
                            savePatchInfo(patchInfo);
                            Log.e("InstantPatcher", "patch success");
                        }
                        handled = false;
                        zipFile.close();
                        return patchResult;
                    }
                } catch (Exception e2) {
                    e = e2;
                    zipFile2 = zipFile;
                    e.printStackTrace();
                    handled = false;
                    if (zipFile2 != null) {
                        zipFile2.close();
                    }
                    return patchResult;
                } catch (Throwable th) {
                    th = th;
                    handled = false;
                    if (zipFile != null) {
                        zipFile.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
    }

    public boolean hasPatched(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55867858", new Object[]{this, patchInfo})).booleanValue() : patchInfo.equals(getPatchInfo());
    }

    private void savePatchInfo(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4341ea8", new Object[]{this, patchInfo});
            return;
        }
        this.savePatchInfo = patchInfo;
        PreferencesUtils.putString(this.context, PATCH_INFO_FILE_NAME, INSTANT_BASE_VERSION, patchInfo.baseVersion).putInt(INSTANT_PATCH_VERSION, patchInfo.patchVersion).putInt(INSTANT_PATCH_PRIORITY, patchInfo.priority).putBoolean(INSTANT_PATCH_HAS_SYSTERM_CALL, hasSystemCall).putBoolean(INSTANT_PATCH_HAS_RESOUECE, hasResources).commit();
    }

    public PatchInfo getPatchInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("7b4e3bdf", new Object[]{this});
        }
        if (this.savePatchInfo == null) {
            this.savePatchInfo = new PatchInfo();
            this.savePatchInfo.baseVersion = PreferencesUtils.getString(this.context, PATCH_INFO_FILE_NAME, INSTANT_BASE_VERSION, "");
            this.savePatchInfo.patchVersion = PreferencesUtils.getInt(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_VERSION, 0);
            this.savePatchInfo.priority = PreferencesUtils.getInt(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_PRIORITY, 0);
            hasResources = PreferencesUtils.getBoolean(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_HAS_RESOUECE, false);
            hasSystemCall = PreferencesUtils.getBoolean(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_HAS_SYSTERM_CALL, false);
        }
        return this.savePatchInfo;
    }

    private void handlePatches(List<ApplicationPatch> list, PatchResult patchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a212593", new Object[]{this, list, patchResult});
            return;
        }
        for (ApplicationPatch applicationPatch : list) {
            if (isResourcePath(applicationPatch.path)) {
                handleResourcePatch(applicationPatch, applicationPatch.getPath(), patchResult);
                if (patchResult.resCode != 0) {
                    FileManager.purgeResourceFiles();
                    return;
                }
            } else if (isNormalPatch(applicationPatch)) {
                handleHotSwapPatch(patchResult, applicationPatch);
                if (patchResult.resCode != 0) {
                    purge();
                    return;
                }
            } else if (isSysCallPatch(applicationPatch)) {
                handleSystemClassPatch(patchResult, applicationPatch);
                patchResult.resCode = 0;
            }
        }
    }

    private boolean isSysCallPatch(ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48fcc961", new Object[]{this, applicationPatch})).booleanValue();
        }
        if (applicationPatch.mChange == 1) {
            z = true;
        }
        if (z) {
            hasSystemCall = true;
        }
        return z;
    }

    private boolean isNormalPatch(ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62fb45d1", new Object[]{this, applicationPatch})).booleanValue() : applicationPatch.mChange == 0;
    }

    private void handleHotSwapPatch(PatchResult patchResult, ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113059c9", new Object[]{this, patchResult, applicationPatch});
            return;
        }
        try {
            FileState writeTempDexFile = FileManager.writeTempDexFile(applicationPatch.getChange(), applicationPatch.getPath(), applicationPatch.getPatchVersion());
            if (writeTempDexFile.file == null) {
                patchResult.resCode = 3;
                patchResult.msg = "mkdir failed";
                Log.e("InstantPatcher", "mkdir failed");
                return;
            }
            handlePatch(writeTempDexFile, patchResult, applicationPatch.patchVersion, true);
        } catch (Exception e) {
            e.printStackTrace();
            patchResult.resCode = 3;
            patchResult.msg = "write dex failed";
            patchResult.t = e;
        }
    }

    private void handleSystemClassPatch(PatchResult patchResult, ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f436be60", new Object[]{this, patchResult, applicationPatch});
            return;
        }
        try {
            FileState writeSystemTempDexFile = FileManager.writeSystemTempDexFile(applicationPatch.getChange(), applicationPatch.getBytes(), applicationPatch.getPatchVersion());
            if (writeSystemTempDexFile.file != null && writeSystemTempDexFile.file.exists() && isValid(writeSystemTempDexFile.file)) {
                handlePatch(writeSystemTempDexFile, patchResult, applicationPatch.patchVersion, true);
                return;
            }
            patchResult.resCode = 3;
            patchResult.msg = "mkdir failed";
            Log.e("InstantPatcher", "mkdir failed");
        } catch (Exception e) {
            e.printStackTrace();
            patchResult.resCode = 3;
            patchResult.msg = "write dex failed";
            patchResult.t = e;
        }
    }

    private boolean isValid(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97573a34", new Object[]{this, file})).booleanValue();
        }
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                try {
                    if (zipFile2.getEntry(CLASSES_DEX) == null) {
                        z = false;
                    }
                    try {
                        zipFile2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return z;
                } catch (Exception e2) {
                    e = e2;
                    zipFile = zipFile2;
                    e.printStackTrace();
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    private void handlePatch(FileState fileState, PatchResult patchResult, final int i, boolean z) {
        String optPathFor;
        try {
            String path = FileManager.getNativeLibraryFolder().getPath();
            if (!fileState.external) {
                optPathFor = optPathFor(this.context.getCacheDir());
            } else {
                optPathFor = optPathFor(this.context.getExternalCacheDir());
            }
            DexClassLoader dexClassLoader = new DexClassLoader(fileState.file.getPath(), optPathFor, path, getClass().getClassLoader());
            if (hasResources && handled) {
                Log.e("InstantPatcher", "patch class need restart because has resouce patch ");
                return;
            }
            try {
                Class<?> cls = Class.forName("com.android.alibaba.ip.runtime.AppPatchesLoaderImpl", true, dexClassLoader);
                Log.e("InstantPatcher", "Got the patcher class " + cls);
                PatchesLoader patchesLoader = (PatchesLoader) cls.newInstance();
                Log.e("InstantPatcher", "Got the patcher instance " + patchesLoader);
                patchesLoader.addClassLoadListener(new PatchesLoader.ClassLoaderListener() { // from class: com.android.alibaba.ip.server.InstantPatcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.android.alibaba.ip.runtime.PatchesLoader.ClassLoaderListener
                    public boolean onPrePareLoad(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("f7f40363", new Object[]{this, str})).booleanValue();
                        }
                        if (InstantPatcher.access$000(InstantPatcher.this) != null) {
                            InstantPatcher.access$000(InstantPatcher.this).onPrePareLoad(str);
                        }
                        List access$100 = InstantPatcher.access$100(InstantPatcher.this, i);
                        return access$100 == null || !access$100.contains(str);
                    }

                    @Override // com.android.alibaba.ip.runtime.PatchesLoader.ClassLoaderListener
                    public void onLoadResult(String str, boolean z2, Throwable th) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("60f8de54", new Object[]{this, str, new Boolean(z2), th});
                            return;
                        }
                        if (InstantPatcher.access$000(InstantPatcher.this) != null) {
                            InstantPatcher.access$000(InstantPatcher.this).onLoadResult(str, z2, th);
                        }
                        if (z2) {
                            return;
                        }
                        th.printStackTrace();
                    }
                });
                Log.e("InstantPatcher", "Got the list of classes ");
                Iterator it = ((List) cls.getDeclaredMethod("getPatchedClasses", new Class[0]).invoke(patchesLoader, new Object[0])).iterator();
                while (it.hasNext()) {
                    Log.e("InstantPatcher", "class " + ((PatchClassHolder) it.next()).className);
                }
                if (!patchesLoader.load()) {
                    if (this.patchLoaderListener != null) {
                        this.patchLoaderListener.onLoadAllFinish(false);
                    }
                    patchResult.resCode = 3;
                    patchResult.msg = "exception to apply changes load";
                } else if (this.patchLoaderListener == null) {
                } else {
                    this.patchLoaderListener.onLoadAllFinish(true);
                }
            } catch (Exception e) {
                if (!(e instanceof ClassNotFoundException) || StringUtils.isEmpty(e.getMessage()) || !e.getMessage().contains("com.android.alibaba.ip.runtime.AppPatchesLoaderImpl")) {
                    return;
                }
                Log.e("InstantPatcher", "add system class from ApkLoader");
                if (z && this.savePatchInfo != null && i <= this.savePatchInfo.getPatchVersion()) {
                    Log.e("InstantPatcher", "rollback version < effective version");
                    return;
                }
                Log.e("InstantPatcher", "Couldn't apply code changes", e);
                e.printStackTrace();
                patchResult.resCode = 3;
                patchResult.msg = "exception to apply changes " + e.getMessage();
                patchResult.t = e;
            }
        } catch (Throwable th) {
            Log.e("InstantPatcher", "Couldn't apply code changes", th);
            patchResult.resCode = 3;
            patchResult.msg = "dexopt failed or loadclass Failed";
            patchResult.t = th;
        }
    }

    private List<String> getDisabledClazz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9dd399f1", new Object[]{this, new Integer(i)});
        }
        if (this.mDisabledClazzes.containsKey(String.valueOf(i)) || handled) {
            return this.mDisabledClazzes.get(String.valueOf(i));
        }
        String string = PreferencesUtils.getString(this.context, PATCH_INFO_FILE_NAME, INSTANT_DISABLED_CLAZZES);
        if (StringUtils.isEmpty(string)) {
            return new ArrayList();
        }
        this.mDisabledClazzes = (Map) JSON.parseObject(string, Map.class);
        return this.mDisabledClazzes.get(String.valueOf(i));
    }

    private String optPathFor(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffa590d1", new Object[]{this, file});
        }
        File file2 = new File(file, "instant-opt");
        file2.mkdirs();
        return file2.getPath();
    }

    private boolean authenticate(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0f563aa", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return this.context.getPackageManager().getPackageInfo(this.packageName, 0).versionName.equals(str);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    public boolean isMainProcess(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{this, context})).booleanValue();
        }
        if (context != null) {
            try {
                int myPid = Process.myPid();
                Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (context.getPackageName().equals(next.processName)) {
                        if (next.pid == myPid) {
                            this.isMainProcess = true;
                            z = true;
                            break;
                        }
                        z = true;
                    }
                }
                if (!this.isMainProcess && !z) {
                    this.isMainProcess = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.isMainProcess;
    }

    public boolean isApkInDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a49c51c7", new Object[]{this})).booleanValue() : (this.context.getApplicationInfo().flags & 2) != 0;
    }
}
