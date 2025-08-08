package com.alibaba.flexa.compat;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.s;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bgg;
import tb.bhb;
import tb.lsk;

/* loaded from: classes2.dex */
public abstract class FlexaApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> sActivityMap;
    private Object activityThread;
    private Field allApplications_field;
    private Class clazzStyle;
    private Field instruction_field;
    public com.alibaba.flexa.compat.a mApplicationCompat;
    private Context mBase;
    private Application pluginApplication;
    public boolean pluginInstalled;
    private bhb timing = new bhb(FlexaApplication.class.getSimpleName());

    public static /* synthetic */ Object ipc$super(FlexaApplication flexaApplication, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    public abstract void disableComponentsAfterInstalled(Context context);

    public abstract void enableComponentsAfterInstalled(Context context);

    public abstract void enableComponentsBeforeInstalled(Context context);

    public abstract String getPluginAppliactionClassName();

    public abstract String getPluginLauncherClassName();

    public String getPluginVersionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ceb6e19f", new Object[]{this}) : "10.4.0";
    }

    public abstract String getTheme(String str);

    public abstract boolean shouldDownGradeAfterInstalled();

    public abstract boolean shouldRollBackAfterInstalled();

    public static /* synthetic */ Context access$200(FlexaApplication flexaApplication) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d9017313", new Object[]{flexaApplication}) : flexaApplication.mBase;
    }

    public static /* synthetic */ String access$300(FlexaApplication flexaApplication, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5826492", new Object[]{flexaApplication, context}) : flexaApplication.getLauncherClassName(context);
    }

    public static /* synthetic */ Map access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("fb521370", new Object[0]) : sActivityMap;
    }

    public static /* synthetic */ String access$500(FlexaApplication flexaApplication, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5c07d9e", new Object[]{flexaApplication, str}) : flexaApplication.getRealActivityNameBeforeInstall(str);
    }

    public static /* synthetic */ Class access$600(FlexaApplication flexaApplication) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("26b81044", new Object[]{flexaApplication}) : flexaApplication.clazzStyle;
    }

    static {
        HashMap hashMap = new HashMap();
        sActivityMap = hashMap;
        hashMap.put("com.taobao.base.h5.BrowserActivity", "com.taobao.browser.BrowserActivity");
        sActivityMap.put("com.taobao.taobao.MiniActivity", lsk.BIZ_NAME);
        sActivityMap.put("com.taobao.minisearch.searchdoor.SearchDoorActivity", "com.taobao.search.searchdoor.SearchDoorActivity");
        sActivityMap.put("com.taobao.minisearch.searchresult.SearchResultActivity", "com.taobao.search.sf.MainSearchResultActivity");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        this.timing.a(i.b.MEASURE_ONCREATE);
        if (this.pluginInstalled) {
            try {
                ClassLoader classLoader = getClassLoader();
                this.clazzStyle = classLoader.loadClass(getPackageName() + ".R$style");
                this.pluginApplication = (Application) getClassLoader().loadClass(getPluginAppliactionClassName()).newInstance();
                Method declaredMethod = Class.forName("android.app.ContextImpl").getDeclaredMethod("setOuterContext", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(getBaseContext(), this.pluginApplication);
                this.timing.a("initApplication");
                InternalHacker.initApplication(this.pluginApplication, getPackageName());
                this.timing.a();
                List list = (List) this.allApplications_field.get(this.activityThread);
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (list.get(i) == this) {
                        list.set(i, this.pluginApplication);
                        break;
                    } else {
                        i++;
                    }
                }
                Method declaredMethod2 = Application.class.getDeclaredMethod(Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class);
                declaredMethod2.setAccessible(true);
                this.timing.a("pluginApplication-attach");
                declaredMethod2.invoke(this.pluginApplication, getBaseContext());
                this.timing.a();
                this.timing.a("installProviders");
                InternalHacker.installProviders(this.pluginApplication);
                this.timing.a();
                this.timing.a("pluginApplication-onCreate");
                this.pluginApplication.onCreate();
                this.timing.a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.timing.a();
        this.timing.b();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.timing.a("attachBaseContext");
        this.mBase = context;
        try {
            this.instruction_field = InternalHacker.getInstrumentationField();
            this.allApplications_field = InternalHacker.getAllApplicationField();
            this.activityThread = InternalHacker.getActivityThread(context);
            this.instruction_field.set(this.activityThread, new SafelyInstrumention());
            boolean z = true;
            boolean z2 = false;
            this.mApplicationCompat = (com.alibaba.flexa.compat.a) Class.forName(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("COMPAT_APPLICATION")).getDeclaredConstructor(Application.class).newInstance(this);
            initFlexa(context);
            if (isEmulated() && j.c(this.mBase)) {
                z2 = shouldDownGradeAfterInstalled();
                if (z2) {
                    downGrade();
                }
                if (shouldRollBackAfterInstalled()) {
                    rollBack();
                }
            }
            this.timing.a("installAppPlugin");
            if (!j.c(this.mBase)) {
                z = isMarkEnabled();
            }
            if (!z2 && z) {
                this.pluginInstalled = installAppPlugin();
            }
            this.timing.a();
            this.timing.a("other");
            if (this.pluginInstalled && j.c(this.mBase)) {
                disableComponentsAfterInstalled(context);
                enableComponentsAfterInstalled(context);
                markEnabled();
            } else if (j.c(this.mBase)) {
                enableComponentsBeforeInstalled(context);
            }
            if (this.pluginInstalled) {
                context.getApplicationInfo().nativeLibraryDir = com.alibaba.android.split.core.plugin.b.f2439a;
                InternalHacker.clearProviders(context);
                DelegatePM.sProxyVersionName = getPluginVersionName();
            } else if (j.h() != null) {
                j.h().a(this.mBase, new com.alibaba.android.split.core.plugin.c(this.mBase, ":", null, this.mBase.getClassLoader()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.timing.a();
        this.timing.a();
    }

    private void downGrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd9925c", new Object[]{this});
            return;
        }
        try {
            j.h().l();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initFlexa(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991b87c9", new Object[]{this, context});
        } else {
            b.a(context).a(new a()).a(new s() { // from class: com.alibaba.flexa.compat.FlexaApplication.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.s
                public SplitFileInfo a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (SplitFileInfo) ipChange2.ipc$dispatch("e48f8455", new Object[]{this, str});
                    }
                    if (!str.equals(j.PLUGIN_NAME)) {
                        return new SplitFileInfo();
                    }
                    SplitFileInfo splitFileInfo = new SplitFileInfo();
                    splitFileInfo.url = "https://mtl4.alibaba-inc.com/scheduler/jobs/403568/artifacts/0664fbd3a04243098493c8c8657c4916/download/600000%40taobao_android_10.2.10.99.apk";
                    splitFileInfo.md5 = "1bde5b0a93ec6c8ca97acebd888b8e51";
                    splitFileInfo.fileSize = 111589764L;
                    splitFileInfo.splitName = j.PLUGIN_NAME;
                    return splitFileInfo;
                }
            }).c(false).d(true).a();
        }
    }

    private boolean isEmulated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a19d826", new Object[]{this})).booleanValue();
        }
        try {
            return j.h().a(j.PLUGIN_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        try {
            j.h().m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isMarkEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823947b5", new Object[]{this})).booleanValue();
        }
        try {
            return j.h().j();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void markEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d63b", new Object[]{this});
        } else {
            j.h().k();
        }
    }

    public String getRealActivityNameAfterInstall(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff1393e2", new Object[]{this, str}) : sActivityMap.containsKey(str) ? sActivityMap.get(str) : str;
    }

    public boolean installAppPlugin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56384164", new Object[]{this})).booleanValue() : j.a(this);
    }

    /* loaded from: classes2.dex */
    public class a implements com.alibaba.android.split.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.split.j
        public void a(String str, boolean z, int i, long j, int i2, String str2, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fab2f75a", new Object[]{this, str, new Boolean(z), new Integer(i), new Long(j), new Integer(i2), str2, new Long(j2)});
            }
        }

        @Override // com.alibaba.android.split.j
        public void a(String str, boolean z, String str2, long j, int i, String str3, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2115146f", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, new Long(j2)});
            }
        }

        @Override // com.alibaba.android.split.j
        public void a(String str, boolean z, String str2, long j, int i, String str3, String str4, long j2, long j3, long j4, boolean z2, boolean z3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d56227a5", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, str4, new Long(j2), new Long(j3), new Long(j4), new Boolean(z2), new Boolean(z3)});
            }
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public class SafelyInstrumention extends Instrumentation {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SafelyInstrumention safelyInstrumention, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1330221517) {
                super.callActivityOnCreate((Activity) objArr[0], (Bundle) objArr[1]);
                return null;
            } else if (hashCode != -254075091) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.newActivity((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            }
        }

        private SafelyInstrumention() {
        }

        @Override // android.app.Instrumentation
        public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            if (FlexaApplication.this.pluginInstalled) {
                FlexaApplication flexaApplication = FlexaApplication.this;
                if (str.equalsIgnoreCase(FlexaApplication.access$300(flexaApplication, FlexaApplication.access$200(flexaApplication)))) {
                    intent.setComponent(new ComponentName(FlexaApplication.access$200(FlexaApplication.this).getPackageName(), FlexaApplication.this.getPluginLauncherClassName()));
                    return (Activity) classLoader.loadClass(FlexaApplication.this.getPluginLauncherClassName()).newInstance();
                } else if (!FlexaApplication.this.getRealActivityNameAfterInstall(str).equals(str)) {
                    String realActivityNameAfterInstall = FlexaApplication.this.getRealActivityNameAfterInstall(str);
                    intent.setComponent(new ComponentName(FlexaApplication.access$200(FlexaApplication.this).getPackageName(), realActivityNameAfterInstall));
                    return (Activity) classLoader.loadClass(realActivityNameAfterInstall).newInstance();
                } else {
                    return super.newActivity(classLoader, str, intent);
                }
            } else if (FlexaApplication.access$400().values().contains(str)) {
                intent.setComponent(new ComponentName(FlexaApplication.access$200(FlexaApplication.this).getPackageName(), FlexaApplication.access$500(FlexaApplication.this, str)));
                return (Activity) classLoader.loadClass(FlexaApplication.access$500(FlexaApplication.this, str)).newInstance();
            } else {
                Class<?> cls = null;
                try {
                    cls = classLoader.loadClass(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (cls == null) {
                    String packageName = FlexaApplication.access$200(FlexaApplication.this).getPackageName();
                    FlexaApplication flexaApplication2 = FlexaApplication.this;
                    intent.setComponent(new ComponentName(packageName, FlexaApplication.access$300(flexaApplication2, FlexaApplication.access$200(flexaApplication2))));
                    FlexaApplication flexaApplication3 = FlexaApplication.this;
                    return (Activity) classLoader.loadClass(FlexaApplication.access$300(flexaApplication3, FlexaApplication.access$200(flexaApplication3))).newInstance();
                }
                return (Activity) cls.newInstance();
            }
        }

        @Override // android.app.Instrumentation
        public void callActivityOnCreate(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0b66e33", new Object[]{this, activity, bundle});
                return;
            }
            if (!StringUtils.isEmpty(FlexaApplication.this.getTheme(activity.getClass().getName())) && FlexaApplication.this.pluginInstalled) {
                String theme = FlexaApplication.this.getTheme(activity.getClass().getName());
                if (!StringUtils.isEmpty(theme)) {
                    activity.setTheme(a(theme));
                }
            }
            if (FlexaApplication.this.pluginInstalled && bgg.a(FlexaApplication.access$200(FlexaApplication.this))) {
                super.callActivityOnCreate(activity, null);
            } else {
                super.callActivityOnCreate(activity, bundle);
            }
        }

        private int a(String str) {
            try {
                Field declaredField = FlexaApplication.access$600(FlexaApplication.this).getDeclaredField(str);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(null)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        @Override // android.app.Instrumentation
        public boolean onException(Object obj, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d775c06", new Object[]{this, obj, th})).booleanValue();
            }
            Log.e("SafelyInstrumention", "Throwable--------", th);
            return true;
        }
    }

    public void disableComponents(Context context, List<ComponentInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6920b4", new Object[]{this, context, list});
        } else {
            setComponentsState(list, 2);
        }
    }

    public void enableComponents(Context context, List<ComponentInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1c0bb9", new Object[]{this, context, list});
        } else {
            setComponentsState(list, 1);
        }
    }

    private void setComponentsState(List<ComponentInfo> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2aa5d2", new Object[]{this, list, new Integer(i)});
            return;
        }
        for (ComponentInfo componentInfo : list) {
            ComponentName componentName = new ComponentName(componentInfo.packageName, componentInfo.name);
            if (getPackageManager().getComponentEnabledSetting(componentName) != i) {
                getPackageManager().setComponentEnabledSetting(componentName, i, 1);
            }
        }
    }

    private String getRealActivityNameBeforeInstall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63c1b921", new Object[]{this, str});
        }
        for (Map.Entry<String, String> entry : sActivityMap.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return "";
    }

    private String getLauncherClassName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eefd3e8c", new Object[]{this, context});
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return "";
        }
        Log.e("FlexaApplication", "launcher ActivityName:" + launchIntentForPackage.getComponent().getClassName());
        return launchIntentForPackage.getComponent().getClassName();
    }
}
