package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.b;
import java.util.HashMap;
import java.util.Map;
import tb.pig;

/* loaded from: classes5.dex */
public class ovf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, phy> f32450a = new HashMap();
    private Map<Integer, String> b = new HashMap();

    static {
        kge.a(-1159161638);
    }

    public void a(String str, phy phyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398fb781", new Object[]{this, str, phyVar});
        } else {
            this.f32450a.put(str, phyVar);
        }
    }

    public pig a(a aVar, b.a aVar2, pig.a aVar3, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pig) ipChange.ipc$dispatch("8322abe3", new Object[]{this, aVar, aVar2, aVar3, viewGroup, new Integer(i)});
        }
        phy phyVar = this.f32450a.get(this.b.get(Integer.valueOf(i)));
        if (phyVar == null) {
            return null;
        }
        try {
            return phyVar.a(viewGroup, aVar, aVar2, aVar3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        this.b.put(Integer.valueOf(str.hashCode()), str);
        return str.hashCode();
    }
}
