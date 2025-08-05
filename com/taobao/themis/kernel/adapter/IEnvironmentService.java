package com.taobao.themis.kernel.adapter;

import android.app.Application;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;

@DefaultAdapterImpl("com.taobao.themis.taobao.env.TBEnvironmentAdapterImpl")
/* loaded from: classes9.dex */
public interface IEnvironmentService extends com.taobao.themis.kernel.basic.a {
    String getAppName();

    String getAppVersion();

    Application getApplicationContext();
}
