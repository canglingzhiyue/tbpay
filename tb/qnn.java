package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class qnn implements lld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f32963a;

    static {
        kge.a(1057688235);
        kge.a(-284309816);
    }

    @Override // tb.lld
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // tb.lld
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        }
    }

    public qnn(String str) {
        this.f32963a = str;
    }

    @Override // tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
        } else {
            ldg.b("page_disappear", this.f32963a, null);
        }
    }
}
