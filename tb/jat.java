package tb;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbg;

/* loaded from: classes.dex */
public class jat implements jbg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f29441a;
    private static final jas[] b = new jas[jax.f29443a];
    private static final jas[] c = new jas[jax.f29443a];

    @Override // tb.jbg.a
    public HandlerThread a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("578e15aa", new Object[]{this, str});
        }
        if (jax.a(str) == 2) {
            int i = f29441a;
            f29441a = i + 1;
            jas[] jasVarArr = b;
            int length = i % jasVarArr.length;
            f29441a = length;
            if (jasVarArr[length] == null) {
                synchronized (jasVarArr) {
                    if (b[length] == null) {
                        jas[] jasVarArr2 = b;
                        jasVarArr2[length] = new jas("global-handler" + length);
                    }
                }
            }
            return b[length];
        }
        return new HandlerThread(str);
    }

    @Override // tb.jbg.a
    public HandlerThread highHandlerThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("90793a79", new Object[]{this, str});
        }
        if (jax.a(str) == 2) {
            int i = f29441a;
            f29441a = i + 1;
            int length = i % b.length;
            f29441a = length;
            jas[] jasVarArr = c;
            if (jasVarArr[length] == null) {
                synchronized (jasVarArr) {
                    if (c[length] == null) {
                        jas[] jasVarArr2 = c;
                        jasVarArr2[length] = new jas("global-high-handler" + length);
                    }
                }
            }
            return c[length];
        }
        return new HandlerThread(str);
    }
}
