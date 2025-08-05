package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class ibb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ibc> f28886a = new ArrayList<>();
    public ibd b = null;
    public ibd c = null;
    public ibf d = new ibf(0.0f, 0.0f, 0.0f);

    static {
        kge.a(1323458928);
    }

    public void a(ibc ibcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed54c82e", new Object[]{this, ibcVar});
        } else {
            this.f28886a.add(ibcVar);
        }
    }

    public String toString() {
        Iterator<ibc> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = "\tvertices: " + this.f28886a.size() + " :\n";
        while (this.f28886a.iterator().hasNext()) {
            str = str + " \t\t( " + it.next().toString() + " )\n";
        }
        return str;
    }
}
