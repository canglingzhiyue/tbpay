package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ari<INPUT extends Serializable, OUTPUT extends Serializable> extends arh<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private aqq<OUTPUT> f25529a;
    private final arj b;

    static {
        kge.a(-1186592849);
    }

    public static /* synthetic */ Object ipc$super(ari ariVar, String str, Object... objArr) {
        if (str.hashCode() == -1117259578) {
            super.onExecute((AURAInputData) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ aqq a(ari ariVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("d994bee5", new Object[]{ariVar}) : ariVar.f25529a;
    }

    public ari(arj arjVar) {
        this.b = arjVar;
    }

    @Override // tb.arh
    public void setCallback(aqq<OUTPUT> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ede165d", new Object[]{this, aqqVar});
        } else {
            this.f25529a = aqqVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.arh
    public void onExecute(AURAInputData<INPUT> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd67f8c6", new Object[]{this, aURAInputData});
            return;
        }
        super.onExecute(aURAInputData);
        this.b.a(aURAInputData, new aqq<OUTPUT>() { // from class: tb.ari.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                } else {
                    ari.a(ari.this).a(bVar);
                }
            }

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                } else {
                    ari.a(ari.this).a(cVar);
                }
            }

            @Override // tb.aqq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ari.a(ari.this).a();
                }
            }
        });
    }
}
