package com.etao.feimagesearch.util;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(181705180);
    }

    public static boolean a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            if (!StringUtils.isEmpty(str) && !str.startsWith("content:") && (split = str.split("/")) != null && split.length != 0) {
                boolean z = false;
                boolean z2 = false;
                for (String str2 : split) {
                    if ("com.taobao.taobao".equalsIgnoreCase(str2)) {
                        z = true;
                    } else if ("cache".equalsIgnoreCase(str2)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        break;
                    }
                }
                if (z && z2) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            if (a(str)) {
                return a(new File(str));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return file.delete();
        }
        for (File file2 : listFiles) {
            z &= a(file2);
        }
        return file.delete() & z;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
            return new File(str).exists();
        } catch (Exception e) {
            cot.a(com.taobao.android.litecreator.util.k.TAG, "check exist" + str, e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r13, java.io.File r14) {
        /*
            java.lang.String r0 = "copy close"
            java.lang.String r1 = "FileUtil"
            com.android.alibaba.ip.runtime.IpChange r2 = com.etao.feimagesearch.util.i.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L20
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r13
            r0[r4] = r14
            java.lang.String r13 = "a9c1162d"
            java.lang.Object r13 = r2.ipc$dispatch(r13, r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L20:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.nio.channels.FileChannel r13 = r3.getChannel()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L63
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L63
            java.nio.channels.FileChannel r14 = r3.getChannel()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L63
            r8 = 0
            long r10 = r13.size()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            r6 = r14
            r7 = r13
            r6.transferFrom(r7, r8, r10)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L58
            if (r13 == 0) goto L48
            r13.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r13 = move-exception
            tb.cot.a(r1, r0, r13)
        L48:
            if (r14 == 0) goto L52
            r14.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r13 = move-exception
            tb.cot.a(r1, r0, r13)
        L52:
            return r4
        L53:
            r2 = move-exception
            r12 = r2
            r2 = r13
            r13 = r12
            goto L89
        L58:
            r2 = move-exception
            r12 = r2
            r2 = r13
            r13 = r12
            goto L6e
        L5d:
            r14 = move-exception
            r12 = r2
            r2 = r13
            r13 = r14
            r14 = r12
            goto L89
        L63:
            r14 = move-exception
            r12 = r2
            r2 = r13
            r13 = r14
            r14 = r12
            goto L6e
        L69:
            r13 = move-exception
            r14 = r2
            goto L89
        L6c:
            r13 = move-exception
            r14 = r2
        L6e:
            java.lang.String r3 = "copy"
            tb.cot.a(r1, r3, r13)     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r13 = move-exception
            tb.cot.a(r1, r0, r13)
        L7d:
            if (r14 == 0) goto L87
            r14.close()     // Catch: java.io.IOException -> L83
            goto L87
        L83:
            r13 = move-exception
            tb.cot.a(r1, r0, r13)
        L87:
            return r5
        L88:
            r13 = move-exception
        L89:
            if (r2 == 0) goto L93
            r2.close()     // Catch: java.io.IOException -> L8f
            goto L93
        L8f:
            r2 = move-exception
            tb.cot.a(r1, r0, r2)
        L93:
            if (r14 == 0) goto L9d
            r14.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r14 = move-exception
            tb.cot.a(r1, r0, r14)
        L9d:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.i.a(java.lang.String, java.io.File):boolean");
    }

    public static String a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5130299", new Object[]{context, uri});
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return c(context, uri);
        }
        return b(context, uri);
    }

    private static String b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83740678", new Object[]{context, uri});
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        if (!"content".equals(scheme)) {
            return null;
        }
        return a(context, uri, null, null);
    }

    private static String c(Context context, Uri uri) {
        Uri uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d50a57", new Object[]{context, uri});
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (a(uri)) {
                String[] split = documentId.split(":");
                String str = split[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (!"audio".equals(str)) {
                    return null;
                } else {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return a(context, uri2, "_id=?", new String[]{split[1]});
            } else if (b(uri)) {
                return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            } else {
                if (!c(uri)) {
                    return null;
                }
                String[] split2 = documentId.split(":");
                if (split2.length < 2 || !"primary".equalsIgnoreCase(split2[0])) {
                    return null;
                }
                return Environment.getExternalStorageDirectory() + "/" + split2[1];
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return a(context, uri, null, null);
        } else {
            if (!"file".equals(uri.getScheme())) {
                return null;
            }
            return uri.getPath();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r9 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r9 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.util.i.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r9 = 1
            r1[r9] = r10
            r9 = 2
            r1[r9] = r11
            r9 = 3
            r1[r9] = r12
            java.lang.String r9 = "86eea7d2"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1e:
            java.lang.String r0 = "_data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            r8 = 0
            r4 = r10
            r5 = r0
            r6 = r11
            r7 = r12
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L56
            if (r9 == 0) goto L48
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L57
            if (r10 == 0) goto L48
            r10 = r0[r2]     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L57
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L57
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L57
            r1 = r10
            goto L48
        L46:
            r10 = move-exception
            goto L50
        L48:
            if (r9 == 0) goto L5a
        L4a:
            r9.close()
            goto L5a
        L4e:
            r10 = move-exception
            r9 = r1
        L50:
            if (r9 == 0) goto L55
            r9.close()
        L55:
            throw r10
        L56:
            r9 = r1
        L57:
            if (r9 == 0) goto L5a
            goto L4a
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.i.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    private static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue() : "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue() : "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
}
