package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.uploader.export.d;
import com.uploader.export.g;
import com.uploader.export.i;
import com.uploader.export.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
public class sfi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Image_Tag = "TuCaoBaImage";

    /* renamed from: a  reason: collision with root package name */
    private static Handler f33520a;
    private static g b;

    static {
        kge.a(-1349382748);
    }

    public static /* synthetic */ Handler b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]) : f33520a;
    }

    public static /* synthetic */ g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b29df93c", new Object[0]) : b;
    }

    public static void a(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42e5649", new Object[]{str, str2, dVar});
            return;
        }
        a();
        if (a(str, str2)) {
            str = str2;
        } else {
            TLog.logi(sfj.INSTANCE.b(), "ImageConversionUtils", "Failed to convert image to JPG");
        }
        new Thread(new a(str, "mtopupload", dVar), "TuCaoBaUploadImageForOffline").start();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f33520a = new Handler(Looper.getMainLooper());
        b = l.a();
    }

    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f33521a;
        private final String b;
        private final d c;

        static {
            kge.a(1538425745);
            kge.a(-1390502639);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("afb378fb", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37e3b8da", new Object[]{aVar}) : aVar.f33521a;
        }

        public a(String str, String str2, d dVar) {
            this.f33521a = str;
            this.b = str2;
            this.c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sfi.c().uploadAsync(new i() { // from class: tb.sfi.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.uploader.export.i
                    public String getFileType() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this}) : ".jpg";
                    }

                    @Override // com.uploader.export.i
                    public Map<String, String> getMetaInfo() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                        }
                        return null;
                    }

                    @Override // com.uploader.export.i
                    public String getBizType() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this}) : a.a(a.this);
                    }

                    @Override // com.uploader.export.i
                    public String getFilePath() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this}) : a.b(a.this);
                    }
                }, this.c, sfi.b());
            }
        }
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile == null) {
                return false;
            }
            int b2 = b(str);
            if (b2 != 0) {
                decodeFile = a(decodeFile, b2);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            TLog.logd(sfj.INSTANCE.b(), "ImageConversionUtils", "Failed to convert image to JPG");
            e.printStackTrace();
            return false;
        }
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(android.support.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            return attributeInt != 8 ? 0 : 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            return;
        }
        if (file.delete()) {
            String b2 = sfj.INSTANCE.b();
            TLog.logd(b2, Image_Tag, "deleteImageInApp: success: " + str);
            return;
        }
        String b3 = sfj.INSTANCE.b();
        TLog.logd(b3, Image_Tag, "deleteImageInApp: error: " + str);
    }

    public static String a(Context context, String str) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        String str2 = "";
        String name = (str == null || str.length() <= 0) ? str2 : new File(str).getName();
        File dir = context.getDir("images", 0);
        if (name.length() > 0 && (lastIndexOf = name.lastIndexOf(46)) != -1) {
            str2 = name.substring(0, lastIndexOf);
        }
        return new File(dir, str2 + ".jpg").getAbsolutePath();
    }
}
