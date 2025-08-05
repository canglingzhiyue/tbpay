package tb;

import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class aui extends aum<aun> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-394984683);
    }

    @Override // tb.auh
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.aua
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "card";
    }

    @Override // tb.auh
    public /* synthetic */ c a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2815820f", new Object[]{this, new Integer(i), map}) : b(i, map);
    }

    public aun b(int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aun) ipChange.ipc$dispatch("e8ae6ca1", new Object[]{this, new Integer(i), map}) : new aun(i);
    }
}
