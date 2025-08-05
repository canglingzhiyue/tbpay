package com.taobao.tao.remotebusiness.listener;

import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import tb.kge;

/* loaded from: classes.dex */
public abstract class b {
    public MtopListener listener;
    public MtopBusiness mtopBusiness;

    static {
        kge.a(-2049952929);
    }

    public b(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        this.mtopBusiness = mtopBusiness;
        this.listener = mtopListener;
    }
}
