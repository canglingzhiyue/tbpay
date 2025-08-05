package com.alipay.mobile.security.zim.biz;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class ZimComponentCallbacks implements ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ZimComponentCallbacks b;

    /* renamed from: a  reason: collision with root package name */
    public Context f5844a;

    private ZimComponentCallbacks(Context context) {
        this.f5844a = context.getApplicationContext();
    }

    public static ZimComponentCallbacks getInstance(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZimComponentCallbacks) ipChange.ipc$dispatch("661ad82f", new Object[]{application});
        }
        if (b == null) {
            synchronized (ZimComponentCallbacks.class) {
                if (b == null) {
                    ZimComponentCallbacks zimComponentCallbacks = new ZimComponentCallbacks(application);
                    BioLog.w(ZIMFacade.TAG, "application.registerComponentCallbacks(ZimComponentCallbacks)");
                    application.registerComponentCallbacks(zimComponentCallbacks);
                    b = zimComponentCallbacks;
                }
            }
        }
        return b;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        BioLog.d(ZIMFacade.TAG, "onTrimMemory(level=" + i + riy.BRACKET_END_STR);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        BioLog.d(ZIMFacade.TAG, "onConfigurationChanged(newConfig=" + configuration + riy.BRACKET_END_STR);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            BioLog.d(ZIMFacade.TAG, "onLowMemory()");
        }
    }
}
