package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.taolive.lpm_android.LpmImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/lpm_android/api/ABActionObserver;", "", "()V", "onActivate", "", "bizID", "", "component", "module", "testKey", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "realValue", "lpm-android_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class pcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().g.a(str, str2, str3, str4, str5, str6);
        } catch (Exception unused) {
        }
    }
}
