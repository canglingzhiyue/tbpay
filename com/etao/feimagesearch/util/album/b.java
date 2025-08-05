package com.etao.feimagesearch.util.album;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.h;
import com.etao.feimagesearch.util.i;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.col;
import tb.cot;
import tb.coy;
import tb.cuf;
import tb.kge;

/* loaded from: classes4.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_DARK_DETECT = "darkDetect";
    public static final String BIZ_TYPE_SCAN = "scan";
    public static final String BIZ_TYPE_SCAN_FRAME = "scanFrame";
    public static final a Companion;
    public static final String LOCAL_FILE_PATH = "localFilePath";

    /* renamed from: a  reason: collision with root package name */
    private static final cuf f7016a;
    private static final Handler b;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(948070107);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, boolean z, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5818b958", new Object[]{aVar, new Boolean(z), obj});
            } else {
                aVar.a(z, obj);
            }
        }

        private final void a(boolean z, Object obj) {
            boolean z2;
            IpChange ipChange = $ipChange;
            boolean z3 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9984048", new Object[]{this, new Boolean(z), obj});
            } else if (obj == null || !(obj instanceof HashMap)) {
            } else {
                HashMap<String, String> hashMap = (HashMap) obj;
                HashMap<String, String> hashMap2 = hashMap;
                if (!hashMap2.isEmpty()) {
                    Iterator it = hashMap2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!(entry.getKey() instanceof String) || !(entry.getValue() instanceof String)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (!z2) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    hashMap = null;
                }
                if (hashMap == null) {
                    return;
                }
                String str = hashMap.get("bizType");
                if (str != null) {
                    cot.a("AutoDetect", "UtFileUploadManager", "processUploadAlbumResult: bizType:" + str + ", resultMap:" + JSON.toJSONString(hashMap));
                    int hashCode = str.hashCode();
                    if (hashCode == -1848411920) {
                        if (!str.equals(b.BIZ_TYPE_SCAN_FRAME)) {
                            return;
                        }
                        b.Companion.b(z, hashMap);
                        return;
                    } else if (hashCode == 3524221) {
                        if (!str.equals("scan")) {
                            return;
                        }
                        b.Companion.a(z, hashMap);
                        return;
                    } else if (hashCode != 1928204729 || !str.equals(b.BIZ_TYPE_DARK_DETECT)) {
                        return;
                    } else {
                        b.Companion.c(z, hashMap);
                        return;
                    }
                }
                cot.c("UtFileUploadManager", "bizType is empty");
            }
        }

        private final void a(boolean z, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d05e4ec7", new Object[]{this, new Boolean(z), hashMap});
            } else if (!z) {
            } else {
                coy.a("Page_PhotoSearchScan", "UploadScanFailedImage", 19999, hashMap);
            }
        }

        private final void b(boolean z, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("548e9bc8", new Object[]{this, new Boolean(z), hashMap});
                return;
            }
            if (z) {
                coy.a("Page_PhotoSearchScan", "UploadScanSuccessFrame", 2101, hashMap);
            }
            String str = hashMap.get(b.LOCAL_FILE_PATH);
            if (str == null) {
                return;
            }
            try {
                Boolean.valueOf(i.a(new File(str)));
            } catch (Exception unused) {
                t tVar = t.INSTANCE;
            }
        }

        private final void c(boolean z, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8bee8c9", new Object[]{this, new Boolean(z), hashMap});
                return;
            }
            if (z) {
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "abnormalQuery", 19999, hashMap);
                if (hashMap.get("url") != null) {
                    cot.c("UtFileUploadManager", "upload dark detect success. map=" + JSON.toJSONString(hashMap));
                }
            }
            String str = hashMap.get(b.LOCAL_FILE_PATH);
            if (str == null) {
                return;
            }
            try {
                Boolean.valueOf(i.a(new File(str)));
            } catch (Exception unused) {
                t tVar = t.INSTANCE;
            }
        }

        public final void a(String bizType, String url, HashMap<String, String> params, String fileType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63de44c1", new Object[]{this, bizType, url, params, fileType});
                return;
            }
            q.c(bizType, "bizType");
            q.c(url, "url");
            q.c(params, "params");
            q.c(fileType, "fileType");
            if (!(b.a() instanceof h)) {
                return;
            }
            params.put("bizType", bizType);
            ((h) b.a()).a(url, b.b(), fileType, params);
        }
    }

    public static final /* synthetic */ cuf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cuf) ipChange.ipc$dispatch("f03696a", new Object[0]) : f7016a;
    }

    public static final /* synthetic */ Handler b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]) : b;
    }

    static {
        kge.a(175720275);
        Companion = new a(null);
        cuf a2 = col.a(com.etao.feimagesearch.config.b.q());
        q.a((Object) a2, "FileUploaderFactory.crea…l.getVideoOssNamespace())");
        f7016a = a2;
        b = new Handler(Looper.getMainLooper(), C0250b.INSTANCE);
    }

    /* renamed from: com.etao.feimagesearch.util.album.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0250b implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0250b INSTANCE = new C0250b();

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            cot.c("UtFileUploadManager", "uploadResult=" + message.what);
            int i = message.what;
            if (i == 30000) {
                a.a(b.Companion, true, message.obj);
                return true;
            } else if (i != 30001) {
                return false;
            } else {
                a.a(b.Companion, false, message.obj);
                return true;
            }
        }
    }
}
