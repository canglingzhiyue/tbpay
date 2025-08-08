package com.flybird.deploy;

import android.content.pm.PackageInfo;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Pair;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.flybird.FBTools;
import com.flybird.deploy.b;
import com.flybird.deploy.callback.FBTemplateDeciderSingleFileModelCallback;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateListModelCallback;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.FBUpdatePolicy;
import com.flybird.deploy.model.IFBTplInfo;
import com.flybird.support.basics.AppContextHolder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import tb.cum;
import tb.cun;
import tb.drm;
import tb.idy;
import tb.idz;
import tb.ieb;
import tb.iec;
import tb.ied;
import tb.jhy;

/* loaded from: classes4.dex */
public class FBTemplateDecider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public static final Map<String, FBTemplateDecider> f7201a;
    public static final Map<String, FBTemplateContent> b;
    public static final Map<String, File> c;
    public static final com.flybird.support.basics.b<String, Void> d;
    public static final com.flybird.support.basics.b<String, Void> e;
    public static final com.flybird.support.basics.b<Object, byte[]> f;
    public volatile State g;
    public final String h;
    public com.flybird.deploy.model.e i;
    public final long j;

    /* loaded from: classes4.dex */
    public enum State {
        NOT_READY,
        READY,
        DESTROYED
    }

    static {
        try {
            Platform.i();
        } catch (Throwable unused) {
        }
        f7201a = new HashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new com.flybird.support.basics.b<String, Void>() { // from class: com.flybird.deploy.FBTemplateDecider.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(String str, Void r5) throws Throwable {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r5}) : str;
            }

            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(String str, Void r5, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, r5, th});
                }
                cun.a(th, "dataPtrToCharsProcessor failed");
                return "";
            }

            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(File file, Void r5) throws Throwable {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r5}) : ConnectionUtils.b(idy.b(file));
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(byte[] bArr, Void r5) throws Throwable {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r5}) : ConnectionUtils.b(bArr);
            }
        };
        e = new com.flybird.support.basics.b<String, Void>() { // from class: com.flybird.deploy.FBTemplateDecider.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(String str, Void r5, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, r5, th});
                }
                cun.a(th, "dataPtrGetMd5Processor failed");
                return "";
            }

            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(File file, Void r6) throws Throwable {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r6});
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[1024];
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    int i = 0;
                    while (i != -1) {
                        i = fileInputStream.read(bArr);
                        if (i > 0) {
                            messageDigest.update(bArr, 0, i);
                        }
                    }
                    String a2 = ConnectionUtils.a(messageDigest.digest());
                    fileInputStream.close();
                    return a2;
                } catch (Exception e2) {
                    cun.a((Throwable) e2, "error while md5 file");
                    return null;
                }
            }

            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(String str, Void r5) throws Throwable {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r5}) : idy.a(ConnectionUtils.a(str));
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
            @Override // com.flybird.support.basics.b
            public String a(byte[] bArr, Void r5) throws Throwable {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r5}) : idy.a(bArr);
            }
        };
        f = new com.flybird.support.basics.b<Object, byte[]>() { // from class: com.flybird.deploy.FBTemplateDecider.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.support.basics.b
            public Object a(String str, byte[] bArr, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, bArr, th});
                }
                cun.a(th, "dataPtrDecryptProcessor failed");
                return new byte[0];
            }

            @Override // com.flybird.support.basics.b
            public Object a(File file, byte[] bArr) throws Throwable {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, bArr});
                }
                throw new RuntimeException("Unsupported, sorry");
            }

            @Override // com.flybird.support.basics.b
            public Object a(String str, byte[] bArr) throws Throwable {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, bArr});
                }
                throw new RuntimeException("Unsupported behavior");
            }

            @Override // com.flybird.support.basics.b
            public Object a(byte[] bArr, byte[] bArr2) throws Throwable {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, bArr2});
                }
                byte[] bArr3 = bArr2;
                try {
                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    cipher.init(2, new SecretKeySpec(bArr3, "AES"));
                    return cipher.doFinal(bArr);
                } catch (Throwable th) {
                    cun.a(th, "error while aes");
                    return null;
                }
            }
        };
    }

    public FBTemplateDecider(String str, com.flybird.deploy.model.e eVar) {
        AppContextHolder.feedAppContext(eVar.a());
        g.a();
        idz.a();
        this.h = str;
        this.i = eVar;
        this.j = createNativeDecider(str, eVar.b(), this);
        this.g = State.READY;
    }

    public static FBTemplateDecider a(String str) {
        FBTemplateDecider fBTemplateDecider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("62c84036", new Object[]{str});
        }
        Map<String, FBTemplateDecider> map = f7201a;
        synchronized (map) {
            fBTemplateDecider = map.get(str);
        }
        return fBTemplateDecider;
    }

    public static FBTemplateDecider a(String str, com.flybird.deploy.model.e eVar) {
        FBTemplateDecider fBTemplateDecider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("e64c94f", new Object[]{str, eVar});
        }
        cun.c("_create identifier is " + str + " options is " + eVar);
        ieb.a();
        Map<String, FBTemplateDecider> map = f7201a;
        synchronized (map) {
            synchronized (map) {
                fBTemplateDecider = map.get(str);
            }
            return fBTemplateDecider;
        }
        if (fBTemplateDecider != null) {
            cun.c("_create identifier " + str + " already existed");
        } else {
            fBTemplateDecider = new FBTemplateDecider(str, eVar);
            map.put(str, fBTemplateDecider);
            cun.c("_create identifier " + str + " created: " + fBTemplateDecider);
        }
        return fBTemplateDecider;
    }

    public static FBTemplateContent a(String str, String str2) {
        FBTemplateContent fBTemplateContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("3d90d583", new Object[]{str, str2});
        }
        if (AppContextHolder.b && (fBTemplateContent = b.get(ConnectionUtils.a(str2, str))) != null) {
            try {
                return FBTemplateContent.fromJSONObject(FBFullTplInfo.toJSONObject(fBTemplateContent));
            } catch (Exception e2) {
                cun.a("_getOverrideForTools: exception", e2);
            }
        }
        return null;
    }

    public static com.flybird.deploy.model.e a(FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.flybird.deploy.model.e) ipChange.ipc$dispatch("e96fe223", new Object[]{fBTemplateDecider});
        }
        if (fBTemplateDecider == null) {
            return null;
        }
        fBTemplateDecider.a();
        return fBTemplateDecider.i;
    }

    public static String b(FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c21c505", new Object[]{fBTemplateDecider});
        }
        if (fBTemplateDecider == null) {
            return null;
        }
        fBTemplateDecider.a();
        return fBTemplateDecider.h;
    }

    public static native void basicDownloadTplByTplInfo(long j, String str, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback);

    public static native void basicGetTemplateByTplInfo(long j, String str, int i, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback);

    private static void callRpc(long j, long j2, FBTemplateDecider fBTemplateDecider, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9827de", new Object[]{new Long(j), new Long(j2), fBTemplateDecider, str, str2, str3});
        } else if (ieb.b()) {
            cun.a("Decider", "callRpc on main thread");
            returnCallRpcResult(j, j2, null, null, "callRpc on main thread");
        } else {
            try {
                if (StringUtils.isEmpty(str)) {
                    cun.a("missing op_type");
                }
                String str4 = Platform.f5257a;
                returnCallRpcResult(j, j2, new JSONObject(new HashMap()).toString(), "", null);
            } catch (Throwable th) {
                cun.a("Decider", "callRpc error", th);
                returnCallRpcResult(j, j2, null, null, "caught exception");
            }
        }
    }

    private static void clearPackageCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af654ae4", new Object[]{str, str2});
            return;
        }
        try {
            String a2 = ConnectionUtils.a(str, str2, FBTemplateStorage$StorageType.DEFAULT);
            com.flybird.support.basics.c.b("fb__tpl_storage/pack", ConnectionUtils.b(a2));
            com.flybird.support.basics.c.a("fb__tpl_storage/pack", a2);
        } catch (Throwable th) {
            cun.a("Decider", "clearPackageCache error", th);
        }
    }

    public static native long createNativeDecider(String str, String str2, FBTemplateDecider fBTemplateDecider);

    public static native String delayedGetWaitQueueTpls(long j);

    private static void deleteTemplates(FBTemplateDecider fBTemplateDecider, String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d45f552", new Object[]{fBTemplateDecider, str, new Integer(i), new Long(j)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("C -> deleteTemplates on ");
        sb.append(fBTemplateDecider);
        sb.append(", tplIdsJoinedByComma=");
        sb.append(str);
        sb.append(", storageType=");
        sb.append(i);
        sb.append(" *cb=");
        int i2 = ied.f28960a;
        sb.append(Long.toHexString(j));
        cun.c(sb.toString());
        ieb.a();
        if (a(fBTemplateDecider) == null) {
            cun.b("C -> deleteTemplates no options");
            returnDeleteTemplatesResult(j, 1);
            return;
        }
        String[] split = StringUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            arrayList.add(com.flybird.deploy.model.d.a(str2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.flybird.deploy.model.d dVar = (com.flybird.deploy.model.d) it.next();
            try {
                cun.c("C -> deleteTemplates removing " + dVar + " on " + i);
                synchronized (ConnectionUtils.class) {
                    com.flybird.support.basics.c.a("fb__tpl_storage", ConnectionUtils.a(fBTemplateDecider, dVar, ConnectionUtils.a(i)));
                }
            } catch (Exception e2) {
                fBTemplateDecider.a(dVar != null ? dVar.a() : "", "e:decider:cDelTplEx", "", e2.getMessage());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("C -> deleteTemplates error while deleting ");
                sb2.append(dVar != null ? dVar.a() : "-null");
                cun.a(sb2.toString(), e2);
            }
        }
        cun.c("C -> deleteTemplates all done, returning to *cb=" + Long.toHexString(j));
        returnDeleteTemplatesResult(j, 0);
    }

    private static void dispatchDeployCoreTask(int i, FBTemplateDecider fBTemplateDecider, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d90469", new Object[]{new Integer(i), fBTemplateDecider, new Long(j), new Long(j2)});
            return;
        }
        cun.b("Decider", "dispatchCoreTask: get " + i + ", " + j + ", " + j2);
        if (i != 2) {
            cun.a("Decider", "dispatchCoreTask: unknown type " + i);
            return;
        }
        ieb.b.submit(new Runnable() { // from class: com.flybird.deploy.-$$Lambda$8ULjR0D6HJfz21bDGA8r4ShOqmA
            @Override // java.lang.Runnable
            public final void run() {
                FBTemplateDecider.a(j, j2);
            }
        });
    }

    private static void downloadCdnFile(String str, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70cd172", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("C -> downloadCdnFile url ");
        sb.append(str);
        sb.append(" *cb=");
        int i = ied.f28960a;
        sb.append(Long.toHexString(j));
        sb.append(" *task=");
        sb.append(Long.toHexString(j2));
        cun.c(sb.toString());
        ieb.a();
        cun.c("Decider", "C -> downloadCdnFile url appended result " + str);
        b.a(str, new cum<b.a, Void, Throwable>() { // from class: com.flybird.deploy.FBTemplateDecider.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Void, java.lang.Object] */
            @Override // tb.cum
            public Void apply(b.a aVar) {
                byte[] bArr;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, aVar});
                }
                b.a aVar2 = aVar;
                if (aVar2 != null && (bArr = aVar2.c) != null && bArr.length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("C -> downloadCdnFile done for ");
                    long j3 = j;
                    int i2 = ied.f28960a;
                    sb2.append(Long.toHexString(j3));
                    sb2.append(", returning ");
                    sb2.append(aVar2.c.length);
                    sb2.append(" bytes");
                    cun.c(sb2.toString());
                    FBTemplateDecider.returnDownloadCdnFileResult(j, j2, 0, aVar2.c);
                    return null;
                }
                FBTemplateDecider.returnDownloadCdnFileResult(j, j2, 2002, null);
                return null;
            }

            @Override // tb.cum
            public void error(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("25621cab", new Object[]{this, th});
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("C -> downloadCdnFile exception for ");
                long j3 = j;
                int i2 = ied.f28960a;
                sb2.append(Long.toHexString(j3));
                cun.a(sb2.toString(), th);
                FBTemplateDecider.returnDownloadCdnFileResult(j, j2, 2002, null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void downloadTemplate(com.flybird.deploy.FBTemplateDecider r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, long r24, long r26, long r28, boolean r30) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.deploy.FBTemplateDecider.downloadTemplate(com.flybird.deploy.FBTemplateDecider, java.lang.String, java.lang.String, java.lang.String, int, long, long, long, boolean):void");
    }

    public static native void enhancedGetTemplateByTplInfo(long j, String str, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback);

    private static void exceptionLog(FBTemplateDecider fBTemplateDecider, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a080762", new Object[]{fBTemplateDecider, str, str2});
            return;
        }
        try {
            com.flybird.deploy.model.e a2 = a(fBTemplateDecider);
            if (a2 == null) {
                cun.b("C -> exceptionLog missing decider");
                return;
            }
            com.flybird.deploy.callback.c e2 = a2.e();
            if (e2 == null) {
                cun.b("C -> exceptionLog no listener");
                return;
            }
            cun.b("C -> exceptionLog err: " + str + " " + str2 + " on " + fBTemplateDecider);
            e2.onError(str, str2);
        } catch (Throwable th) {
            cun.a("C -> exceptionLog ex when error log", th);
        }
    }

    private static Object fileDataPtrDecrypt(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba1820", new Object[]{obj, str});
        }
        try {
            return f.a(obj, str.getBytes("UTF-8"));
        } catch (Throwable th) {
            cun.a("Decider", "fileDataPtrDecrypt error", th);
            return null;
        }
    }

    private static String fileDataPtrGetMd5(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ae19a2d", new Object[]{obj});
        }
        try {
            return e.a(obj, (Object) null);
        } catch (Exception e2) {
            cun.a("Decider", "error on fileDataPtrGetMd5", e2);
            return null;
        }
    }

    private static String fileDataPtrToChars(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c367dde3", new Object[]{obj});
        }
        try {
            return d.a(obj, (Object) null);
        } catch (Exception unused) {
            return "";
        }
    }

    private static void forceDownloadShouldRetry(FBTemplateDecider fBTemplateDecider, FBTemplateDeciderTemplateModelCallback fBTemplateDeciderTemplateModelCallback, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb92197", new Object[]{fBTemplateDecider, fBTemplateDeciderTemplateModelCallback, new Long(j), new Long(j2)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("C -> forceDownloadShouldRetry on ");
        sb.append(fBTemplateDecider);
        sb.append(" *task=");
        int i = ied.f28960a;
        sb.append(Long.toHexString(j));
        sb.append(" *cb=");
        sb.append(j2);
        cun.c(sb.toString());
        ieb.a();
        com.flybird.deploy.model.e a2 = a(fBTemplateDecider);
        if (a2 == null) {
            cun.b("C -> forceDownloadShouldRetry check failed");
            returnForceDownloadShouldRetry(j, j2, false);
        } else if (fBTemplateDeciderTemplateModelCallback == null) {
            cun.b("C -> forceDownloadShouldRetry check failed 2");
            returnForceDownloadShouldRetry(j, j2, false);
        } else {
            a2.c().askUserShouldRetry(new cum<Boolean, Void, Void>() { // from class: com.flybird.deploy.FBTemplateDecider.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a */
                public boolean f7202a = false;

                {
                    FBTemplateDecider.this = fBTemplateDecider;
                }

                /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Void, java.lang.Object] */
                @Override // tb.cum
                public Void apply(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, bool});
                    }
                    Boolean bool2 = bool;
                    if (this.f7202a) {
                        return null;
                    }
                    this.f7202a = true;
                    ieb.a();
                    if (FBTemplateDecider.this.g != State.READY) {
                        cun.b("C -> forceDownloadShouldRetry callback->x");
                        FBTemplateDecider.returnForceDownloadShouldRetry(j, j2, false);
                        return null;
                    }
                    cun.c("C -> forceDownloadShouldRetry callback->" + bool2);
                    long j3 = j;
                    long j4 = j2;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    }
                    FBTemplateDecider.returnForceDownloadShouldRetry(j3, j4, z);
                    return null;
                }

                @Override // tb.cum
                public void error(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("25621cab", new Object[]{this, r4});
                    }
                }
            }, fBTemplateDeciderTemplateModelCallback.f7211a);
        }
    }

    public static native boolean freeNativeDecider(long j);

    private static Object[] getBundleTpl(FBTemplateDecider fBTemplateDecider, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("b3e523a6", new Object[]{fBTemplateDecider, str, str2});
        }
        cun.c("C -> getBundleTpl on " + fBTemplateDecider + ", tplId=" + str + ", tplInfo=" + str2);
        ieb.a();
        Object[] objArr = new Object[2];
        com.flybird.deploy.model.e a2 = a(fBTemplateDecider);
        if (a2 == null) {
            cun.a("C -> getBundleTpl missing options of " + fBTemplateDecider);
            return null;
        }
        iec c2 = ConnectionUtils.c(str);
        if (c2.f28959a == null) {
            a2.b();
        }
        String str3 = c2.b;
        if (str3 == null) {
            str3 = fBTemplateDecider.h;
        }
        String str4 = c2.c;
        if (str4 != null && str3 != null) {
            String a3 = ConnectionUtils.a(str4, str3);
            cun.c("C -> getBundleTpl filePath=" + a3);
            String readAssetsFile = FBTools.readAssetsFile(a3, a2.a());
            cun.c("C -> getBundleTpl tplContent length " + readAssetsFile.length() + " chars");
            try {
                if (!StringUtils.isEmpty(readAssetsFile)) {
                    FBTemplateContent fromJsonString = FBTemplateContent.fromJsonString(readAssetsFile);
                    objArr[0] = fromJsonString;
                    objArr[1] = com.flybird.deploy.model.a.b(FBTemplateContent.toBasicTplInfo(fromJsonString));
                    cun.c("C -> getBundleTpl final content " + objArr[0] + ", info" + objArr[1]);
                    return objArr;
                }
                cun.b("C -> getBundleTpl cannot find tpl " + str + " on " + fBTemplateDecider);
                return null;
            } catch (Throwable th) {
                fBTemplateDecider.a(str, "e:decider:cGetBundleEx", "", th.getMessage());
                cun.a("C -> getBundleTpl parse bundled tpl error of " + fBTemplateDecider, th);
                return null;
            }
        }
        cun.a("C -> getBundleTpl missing pageid or bizid of " + fBTemplateDecider);
        return null;
    }

    private static String getBundleTplInfoFileContent(FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1943070", new Object[]{fBTemplateDecider});
        }
        cun.c("C -> getBundleTplInfoFileContent on " + fBTemplateDecider);
        ieb.a();
        com.flybird.deploy.model.e a2 = a(fBTemplateDecider);
        if (a2 == null) {
            cun.a("C -> getBundleTplInfoFileContent missing options of " + fBTemplateDecider);
            return null;
        }
        String readAssetsFile = FBTools.readAssetsFile("template.info", a2.a());
        cun.c("C -> getBundleTplInfoFileContent content length " + readAssetsFile.length());
        return readAssetsFile;
    }

    private static String getContentWithVerify(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70c8af10", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("C -> getContentWithVerify ");
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : "null");
        sb.append("bytes");
        cun.c(sb.toString());
        if (bArr == null) {
            return null;
        }
        try {
            JSONObject d2 = ConnectionUtils.d(ConnectionUtils.b(ConnectionUtils.c(bArr)));
            String optString = d2.optString(com.taobao.android.msoa.c.TAG);
            String optString2 = d2.optString("s");
            int currentNetworkEnvironment = FBDocumentAssistor.getCurrentNetworkEnvironment();
            String str = (currentNetworkEnvironment == 0 || currentNetworkEnvironment == 1) ? "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmGXVAHIyf0O+kvhDKUSM4uWNP3/Gig7DVD1dwbTFWwZz7HpYcMulZRxY3iYgPrMeZ/B2AfTeq21H7MqZ/PwjZbGhq1/noRSXfG+KPo4vlnkTAwBQ+mr3PpuPqqZz9D6SRhq5lzoSynLoUUfQVvYDgnUVTnnq3EyqC/B1DpwQMuesemtvS2HYqJfmPRskyt8y/LbHhXLyX4NrdhB33SAdLSLafTSGpATfbV+v/i6HT9P9HLsGLT2ydxItjxEFu6DJfoe+U8vguBJpp/ftjxBuOzW2sWBVycfrybba1PWtd9U0ZHhMauJJ+1mp69wFr6c/DNegLdcDqa3Af9tGFN146wIDAQAB" : "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhLHc2n1DzRk5DSXBnwvg+fMAWTOwy9k1XXmohc0xecbtaEEh47cquTLHGBgaL+MS87iBo5Wnx3ZsVNxE+GSJXU3gz9nVagNJJ8ncdgM3dRMj2m7+UrhWHGZcIJjCSi6r57eqb0desgq8xGkI5J3oGFZfX5h2EcWGuptisBwiS1xTe2CyiZA04Hga0CuijD2DTVdbIhrtF1U90GIE9UjRirHW+N+O4umNNNqVStyMnojNCYqLYtyRyOwTOwaYJr4vxKLFSF7uYOxfUM3Z9P44Fpx6s+6hXXRTVNSX6apud6k3vDHU+z2Yqro2IrNoIt9QB/k1fmRbg2hze26oaKPGTwIDAQAB";
            byte[] a2 = ConnectionUtils.a(optString);
            byte[] decode = Base64.decode(optString2, 0);
            PublicKey generatePublic = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(generatePublic);
            signature.update(a2);
            boolean verify = signature.verify(decode);
            cun.c("C -> getContentWithVerify signStr=" + optString2 + ", checkResult=" + verify);
            if (verify) {
                return optString;
            }
            cun.b("check sign: found mismatch");
            return null;
        } catch (Throwable th) {
            cun.a("C -> getContentWithVerify error while checking with content", th);
            return null;
        }
    }

    private static Object getFileDataFromPackage(FBTemplateDecider fBTemplateDecider, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f212b0fb", new Object[]{fBTemplateDecider, str, str2, str3});
        }
        try {
            String b2 = ConnectionUtils.b(ConnectionUtils.a(str, str2, FBTemplateStorage$StorageType.DEFAULT));
            return com.flybird.support.basics.c.a("fb__tpl_storage/pack", b2 + File.separator + str3, false);
        } catch (Throwable th) {
            cun.a("Decider", "getFileDataFromPackage error", th);
            return null;
        }
    }

    private static Object getJsPackageFile(String str, String str2, long j) {
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3767aac", new Object[]{str, str2, new Long(j)});
        }
        ieb.a();
        try {
            synchronized (ConnectionUtils.class) {
                a2 = com.flybird.support.basics.c.a("fb__tpl_storage/js", ConnectionUtils.c(str, str2), true);
            }
            return a2;
        } catch (Throwable th) {
            cun.a("Decider", "getJs error on run", th);
            return null;
        }
    }

    private static boolean hasJsPackageFile(String str, String str2, long j) {
        boolean exists;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a5ef98e", new Object[]{str, str2, new Long(j)})).booleanValue();
        }
        ieb.a();
        try {
            synchronized (ConnectionUtils.class) {
                String c2 = ConnectionUtils.c(str, str2);
                com.flybird.support.basics.b<Pair<File, Long>, Pair<File, Boolean>> bVar = com.flybird.support.basics.c.f7232a;
                ieb.a();
                exists = com.flybird.support.basics.c.c("fb__tpl_storage/js", c2).exists();
            }
            return exists;
        } catch (Throwable th) {
            cun.a("Decider", "hasJs error on run", th);
            return false;
        }
    }

    private static boolean hasPackageCache(FBTemplateDecider fBTemplateDecider, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c24283c7", new Object[]{fBTemplateDecider, str, str2})).booleanValue();
        }
        try {
            return ConnectionUtils.e(str, str2) != null;
        } catch (Throwable th) {
            cun.a("Decider", "hasPackageCache error", th);
            return false;
        }
    }

    public static native void idleGetTplsToDownload(long j, boolean z, FBTemplateDeciderTemplateListModelCallback fBTemplateDeciderTemplateListModelCallback);

    private static boolean isTplModelValidVersionMatched(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c1e9c19", new Object[]{fBTemplateContent})).booleanValue();
        }
        cun.c("C -> isTplModelValidVersionMatched on " + fBTemplateContent);
        return a(fBTemplateContent);
    }

    private static void logPackageDownloadTask(FBTemplateDecider fBTemplateDecider, Object obj, int i, int i2, String str, String str2, String str3, String str4, long j) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7917fad8", new Object[]{fBTemplateDecider, obj, new Integer(i), new Integer(i2), str, str2, str3, str4, new Long(j)});
            return;
        }
        if (i == 0 && obj == null) {
            i = 3999;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("deploy_type", String.valueOf(i2));
        hashMap.put("packageName", str);
        hashMap.put("packageHash", str2);
        hashMap.put("packageUrl", str3);
        hashMap.put("filePath", str4);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(j));
        hashMap.put("resultCode", String.valueOf(i));
        if (fBTemplateDecider != null) {
            fBTemplateDecider.a();
            str5 = fBTemplateDecider.h;
        } else {
            str5 = "";
        }
        hashMap.put("bizCode", str5);
        try {
            str6 = ConnectionUtils.a(AppContextHolder.f7228a);
        } catch (Throwable unused) {
            str6 = "err";
        }
        hashMap.put("netType", str6);
        Platform.a("10101082", hashMap);
    }

    public static native void makeTemplateUpdateExceptionLog(long j, String str, String str2);

    public static native void nativeAcquireMetaInfoFile(long j, String str, FBTemplateDeciderSingleFileModelCallback fBTemplateDeciderSingleFileModelCallback);

    public static native void nativeCallDeployCoreFuncPtr(long j, long j2);

    public static native boolean nativeCheckHasTplInBundle(long j, String str);

    public static native FBTemplateContent nativeGetLocalTemplate(long j, String str, String str2, boolean z);

    public static native void nativePackAcquireAndGetFile(long j, String str, String str2, String str3, String str4, FBTemplateDeciderSingleFileModelCallback fBTemplateDeciderSingleFileModelCallback);

    private static void notifyDeciderTaskStatus(FBTemplateDecider fBTemplateDecider, String str, String str2, int i, int i2) {
        com.flybird.deploy.callback.d d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4f9c05", new Object[]{fBTemplateDecider, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        cun.c("C -> notifyDeciderTaskStatus on " + fBTemplateDecider + " for " + str + " " + str2 + " status " + i + " downloadMode " + i2);
        ieb.a();
        com.flybird.deploy.model.e a2 = a(fBTemplateDecider);
        if (a2 == null || (d2 = a2.d()) == null) {
            return;
        }
        cun.c("C -> notifyDeciderTaskStatus sent " + d2 + " " + str + " " + str2 + " status " + i + " downloadMode " + i2);
        d2.onStatusNotify(str, str2, i, i2);
    }

    public static native void returnCallRpcResult(long j, long j2, String str, String str2, String str3);

    public static native void returnDeleteTemplatesResult(long j, int i);

    public static native void returnDownloadCdnFileResult(long j, long j2, int i, byte[] bArr);

    public static native void returnDownloadTemplateResult(long j, long j2, long j3, FBTemplateContent fBTemplateContent, int i);

    public static native void returnForceDownloadShouldRetry(long j, long j2, boolean z);

    public static native void returnPackSaveResult(long j, long j2, int i);

    public static native void returnSaveTemplatesResult(long j, int i);

    private static void saveJsPackageFile(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce3d87e", new Object[]{str, str2, bArr});
            return;
        }
        ieb.a();
        try {
            synchronized (ConnectionUtils.class) {
                com.flybird.support.basics.c.a("fb__tpl_storage/js", ConnectionUtils.c(str, str2), bArr, true);
            }
        } catch (Throwable th) {
            cun.a("Decider", "saveJs error on run", th);
        }
    }

    private static void savePackFile(FBTemplateDecider fBTemplateDecider, String str, String str2, Object obj, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56816fdb", new Object[]{fBTemplateDecider, str, str2, obj, new Long(j), new Long(j2)});
            return;
        }
        try {
            ConnectionUtils.a(str, str2, obj);
            returnPackSaveResult(j, j2, 0);
        } catch (Throwable th) {
            cun.a("Decider", "savePackFile error", th);
            returnPackSaveResult(j, j2, 3005);
        }
    }

    private static void saveTemplates(FBTemplateDecider fBTemplateDecider, FBTemplateContent[] fBTemplateContentArr, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524b0c6a", new Object[]{fBTemplateDecider, fBTemplateContentArr, new Integer(i), new Long(j)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("C -> saveTemplates on ");
        sb.append(fBTemplateDecider);
        sb.append(", models=");
        sb.append(Arrays.toString(fBTemplateContentArr));
        sb.append(", storageType=");
        sb.append(i);
        sb.append(" *cb=");
        int i2 = ied.f28960a;
        sb.append(Long.toHexString(j));
        cun.c(sb.toString());
        ieb.a();
        if (a(fBTemplateDecider) == null) {
            cun.b("C -> saveTemplates no options");
            returnSaveTemplatesResult(j, 1);
            return;
        }
        int length = fBTemplateContentArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            FBTemplateContent fBTemplateContent = fBTemplateContentArr[i3];
            try {
                cun.c("C -> saveTemplates saving " + fBTemplateContent + " to " + i);
                fBTemplateDecider.b(fBTemplateContent);
                ConnectionUtils.a(fBTemplateDecider, fBTemplateContent, i);
            } catch (Exception e2) {
                fBTemplateDecider.a(fBTemplateContent != null ? fBTemplateContent.getTplId() : "", "e:decider:cSaveTplEx", "", e2.getMessage());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("C -> saveTemplates error while writing ");
                sb2.append(fBTemplateContent != null ? fBTemplateContent.getTplId() : "-null");
                cun.a(sb2.toString(), e2);
            }
        }
        cun.c("C -> saveTemplates all done, returning to *cb=" + Long.toHexString(j));
        returnSaveTemplatesResult(j, 0);
    }

    private static Object[] selectTemplate(FBTemplateDecider fBTemplateDecider, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("6e25c0cb", new Object[]{fBTemplateDecider, str, new Integer(i)});
        }
        ieb.a();
        cun.c("selectTemplate decider is " + fBTemplateDecider + " tplId is " + str + " tplId is " + str + " storageType is " + i);
        if (a(fBTemplateDecider) == null) {
            cun.a("C -> selectTemplate no options" + fBTemplateDecider);
            return null;
        }
        Object[] objArr = new Object[3];
        try {
            FBTemplateContent a2 = ConnectionUtils.a(fBTemplateDecider, com.flybird.deploy.model.d.a(str), i);
            if (a2 == null) {
                objArr[0] = null;
                objArr[1] = null;
                objArr[2] = null;
                cun.c("C -> selectTemplate cant find " + str + ", returning null");
            } else {
                objArr[0] = a2;
                objArr[1] = com.flybird.deploy.model.a.b(FBTemplateContent.toBasicTplInfo(a2));
                objArr[2] = a2.getTplId();
                cun.c("C -> selectTemplate found " + str + " -> " + a2);
            }
        } catch (Exception e2) {
            fBTemplateDecider.a(str, "e:decider:cSelTplEx", "", e2.getMessage());
            cun.a("C -> selectTemplate error", e2);
        }
        return objArr;
    }

    private static void updateTplModelValidVersionSync(FBTemplateContent fBTemplateContent, FBTemplateDecider fBTemplateDecider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a02e808", new Object[]{fBTemplateContent, fBTemplateDecider, new Integer(i)});
            return;
        }
        cun.c("C -> updateTplModelValidVersionSync on " + fBTemplateContent);
        fBTemplateDecider.b(fBTemplateContent);
        try {
            ConnectionUtils.a(fBTemplateDecider, fBTemplateContent, i);
        } catch (Exception e2) {
            fBTemplateDecider.a(fBTemplateContent != null ? fBTemplateContent.getTplId() : "", "e:decider:cValidUpdateEx", "", e2.getMessage());
            cun.a("C -> updateTplModelValidVersionSync error while writing " + fBTemplateContent.getTplId(), e2);
        }
    }

    public void a(FBFullTplInfo fBFullTplInfo, com.flybird.deploy.model.c cVar, com.flybird.deploy.callback.a aVar) {
        FBTemplateContent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a3e769", new Object[]{this, fBFullTplInfo, cVar, aVar});
            return;
        }
        cun.c("_updateAndGetTplInfoEnhancedAsyncNonBlocking called on " + this + " tplId: " + fBFullTplInfo + " options: " + cVar);
        ieb.a();
        a();
        cun.a(fBFullTplInfo, "must have tpl info");
        a.C0256a c0256a = new a.C0256a();
        String tplId = fBFullTplInfo.getTplId();
        c0256a.deploymentType = FBUpdatePolicy.DeploymentType.EnhancedDeployment;
        c0256a.requests.add(fBFullTplInfo);
        c0256a.customToken = cVar.b();
        c0256a.customInfo.a(cVar.a());
        if (AppContextHolder.b && (a2 = a(this.h, fBFullTplInfo.getTplId())) != null) {
            try {
                aVar.onSuccess(Collections.singletonList(a2), c0256a);
                return;
            } catch (Throwable th) {
                cun.a("_updateAndGetTplInfoEnhancedAsyncNonBlocking err", th);
            }
        }
        try {
            enhancedGetTemplateByTplInfo(this.j, FBFullTplInfo.toJSONString(fBFullTplInfo), new d(this, c0256a, tplId, fBFullTplInfo, aVar));
        } catch (Throwable th2) {
            c0256a.errors.add(th2);
            a(tplId, "e:decider:enhanceOverallEx", "", th2.getMessage());
            cun.a("_updateAndGetTplInfoEnhancedAsync failed on " + this + " tplId: " + fBFullTplInfo + " callback ctx: " + c0256a, th2);
            a((FBTemplateContent) null, c0256a);
            aVar.onFailure(c0256a);
        }
    }

    public void a(com.flybird.deploy.model.b bVar, com.flybird.deploy.callback.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8820ae1", new Object[]{this, bVar, aVar});
            return;
        }
        a();
        ieb.a();
        ieb.b.submit(new e(this, bVar, aVar));
    }

    public void a(String str, FBTemplateContent fBTemplateContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a9d59", new Object[]{this, str, fBTemplateContent, new Boolean(z)});
        } else {
            a(str, fBTemplateContent, z, Long.MIN_VALUE);
        }
    }

    public final void b(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f4f212", new Object[]{this, fBTemplateContent});
            return;
        }
        Pair a2 = drm.a("App:PackageInfo");
        if (((Boolean) a2.first).booleanValue()) {
            String str = ((PackageInfo) a2.second).versionName;
            fBTemplateContent.setNoBundledCheckedPkgVer(str);
            cun.c("C -> _updateValidVersion version set to " + str);
            return;
        }
        a(fBTemplateContent != null ? fBTemplateContent.getTplId() : "", "e:decider:cValidUpdateNoInfo", "", "");
        cun.b("C -> _updateValidVersion failed to get pkg info");
    }

    @Deprecated
    public void b(String str, FBTemplateContent fBTemplateContent, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88b140c", new Object[]{this, str, fBTemplateContent, new Boolean(z), new Long(j)});
        } else {
            a(str, fBTemplateContent, z, j);
        }
    }

    public void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
        } else {
            a(str, str2, str3, str4);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FBTemplateDecider{state=");
        sb.append(this.g);
        sb.append(", identifier='");
        sb.append(this.h);
        sb.append('\'');
        sb.append(", ptrNativeDecider=");
        long j = this.j;
        int i = ied.f28960a;
        sb.append(Long.toHexString(j));
        sb.append('}');
        return sb.toString();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g == State.READY) {
        } else {
            cun.a("state of FBTemplateDecider is not ready");
        }
    }

    public static boolean a(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("186b5815", new Object[]{fBTemplateContent})).booleanValue();
        }
        Pair a2 = drm.a("App:PackageInfo");
        if (((Boolean) a2.first).booleanValue()) {
            String str = ((PackageInfo) a2.second).versionName;
            boolean equals = StringUtils.equals(fBTemplateContent.getNoBundledCheckedPkgVer(), str);
            cun.c("C -> _updateValidVersion local version " + str + ", returning " + equals);
            return equals;
        }
        cun.b("C -> _updateValidVersion failed to get pkg info");
        return false;
    }

    public FBTemplateContent a(com.flybird.deploy.model.d dVar) {
        FBTemplateContent a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("2bd5b42f", new Object[]{this, dVar});
        }
        cun.c("_getLocalTemplate for " + dVar + " on " + this);
        ieb.a();
        a();
        cun.a(dVar, "missing tpl info");
        String a3 = dVar.a();
        if (AppContextHolder.b && (a2 = a(this.h, a3)) != null) {
            return a2;
        }
        try {
            a();
            com.flybird.deploy.model.e eVar = this.i;
            String b2 = com.flybird.deploy.model.d.b(dVar);
            long j = this.j;
            if (eVar.g() != FBUpdatePolicy.DeploymentType.BasicDeployment) {
                z = false;
            }
            FBTemplateContent nativeGetLocalTemplate = nativeGetLocalTemplate(j, b2, a3, z);
            cun.c("_getLocalTemplate for " + dVar + " on " + this);
            return nativeGetLocalTemplate;
        } catch (Exception e2) {
            a(a3, "e:decider:getLoc2Ex", "", e2.getMessage());
            cun.a("_getLocalTemplate: exception", e2);
            return null;
        }
    }

    public final void a(FBTemplateContent fBTemplateContent, a.C0256a c0256a) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        com.flybird.deploy.callback.b f2;
        FBUpdatePolicy.DeploymentType deploymentType;
        FBFullTplInfo fBFullTplInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5db0c25", new Object[]{this, fBTemplateContent, c0256a});
        } else if (c0256a != null && !c0256a.hasUpdated) {
        } else {
            HashMap hashMap = new HashMap();
            a();
            hashMap.put("bizCode", this.h);
            String str7 = "";
            if (fBTemplateContent != null) {
                if (!StringUtils.isEmpty(fBTemplateContent.getExpId())) {
                    str = fBTemplateContent.getTplId() + "_" + fBTemplateContent.getExpId();
                } else {
                    str = fBTemplateContent.getTplId();
                }
            } else {
                if (c0256a != null && !c0256a.requests.isEmpty()) {
                    IFBTplInfo iFBTplInfo = (IFBTplInfo) c0256a.requests.get(0);
                    if (iFBTplInfo instanceof com.flybird.deploy.model.d) {
                        str = ((com.flybird.deploy.model.d) iFBTplInfo).a();
                    } else if (iFBTplInfo instanceof com.flybird.deploy.model.a) {
                        str = ((com.flybird.deploy.model.a) iFBTplInfo).a();
                    } else if (iFBTplInfo instanceof FBFullTplInfo) {
                        str = ((FBFullTplInfo) iFBTplInfo).getTplId();
                    }
                }
                str = str7;
            }
            hashMap.put("tpl_id", str);
            if (c0256a == null || c0256a.locals.isEmpty() || (fBFullTplInfo = (FBFullTplInfo) c0256a.locals.get(0)) == null) {
                str2 = str7;
                str3 = str2;
            } else {
                str3 = fBFullTplInfo.getTplVersion();
                str2 = fBFullTplInfo.getTime();
            }
            String str8 = "NULL";
            if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
                str4 = TLogTracker.LEVEL_DEBUG;
                str5 = str8;
            } else {
                str5 = str3.replaceAll("\\.", str7) + str2;
                str4 = "U";
            }
            String str9 = UTConstant.Args.UT_SUCCESS_F;
            if (c0256a != null && c0256a.isForceUpdated) {
                str4 = str9;
            }
            hashMap.put("local_version", str5);
            hashMap.put(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE, str4);
            if (fBTemplateContent != null && !StringUtils.isEmpty(fBTemplateContent.getTplVersion())) {
                str8 = fBTemplateContent.getTplVersion().replaceAll("\\.", str7) + fBTemplateContent.getTime();
            }
            hashMap.put("version", str8);
            try {
                str6 = ConnectionUtils.a(AppContextHolder.f7228a);
            } catch (Throwable unused) {
                str6 = "err";
            }
            hashMap.put("netType", str6);
            if (fBTemplateContent != null && c0256a != null && !c0256a.successRequests.isEmpty()) {
                str9 = "T";
            }
            hashMap.put(UTConstant.Args.UT_PROPERTY_SUCCESS, str9);
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, c0256a != null ? String.valueOf(c0256a.costTimeMillis) : str7);
            hashMap.put("flow_type", fBTemplateContent != null ? fBTemplateContent.optFromLocalMap("fb::deploy::log_update_flow_type") : str7);
            hashMap.put("needRender", c0256a != null ? c0256a.customInfo.getPreDefEntry("fb::deploy::log_need_render") : str7);
            hashMap.put("deploy_type", (c0256a == null || (deploymentType = c0256a.deploymentType) == null) ? str7 : deploymentType.inEventLogValue);
            if (c0256a != null) {
                str7 = String.valueOf(c0256a.updateSource);
            }
            hashMap.put("update_source", str7);
            a();
            com.flybird.deploy.model.e eVar = this.i;
            if (eVar != null && (f2 = eVar.f()) != null) {
                try {
                    f2.handleLogMap(new HashMap<>(hashMap), c0256a);
                } catch (Throwable th) {
                    cun.a("error on handle cashier log", th);
                }
            }
            Platform.a("10101042", hashMap);
        }
    }

    public final void a(String str, FBTemplateContent fBTemplateContent, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b739848b", new Object[]{this, str, fBTemplateContent, new Boolean(z), new Long(j)});
            return;
        }
        a();
        HashMap hashMap = new HashMap();
        a();
        hashMap.put("bizCode", this.h);
        hashMap.put("success", z ? "T" : UTConstant.Args.UT_SUCCESS_F);
        if (str == null) {
            str = "";
        }
        if (fBTemplateContent != null) {
            if (StringUtils.isEmpty(str)) {
                str = fBTemplateContent.getTplId();
            }
            String expId = fBTemplateContent.getExpId();
            if (!StringUtils.isEmpty(expId)) {
                str = str + "_" + expId;
            }
            hashMap.put("tpl_hash", fBTemplateContent.getTplHash());
            hashMap.put("tpl_trace", fBTemplateContent.getTplTrace());
        }
        if (fBTemplateContent != null) {
            hashMap.put("tpl_version", fBTemplateContent.getTplVersion());
            hashMap.put("time", fBTemplateContent.getTime());
        }
        hashMap.put("tpl_id", str);
        if (j != Long.MIN_VALUE) {
            hashMap.put("bd_renderTime", String.valueOf(j));
        }
        if (fBTemplateContent != null) {
            String optFromLocalMap = fBTemplateContent.optFromLocalMap("fb::deploy::log_time_cost_deploy_ms");
            if (!StringUtils.isEmpty(optFromLocalMap)) {
                hashMap.put("bd_tplDownloadTime", optFromLocalMap);
            }
        }
        Platform.a("10101041", hashMap);
    }

    public final void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        a();
        long j = this.j;
        makeTemplateUpdateExceptionLog(j, str2, str + "_" + str3 + "_" + str4);
    }

    public static /* synthetic */ void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        cun.b("Decider", "dispatchCoreTak: 2 " + j + ", " + j2);
        nativeCallDeployCoreFuncPtr(j, j2);
    }
}
