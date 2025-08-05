package com.alipay.mobile.security.zim.gw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseGwService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f5848a;
    public Handler b;
    public Handler c = new Handler(Looper.getMainLooper());
    public GwListener d;

    public abstract ZimInitGwResponse convert(String str);

    public abstract void init(ZimInitGwRequest zimInitGwRequest);

    public BaseGwService(GwListener gwListener, String str) {
        this.f5848a = new HandlerThread(str);
        this.d = gwListener;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = this.f5848a;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.f5848a.quit();
        }
        this.f5848a = null;
        this.b = null;
        this.d = null;
        this.c = null;
    }
}
