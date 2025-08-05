package com.etao.feimagesearch.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.alipay.ma.util.ImageTool;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cot;
import tb.cui;
import tb.kge;

/* loaded from: classes4.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface b {
        void a(Bitmap bitmap, long j);

        void a(String str, String str2);
    }

    static {
        kge.a(1706370640);
    }

    /* loaded from: classes4.dex */
    public static class a extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Context f7028a;
        private final String b;
        private final b c;
        public boolean d;
        private final int e;

        static {
            kge.a(-648421981);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(a aVar, Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3edb0fc2", new Object[]{aVar, bitmap, new Long(j)});
            } else {
                aVar.a(bitmap, j);
            }
        }

        public a(Context context, String str, int i, b bVar, boolean z) {
            this.f7028a = context;
            this.b = str;
            this.e = i;
            this.c = bVar;
            this.d = z;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            final Bitmap a2 = n.a(this.f7028a, this.b, this.e);
            final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.d) {
                ad.c("onLoadSingleAlbumFinish", new ac() { // from class: com.etao.feimagesearch.util.n.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            a.a(a.this, a2, currentTimeMillis2);
                        }
                    }
                });
            } else {
                a(a2, currentTimeMillis2);
            }
        }

        private void a(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
            } else if (bitmap == null) {
                cot.a("PltCameraPai", "ImageLoader", "load image failed " + this.b);
                this.c.a("10000", "load image failed");
            } else {
                this.c.a(bitmap, j);
            }
        }
    }

    public static Bitmap a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("624ed5f7", new Object[]{context, str, new Integer(i)});
        }
        if (com.etao.feimagesearch.config.b.dC()) {
            return b(context, str, i);
        }
        return d(context, str);
    }

    private static Bitmap b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("295abcf8", new Object[]{context, str, new Integer(i)});
        }
        try {
            return d.a(Uri.parse(str), 1024, 1, i);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Bitmap d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("adad45a5", new Object[]{context, str});
        }
        try {
            if ("content".equalsIgnoreCase(Uri.parse(str).getScheme())) {
                return b(context, str);
            }
            return a(str, 1024, 1);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Bitmap a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5eec20f0", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = cui.a(options, i) * i2;
            options.inJustDecodeBounds = false;
            try {
                return BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                return a(str, i, i2 << 1);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Bitmap b(Context context, String str) {
        ParcelFileDescriptor parcelFileDescriptor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a917dbe7", new Object[]{context, str});
        }
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            cot.c("ImageLoader", "codeDecodePictureWithQr called, uriStr=" + str);
            parcelFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            if (parcelFileDescriptor == null) {
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Exception e) {
                        cot.b("ImageLoader", "error:" + e.getMessage());
                    }
                }
                return null;
            }
            try {
                Bitmap a2 = a(ImageTool.createThumbnail(parcelFileDescriptor.getFileDescriptor(), 1024, 1024, new ImageTool.ImageSampleOutInfo()));
                if (!com.etao.feimagesearch.config.b.bl()) {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (Exception e2) {
                            cot.b("ImageLoader", "error:" + e2.getMessage());
                        }
                    }
                    return a2;
                }
                Bitmap a3 = d.a(a2, d.a(str));
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Exception e3) {
                        cot.b("ImageLoader", "error:" + e3.getMessage());
                    }
                }
                return a3;
            } catch (Exception unused) {
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Exception e4) {
                        cot.b("ImageLoader", "error:" + e4.getMessage());
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptor2 = parcelFileDescriptor;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (Exception e5) {
                        cot.b("ImageLoader", "error:" + e5.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            parcelFileDescriptor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("79d2cfa4", new Object[]{bitmap});
        }
        if (!com.etao.feimagesearch.config.b.az()) {
            return bitmap;
        }
        try {
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                bitmap.recycle();
                return copy;
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
