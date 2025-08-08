package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.kge;
import tb.kyu;
import tb.lkz;

/* loaded from: classes7.dex */
public class c implements lkz.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17502a;

    static {
        kge.a(-650782282);
        kge.a(-357951963);
    }

    @Override // tb.lkz.a
    public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        }
    }

    @Override // tb.lkz.a
    public void a_(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34bf30d", new Object[]{this, view});
        }
    }

    public c(kyu kyuVar) {
        this.f17502a = kyuVar;
    }

    @Override // tb.lkz.a
    public void a(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
            return;
        }
        String a2 = a(baseSectionModel);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        this.f17502a.c().a(i, view, a2);
    }

    @Override // tb.lkz.a
    public void b(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
            return;
        }
        String a2 = a(baseSectionModel);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        this.f17502a.c().b(i, view, a2);
    }

    private String a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bc5cf0", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel != null) {
            return baseSectionModel.getSectionBizCode();
        }
        return null;
    }
}
