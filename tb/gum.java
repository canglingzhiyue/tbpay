package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.e;
import com.taobao.android.job.core.task.f;

/* loaded from: classes.dex */
public class gum implements f<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.job.core.task.f
    public e<String, Void> a(e<String, Void> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("68f939ce", new Object[]{this, eVar}) : new guo(eVar);
    }
}
