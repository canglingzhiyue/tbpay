package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;

/* loaded from: classes5.dex */
public class fyg implements Comparator<fxw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-298980869);
        kge.a(-2099169482);
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(fxw fxwVar, fxw fxwVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, fxwVar, fxwVar2})).intValue() : a(fxwVar, fxwVar2);
    }

    public int a(fxw fxwVar, fxw fxwVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd4aae31", new Object[]{this, fxwVar, fxwVar2})).intValue() : fxwVar.a() - fxwVar2.a();
    }
}
