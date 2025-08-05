package com.taobao.android.dinamicx;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class af implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "DXRealTimeDebugProcessor";
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            try {
                Uri data = intent.getData();
                if (data.isHierarchical() && !TextUtils.isEmpty(data.getQueryParameter("dx_debugger"))) {
                    a(data.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    private static void a(String str) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.dinamicx.devtools.DevtoolsInitializer");
            Context i = DinamicXEngine.i();
            if (i == null) {
                return;
            }
            cls.getMethod("launch", Context.class, String.class).invoke(null, i, str);
        } catch (Throwable unused) {
        }
    }
}
