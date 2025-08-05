package com.taobao.android.detail.core.aura.presenter;

import android.content.Context;
import com.alibaba.android.aura.AURATBDetailCorePluginCenter;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.k;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import java.util.Map;
import tb.aqq;
import tb.arc;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9397a;
    private s c;
    private IAURAPluginCenter[] d;
    private final String b = "AbsAuraPresenter";
    private final Map<String, Object> e = new HashMap();

    static {
        kge.a(-894514719);
    }

    public abstract AURAPluginContainerNodeModel c();

    public abstract Map<String, Object> f();

    public a(Context context) {
        this.f9397a = context;
    }

    public void a(IAURAPluginCenter[] iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26a4b33", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.d = iAURAPluginCenterArr;
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.e.putAll(map);
        }
    }

    public void a(String str, UMFBaseIO uMFBaseIO, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480af8eb", new Object[]{this, str, uMFBaseIO, aqqVar});
        } else {
            g().a(str, uMFBaseIO, aqqVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        s sVar = this.c;
        if (sVar == null) {
            return;
        }
        sVar.a();
        this.c = null;
    }

    public void a(IAURAInputField iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb68a486", new Object[]{this, iAURAInputField});
        } else {
            g().b(iAURAInputField);
        }
    }

    private Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        if (f() != null) {
            this.e.putAll(f());
        }
        return this.e;
    }

    public s g() {
        if (this.c == null) {
            b();
            try {
                this.c = k.a(new q(this.f9397a, a())).a(c()).b((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURATBDetailWrapperPluginCenter").newInstance()).b(new AURATBDetailCorePluginCenter());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            }
            e();
            IAURAPluginCenter[] iAURAPluginCenterArr = this.d;
            if (iAURAPluginCenterArr != null) {
                this.c.b(iAURAPluginCenterArr);
            }
        }
        return this.c;
    }

    private void b() throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (f() == null) {
            throw new IllegalArgumentException("AURAUserContext is null");
        } else {
            if (c() == null) {
                throw new IllegalArgumentException("AURAUserConfig is null");
            }
        }
    }

    private void e() {
        try {
            this.c.b((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURATBDetailIndustryPluginCenter").newInstance());
            this.c.b((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURAAdamAndroidPluginCenter").newInstance());
        } catch (Exception e) {
            arc.a().c("AbsAuraPresenter", "registerIndustryPluginCenter", e.toString());
        }
        if (h()) {
            try {
                this.c.b((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURAFliggyDetailCorePluginCenter").newInstance());
            } catch (Exception e2) {
                arc.a().c("AbsAuraPresenter", " registerFliggyIndustryPluginCenter", e2.toString());
            }
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        Context context = this.f9397a;
        if (!(context instanceof DetailCoreActivity)) {
            return false;
        }
        return ((DetailCoreActivity) context).aU();
    }
}
