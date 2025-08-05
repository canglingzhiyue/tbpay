package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class oke extends lgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1012011663);
    }

    @Override // tb.lgz, com.taobao.infoflow.protocol.engine.invoke.biz.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public oke(ljs ljsVar) {
        super(ljsVar);
    }
}
