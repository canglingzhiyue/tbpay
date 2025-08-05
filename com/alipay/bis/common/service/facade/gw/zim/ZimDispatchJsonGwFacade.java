package com.alipay.bis.common.service.facade.gw.zim;

import com.alipay.vi.mobile.framework.service.annotation.OperationType;
import com.alipay.vi.mobile.framework.service.annotation.SignCheck;

/* loaded from: classes3.dex */
public interface ZimDispatchJsonGwFacade {
    @OperationType("com.zoloz.zhub.zim.init.json")
    @SignCheck
    ZimInitGwResponse initStandard(ZimInitGwRequest zimInitGwRequest);

    @OperationType("com.zoloz.zhub.zim.verify.json")
    @SignCheck
    ZimValidateGwResponse validateStandard(ZimValidateJsonGwRequest zimValidateJsonGwRequest);
}
