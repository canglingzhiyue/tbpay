package com.alibaba.android.split.core.plugin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.splitcompat.FlexaResources;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1302336087);
    }

    public static synchronized Resources a(Context context, File file) throws Exception {
        synchronized (i.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("c95104a8", new Object[]{context, file});
            }
            Resources a2 = a(context, file.getAbsolutePath());
            a(context, a2);
            return a2;
        }
    }

    private static Resources a(Context context, String str) throws Exception {
        AssetManager assets;
        Resources resources = context.getResources();
        Reflector a2 = Reflector.a((Class<?>) AssetManager.class).a("addAssetPath", String.class);
        if (Build.VERSION.SDK_INT < 21) {
            assets = (AssetManager) AssetManager.class.newInstance();
            a2.c(assets);
            if (((Integer) a2.b(context.getApplicationInfo().sourceDir)).intValue() == 0) {
                throw new RuntimeException("createResources failed, can't addAssetPath for " + context.getApplicationInfo().sourceDir);
            }
        } else {
            assets = resources.getAssets();
            a2.c(assets);
        }
        int intValue = ((Integer) a2.b(str)).intValue();
        if (intValue == 0) {
            throw new RuntimeException("createResources failed, can't addAssetPath for " + str);
        }
        Log.e("ResourcesManager", "cookie2 is:" + intValue);
        if (a(resources)) {
            return b.a(resources, assets);
        }
        if (b(resources)) {
            return d.a(context, resources, assets);
        }
        if (c(resources)) {
            return c.a(resources, assets);
        }
        if (d(resources)) {
            return a.a(resources, assets);
        }
        return new FlexaResources(assets, resources.getDisplayMetrics(), resources.getConfiguration());
    }

    public static void a(Context context, Resources resources) throws Exception {
        Map map;
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Reflector a2 = Reflector.a(context);
        a2.b("mResources").e(resources);
        Reflector.a(a2.b("mPackageInfo").a()).b("mResources").e(resources);
        Object activityThread = InternalHacker.getActivityThread(context);
        new HashMap();
        if (Build.VERSION.SDK_INT >= 19) {
            Method declaredMethod = Class.forName("android.app.ResourcesManager").getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            map = (Map) Reflector.a(declaredMethod.invoke(null, new Object[0])).b("mActiveResources").a();
        } else {
            map = (Map) Reflector.a(activityThread).b("mActiveResources").a();
        }
        for (Object obj : new HashSet(map.keySet())) {
            map.put(obj, new WeakReference(resources));
        }
    }

    private static boolean a(Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a42f3fd", new Object[]{resources})).booleanValue() : resources.getClass().getName().equals("android.content.res.MiuiResources");
    }

    private static boolean b(Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee822c5c", new Object[]{resources})).booleanValue() : resources.getClass().getName().equals("android.content.res.VivoResources");
    }

    private static boolean c(Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62c164bb", new Object[]{resources})).booleanValue() : resources.getClass().getName().equals("android.content.res.NubiaResources");
    }

    private static boolean d(Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7009d1a", new Object[]{resources})).booleanValue() : !resources.getClass().getName().equals("android.content.res.Resources");
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-663279876);
        }

        public static /* synthetic */ Resources a(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("5f9667b7", new Object[]{resources, assetManager}) : b(resources, assetManager);
        }

        private static Resources b(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("18232816", new Object[]{resources, assetManager}) : (Resources) Reflector.a("android.content.res.MiuiResources").a(AssetManager.class, DisplayMetrics.class, Configuration.class).a(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1027250144);
        }

        public static /* synthetic */ Resources a(Context context, Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("e67830bf", new Object[]{context, resources, assetManager}) : b(context, resources, assetManager);
        }

        private static Resources b(Context context, Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("51694940", new Object[]{context, resources, assetManager});
            }
            Reflector a2 = Reflector.a("android.content.res.VivoResources");
            Resources resources2 = (Resources) a2.a(AssetManager.class, DisplayMetrics.class, Configuration.class).a(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            a2.a("init", String.class).a((Object) resources2, context.getPackageName());
            if (Build.VERSION.SDK_INT > 20) {
                a2.b("mThemeValues");
                a2.a(resources2, a2.d(resources));
            }
            return resources2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1405894639);
        }

        public static /* synthetic */ Resources a(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("5f9667b7", new Object[]{resources, assetManager}) : b(resources, assetManager);
        }

        private static Resources b(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("18232816", new Object[]{resources, assetManager}) : (Resources) Reflector.a("android.content.res.NubiaResources").a(AssetManager.class, DisplayMetrics.class, Configuration.class).a(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2074427673);
        }

        public static /* synthetic */ Resources a(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("5f9667b7", new Object[]{resources, assetManager}) : b(resources, assetManager);
        }

        private static Resources b(Resources resources, AssetManager assetManager) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resources) ipChange.ipc$dispatch("18232816", new Object[]{resources, assetManager});
            }
            try {
                return (Resources) Reflector.a(resources).a(AssetManager.class, DisplayMetrics.class, Configuration.class).a(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            } catch (Exception unused) {
                return new FlexaResources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            }
        }
    }
}
