package com.alibaba.ability.impl.downloader.downloadcenter;

import android.text.TextUtils;
import com.alibaba.ability.impl.file.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Result;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;

/* loaded from: classes2.dex */
public final class DownloadCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DownloadCenter INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.d f1879a;

    /* loaded from: classes2.dex */
    public enum DownloadError {
        OUT_OF_SPACE,
        NETWORK_ERROR,
        FILE_MD5_ERROR,
        FILE_SIZE_ERROR,
        FAILED,
        UNKNOWN_ERROR
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void a(int i);

        void a(DownloadError downloadError, String str);

        void a(String str);
    }

    private final ConcurrentHashMap<String, b> a() {
        IpChange ipChange = $ipChange;
        return (ConcurrentHashMap) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("f779de7e", new Object[]{this}) : f1879a.getValue());
    }

    static {
        kge.a(-734120034);
        INSTANCE = new DownloadCenter();
        f1879a = e.a(DownloadCenter$tasks$2.INSTANCE);
    }

    private DownloadCenter() {
    }

    public static final /* synthetic */ ConcurrentHashMap a(DownloadCenter downloadCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("5b3073cb", new Object[]{downloadCenter}) : downloadCenter.a();
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ConcurrentSkipListSet<a> f1881a = new ConcurrentSkipListSet<>(a.INSTANCE);
        private final int b;

        static {
            kge.a(1678296467);
        }

        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator<a> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // java.util.Comparator
            public /* synthetic */ int compare(a aVar, a aVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
            }

            public final int a(a aVar, a aVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("7c201e1b", new Object[]{this, aVar, aVar2})).intValue();
                }
                if (!q.a(aVar, aVar2)) {
                    return q.a(aVar.hashCode(), aVar2.hashCode());
                }
                return 0;
            }
        }

        public b(int i) {
            this.b = i;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }

        public final ConcurrentSkipListSet<a> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConcurrentSkipListSet) ipChange.ipc$dispatch("56da49e7", new Object[]{this}) : this.f1881a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f1880a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private String f;
        private Long g;
        private c h;

        static {
            kge.a(1677980860);
        }

        public a(String url, String urlMd5, String businessId, String fileName, String fileDirPath, String str, Long l, c cVar) {
            q.d(url, "url");
            q.d(urlMd5, "urlMd5");
            q.d(businessId, "businessId");
            q.d(fileName, "fileName");
            q.d(fileDirPath, "fileDirPath");
            this.f1880a = url;
            this.b = urlMd5;
            this.c = businessId;
            this.d = fileName;
            this.e = fileDirPath;
            this.f = str;
            this.g = l;
            this.h = cVar;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1880a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
        }

        public final Long g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("378135e7", new Object[]{this}) : this.g;
        }

        public final c h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("79873d63", new Object[]{this}) : this.h;
        }
    }

    public final void a(a downloadInfo) {
        ConcurrentSkipListSet<a> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a269851e", new Object[]{this, downloadInfo});
            return;
        }
        q.d(downloadInfo, "downloadInfo");
        b bVar = a().get(downloadInfo.b());
        if (bVar != null && (a2 = bVar.a()) != null) {
            a2.add(downloadInfo);
            return;
        }
        DownloadCenter downloadCenter = this;
        String b2 = downloadInfo.b();
        b bVar2 = new b(downloadCenter.c(downloadInfo));
        bVar2.a().add(downloadInfo);
        t tVar = t.INSTANCE;
        downloadCenter.a().put(b2, bVar2);
    }

    public final void b(a downloadInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcda7e3d", new Object[]{this, downloadInfo});
            return;
        }
        q.d(downloadInfo, "downloadInfo");
        b bVar = a().get(downloadInfo.b());
        if (bVar == null) {
            return;
        }
        if (bVar.a().size() > 1) {
            bVar.a().remove(downloadInfo);
            c h = downloadInfo.h();
            if (h == null) {
                return;
            }
            h.a();
            return;
        }
        com.taobao.downloader.b.a().a(bVar.b());
    }

    private final int c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d74b774f", new Object[]{this, aVar})).intValue();
        }
        kmm kmmVar = new kmm();
        kmq kmqVar = kmmVar.b;
        kmqVar.f30169a = aVar.c();
        kmqVar.j = false;
        kmqVar.h = aVar.e();
        List<kmo> list = kmmVar.f30166a;
        kmo kmoVar = new kmo();
        kmoVar.f30167a = aVar.a();
        kmoVar.d = aVar.d();
        t tVar = t.INSTANCE;
        list.add(kmoVar);
        return com.taobao.downloader.b.a().a(kmmVar, new d(aVar));
    }

    /* loaded from: classes2.dex */
    public static final class d implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f1882a;

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            }
        }

        public d(a aVar) {
            this.f1882a = aVar;
        }

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            b bVar = (b) DownloadCenter.a(DownloadCenter.INSTANCE).get(this.f1882a.b());
            if (bVar == null) {
                return;
            }
            Iterator<a> it = bVar.a().iterator();
            while (it.hasNext()) {
                c h = it.next().h();
                if (h != null) {
                    h.a(i);
                }
            }
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            b bVar = (b) DownloadCenter.a(DownloadCenter.INSTANCE).remove(this.f1882a.b());
            if (bVar == null) {
                return;
            }
            Iterator<a> it = bVar.a().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (i == -21) {
                    c h = next.h();
                    if (h != null) {
                        h.a(DownloadError.OUT_OF_SPACE, str2);
                    }
                } else if (i == -16) {
                    c h2 = next.h();
                    if (h2 != null) {
                        h2.a();
                    }
                } else if (i == -12) {
                    c h3 = next.h();
                    if (h3 != null) {
                        h3.a(DownloadError.NETWORK_ERROR, str2);
                    }
                } else {
                    c h4 = next.h();
                    if (h4 != null) {
                        h4.a(DownloadError.UNKNOWN_ERROR, str2);
                    }
                }
            }
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            Object m2371constructorimpl;
            long length;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                b bVar = (b) DownloadCenter.a(DownloadCenter.INSTANCE).remove(this.f1882a.b());
                t tVar = null;
                if (bVar != null && str2 != null) {
                    if ((str2.length() > 0 ? str2 : null) != null) {
                        File file = new File(str2);
                        String str3 = null;
                        Long l = null;
                        if (file.exists() && file.isFile()) {
                            Iterator<a> it = bVar.a().iterator();
                            while (it.hasNext()) {
                                a next = it.next();
                                if (next.f() != null) {
                                    String f = next.f();
                                    if (str3 == null) {
                                        str3 = com.alibaba.ability.impl.file.d.e(file);
                                        t tVar2 = t.INSTANCE;
                                    }
                                    if (!q.a((Object) f, (Object) str3)) {
                                        c h = next.h();
                                        if (h != null) {
                                            h.a(DownloadError.FILE_MD5_ERROR, "file md5 is " + str3 + " not " + next.f());
                                        }
                                    }
                                }
                                if (next.g() != null) {
                                    Long g = next.g();
                                    if (l != null) {
                                        length = l.longValue();
                                    } else {
                                        length = file.length();
                                        l = Long.valueOf(length);
                                        t tVar3 = t.INSTANCE;
                                    }
                                    if (g != null && g.longValue() == length) {
                                    }
                                    c h2 = next.h();
                                    if (h2 != null) {
                                        h2.a(DownloadError.FILE_SIZE_ERROR, "file size is " + l + " not " + next.g());
                                    }
                                }
                                String str4 = next.e() + File.separator + next.d();
                                if (TextUtils.equals(str2, str4)) {
                                    z = true;
                                } else if (!f.INSTANCE.b(str2, str4)) {
                                    c h3 = next.h();
                                    if (h3 != null) {
                                        h3.a(DownloadError.UNKNOWN_ERROR, "copy file fail");
                                    }
                                }
                                c h4 = next.h();
                                if (h4 != null) {
                                    h4.a(str4);
                                }
                            }
                            if (!z) {
                                file.delete();
                            }
                        } else {
                            Iterator<a> it2 = bVar.a().iterator();
                            while (it2.hasNext()) {
                                c h5 = it2.next().h();
                                if (h5 != null) {
                                    h5.a(DownloadError.FAILED, "download file not valid");
                                }
                            }
                        }
                        tVar = t.INSTANCE;
                    }
                }
                m2371constructorimpl = Result.m2371constructorimpl(tVar);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        }
    }
}
