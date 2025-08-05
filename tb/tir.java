package tb;

import android.app.Application;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.SkipStyle;
import com.taobao.bootimage.linked.ext.b;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.mmad.data.a;
import com.taobao.taobao.R;
import com.taobao.utils.Global;
import java.util.List;

/* loaded from: classes7.dex */
public class tir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f34133a;
    private tiv b;
    private tjb c;
    private tjj d;
    private tjg e;
    private tiq f;

    static {
        kge.a(1201494545);
    }

    public static /* synthetic */ a a(tir tirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f12d1db5", new Object[]{tirVar}) : tirVar.f34133a;
    }

    public static /* synthetic */ tiv b(tir tirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiv) ipChange.ipc$dispatch("6bc40ee9", new Object[]{tirVar}) : tirVar.b;
    }

    public static /* synthetic */ tjb c(tir tirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tjb) ipChange.ipc$dispatch("5365e69d", new Object[]{tirVar}) : tirVar.c;
    }

    public static /* synthetic */ tjj d(tir tirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tjj) ipChange.ipc$dispatch("3b07bdf4", new Object[]{tirVar}) : tirVar.d;
    }

    public tir(srq srqVar) {
        this.f = new tiq(srqVar) { // from class: tb.tir.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tiq
            public a d() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e1a46de5", new Object[]{this}) : tir.a(tir.this);
            }

            @Override // tb.tiq
            public tiv e() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (tiv) ipChange.ipc$dispatch("2dd18e19", new Object[]{this}) : tir.b(tir.this);
            }

            @Override // tb.tiq
            public tjb f() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (tjb) ipChange.ipc$dispatch("358334cd", new Object[]{this}) : tir.c(tir.this);
            }

            @Override // tb.tiq
            public tjj g() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (tjj) ipChange.ipc$dispatch("3d34db24", new Object[]{this}) : tir.d(tir.this);
            }
        };
        tjc.e();
        this.f34133a = new a(this.f);
        this.b = new tiv(this.f);
        this.c = new tjb(this.f);
        this.d = new tjj(this.f);
        this.e = new tjg(this.f);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Application application = Global.getApplication();
        if (application == null) {
            return;
        }
        stv.a("MmAdManager", " launchCnt instantiate: registerActivityLifecycleCallbacks. ");
        application.registerActivityLifecycleCallbacks(new ony());
    }

    public void a(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        int i2 = 2002;
        tiq tiqVar = this.f;
        if (1000 != i) {
            z = false;
        }
        tiqVar.a(z);
        this.f34133a.a(list, i);
        if (this.f34133a.b() == null) {
            stv.a("MmAdManager", "loadAdData: adModel is null");
        } else {
            i2 = 2001;
            a(this.f34133a.b());
            this.f34133a.b().isColdStart = this.f.c();
        }
        stv.a("MmAdManager", "loadAdData: resultCode: " + i2);
        this.f.a().a(this.f34133a.b(), i, i2);
    }

    private void a(BaseMmAdModel baseMmAdModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e99414e", new Object[]{this, baseMmAdModel});
        } else if (baseMmAdModel == null) {
        } else {
            SkipStyle skipStyle = new SkipStyle();
            skipStyle.skipText = "跳过广告";
            skipStyle.background = R.drawable.bootimage_commercial_skip_bg;
            skipStyle.skipTextSize = 13;
            skipStyle.countTimeTextSize = 13;
            baseMmAdModel.skipStyle = skipStyle;
        }
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        this.d.a(frameLayout);
        this.e.a();
        this.f34133a.a();
    }

    public void b(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{this, list, new Integer(i)});
        } else {
            this.c.a(list, i);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (201 == i) {
            ket.a(this.f34133a.g());
            b.a(this.f34133a.g(), this.f.c());
        }
        this.e.a(i, i2);
    }

    public tiq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiq) ipChange.ipc$dispatch("f0af802", new Object[]{this}) : this.f;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d.a();
        }
    }
}
