package com.alibaba.ability.impl.downloader;

import android.os.SystemClock;
import com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsDownloaderAbility;
import com.taobao.android.abilityidl.ability.DownloaderCompleteResult;
import com.taobao.android.abilityidl.ability.DownloaderProgressResult;
import com.taobao.android.abilityidl.ability.ff;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class DownloaderAbility extends AbsDownloaderAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private volatile DownloadCenter.a f1877a;

    static {
        kge.a(2142942628);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(DownloaderAbility downloaderAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$setCurrentDownloadInfo$p(DownloaderAbility downloaderAbility, DownloadCenter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64b1e49", new Object[]{downloaderAbility, aVar});
        } else {
            downloaderAbility.f1877a = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(833545196);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0167, code lost:
        if (r5 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e6, code lost:
        if (r7 != r0.longValue()) goto L63;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsDownloaderAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void download(tb.als r21, com.taobao.android.abilityidl.ability.fb r22, com.taobao.android.abilityidl.ability.ff r23) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.downloader.DownloaderAbility.download(tb.als, com.taobao.android.abilityidl.ability.fb, com.taobao.android.abilityidl.ability.ff):void");
    }

    /* loaded from: classes2.dex */
    public static final class b implements DownloadCenter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ ff c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        private long f;

        public b(int i, ff ffVar, String str, String str2) {
            this.b = i;
            this.c = ffVar;
            this.d = str;
            this.e = str2;
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i != 100 && uptimeMillis - this.f < this.b) {
                return;
            }
            this.f = uptimeMillis;
            ff ffVar = this.c;
            DownloaderProgressResult downloaderProgressResult = new DownloaderProgressResult();
            downloaderProgressResult.progress = Double.valueOf(i);
            t tVar = t.INSTANCE;
            ffVar.a(downloaderProgressResult);
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void a(DownloadCenter.DownloadError error, String str) {
            ErrorResult errorResult;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8180c69", new Object[]{this, error, str});
                return;
            }
            q.d(error, "error");
            ff ffVar = this.c;
            int i = com.alibaba.ability.impl.downloader.a.$EnumSwitchMapping$0[error.ordinal()];
            if (i == 1) {
                errorResult = new ErrorResult("OUT_OF_SPACE", str == null ? "" : str, (Map) null, 4, (o) null);
            } else if (i == 2) {
                errorResult = new ErrorResult("NETWORK_ERROR", str == null ? "" : str, (Map) null, 4, (o) null);
            } else if (i == 3) {
                errorResult = new ErrorResult("FILE_MD5_ERROR", str == null ? "" : str, (Map) null, 4, (o) null);
            } else if (i == 4) {
                errorResult = new ErrorResult("FILE_SIZE_ERROR", str == null ? "" : str, (Map) null, 4, (o) null);
            } else {
                errorResult = new ErrorResult("500", "errorCode:" + error + ", msg:" + str, (Map) null, 4, (o) null);
            }
            ffVar.a(errorResult);
            DownloaderAbility.access$setCurrentDownloadInfo$p(DownloaderAbility.this, null);
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.c.a();
            DownloaderAbility.access$setCurrentDownloadInfo$p(DownloaderAbility.this, null);
        }

        @Override // com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter.c
        public void a(String filePath) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, filePath});
                return;
            }
            q.d(filePath, "filePath");
            ff ffVar = this.c;
            DownloaderCompleteResult downloaderCompleteResult = new DownloaderCompleteResult();
            downloaderCompleteResult.path = this.d + File.separator + this.e;
            t tVar = t.INSTANCE;
            ffVar.a(downloaderCompleteResult);
            DownloaderAbility.access$setCurrentDownloadInfo$p(DownloaderAbility.this, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsDownloaderAbility
    public void cancel(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca6d833", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DownloadCenter.a aVar = this.f1877a;
        if (aVar == null) {
            return;
        }
        DownloadCenter.INSTANCE.b(aVar);
        this.f1877a = null;
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
    }
}
