package com.taobao.android.weexdownloader.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.jxk;
import tb.riy;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f16246a;
    private String b;
    private String c;
    private d d;
    private DownloadStatus e;
    private a f;

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3256a7b8", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ void a(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3564ad8", new Object[]{cVar, new Float(f)});
        } else {
            cVar.a(f);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3ed9b2", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public static /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b370857", new Object[]{cVar}) : cVar.f16246a;
    }

    public static /* synthetic */ String c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a41768f6", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ DownloadStatus d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DownloadStatus) ipChange.ipc$dispatch("6946370e", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c401fec", new Object[]{cVar});
        } else {
            cVar.d();
        }
    }

    public c(String str, String str2, String str3, d dVar) {
        this.f16246a = str;
        this.b = str2;
        this.c = str3;
        this.d = dVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!b()) {
            a("writeFileError");
        } else {
            c();
            this.f = new a();
            new Thread(this.f).start();
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (jxk.a(this.f16246a) || jxk.a(this.b) || jxk.a(this.c)) {
            return false;
        }
        File file = new File(this.f16246a);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        File file2 = new File(this.f16246a + File.separator + this.b);
        return !file2.exists() || file2.delete();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e = DownloadStatus.DOWNLOAD_START;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e = DownloadStatus.DOWNLOAD_FAIL;
        d dVar = this.d;
        if (dVar != null) {
            dVar.a(str);
        }
        this.f = null;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = DownloadStatus.DOWNLOAD_SUCCESS;
        d dVar = this.d;
        if (dVar != null) {
            dVar.a(new File(this.f16246a + File.separator + this.b));
        }
        this.f = null;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        String str = "download on percentage: " + String.format("%.2f", Double.valueOf(f * 100.0d)) + riy.MOD;
        this.e = DownloadStatus.DOWNLOAD_LOADING;
    }

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
            tb.jxj.a(r11);
            tb.jxj.a(r12);
            r6.disconnect();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
            tb.jxj.a(r11);
            tb.jxj.a(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
            if (r6 == null) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
            r6.disconnect();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012f, code lost:
            r5 = r2;
            r15 = r3;
            r12.flush();
            r12.close();
            com.taobao.android.weexdownloader.downloader.c.e(r18.f16247a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
            tb.jxj.a(r11);
            tb.jxj.a(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
            if (r6 == null) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
            r6.disconnect();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 523
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weexdownloader.downloader.c.a.run():void");
        }
    }
}
