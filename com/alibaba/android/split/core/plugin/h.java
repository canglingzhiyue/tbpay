package com.alibaba.android.split.core.plugin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import com.alibaba.android.split.core.internal.FieldObjectHolder;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.alibaba.android.split.p;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import tb.bgu;
import tb.bib;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static h f2444a;
    private Resources b;
    private Method e;
    private Method f;
    private ArrayMap g;
    private Field h;
    private Method i;
    private Object d = new Object();
    private bgu c = (bgu) com.alibaba.android.split.a.b(bgu.class, "ResourceManager");

    static {
        kge.a(956127261);
    }

    private h() {
        this.g = null;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                this.f = AssetManager.class.getDeclaredMethod("getStringBlockCount", new Class[0]);
                this.f.setAccessible(true);
                this.e = AssetManager.class.getDeclaredMethod("getCookieName", Integer.TYPE);
            }
            if (Build.VERSION.SDK_INT > 23) {
                Method declaredMethod = Class.forName("android.app.ResourcesManager").getDeclaredMethod("getInstance", new Class[0]);
                declaredMethod.setAccessible(true);
                this.g = (ArrayMap) ObjectInvoker.create(declaredMethod.invoke(null, new Object[0]), "mResourceImpls", ArrayMap.class).getObject();
                this.h = Class.forName("android.content.res.ResourcesImpl").getDeclaredField("mAssets");
                this.h.setAccessible(true);
            }
            this.i = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            this.i.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("85c585f3", new Object[0]);
        }
        if (f2444a == null) {
            synchronized (h.class) {
                if (f2444a == null) {
                    f2444a = new h();
                }
            }
        }
        return f2444a;
    }

    public void a(Context context, File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5b45d7", new Object[]{this, context, file});
        } else {
            this.b = i.a(context, file);
        }
    }

    public Resources a(Context context, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("2560e1bb", new Object[]{this, context, str});
        }
        if (Build.VERSION.SDK_INT < 26 && a(context.getAssets(), str)) {
            return context.getResources();
        }
        if (Build.VERSION.SDK_INT > 23) {
            b(context.getAssets(), str);
            this.b = context.getResources();
            return this.b;
        }
        if (this.b != null && p.a().a().size() < 2) {
            try {
                if (context instanceof ContextWrapper) {
                    Reflector.a(((ContextWrapper) context).getBaseContext()).b("mResources").e(this.b);
                } else {
                    Reflector.a(context).b("mResources").e(this.b);
                }
            } catch (Reflector.ReflectedException e) {
                e.printStackTrace();
                throw e;
            }
        } else {
            a(context, new File(str));
        }
        return this.b;
    }

    public String a(AssetManager assetManager, int i) throws IllegalAccessException {
        try {
            return this.e != null ? (String) this.e.invoke(assetManager, Integer.valueOf(i)) : "";
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean a(AssetManager assetManager, String str) {
        try {
            if (this.f != null) {
                int intValue = ((Integer) this.f.invoke(assetManager, new Object[0])).intValue();
                int i = 0;
                while (i < intValue) {
                    i++;
                    if (a(assetManager, i).equals(str)) {
                        bgu bguVar = this.c;
                        bguVar.d("assetsManager:" + assetManager + "containsFeaturePath:" + str, new Object[0]);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public int b(AssetManager assetManager, String str) {
        int i = 0;
        int i2 = 0;
        while (i == 0 && i2 < 3) {
            i2++;
            try {
                i = ((Integer) this.i.invoke(assetManager, str)).intValue();
            } catch (Exception unused) {
            }
        }
        if (i != 0) {
            return i;
        }
        bgu bguVar = this.c;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("addAssetPath failed with cookie:");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" with apk:");
        sb.append(str);
        sb.append(" size:");
        sb.append(new File(str).length());
        sb.append(" md5:");
        sb.append(bib.a(new File(str)));
        bguVar.d(sb.toString(), new Object[0]);
        throw new RuntimeException("can not addAssetPath:" + str);
    }

    public void a(String[] strArr, Context context) throws Exception {
        Object loadedApk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a167f1", new Object[]{this, strArr, context});
        } else if (v.n(context) || (loadedApk = InternalHacker.getLoadedApk(InternalHacker.getActivityThread(context), context.getPackageName())) == null) {
        } else {
            ObjectInvoker.create(loadedApk, "mSplitResDirs", String[].class).setObject(strArr);
        }
    }

    public static String[] a(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("cbe95d7", new Object[]{strArr, strArr2});
        }
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = (String[]) Array.newInstance(String.class, strArr.length + strArr2.length);
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static String[] b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("7e5598e5", new Object[]{strArr});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            linkedHashSet.add(str);
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    public void a(String[] strArr) throws Exception {
        if (this.g == null) {
            return;
        }
        synchronized (this.d) {
            for (int i = 0; i < this.g.size(); i++) {
                Object keyAt = this.g.keyAt(i);
                FieldObjectHolder create = ObjectInvoker.create(keyAt, "mSplitResDirs", String[].class);
                if (create.getObject() == null) {
                    create.setObject(strArr);
                } else {
                    create.setObject(b(a(strArr, (String[]) create.getObject())));
                }
                Object obj = ((WeakReference) this.g.get(keyAt)).get();
                if (obj != null) {
                    AssetManager assetManager = (AssetManager) this.h.get(obj);
                    for (String str : strArr) {
                        if (Build.VERSION.SDK_INT < 26) {
                            if (!a().a(assetManager, str)) {
                                b(assetManager, str);
                            }
                        } else {
                            b(assetManager, str);
                        }
                    }
                }
            }
        }
    }
}
