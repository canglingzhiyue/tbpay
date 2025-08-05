package com.alipay.mobile.common.ipc.biz.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* loaded from: classes3.dex */
public class CustomCLObjectInputStream extends ObjectInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ClassLoader f5398a;

    public static /* synthetic */ Object ipc$super(CustomCLObjectInputStream customCLObjectInputStream, String str, Object... objArr) {
        if (str.hashCode() == 1072899230) {
            return super.resolveClass((ObjectStreamClass) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CustomCLObjectInputStream() {
    }

    public CustomCLObjectInputStream(InputStream inputStream, ClassLoader classLoader) {
        super(inputStream);
        this.f5398a = classLoader;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
        }
        try {
            return super.resolveClass(objectStreamClass);
        } catch (Exception e) {
            Log.e("MyObjectInputStream", "", e);
            return Class.forName(objectStreamClass.getName(), true, this.f5398a);
        }
    }
}
