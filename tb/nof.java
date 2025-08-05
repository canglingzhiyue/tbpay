package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* loaded from: classes6.dex */
public class nof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ihh f31610a;

    public nof(ihh ihhVar) {
        this.f31610a = ihhVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f31610a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, false);
    }
}
