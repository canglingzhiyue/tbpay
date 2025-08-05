package com.android.dingtalk.share.ddsharemodule.plugin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import tb.kge;

/* loaded from: classes3.dex */
public class DDVersionCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1231505631);
    }

    public static int getSdkVersionFromMetaData(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59831fa2", new Object[]{context, new Integer(i)})).intValue();
        }
        int innerGetSdkVersionFromMetaData = innerGetSdkVersionFromMetaData(context, ShareConstant.DD_APP_PACKAGE, -1);
        return innerGetSdkVersionFromMetaData == -1 ? innerGetSdkVersionFromMetaData(context, ShareConstant.ALI_DD_APP_PACKAGE, i) : innerGetSdkVersionFromMetaData;
    }

    private static int innerGetSdkVersionFromMetaData(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83cd1e62", new Object[]{context, str, new Integer(i)})).intValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt(ShareConstant.DD_SDK_VERSION_META_KEY);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        return i;
    }
}
