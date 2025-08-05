package com.taobao.tao.flexbox.layoutmanager.save;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IMAGE_SAVE_REQUEST_CODE = 1502;

    /* renamed from: a  reason: collision with root package name */
    private Context f20484a;
    private b b;
    private c c;
    private Bitmap d = null;
    private String e;
    private String f;
    private String g;
    private Bitmap h;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.save.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0854a {
        void a(String str, Bitmap bitmap);
    }

    static {
        kge.a(-1665567552);
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("40b86cf9", new Object[]{aVar}) : aVar.f20484a;
    }

    public static /* synthetic */ void a(a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4627cc4d", new Object[]{aVar, bitmap});
        } else {
            aVar.a(bitmap);
        }
    }

    public static /* synthetic */ void a(a aVar, Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f562ccc3", new Object[]{aVar, num, uri, new Boolean(z)});
        } else {
            aVar.a(num, uri, z);
        }
    }

    public static /* synthetic */ Bitmap b(a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("86b17bec", new Object[]{aVar, bitmap});
        }
        aVar.h = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void c(a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8421cf", new Object[]{aVar, bitmap});
        } else {
            aVar.b(bitmap);
        }
    }

    public a(Context context, String str) {
        this.f20484a = context;
        this.e = str;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.f = str;
        this.g = str2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f20484a == null) {
        } else {
            if (TextUtils.isEmpty(this.e)) {
                Toast.makeText(this.f20484a.getApplicationContext(), R.string.uik_save_image_fail_get, 0).show();
            } else {
                a(this.e, new InterfaceC0854a() { // from class: com.taobao.tao.flexbox.layoutmanager.save.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.save.a.InterfaceC0854a
                    public void a(String str, Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c58b8a3c", new Object[]{this, str, bitmap});
                        } else if (bitmap == null) {
                            Toast.makeText(a.a(a.this).getApplicationContext(), R.string.uik_save_image_fail_get, 0).show();
                        } else {
                            a.a(a.this, bitmap);
                        }
                    }
                });
            }
        }
    }

    private void a(final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else if (!TextUtils.isEmpty(this.g)) {
            a(this.g, new InterfaceC0854a() { // from class: com.taobao.tao.flexbox.layoutmanager.save.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.save.a.InterfaceC0854a
                public void a(String str, Bitmap bitmap2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c58b8a3c", new Object[]{this, str, bitmap2});
                        return;
                    }
                    a.b(a.this, bitmap2);
                    a.c(a.this, bitmap);
                }
            });
        } else {
            b(bitmap);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 29;
    }

    private void b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d9e65", new Object[]{this, bitmap});
            return;
        }
        this.d = c(bitmap);
        if (this.d == null) {
            Toast.makeText(this.f20484a.getApplicationContext(), a(R.string.uik_save_image_fail_get), 0).show();
        } else if (b()) {
            if (this.c != null && AsyncTask.Status.RUNNING == this.c.getStatus()) {
                return;
            }
            this.c = new c();
            this.c.execute(this.d);
        } else if (c()) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                Toast.makeText(this.f20484a.getApplicationContext(), a(R.string.uik_save_image_fail), 0).show();
                return;
            }
            a(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/" + this.d.toString().hashCode() + ".png")), this.d);
        } else {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TITLE", this.d.toString().hashCode() + ".png");
            Context context = this.f20484a;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context != null && (context instanceof Activity)) {
                FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
                LocalTBackFragment localTBackFragment = (LocalTBackFragment) fragmentManager.findFragmentByTag("LocalTBackFragment");
                if (localTBackFragment == null) {
                    localTBackFragment = new LocalTBackFragment();
                    fragmentManager.beginTransaction().add(localTBackFragment, "LocalTBackFragment").commit();
                    fragmentManager.executePendingTransactions();
                }
                localTBackFragment.a(this);
                localTBackFragment.startActivityForResult(intent, 1502);
                return;
            }
            Toast.makeText(this.f20484a.getApplicationContext(), a(R.string.uik_save_image_fail), 0).show();
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT < 19 || this.f20484a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private Bitmap c(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("ae09cce2", new Object[]{this, bitmap}) : (this.h == null && this.f == null) ? bitmap : d(bitmap);
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 1502 || i2 != -1) {
        } else {
            a(intent.getData(), this.d);
        }
    }

    public void a(Uri uri, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e9d2f", new Object[]{this, uri, bitmap});
        } else if (this.b != null && AsyncTask.Status.RUNNING == this.b.getStatus()) {
        } else {
            this.b = new b();
            this.b.execute(uri, bitmap);
        }
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        this.f20484a.sendBroadcast(intent);
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : this.f20484a.getResources().getString(i);
    }

    /* loaded from: classes8.dex */
    public class b extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Uri b;

        static {
            kge.a(-500933822);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Integer] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Integer doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, num});
            } else {
                a(num);
            }
        }

        private b() {
        }

        public Integer a(Object... objArr) {
            ParcelFileDescriptor parcelFileDescriptor;
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("41f654b0", new Object[]{this, objArr});
            }
            this.b = (Uri) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            if (bitmap != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    parcelFileDescriptor = a.a(a.this).getContentResolver().openFileDescriptor(this.b, "w");
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                            try {
                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                                try {
                                    fileOutputStream2.flush();
                                    fileOutputStream2.close();
                                    if (parcelFileDescriptor != null) {
                                        parcelFileDescriptor.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                i = 0;
                            } catch (Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                return Integer.valueOf(i);
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        throw th;
                                    }
                                }
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    parcelFileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                }
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }

        public void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            } else {
                a.a(a.this, num, this.b, true);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class c extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Uri b;

        static {
            kge.a(774261068);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Integer] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Integer doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, num});
            } else {
                a(num);
            }
        }

        private c() {
        }

        public Integer a(Object... objArr) {
            OutputStream openOutputStream;
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("41f654b0", new Object[]{this, objArr});
            }
            Bitmap bitmap = (Bitmap) objArr[0];
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("_display_name", Integer.valueOf(bitmap.toString().hashCode()));
            contentValues.put("mime_type", Constants.SHARETYPE_WITH_QRCODE);
            contentValues.put("date_added", Long.valueOf(valueOf.longValue() / 1000));
            contentValues.put("date_modified", Long.valueOf(valueOf.longValue() / 1000));
            contentValues.put("date_expires", Long.valueOf((valueOf.longValue() + 86400000) / 1000));
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = a.a(a.this).getContentResolver();
            this.b = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            try {
                openOutputStream = contentResolver.openOutputStream(this.b);
            } catch (IOException unused) {
                contentResolver.delete(this.b, null, null);
            }
            if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream)) {
                throw new IOException("Failed to compress");
            }
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentValues.putNull("date_expires");
            contentResolver.update(this.b, contentValues, null, null);
            i = 0;
            return Integer.valueOf(i);
        }

        public void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            } else {
                a.a(a.this, num, this.b, false);
            }
        }
    }

    private void a(Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6105bc", new Object[]{this, num, uri, new Boolean(z)});
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            Toast.makeText(this.f20484a.getApplicationContext(), "图片已保存，请在手机相册中查看", 0).show();
            if (z && !c()) {
                return;
            }
            a(uri);
        } else if (intValue == 1) {
            Toast.makeText(this.f20484a.getApplicationContext(), "存储失败", 0).show();
        } else if (intValue != 2) {
        } else {
            Toast.makeText(this.f20484a.getApplicationContext(), "存储失败，可能存储空间不足", 0).show();
        }
    }

    private void a(final String str, final InterfaceC0854a interfaceC0854a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742377da", new Object[]{this, str, interfaceC0854a});
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.flexbox.layoutmanager.save.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null) {
                        interfaceC0854a.a(str, drawable.getBitmap());
                    } else {
                        interfaceC0854a.a(str, null);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.flexbox.layoutmanager.save.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    interfaceC0854a.a(str, null);
                    return true;
                }
            }).fetch();
        }
    }

    private Bitmap d(Bitmap bitmap) {
        Bitmap bitmap2;
        Canvas canvas;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c8254b81", new Object[]{this, bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            try {
                if (oeb.aM()) {
                    if (width * height > 4665600) {
                        int[] a3 = a(width, height, 4665600L);
                        int i = a3[0];
                        height = a3[1];
                        width = i;
                    }
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, width, height, true);
                    canvas = new Canvas(bitmap2);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap2 = createBitmap;
                    canvas = canvas2;
                }
                if (this.h != null) {
                    int width2 = this.h.getWidth();
                    int height2 = this.h.getHeight();
                    Rect rect = new Rect(0, 0, width2, height2);
                    int a4 = a(width, 38);
                    if (height2 != 0) {
                        a2 = (width2 * a4) / height2;
                    } else {
                        a2 = a(width, 160);
                    }
                    Rect rect2 = new Rect((width - a2) - a(width, 20), (height - a4) - a(width, 53), width - a(width, 20), height - a(width, 53));
                    Paint paint = new Paint(1);
                    paint.setShadowLayer(a(width, 1), 0.0f, a(width, 1), 2130706432);
                    canvas.drawBitmap(this.h, rect, rect2, paint);
                }
                if (!TextUtils.isEmpty(this.f)) {
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setColor(-460552);
                    textPaint.setTextSize(a(width, 20));
                    textPaint.setShadowLayer(a(width, 1), 0.0f, a(width, 1), 2130706432);
                    canvas.drawText(this.f, (width - a(width, 20)) - textPaint.measureText(this.f), (height - a(width, 48)) - textPaint.getFontMetrics().top, textPaint);
                }
                canvas.save();
                canvas.restore();
                return bitmap2;
            } catch (Throwable th) {
                ogg.a("createWaterMaskBitmap", "createWaterMaskBitmap error:" + th.getMessage());
            }
        }
        return null;
    }

    private static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i2 * i) / 750;
    }

    private static int[] a(int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9d162368", new Object[]{new Integer(i), new Integer(i2), new Long(j)});
        }
        double d = i;
        double d2 = i2;
        double sqrt = Math.sqrt(j / (d * d2));
        return new int[]{(int) (d * sqrt), (int) (d2 * sqrt)};
    }
}
