package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.model.CCRCRiskSample;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Eb {
    String a();

    void a(InterfaceC1251tb interfaceC1251tb);

    void a(String str, InterfaceC1254ub interfaceC1254ub);

    boolean a(String str);

    String algoCode();

    boolean b();

    boolean c();

    Map<String, Object> detect(CCRCRiskSample cCRCRiskSample);

    void release();
}
