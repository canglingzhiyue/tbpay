package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.d;
import com.taobao.alivfsadapter.e;

/* loaded from: classes.dex */
public class dih extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.alivfsadapter.d
    public e a(String str, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9e915d27", new Object[]{this, str, new Integer(i)}) : new dig(str, i);
    }

    @Override // com.taobao.alivfsadapter.d
    public e a(String str, String str2, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("aabf2b71", new Object[]{this, str, str2, new Integer(i)}) : new dig(str, str2, i);
    }
}
