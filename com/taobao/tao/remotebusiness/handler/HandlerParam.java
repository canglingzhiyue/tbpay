package com.taobao.tao.remotebusiness.handler;

import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.Serializable;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes.dex */
public class HandlerParam implements Serializable {
    private static final long serialVersionUID = 9196408638670689787L;
    public MtopEvent event;
    public MtopListener listener;
    public MtopBusiness mtopBusiness;
    public MtopResponse mtopResponse;
    public BaseOutDo pojo;

    static {
        kge.a(-787701487);
        kge.a(1028243835);
    }

    public HandlerParam(MtopListener mtopListener, MtopEvent mtopEvent, MtopBusiness mtopBusiness) {
        this.listener = mtopListener;
        this.event = mtopEvent;
        this.mtopBusiness = mtopBusiness;
    }
}
