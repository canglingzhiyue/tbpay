package tb;

import android.view.View;
import com.alilive.adapter.uikit.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.b;

/* loaded from: classes8.dex */
public class pai implements pni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f32532a = b.h();

    static {
        kge.a(-351966026);
        kge.a(-1752177632);
    }

    @Override // tb.pni
    public pnh a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnh) ipChange.ipc$dispatch("7c73e12a", new Object[]{this, str}) : a(str, null, -1, -1);
    }

    @Override // tb.pni
    public pnh a(String str, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnh) ipChange.ipc$dispatch("2ea95ddc", new Object[]{this, str, view, new Integer(i), new Integer(i2)});
        }
        if (this.f32532a == null) {
            return new pah();
        }
        if (view != null && (i2 <= 0 || i <= 0)) {
            return a(str, this.f32532a.a(str).limitSize(view));
        }
        return a(str, this.f32532a.a(str).limitSize(view, i, i2));
    }

    private pah a(String str, PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pah) ipChange.ipc$dispatch("7cc6143e", new Object[]{this, str, phenixCreator});
        }
        if (psm.w()) {
            pah pahVar = new pah(str, phenixCreator);
            pahVar.a(new h(str));
            return pahVar;
        }
        return new pah(str, phenixCreator);
    }
}
