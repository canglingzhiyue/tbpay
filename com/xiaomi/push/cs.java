package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.media.ExifInterface;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.icf;

/* loaded from: classes9.dex */
public class cs {

    /* renamed from: a  reason: collision with root package name */
    protected static Context f24406a;

    /* renamed from: a  reason: collision with other field name */
    private static a f181a;

    /* renamed from: a  reason: collision with other field name */
    private static cs f182a;
    private static String c;
    private static String d;

    /* renamed from: a  reason: collision with other field name */
    private long f184a;

    /* renamed from: a  reason: collision with other field name */
    private cr f185a;

    /* renamed from: a  reason: collision with other field name */
    protected b f186a;

    /* renamed from: a  reason: collision with other field name */
    private String f187a;

    /* renamed from: a  reason: collision with other field name */
    protected final Map<String, cp> f188a;

    /* renamed from: b  reason: collision with other field name */
    private final long f189b;

    /* renamed from: b  reason: collision with other field name */
    private String f190b;

    /* renamed from: c  reason: collision with other field name */
    private long f191c;
    protected static final Map<String, co> b = new HashMap();

    /* renamed from: a  reason: collision with other field name */
    protected static boolean f183a = false;

    /* loaded from: classes9.dex */
    public interface a {
        cs a(Context context, cr crVar, b bVar, String str);
    }

