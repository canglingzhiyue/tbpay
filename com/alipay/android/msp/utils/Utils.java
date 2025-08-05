package com.alipay.android.msp.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.taobao.android.weex_framework.util.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import tb.nom;

/* loaded from: classes3.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String mCellInfo;
    private static long mGetCellTime;
    private static Boolean mIsRootDevice;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4 != 4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getLocaleDesByFlag(int r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.utils.Utils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r4)
            r1[r2] = r3
            java.lang.String r4 = "10009ea9"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L1a:
            r0 = 0
            r1 = -1
            if (r4 == r1) goto L39
            if (r4 == 0) goto L39
            if (r4 == r2) goto L35
            r1 = 2
            if (r4 == r1) goto L31
            r1 = 3
            if (r4 == r1) goto L2d
            r1 = 4
            if (r4 == r1) goto L39
        L2b:
            r4 = r0
            goto L3b
        L2d:
            java.lang.String r4 = "zh-HK"
            goto L3b
        L31:
            java.lang.String r4 = "zh-Hant"
            goto L3b
        L35:
            java.lang.String r0 = "zh-Hans"
            goto L2b
        L39:
            java.lang.String r4 = "en"
        L3b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.Utils.getLocaleDesByFlag(int):java.lang.String");
    }

    public static String getProtocol() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98ee17ab", new Object[0]) : "https";
    }

    public static synchronized int getBizId(String str) {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e7707c5c", new Object[]{str})).intValue();
            }
            return (str + System.currentTimeMillis() + new Random().nextInt(1000)).hashCode();
        }
    }

    public static String AliyunSlot(String str) {
        String str2;
        Exception e;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("769e5b3d", new Object[]{str});
        }
        try {
            lastIndexOf = str.lastIndexOf("&slot=\"");
        } catch (Exception e2) {
            str2 = str;
            e = e2;
        }
        if (lastIndexOf <= 0) {
            return str;
        }
        str2 = str.substring(0, lastIndexOf);
        try {
            EventLogUtil.logPayEvent("103619", "scene", "Utils.AliyunSlot", "order_str", str);
        } catch (Exception e3) {
            e = e3;
            LogUtil.printExceptionStackTrace(e);
            return str2;
        }
        return str2;
    }

    public static String getKernelVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60491f4", new Object[0]);
        }
        String formattedKernelVersion = getFormattedKernelVersion();
        int indexOf = formattedKernelVersion.indexOf("-");
        if (indexOf != -1) {
            formattedKernelVersion = formattedKernelVersion.substring(0, indexOf);
        }
        int indexOf2 = formattedKernelVersion.indexOf("\n");
        if (indexOf2 != -1) {
            formattedKernelVersion = formattedKernelVersion.substring(0, indexOf2);
        }
        return "Linux ".concat(String.valueOf(formattedKernelVersion));
    }

    private static String getFormattedKernelVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a4a78a4", new Object[0]);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (!matcher.matches() || matcher.groupCount() < 4) {
                return "Unavailable";
            }
            return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String getDefaultLocale(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6deac524", new Object[]{context});
        }
        if (context == null) {
            return Locale.getDefault().toString();
        }
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String getScreenResolution(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23782cd", new Object[]{context});
        }
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return String.valueOf(displayMetrics.widthPixels) + "*" + displayMetrics.heightPixels;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static String[] getActionParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("768827f2", new Object[]{str});
        }
        int indexOf = str.indexOf(40) + 1;
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == 0 || lastIndexOf == -1) {
            return null;
        }
        String[] split = str.substring(indexOf, lastIndexOf).split("' *, *'", -1);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                split[i] = split[i].trim().replaceAll("'", "").replaceAll("\"", "");
            }
        }
        return split;
    }

    public static String urlDecode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2495bf52", new Object[]{str});
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DATA, ErrorCode.DATA_URL_DECODE_EXCEPTION, e);
            return "";
        }
    }

    private static String getAlipaySdkVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7aaabbd1", new Object[]{str});
        }
        try {
            int indexOf = str.indexOf("bizcontext=");
            if (indexOf < 0) {
                return "";
            }
            JSONObject parseObject = JSONObject.parseObject(str.substring(indexOf + 12, str.length() - 1));
            return parseObject.containsKey(BizContext.KEY_SDK_VERSION) ? parseObject.getString(BizContext.KEY_SDK_VERSION) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isOptmizedSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f7e5bb", new Object[]{str})).booleanValue();
        }
        try {
            String alipaySdkVersion = getAlipaySdkVersion(str);
            if (!TextUtils.isEmpty(alipaySdkVersion)) {
                String[] split = alipaySdkVersion.split("\\.");
                int intValue = Integer.valueOf(split[2]).intValue();
                int intValue2 = Integer.valueOf(split[3]).intValue();
                int intValue3 = Integer.valueOf(split[4]).intValue();
                if (intValue > 3) {
                    return true;
                }
                if (intValue == 3 && intValue2 > 4) {
                    return true;
                }
                if (intValue == 3 && intValue2 == 4 && intValue3 > 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void addTaobaoSdkStartFlag(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2795e", new Object[]{context});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean(MspGlobalDefine.TAOBAO_SDK_START, true);
        edit.apply();
    }

    public static String truncateString(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a0af265", new Object[]{str, new Integer(i)}) : str == null ? "" : str.substring(0, Math.min(str.length(), i));
    }

    public static String bundle2string(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8eb31654", new Object[]{bundle});
        }
        if (bundle == null) {
            return null;
        }
        String str = "Bundle{";
        try {
            for (String str2 : bundle.keySet()) {
                str = str + " " + str2 + " => " + bundle.get(str2) + ";";
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return str + " }Bundle";
    }

    public static String map2string(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ddec2a9", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Map{");
        try {
            for (String str : map.keySet()) {
                sb.append(" ");
                sb.append(str);
                sb.append(" => ");
                sb.append(map.get(str));
                sb.append(";");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        sb.append(" }Map");
        return sb.toString();
    }

    public static JSONObject frameTplInfo2CommonTplInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("391a0897", new Object[]{jSONObject});
        }
        if (!jSONObject.containsKey("data")) {
            jSONObject.put("data", (Object) new JSONObject());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!jSONObject2.containsKey(MspConstants.bannerKey.MQP_TOKEN)) {
            jSONObject2.put(MspConstants.bannerKey.MQP_TOKEN, (Object) Long.valueOf(jSONObject.hashCode() + System.currentTimeMillis()));
        }
        jSONObject.put("data", (Object) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject jSONObject4 = jSONObject.getJSONObject("tplInfo");
            String string = jSONObject4.getString("tplHash");
            String string2 = jSONObject4.getString("tplId");
            if (!TextUtils.isEmpty(string) && !string2.contains(string) && !string2.contains("paycode-guide-banner") && !TextUtils.equals("true", PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_frame_tplhash_degrade"))) {
                string2 = string2 + "_" + string;
            }
            jSONObject3.put(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID, (Object) string2);
            if (TextUtils.isEmpty(jSONObject4.getString("tplVersion"))) {
                jSONObject4.put("tplVersion", "5.4.9");
            }
            if (TextUtils.isEmpty(jSONObject4.getString("time"))) {
                jSONObject4.put("time", "0001");
            }
            if (TextUtils.isEmpty(jSONObject4.getString("platform"))) {
                jSONObject4.put("platform", "android");
            }
            if (TextUtils.isEmpty(jSONObject4.getString("publishVersion"))) {
                jSONObject4.put("publishVersion", "150924");
            }
            jSONObject4.put("tplId", (Object) string2);
            jSONObject3.put("tpl", (Object) jSONObject4);
            jSONObject3.put("data", jSONObject.get("data"));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return jSONObject3;
    }

    public static String trimString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3f537fc", new Object[]{str});
        }
        String str2 = null;
        if (str == null || !str.contains("'")) {
            return null;
        }
        int indexOf = str.indexOf("'");
        int lastIndexOf = str.lastIndexOf("'");
        if (indexOf < lastIndexOf) {
            str2 = str.substring(indexOf + 1, lastIndexOf).replaceAll("'", "");
        }
        return str2 == null ? "" : str2;
    }

    private static boolean shouldGetCellInfo(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d125312", new Object[]{context})).booleanValue() : DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_NOT_ACQUIRE_CELL_INFO, false, context);
    }

    public static boolean shouldGetLocationInfo(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("96a4bc9f", new Object[]{context})).booleanValue() : DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_NOT_ACQUIRE_FINE_LOCATION, false, context);
    }

    public static String getCellInfo(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c51c9c5", new Object[]{context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - mGetCellTime < 15000) {
            return mCellInfo;
        }
        mGetCellTime = currentTimeMillis;
        mCellInfo = "-1;-1";
        try {
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (!shouldGetCellInfo(context)) {
            return mCellInfo;
        }
        if (PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            return mCellInfo;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        CellLocation cellLocation = null;
        if (ActivityCompat.checkSelfPermission(context, com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) == 0 || ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_cell_info_10556"), nom.VALUE_YES)) {
                return mCellInfo;
            }
            if (telephonyManager != null) {
                cellLocation = telephonyManager.getCellLocation();
            }
        }
        int i2 = -1;
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            int cid = gsmCellLocation.getCid();
            i2 = gsmCellLocation.getLac();
            i = cid;
        } else if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            i2 = cdmaCellLocation.getNetworkId();
            i = cdmaCellLocation.getBaseStationId();
        } else {
            i = -1;
        }
        mCellInfo = i2 + ";" + i;
        return mCellInfo;
    }

    private static String getRandomString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e176e26e", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static UUID randomUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UUID) ipChange.ipc$dispatch("fe3ff3a5", new Object[0]) : UUID.randomUUID();
    }

    public static boolean isDeviceRooted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20723d4c", new Object[0])).booleanValue();
        }
        if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_root_10556"), nom.VALUE_YES)) {
            return false;
        }
        Boolean bool = mIsRootDevice;
        if (bool != null) {
            return bool.booleanValue();
        }
        mIsRootDevice = Boolean.FALSE;
        try {
            mIsRootDevice = Boolean.valueOf(findBinary());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return mIsRootDevice.booleanValue();
    }

    private static boolean findBinary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c0c66a5", new Object[0])).booleanValue();
        }
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            if (new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static String getTriDesKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6c83877", new Object[0]) : getRandomString(24);
    }

    public static Bundle cleanParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("de592822", new Object[]{bundle});
        }
        bundle.remove(Constants.VI_ENGINE_VERIFYID);
        bundle.remove("token");
        bundle.remove("bizName");
        bundle.remove(Constants.VI_ENGINE_VERIFY_TYPE);
        bundle.remove("logonId");
        bundle.remove("sceneId");
        bundle.remove("bizId");
        bundle.remove(Constants.VI_ENGINE_FAST_BIZDATA);
        bundle.remove(Constants.VI_ENGINE_FAST_MODULENAME);
        bundle.remove("moduleData");
        return bundle;
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("b6364850", new Object[]{jSONObject}) : toBundle(null, jSONObject);
    }

    public static Bundle toBundle(Bundle bundle, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("91724444", new Object[]{bundle, jSONObject});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                try {
                    putIntoBundle(str, jSONObject.get(str), bundle);
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        }
        return bundle;
    }

    private static void putIntoBundle(String str, Object obj, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef846d76", new Object[]{str, obj, bundle});
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            bundle.putDouble(str, new BigDecimal(Float.toString(((Float) obj).floatValue())).doubleValue());
        } else if (!(obj instanceof JSON)) {
        } else {
            bundle.putString(str, ((JSON) obj).toJSONString());
        }
    }

    public static boolean isPkgInstalled(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1cd0857", new Object[]{context, str})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 64) != null;
        } catch (Throwable th) {
            LogUtil.record(1, "isPkgInstalled:".concat(String.valueOf(str)), th.getMessage());
            return false;
        }
    }

    public static String toJsJsonString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8070a032", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\u2028", "\\u2028").replace("\u2029", "\\u2029");
    }

    public static boolean greaterThanVersion_Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9a493a", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        return Build.VERSION.SDK_INT == 28 && Build.VERSION.PREVIEW_SDK_INT > 0;
    }

    public static Signature[] getRawSignature(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature[]) ipChange.ipc$dispatch("8a8e40fd", new Object[]{context, str});
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            LogUtil.record(2, "MspPayApp:getRawSignature", "getRawSignature, packageName=".concat(String.valueOf(str)));
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    return packageInfo.signatures;
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return null;
    }

    public static String getSignatureString(Signature signature, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3180049", new Object[]{signature, str});
        }
        try {
            byte[] byteArray = signature.toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "";
            }
            byte[] digest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public static boolean isMspInProcessTask(boolean z, Activity activity) {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e001a554", new Object[]{new Boolean(z), activity})).booleanValue();
        }
        if (z) {
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23 && (activityManager = (ActivityManager) activity.getSystemService("activity")) != null) {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                for (int i = 0; i < appTasks.size(); i++) {
                    ActivityManager.RecentTaskInfo taskInfo = appTasks.get(i).getTaskInfo();
                    if (taskInfo != null) {
                        int taskId = activity.getTaskId();
                        int i2 = taskInfo.id;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i2 = taskInfo.taskId;
                        }
                        LogUtil.record(2, "Utils:getAppTasks", "id=" + taskId + " ,processTaskId=" + i2);
                        if (taskId == i2) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    public static void sendToDocument(final EventAction eventAction, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202c70c0", new Object[]{eventAction, str});
            return;
        }
        if (!JsonUtil.isJsonObjectString(str) && !JsonUtil.isJsonArrayString(str)) {
            str = "{}";
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(eventAction.getBizId());
        if (mspContextByBizId != null && mspContextByBizId.isUseSafeJsExecute()) {
            try {
                FBDocument invokeDoc = eventAction.getInvokeDoc();
                long invokeFunKey = eventAction.getInvokeFunKey();
                if (invokeFunKey == 0) {
                    return;
                }
                MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, str);
                return;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.utils.Utils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    FBDocument invokeDoc2 = EventAction.this.getInvokeDoc();
                    long invokeFunKey2 = EventAction.this.getInvokeFunKey();
                    if (invokeFunKey2 == 0) {
                        return;
                    }
                    JSPlugin.sendNativeResult(invokeDoc2, invokeFunKey2, str);
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
        });
    }

    public static boolean isConfigJsonContainsTarget(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5c5fc81", new Object[]{str, str2, str3, str4, str5})).booleanValue();
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray(str3);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(str4);
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    String string = optJSONArray2.getString(i);
                    if (str2.equals(string) || str5.equals(string)) {
                        break;
                    }
                }
            }
            z = false;
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        if (str2.equals(optJSONArray.getString(i2))) {
                            return false;
                        }
                    } catch (Exception e) {
                        e = e;
                        z2 = z;
                        LogUtil.printExceptionStackTrace(e);
                        return z2;
                    }
                }
            }
            return z;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static int ordinalIndexOf(String str, String str2, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3cb8ca3", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        try {
            i2 = str.indexOf(str2);
            while (true) {
                i--;
                if (i <= 0 || i2 == -1) {
                    break;
                }
                try {
                    i2 = str.indexOf(str2, i2 + 1);
                } catch (Throwable th) {
                    th = th;
                    LogUtil.printExceptionStackTrace(th);
                    return i2;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = -1;
        }
        return i2;
    }

    public static int safeParseInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf01e97c", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static Bitmap getViewBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f535cd5f", new Object[]{view});
        }
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return bitmap;
    }

    public static void postNotification(Context context, String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc289b3", new Object[]{context, str, jSONObject, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder("notifyHashId@");
        sb.append(str);
        sb.append((jSONObject.toString() + System.currentTimeMillis()).hashCode());
        String sb2 = sb.toString();
        jSONObject.put(MspGlobalDefine.NOTIFY_HASH_ID, (Object) sb2);
        EventBusUtil.postNotification(str, BroadcastUtil.postNotification(str, jSONObject, sb2, context, i));
    }

    public static boolean getDegradeKey(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13273537", new Object[]{str, new Integer(i)})).booleanValue();
        }
        try {
            return getDegradeKey(str, MspContextManager.getInstance().getMspContextByBizId(i));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static boolean getDegradeKey(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f23a14a", new Object[]{str, mspContext})).booleanValue() : getDrmKey(str, mspContext, true);
    }

    public static boolean getGrayKey(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d50fa51", new Object[]{str, mspContext})).booleanValue() : getDrmKey(str, mspContext, false);
    }

    private static boolean getDrmKey(String str, MspContext mspContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ff91bb", new Object[]{str, mspContext, new Boolean(z)})).booleanValue();
        }
        if (mspContext == null) {
            return z;
        }
        try {
            Context context = mspContext.getContext();
            return context == null ? z : DrmManager.getInstance(context).isDegrade(str, false, context);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return z;
        }
    }

    public static String getInvokeFromApi(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c710e989", new Object[]{mspTradeContext});
        }
        String fromApi = mspTradeContext.getPaySession().getFromApi();
        return !TextUtils.isEmpty(fromApi) ? fromApi : MspGlobalDefine.DIRECT_API;
    }

    public static String getInvokeFromSource(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63d023fa", new Object[]{mspTradeContext});
        }
        String fromSource = mspTradeContext.getPaySession().getFromSource();
        return !TextUtils.isEmpty(fromSource) ? fromSource : "native";
    }
}
