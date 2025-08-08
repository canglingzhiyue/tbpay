package com.taobao.accs.init;

import android.app.Application;
import android.content.ComponentName;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.AppLifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.l;
import java.io.Serializable;
import java.util.HashMap;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_CrossActivityStopped implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2072450200);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            ALog.e("Launcher_CrossActivityStopped", "onStopped", new Object[0]);
            AppLifecycle.onBackground();
            if (!StringUtils.isEmpty(Launcher_InitAccs.mAppkey) && Launcher_InitAccs.mContext != null) {
                if (!Launcher_InitAccs.mIsInited) {
                    return;
                }
                if (l.b() && !jzv.a(new ComponentName(Launcher_InitAccs.mContext, AccsIPCProvider.class))) {
                    return;
                }
                a.a(new Runnable() { // from class: com.taobao.accs.init.Launcher_CrossActivityStopped.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ACCSClient.getAccsClient().bindApp(Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
                        } catch (AccsException e) {
                            ALog.e("Launcher_CrossActivityStopped", "bindApp", e, new Object[0]);
                        }
                    }
                });
                return;
            }
            ALog.e("Launcher_CrossActivityStopped", "params null!!!", "appkey", Launcher_InitAccs.mAppkey, "context", Launcher_InitAccs.mContext);
        } catch (Throwable th) {
            ALog.e("Launcher_CrossActivityStopped", "onStoped", th, new Object[0]);
            th.printStackTrace();
        }
    }
}
