package tb;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.alibaba.android.split.core.plugin.h;
import com.alibaba.android.split.k;
import com.alibaba.android.split.manager.a;
import com.alibaba.android.split.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaobaoApplication;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ovh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Object[] f32451a;
    private static Method b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 27) {
                return;
            }
            Method declaredMethod = AssetManager.class.getDeclaredMethod("getApkAssets", new Class[0]);
            b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc23b9d5", new Object[]{assetManager});
        } else if (TaobaoApplication.isMainProcess()) {
            try {
                if (Build.VERSION.SDK_INT > 27 && !b(assetManager)) {
                    return;
                }
                if (p.a() != null && p.a().a() != null) {
                    for (String str : (String[]) p.a().a().toArray(new String[0])) {
                        String absolutePath = ((a) k.a()).c().b(str).a().getAbsolutePath();
                        if (Build.VERSION.SDK_INT < 26 && h.a().a(assetManager, absolutePath)) {
                            Log.e("SplitResourceInstaller", "featurePathAdded : " + absolutePath);
                            return;
                        }
                        ((Integer) ObjectInvoker.invoke(assetManager, "addAssetPath", Integer.class, String.class, absolutePath)).intValue();
                    }
                }
                if (Build.VERSION.SDK_INT <= 27) {
                    return;
                }
                c(assetManager);
                Log.e("SplitResourceInstaller", "sApkAssets changed : " + f32451a.length);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static boolean b(AssetManager assetManager) {
        try {
            if (b != null) {
                Object[] objArr = (Object[]) b.invoke(assetManager, new Object[0]);
                if (f32451a == null) {
                    return true;
                }
                return f32451a.length != objArr.length;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    private static void c(AssetManager assetManager) {
        try {
            if (b == null) {
                return;
            }
            Object[] objArr = (Object[]) b.invoke(assetManager, new Object[0]);
            f32451a = new Object[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                f32451a[i] = objArr[i];
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
