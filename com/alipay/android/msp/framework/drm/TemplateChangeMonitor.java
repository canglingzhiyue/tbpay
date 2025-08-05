package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TemplateChangeMonitor extends ChangeMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile TemplateChangeMonitor f;

    public static /* synthetic */ Object ipc$super(TemplateChangeMonitor templateChangeMonitor, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -411774471:
                super.hitKey((String) objArr[0], objArr[1]);
                return null;
            case 119939067:
                super.hitKey((String) objArr[0], objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1277321674:
                return super.exit();
            case 1465898632:
                super.newContext((String) objArr[0], (Context) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ Pair exit() {
        return super.exit();
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ void hitKey(String str, Object obj) {
        super.hitKey(str, obj);
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ void hitKey(String str, Object obj, boolean z) {
        super.hitKey(str, obj, z);
    }

    @Override // com.alipay.android.msp.framework.drm.ChangeMonitor
    public /* bridge */ /* synthetic */ void newContext(String str, Context context) {
        super.newContext(str, context);
    }

    private TemplateChangeMonitor() {
    }

    public void newContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6808e792", new Object[]{this, context});
        } else if (context == null || !FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_UPLOAD_RECENTLY_CHANGE_TPL)) {
        } else {
            super.newContext("cashier_template_hit", context);
        }
    }

    public static TemplateChangeMonitor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateChangeMonitor) ipChange.ipc$dispatch("f92b61e0", new Object[0]);
        }
        if (f == null) {
            synchronized (TemplateChangeMonitor.class) {
                if (f == null) {
                    f = new TemplateChangeMonitor();
                }
            }
        }
        return f;
    }
}
