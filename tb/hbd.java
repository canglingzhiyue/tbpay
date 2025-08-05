package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import com.taobao.phenix.animate.b;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class hbd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CACHE_SIZE = 54000000;
    public static final String TAG = "BitmapCache";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28568a;
    public static final LruCache<String, BitmapDrawable> sAlbumDrawableCache;
    public static final LruCache<String, BitmapDrawable> sDrawableCache;
    public static final ThreadPoolExecutor sThreadPool;

    public static /* synthetic */ int a(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc1cd09a", new Object[]{str, bitmapDrawable})).intValue() : b(str, bitmapDrawable);
    }

    static {
        kge.a(-1172062136);
        f28568a = true;
        sDrawableCache = new LruCache<String, BitmapDrawable>(CACHE_SIZE) { // from class: tb.hbd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.util.LruCache
            public /* synthetic */ int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, bitmapDrawable})).intValue() : a(str, bitmapDrawable);
            }

            public int a(String str, BitmapDrawable bitmapDrawable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc1cd09a", new Object[]{this, str, bitmapDrawable})).intValue() : hbd.a(str, bitmapDrawable);
            }
        };
        sAlbumDrawableCache = new LruCache<String, BitmapDrawable>(27000000) { // from class: tb.hbd.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.util.LruCache
            public /* synthetic */ int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, bitmapDrawable})).intValue() : a(str, bitmapDrawable);
            }

            public int a(String str, BitmapDrawable bitmapDrawable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc1cd09a", new Object[]{this, str, bitmapDrawable})).intValue() : hbd.a(str, bitmapDrawable) / 2;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 16, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100), new ThreadFactory() { // from class: tb.hbd.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f28569a = 1;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable);
                thread.setName("ThumbnailLoaderThread_" + this.f28569a);
                this.f28569a = this.f28569a + 1;
                return thread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        sThreadPool = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private static int b(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19dc489b", new Object[]{str, bitmapDrawable})).intValue();
        }
        if (bitmapDrawable instanceof b) {
            return ((bitmapDrawable.getIntrinsicWidth() * bitmapDrawable.getIntrinsicHeight()) * ((b) bitmapDrawable).i()) << 2;
        }
        if (bitmapDrawable != null && bitmapDrawable.getBitmap() != null) {
            return (bitmapDrawable.getBitmap().getWidth() * bitmapDrawable.getBitmap().getHeight()) << 2;
        }
        return 0;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        a(sAlbumDrawableCache, "sAlbumDrawableCache");
        a(sDrawableCache, "sDrawableCache");
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        sAlbumDrawableCache.resize(i);
        sDrawableCache.resize(i);
    }

    private static void a(LruCache<String, BitmapDrawable> lruCache, String str) {
        BitmapDrawable value;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ae6a23", new Object[]{lruCache, str});
            return;
        }
        int size = lruCache.size();
        for (Map.Entry<String, BitmapDrawable> entry : sDrawableCache.snapshot().entrySet()) {
            if (entry != null && entry.getValue() != null && (value = entry.getValue()) != null && value.getBitmap() != null && (bitmap = value.getBitmap()) != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        lruCache.evictAll();
        int size2 = lruCache.size();
        u.b(TAG, "AImageLoader： " + str + " : beforeSize=" + size + " ,afterSize=" + size2);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f28568a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f28568a = z;
        }
    }
}
