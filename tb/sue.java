package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.windvane.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class sue implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2082487389);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("isCanShowTaoWise");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        e.e("HomeTaoWiseJsFeature", "想要出语音搜入口了");
        ksr.c("showTaoWise", "1.0");
        a(wVCallBackContext);
        return true;
    }

    private void a(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
        } else {
            h.a(Globals.getApplication()).a(j.a().a("taowise_android_aar").a()).a(new q<Integer>() { // from class: tb.sue.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.q
                public void a(com.alibaba.android.split.core.tasks.h<Integer> hVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eaabd6ea", new Object[]{this, hVar});
                        return;
                    }
                    wVCallBackContext.success();
                    e.e("HomeTaoWiseJsFeature", "远程化下载好了");
                }
            });
        }
    }
}
