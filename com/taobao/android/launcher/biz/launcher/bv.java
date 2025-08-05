package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.util.Log;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public class bv extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public bv(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (!Globals.getApplication().getString(R.string.env_switch).equals("1")) {
        } else {
            EnvironmentSwitcher.e();
            EnvironmentSwitcher.SpdySSLStrategy b = EnvironmentSwitcher.b();
            if (b == EnvironmentSwitcher.SpdySSLStrategy.DISABLE_DEGRADE) {
                NetworkConfigCenter.setSSLEnabled(true);
                NetworkConfigCenter.setSpdyEnabled(true);
                Log.e("TaoApplication", "http降级关闭");
            } else if (b == EnvironmentSwitcher.SpdySSLStrategy.ENABLE_DEGRADE) {
                NetworkConfigCenter.setSSLEnabled(false);
                NetworkConfigCenter.setSpdyEnabled(false);
                Log.e("TaoApplication", "http降级开启");
            }
            EnvironmentSwitcher.HttpsValidationStrategy c = EnvironmentSwitcher.c();
            if (c == EnvironmentSwitcher.HttpsValidationStrategy.DISABLE_DEGRADE) {
                a(true);
                NetworkConfigCenter.setSpdyEnabled(true);
                Log.e("TaoApplication", "https降级关闭");
            } else if (c != EnvironmentSwitcher.HttpsValidationStrategy.ENABLE_DEGRADE) {
            } else {
                a(false);
                NetworkConfigCenter.setSpdyEnabled(false);
                Log.e("TaoApplication", "https降级开启");
            }
        }
    }

    private static void a(boolean z) {
        try {
            Method declaredMethod = Class.forName("anet.channel.debug.NetworkDebugTool").getDeclaredMethod("setHttpsValidationEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Boolean.valueOf(z), new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
