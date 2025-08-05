package com.ali.user.mobile.register.model;

import com.ali.user.mobile.rpc.login.model.GroupedCountryCode;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class MtopCountryCodeContextResult implements Serializable {
    public List<GroupedCountryCode> countrycodes;
    public String mobile;
    public String sessionId;

    static {
        kge.a(1696986299);
        kge.a(1028243835);
    }
}
