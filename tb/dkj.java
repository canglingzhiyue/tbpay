package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class dkj implements dkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.dkl
    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.dkl
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.dkl
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.dkl
    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.dkl
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "";
    }

    @Override // tb.dkl, com.taobao.android.ab.api.c
    public Iterator<b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("88a51a0f", new Object[]{this}) : Collections.emptyList().iterator();
    }
}
