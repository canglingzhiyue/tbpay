package com.alibaba.android.aura.service.event;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAEventIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final d mEventModel;
    private final String mEventType;

    static {
        kge.a(-946290717);
    }

    public AURAEventIO(String str, d dVar) {
        this.mEventType = str;
        this.mEventModel = dVar;
    }

    public d getEventModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("89cfebaf", new Object[]{this});
        }
        d dVar = this.mEventModel;
        return dVar == null ? new d() : dVar;
    }

    public String getEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        String str = this.mEventType;
        return str == null ? "" : str;
    }
}
