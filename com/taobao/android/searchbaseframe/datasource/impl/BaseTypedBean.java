package com.taobao.android.searchbaseframe.datasource.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseTypedBean extends TypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String abtest;
    public String bizItemId;
    public String cardType;
    public String clickTrace;
    public String pageType;
    public String rn;

    static {
        kge.a(379938678);
    }

    public static /* synthetic */ Object ipc$super(BaseTypedBean baseTypedBean, String str, Object... objArr) {
        if (str.hashCode() == -2073377637) {
            super.copy((TypedBean) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.TypedBean
    public <T extends TypedBean> void copy(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846ac49b", new Object[]{this, t});
            return;
        }
        super.copy(t);
        BaseTypedBean baseTypedBean = (BaseTypedBean) t;
        baseTypedBean.rn = this.rn;
        baseTypedBean.abtest = this.abtest;
        baseTypedBean.pageType = this.pageType;
        baseTypedBean.clickTrace = this.clickTrace;
        baseTypedBean.cardType = this.cardType;
    }
}
