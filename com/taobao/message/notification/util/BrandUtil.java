package com.taobao.message.notification.util;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class BrandUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_COLOR = "#ffffff$#999999@default";
    public static final String TAG = "BrandUtil";
    private static final String mBrand;
    private static BrandUtil mBrandUtil;
    private static final String mModel;
    private static final String mRelease;

    static {
        kge.a(-191613243);
        mBrand = Build.BRAND;
        mModel = Build.MODEL.replace(" ", "");
        mRelease = Build.VERSION.RELEASE;
    }

    public static synchronized BrandUtil getInstance() {
        synchronized (BrandUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BrandUtil) ipChange.ipc$dispatch("dca6380e", new Object[0]);
            }
            if (mBrandUtil == null) {
                mBrandUtil = new BrandUtil();
            }
            return mBrandUtil;
        }
    }

    private String getUsefulColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a3a22", new Object[]{this});
        }
        TLog.loge(TAG, "BRAND=" + mBrand + ", MODEL=" + mModel + ", mRelease=" + mRelease);
        if (!TextUtils.isEmpty(mBrand) && !TextUtils.isEmpty(mModel) && !TextUtils.isEmpty(mRelease) && BrandList.mBrandMap.get(mBrand) != null && BrandList.mBrandMap.get(mBrand).get(mModel) != null && BrandList.mBrandMap.get(mBrand).get(mModel).get(mRelease) != null) {
            return BrandList.mBrandMap.get(mBrand).get(mModel).get(mRelease);
        }
        return null;
    }

    public String getTitleColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2889b8", new Object[]{this});
        }
        if (EmuiAdapter.isOn()) {
            TLog.logd(TAG, "EmuiAdapter is on");
            return DEFAULT_COLOR.substring(DEFAULT_COLOR.indexOf("#"), DEFAULT_COLOR.indexOf("$"));
        }
        String usefulColor = getUsefulColor();
        if (TextUtils.isEmpty(usefulColor)) {
            return null;
        }
        return usefulColor.substring(usefulColor.indexOf("#"), usefulColor.indexOf("$"));
    }

    public String getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
        }
        String usefulColor = getUsefulColor();
        if (!TextUtils.isEmpty(usefulColor) && !"default".equals(usefulColor)) {
            return usefulColor.substring(usefulColor.indexOf("@") + 1);
        }
        return null;
    }

    public String getContentColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e3fa19", new Object[]{this});
        }
        if (EmuiAdapter.isOn()) {
            TLog.logd(TAG, "EmuiAdapter is on");
            return DEFAULT_COLOR.substring(DEFAULT_COLOR.indexOf("$") + 1, DEFAULT_COLOR.indexOf("@"));
        }
        String usefulColor = getUsefulColor();
        if (TextUtils.isEmpty(usefulColor)) {
            return null;
        }
        return usefulColor.substring(usefulColor.indexOf("$") + 1, usefulColor.indexOf("@"));
    }

    public static boolean isVivo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("347e3281", new Object[0])).booleanValue() : mBrand.toLowerCase().equals("vivo");
    }

    public static boolean isOPPO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f03f1755", new Object[0])).booleanValue() : mBrand.toLowerCase().equals("oppo");
    }

    public static boolean isXiaoMi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9518cb0", new Object[0])).booleanValue() : Build.MANUFACTURER.equalsIgnoreCase("xiaomi");
    }

    public static boolean isHuawei() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2815d7bc", new Object[0])).booleanValue() : Build.MANUFACTURER.equalsIgnoreCase("huawei");
    }

    public static boolean isHonor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b602deb", new Object[0])).booleanValue() : Build.MANUFACTURER.equalsIgnoreCase("honor");
    }

    public boolean isVivoAnd5x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f59a2f", new Object[]{this})).booleanValue();
        }
        getInstance();
        return isVivo() && (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22);
    }

    public boolean shouldNotify() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("604dfd67", new Object[]{this})).booleanValue() : !isVivoAnd5x();
    }
}
