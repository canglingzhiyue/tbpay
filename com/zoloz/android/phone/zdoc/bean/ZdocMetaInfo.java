package com.zoloz.android.phone.zdoc.bean;

import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.config.BisSdkModuleEnum;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.zoloz.android.phone.zdoc.activities.FalconCardNativeActivityNew;
import tb.kge;
import tb.rrv;

/* loaded from: classes9.dex */
public class ZdocMetaInfo extends BioMetaInfo implements INotProguard {
    static {
        kge.a(220893275);
    }

    public ZdocMetaInfo() {
        BioAppDescription bioAppDescription = new BioAppDescription();
        bioAppDescription.setBioType(110);
        bioAppDescription.setBioAction(0);
        bioAppDescription.setAppName(FalconCardNativeActivityNew.class.getName());
        bioAppDescription.setAppInterfaceName(FalconCardNativeActivityNew.class.getName());
        addApplication(bioAppDescription);
        BioServiceDescription bioServiceDescription = new BioServiceDescription();
        bioServiceDescription.setClazz(rrv.class);
        bioServiceDescription.setInterfaceName(rrv.class.getName());
        addExtService(bioServiceDescription);
        addProductID(Long.valueOf(BisSdkModuleEnum.SME_UDOC.getProductID()));
    }
}
