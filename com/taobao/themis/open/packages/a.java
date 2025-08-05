package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.extension.c;
import com.taobao.themis.open.packages.downloader.a;
import com.taobao.themis.open.packages.downloader.g;
import com.taobao.themis.open.resource.PackageInfo;
import com.taobao.themis.open.resource.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J6\u0010\u001f\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/taobao/themis/open/packages/PackageManager;", "Lcom/taobao/themis/open/extension/IPackageManagerExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "cdnDownloader", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader;", "defaultDownloader", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "tag", "", "checkFrameworkValid", "", "frameworkPackageDownloadInfo", "Lcom/taobao/themis/open/packages/downloader/PackageDownloadInfo;", "downloadAndPreparedResource", "", "packageDownloadInfo", "type", "Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "commonPackageDownloadCallback", "Lcom/taobao/themis/open/extension/IPackageManagerExtension$CommonPackageDownloadCallback;", "downloadAndPreparedResourceAsync", "downloadPackageAsync", "packageDownloadCallback", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "downloadPackageSync", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$DownloadResult;", "loadSubPackage", "subPackageDownloadInfo", "starLoadAppPackage", "mainPackageDownloadInfo", "pluginPackageDownloadInfo", "", "appPackageDownloadCallback", "Lcom/taobao/themis/open/extension/IPackageManagerExtension$AppPackageDownloadCallback;", "TypeDownloadCallback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a implements com.taobao.themis.open.extension.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f22669a;
    private final com.taobao.themis.open.packages.downloader.a b;
    private final com.taobao.themis.open.packages.downloader.a c;
    private final f d;

    static {
        kge.a(-2126445734);
        kge.a(1576666830);
    }

    public a(f instance) {
        q.d(instance, "instance");
        this.d = instance;
        this.f22669a = "PackageManager";
        this.b = new g();
        this.c = new com.taobao.themis.open.packages.downloader.c();
    }

    public static final /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c282d975", new Object[]{aVar}) : aVar.f22669a;
    }

    public static final /* synthetic */ com.taobao.themis.open.packages.downloader.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.open.packages.downloader.a) ipChange.ipc$dispatch("8eabe8a1", new Object[]{aVar}) : aVar.c;
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        c.C0960c.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            c.C0960c.b(this);
        }
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("52d36a33", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.themis.open.extension.c
    public void a(com.taobao.themis.open.packages.downloader.b bVar, com.taobao.themis.open.packages.downloader.b bVar2, List<com.taobao.themis.open.packages.downloader.b> list, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f1886f", new Object[]{this, bVar, bVar2, list, aVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (bVar != null && !a(bVar)) {
            arrayList.add(new Pair(bVar, PackageInfo.TYPE.FRAMEWORK));
        }
        if (bVar2 != null) {
            arrayList.add(new Pair(bVar2, PackageInfo.TYPE.MAIN));
        }
        if (list != null) {
            for (com.taobao.themis.open.packages.downloader.b bVar3 : list) {
                arrayList.add(new Pair(bVar3, PackageInfo.TYPE.PLUGIN));
            }
        }
        int size = arrayList.size();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        PackageManager$starLoadAppPackage$finishCall$1 packageManager$starLoadAppPackage$finishCall$1 = new PackageManager$starLoadAppPackage$finishCall$1(this, booleanRef, intRef, new PackageManager$starLoadAppPackage$checkCountFunction$1(this, intRef, size, aVar));
        PackageManager$starLoadAppPackage$failedCallback$1 packageManager$starLoadAppPackage$failedCallback$1 = new PackageManager$starLoadAppPackage$failedCallback$1(this, booleanRef, aVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            a((com.taobao.themis.open.packages.downloader.b) pair.getFirst(), (PackageInfo.TYPE) pair.getSecond(), new C0961a(this, (com.taobao.themis.open.packages.downloader.b) pair.getFirst(), (PackageInfo.TYPE) pair.getSecond(), aVar, packageManager$starLoadAppPackage$finishCall$1, packageManager$starLoadAppPackage$failedCallback$1));
        }
    }

    private final boolean a(com.taobao.themis.open.packages.downloader.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd41bb80", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar == null) {
            return true;
        }
        for (e eVar : com.taobao.themis.open.resource.a.a().a(bVar.b())) {
            if (eVar != null && q.a((Object) bVar.c(), (Object) eVar.b().b())) {
                com.taobao.themis.open.extension.e eVar2 = (com.taobao.themis.open.extension.e) this.d.b(com.taobao.themis.open.extension.e.class);
                if (eVar2 != null) {
                    eVar2.b(eVar);
                }
                TMSLogger.d("PackageManager", "check framework valid in mem");
                return true;
            }
        }
        TMSLogger.d("PackageManager", "check framework not valid in mem");
        return false;
    }

    @Override // com.taobao.themis.open.extension.c
    public void a(com.taobao.themis.open.packages.downloader.b subPackageDownloadInfo, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d46f89", new Object[]{this, subPackageDownloadInfo, bVar});
            return;
        }
        q.d(subPackageDownloadInfo, "subPackageDownloadInfo");
        a(subPackageDownloadInfo, PackageInfo.TYPE.SUBPACKAGE, bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/taobao/themis/open/packages/PackageManager$downloadAndPreparedResourceAsync$1", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "onDownloadError", "", "error", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$Error;", "onDownloadFinish", "filePath", "", "onDownloadProgress", "progress", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.themis.open.packages.downloader.b b;
        public final /* synthetic */ PackageInfo.TYPE c;
        public final /* synthetic */ c.b d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.open.packages.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class RunnableC0962a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public RunnableC0962a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e eVar = new e(new PackageInfo(b.this.b.a(), b.this.b.b(), b.this.b.c(), b.this.c, this.b));
                if (!eVar.a()) {
                    c.b bVar = b.this.d;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(2, "parse error");
                    return;
                }
                int i = com.taobao.themis.open.packages.c.$EnumSwitchMapping$0[b.this.c.ordinal()];
                if (i == 1) {
                    com.taobao.themis.open.extension.e eVar2 = (com.taobao.themis.open.extension.e) a.this.a().b(com.taobao.themis.open.extension.e.class);
                    if (eVar2 != null) {
                        eVar2.a(eVar);
                    }
                } else if (i == 2) {
                    com.taobao.themis.open.extension.e eVar3 = (com.taobao.themis.open.extension.e) a.this.a().b(com.taobao.themis.open.extension.e.class);
                    if (eVar3 != null) {
                        eVar3.b(eVar);
                    }
                    com.taobao.themis.open.resource.a.a().a(eVar);
                } else if (i == 3) {
                    com.taobao.themis.open.extension.e eVar4 = (com.taobao.themis.open.extension.e) a.this.a().b(com.taobao.themis.open.extension.e.class);
                    if (eVar4 != null) {
                        eVar4.d(eVar);
                    }
                } else if (i != 4) {
                    TMSLogger.d("PackageManager", i != 5 ? "current not support unknown type" : "current not support other type package");
                } else {
                    com.taobao.themis.open.extension.e eVar5 = (com.taobao.themis.open.extension.e) a.this.a().b(com.taobao.themis.open.extension.e.class);
                    if (eVar5 != null) {
                        eVar5.c(eVar);
                    }
                }
                c.b bVar2 = b.this.d;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(this.b);
            }
        }

        public b(com.taobao.themis.open.packages.downloader.b bVar, PackageInfo.TYPE type, c.b bVar2) {
            this.b = bVar;
            this.c = type;
            this.d = bVar2;
        }

        @Override // com.taobao.themis.open.packages.downloader.a.b
        public void a(String filePath) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, filePath});
                return;
            }
            q.d(filePath, "filePath");
            new Thread(new RunnableC0962a(filePath)).start();
        }

        @Override // com.taobao.themis.open.packages.downloader.a.b
        public void a(a.C0963a error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e0ec00", new Object[]{this, error});
                return;
            }
            q.d(error, "error");
            c.b bVar = this.d;
            if (bVar == null) {
                return;
            }
            bVar.a(error.a(), error.b());
        }

        @Override // com.taobao.themis.open.packages.downloader.a.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            c.b bVar = this.d;
            if (bVar == null) {
                return;
            }
            bVar.a(i);
        }
    }

    private final void a(com.taobao.themis.open.packages.downloader.b bVar, PackageInfo.TYPE type, c.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fad2dc", new Object[]{this, bVar, type, bVar2});
        } else {
            a(bVar, new b(bVar, type, bVar2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/taobao/themis/open/packages/PackageManager$downloadPackageAsync$callback$1", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "onDownloadError", "", "error", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$Error;", "onDownloadFinish", "filePath", "", "onDownloadProgress", "progress", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a.b b;
        public final /* synthetic */ Ref.BooleanRef c;
        public final /* synthetic */ com.taobao.themis.open.packages.downloader.b d;

        public c(a.b bVar, Ref.BooleanRef booleanRef, com.taobao.themis.open.packages.downloader.b bVar2) {
            this.b = bVar;
            this.c = booleanRef;
            this.d = bVar2;
        }

        @Override // com.taobao.themis.open.packages.downloader.a.b
        public void a(String filePath) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, filePath});
                return;
            }
            q.d(filePath, "filePath");
            this.b.a(filePath);
        }

        @Override // com.taobao.themis.open.packages.downloader.a.b
        public void a(a.C0963a error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e0ec00", new Object[]{this, error});
                return;
            }
            q.d(error, "error");
            if (this.c.element) {
                this.b.a(error);
                return;
            }
            this.c.element = true;
            a.b(a.this).a(this.d, this);
        }

        @Override // com.taobao.themis.open.packages.downloader.a.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b.a(i);
            }
        }
    }

    private final void a(com.taobao.themis.open.packages.downloader.b bVar, a.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fcb773", new Object[]{this, bVar, bVar2});
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        this.b.a(bVar, new c(bVar2, booleanRef, bVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\rH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/taobao/themis/open/packages/PackageManager$TypeDownloadCallback;", "Lcom/taobao/themis/open/extension/IPackageManagerExtension$CommonPackageDownloadCallback;", "packageDownloadInfo", "Lcom/taobao/themis/open/packages/downloader/PackageDownloadInfo;", "type", "Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "appPackageDownloadCallback", "Lcom/taobao/themis/open/extension/IPackageManagerExtension$AppPackageDownloadCallback;", "finishCall", "Lkotlin/Function0;", "", "failedCall", "Lkotlin/Function2;", "", "", "(Lcom/taobao/themis/open/packages/PackageManager;Lcom/taobao/themis/open/packages/downloader/PackageDownloadInfo;Lcom/taobao/themis/open/resource/PackageInfo$TYPE;Lcom/taobao/themis/open/extension/IPackageManagerExtension$AppPackageDownloadCallback;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getAppPackageDownloadCallback", "()Lcom/taobao/themis/open/extension/IPackageManagerExtension$AppPackageDownloadCallback;", "getFailedCall", "()Lkotlin/jvm/functions/Function2;", "getFinishCall", "()Lkotlin/jvm/functions/Function0;", "getPackageDownloadInfo", "()Lcom/taobao/themis/open/packages/downloader/PackageDownloadInfo;", NetworkAbility.API_GET_TYPE, "()Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "onDownloadError", "errorCode", "errorMsg", "onDownloadFinish", "path", "onDownloadProgress", "progress", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.packages.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public final class C0961a implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22670a;
        private final com.taobao.themis.open.packages.downloader.b b;
        private final PackageInfo.TYPE c;
        private final c.a d;
        private final ruk<t> e;
        private final ruw<Integer, String, t> f;

        static {
            kge.a(-904423567);
            kge.a(-557948046);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0961a(a aVar, com.taobao.themis.open.packages.downloader.b packageDownloadInfo, PackageInfo.TYPE type, c.a aVar2, ruk<t> rukVar, ruw<? super Integer, ? super String, t> ruwVar) {
            q.d(packageDownloadInfo, "packageDownloadInfo");
            q.d(type, "type");
            this.f22670a = aVar;
            this.b = packageDownloadInfo;
            this.c = type;
            this.d = aVar2;
            this.e = rukVar;
            this.f = ruwVar;
        }

        @Override // com.taobao.themis.open.extension.c.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = com.taobao.themis.open.packages.b.$EnumSwitchMapping$0[this.c.ordinal()];
            if (i2 == 1) {
                if (this.d == null) {
                }
            } else if (i2 != 2 || this.d == null) {
            } else {
                this.b.b();
            }
        }

        @Override // com.taobao.themis.open.extension.c.b
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            ruw<Integer, String, t> ruwVar = this.f;
            if (ruwVar != null) {
                ruwVar.mo2423invoke(Integer.valueOf(i), str);
            }
            String a2 = a.a(this.f22670a);
            TMSLogger.d(a2, "package : " + this.b.b() + " download error : " + i + ", " + str);
        }

        @Override // com.taobao.themis.open.extension.c.b
        public void a(String str) {
            c.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            int i = com.taobao.themis.open.packages.b.$EnumSwitchMapping$1[this.c.ordinal()];
            if (i == 1) {
                c.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.b();
                }
            } else if (i == 2) {
                c.a aVar3 = this.d;
                if (aVar3 != null) {
                    aVar3.a(this.b.b());
                }
            } else if (i == 3 && (aVar = this.d) != null) {
                aVar.c();
            }
            ruk<t> rukVar = this.e;
            if (rukVar != null) {
                rukVar.mo2427invoke();
            }
            String a2 = a.a(this.f22670a);
            TMSLogger.d(a2, "package : " + this.b.b() + " download finish");
        }
    }
}
