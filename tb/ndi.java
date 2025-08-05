package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ndi extends lgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ndi(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.lgz, com.taobao.infoflow.protocol.engine.invoke.biz.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
