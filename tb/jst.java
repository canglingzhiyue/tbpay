package tb;

import android.util.Log;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;

/* loaded from: classes6.dex */
public class jst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f29753a;

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        f29753a = i;
        return i;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : f29753a;
    }

    static {
        kge.a(930754610);
        f29753a = Integer.MIN_VALUE;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        g c = c.Companion.a().c();
        return (c == null || b.a().c("voice_assistant") == null || !c.a().contains("voice_assistant")) ? false : true;
    }

    public static void a(final jss jssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f000764e", new Object[]{jssVar});
            return;
        }
        final g c = c.Companion.a().c();
        if (c == null) {
            return;
        }
        c.a(new o() { // from class: tb.jst.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.listener.b
            public /* synthetic */ void onStateUpdate(m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                } else {
                    a(mVar);
                }
            }

            public void a(m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("398f1780", new Object[]{this, mVar});
                } else if (mVar.a() != jst.b()) {
                } else {
                    Log.e("caoxi", "install Remote status: " + mVar.b());
                    if (mVar.b() != 5) {
                        return;
                    }
                    jss jssVar2 = jss.this;
                    if (jssVar2 != null) {
                        jssVar2.a();
                    }
                    g gVar = c;
                    if (gVar == null) {
                        return;
                    }
                    gVar.b(this);
                }
            }
        });
        c.a(j.a().a("voice_assistant").a()).a(new e<Integer>() { // from class: tb.jst.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public void a(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                } else {
                    jst.a(num.intValue());
                }
            }
        });
    }
}
