package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.g;

/* loaded from: classes7.dex */
public class lsq implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lsp f30900a;
    private final lsh b = new lsh();
    private SplashInteractData c;

    static {
        kge.a(1512849798);
        kge.a(924978914);
    }

    @Override // com.taobao.bootimage.linked.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : com.taobao.mmad.data.b.TYPE_BANNER;
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean c(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f89e36", new Object[]{this, linkedSplashData})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.bootimage.linked.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public lsq(ljs ljsVar, lso lsoVar) {
        this.f30900a = new lsp(ljsVar, lsoVar);
    }

    @Override // com.taobao.bootimage.linked.b
    public void a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
            return;
        }
        this.b.a(g.a(linkedSplashData));
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopViewCallbackImp#onReceiveData-> 开屏页数据处理完成，开始缓存topView图片资源");
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean b(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526d8075", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.c = g.a(linkedSplashData);
        return this.f30900a.a();
    }

    @Override // com.taobao.bootimage.linked.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f30900a.b();
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
        }
        InteractLocationData c = this.f30900a.c();
        if (c != null) {
            aVar.b = c.width;
            aVar.c = c.height;
            aVar.d = c.positionX;
            aVar.e = c.positionY;
            aVar.f = this.f30900a.d();
            return true;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopViewCallbackImp#shouldAnimate-> 没有拿到首焦坐标信息，禁用动画");
        return false;
    }

    @Override // com.taobao.bootimage.linked.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f30900a.a(this.c);
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f30900a.b(this.c);
        }
    }
}
