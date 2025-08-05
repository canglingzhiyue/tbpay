package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dyz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private int c = 2;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27128a = e();

    static {
        kge.a(2105430839);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public dyz() {
        this.b = true;
        this.b = f();
        emu.a("com.taobao.android.detail.core.detail.ipv.IPVCorrector");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = 0;
        }
    }

    public boolean b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.f27128a || (i = this.c) >= 2) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    private boolean e() {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        VariationSet activate = UTABTest.activate("AB_Page_NewDetail_ipv_bugfix", "ipv_bugfix");
        if (activate != null && (variation = activate.getVariation("ipv_bugfix")) != null) {
            return variation.getValueAsBoolean(false);
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f27128a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }
}
