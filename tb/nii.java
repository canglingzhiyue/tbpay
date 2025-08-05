package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.file.a;
import com.taobao.phenix.loader.file.b;

/* loaded from: classes.dex */
public class nii implements nid<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31480a;
    private b b;

    static {
        kge.a(351497420);
        kge.a(-1709620101);
    }

    public synchronized b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("594889fa", new Object[]{this});
        } else if (this.f31480a) {
            return this.b;
        } else {
            this.f31480a = true;
            if (this.b == null) {
                this.b = new a();
            }
            return this.b;
        }
    }
}
