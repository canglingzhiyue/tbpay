package tb;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.f;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.e;
import com.taobao.tao.Globals;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.NetWorkUtils;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mtopsdk.mtop.global.SDKUtils;
import tb.kml;

/* loaded from: classes.dex */
public class keo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWNGRADE_HOMEPAGE_NAME = "tb_home_splash";
    public static final String DOWNGRADE_VALUE = "degrade";
    public static final String LOG_TAG = "COSASPLASH";

    /* renamed from: a  reason: collision with root package name */
    private static String f30011a;
    private static volatile a b;
    private static String c;

    /* loaded from: classes.dex */
    public interface a {
        BootImageData a();
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : g();
    }

    public static /* synthetic */ String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        c = str;
        return str;
    }

    static {
        kge.a(1740713879);
        f30011a = "coldStart";
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d079fc6", new Object[]{aVar});
        } else {
            b = aVar;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b = null;
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : System.currentTimeMillis() + (SDKUtils.getTimeOffset() * 1000);
    }

    public static Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            hashSet.add(str2.trim());
        }
        return hashSet;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || str.toLowerCase().endsWith(".gif")) {
            return str;
        }
        DisplayMetrics displayMetrics = f.b().getResources().getDisplayMetrics();
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), null);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            if (StringUtils.isEmpty(url.getFile())) {
                return null;
            }
            String name = new File(url.getFile()).getName();
            kej.a(kem.TAG, "get file name. url:" + str);
            return name;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static BigDecimal a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("dffeb2f3", new Object[]{str, str2, new Integer(i)});
        }
        if (i < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        try {
            return new BigDecimal(str).divide(new BigDecimal(str2), i, RoundingMode.DOWN);
        } catch (Exception e) {
            kej.a("divString", e.getMessage());
            return new BigDecimal(0);
        }
    }

    public static String d(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        File filesDir = f.b().getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir, File.separator + "bootimageresources");
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                kej.a("BootImageUtil", "delete file:" + file2.getAbsolutePath() + ",isDelete:" + file2.delete());
            }
            kej.a("BootImageUtil", "delete old file:" + file.delete());
        }
        if (StringUtils.isEmpty(str)) {
            str = tiq.BIZ_CODE;
        }
        File file3 = new File(filesDir, File.separator + "boot_image_resource" + File.separator + str);
        if (!file3.exists()) {
            kej.a("BootImageUtil", "localResourcesRootPath createFile: " + file3.mkdirs());
        }
        String absolutePath = file3.getAbsolutePath();
        if (!StringUtils.isEmpty(absolutePath)) {
            kej.a(kem.TAG, "get rootPath:" + absolutePath);
        }
        return absolutePath;
    }

    public static String[] a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3580e02f", new Object[]{context});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new String[]{String.valueOf(displayMetrics.widthPixels), String.valueOf(displayMetrics.heightPixels)};
    }

    public static BootImageData a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageData) ipChange.ipc$dispatch("654df7c", new Object[]{jSONObject, str});
        }
        BootImageData bootImageData = null;
        if (jSONObject != null && jSONObject.containsKey("item") && (jSONObject2 = jSONObject.getJSONObject("item")) != null && jSONObject2.containsKey("0")) {
            bootImageData = new BootImageData();
            bootImageData.result = new ArrayList();
            for (int i = 0; i < 10 && jSONObject2.containsKey(String.valueOf(i)); i++) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(i));
                if (jSONObject3 != null && jSONObject3.containsKey("content") && (bootImageInfo = (BootImageInfo) JSONObject.parseObject(jSONObject3.getString("content"), BootImageInfo.class)) != null) {
                    bootImageInfo.sceneType = str;
                    bootImageData.result.add(bootImageInfo);
                }
            }
        }
        return bootImageData;
    }

    public static void a(BootImageData bootImageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57913112", new Object[]{bootImageData});
        } else if (bootImageData != null && bootImageData.result != null && bootImageData.result.size() > 0) {
            for (BootImageInfo bootImageInfo : bootImageData.result) {
                if (!StringUtils.isEmpty(bootImageInfo.imgUrl) && !BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
                    bootImageInfo.imgUrl = b(bootImageInfo.imgUrl);
                    if (!StringUtils.isEmpty(bootImageInfo.firstFrameImageUrl) && !BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
                        bootImageInfo.firstFrameImageUrl = b(bootImageInfo.firstFrameImageUrl);
                    }
                }
            }
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy(DOWNGRADE_HOMEPAGE_NAME);
        return downgradeStrategy != null && StringUtils.equals("degrade", downgradeStrategy.getTacticsPerformance());
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : kem.a().i() & (!d());
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static List<kmo> a(String str, BootImageData bootImageData) {
        boolean z;
        BootImageData a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66e14bf", new Object[]{str, bootImageData});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkAndDeleteInvalidDownloadResources. data == null ? ");
        sb.append(bootImageData == null);
        sb.append(" data size ");
        sb.append((bootImageData == null || bootImageData.result == null) ? "0" : String.valueOf(bootImageData.result.size()));
        kej.a("BootImageUtil", sb.toString());
        String d = d(str);
        if (StringUtils.isEmpty(d) || bootImageData == null) {
            kej.a(kem.TAG, "check resources fail, roopath or data no value");
            return null;
        }
        List<kmo> c2 = c(bootImageData);
        a aVar = b;
        if (aVar != null && (a2 = aVar.a()) != null && a2.result != null) {
            c2.addAll(c(a2));
        }
        ArrayList arrayList = new ArrayList(c2);
        String[] list = new File(d).list();
        if (list.length <= 0) {
            kej.a(kem.TAG, "check resources no cache files");
            return arrayList;
        }
        for (String str2 : list) {
            if (c2.size() > 0) {
                for (kmo kmoVar : c2) {
                    if (str2 != null && str2.equals(kmoVar.d)) {
                        arrayList.remove(kmoVar);
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                kej.a(kem.TAG, "check resources delete file:" + str2);
                File file = new File(d, str2);
                if (file.exists()) {
                    kej.a(kem.TAG, "check resources delete file suc:" + str2);
                    file.delete();
                } else {
                    kej.a(kem.TAG, "check resources delete file faile，file no exists。 name:" + str2);
                }
            }
        }
        return arrayList;
    }

    private static List<kmo> c(BootImageData bootImageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1795bf7", new Object[]{bootImageData});
        }
        ArrayList arrayList = new ArrayList();
        for (BootImageInfo bootImageInfo : bootImageData.result) {
            List<kmo> b2 = kek.b(bootImageInfo);
            if (b2 != null) {
                for (kmo kmoVar : b2) {
                    if (keu.a(kmoVar.f30167a, keu.SUFFIX_MP4)) {
                        arrayList.add(kmoVar);
                    }
                    if (kel.c && !StringUtils.isEmpty(kmoVar.f30167a)) {
                        arrayList.add(kmoVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void a(final String str, BootImageData bootImageData, List<kmo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20e9979", new Object[]{str, bootImageData, list});
            return;
        }
        NetWorkUtils.ConnectType connectType = NetWorkUtils.getConnectType(f.b());
        NetWorkUtils.MobileNetworkType mobileNetworkType = NetWorkUtils.getMobileNetworkType(f.b());
        if (connectType == null || !connectType.equals(NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI)) {
            if (mobileNetworkType == null) {
                return;
            }
            if (!mobileNetworkType.equals(NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_3G) && !mobileNetworkType.equals(NetWorkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_4G)) {
                return;
            }
        }
        if (bootImageData == null || bootImageData.result == null) {
            kej.a(kem.TAG, "download no result");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BootImageInfo bootImageInfo : bootImageData.result) {
            List<String> c2 = kek.c(bootImageInfo);
            if (c2 != null) {
                for (String str2 : c2) {
                    if (!StringUtils.isEmpty(str2) && !BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        final keq h = h.a("").h();
        if (arrayList.size() > 0) {
            b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, arrayList).a(new com.taobao.phenix.intf.event.a<e>() { // from class: tb.keo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(e eVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, eVar})).booleanValue() : a(eVar);
                }

                public boolean a(e eVar) {
                    String str3;
                    String str4;
                    String str5 = "";
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("fa9fe917", new Object[]{this, eVar})).booleanValue();
                    }
                    try {
                        if (eVar.h != null) {
                            List<String> list2 = eVar.h;
                            i = list2.size();
                            str4 = JSONObject.toJSONString(list2);
                        } else {
                            str4 = str5;
                        }
                        str3 = str4;
                    } catch (Throwable unused) {
                        str3 = str5;
                    }
                    String str6 = i > 0 ? keq.DOWNLOAD_ERROR : keq.DOWNLOAD_SUCCESS;
                    keq keqVar = keq.this;
                    String str7 = str;
                    String i2 = keo.i();
                    if (i > 0) {
                        str5 = keq.CODE_DOWNLOAD_IMAGE_FAIL;
                    }
                    keqVar.a(str7, i2, str6, null, str5, str3);
                    kej.a(kem.TAG, "update bootimage: download images, total=" + eVar.f18930a + " download=" + eVar.d + " downloadSize=" + eVar.e);
                    return true;
                }
            }).a();
        }
        boolean z = bootImageData.result.get(0) != null ? bootImageData.result.get(0).enable4G : false;
        if (connectType == null) {
            return;
        }
        if (!connectType.equals(NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI) && !z) {
            return;
        }
        if (list.size() > 0) {
            kej.a(kem.TAG, "download start");
            kmm kmmVar = new kmm();
            kmmVar.f30166a = list;
            kmmVar.b = new kmq();
            kmmVar.b.f30169a = "TBBootImage";
            kmmVar.b.h = d(str);
            kmmVar.b.j = false;
            com.taobao.downloader.b.a().a(kmmVar, new kml() { // from class: tb.keo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kml
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // tb.kml
                public void onDownloadStateChange(String str3, boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str3, new Boolean(z2)});
                    }
                }

                @Override // tb.kml
                public void onFinish(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z2)});
                    }
                }

                @Override // tb.kml
                public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                    }
                }

                @Override // tb.kml
                public void onDownloadError(String str3, int i, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str3, new Integer(i), str4});
                        return;
                    }
                    kej.a(kem.TAG, "download error url：" + str3 + "path" + str4);
                    keq.this.a(str, keo.i(), keq.DOWNLOAD_ERROR, null, keq.CODE_DOWNLOAD_VIDEO_FAIL, str3);
                }

                @Override // tb.kml
                public void onDownloadFinish(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str3, str4});
                        return;
                    }
                    kej.a(kem.TAG, "download finish url：" + str3 + "path" + str4);
                    keq.this.a(str, keo.i(), keq.DOWNLOAD_SUCCESS, null, null, null);
                }
            });
            return;
        }
        kej.a(kem.TAG, "no download");
    }

    public static File a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("cac70111", new Object[]{str, str2});
        }
        try {
            String c2 = c(str2);
            if (StringUtils.isEmpty(c2)) {
                return null;
            }
            File file = new File(d(str), c2);
            if (file.exists()) {
                return file;
            }
            kej.a(kem.TAG, "hasDownloadedResouce failed url = " + str2);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("1".equals(str)) {
                z = false;
            } else if ("0".equals(str)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return (!z || Build.VERSION.SDK_INT < 17) ? z : !d(context);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : Settings.Global.getInt(context.getContentResolver(), h(), 0) != 0;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        String str = Build.BRAND;
        return (!StringUtils.isEmpty(str) && !str.equalsIgnoreCase("HUAWEI") && !str.equalsIgnoreCase("HONOR")) ? (str.equalsIgnoreCase("XIAOMI") || str.equalsIgnoreCase("REDMI")) ? "force_fsg_nav_bar" : (!str.equalsIgnoreCase("VIVO") && !str.equalsIgnoreCase("OPPO")) ? "navigationbar_is_min" : "navigation_gesture_on" : "navigationbar_is_min";
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : f30011a;
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            f30011a = str;
        }
    }

    public static boolean a(List<LinkedSplashData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        boolean z = true;
        for (LinkedSplashData linkedSplashData : list) {
            z = !linkedSplashData.getSubSection().containsKey(com.taobao.mmad.data.b.TYPE_BANNER);
        }
        return z;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (!StringUtils.isEmpty(c)) {
            return c;
        }
        String string = kel.a().getString("oaid", "");
        if (!StringUtils.isEmpty(string)) {
            c = string;
            return string;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Coordinator.execute(new Runnable() { // from class: tb.keo.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        keo.f(keo.f());
                    }
                }
            });
        } else {
            c = g();
        }
        return c;
    }

    private static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        String a2 = bzj.a(Globals.getApplication());
        kel.a().edit().putString("oaid", a2).apply();
        return a2;
    }
}
