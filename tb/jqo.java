package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* loaded from: classes6.dex */
public class jqo extends jqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1949944098);
    }

    public jqo(jrj jrjVar) {
        super(jrjVar);
    }

    @Override // tb.jqp
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f29712a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, true);
    }

    @Override // tb.jqp
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f29712a.a("work_thread_pool", oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
    }
}