    /* loaded from: classes9.dex */
    public interface b {
        String a(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cs(Context context, cr crVar, b bVar, String str) {
        this(context, crVar, bVar, str, null, null);
    }

    protected cs(Context context, cr crVar, b bVar, String str, String str2, String str3) {
        this.f188a = new HashMap();
        this.f187a = "0";
        this.f184a = 0L;
        this.f189b = 15L;
        this.f191c = 0L;
        this.f190b = "isp_prov_city_country_ip";
        this.f186a = bVar;
        this.f185a = crVar == null ? new ct(this) : crVar;
        this.f187a = str;
        c = str2 == null ? context.getPackageName() : str2;
        d = str3 == null ? g() : str3;
    }

    public static synchronized cs a() {
        cs csVar;
        synchronized (cs.class) {
            if (f182a == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
            csVar = f182a;
        }
        return csVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public static String m1789a() {
        NetworkInfo activeNetworkInfo;
        Context context = f24406a;
        if (context == null) {
            return "unknown";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI-UNKNOWN";
            }
            return activeNetworkInfo.getTypeName() + "-" + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                int i2 = b2 & 240;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b2 & 15) ^ ((byte) (((b2 >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private ArrayList<co> a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        m1800e();
        synchronized (this.f188a) {
            m1795a();
            for (String str : this.f188a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        synchronized (b) {
            for (Object obj : b.values().toArray()) {
                co coVar = (co) obj;
                if (!coVar.b()) {
                    b.remove(coVar.f178b);
                }
            }
        }
        if (!arrayList.contains(b())) {
            arrayList.add(b());
        }
        ArrayList<co> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = bg.e(f24406a) ? "wifi" : "wap";
            String a2 = a(arrayList, str2, this.f187a, true);
            if (!StringUtils.isEmpty(a2)) {
                JSONObject jSONObject3 = new JSONObject(a2);
                com.xiaomi.channel.commonutils.logger.b.b(a2);
                if (icf.a.CONTROL_NAME_OK.equalsIgnoreCase(jSONObject3.getString(ExifInterface.LATITUDE_SOUTH))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString(com.network.diagnosis.c.IP);
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str3);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.m1616a("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            co coVar2 = new co(str3);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (!StringUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                    coVar2.a(new cx(string6, optJSONArray.length() - i3));
                                } else {
                                    jSONObject2 = jSONObject5;
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i2, coVar2);
                            coVar2.g = string5;
                            coVar2.c = string;
                            coVar2.e = string3;
                            coVar2.f = string4;
                            coVar2.d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                coVar2.a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                coVar2.b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has(RemoteMessageConst.TTL)) {
                                coVar2.a(jSONObject4.getInt(RemoteMessageConst.TTL) * 1000);
                            }
                            m1794a(coVar2.a());
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = 604800000;
                        if (jSONObject4.has("reserved-ttl")) {
                            j = jSONObject4.getInt("reserved-ttl") * 1000;
                        }
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.m1616a("no bucket found for " + next);
                            } else {
                                co coVar3 = new co(next);
                                coVar3.a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!StringUtils.isEmpty(string7)) {
                                        coVar3.a(new cx(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                synchronized (b) {
                                    if (this.f185a.a(next)) {
                                        b.put(next, coVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            co coVar4 = arrayList2.get(i5);
            if (coVar4 != null) {
                a(arrayList.get(i5), coVar4);
            }
        }
        m1798c();
        return arrayList2;
    }

    public static synchronized void a(Context context, cr crVar, b bVar, String str, String str2, String str3) {
        synchronized (cs.class) {
            Context applicationContext = context.getApplicationContext();
            f24406a = applicationContext;
            if (applicationContext == null) {
                f24406a = context;
            }
            if (f182a == null) {
                if (f181a == null) {
                    f182a = new cs(context, crVar, bVar, str, str2, str3);
                    return;
                }
                f182a = f181a.a(context, crVar, bVar, str);
            }
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (cs.class) {
            f181a = aVar;
            f182a = null;
        }
    }

    public static void a(String str, String str2) {
        co coVar = b.get(str);
        synchronized (b) {
            if (coVar == null) {
                co coVar2 = new co(str);
                coVar2.a(604800000L);
                coVar2.m1782a(str2);
                b.put(str, coVar2);
            } else {
                coVar.m1782a(str2);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private byte[] m1790a() {
        return bl.m1741a(f24406a.getPackageName() + "_key_salt");
    }

    private String f() {
        return "host_fallbacks";
    }

    private String g() {
        try {
            PackageInfo packageInfo = f24406a.getPackageManager().getPackageInfo(f24406a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public co m1791a(String str) {
        if (!StringUtils.isEmpty(str)) {
            return a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    public co a(String str, boolean z) {
        co e;
        com.xiaomi.channel.commonutils.logger.b.b("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (!StringUtils.isEmpty(str)) {
            if (!this.f185a.a(str)) {
                return null;
            }
            co c2 = c(str);
            return (c2 == null || !c2.b()) ? (!z || !bg.b(f24406a) || (e = e(str)) == null) ? new cu(this, str, c2) : e : c2;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<bf> arrayList3 = new ArrayList();
        arrayList3.add(new bd("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new bd("conpt", a(bg.m1732a(f24406a))));
        }
        if (z) {
            arrayList3.add(new bd("reserved", "1"));
        }
        arrayList3.add(new bd("uuid", str2));
        arrayList3.add(new bd("list", bm.a(arrayList, ",")));
        arrayList3.add(new bd("countrycode", com.xiaomi.push.service.a.a(f24406a).b()));
        arrayList3.add(new bd("push_sdk_vc", String.valueOf((int) BuildConfig.VERSION_CODE)));
        String b2 = b();
        co c2 = c(b2);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", b2);
        if (c2 == null) {
            arrayList2.add(format);
            synchronized (b) {
                co coVar = b.get(b2);
                if (coVar != null) {
                    Iterator<String> it = coVar.a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                    }
                }
            }
        } else {
            arrayList2 = c2.a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (bf bfVar : arrayList3) {
                buildUpon.appendQueryParameter(bfVar.a(), bfVar.b());
            }
            try {
                return this.f186a == null ? bg.a(f24406a, new URL(buildUpon.toString())) : this.f186a.a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("network exception: " + e.getMessage());
        throw e;
    }

    /* renamed from: a  reason: collision with other method in class */
    protected JSONObject m1792a() {
        JSONObject jSONObject;
        synchronized (this.f188a) {
            jSONObject = new JSONObject();
            jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, 2);
            JSONArray jSONArray = new JSONArray();
            for (cp cpVar : this.f188a.values()) {
                jSONArray.put(cpVar.m1786a());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (co coVar : b.values()) {
                jSONArray2.put(coVar.m1781a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1793a() {
        synchronized (this.f188a) {
            this.f188a.clear();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1794a(String str) {
        this.f190b = str;
    }

    public void a(String str, co coVar) {
        if (StringUtils.isEmpty(str) || coVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + coVar);
        } else if (!this.f185a.a(str)) {
        } else {
            synchronized (this.f188a) {
                m1795a();
                if (this.f188a.containsKey(str)) {
                    this.f188a.get(str).a(coVar);
                } else {
                    cp cpVar = new cp(str);
                    cpVar.a(coVar);
                    this.f188a.put(str, cpVar);
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    protected boolean m1795a() {
        synchronized (this.f188a) {
            if (!f183a) {
                f183a = true;
                this.f188a.clear();
                String d2 = d();
                if (StringUtils.isEmpty(d2)) {
                    return false;
                }
                m1797b(d2);
                com.xiaomi.channel.commonutils.logger.b.b("loading the new hosts succeed");
                return true;
            }
            return true;
        }
    }

    public co b(String str) {
        return a(str, true);
    }

    protected String b() {
        return "resolver.msg.xiaomi.net";
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1796b() {
        ArrayList<String> arrayList;
        synchronized (this.f188a) {
            m1795a();
            arrayList = new ArrayList<>(this.f188a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                cp cpVar = this.f188a.get(arrayList.get(size));
                if (cpVar != null && cpVar.a() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<co> a2 = a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a2.get(i) != null) {
                a(arrayList.get(i), a2.get(i));
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    protected void m1797b(String str) {
        synchronized (this.f188a) {
            this.f188a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION) != 2) {
                throw new JSONException("Bad version");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    cp a2 = new cp().a(optJSONArray.getJSONObject(i));
                    this.f188a.put(a2.m1784a(), a2);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    String optString = jSONObject2.optString("host");
                    if (!StringUtils.isEmpty(optString)) {
                        try {
                            co a3 = new co(optString).a(jSONObject2);
                            b.put(a3.f178b, a3);
                            com.xiaomi.channel.commonutils.logger.b.m1616a("load local reserved host for " + a3.f178b);
                        } catch (JSONException unused) {
                            com.xiaomi.channel.commonutils.logger.b.m1616a("parse reserved host fail.");
                        }
                    }
                }
            }
        }
    }

    protected co c(String str) {
        cp cpVar;
        co a2;
        synchronized (this.f188a) {
            m1795a();
            cpVar = this.f188a.get(str);
        }
        if (cpVar == null || (a2 = cpVar.a()) == null) {
            return null;
        }
        return a2;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f188a) {
            for (Map.Entry<String, cp> entry : this.f188a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":\n");
                sb.append(entry.getValue().toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m1798c() {
        FileOutputStream fileOutputStream;
        synchronized (this.f188a) {
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    String jSONObject = m1792a().toString();
                    com.xiaomi.channel.commonutils.logger.b.b("persist host fallbacks = " + jSONObject);
                    if (!StringUtils.isEmpty(jSONObject)) {
                        fileOutputStream = f24406a.openFileOutput(f(), 0);
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                            try {
                                bufferedOutputStream2.write(h.b(m1790a(), jSONObject.getBytes(StandardCharsets.UTF_8)));
                                bufferedOutputStream2.flush();
                                bufferedOutputStream = bufferedOutputStream2;
                            } catch (Exception e) {
                                e = e;
                                bufferedOutputStream = bufferedOutputStream2;
                                com.xiaomi.channel.commonutils.logger.b.m1616a("persist bucket failure: " + e.getMessage());
                                x.a(bufferedOutputStream);
                                x.a(fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                x.a(bufferedOutputStream);
                                x.a(fileOutputStream);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } else {
                        fileOutputStream = null;
                    }
                    x.a(bufferedOutputStream);
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
                x.a(fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public co d(String str) {
        co coVar;
        synchronized (b) {
            coVar = b.get(str);
        }
        return coVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    protected java.lang.String d() {
        /*
            r7 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L64
            android.content.Context r2 = com.xiaomi.push.cs.f24406a     // Catch: java.lang.Throwable -> L64
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r7.f()     // Catch: java.lang.Throwable -> L64
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L64
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L58
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L55
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L55
            byte[] r3 = com.xiaomi.push.x.a(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L4e
            byte[] r5 = r7.m1790a()     // Catch: java.lang.Throwable -> L4e
            byte[] r3 = com.xiaomi.push.h.a(r5, r3)     // Catch: java.lang.Throwable -> L4e
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "load host fallbacks = "
            r3.append(r5)     // Catch: java.lang.Throwable -> L4e
            r3.append(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4e
            com.xiaomi.channel.commonutils.logger.b.b(r3)     // Catch: java.lang.Throwable -> L4e
            com.xiaomi.push.x.a(r1)
            com.xiaomi.push.x.a(r2)
            return r4
        L4e:
            r3 = move-exception
            goto L67
        L50:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L87
        L55:
            r3 = move-exception
            r1 = r0
            goto L67
        L58:
            com.xiaomi.push.x.a(r0)
            com.xiaomi.push.x.a(r0)
            goto L85
        L5f:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L87
        L64:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r4.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "load host exception "
            r4.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L86
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L86
            com.xiaomi.channel.commonutils.logger.b.m1616a(r3)     // Catch: java.lang.Throwable -> L86
            com.xiaomi.push.x.a(r1)
            com.xiaomi.push.x.a(r2)
        L85:
            return r0
        L86:
            r0 = move-exception
        L87:
            com.xiaomi.push.x.a(r1)
            com.xiaomi.push.x.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cs.d():java.lang.String");
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m1799d() {
        String e = e();
        try {
            File file = new File(f24406a.getFilesDir(), e);
            if (!file.exists()) {
                com.xiaomi.channel.commonutils.logger.b.b("Old host fallbacks file " + e + " does not exist.");
                return;
            }
            boolean delete = file.delete();
            StringBuilder sb = new StringBuilder();
            sb.append("Delete old host fallbacks file ");
            sb.append(e);
            sb.append(delete ? " successful." : " failed.");
            com.xiaomi.channel.commonutils.logger.b.m1616a(sb.toString());
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Delete old host fallbacks file " + e + " error: " + e2.getMessage());
        }
    }

    protected co e(String str) {
        if (System.currentTimeMillis() - this.f191c > this.f184a * 60 * 1000) {
            this.f191c = System.currentTimeMillis();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            co coVar = a(arrayList).get(0);
            if (coVar != null) {
                this.f184a = 0L;
                return coVar;
            }
            long j = this.f184a;
            if (j >= 15) {
                return null;
            }
            this.f184a = j + 1;
            return null;
        }
        return null;
    }

    protected String e() {
        if ("com.xiaomi.xmsf".equals(c)) {
            return c;
        }
        return c + ":pushservice";
    }

    /* renamed from: e  reason: collision with other method in class */
    public void m1800e() {
        String next;
        synchronized (this.f188a) {
            for (cp cpVar : this.f188a.values()) {
                cpVar.a(true);
            }
            while (true) {
                for (boolean z = false; !z; z = true) {
                    Iterator<String> it = this.f188a.keySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (this.f188a.get(next).m1785a().isEmpty()) {
                            break;
                        }
                    }
                }
                this.f188a.remove(next);
            }
        }
    }
}
