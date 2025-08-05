package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.activity.DetailActivity;

/* loaded from: classes5.dex */
public class fgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27933a;

    static {
        kge.a(1249356799);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public fgt() {
        this.f27933a = true;
        this.f27933a = b();
        emu.a("com.taobao.android.detail.wrapper.utils.IPVRollbackManager");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f27933a;
    }

    public static boolean a(Context context) {
        fgt al;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof DetailActivity) || (al = ((DetailActivity) context).al()) == null) {
            return false;
        }
        return al.a();
    }
}
