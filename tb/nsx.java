package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.d;
import com.taobao.android.searchbaseframe.meta.uikit.f;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;

/* loaded from: classes8.dex */
public class nsx implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final f b;
    private static final f c;
    private static final f d;
    private static final f e;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31741a;

    public nsx(boolean z) {
        this.f31741a = z;
    }

    static {
        kge.a(106314585);
        kge.a(-1337121366);
        b = new f(Color.parseColor("#f2f2f2"), DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, 0, 0, false, true);
        c = new f(-1, DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, DensityUtil.dip2px(Globals.getApplication(), 10.0f), -1, false, false);
        d = new f(Color.parseColor("#222222"), DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, 0, 0, false, true);
        e = new f(Color.parseColor("#222222"), DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, DensityUtil.dip2px(Globals.getApplication(), 10.0f), Color.parseColor("#222222"), false, false);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.d
    public f a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("739f582f", new Object[]{this, new Integer(i)}) : this.f31741a ? i == 0 ? d : e : i == 0 ? b : c;
    }
}
