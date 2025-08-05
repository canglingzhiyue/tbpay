package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f28175a;
    private int b;
    private int c;

    static {
        kge.a(-1029107303);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        int i = this.c;
        if (i < 0) {
            fuw.b("读取新表达式相关逻辑失败");
            return false;
        }
        this.f28175a = new byte[i];
        fwrVar.c(this.b);
        for (int i2 = 0; i2 < this.c; i2++) {
            this.f28175a[i2] = fwrVar.d();
        }
        return true;
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.f28175a;
    }
}
