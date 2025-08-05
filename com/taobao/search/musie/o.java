package com.taobao.search.musie;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.Map;
import tb.irp;
import tb.iru;
import tb.ise;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes7.dex */
public class o extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<irp, ? extends o> CREATOR;
    private MuiseBean b;

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        if (str.hashCode() == 189826977) {
            super.a((MuiseBean) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.musie.q
    public void a(Map<String, Object> map, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adda4c", new Object[]{this, map, muiseBean});
        }
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((MuiseBean) obj);
        }
    }

    static {
        kge.a(589915127);
        CREATOR = new ise<irp, o>() { // from class: com.taobao.search.musie.o.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public o a(irp irpVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("238322cf", new Object[]{this, irpVar}) : new o(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
            }
        };
    }

    public o(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, templateBean, viewGroup, iurVar);
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5087a1", new Object[]{this, muiseBean});
            return;
        }
        this.b = muiseBean;
        super.a(muiseBean);
    }
}
