package com.alipay.mobile.common.amnet.service.events;

import java.util.Observer;

/* loaded from: classes3.dex */
public interface ServiceLifeCycleListener extends Observer {
    public static final int STATE_ONBIND = 2;
    public static final int STATE_ONCREATE = 1;
    public static final int STATE_ONDESTROY = 5;
    public static final int STATE_ONUNBIND = 4;
    public static final int STATE_REBIND = 3;
}
