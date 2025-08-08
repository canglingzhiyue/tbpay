package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import java.util.ArrayList;
import tb.omn;

/* loaded from: classes6.dex */
public class qpe implements omn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.omn.a
    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        ArrayList<g> e = e.e();
        for (int i = 0; i < e.size(); i++) {
            g gVar = e.get(i);
            if (gVar != null && StringUtils.equals(gVar.y(), str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // tb.omn.a
    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        g b = e.b(i);
        if (b == null) {
            return null;
        }
        return b.y();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            omn.a(this);
        }
    }
}
