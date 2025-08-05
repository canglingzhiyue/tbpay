package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.data.request.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.j;

/* loaded from: classes2.dex */
public class bcu extends bcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IDMComponent i;

    static {
        kge.a(-52556949);
    }

    public bcu(bcb bcbVar, Context context, c cVar) {
        super(bcbVar, context, cVar);
    }

    public jnw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnw) ipChange.ipc$dispatch("f067fcb", new Object[]{this}) : c();
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.i = iDMComponent;
        }
    }

    @Override // tb.bcq
    public j a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("e3ef30c5", new Object[]{this, jnyVar}) : a().a(this.i, jnyVar);
    }

    @Override // tb.bcq
    public void a(jnv jnvVar, jny jnyVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e1001d", new Object[]{this, jnvVar, jnyVar, obj});
        } else if (this.i == null) {
            throw new IllegalStateException("we find you not call setTrigger() method first before you call AdjustCartRequester's sendRequest() method");
        } else {
            this.c.A().a(this.b, new bct(jnvVar));
        }
    }
}
