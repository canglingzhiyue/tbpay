package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* loaded from: classes6.dex */
public class jqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jrj f29712a;

    static {
        kge.a(562402570);
    }

    public jqp(jrj jrjVar) {
        this.f29712a = jrjVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f29712a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, false);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f29712a.a("work_thread_pool", "");
    }
}
