package com.alipay.android.app.substitute.api;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ExternalSocialPluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ExternalSocialPluginManager f4438a = new ExternalSocialPluginManager();
    private IExternalSocialPlugin b;

    private ExternalSocialPluginManager() {
    }

    public static ExternalSocialPluginManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExternalSocialPluginManager) ipChange.ipc$dispatch("74067886", new Object[0]) : f4438a;
    }

    public void registerSocialPlugin(IExternalSocialPlugin iExternalSocialPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf63b788", new Object[]{this, iExternalSocialPlugin});
        } else {
            this.b = iExternalSocialPlugin;
        }
    }

    public void unRegisterSocialPlugin(IExternalSocialPlugin iExternalSocialPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30db8a6f", new Object[]{this, iExternalSocialPlugin});
        } else if (iExternalSocialPlugin != this.b) {
        } else {
            this.b = null;
        }
    }

    public IExternalSocialPlugin getSocialPlugin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IExternalSocialPlugin) ipChange.ipc$dispatch("4f0bcc3f", new Object[]{this}) : this.b;
    }
}
