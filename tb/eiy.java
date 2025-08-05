package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class eiy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, eiw> f27336a;

    static {
        kge.a(-968820801);
        HashMap<String, eiw> hashMap = new HashMap<>();
        f27336a = hashMap;
        hashMap.put("page_detail", new eix());
        emu.a("com.taobao.android.detail.core.performance.preload.core.executor.TaskExecutorProvider");
    }

    public static eiw a(String str) {
        IpChange ipChange = $ipChange;
        return (eiw) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7c6ed021", new Object[]{str}) : f27336a.get(str));
    }
}
