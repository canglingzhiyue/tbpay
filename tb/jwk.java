package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.j;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.s;

/* loaded from: classes6.dex */
public class jwk implements j.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f29830a;
    private DWInstance b;

    @Override // com.taobao.android.weex_framework.j.c
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj instanceof s) {
            this.f29830a = (s) obj;
        } else if (!(obj instanceof DWInstance)) {
        } else {
            this.b = (DWInstance) obj;
        }
    }

    @Override // com.taobao.android.weex_framework.j.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.playVideo();
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return;
        }
        sVar.g();
    }

    @Override // com.taobao.android.weex_framework.j.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.pauseVideo();
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return;
        }
        sVar.b();
    }

    @Override // com.taobao.android.weex_framework.j.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            return dWInstance.getVideoState();
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return -1;
        }
        return sVar.j();
    }

    @Override // com.taobao.android.weex_framework.j.c
    public ViewGroup d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[]{this});
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            return dWInstance.getView();
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return null;
        }
        return sVar.e();
    }

    @Override // com.taobao.android.weex_framework.j.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.setFrame(i, i2);
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return;
        }
        sVar.a(i, i2);
    }

    @Override // com.taobao.android.weex_framework.j.c
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.setVideoLifecycleListener((av) obj);
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return;
        }
        sVar.a((av) obj);
    }

    @Override // com.taobao.android.weex_framework.j.c
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.setPicViewClickListener((z) obj);
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return;
        }
        sVar.a((z) obj);
    }

    @Override // com.taobao.android.weex_framework.j.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.closeVideo();
        }
        s sVar = this.f29830a;
        if (sVar == null) {
            return;
        }
        sVar.c();
    }

    @Override // com.taobao.android.weex_framework.j.c
    public Object f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5dd0ace5", new Object[]{this});
        }
        DWInstance dWInstance = this.b;
        return dWInstance == null ? this.f29830a : dWInstance;
    }
}
