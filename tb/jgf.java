package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* loaded from: classes6.dex */
public class jgf implements jgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdv f29535a;

    public jgf(jdv jdvVar) {
        this.f29535a = jdvVar;
    }

    @Override // tb.jgh
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f29535a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, true);
    }
}
