package com.taobao.android.shake;

import android.app.Application;
import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.api.c;
import com.taobao.android.shake.remote.IShakeRemoteApi;
import com.taobao.tao.Globals;
import tb.iwu;
import tb.iwv;
import tb.iww;
import tb.ixb;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iwu f15066a;
    private IShakeRemoteApi b;
    private iwv c;
    private ViewStub d;
    private Boolean e;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f15068a;

        static {
            kge.a(1429588353);
            f15068a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2eaf9477", new Object[0]) : f15068a;
        }
    }

    static {
        kge.a(1165921955);
    }

    public static /* synthetic */ IShakeRemoteApi a(b bVar, IShakeRemoteApi iShakeRemoteApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShakeRemoteApi) ipChange.ipc$dispatch("f6abffcd", new Object[]{bVar, iShakeRemoteApi});
        }
        bVar.b = iShakeRemoteApi;
        return iShakeRemoteApi;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46463371", new Object[]{bVar});
        } else {
            bVar.h();
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2eaf9477", new Object[0]) : a.a();
    }

    private b() {
        this.f15066a = new iwu(g());
        f();
    }

    public boolean a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28a16ae0", new Object[]{this, viewStub})).booleanValue();
        }
        ixb.a("ShakeApiWrapper", "homePageRegisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.homePageRegisterService(viewStub);
        } else {
            this.d = viewStub;
            ixb.a("ShakeApiWrapper", "homePageRegisterService 检查下载远程bundle");
            f();
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ixb.a("ShakeApiWrapper", "homePageUnregisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.homePageUnregisterService();
        } else {
            this.d = null;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        ixb.a("ShakeApiWrapper", "homePageUnregisterService homePageIsShakeEnable. : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi == null) {
            return false;
        }
        return iShakeRemoteApi.homePageIsShakeEnable();
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ixb.a("ShakeApiWrapper", "homePageEnableShake enable : " + z);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            return iShakeRemoteApi.homePageEnableShake(z);
        }
        this.e = Boolean.valueOf(z);
        return false;
    }

    public void a(Context context, c.b bVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66348c3f", new Object[]{this, context, bVar, aVar});
            return;
        }
        ixb.a("ShakeApiWrapper", "shakeSensorRegisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.shakeSensorRegisterService(context, bVar, aVar);
            return;
        }
        this.c = new iwv(context, bVar, aVar);
        ixb.a("ShakeApiWrapper", "shakeSensorRegisterService 检查下载远程bundle");
        f();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ixb.a("ShakeApiWrapper", "shakeSensorUnregisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.shakeSensorUnregisterService();
        } else {
            this.c = null;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ixb.a("ShakeApiWrapper", "shakeSensorRequestDetection mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi == null) {
            return;
        }
        iShakeRemoteApi.shakeSensorRequestDetection();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Application application = Globals.getApplication();
        if (application == null) {
            ixb.a("ShakeApiWrapper", "checkLoadShakeBundle context is null");
            return;
        }
        ixb.a("ShakeApiWrapper", "checkLoadShakeBundle");
        this.f15066a.a(application);
    }

    private iwu.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iwu.a) ipChange.ipc$dispatch("b1613a94", new Object[]{this}) : new iwu.a() { // from class: com.taobao.android.shake.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iwu.a
            public void a(IShakeRemoteApi iShakeRemoteApi) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("224f182f", new Object[]{this, iShakeRemoteApi});
                    return;
                }
                ixb.a("ShakeApiWrapper", "摇一摇远程化加载成功, shakeRemoteApi : " + iShakeRemoteApi);
                b.a(b.this, iShakeRemoteApi);
                b.a(b.this);
            }

            @Override // tb.iwu.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ixb.a("ShakeApiWrapper", "摇一摇远程化加载失败，errorMsg ： " + str);
                iww.a(str);
            }
        };
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        iwv iwvVar = this.c;
        if (iwvVar != null) {
            ixb.a("ShakeApiWrapper", "发生补偿 mShakeSensorRegisterModel");
            a(iwvVar.a(), iwvVar.b(), iwvVar.c());
            this.c = null;
        }
        ViewStub viewStub = this.d;
        if (viewStub != null) {
            ixb.a("ShakeApiWrapper", "发生补偿 mViewStub");
            a(viewStub);
            this.d = null;
        }
        Boolean bool = this.e;
        if (bool == null) {
            return;
        }
        ixb.a("ShakeApiWrapper", "发生补偿 mIsEnable");
        a(bool.booleanValue());
        this.e = null;
    }
}
