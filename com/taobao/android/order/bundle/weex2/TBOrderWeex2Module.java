package com.taobao.android.order.bundle.weex2;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.helper.j;
import com.taobao.android.order.core.g;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.List;
import tb.kge;
import tb.rhy;

/* loaded from: classes6.dex */
public class TBOrderWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1653018060);
    }

    public static /* synthetic */ Object ipc$super(TBOrderWeex2Module tBOrderWeex2Module, String str, Object... objArr) {
        if (str.hashCode() == 110991797) {
            super.onModuleDestroy((MUSModule) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBOrderWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void registerScreenShotNotification() {
        ContentObserver a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b09069b", new Object[]{this});
            return;
        }
        j.a().a(j.PAGE_NAME_ORDER_DETAIL3);
        j.a().a(j.PAGE_NAME_ORDER_DETAIL3, new rhy() { // from class: com.taobao.android.order.bundle.weex2.TBOrderWeex2Module.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rhy
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!(TBOrderWeex2Module.this.getInstance().getUIContext() instanceof Activity)) {
                } else {
                    Activity activity = (Activity) TBOrderWeex2Module.this.getInstance().getUIContext();
                    List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) activity.getSystemService("activity")).getRunningTasks(1);
                    if (runningTasks.isEmpty()) {
                        return;
                    }
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    String packageName = componentName.getPackageName();
                    String className = componentName.getClassName();
                    if (!packageName.equals(activity.getPackageName()) || !className.equals(activity.getClass().getName())) {
                        return;
                    }
                    TBOrderWeex2Module.this.getInstance().dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "screenshot", null);
                }
            }
        });
        Context uIContext = getInstance().getUIContext();
        if (uIContext == null || (a2 = j.a().a(uIContext)) == null) {
            return;
        }
        ContentResolver contentResolver = uIContext.getContentResolver();
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, a2);
        contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, a2);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onModuleDestroy(MUSModule mUSModule) {
        ContentObserver a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d99b5", new Object[]{this, mUSModule});
            return;
        }
        super.onModuleDestroy(mUSModule);
        j.a().b(j.PAGE_NAME_ORDER_DETAIL3);
        Context uIContext = getInstance().getUIContext();
        if (uIContext == null) {
            return;
        }
        String b = j.a().b();
        if (StringUtils.isEmpty(b) || !j.PAGE_NAME_ORDER_DETAIL3.equals(b) || (a2 = j.a().a(uIContext)) == null) {
            return;
        }
        uIContext.getContentResolver().unregisterContentObserver(a2);
        j.a().a((g) null);
        j.a().a((String) null);
    }
}
