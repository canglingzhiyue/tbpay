package com.ap.zoloz.hummer.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static i f6467a;
    private BaseWebService b;

    static {
        kge.a(1109481016);
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("ec704e42", new Object[0]);
        }
        if (f6467a == null) {
            synchronized (i.class) {
                if (f6467a == null) {
                    f6467a = new i();
                }
            }
        }
        return f6467a;
    }

    public void a(BaseWebService baseWebService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96a2899", new Object[]{this, baseWebService});
        } else {
            this.b = baseWebService;
        }
    }

    public void a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        BaseWebService baseWebService = this.b;
        if (baseWebService == null) {
            return;
        }
        baseWebService.openPage(hashMap);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        BaseWebService baseWebService = this.b;
        return baseWebService != null && baseWebService.isPageAlreadyExisted(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        BaseWebService baseWebService = this.b;
        if (baseWebService == null) {
            return;
        }
        baseWebService.exitPage(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        BaseWebService baseWebService = this.b;
        if (baseWebService == null) {
            return;
        }
        baseWebService.exitSession();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f6467a = null;
        }
    }
}
