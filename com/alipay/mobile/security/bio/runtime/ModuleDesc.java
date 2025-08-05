package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.security.bio.runtime.FrameworkDesc;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.service.local.NotImplementedException;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ModuleDesc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "local_services")
    public List<LocalServiceDesc> localServiceDescs;
    public List<BioMetaInfo> mBioMetaInfoList;
    public List<BioServiceDescription> mBioServiceDescription;
    public String mBundleName;
    @JSONField(name = "meta_info")
    public List<String> metaInfoList;

    /* loaded from: classes3.dex */
    public static class LocalServiceDesc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "class")
        public String className;
        @JSONField(name = a.ATOM_interface)
        public String interfaceName;
        @JSONField(name = "essential")
        public boolean isEssential = true;
        @JSONField(name = "lazy")
        public boolean isLazy = true;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "LocalServiceDesc{interfaceName='" + this.interfaceName + "', isEssential=" + this.isEssential + ", className='" + this.className + "', isLazy=" + this.isLazy + '}';
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ModuleDesc{metaInfoList=" + StringUtil.collection2String(this.metaInfoList) + ", localServiceDescs=" + StringUtil.collection2String(this.localServiceDescs) + '}';
    }

    public static ModuleDesc create(Context context, boolean z, FrameworkDesc.ConfigDesc configDesc) {
        byte[] assetsData;
        Resources resourcesByBundleName;
        byte[] assetsData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleDesc) ipChange.ipc$dispatch("3bace670", new Object[]{context, new Boolean(z), configDesc});
        }
        ModuleDesc moduleDesc = null;
        String str = (TextUtils.isEmpty(configDesc.bundleName) || !configDesc.dynamic || !z || (resourcesByBundleName = Runtime.getResourcesByBundleName(configDesc.bundleName)) == null || (assetsData2 = FileUtil.getAssetsData(resourcesByBundleName, configDesc.configFileName)) == null || assetsData2.length <= 0) ? null : new String(assetsData2);
        if (TextUtils.isEmpty(str) && (assetsData = FileUtil.getAssetsData(context.getResources(), configDesc.configFileName)) != null && assetsData.length > 0) {
            str = new String(assetsData);
        }
        if (!TextUtils.isEmpty(str)) {
            moduleDesc = (ModuleDesc) JSON.parseObject(str, ModuleDesc.class);
            moduleDesc.mBundleName = configDesc.bundleName;
            List<String> list = moduleDesc.metaInfoList;
            if (list != null && !list.isEmpty()) {
                moduleDesc.mBioMetaInfoList = new ArrayList(moduleDesc.metaInfoList.size());
                for (String str2 : moduleDesc.metaInfoList) {
                    BioMetaInfo a2 = a(context, z, str2, configDesc.bundleName);
                    if (a2 != null) {
                        moduleDesc.mBioMetaInfoList.add(a2);
                    }
                }
            }
            List<LocalServiceDesc> list2 = moduleDesc.localServiceDescs;
            if (list2 != null && !list2.isEmpty()) {
                moduleDesc.mBioServiceDescription = new ArrayList(moduleDesc.localServiceDescs.size());
                for (LocalServiceDesc localServiceDesc : moduleDesc.localServiceDescs) {
                    if (localServiceDesc.isEssential) {
                        TextUtils.isEmpty(localServiceDesc.className);
                    }
                    if (TextUtils.isEmpty(localServiceDesc.className) || TextUtils.isEmpty(localServiceDesc.interfaceName)) {
                        throw new RuntimeException("Invalid LocalServiceDesc: " + localServiceDesc);
                    }
                    BioServiceDescription a3 = a(context, z, localServiceDesc, configDesc.bundleName);
                    if (a3 != null) {
                        moduleDesc.mBioServiceDescription.add(a3);
                    }
                }
            }
        }
        return moduleDesc;
    }

    private static BioMetaInfo a(Context context, boolean z, String str, String str2) {
        try {
            return (BioMetaInfo) Runtime.loadClass(context, z, str, str2).newInstance();
        } catch (Throwable th) {
            BioLog.e(Runtime.TAG, "Failed to createMetaInfo: " + str, th);
            return null;
        }
    }

    private static BioServiceDescription a(Context context, boolean z, LocalServiceDesc localServiceDesc, String str) {
        BioServiceDescription bioServiceDescription;
        Class<?> loadClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioServiceDescription) ipChange.ipc$dispatch("8b8df88e", new Object[]{context, new Boolean(z), localServiceDesc, str});
        }
        try {
            loadClass = Runtime.loadClass(context, z, localServiceDesc.className, str);
        } catch (Throwable th) {
            th = th;
            bioServiceDescription = null;
        }
        if (loadClass == null) {
            throw new NotImplementedException();
        }
        bioServiceDescription = new BioServiceDescription();
        try {
            bioServiceDescription.setClazz(loadClass);
            bioServiceDescription.setInterfaceName(localServiceDesc.interfaceName);
            bioServiceDescription.setLazy(localServiceDesc.isLazy);
        } catch (Throwable th2) {
            th = th2;
            BioLog.e(Runtime.TAG, "Failed to create LocalServiceDescription: LocalServiceDesc=" + localServiceDesc + ", isOnQuinox=" + z + ", bundleName=" + str, th);
            return bioServiceDescription;
        }
        return bioServiceDescription;
    }
}
