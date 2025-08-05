package com.taobao.update.dynamicfeature.processor;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.split.k;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import tb.kge;
import tb.rfy;
import tb.rge;
import tb.rgf;
import tb.rgq;

/* loaded from: classes9.dex */
public class d implements com.taobao.update.framework.b<com.taobao.update.dynamicfeature.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rge f23407a = rgf.getLog(d.class, (rge) null);

    static {
        kge.a(1478795371);
        kge.a(-386319410);
    }

    @Override // com.taobao.update.framework.b
    public void execute(com.taobao.update.dynamicfeature.b bVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431fae6e", new Object[]{this, bVar});
            return;
        }
        bVar.stage = "install";
        this.f23407a.w("FeatureInstallProcessor start");
        String[] strArr = new String[bVar.featureUpdateData.updateFeatures.size()];
        HashSet hashSet = new HashSet();
        for (int i = 0; i < bVar.featureUpdateData.updateFeatures.size(); i++) {
            strArr[i] = bVar.featureUpdateData.updateFeatures.get(i).featureName;
            hashSet.add(strArr[i]);
        }
        rge rgeVar = this.f23407a;
        rgeVar.w("FeatureInstallProcessor update:" + String.valueOf(bVar.featureUpdateData.featureUpdateVersion) + bVar.featureUpdateData.updateFeatures);
        try {
            z = k.a().a((Context) rfy.sContext, true, String.valueOf(bVar.featureUpdateData.featureUpdateVersion), strArr);
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            if (bVar.newUpdate) {
                com.android.tools.bundleInfo.d.a().a(rgq.getVersionName(), String.valueOf(bVar.featureUpdateData.featureUpdateVersion), Boolean.valueOf(bVar.featureUpdateData.beta).booleanValue(), hashSet);
                for (FeatureUpdateData.FeatureInfo featureInfo : bVar.featureUpdateData.updateFeatures) {
                    com.android.tools.bundleInfo.d.a().a(featureInfo.featureName, featureInfo.version);
                }
                return;
            }
            com.android.tools.bundleInfo.c.a().a(rgq.getVersionName(), String.valueOf(bVar.featureUpdateData.featureUpdateVersion), Boolean.valueOf(bVar.featureUpdateData.beta).booleanValue(), hashSet);
            for (FeatureUpdateData.FeatureInfo featureInfo2 : bVar.featureUpdateData.updateFeatures) {
                com.android.tools.bundleInfo.c.a().a(featureInfo2.featureName, featureInfo2.version);
            }
            return;
        }
        bVar.success = false;
        bVar.errorCode = -6;
        bVar.errorMsg = Constants.getMsg(-6);
    }

    public void deprecatedHisUpdateVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b4bc1", new Object[]{this, str});
            return;
        }
        try {
            File[] listFiles = new File(k.a().b().o(), "features-update").listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                if (TextUtils.equals(str, file.getName())) {
                    a(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            return;
        }
        try {
            new File(file, CountValue.T_DEPRECATED).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
