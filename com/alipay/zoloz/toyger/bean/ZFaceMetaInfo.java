package com.alipay.zoloz.toyger.bean;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.config.BisRuntimeInfoEnum;
import com.alipay.mobile.security.bio.config.BisSdkModuleEnum;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.toyger.ToygerMetaInfo;
import com.alipay.zoloz.toyger.extservice.ToygerIspService;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.workspace.GarfieldActivity;
import com.alipay.zoloz.toyger.workspace.ToygerActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ZFaceMetaInfo extends BioMetaInfo implements INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ZFaceMetaInfo() {
        BioAppDescription bioAppDescription = new BioAppDescription();
        bioAppDescription.setBioType(100);
        bioAppDescription.setBioAction(992);
        bioAppDescription.setAppName(ToygerActivity.class.getName());
        bioAppDescription.setAppInterfaceName(ToygerActivity.class.getName());
        addApplication(bioAppDescription);
        BioAppDescription bioAppDescription2 = new BioAppDescription();
        bioAppDescription2.setBioType(100);
        bioAppDescription2.setBioAction(993);
        bioAppDescription2.setAppName(GarfieldActivity.class.getName());
        bioAppDescription2.setAppInterfaceName(GarfieldActivity.class.getName());
        addApplication(bioAppDescription2);
        BioServiceDescription bioServiceDescription = new BioServiceDescription();
        bioServiceDescription.setClazz(ToygerRecordService.class);
        bioServiceDescription.setInterfaceName(ToygerRecordService.class.getName());
        addExtService(bioServiceDescription);
        BioServiceDescription bioServiceDescription2 = new BioServiceDescription();
        bioServiceDescription2.setClazz(ToygerIspService.class);
        bioServiceDescription2.setInterfaceName(ToygerIspService.class.getName());
        addExtService(bioServiceDescription2);
        if (TextUtils.equals("Cherry", "Cherry")) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_DARK.getProductID()));
        }
        if (ToygerMetaInfo.isGemini()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_GEMINI.getProductID()));
        }
        if (ToygerMetaInfo.isBat()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_3D.getProductID()));
        }
        if (ToygerMetaInfo.isBlink()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_ZFACE_BLINK.getProductID()));
        }
        if (ToygerMetaInfo.isSensor()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_ZSENSOR.getProductID()));
        }
        if (ToygerMetaInfo.isDepth()) {
            addProductID(Long.valueOf(BisSdkModuleEnum.SME_DEPTH.getProductID()));
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioMetaInfo
    public List<Integer> getRuntimeInfoIDs(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96d2fb3b", new Object[]{this, context, map});
        }
        BioLog.i("IFAAMETA is or not usable ");
        if (!ToygerMetaInfo.isLocalMatchingUsable(context, map)) {
            return null;
        }
        BioLog.i("IFAAMETA is usable");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(BisRuntimeInfoEnum.LOCAL_FACE_COMPARE.getProductID()));
        return arrayList;
    }

    @Override // com.alipay.mobile.security.bio.service.BioMetaInfo
    public List<Long> getProductIDs(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50ce47e5", new Object[]{this, context});
        }
        ArrayList arrayList = new ArrayList();
        BioLog.i("IFAAMETA is or not supported ");
        if (ToygerMetaInfo.isSupportLocalMatching(context)) {
            BioLog.i("IFAAMETA is  supported ");
            arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_LOCAL_TEE.getProductID()));
        }
        if (Runtime.checkBioResWhenUpdate(context.getApplicationContext())) {
            arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_PANO.getProductID()));
            if (TextUtils.equals("Cherry", "Cherry")) {
                arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_GARFI.getProductID()));
            }
            arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_ZFACE_CHERRY.getProductID()));
            if (ToygerMetaInfo.isSupportNano(context)) {
                BioLog.i("NANO is support ");
                arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_NANO.getProductID()));
            }
            if (ToygerMetaInfo.isDragonfly(context)) {
                BioLog.i("Dragonfly is support ");
                arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_DRAGONFLY.getProductID()));
            }
            if (ToygerMetaInfo.isSupportGrayNano()) {
                BioLog.i("GrayNano is support ");
                arrayList.add(Long.valueOf(BisSdkModuleEnum.SME_GRAY_NANO.getProductID()));
            }
        }
        return arrayList;
    }

    @Override // com.alipay.mobile.security.bio.service.BioMetaInfo
    public String getRevision(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e8dad30", new Object[]{this, context}) : ToygerMetaInfo.ifaaVersion(context);
    }
}
