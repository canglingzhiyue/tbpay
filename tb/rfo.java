package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import tb.kml;

/* loaded from: classes9.dex */
public class rfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f33120a;
    private final String b;
    private final String c;
    private final String d;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public File f33122a;
        public boolean b;
        public String c;

        static {
            kge.a(1048961531);
        }
    }

    static {
        kge.a(1275040522);
    }

    public static /* synthetic */ String a(rfo rfoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6459e03", new Object[]{rfoVar}) : rfoVar.b;
    }

    public static /* synthetic */ String a(rfo rfoVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f51f8eb9", new Object[]{rfoVar, str}) : rfoVar.b(str);
    }

    public static /* synthetic */ String b(rfo rfoVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eea3098", new Object[]{rfoVar, str}) : rfoVar.c(str);
    }

    public static /* synthetic */ String c(rfo rfoVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68b4d277", new Object[]{rfoVar, str}) : rfoVar.a(str);
    }

    public rfo(String str, String str2, String str3, String str4) {
        this.f33120a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7497d4a6", new Object[]{this});
        }
        if (!new File(a(this.b)).exists()) {
            return null;
        }
        File file = new File(c(this.b));
        if (!file.exists()) {
            return null;
        }
        a aVar = new a();
        aVar.f33122a = file;
        aVar.b = true;
        return aVar;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("56759e45", new Object[]{this});
        }
        if (new File(a(this.b)).exists()) {
            File file = new File(c(this.b));
            if (file.exists()) {
                a aVar = new a();
                aVar.f33122a = file;
                aVar.b = true;
                return aVar;
            }
        }
        kmm kmmVar = new kmm();
        kmo kmoVar = new kmo();
        kmoVar.f30167a = this.f33120a;
        String str = this.b;
        kmoVar.c = str;
        kmoVar.d = str;
        kmmVar.f30166a.add(kmoVar);
        kmmVar.b.f30169a = rfx.CPPINLINEPATCH;
        kmmVar.b.h = this.c;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final a aVar2 = new a();
        b.a().a(kmmVar, new kml() { // from class: tb.rfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kml
            public void onDownloadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.kml
            public void onDownloadStateChange(String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str2, new Boolean(z)});
                }
            }

            @Override // tb.kml
            public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar3});
                }
            }

            @Override // tb.kml
            public void onDownloadError(String str2, int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i), str3});
                    return;
                }
                a aVar3 = aVar2;
                aVar3.b = false;
                aVar3.c = "download_error";
                countDownLatch.countDown();
            }

            @Override // tb.kml
            public void onDownloadFinish(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                } else if (!rgp.isMd5Same(rfo.a(rfo.this), str3)) {
                    aVar2.b = false;
                } else {
                    try {
                        rfo.unzip(new File(str3), new File(rfo.a(rfo.this, rfo.a(rfo.this))));
                        File file2 = new File(rfo.b(rfo.this, rfo.a(rfo.this)));
                        if (!file2.exists()) {
                            aVar2.b = false;
                            return;
                        }
                        new File(rfo.c(rfo.this, rfo.a(rfo.this))).createNewFile();
                        aVar2.b = true;
                        aVar2.f33122a = file2;
                    } catch (Throwable unused) {
                        a aVar3 = aVar2;
                        aVar3.b = false;
                        aVar3.c = "unzip_error";
                    }
                }
            }

            @Override // tb.kml
            public void onFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                } else {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            aVar2.b = false;
        }
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        throw new java.io.FileNotFoundException("Failed to ensure directory: " + r4.getAbsolutePath());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void unzip(java.io.File r6, java.io.File r7) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rfo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            java.lang.String r6 = "780b09d"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r6)
            r1.<init>(r3)
            r0.<init>(r1)
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L9a
        L28:
            java.util.zip.ZipEntry r1 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L96
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = ".."
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L28
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r1.getName()     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L9a
            boolean r4 = r1.isDirectory()     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L4b
            r4 = r3
            goto L4f
        L4b:
            java.io.File r4 = r3.getParentFile()     // Catch: java.lang.Throwable -> L9a
        L4f:
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto L77
            boolean r5 = r4.mkdirs()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L5c
            goto L77
        L5c:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r7.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = "Failed to ensure directory: "
            r7.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L9a
            r7.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L9a
            throw r6     // Catch: java.lang.Throwable -> L9a
        L77:
            boolean r1 = r1.isDirectory()     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto L28
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L9a
        L82:
            int r3 = r0.read(r6)     // Catch: java.lang.Throwable -> L91
            r4 = -1
            if (r3 == r4) goto L8d
            r1.write(r6, r2, r3)     // Catch: java.lang.Throwable -> L91
            goto L82
        L8d:
            r1.close()     // Catch: java.lang.Throwable -> L9a
            goto L28
        L91:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L9a
            throw r6     // Catch: java.lang.Throwable -> L9a
        L96:
            r0.close()
            return
        L9a:
            r6 = move-exception
            r0.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rfo.unzip(java.io.File, java.io.File):void");
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return this.c + "/" + str + ".lock";
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return this.c + "/" + str + "_unzipped";
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        return b(str) + "/jni/" + this.d;
    }
}
