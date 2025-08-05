package com.alipay.mobile.common.amnet.service;

import android.app.Service;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class AmnetServiceWrapper extends AmnetService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Service f5375a;

    public static /* synthetic */ Object ipc$super(AmnetServiceWrapper amnetServiceWrapper, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AmnetServiceWrapper(Service service) {
        this.f5375a = service;
        this.shadowMode = true;
    }

    @Override // com.alipay.mobile.common.amnet.service.AmnetService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        innerAttach();
        super.onCreate();
    }

    public void innerAttach() {
        Method[] declaredMethods;
        attachBaseContext(this.f5375a.getBaseContext());
        Method method = null;
        for (Method method2 : super.getClass().getDeclaredMethods()) {
            if (TextUtils.equals(method2.getName(), Constants.Event.SLOT_LIFECYCLE.ATTACH)) {
                method = method2;
            }
        }
        if (method == null) {
            LogCatUtil.error("AmnetServiceWrapper", "[innerAttach] attachMethod is null, a serious mistake occurred.");
            return;
        }
        method.setAccessible(true);
        Class<?> cls = this.f5375a.getClass();
        try {
            Field declaredField = cls.getDeclaredField("mThread");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mClassName");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mToken");
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("mApplication");
            declaredField4.setAccessible(true);
            Field declaredField5 = cls.getDeclaredField("mActivityManager");
            declaredField5.setAccessible(true);
            Field declaredField6 = cls.getDeclaredField("mStartCompatibility");
            declaredField6.setAccessible(true);
            method.invoke(this, getBaseContext(), declaredField.get(this.f5375a), declaredField2.get(this.f5375a), declaredField3.get(this.f5375a), declaredField4.get(this.f5375a), declaredField5.get(this.f5375a), declaredField6.get(this.f5375a));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetServiceWrapper", "[innerAttach] Exception: " + th.toString(), th);
        }
    }
}
