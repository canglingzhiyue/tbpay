package com.taobao.jacoco;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import org.jacoco.agent.rt.RT;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17639a = "b";

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f17639a;
    }

    public static void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (!a(context)) {
        } else {
            c.a(new a.b() { // from class: com.taobao.jacoco.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i != 1) {
                    } else {
                        Log.e(b.a(), "CodeTrack: APM is notifying NOTIFY_FOREGROUND_2_BACKGROUND");
                        AsyncTask.execute(new a(context, str));
                    }
                }
            });
        }
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            String str = "initJacoco finish 1, with class name " + RT.class.getSimpleName();
            String[] list = context.getAssets().list("tbJacoco");
            if (list == null || list.length <= 0) {
                z = false;
            }
            String str2 = "initJacoco finish 2, jacoco path exists=" + z;
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
