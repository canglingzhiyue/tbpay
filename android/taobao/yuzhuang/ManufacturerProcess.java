package android.taobao.yuzhuang;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import mtopsdk.common.util.SymbolExpUtil;
import tb.bgy;
import tb.kge;
import tb.oyw;

/* loaded from: classes.dex */
public class ManufacturerProcess implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EMUI_PROPERTY = "ro.build.version.emui";
    private static final String HARMONYOS_PROPERTY = "hw_sc.build.platform.version";
    private static final String MANUFACTURER_PROPERTY = "ro.product.manufacturer";
    private static final String TAG = "config_file";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum Config {
        OPPO("oppo", "", "/data/etc/appchannel/sjtbconfig.xml"),
        ONEPLUS(DeviceProperty.ALIAS_ONEPLUS, "", "/data/etc/appchannel/sjtbconfig.xml"),
        REALME("realme", "", "/data/etc/appchannel/sjtbconfig.xml"),
        ZTE(DeviceProperty.ALIAS_ZTE, "/system", "/system/etc/sjtbconfig.xml"),
        VIVO("vivo", "/system/vivo-apps", "/system/etc/sjtbconfig.xml"),
        SMARTISAN("smartisan", "/system/media/app", "/system/etc/sjtbconfig.xml"),
        XIAOMI("xiaomi", "", ""),
        BLEPHONE("blephone", "", "/system/etc/sjtbconfig.ini"),
        HUAWEI("huawei", "", ""),
        HONOR("honor", "", ""),
        SUGAR("sugar", "", "/system/etc/sjtbconfig.channel.ini");
        
        private static final String HONOR_CHANNEL_KEY = "ro.channelId.taobao";
        private static final String HUAWEI_CHANNEL_KEY = "ro.channelId.taobao";
        private static final String OPPO_CHANNEL_KEY = "persist.preinstall.taobao";
        private static final String OPPO_CHANNEL_KEY_2 = "ro.preinstall.path";
        private String apkConfig;
        private String channelConfig;
        private String manufacturer;

        Config(String str, String str2, String str3) {
            this.manufacturer = str;
            this.apkConfig = str2;
            this.channelConfig = str3;
        }

        public static String[] getConfig(String str) {
            String[] strArr;
            Config[] values = values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strArr = null;
                    break;
                }
                Config config = values[i];
                if (config.manufacturer.equals(str.toLowerCase())) {
                    strArr = new String[]{config.apkConfig, config.channelConfig};
                    break;
                }
                i++;
            }
            if (strArr != null || !ManufacturerProcess.isHuaweiPhone()) {
                return strArr;
            }
            Config config2 = HUAWEI;
            return new String[]{config2.apkConfig, config2.channelConfig};
        }

        public static String transformSpecificChannelConfig(String str, Context context, String str2) {
            if (XIAOMI.isManufacturerMatched(str)) {
                return ManufacturerProcess.access$000(context.getPackageName());
            }
            if (!ManufacturerProcess.isHuaweiPhone() && !HONOR.isManufacturerMatched(str)) {
                if ((OPPO.isManufacturerMatched(str) || ONEPLUS.isManufacturerMatched(str) || REALME.isManufacturerMatched(str)) && Build.VERSION.SDK_INT >= 30) {
                    String access$100 = ManufacturerProcess.access$100(OPPO_CHANNEL_KEY_2);
                    if (!TextUtils.isEmpty(access$100)) {
                        return new File(access$100, "sjtbconfig.xml").getAbsolutePath();
                    }
                }
                return str2;
            }
            return ManufacturerProcess.access$100("ro.channelId.taobao");
        }

        public boolean isManufacturerMatched(String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            return str.equalsIgnoreCase(this.manufacturer);
        }
    }

    static {
        kge.a(-2080635809);
        kge.a(1028243835);
    }

    public static /* synthetic */ String access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str}) : getMiuiChannelPath(str);
    }

    public static /* synthetic */ String access$100(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str}) : getSystemProperties(str);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            b.a(application).a();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int FROM_APK = 2;
        public static final int FROM_CONFIG = 1;

        /* renamed from: a  reason: collision with root package name */
        public static String f1731a;
        private static volatile b c;
        private Context b;
        private SharedPreferences d;
        private SharedPreferences.Editor e;

        static {
            kge.a(-46631652);
            f1731a = "";
            c = null;
        }

        private b(Context context) {
            this.d = null;
            f1731a = Build.MANUFACTURER;
            this.d = context.getSharedPreferences("manufacture_config", 0);
            this.e = this.d.edit();
            this.b = context;
        }

        public static b a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cdd87c54", new Object[]{context});
            }
            if (c == null) {
                synchronized (b.class) {
                    if (c == null) {
                        c = new b(context);
                    }
                }
            }
            return c;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Log.e(ManufacturerProcess.TAG, "manufacturer: " + f1731a);
            if (b()) {
                Log.e(ManufacturerProcess.TAG, "skip process, isCommited == true");
                return;
            }
            String[] config = Config.getConfig(f1731a);
            if (config == null) {
                Log.e(ManufacturerProcess.TAG, "Config.getConfig(manufacturer) == null ");
                return;
            }
            String str = "configs: " + Arrays.toString(config);
            a(config[0]);
            b(Config.transformSpecificChannelConfig(f1731a, this.b, config[1]));
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            boolean z = this.d.getBoolean(oyw.PRE_LOAD, false);
            boolean z2 = !TextUtils.isEmpty(this.d.getString("preLoad_Channel1", "")) || !TextUtils.isEmpty(this.d.getString("preLoad_Channel2", ""));
            Log.e(ManufacturerProcess.TAG, "preLoadCommitted = " + z + " ,  anyChannelNotEmpty = " + z2);
            return z && z2;
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                String str2 = "configs[0]: = " + str;
                File c2 = c(str);
                String str3 = "apkFile = " + c2;
                if (c2 == null || !c2.exists()) {
                    return;
                }
                try {
                    String str4 = "commitChannelFromApk: " + c2;
                    a(c2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e(ManufacturerProcess.TAG, f1731a + " in-apk config is empty ");
            }
        }

        private void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            String str2 = f1731a + " channel romChannelConfig = " + str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                File file2 = new File(str.replace("xml", "ini"));
                String str3 = f1731a + " configFile.abs_path = " + file.getAbsolutePath();
                String str4 = f1731a + " configFile1.abs_path = " + file2.getAbsolutePath();
                if (file.exists()) {
                    b(file);
                    Log.e(ManufacturerProcess.TAG, "file is exist , path : ");
                    return;
                } else if (file2.exists()) {
                    b(file2);
                    Log.e(ManufacturerProcess.TAG, "file is exist , path1 : ");
                    return;
                } else {
                    Log.e(ManufacturerProcess.TAG, "config file is not exist");
                    return;
                }
            }
            Log.e(ManufacturerProcess.TAG, "TextUtils.isEmpty(romChannelConfig)");
        }

        private File c(String str) {
            File[] listFiles;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{this, str});
            }
            File[] listFiles2 = new File(str).listFiles(new FilenameFilter() { // from class: android.taobao.yuzhuang.ManufacturerProcess.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file, str2})).booleanValue() : str2.toLowerCase().contains("taobao") && str2.endsWith(bgy.APK_EXTENSION);
                }
            });
            if (listFiles2 != null && listFiles2.length > 0) {
                return listFiles2[0];
            }
            if (f1731a.equalsIgnoreCase("vivo") && Build.VERSION.SDK_INT >= 23 && (listFiles = new File("/apps").listFiles(new FilenameFilter() { // from class: android.taobao.yuzhuang.ManufacturerProcess.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file, str2})).booleanValue() : str2.endsWith(bgy.APK_EXTENSION) && str2.toLowerCase().contains("taobao");
                }
            })) != null && listFiles.length > 0) {
                return listFiles[0];
            }
            if (!f1731a.equalsIgnoreCase(DeviceProperty.ALIAS_ZTE)) {
                return null;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                return null;
            }
            return new a().a(file);
        }

        private void a(File file) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            } else if (this.d.getBoolean(oyw.PRE_LOAD, false) && !TextUtils.isEmpty(this.d.getString("preLoad_Channel1", ""))) {
                Log.e(ManufacturerProcess.TAG, "skipped");
            } else {
                ZipFile zipFile = new ZipFile(file);
                if (zipFile.getEntry("assets/aconfig.xml") == null && zipFile.getEntry("assets/aconfig.ini") == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipFile.getEntry("assets/aconfig.xml") == null ? zipFile.getEntry("assets/aconfig.ini") : zipFile.getEntry("assets/aconfig.xml"))));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        a(sb.toString().split(SymbolExpUtil.SYMBOL_VERTICALBAR), 2);
                        return;
                    }
                }
            }
        }

        private void b(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("584201a0", new Object[]{this, file});
            } else if (this.d.getBoolean(oyw.PRE_LOAD, false) && !TextUtils.isEmpty(this.d.getString("preLoad_Channel2", ""))) {
                Log.e(ManufacturerProcess.TAG, "skipped");
            } else {
                try {
                    a(new a("channel").a(file.getAbsolutePath()).split(SymbolExpUtil.SYMBOL_VERTICALBAR), 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        private void a(String[] strArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("729bfa2c", new Object[]{this, strArr, new Integer(i)});
                return;
            }
            r0 = "into commit : " + strArr + ";from : " + i;
            if (strArr.length == 3 && strArr[2].equals(this.b.getPackageName())) {
                Log.e(ManufacturerProcess.TAG, "results.length == 3");
                Log.e(ManufacturerProcess.TAG, "results[0]:" + strArr[0]);
                Log.e(ManufacturerProcess.TAG, "results[1]:" + strArr[1]);
                this.e.putBoolean(oyw.PRE_LOAD, true);
                this.e.putString("preLoad_VersionName", strArr[1]);
                if (i == 1) {
                    this.e.putString("preLoad_Channel2", strArr[0]);
                } else if (i == 2) {
                    this.e.putString("preLoad_Channel1", strArr[0]);
                }
                this.e.commit();
            } else if (strArr.length != 2 || !strArr[1].equals(this.b.getPackageName())) {
            } else {
                Log.e(ManufacturerProcess.TAG, "results.length == 2");
                Log.e(ManufacturerProcess.TAG, "results[0]:" + strArr[0]);
                Log.e(ManufacturerProcess.TAG, "results[1]:" + strArr[1]);
                this.e.putBoolean(oyw.PRE_LOAD, true);
                if (i == 1) {
                    this.e.putString("preLoad_Channel2", strArr[0]);
                } else if (i == 2) {
                    this.e.putString("preLoad_Channel1", strArr[0]);
                }
                this.e.commit();
            }
        }

        /* loaded from: classes2.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(606905244);
                kge.a(-420902998);
            }

            public File a(File file, FilenameFilter filenameFilter) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (File) ipChange.ipc$dispatch("81e5531a", new Object[]{this, file, filenameFilter});
                }
                if (!filenameFilter.accept(file, file.getName())) {
                    return null;
                }
                return file;
            }

            public File a(File file) {
                File[] listFiles;
                File a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (File) ipChange.ipc$dispatch("4659278e", new Object[]{this, file});
                }
                if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                    return null;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a2 = a(file2);
                    } else {
                        a2 = a(file2, new FilenameFilter() { // from class: android.taobao.yuzhuang.ManufacturerProcess.b.a.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.io.FilenameFilter
                            public boolean accept(File file3, String str) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file3, str})).booleanValue() : str.toLowerCase().contains("taobao");
                            }
                        });
                    }
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Cipher f1730a = null;
        private Cipher b = null;

        static {
            kge.a(-2087695496);
        }

        public a(String str) throws Exception {
            c(str);
            b(str);
        }

        private void b(String str) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            SecretKeySpec b = b(str.getBytes());
            this.f1730a = Cipher.getInstance("DES");
            this.f1730a.init(1, b);
        }

        private void c(String str) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
                return;
            }
            SecretKeySpec b = b(str.getBytes());
            this.b = Cipher.getInstance("DES");
            this.b.init(2, b);
        }

        private SecretKeySpec b(byte[] bArr) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SecretKeySpec) ipChange.ipc$dispatch("83b497b6", new Object[]{this, bArr});
            }
            byte[] bArr2 = new byte[8];
            for (int i = 0; i < bArr.length && i < bArr2.length; i++) {
                bArr2[i] = bArr[i];
            }
            return new SecretKeySpec(bArr2, "DES");
        }

        public byte[] a(byte[] bArr) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{this, bArr}) : this.b.doFinal(bArr);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
            */
        public java.lang.String a(java.lang.String r4) throws java.lang.Exception {
            /*
                r3 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.yuzhuang.ManufacturerProcess.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L18
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r3
                r2 = 1
                r1[r2] = r4
                java.lang.String r4 = "9f352ae"
                java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
                java.lang.String r4 = (java.lang.String) r4
                return r4
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L54
                byte[] r4 = a(r2)     // Catch: java.lang.Throwable -> L4a
                byte[] r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L4a
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4a
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L4a
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4a
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L4a
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4a
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            L3a:
                java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L4a
                if (r4 == 0) goto L44
                r0.append(r4)     // Catch: java.lang.Throwable -> L4a
                goto L3a
            L44:
                r2.close()
                goto L59
            L48:
                r4 = move-exception
                goto L4e
            L4a:
                r1 = r2
                goto L54
            L4c:
                r4 = move-exception
                r2 = r1
            L4e:
                if (r2 == 0) goto L53
                r2.close()
            L53:
                throw r4
            L54:
                if (r1 == 0) goto L59
                r1.close()
            L59:
                java.lang.String r4 = r0.toString()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.taobao.yuzhuang.ManufacturerProcess.a.a(java.lang.String):java.lang.String");
        }

        public static final byte[] a(InputStream inputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }
    }

    private static String getMiuiChannelPath(String str) {
        try {
            return (String) Class.forName("miui.os.MiuiInit").getMethod("getMiuiChannelPath", String.class).invoke(null, str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String getSystemProperties(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getProp(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isHuaweiPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e37e48", new Object[0])).booleanValue();
        }
        String str = null;
        String prop = Build.VERSION.SDK_INT >= 19 ? getProp("ro.build.version.emui") : null;
        if (Build.VERSION.SDK_INT >= 19) {
            str = getProp(HARMONYOS_PROPERTY);
        }
        return !TextUtils.isEmpty(prop) || !TextUtils.isEmpty(str);
    }
}
