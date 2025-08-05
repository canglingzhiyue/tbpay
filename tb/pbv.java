package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/lpm_android/LpmSettingCache;", "", "()V", "mAppInfo", "Lcom/taobao/taolive/lpm_android/AppInfo;", "getMAppInfo", "()Lcom/taobao/taolive/lpm_android/AppInfo;", "setMAppInfo", "(Lcom/taobao/taolive/lpm_android/AppInfo;)V", a.ATOM_EXT_clear, "", "lpm-android_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class pbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pbq f32562a;

    public final pbq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pbq) ipChange.ipc$dispatch("f090c3f", new Object[]{this}) : this.f32562a;
    }

    public final void a(pbq pbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d11b9", new Object[]{this, pbqVar});
        } else {
            this.f32562a = pbqVar;
        }
    }
}
