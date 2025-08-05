package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HMSPackageManager {
    private static HMSPackageManager n;
    private static final Object o = new Object();
    private static final Object p = new Object();
    private static final Object q = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f7587a;
    private final PackageManagerHelper b;
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private int k;
    private long l;
    private boolean m;

    /* loaded from: classes4.dex */
    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* renamed from: a  reason: collision with root package name */
        private String f7588a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Long f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j) {
            this.f7588a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = Long.valueOf(j);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.e, packagePriorityInfo.e) ? this.f.compareTo(packagePriorityInfo.f) : this.e.compareTo(packagePriorityInfo.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> queryIntentServices = HMSPackageManager.this.f7587a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    return;
                }
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if ("com.huawei.hwid".equals(resolveInfo.serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.c();
                    }
                }
                HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
            } catch (Exception e) {
                HMSLog.e("HMSPackageManager", "asyncOnceCheckMDMState query hms action failed. " + e.getMessage());
            }
        }
    }

    private HMSPackageManager(Context context) {
        this.f7587a = context;
        this.b = new PackageManagerHelper(context);
    }

    private static String a(int i) {
        if (i == 1) {
            return "SPOOFED";
        }
        if (i == 2) {
            return "SUCCESS";
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i);
        return "";
    }

    private String a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
            return null;
        }
        return bundle.getString(str);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("priority=");
        if (indexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int indexOf2 = str.indexOf(",", indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    private void a() {
        new Thread(new a(), "Thread-asyncOnceCheckMDMState").start();
    }

    private boolean a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            str4 = "args is invalid";
        } else {
            List<X509Certificate> b = com.huawei.hms.device.a.b(str3);
            if (b.size() == 0) {
                str4 = "certChain is empty";
            } else if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f7587a), b)) {
                str4 = "failed to verify cert chain";
            } else {
                X509Certificate x509Certificate = b.get(b.size() - 1);
                if (!com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS")) {
                    str4 = "CN is invalid";
                } else if (!com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                    str4 = "OU is invalid";
                } else if (com.huawei.hms.device.a.a(x509Certificate, str, str2)) {
                    return true;
                } else {
                    str4 = "signature is invalid: " + str;
                }
            }
        }
        HMSLog.e("HMSPackageManager", str4);
        return false;
    }

    private void b(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        this.i = a2.substring(9);
    }

    private boolean b() {
        String str;
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f7587a);
        if (hmsPath == null) {
            str = "hmsPath is null!";
        } else if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            str = "NO huawer.cer in HMS!";
        } else if (!ReadApkFileUtil.checkSignature()) {
            str = "checkSignature fail!";
        } else if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        } else {
            str = "verifyApkHash fail!";
        }
        HMSLog.i("HMSPackageManager", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        synchronized (q) {
            HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
            int i = 1;
            if (!(this.k == 3 || this.l != this.b.getPackageFirstInstallTime("com.huawei.hwid"))) {
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.k));
                return this.k;
            }
            if (b()) {
                i = 2;
            }
            this.k = i;
            this.l = this.b.getPackageFirstInstallTime("com.huawei.hwid");
            HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.k));
            return this.k;
        }
    }

    private void d() {
        synchronized (p) {
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = 0;
        }
    }

    private void e() {
        synchronized (p) {
            this.c = null;
            this.d = null;
            this.e = 0;
        }
    }

    private Pair<String, String> f() {
        String str;
        List<ResolveInfo> queryIntentServices;
        String str2;
        StringBuilder sb;
        String str3;
        try {
            queryIntentServices = this.f7587a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
        } catch (Exception e) {
            str = "getHmsPackageName query hms action failed. " + e.getMessage();
        }
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            str = "query hms action, resolveInfoList is null or empty.";
            HMSLog.e("HMSPackageManager", str);
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str4 = resolveInfo.serviceInfo.applicationInfo.packageName;
            String packageSignature = this.b.getPackageSignature(str4);
            if ("com.huawei.hwid".equals(str4) && this.b.getPackageVersionCode(str4) < 30000000) {
                return new Pair<>(str4, packageSignature);
            }
            Bundle bundle = resolveInfo.serviceInfo.metaData;
            if (bundle == null) {
                sb = new StringBuilder();
                sb.append("skip package ");
                sb.append(str4);
                str3 = " for metadata is null";
            } else if (!bundle.containsKey("hms_app_signer")) {
                sb = new StringBuilder();
                sb.append("skip package ");
                sb.append(str4);
                str3 = " for no signer";
            } else if (!bundle.containsKey("hms_app_cert_chain")) {
                sb = new StringBuilder();
                sb.append("skip package ");
                sb.append(str4);
                str3 = " for no cert chain";
            } else {
                if (a(str4 + "&" + packageSignature, bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                    return new Pair<>(str4, packageSignature);
                }
                str2 = "checkSigner failed";
                HMSLog.e("HMSPackageManager", str2);
            }
            sb.append(str3);
            str2 = sb.toString();
            HMSLog.e("HMSPackageManager", str2);
        }
        return null;
    }

    private Pair<String, String> g() {
        Pair<String, String> f = f();
        if (f != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) f.first));
            this.h = "com.huawei.hms.core.aidlservice";
            this.i = null;
            return f;
        }
        ArrayList<PackagePriorityInfo> h = h();
        if (h == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        Iterator<PackagePriorityInfo> it = h.iterator();
        while (it.hasNext()) {
            PackagePriorityInfo next = it.next();
            String str = next.f7588a;
            String str2 = next.b;
            String str3 = next.c;
            String str4 = next.d;
            String packageSignature = this.b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.i("HMSPackageManager", "result: " + str + ", " + str2 + ", " + next.f);
                this.h = PackageConstants.GENERAL_SERVICES_ACTION;
                b(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (o) {
            if (n == null) {
                n = context.getApplicationContext() != null ? new HMSPackageManager(context.getApplicationContext()) : new HMSPackageManager(context);
                n.j();
                n.a();
            }
        }
        return n;
    }

    private ArrayList<PackagePriorityInfo> h() {
        String str;
        List<ResolveInfo> queryIntentServices;
        String str2;
        try {
            queryIntentServices = this.f7587a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
        } catch (Exception e) {
            str = "query aglite action failed. " + e.getMessage();
        }
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            str = "query aglite action, resolveInfoList is null or empty";
            HMSLog.e("HMSPackageManager", str);
            return null;
        }
        ArrayList<PackagePriorityInfo> arrayList = new ArrayList<>();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str3 = resolveInfo.serviceInfo.applicationInfo.packageName;
            long packageFirstInstallTime = this.b.getPackageFirstInstallTime(str3);
            Bundle bundle = resolveInfo.serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.e("HMSPackageManager", "package " + str3 + " get metaData is null");
            } else {
                String a2 = a(bundle, "hms_app_checker_config");
                String a3 = a(a2);
                if (TextUtils.isEmpty(a3)) {
                    str2 = "get priority fail. hmsCheckerCfg: " + a2;
                } else {
                    String a4 = a(bundle, "hms_app_signer_v2");
                    if (TextUtils.isEmpty(a4)) {
                        str2 = "get signerV2 fail.";
                    } else {
                        String a5 = a(bundle, "hms_app_cert_chain");
                        if (TextUtils.isEmpty(a5)) {
                            str2 = "get certChain fail.";
                        } else {
                            HMSLog.i("HMSPackageManager", "add: " + str3 + ", " + a2 + ", " + packageFirstInstallTime);
                            arrayList.add(new PackagePriorityInfo(str3, a2, a4, a5, a3, packageFirstInstallTime));
                        }
                    }
                }
                HMSLog.i("HMSPackageManager", str2);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void i() {
        synchronized (p) {
            Pair<String, String> f = f();
            if (f == null) {
                HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                e();
                return;
            }
            this.c = (String) f.first;
            this.d = (String) f.second;
            this.e = this.b.getPackageVersionCode(getHMSPackageName());
            HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.c + " version: " + this.e);
        }
    }

    private void j() {
        synchronized (p) {
            Pair<String, String> g = g();
            if (g == null) {
                HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                d();
                return;
            }
            this.f = (String) g.first;
            this.g = (String) g.second;
            this.j = this.b.getPackageVersionCode(getHMSPackageNameForMultiService());
            HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f + " version: " + this.j);
        }
    }

    private boolean k() {
        Bundle bundle;
        PackageManager packageManager = this.f7587a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (AndroidException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e);
        }
        if (!TextUtils.isEmpty(this.h) && (this.h.equals(PackageConstants.GENERAL_SERVICES_ACTION) || this.h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            HMSLog.i("HMSPackageManager", "action = " + this.h + " exist");
            return false;
        }
        ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
            HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
            return false;
        }
        return true;
    }

    public String getHMSFingerprint() {
        String str = this.d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                i();
            }
            String str2 = this.c;
            if (str2 != null) {
                return str2;
            }
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates("com.huawei.hwid"))) {
            "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(this.b.getPackageSignature("com.huawei.hwid"));
        }
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                j();
            }
            String str2 = this.f;
            return str2 != null ? str2 : "com.huawei.hwid";
        }
        return "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (o) {
            refresh();
            PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.c);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                e();
                return packageStates2;
            }
            boolean z = false;
            if ("com.huawei.hwid".equals(this.c) && c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            if (packageStates == PackageManagerHelper.PackageStates.ENABLED && !this.d.equals(this.b.getPackageSignature(this.c))) {
                z = true;
            }
            return z ? packageStates2 : packageStates;
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (o) {
            refreshForMultiService();
            PackageManagerHelper.PackageStates packageStates = this.b.getPackageStates(this.f);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                d();
                return packageStates2;
            }
            boolean z = false;
            if ("com.huawei.hwid".equals(this.f) && c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            if (packageStates == PackageManagerHelper.PackageStates.ENABLED && !this.g.equals(this.b.getPackageSignature(this.f))) {
                z = true;
            }
            return z ? packageStates2 : packageStates;
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.h) ? this.h : "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.e >= i || !k()) {
            return true;
        }
        int packageVersionCode = this.b.getPackageVersionCode(getHMSPackageName());
        this.e = packageVersionCode;
        return packageVersionCode >= i;
    }

    public boolean isApkNeedUpdate(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i);
        return hmsVersionCode < i;
    }

    public boolean isApkUpdateNecessary(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i);
        return k() && hmsVersionCode < i;
    }

    public boolean isUseOldCertificate() {
        return this.m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            i();
        }
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
            j();
        }
    }

    public void resetMultiServiceState() {
        d();
    }

    public void setUseOldCertificate(boolean z) {
        this.m = z;
    }
}
