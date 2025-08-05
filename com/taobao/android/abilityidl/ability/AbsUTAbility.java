package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsUTAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1544145107);
    }

    public abstract void commitEvent(als alsVar, fj fjVar, fh fhVar);

    public abstract com.alibaba.ability.result.g<UTPageSpmPreResult, ErrorResult> getPageSpmPre(als alsVar, fu fuVar);

    public abstract com.alibaba.ability.result.g<UTPageSpmUrlResult, ErrorResult> getPageSpmUrl(als alsVar, fu fuVar);

    public abstract void pageAppear(als alsVar, fk fkVar, fh fhVar);

    public abstract void pageAppearDonotSkip(als alsVar, fk fkVar, fh fhVar);

    public abstract void pageDisAppear(als alsVar, fu fuVar, fh fhVar);

    public abstract void requestPageAllProperties(als alsVar, fu fuVar, fi fiVar);

    public abstract void skipPage(als alsVar, fu fuVar, fh fhVar);

    public abstract void updateNextPageProperties(als alsVar, fl flVar, fh fhVar);

    public abstract void updateNextPageUtparam(als alsVar, fn fnVar, fh fhVar);

    public abstract void updateNextPageUtparamCnt(als alsVar, fm fmVar, fh fhVar);

    public abstract void updatePageName(als alsVar, fo foVar, fh fhVar);

    public abstract void updatePageProperties(als alsVar, fp fpVar, fh fhVar);

    public abstract void updatePageStatus(als alsVar, fq fqVar, fh fhVar);

    public abstract void updatePageUrl(als alsVar, fr frVar, fh fhVar);

    public abstract void updatePageUtparam(als alsVar, fs fsVar, fh fhVar);

    public abstract void updateSessionProperties(als alsVar, ft ftVar, fh fhVar);
}
