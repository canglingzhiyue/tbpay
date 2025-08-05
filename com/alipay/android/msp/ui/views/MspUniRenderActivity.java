package com.alipay.android.msp.ui.views;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspUniRenderActivity extends MspContainerActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MspUniRenderActivity mspUniRenderActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1150324634) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.finish();
            return null;
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspContainerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ void access$001(MspUniRenderActivity mspUniRenderActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98553bbc", new Object[]{mspUniRenderActivity});
        } else {
            super.finish();
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspContainerActivity, com.alipay.android.msp.ui.views.MspBaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 25) {
            LogUtil.record(2, "MspUniRenderActivity:finish", "delay finish when behind translucent activity");
            final Handler provideMainHandler = TaskHelper.provideMainHandler();
            provideMainHandler.postAtFrontOfQueue(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspUniRenderActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspUniRenderActivity.this.getWindow().setWindowAnimations(0);
                    provideMainHandler.post(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspUniRenderActivity.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.record(2, "MspUniRenderActivity:finish", "do finish after delay");
                            MspUniRenderActivity.access$001(MspUniRenderActivity.this);
                        }
                    });
                }
            });
        } else {
            try {
                super.finish();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
