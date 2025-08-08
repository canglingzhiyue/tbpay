package com.alipay.mobile.verifyidentity.bio;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class BioPreOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static StringBuffer f5857a = new StringBuffer();
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static String f = "fp";

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f = str;
        }
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        VerifyLogCat.i("Verifyidentity", "预开通启动.......");
        if (StringUtils.isEmpty(str)) {
            VerifyLogCat.i("Verifyidentity", "bizId为空，预开通启动失败");
            return 1;
        } else if (c.equals(str)) {
            VerifyLogCat.i("Verifyidentity", "bizId和上次传入一致，不做重复预开通");
            return 2;
        } else if (StringUtils.isEmpty(str2)) {
            VerifyLogCat.i("Verifyidentity", "userId为空，预开通失败");
            return 1;
        } else {
            c = str;
            e = str2;
            b.set(true);
            VerifyLogCat.i("Verifyidentity", "bizId：" + c + "预开通启动正常");
            return 0;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b.set(false);
        if (f5857a.length() > 0) {
            f5857a.setLength(0);
        }
        c = "";
        e = "";
        d = "";
        VerifyLogCat.d("Verifyidentity", "预开通结束 重置标记信息 resetPreOpenBio done ");
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        VerifyLogCat.e("Verifyidentity", "预开通本地信息：" + str);
        f5857a.append(str);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f5857a.toString();
    }

    public static Boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5a4bcb31", new Object[]{str});
        }
        d = str;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(c)) {
            return Boolean.valueOf(d.equals(c));
        }
        return false;
    }

    public static Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("efdd6667", new Object[0]);
        }
        VerifyLogCat.e("Verifyidentity", "SubmitOpenBio judge:bizId:" + c + " isNeedPreOpenBioPay:" + b + " preOpenResult:" + f5857a.toString() + " mTbsid:" + e);
        if (!b.get()) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：开关关闭");
            return false;
        } else if (StringUtils.isEmpty(c)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：bizId为空");
            return false;
        } else if (StringUtils.isEmpty(d)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：验证阶段bizId为空");
            return false;
        } else if (!d.equalsIgnoreCase(c)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：verifyBizId与bizId不一致");
            return false;
        } else if (StringUtils.isEmpty(f5857a.toString())) {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-7", Constants.VI_ENGINE_APPID, "obfp", "", "", null, new HashMap());
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：本地生物预开通信息为空,可能是由于超时导致的");
            return false;
        } else if (StringUtils.isEmpty(e)) {
            VerifyLogCat.e("Verifyidentity", "开通条件不满足：用户2088为空");
            return false;
        } else {
            VerifyLogCat.e("Verifyidentity", "满足预开通条件");
            return true;
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            b.set(false);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            b.set(true);
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : f.equalsIgnoreCase("faceId") ? "4" : "1";
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : f.equalsIgnoreCase("faceId") ? CommonConstant.FACEID_PAY : CommonConstant.FINGERPRINT_PAY;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : e;
    }
}
