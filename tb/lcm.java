package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class lcm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f30473a;

    static {
        kge.a(-100818424);
    }

    public lcm(DetailCoreActivity detailCoreActivity) {
        this.f30473a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.pagemanager.DetailContext");
    }

    public DetailCoreActivity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("6cf8a73", new Object[]{this}) : this.f30473a;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.f30473a.findViewById(R.id.actionbar_layout);
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.f30473a.findViewById(R.id.bottombar_layout);
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.f30473a.y().k.f9420a;
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.f30473a.y().k.c.a();
    }
}
