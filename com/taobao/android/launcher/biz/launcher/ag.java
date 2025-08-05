package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ag extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ag agVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ag(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        try {
            Class<?> cls = Class.forName("android.util.ArrayMap");
            Field declaredField = cls.getDeclaredField("CACHE_SIZE");
            Field declaredField2 = cls.getDeclaredField("mBaseCache");
            Field declaredField3 = cls.getDeclaredField("mBaseCacheSize");
            synchronized (cls) {
                declaredField.setAccessible(true);
                int i = declaredField.getInt(null);
                declaredField2.setAccessible(true);
                declaredField2.set(null, null);
                declaredField3.setAccessible(true);
                declaredField3.set(null, Integer.valueOf(i + 1));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue() : super.intercept(cVar) && Build.VERSION.SDK_INT == 29;
    }
}
