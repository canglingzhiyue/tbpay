package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pop.bean.MTBIconPixelInfoBean;
import com.taobao.mytaobao.pop.bridge.TBMyTaobaoPopWVApiPlugin;

/* loaded from: classes7.dex */
public class mvp implements mvq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final mvt f31287a = new mvt();
    private final mvs b = new mvs();

    static {
        kge.a(-1200167246);
        kge.a(114251395);
    }

    public mvp() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TBMyTaobaoPopWVApiPlugin.registerMTBIconPositionListener(this);
        this.f31287a.a(this.b);
    }

    @Override // tb.mvq
    public MTBIconPixelInfoBean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTBIconPixelInfoBean) ipChange.ipc$dispatch("9d781f14", new Object[]{this, str}) : this.f31287a.a(str);
    }

    @Override // tb.mvq
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f31287a.b(str);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TBMyTaobaoPopWVApiPlugin.unregisterMTBIconPositionListener();
        this.f31287a.a();
        this.f31287a.b();
    }

    public void a(mwp mwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5560112", new Object[]{this, mwpVar});
        } else {
            this.f31287a.a(mwpVar);
        }
    }
}
