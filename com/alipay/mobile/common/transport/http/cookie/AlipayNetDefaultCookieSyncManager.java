package com.alipay.mobile.common.transport.http.cookie;

import android.content.Context;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayNetDefaultCookieSyncManager implements IAlipayNetCookieSyncManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private CookieSyncManager f5570a;

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieSyncManager
    public void getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e85912", new Object[]{this});
        } else {
            this.f5570a = CookieSyncManager.getInstance();
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieSyncManager
    public void createInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49084910", new Object[]{this, context});
        } else {
            this.f5570a = CookieSyncManager.createInstance(context);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.cookie.IAlipayNetCookieSyncManager
    public void sync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c36d9a2", new Object[]{this});
        } else {
            this.f5570a.sync();
        }
    }
}
