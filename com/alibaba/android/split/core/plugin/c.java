package com.alibaba.android.split.core.plugin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.alibaba.android.split.core.plugin.fake.FakeReceiver;
import com.alibaba.android.split.core.plugin.fake.FakeService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.PathClassLoader;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends PathClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<String> b;
    private static final List<String> c;

    /* renamed from: a  reason: collision with root package name */
    private Context f2440a;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 2052165949) {
            return super.findClass((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(799913528);
        b = Arrays.asList("com.taobao.agoo.AgooCommondReceiver", "com.taobao.accs.EventReceiver");
        c = Arrays.asList("com.taobao.weex.WXActivity");
    }

    public c(Context context, String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
        this.f2440a = context;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        if (b(str)) {
            Log.e("InjectClassLoader", str + " is not found, so launcher activity instead!");
            return Class.forName(this.f2440a.getPackageManager().getLaunchIntentForPackage(this.f2440a.getPackageName()).getComponent().getClassName());
        } else if (a(str)) {
            Log.e("InjectClassLoader", str + " is not found, so FakeReceiver instead!");
            return FakeReceiver.class;
        } else if (c(str)) {
            Log.e("InjectClassLoader", str + " is not found, so fakeService instead!");
            return FakeService.class;
        } else {
            return super.findClass(str);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (b.contains(str)) {
            return true;
        }
        List<ResolveInfo> queryBroadcastReceivers = this.f2440a.getPackageManager().queryBroadcastReceivers(new Intent().setComponent(new ComponentName(this.f2440a, str)), 131072);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (c.contains(str)) {
            return true;
        }
        List<ResolveInfo> queryIntentActivities = this.f2440a.getPackageManager().queryIntentActivities(new Intent().setComponent(new ComponentName(this.f2440a, str)), 131072);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        List<ResolveInfo> queryIntentServices = this.f2440a.getPackageManager().queryIntentServices(new Intent().setComponent(new ComponentName(this.f2440a, str)), 131072);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }
}
