package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class FrameworkDesc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSETS_NAME_ZOLOZ_FRAMEWORK = "zoloz_framework.json";
    public static final String BUNDLE_NAME_BIOMETRIC = "android-phone-securitycommon-biometric";
    @JSONField(name = "configs")
    public List<ConfigDesc> configs;
    @JSONField(name = "framework_version")
    public String frameworkVersion;

    /* loaded from: classes3.dex */
    public static class ConfigDesc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "bundle_name")
        public String bundleName;
        @JSONField(name = "config_file_name")
        public String configFileName;
        @JSONField(name = "dynamic")
        public boolean dynamic = false;
        @JSONField(name = "dev")
        public boolean dev = false;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ConfigDesc{bundleName='" + this.bundleName + "', configFileName='" + this.configFileName + "', dynamic='" + this.dynamic + "', dev='" + this.dev + "'}";
        }
    }

    public static FrameworkDesc create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameworkDesc) ipChange.ipc$dispatch("2091a2e8", new Object[]{context});
        }
        String str = null;
        byte[] assetsData = FileUtil.getAssetsData(context.getResources(), ASSETS_NAME_ZOLOZ_FRAMEWORK);
        if (assetsData == null || assetsData.length == 0) {
            BioLog.w("Failed to read zoloz_framework.json, from context.getResources()");
        } else {
            str = new String(assetsData);
        }
        if (StringUtils.isEmpty(str) && Runtime.isRunningOnQuinox(context)) {
            Resources resourcesByBundleName = Runtime.getResourcesByBundleName(BUNDLE_NAME_BIOMETRIC);
            if (resourcesByBundleName == null) {
                BioLog.w("Failed to getResourcesByBundleName(android-phone-securitycommon-biometric)");
            } else {
                byte[] assetsData2 = FileUtil.getAssetsData(resourcesByBundleName, ASSETS_NAME_ZOLOZ_FRAMEWORK);
                if (assetsData2 == null || assetsData2.length == 0) {
                    BioLog.w("Failed to read zoloz_framework.json, from getResourcesByBundleName(android-phone-securitycommon-biometric)");
                } else {
                    str = new String(assetsData2);
                }
            }
        }
        if (StringUtils.isEmpty(str)) {
            throw new BioIllegalArgumentException("Failed to read 'zoloz_bio_framework.json', bio module can't work.");
        }
        FrameworkDesc frameworkDesc = (FrameworkDesc) JSON.parseObject(str, FrameworkDesc.class);
        BioLog.i("create frameworkDesc : " + frameworkDesc);
        return frameworkDesc;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FrameworkDesc{frameworkVersion='" + this.frameworkVersion + "', configs=" + this.configs + '}';
    }
}
