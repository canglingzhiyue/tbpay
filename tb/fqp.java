package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte BranchBlock = 5;
    public static final byte Const = 3;
    public static final byte Event = 6;
    public static final byte Method = 1;
    public static final byte None = 0;
    public static final byte Script = 7;
    public static final byte SerialBlock = 4;
    public static final byte Var = 2;

    /* renamed from: a  reason: collision with root package name */
    public byte f28129a;
    public fqp b;
    public List<fqp> c;
    public long d;
    public String e;
    private short f;

    static {
        kge.a(-880848849);
    }

    public void a(fqp fqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90f87b3", new Object[]{this, fqpVar});
        } else if (fqpVar == null) {
        } else {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            fqpVar.b = this;
            this.c.add(fqpVar);
        }
    }

    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext}) : this.e;
    }

    public short a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c65", new Object[]{this})).shortValue() : this.f;
    }

    public void a(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821b925", new Object[]{this, new Short(s)});
        } else {
            this.f = s;
        }
    }

    public String toString() {
        Iterator<fqp> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isEmpty(this.e) ? Long.valueOf(this.d) : this.e);
        sb.append(":");
        String sb2 = sb.toString();
        List<fqp> list = this.c;
        if (list != null) {
            while (list.iterator().hasNext()) {
                sb2 = sb2 + it.next().toString();
            }
        }
        return sb2;
    }
}
