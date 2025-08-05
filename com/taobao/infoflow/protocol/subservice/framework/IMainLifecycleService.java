package com.taobao.infoflow.protocol.subservice.framework;

import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lko;
import tb.lkp;
import tb.llb;
import tb.llc;
import tb.lld;
import tb.lle;

/* loaded from: classes.dex */
public interface IMainLifecycleService extends ISubService, lko, llb, lld {
    public static final String SERVICE_NAME = "FrameworkService";

    lkp getAppLifeCycleRegister();

    llc getPageLifeCycleRegister();

    lle getTabLifeCycleRegister();

    boolean isSelect();

    boolean isVisible();
}
