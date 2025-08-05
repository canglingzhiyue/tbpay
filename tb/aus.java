package tb;

import com.alibaba.android.ultron.ext.vlayout.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aus extends aup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIDE_ON_ENTER = 3;
    public static final int SHOW_ALWAYS = 0;
    public static final int SHOW_ON_ENTER = 1;
    public static final int SHOW_ON_LEAVE = 2;

    /* renamed from: a  reason: collision with root package name */
    private int f25621a;

    static {
        kge.a(29771691);
    }

    public aus(int i, int i2, int i3) {
        super(i, i2, i3);
        this.f25621a = 0;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f25621a = i;
        }
    }

    @Override // tb.aup
    public boolean a(e eVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c426459e", new Object[]{this, eVar, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int i4 = this.f25621a;
        return i4 != 1 ? i4 != 2 ? i4 != 3 || i2 <= e().a().intValue() - 1 : i >= e().a().intValue() + 1 : i2 >= e().a().intValue() - 1;
    }
}
