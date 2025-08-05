package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.view.d;

/* loaded from: classes8.dex */
public class ogw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE64_TAG = "data:image";
    public static final String BIN_TAG = "binary";

    /* loaded from: classes8.dex */
    public interface a {
        void a(Object obj, int i);

        void a(Object obj, Drawable drawable);
    }

    static {
        kge.a(-934280295);
    }

    public static /* synthetic */ Drawable a(Context context, ImageLoader.a aVar, Drawable drawable, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("ca27447", new Object[]{context, aVar, drawable, rect, new Integer(i), new Integer(i2)}) : b(context, aVar, drawable, rect, i, i2);
    }

    public static /* synthetic */ void a(a aVar, Object obj, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c874bc7", new Object[]{aVar, obj, drawable, new Integer(i)});
        } else {
            b(aVar, obj, drawable, i);
        }
    }

    public static ImageLoader.e a(ImageLoader imageLoader, ab abVar, Object obj, int i, int i2, ImageLoader.a aVar, Rect rect, boolean z, a aVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageLoader.e) ipChange.ipc$dispatch("2dcb0585", new Object[]{imageLoader, abVar, obj, new Integer(i), new Integer(i2), aVar, rect, new Boolean(z), aVar2}) : a(imageLoader, abVar, obj, null, i, i2, aVar, rect, z, false, aVar2);
    }

    public static ImageLoader.e a(ImageLoader imageLoader, ab abVar, final Object obj, String str, final int i, final int i2, final ImageLoader.a aVar, final Rect rect, boolean z, boolean z2, final a aVar2) {
        Bitmap bitmap;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (ImageLoader.e) ipChange.ipc$dispatch("baeb8e3d", new Object[]{imageLoader, abVar, obj, str, new Integer(i), new Integer(i2), aVar, rect, new Boolean(z), new Boolean(z2), aVar2});
        }
        if (abVar == null) {
            ogg.b("loadImageSrc engine is null");
            return null;
        }
        Context l = abVar.l();
        if (l == null) {
            l = ab.a();
        }
        final Context context = l;
        if (obj instanceof String) {
            if (TextUtils.isEmpty(str)) {
                String str3 = (String) obj;
                if (rect == null) {
                    z3 = false;
                }
                str2 = a(abVar, context, str3, i, i2, aVar, z | z3);
            } else {
                str2 = str;
            }
            if (str2 != null && str2.startsWith(BASE64_TAG) && !TextUtils.equals(aVar.d, "apng")) {
                Bitmap a2 = ohd.a(str2);
                b(aVar2, obj, a2 != null ? b(context, aVar, new BitmapDrawable(context.getResources(), a2), rect, i, i2) : null, 0);
                return null;
            }
            return (imageLoader == null ? com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i() : imageLoader).a(new ImageLoader.b(abVar, context, (String) obj, str2, i, i2, aVar, true), z2, new ImageLoader.d() { // from class: tb.ogw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoadFailed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
                public void onImageLoaded(String str4, BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("72686e27", new Object[]{this, str4, bitmapDrawable});
                    } else if (bitmapDrawable == null || a.this == null) {
                    } else {
                        ogw.a(a.this, obj, ogw.a(context, aVar, bitmapDrawable, rect, i, i2), 0);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
                public void onImageLoadFailed(int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i3)});
                    } else {
                        ogw.a(a.this, obj, null, i3);
                    }
                }
            });
        } else if (obj instanceof byte[]) {
            try {
                bitmap = BitmapFactory.decodeByteArray((byte[]) obj, 0, ((byte[]) obj).length);
            } catch (Exception e) {
                ogg.b(e.getMessage());
                bitmap = null;
            }
            b(aVar2, obj, bitmap != null ? b(context, aVar, new BitmapDrawable(context.getResources(), bitmap), rect, i, i2) : null, 0);
            return null;
        } else {
            b(aVar2, obj, null, 0);
            return null;
        }
    }

    private static Drawable b(Context context, ImageLoader.a aVar, Drawable drawable, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("593af3c8", new Object[]{context, aVar, drawable, rect, new Integer(i), new Integer(i2)});
        }
        if (drawable instanceof oee) {
            if (aVar != null && TextUtils.equals(aVar.d, "png")) {
                ((oee) drawable).b();
            } else {
                ((oee) drawable).a();
            }
            return ((oee) drawable).c();
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            if (rect != null && i > 0 && i2 > 0) {
                return d.a(context.getResources(), ((BitmapDrawable) drawable).getBitmap(), rect, i, i2);
            }
            return new BitmapDrawable(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
        }
    }

    private static void b(a aVar, Object obj, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c567ac66", new Object[]{aVar, obj, drawable, new Integer(i)});
        } else if (aVar == null) {
        } else {
            if (drawable != null) {
                aVar.a(obj, drawable);
            } else {
                aVar.a(obj, i);
            }
        }
    }

    public static String a(ab abVar, Context context, String str, int i, int i2, ImageLoader.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d2632b", new Object[]{abVar, context, str, new Integer(i), new Integer(i2), aVar, new Boolean(z)});
        }
        if (str == null) {
            return str;
        }
        if (str.startsWith("./")) {
            return oec.a(context, str, true);
        }
        return !str.startsWith(BASE64_TAG) ? (((!a(str) && !z) || oec.c()) && i > 0 && i2 > 0) ? com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(str, i, i2, aVar) : str : str;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str != null && (str.endsWith(".gif") || str.endsWith(".apng") || str.endsWith("apng.png") || str.endsWith("9.png"));
    }

    public static String a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65b96e50", new Object[]{aaVar});
        }
        if (aaVar != null && aaVar.c() != null && aaVar.c().a() != null) {
            return aaVar.c().a().a();
        }
        return null;
    }
}
