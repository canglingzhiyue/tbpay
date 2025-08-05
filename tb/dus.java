package tb;

import android.content.Context;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.k;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class dus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f27000a;
    private final Context b;
    private final duu c;
    private k d;
    private HashMap<String, Object> e;

    static {
        kge.a(-1548823209);
        f27000a = !dus.class.desiredAssertionStatus();
    }

    public dus(Context context, duu duuVar) {
        this.b = context;
        this.c = duuVar;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = new HashMap<>();
        }
    }

    private k c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4c9f2b1b", new Object[]{this});
        }
        if (this.d == null) {
            this.d = k.a(new q(this.b, this.e)).a(new AURAAliBuyCorePluginCenter());
            AURAPluginContainerNodeModel c = this.c.c();
            if (c == null) {
                if (!f27000a && this.c.a() == null) {
                    throw new AssertionError();
                }
                this.d.a(this.c.a());
            } else {
                this.d.a(c);
            }
            IAURAPluginCenter[] b = this.c.b();
            if (b != null) {
                this.d.a(b);
            }
        }
        return this.d;
    }

    public void a(final dut dutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e005f5", new Object[]{this, dutVar});
            return;
        }
        if (this.d == null) {
            this.d = c();
        }
        List<IAURAInputField> c = dutVar.c();
        if (!bau.a(c)) {
            for (IAURAInputField iAURAInputField : c) {
                this.d.a(iAURAInputField);
            }
        }
        this.d.a(dutVar.b(), dutVar.a(), new aqq() { // from class: tb.dus.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                Serializable b = cVar.b();
                if (dutVar.d() == null) {
                    return;
                }
                dutVar.d().onData(b);
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                ard a2 = arc.a();
                a2.c("AliBuyService", BaseExecutor.EXECUTOR_SUFFIX, "error =" + bVar);
                if (dutVar.d() == null) {
                    return;
                }
                dutVar.d().onError("AURAError", "AURA exception", bVar);
            }

            @Override // tb.aqq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (dutVar.d() == null) {
                } else {
                    dutVar.d().onComplete();
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k kVar = this.d;
        if (kVar == null) {
            return;
        }
        kVar.a();
    }
}
