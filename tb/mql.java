package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.ProcedureImpl;
import com.taobao.monitor.procedure.u;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public class mql implements ProcedureImpl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SAVE_DIR = "apm";

    @Override // com.taobao.monitor.procedure.ProcedureImpl.a
    public void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f101f86", new Object[]{this, uVar});
            return;
        }
        try {
            b(uVar);
        } catch (Exception e) {
            mpi.c("ProcedureStorage", e);
        }
    }

    private void b(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b7f307", new Object[]{this, uVar});
        } else if (uVar.a() == null) {
        } else {
            if (!ept.PAGELOAD.equals(uVar.b()) && !"startup".equals(uVar.b())) {
                return;
            }
            File a2 = a();
            a(a2);
            a(a2, uVar.b() + "_" + c(uVar) + "_" + uVar.d() + ".json", mpn.b(uVar));
        }
    }

    public static File a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a060c1a5", new Object[0]);
        }
        return new File(ProcedureGlobal.a().b().getCacheDir() + File.separator + "apm" + File.separator);
    }

    private void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
        } else if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length >= 10) {
            a(listFiles, 0, listFiles.length - 1);
            for (int i = 0; i < (listFiles.length - 10) + 1; i++) {
                listFiles[i].delete();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.io.File r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.mql.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            r1[r5] = r7
            java.lang.String r5 = "f7089173"
            r0.ipc$dispatch(r5, r1)
            return
        L1b:
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r6)
            r4.b(r0)
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50 java.io.FileNotFoundException -> L62
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50 java.io.FileNotFoundException -> L62
            java.nio.channels.FileChannel r5 = r6.getChannel()     // Catch: java.io.IOException -> L47 java.io.FileNotFoundException -> L49 java.lang.Throwable -> L74
            java.lang.String r0 = "utf8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.io.IOException -> L47 java.io.FileNotFoundException -> L49 java.lang.Throwable -> L74
            java.nio.ByteBuffer r7 = r0.encode(r7)     // Catch: java.io.IOException -> L47 java.io.FileNotFoundException -> L49 java.lang.Throwable -> L74
        L38:
            int r0 = r5.write(r7)     // Catch: java.io.IOException -> L47 java.io.FileNotFoundException -> L49 java.lang.Throwable -> L74
            if (r0 != 0) goto L38
            r6.close()     // Catch: java.io.IOException -> L42
            return
        L42:
            r5 = move-exception
            r5.printStackTrace()
            return
        L47:
            r5 = move-exception
            goto L54
        L49:
            r5 = move-exception
            goto L66
        L4b:
            r6 = move-exception
            r3 = r6
            r6 = r5
            r5 = r3
            goto L75
        L50:
            r6 = move-exception
            r3 = r6
            r6 = r5
            r5 = r3
        L54:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L73
            r6.close()     // Catch: java.io.IOException -> L5d
            return
        L5d:
            r5 = move-exception
            r5.printStackTrace()
            return
        L62:
            r6 = move-exception
            r3 = r6
            r6 = r5
            r5 = r3
        L66:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L73
            r6.close()     // Catch: java.io.IOException -> L6f
            return
        L6f:
            r5 = move-exception
            r5.printStackTrace()
        L73:
            return
        L74:
            r5 = move-exception
        L75:
            if (r6 == 0) goto L7f
            r6.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r6 = move-exception
            r6.printStackTrace()
        L7f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mql.a(java.io.File, java.lang.String, java.lang.String):void");
    }

    private void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{this, file});
        } else if (file.exists()) {
        } else {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(File[] fileArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4496c544", new Object[]{fileArr, new Integer(i), new Integer(i2)});
        } else if (i >= i2) {
        } else {
            File file = fileArr[i];
            int i3 = i;
            int i4 = i2;
            while (i3 < i4) {
                while (fileArr[i4].lastModified() >= file.lastModified() && i3 < i4) {
                    i4--;
                }
                while (fileArr[i3].lastModified() <= file.lastModified() && i3 < i4) {
                    i3++;
                }
                File file2 = fileArr[i4];
                fileArr[i4] = fileArr[i3];
                fileArr[i3] = file2;
            }
            fileArr[i] = fileArr[i3];
            fileArr[i3] = file;
            a(fileArr, i, i4 - 1);
            a(fileArr, i4 + 1, i2);
        }
    }

    private String c(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af1f0f18", new Object[]{this, uVar});
        }
        Object obj = uVar.l().get("pageName");
        return obj == null ? "null" : (String) obj;
    }
}
