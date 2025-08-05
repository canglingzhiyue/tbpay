package com.taobao.android.tb3dspaceprocessor;

import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes6.dex */
public class XRNativeProcessor implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "XRNativeProcessor";
    private static int sRetryTimes;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "t3dnativeprocessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri data = intent.getData();
        Log.e(TAG, "process: enter");
        if (data == null || dVar == null) {
            TLog.loge("3dprocessor", TAG, "navContext is null");
            return true;
        }
        try {
            z = "true".equals(data.getQueryParameter("forceinstallt3d"));
        } catch (Throwable th) {
            String str = "process: throwable" + th;
            z = false;
        }
        try {
            z2 = "true".equals(data.getQueryParameter("installt3d"));
        } catch (Throwable th2) {
            Log.e(TAG, "process: throwable" + th2);
            z2 = false;
        }
        q.a("T3DNativeJSAPI", (Class<? extends android.taobao.windvane.jsbridge.e>) T3DNattiveJS.class);
        String str2 = "process: enter process isInstall " + z2 + " isForceInstall " + z;
        if (c.a()) {
            c.a(null, data.toString());
            return true;
        } else if (!z) {
            if (z2) {
                c.a((WVCallBackContext) null);
            }
            return true;
        } else {
            try {
                String str3 = "https://go/installxrspace3d?appUrl=" + URLEncoder.encode(data.toString(), "UTF-8");
                int i = sRetryTimes + 1;
                sRetryTimes = i;
                if (i <= 5) {
                    Nav.from(dVar.a()).toUri(str3);
                    return false;
                }
                TLog.loge("3dprocessor", TAG, "process: install t3d fail");
                return true;
            } catch (UnsupportedEncodingException e) {
                TLog.loge("3dprocessor", TAG, "onCreate: UnsupportedEncodingException" + e);
                return true;
            }
        }
    }
}
