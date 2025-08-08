package com.ali.user.mobile.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.model.CountryCode;
import com.ali.user.mobile.model.RegionInfo;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class CountryUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CountryUtil";

    static {
        kge.a(-2041791470);
    }

    public static RegionInfo matchRegionFromLocal(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("21c64952", new Object[]{context, str});
        }
        RegionInfo regionInfo = new RegionInfo();
        if (!StringUtils.isEmpty(str)) {
            List list = null;
            try {
                list = JSON.parseArray(context.getString(R.string.aliuser_hot_region_list), CountryCode.class);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CountryCode countryCode = (CountryCode) it.next();
                    if (StringUtils.equals(str.toLowerCase(), countryCode.domain.toLowerCase())) {
                        regionInfo.name = countryCode.name;
                        regionInfo.code = countryCode.code;
                        regionInfo.checkPattern = countryCode.checkPattern;
                        regionInfo.domain = countryCode.domain;
                        break;
                    }
                }
            }
        }
        if (StringUtils.isEmpty(regionInfo.name)) {
            regionInfo.name = "中国大陆";
            regionInfo.code = "+86";
            regionInfo.checkPattern = "^(86){0,1}1\\d{10}$";
            regionInfo.domain = "CN";
        }
        return regionInfo;
    }

    public static boolean supportOverseaSimLogin(AppLaunchInfoResponseData appLaunchInfoResponseData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef6b83c7", new Object[]{appLaunchInfoResponseData})).booleanValue() : supportOverseaSimLogin(appLaunchInfoResponseData, DataProviderFactory.getDataProvider().getCurrentRegion(), false);
    }

    public static boolean supportOverseaSimLogin(AppLaunchInfoResponseData appLaunchInfoResponseData, RegionInfo regionInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bec08fd6", new Object[]{appLaunchInfoResponseData, regionInfo, new Boolean(z)})).booleanValue();
        }
        if (!LoginSwitch.getSwitch(LoginSwitch.SUPPORT_OVERSEA_SIMLOGIN, "true")) {
            LoginTLogAdapter.e(TAG, "supportOverseaSimLogin: orange not support");
            return false;
        }
        boolean z2 = appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0 && ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).supportOverseaSimLogin && ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).fromOversea;
        boolean z3 = z2 && regionInfo != null && (!z ? StringUtils.equals(regionInfo.code, ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).phoneCode) : StringUtils.equals(regionInfo.code, ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).regPhoneCode));
        LoginTLogAdapter.e(TAG, "supportOverseaSimLogin:" + z2 + " supportRegionInfo:" + z3);
        return z2 && z3;
    }
}
