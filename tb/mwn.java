package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.monitor.procedure.v;

/* loaded from: classes2.dex */
public class mwn implements oxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1665614051);
        kge.a(-1698241117);
    }

    @Override // tb.oxv
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : v.APM_VIEW_INVALID;
    }

    @Override // tb.oxv
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : v.APM_VIEW_VALID;
    }

    @Override // tb.oxv
    public void a(View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6bf190", new Object[]{this, view, str, obj});
            return;
        }
        try {
            g b = s.f18233a.b(view);
            if (b.c()) {
                b.a(str, obj);
            }
            g d = s.f18233a.d();
            if (!d.c()) {
                return;
            }
            d.a(str, obj);
        } catch (Exception unused) {
        }
    }

    @Override // tb.oxv
    public void b(View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56fbcef", new Object[]{this, view, str, obj});
            return;
        }
        try {
            g b = s.f18233a.b(view);
            if (b.c()) {
                b.c(str, obj);
            }
            g d = s.f18233a.d();
            if (!d.c()) {
                return;
            }
            d.c(str, obj);
        } catch (Exception unused) {
        }
    }

    @Override // tb.oxv
    public void a(View view, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61588690", new Object[]{this, view, str, new Long(j)});
            return;
        }
        try {
            g b = s.f18233a.b(view);
            if (b.c()) {
                b.a(str, j);
            }
            g d = s.f18233a.d();
            if (!d.c()) {
                return;
            }
            d.a(str, j);
        } catch (Exception unused) {
        }
    }

    @Override // tb.oxv
    public void b(View view, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4699f551", new Object[]{this, view, str, new Long(j)});
            return;
        }
        try {
            g b = s.f18233a.b(view);
            if (b.c()) {
                b.b(str, j);
            }
            g d = s.f18233a.d();
            if (!d.c()) {
                return;
            }
            d.b(str, j);
        } catch (Exception unused) {
        }
    }

    @Override // tb.oxv
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : v.APM_VIEW_TOKEN;
    }

    @Override // tb.oxv
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : v.VIEW_MANUAL_CALCULATE;
    }
}
