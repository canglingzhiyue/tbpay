package tb;

import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.common.c;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.ResourceManager;
import com.taobao.android.artry.resource.e;
import com.taobao.android.artry.utils.b;
import com.taobao.android.artry.utils.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class etc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-664984167);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.size() <= 0;
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.size() <= 0;
    }

    /* loaded from: classes4.dex */
    public class a implements com.taobao.android.artry.common.a<List<e>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f27556a = new Object();
        private boolean b;
        private List<e> c;
        private ResultCode d;

        static {
            kge.a(269944827);
            kge.a(547807985);
        }

        public static /* synthetic */ Object a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d389e2b", new Object[]{aVar}) : aVar.f27556a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c9f4e2c", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ ResultCode c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResultCode) ipChange.ipc$dispatch("b55743f8", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ List d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e3c4c65d", new Object[]{aVar}) : aVar.c;
        }

        @Override // com.taobao.android.artry.common.a
        public void a(c<List<e>> cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d2b5d62", new Object[]{this, cVar});
                return;
            }
            synchronized (this.f27556a) {
                this.b = true;
                this.d = cVar.b;
                if (!d.a(cVar.c)) {
                    this.c = cVar.c;
                }
                this.f27556a.notifyAll();
            }
        }
    }

    public static List<e> a(String str, Context context, Map<String, Bitmap> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d540fd78", new Object[]{str, context, map});
        }
        a aVar = new a();
        a(str, context, map, aVar);
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

    public static void a(String str, Context context, Map<String, Bitmap> map, final com.taobao.android.artry.common.a<List<e>> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85e22bd", new Object[]{str, context, map, aVar});
        } else if (a(map)) {
            c.a(true, ResultCode.SUCCESS, null, aVar);
        } else {
            if (StringUtils.isEmpty(str)) {
                c.a(false, ResultCode.FAILED_TO_UPLOAD_PICTURE, aVar);
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
                        if (a3 != null && a3.isDirectory() && a3.exists() && value != null && !value.isRecycled()) {
                            File file = new File(a3, System.currentTimeMillis() + "");
                            file.createNewFile();
                            if (a(Bitmap.CompressFormat.JPEG, value, file)) {
                                aVar2.a(file.getPath());
                            }
                        }
                        arrayList.add(aVar2.a());
                    }
                }
                a2.a(arrayList, new com.taobao.android.artry.common.a<List<e>>() { // from class: tb.etc.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.artry.common.a
                    public void a(c<List<e>> cVar) {
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
                com.taobao.android.artry.log.a.a("Utils", th, "failed to invoke the upload bitmap callback...", new Object[0]);
                c.a(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, aVar);
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
                        com.taobao.android.artry.log.a.a("Utils", th, "failed to save bitmap to file[%s]", file.getAbsolutePath());
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

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
