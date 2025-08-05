package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ToolThreadUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String ACTION_TOOLS_THREAD_WITH_START = "action.tools.thread.START";
    public static String ACTION_TOOLS_THREAD_WITH_START_END_END = "action.tools.thread.START_END.END";
    public static String ACTION_TOOLS_THREAD_WITH_START_END_START = "action.tools.thread.START_END.START";

    /* renamed from: a  reason: collision with root package name */
    private static ToolThreadUtils f5466a;
    private Context b;
    private LocalBroadcastManager c;

    public static synchronized ToolThreadUtils getInstance(Context context) {
        synchronized (ToolThreadUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ToolThreadUtils) ipChange.ipc$dispatch("962aef07", new Object[]{context});
            }
            if (f5466a == null) {
                f5466a = new ToolThreadUtils(context);
            }
            return f5466a;
        }
    }

    public ToolThreadUtils(Context context) {
        this.b = context;
        Context context2 = this.b;
        if (context2 == null || context2.getApplicationContext() == null) {
            return;
        }
        this.c = LocalBroadcastManager.getInstance(this.b);
    }

    public void start(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f66680b", new Object[]{this, new Boolean(z)});
        } else if (this.b == null || this.c == null) {
        } else {
            Intent intent = new Intent();
            if (z) {
                intent.setAction(ACTION_TOOLS_THREAD_WITH_START_END_START);
            } else {
                intent.setAction(ACTION_TOOLS_THREAD_WITH_START);
            }
            this.c.sendBroadcast(intent);
        }
    }

    public void end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else if (this.b == null || this.c == null) {
        } else {
            this.c.sendBroadcast(new Intent(ACTION_TOOLS_THREAD_WITH_START_END_END));
        }
    }
}
