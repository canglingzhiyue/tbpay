package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static BaseSectionModel f17398a;
    private static BaseSectionModel b;

    static {
        kge.a(392625388);
    }

    public static BaseSectionModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("97068376", new Object[0]);
        }
        if (f17398a == null) {
            f17398a = new ErrorCardModel();
        }
        return f17398a;
    }

    public static BaseSectionModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("19513855", new Object[0]);
        }
        if (b == null) {
            b = new LoadingCardModel();
        }
        return b;
    }
}
