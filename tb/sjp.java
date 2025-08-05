package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class sjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public boolean c;
    public boolean e;
    public int f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33634a = true;
    public boolean d = true;
    public int g = 88;
    public int h = 71;

    static {
        kge.a(-468968251);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IVideoCommentSizeConfig{isTNodeV3=" + this.f33634a + ", isGuangguangTab3=" + this.b + ", isImmersiveVideo=" + this.c + ", isHeightActionBar=" + this.d + ", isNeedSettingMarginTop=" + this.e + ", actionBarHeight=" + this.f + ", topbarHeight=" + this.g + ", topbarTopY=" + this.h + '}';
    }
}
