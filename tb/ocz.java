package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes8.dex */
public final class ocz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface b {
        void a(String str);
    }

    static {
        kge.a(1088073585);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file2.exists() && !file2.isDirectory()) {
                file2.mkdir();
            }
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (!nextEntry.getName().contains("../")) {
                        File file3 = new File(file2, nextEntry.getName());
                        File parentFile = nextEntry.isDirectory() ? file3 : file3.getParentFile();
                        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                            throw new FileNotFoundException("Failed to ensure directory: " + parentFile.getAbsolutePath());
                        }
                        if (!nextEntry.isDirectory()) {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            bufferedOutputStream.close();
                        }
                    } else {
                        zipInputStream.close();
                        return false;
                    }
                } else {
                    zipInputStream.close();
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static File a(File file, File file2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        File file3;
        FileOutputStream fileOutputStream2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("73f081b7", new Object[]{file, file2});
        }
        FileOutputStream fileOutputStream3 = null;
        try {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            fileInputStream = new FileInputStream(file);
            try {
                file3 = new File(file2, file.getName());
                fileOutputStream2 = new FileOutputStream(file3);
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    fileOutputStream2.flush();
                    a(fileInputStream, fileOutputStream2);
                    return file3;
                }
            }
        } catch (Exception e3) {
            fileOutputStream = fileOutputStream2;
            e = e3;
            try {
                Log.e("tag", e.getMessage());
                a(fileInputStream, fileOutputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream3 = fileOutputStream;
                a(fileInputStream, fileOutputStream3);
                throw th;
            }
        } catch (Throwable th4) {
            fileOutputStream3 = fileOutputStream2;
            th = th4;
            a(fileInputStream, fileOutputStream3);
            throw th;
        }
    }

    public static void a(File... fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc644de4", new Object[]{fileArr});
        } else if (fileArr == null || fileArr.length <= 0) {
        } else {
            new a().execute(fileArr);
        }
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{strArr});
        } else if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new File(str));
                }
            }
            a((File[]) arrayList.toArray(new File[0]));
        }
    }

    public static boolean a(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70379f3a", new Object[]{context, str, bVar})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(str);
            File a2 = a(file, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
            if (a2 == null || !a2.exists()) {
                a(file);
                return false;
            }
            if (bVar != null) {
                bVar.a(a2.getAbsolutePath());
            }
            return true;
        }
        return b(context, str, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r9, java.lang.String r10, tb.ocz.b r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ocz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r9 = "fd24b659"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1f:
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r5 = r0.getName()
            java.lang.String r6 = "_display_name"
            r1.put(r6, r5)
            java.lang.String r5 = r0.getName()
            java.lang.String r6 = "title"
            r1.put(r6, r5)
            java.lang.String r5 = "mime_type"
            java.lang.String r6 = "video/mp4"
            r1.put(r5, r6)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.lang.String r8 = "date_modified"
            r1.put(r8, r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "date_added"
            r1.put(r6, r5)
            java.lang.String r5 = "relative_path"
            java.lang.String r6 = "DCIM"
            r1.put(r5, r6)
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.content.ContentResolver r9 = r9.getContentResolver()
            android.net.Uri r1 = r9.insert(r5, r1)
            r5 = 0
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La1
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La1
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La1
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La1
            if (r1 == 0) goto L7f
            java.io.OutputStream r5 = r9.openOutputStream(r1)     // Catch: java.io.IOException -> L7d java.lang.Throwable -> Lc9
            goto L7f
        L7d:
            r9 = move-exception
            goto La3
        L7f:
            if (r5 == 0) goto L93
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch: java.io.IOException -> L7d java.lang.Throwable -> Lc9
        L85:
            int r10 = r6.read(r9)     // Catch: java.io.IOException -> L7d java.lang.Throwable -> Lc9
            r1 = -1
            if (r10 == r1) goto L90
            r5.write(r9, r4, r10)     // Catch: java.io.IOException -> L7d java.lang.Throwable -> Lc9
            goto L85
        L90:
            r5.flush()     // Catch: java.io.IOException -> L7d java.lang.Throwable -> Lc9
        L93:
            java.io.Closeable[] r9 = new java.io.Closeable[r2]
            r9[r4] = r5
            r9[r3] = r6
            a(r9)
            r9 = 1
            goto Lb0
        L9e:
            r9 = move-exception
            r6 = r5
            goto Lca
        La1:
            r9 = move-exception
            r6 = r5
        La3:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> Lc9
            java.io.Closeable[] r9 = new java.io.Closeable[r2]
            r9[r4] = r5
            r9[r3] = r6
            a(r9)
            r9 = 0
        Lb0:
            if (r9 == 0) goto Lc8
            java.lang.String r10 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r10 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            if (r11 == 0) goto Lc1
            java.lang.String r10 = r10.getAbsolutePath()
            r11.a(r10)
        Lc1:
            java.io.File[] r10 = new java.io.File[r3]
            r10[r4] = r0
            a(r10)
        Lc8:
            return r9
        Lc9:
            r9 = move-exception
        Lca:
            java.io.Closeable[] r10 = new java.io.Closeable[r2]
            r10[r4] = r5
            r10[r3] = r6
            a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ocz.b(android.content.Context, java.lang.String, tb.ocz$b):boolean");
    }

    public static void a(Closeable... closeableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94717f1e", new Object[]{closeableArr});
        } else if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<File, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(226775007);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(File[] fileArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, fileArr}) : a(fileArr);
        }

        public Void a(File... fileArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("cd147e99", new Object[]{this, fileArr});
            }
            try {
                for (File file : fileArr) {
                    if (file != null && file.exists() && file.delete()) {
                        String str = "delete file: " + file.getAbsolutePath();
                    }
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }
}
