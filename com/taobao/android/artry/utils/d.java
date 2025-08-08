package com.taobao.android.artry.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Looper;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.ResourceManager;
import com.taobao.android.artry.resource.e;
import com.taobao.search.common.util.k;
import com.taobao.tao.TaoPackageInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    static {
        kge.a(-256651109);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.size() <= 0;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        int a2 = EnvironmentSwitcher.a();
        if (a2 >= 0 && a2 <= 2) {
            return a2;
        }
        return 0;
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.size() <= 0;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && (str.startsWith(k.HTTP_PREFIX) || str.startsWith(k.HTTPS_PREFIX));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }

    /* loaded from: classes4.dex */
    public class a implements com.taobao.android.artry.common.a<List<e>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Object f9087a = new Object();
        private boolean b;
        private List<e> c;
        private ResultCode d;

        static {
            kge.a(1504617853);
            kge.a(547807985);
        }

        public static /* synthetic */ Object a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5c1363a6", new Object[]{aVar}) : aVar.f9087a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4521811", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ ResultCode c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResultCode) ipChange.ipc$dispatch("67e7f5dd", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ List d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f195a458", new Object[]{aVar}) : aVar.c;
        }

        @Override // com.taobao.android.artry.common.a
        public void a(com.taobao.android.artry.common.c<List<e>> cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d2b5d62", new Object[]{this, cVar});
                return;
            }
            synchronized (this.f9087a) {
                this.b = true;
                this.d = cVar.b;
                if (!d.a(cVar.c)) {
                    this.c = cVar.c;
                }
                this.f9087a.notifyAll();
            }
        }
    }

    public static List<e> a(boolean z, boolean z2, String str, Context context, Map<String, Bitmap> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b28cacf8", new Object[]{new Boolean(z), new Boolean(z2), str, context, map});
        }
        a aVar = new a();
        a(z, z2, str, context, map, aVar);
        synchronized (a.a(aVar)) {
            if (!a.b(aVar)) {
                try {
                    a.a(aVar).wait(30000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        if (a.c(aVar) == ResultCode.SUCCESS && !a(a.d(aVar))) {
            return a.d(aVar);
        }
        return null;
    }

    public static void a(boolean z, boolean z2, String str, Context context, Map<String, Bitmap> map, final com.taobao.android.artry.common.a<List<e>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce77123d", new Object[]{new Boolean(z), new Boolean(z2), str, context, map, aVar});
        } else if (a(map)) {
            com.taobao.android.artry.common.c.a(true, ResultCode.SUCCESS, null, aVar);
        } else {
            if (StringUtils.isEmpty(str)) {
                com.taobao.android.artry.common.c.a(false, ResultCode.FAILED_TO_UPLOAD_PICTURE, aVar);
            }
            try {
                ArrayList arrayList = new ArrayList();
                ResourceManager a2 = ResourceManager.a();
                a2.a(context);
                final File a3 = a2.a(System.currentTimeMillis() + "");
                for (Map.Entry<String, Bitmap> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!StringUtils.isEmpty(key)) {
                        e.a aVar2 = new e.a(str, key);
                        Bitmap value = entry.getValue();
                        if (z) {
                            aVar2.a("base64", a(value));
                        }
                        if (a3 != null && a3.isDirectory() && a3.exists() && value != null && !value.isRecycled()) {
                            if (z2) {
                                value = b(value);
                            }
                            File file = new File(a3, System.currentTimeMillis() + "");
                            file.createNewFile();
                            if (a(Bitmap.CompressFormat.JPEG, value, file)) {
                                aVar2.a(file.getPath());
                            }
                        }
                        arrayList.add(aVar2.a());
                    }
                }
                a2.a(arrayList, new com.taobao.android.artry.common.a<List<e>>() { // from class: com.taobao.android.artry.utils.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.artry.common.a
                    public void a(com.taobao.android.artry.common.c<List<e>> cVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2d2b5d62", new Object[]{this, cVar});
                            return;
                        }
                        try {
                            b.a(a3);
                        } catch (Throwable unused) {
                        }
                        com.taobao.android.artry.common.a aVar3 = aVar;
                        if (aVar3 == null) {
                            return;
                        }
                        aVar3.a(cVar);
                    }
                });
            } catch (Throwable th) {
                Log.e("Utils", "failed to invoke the upload bitmap callback..." + th);
                com.taobao.android.artry.common.c.a(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, aVar);
            }
        }
    }

    public static boolean a(Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7555cbdc", new Object[]{compressFormat, bitmap, file})).booleanValue();
        }
        if (bitmap == null || bitmap.isRecycled() || file == null || !file.exists() || !file.isFile()) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            if (compressFormat == null) {
                try {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Log.e("Utils", "failed to save" + th);
                        a(fileOutputStream);
                        return false;
                    } catch (Throwable th2) {
                        a(fileOutputStream);
                        throw th2;
                    }
                }
            }
            bitmap.compress(compressFormat, 80, fileOutputStream2);
            a(fileOutputStream2);
            return true;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String a(android.graphics.Bitmap r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.artry.utils.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            java.lang.String r5 = "a510269a"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            r0 = 0
            if (r5 == 0) goto L51
            boolean r1 = r5.isRecycled()
            if (r1 == 0) goto L1f
            goto L51
        L1f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L4e
            r4 = 100
            r5.compress(r3, r4, r1)     // Catch: java.lang.Throwable -> L4e
            r1.flush()     // Catch: java.lang.Throwable -> L4e
            r1.close()     // Catch: java.lang.Throwable -> L4e
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r2)     // Catch: java.lang.Throwable -> L4e
        L39:
            r1.flush()     // Catch: java.io.IOException -> L51
            r1.close()     // Catch: java.io.IOException -> L51
            goto L51
        L40:
            r5 = move-exception
            goto L44
        L42:
            r5 = move-exception
            r1 = r0
        L44:
            if (r1 == 0) goto L4c
            r1.flush()     // Catch: java.io.IOException -> L4c
            r1.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r5
        L4d:
            r1 = r0
        L4e:
            if (r1 == 0) goto L51
            goto L39
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.utils.d.a(android.graphics.Bitmap):java.lang.String");
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Throwable th) {
            Log.e("Utils", "failed to covert string[%] to json object..." + th);
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        matrix.postScale(-1.0f, 1.0f, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("93ee4e43", new Object[]{bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        int i = width > height ? height : width;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i) / 2, i, i);
        bitmap.recycle();
        return createBitmap;
    }

    public static org.json.JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("294e5876", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new org.json.JSONObject(jSONObject.toJSONString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c() {
        g c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if ("212200".equals(TaoPackageInfo.sTTID) || (c = com.taobao.appbundle.c.Companion.a().c()) == null) {
            return true;
        }
        return com.android.tools.bundleInfo.b.a().c("TB3DSpace") != null && c.a().contains("TB3DSpace");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.artry.utils.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "1003a7b3"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L15:
            r0 = 0
            if (r3 != 0) goto L19
            return r0
        L19:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L36
            r3.printStackTrace(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L43
            a(r1)
            a(r2)
            return r3
        L31:
            r3 = move-exception
            r0 = r2
            goto L3a
        L34:
            r3 = move-exception
            goto L3a
        L36:
            r2 = r0
            goto L43
        L38:
            r3 = move-exception
            r1 = r0
        L3a:
            a(r1)
            a(r0)
            throw r3
        L41:
            r1 = r0
            r2 = r1
        L43:
            a(r1)
            a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.utils.d.a(java.lang.Throwable):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:9:0x0021, B:11:0x002d, B:16:0x0058, B:18:0x0063, B:13:0x0034, B:15:0x0054), top: B:26:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.String, java.lang.Integer> a(android.app.Activity r11, android.net.Uri r12) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String r1 = ""
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.artry.utils.d.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 0
            if (r3 == 0) goto L1c
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r11
            r11 = 1
            r0[r11] = r12
            java.lang.String r11 = "138413d7"
            java.lang.Object r11 = r2.ipc$dispatch(r11, r0)
            android.util.Pair r11 = (android.util.Pair) r11
            return r11
        L1c:
            if (r11 == 0) goto L8e
            if (r12 != 0) goto L21
            goto L8e
        L21:
            java.lang.String r2 = "file"
            java.lang.String r3 = r12.getScheme()     // Catch: java.lang.Exception -> L68
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L34
            java.lang.String r11 = r12.getPath()     // Catch: java.lang.Exception -> L68
            r12 = r11
        L32:
            r11 = 0
            goto L58
        L34:
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L68
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            r6 = r12
            android.database.Cursor r11 = r5.managedQuery(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L68
            int r12 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "orientation"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Exception -> L68
            r11.moveToFirst()     // Catch: java.lang.Exception -> L68
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Exception -> L68
            if (r0 < 0) goto L32
            int r11 = r11.getInt(r0)     // Catch: java.lang.Exception -> L68
        L58:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L68
            r0.<init>(r12)     // Catch: java.lang.Exception -> L68
            boolean r12 = r0.exists()     // Catch: java.lang.Exception -> L68
            if (r12 == 0) goto L84
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L68
            goto L84
        L68:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "get image error:"
            r12.append(r0)
            java.lang.String r11 = r11.getLocalizedMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r12 = "Utils"
            android.util.Log.e(r12, r11)
            r11 = 0
        L84:
            android.util.Pair r12 = new android.util.Pair
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.<init>(r1, r11)
            return r12
        L8e:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.utils.d.a(android.app.Activity, android.net.Uri):android.util.Pair");
    }
}
