package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import com.alipay.mobile.security.bio.config.BisRuntimeInfoEnum;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.runtime.FrameworkDesc;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.service.local.dynamicrelease.DynamicReleaseService;
import com.alipay.mobile.security.bio.service.local.language.LanguageService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.bio.workspace.Env;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Runtime {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Runtime";

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f5794a = -1;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Object e;
    private static FrameworkDesc f;
    private static HashMap<String, ModuleDesc> g;
    private static Boolean h;
    public static String sGrayModelMd5;

    static {
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.framework.LauncherApplicationAgent");
            Method declaredMethod = cls.getDeclaredMethod("getmBundleContext", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            e = invoke;
            Class<?> cls2 = invoke.getClass();
            Method method = cls2.getMethod("getResourcesByBundle", String.class);
            b = method;
            method.setAccessible(true);
            Method method2 = cls2.getMethod("findClassLoaderByBundleName", String.class);
            c = method2;
            method2.setAccessible(true);
            Method declaredMethod2 = cls2.getDeclaredMethod("replaceResources", Context.class, String.class, String[].class);
            d = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Throwable th) {
            BioLog.e("Failed to reflect Quinox's Bundle APIs : " + th.getMessage());
        }
        h = null;
    }

    public static boolean isRunningOnQuinox(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9f52ddf", new Object[]{context})).booleanValue();
        }
        if (h == null) {
            synchronized ("com.alipay.mobile.quinox.LauncherApplication") {
                if (h == null) {
                    h = Boolean.valueOf("com.alipay.mobile.quinox.LauncherApplication".equals(context.getApplicationContext().getClass().getName()));
                    BioLog.d("Runtime : isOnQuinox=" + h);
                }
            }
        }
        return h.booleanValue();
    }

    public static ClassLoader getClassLoaderByBundleName(String str) {
        try {
            return (ClassLoader) c.invoke(e, str);
        } catch (Throwable th) {
            BioLog.w("Failed to reflect invoke findClassLoaderByBundleName(" + str + ") : " + th.toString());
            return null;
        }
    }

    public static Resources getResourcesByBundleName(String str) {
        try {
            return (Resources) b.invoke(e, str);
        } catch (Throwable th) {
            BioLog.w("Failed to reflect invoke getResourcesByBundle(" + str + ") : " + th.toString());
            return null;
        }
    }

    public static void replaceResources(Context context, String str, String str2) {
        BioLog.d(TAG, "replaceResources begin");
        if (d == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            d.invoke(e, context, str, new String[]{str2});
        } catch (Throwable th) {
            BioLog.w(TAG, "Failed to reflect invoke replaceResources(" + str2 + ") : " + th.toString());
        }
        BioLog.d(TAG, "replaceResources end");
    }

    public static List<BioMetaInfo> getBioMetaInfoList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4ff437d", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleDesc moduleDesc : g.values()) {
            if (moduleDesc.mBioMetaInfoList != null && !moduleDesc.mBioMetaInfoList.isEmpty()) {
                arrayList.addAll(moduleDesc.mBioMetaInfoList);
            }
        }
        return arrayList;
    }

    public static BioServiceDescription getBioServiceDescriptionByInterface(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioServiceDescription) ipChange.ipc$dispatch("1270d68e", new Object[]{context, str});
        }
        a(context, isRunningOnQuinox(context));
        return a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.alipay.mobile.security.bio.service.BioServiceDescription a(java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.security.bio.runtime.Runtime.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r5 = "1ad5b07e"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.alipay.mobile.security.bio.service.BioServiceDescription r5 = (com.alipay.mobile.security.bio.service.BioServiceDescription) r5
            return r5
        L15:
            r0 = 0
            java.util.HashMap<java.lang.String, com.alipay.mobile.security.bio.runtime.ModuleDesc> r1 = com.alipay.mobile.security.bio.runtime.Runtime.g
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            com.alipay.mobile.security.bio.runtime.ModuleDesc r2 = (com.alipay.mobile.security.bio.runtime.ModuleDesc) r2
            java.util.List<com.alipay.mobile.security.bio.service.BioServiceDescription> r3 = r2.mBioServiceDescription
            if (r3 == 0) goto L55
            java.util.List<com.alipay.mobile.security.bio.service.BioServiceDescription> r3 = r2.mBioServiceDescription
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L55
            java.util.List<com.alipay.mobile.security.bio.service.BioServiceDescription> r2 = r2.mBioServiceDescription
            java.util.Iterator r2 = r2.iterator()
        L3e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()
            com.alipay.mobile.security.bio.service.BioServiceDescription r3 = (com.alipay.mobile.security.bio.service.BioServiceDescription) r3
            java.lang.String r4 = r3.getInterfaceName()
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto L3e
            r0 = r3
        L55:
            if (r0 == 0) goto L20
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.runtime.Runtime.a(java.lang.String):com.alipay.mobile.security.bio.service.BioServiceDescription");
    }

    public static void getLocalService(Context context, HashMap<String, LocalService> hashMap, HashMap<String, BioServiceDescription> hashMap2) {
        a(context, isRunningOnQuinox(context));
        ArrayList<BioServiceDescription> arrayList = new ArrayList();
        for (ModuleDesc moduleDesc : g.values()) {
            if (moduleDesc.mBioServiceDescription != null && !moduleDesc.mBioServiceDescription.isEmpty()) {
                arrayList.addAll(moduleDesc.mBioServiceDescription);
            }
        }
        for (BioServiceDescription bioServiceDescription : arrayList) {
            if (bioServiceDescription.isLazy()) {
                if (hashMap2 != null) {
                    hashMap2.put(bioServiceDescription.getInterfaceName(), bioServiceDescription);
                }
            } else if (hashMap != null) {
                try {
                    hashMap.put(bioServiceDescription.getInterfaceName(), (LocalService) bioServiceDescription.getClazz().newInstance());
                } catch (Throwable th) {
                    BioLog.e(th);
                }
            }
        }
    }

    public static Class<?> loadClass(Context context, boolean z, String str, String str2) {
        ClassLoader classLoader;
        ClassLoader classLoaderByBundleName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("59267fc6", new Object[]{context, new Boolean(z), str, str2});
        }
        Class<?> cls = null;
        HashSet hashSet = new HashSet();
        if (z && (classLoaderByBundleName = getClassLoaderByBundleName(str2)) != null) {
            try {
                cls = classLoaderByBundleName.loadClass(str);
            } catch (ClassNotFoundException unused) {
                hashSet.add(classLoaderByBundleName);
                BioLog.w("Failed to loadClass(" + str + ") by " + classLoaderByBundleName);
            }
        }
        if (cls == null) {
            ClassLoader classLoader2 = Runtime.class.getClassLoader();
            if (!hashSet.contains(classLoader2)) {
                try {
                    cls = Class.forName(str);
                } catch (ClassNotFoundException unused2) {
                    hashSet.add(classLoader2);
                    BioLog.w("Failed to loadClass(" + str + ") by " + classLoader2);
                }
            }
        }
        if (cls != null || context == null || (classLoader = context.getClassLoader()) == null || hashSet.contains(classLoader)) {
            return cls;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused3) {
            BioLog.w("Failed to loadClass(" + str + ") by " + classLoader);
            return cls;
        }
    }

    public static String getFrameworkVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d33aa0f", new Object[]{context});
        }
        String a2 = a(context, f.frameworkVersion, getBioMetaInfoList());
        BioLog.w("frameworkVersion=" + a2);
        return a2;
    }

    public static String getMetaInfos(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfb26952", new Object[]{context, map});
        }
        if (context == null) {
            throw new BioIllegalArgumentException("Context is null");
        }
        boolean isRunningOnQuinox = isRunningOnQuinox(context);
        a(context, isRunningOnQuinox);
        List<BioMetaInfo> bioMetaInfoList = getBioMetaInfoList();
        String str = a(context, f.frameworkVersion, bioMetaInfoList) + ":" + a(context, bioMetaInfoList) + "," + a(context, bioMetaInfoList, isRunningOnQuinox, map) + ",," + b(context);
        BioLog.i("MetaInfo:" + str);
        int status = BioResManager.getInstance().getStatus();
        if (status != 5 || status != 3 || status != -1) {
            a(context.getApplicationContext());
        }
        return str;
    }

    public static boolean checkBioResWhenUpdate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867a79a2", new Object[]{context})).booleanValue();
        }
        if (f5794a == 1) {
            return true;
        }
        try {
            BioRuntimeDependency cacheBioRuntimeDependency = BioResManager.getCacheBioRuntimeDependency(context);
            if (cacheBioRuntimeDependency == null) {
                return true;
            }
            String resVersion = cacheBioRuntimeDependency.getResVersion();
            if (TextUtils.isEmpty(resVersion)) {
                return true;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("bioResKey", 0);
            if (resVersion.equals(sharedPreferences.getString("bio_res_version", ""))) {
                f5794a = 1;
                return true;
            }
            int init = BioResManager.getInstance().init(context, cacheBioRuntimeDependency, null);
            if (init != -1 && init != 0 && init != 1) {
                if (init == 3 || init == 4 || init == 5) {
                    sharedPreferences.edit().putString("bio_res_version", resVersion).apply();
                    f5794a = 1;
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!isNeedtoDownload()) {
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.alipay.mobile.security.bio.runtime.Runtime.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BioRuntimeDependency bioRuntimeDependency = BioResManager.getBioRuntimeDependency(context);
                        if (bioRuntimeDependency == null || BioResManager.getInstance().init(context, bioRuntimeDependency, null) != 1) {
                            return;
                        }
                        BioResManager.getInstance().startDownload();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static synchronized void a(Context context, boolean z) {
        synchronized (Runtime.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
                return;
            }
            if (f == null) {
                f = FrameworkDesc.create(context);
            }
            HashSet<String> hashSet = new HashSet();
            if (g == null) {
                g = new HashMap<>(f.configs.size());
                for (FrameworkDesc.ConfigDesc configDesc : f.configs) {
                    ModuleDesc create = ModuleDesc.create(context, z, configDesc);
                    BioLog.i("load : configDesc=" + configDesc + ", moduleDesc=" + create);
                    if (z) {
                        if (configDesc.dev) {
                            if (configDesc.dynamic) {
                                if (create == null) {
                                    BioLog.w("No need to trigger dynamicrelease a dev bundle: " + configDesc);
                                } else {
                                    g.put(configDesc.configFileName, create);
                                }
                            } else if (create == null) {
                                BioLog.w("There is a static dev bundle can't be found: " + configDesc);
                            } else {
                                g.put(configDesc.configFileName, create);
                            }
                        } else if (configDesc.dynamic) {
                            if (create == null) {
                                hashSet.add(configDesc.bundleName);
                            } else {
                                g.put(configDesc.configFileName, create);
                            }
                        } else if (create == null) {
                            throw new RuntimeException("There is a static bundle can't be found: " + configDesc);
                        } else {
                            g.put(configDesc.configFileName, create);
                        }
                    } else if (configDesc.dev) {
                        throw new RuntimeException("On no-quinox, there is a dev bundle: " + configDesc);
                    } else if (configDesc.dynamic) {
                        throw new RuntimeException("On no-quinox, there is a dynamic bundle: " + configDesc);
                    } else if (create == null) {
                        throw new RuntimeException("There is a static bundle can't be found: " + configDesc);
                    } else {
                        g.put(configDesc.configFileName, create);
                    }
                }
            } else if (z) {
                for (FrameworkDesc.ConfigDesc configDesc2 : f.configs) {
                    if (configDesc2.dynamic) {
                        ModuleDesc create2 = ModuleDesc.create(context, true, configDesc2);
                        BioLog.i("reload : configDesc=" + configDesc2 + ", moduleDesc=" + create2);
                        if (create2 == null) {
                            hashSet.add(configDesc2.bundleName);
                        } else {
                            g.put(configDesc2.configFileName, create2);
                        }
                    }
                }
            }
            if (z) {
                DynamicReleaseService dynamicReleaseService = (DynamicReleaseService) BioServiceManager.getLocalService(context, a(DynamicReleaseService.class.getName()));
                if (dynamicReleaseService != null) {
                    for (FrameworkDesc.ConfigDesc configDesc3 : f.configs) {
                        if (configDesc3.dynamic) {
                            dynamicReleaseService.monitorCoverage(configDesc3.bundleName, null);
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    BioLog.w("Not exist bundle names: " + StringUtil.collection2String(hashSet));
                    if (dynamicReleaseService == null) {
                        BioLog.e("Failed to get DynamicReleaseService, doesn't find it.");
                        return;
                    }
                    for (String str : hashSet) {
                        dynamicReleaseService.trigDynamicRelease(context, str);
                    }
                }
            }
        }
    }

    private static String a(Context context, String str, List<BioMetaInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4a97ee5", new Object[]{context, str, list});
        }
        if (list == null || list.isEmpty()) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(".") + 1;
        int parseInt = Integer.parseInt(str.substring(lastIndexOf));
        for (BioMetaInfo bioMetaInfo : list) {
            String revision = bioMetaInfo.getRevision(context);
            if (!TextUtils.isEmpty(revision)) {
                parseInt += Integer.parseInt(revision.replace(".", ""));
            }
        }
        return str.substring(0, lastIndexOf) + parseInt;
    }

    private static String a(Context context, List<BioMetaInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b136f6f", new Object[]{context, list});
        }
        long j = 0;
        for (BioMetaInfo bioMetaInfo : list) {
            List<Long> productIDs = bioMetaInfo.getProductIDs();
            if (productIDs != null && !productIDs.isEmpty()) {
                for (Long l : productIDs) {
                    j = (long) (j + Math.pow(2.0d, l.longValue()));
                }
            }
            List<Long> productIDs2 = bioMetaInfo.getProductIDs(context);
            if (productIDs2 != null && !productIDs2.isEmpty()) {
                for (Long l2 : productIDs2) {
                    j = (long) (j + Math.pow(2.0d, l2.longValue()));
                }
            }
            List<BioAppDescription> applications = bioMetaInfo.getApplications();
            if (applications != null && !applications.isEmpty()) {
                for (BioAppDescription bioAppDescription : applications) {
                    long productID = bioAppDescription.getProductID();
                    if (-1 != productID) {
                        j = (long) (j + Math.pow(2.0d, productID));
                    }
                }
            }
        }
        return "" + j;
    }

    private static String a(Context context, List<BioMetaInfo> list, boolean z, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da4535e", new Object[]{context, list, new Boolean(z), map});
        }
        if (1 != Env.getProtocolFormat(context)) {
            i = (int) (0 + Math.pow(2.0d, BisRuntimeInfoEnum.PROTOCOL_FORMAT.getProductID()));
        }
        int currentLanguage = i + (new LanguageService().getCurrentLanguage() << 2);
        for (BioMetaInfo bioMetaInfo : list) {
            List<Integer> runtimeInfoIDs = bioMetaInfo.getRuntimeInfoIDs(context, map);
            if (runtimeInfoIDs != null && !runtimeInfoIDs.isEmpty()) {
                for (Integer num : runtimeInfoIDs) {
                    currentLanguage = (int) (currentLanguage + Math.pow(2.0d, num.intValue()));
                }
            }
        }
        return "" + ((int) (currentLanguage + Math.pow(2.0d, BisRuntimeInfoEnum.PROTOCOL_THIN.getProductID())));
    }

    private static String b(Context context) {
        File[] listFiles;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (sGrayModelMd5 == null) {
            sGrayModelMd5 = "";
            File file2 = new File(context.getApplicationContext().getFilesDir() + "/graymodle");
            if (file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length > 0 && (file = listFiles[0]) != null) {
                sGrayModelMd5 = file.getName().substring(0, 6);
            }
        }
        return sGrayModelMd5;
    }

    public static boolean startActivity(Intent intent) {
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.framework.LauncherApplicationAgent");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("getMicroApplicationContext", new Class[0]);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(invoke, new Object[0]);
            Method method3 = invoke2.getClass().getMethod("getTopApplication", new Class[0]);
            method3.setAccessible(true);
            Object invoke3 = method3.invoke(invoke2, new Object[0]);
            Method method4 = invoke2.getClass().getMethod("startExtActivity", Class.forName("com.alipay.mobile.framework.app.MicroApplication"), Intent.class);
            method4.setAccessible(true);
            method4.invoke(invoke2, invoke3, intent);
            return true;
        } catch (Throwable th) {
            BioLog.w(th);
            return false;
        }
    }

    public static boolean isNeedtoDownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43c7a80e", new Object[0])).booleanValue();
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_alipay_facepay");
        if (configs != null && !configs.isEmpty()) {
            BioLog.i(TAG, "Get Configure from orange: " + configs.toString());
            String str = configs.get("download");
            if (str != null && str.equals("enable")) {
                return true;
            }
        }
        BioLog.e(TAG, "Failed to get orange remote config");
        return false;
    }
}
