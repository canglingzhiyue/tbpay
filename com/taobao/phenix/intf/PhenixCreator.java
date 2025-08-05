package com.taobao.phenix.intf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.e;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.f;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.rxm.schedule.j;
import com.taobao.rxm.schedule.k;
import com.taobao.rxm.schedule.o;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import tb.esr;
import tb.kge;
import tb.nia;
import tb.nip;
import tb.niq;
import tb.niw;
import tb.njk;
import tb.nna;

/* loaded from: classes7.dex */
public class PhenixCreator extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PhenixCreator";
    private static int[] gScreenSize;
    private ExecutorService executorService;
    private com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.d> mCancelListener;
    private Drawable mErrorDrawable;
    private int mErrorResId;
    private com.taobao.phenix.intf.event.a<FailPhenixEvent> mFailListener;
    private Handler mHandler;
    private final com.taobao.phenix.request.b mImageRequest;
    private WeakReference<ImageView> mIntoImageRef;
    private com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c> mMemMissListener;
    private Drawable mPlaceholderDrawable;
    private int mPlaceholderResId;
    private com.taobao.phenix.intf.event.a<f> mProgressListener;
    private com.taobao.phenix.intf.event.b mRetryHandlerOnFailure;
    private com.taobao.phenix.intf.event.a<SuccPhenixEvent> mSuccessListener;

    public static /* synthetic */ Object ipc$super(PhenixCreator phenixCreator, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Deprecated
    public PhenixCreator notSharedDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhenixCreator) ipChange.ipc$dispatch("c181949e", new Object[]{this, new Boolean(z)}) : this;
    }

    public static /* synthetic */ WeakReference access$000(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("240c32c4", new Object[]{phenixCreator}) : phenixCreator.mIntoImageRef;
    }

    public static /* synthetic */ int access$100(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("21eef56a", new Object[]{phenixCreator})).intValue() : phenixCreator.mPlaceholderResId;
    }

    public static /* synthetic */ Drawable access$200(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("a589aec2", new Object[]{phenixCreator}) : phenixCreator.mPlaceholderDrawable;
    }

    public static /* synthetic */ int access$300(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57307a6c", new Object[]{phenixCreator})).intValue() : phenixCreator.mErrorResId;
    }

    public static /* synthetic */ Drawable access$400(PhenixCreator phenixCreator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("61707a80", new Object[]{phenixCreator}) : phenixCreator.mErrorDrawable;
    }

    static {
        kge.a(-367163728);
        gScreenSize = null;
    }

    public PhenixCreator(njk njkVar, String str, com.taobao.phenix.cache.a aVar) {
        this.mImageRequest = new com.taobao.phenix.request.b(str, aVar, b.h().g());
        if (njkVar != null) {
            this.mImageRequest.a(njkVar.f31501a);
            this.mImageRequest.f(njkVar.b);
            this.mImageRequest.d(njkVar.c);
            this.mImageRequest.e(njkVar.d);
            preloadWithSmall(njkVar.e);
            scaleFromLarge(njkVar.f);
            return;
        }
        preloadWithSmall(b.h().u());
        scaleFromLarge(b.h().t());
    }

    @Override // com.taobao.phenix.intf.a
    public String url() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae8274ea", new Object[]{this}) : this.mImageRequest.y().g();
    }

    public int id() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8c38c15", new Object[]{this})).intValue();
        }
        com.taobao.phenix.request.b bVar = this.mImageRequest;
        if (bVar == null) {
            return -1;
        }
        return bVar.H();
    }

    public ImageStatistics getStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStatistics) ipChange.ipc$dispatch("946a835f", new Object[]{this});
        }
        com.taobao.phenix.request.b bVar = this.mImageRequest;
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    @Override // com.taobao.phenix.intf.a
    /* renamed from: placeholder */
    public PhenixCreator mo1207placeholder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("a098612c", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.mPlaceholderDrawable != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.mPlaceholderResId = i;
        return this;
    }

    @Override // com.taobao.phenix.intf.a
    /* renamed from: placeholder */
    public PhenixCreator mo1208placeholder(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("4e7b9577", new Object[]{this, drawable});
        }
        if (this.mPlaceholderResId != 0) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.mPlaceholderDrawable = drawable;
        return this;
    }

    @Override // com.taobao.phenix.intf.a
    /* renamed from: error */
    public PhenixCreator mo1204error(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("fbab2381", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.mErrorDrawable != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.mErrorResId = i;
        return this;
    }

    @Override // com.taobao.phenix.intf.a
    /* renamed from: error */
    public PhenixCreator mo1205error(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("8bdf4b02", new Object[]{this, drawable});
        }
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (this.mErrorResId != 0) {
            throw new IllegalStateException("Error image already set.");
        }
        this.mErrorDrawable = drawable;
        return this;
    }

    @Override // com.taobao.phenix.intf.a
    /* renamed from: onlyCache */
    public PhenixCreator mo1206onlyCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("5ec1ceb8", new Object[]{this});
        }
        this.mImageRequest.b(true);
        return this;
    }

    public static int[] getScreenSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cff6f726", new Object[]{context});
        }
        if (gScreenSize == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            gScreenSize = new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        }
        return gScreenSize;
    }

    public PhenixCreator memOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("412b2829", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.a(z);
        return this;
    }

    public PhenixCreator skipCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("58205b4b", new Object[]{this});
        }
        this.mImageRequest.d();
        return this;
    }

    public PhenixCreator preloadWithSmall(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("58b6f820", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.a(z, 2);
        return this;
    }

    public PhenixCreator scaleFromLarge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("d341d90f", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.a(z, 4);
        return this;
    }

    public PhenixCreator memoryCachePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("1e0d1cfe", new Object[]{this, new Integer(i)});
        }
        this.mImageRequest.d(i);
        return this;
    }

    public PhenixCreator diskCachePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("8b214ce2", new Object[]{this, new Integer(i)});
        }
        this.mImageRequest.e(i);
        return this;
    }

    public PhenixCreator schedulePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("99856314", new Object[]{this, new Integer(i)});
        }
        this.mImageRequest.f(i);
        return this;
    }

    public PhenixCreator fuzzyMatchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("69f3eea7", new Object[]{this});
        }
        this.mImageRequest.d(true);
        return this;
    }

    public PhenixCreator releasableDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("86be95fe", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.c(z);
        return this;
    }

    public PhenixCreator asThumbnail(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("1c8ccc43", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (i == 1 || i == 3) {
            this.mImageRequest.a(i, z);
        }
        return this;
    }

    public PhenixCreator bitmapProcessors(nia... niaVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("1b09796d", new Object[]{this, niaVarArr});
        }
        if (niaVarArr != null && niaVarArr.length > 0) {
            this.mImageRequest.a(niaVarArr);
        }
        return this;
    }

    public PhenixCreator bitmapProcessors(boolean z, nia... niaVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("ce19e633", new Object[]{this, new Boolean(z), niaVarArr});
        }
        if (niaVarArr != null && niaVarArr.length > 0) {
            this.mImageRequest.a(niaVarArr);
        }
        if (z) {
            this.mImageRequest.h(true);
        }
        return this;
    }

    public PhenixCreator forceAnimationToBeStatic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("3b9d65ed", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.e(z);
        return this;
    }

    public PhenixCreator secondary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("865e0370", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mImageRequest.b(str);
        }
        return this;
    }

    public PhenixCreator strictMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("eb25c72e", new Object[]{this, new Boolean(z)});
        }
        this.mImageRequest.g(z);
        return this;
    }

    @Deprecated
    public PhenixCreator setCacheKey4PlaceHolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("9864b666", new Object[]{this, str});
        }
        secondary(str);
        return this;
    }

    public PhenixCreator addLoaderExtra(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("7d2e513e", new Object[]{this, str, str2});
        }
        this.mImageRequest.a(str, str2);
        if (b.h().L() && esr.BUNDLE_BIZ_CODE.equals(str) && !TextUtils.isEmpty(str2)) {
            String[] strArr = esr.INDEPENDENT_STORAGE_BIZS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (TextUtils.equals(strArr[i], str2)) {
                    niw.d(TAG, "image independent Cache bizId=%s", str2);
                    this.mImageRequest.e(102);
                    break;
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    public PhenixCreator setOpenTraceContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("e1fb268d", new Object[]{this, map});
        }
        this.mImageRequest.a(map);
        return this;
    }

    public PhenixCreator failListener(com.taobao.phenix.intf.event.a<FailPhenixEvent> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("5a5915ad", new Object[]{this, aVar});
        }
        this.mFailListener = aVar;
        return this;
    }

    public PhenixCreator succListener(com.taobao.phenix.intf.event.a<SuccPhenixEvent> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("c02a2f09", new Object[]{this, aVar});
        }
        this.mSuccessListener = aVar;
        return this;
    }

    public PhenixCreator retryHandler(com.taobao.phenix.intf.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("2d96051e", new Object[]{this, bVar});
        }
        this.mRetryHandlerOnFailure = bVar;
        return this;
    }

    public PhenixCreator memCacheMissListener(com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("a2ea0ee2", new Object[]{this, aVar});
        }
        this.mMemMissListener = aVar;
        return this;
    }

    public PhenixCreator cancelListener(com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.d> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("2c21c1d1", new Object[]{this, aVar});
        }
        this.mCancelListener = aVar;
        return this;
    }

    public PhenixCreator progressListener(int i, com.taobao.phenix.intf.event.a<f> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("de7e3a6b", new Object[]{this, new Integer(i), aVar});
        }
        this.mImageRequest.c(i);
        this.mProgressListener = aVar;
        return this;
    }

    public PhenixCreator handler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("794bfa74", new Object[]{this, handler});
        }
        this.mHandler = handler;
        return this;
    }

    public PhenixCreator executorService(ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("684c49e7", new Object[]{this, executorService});
        }
        this.executorService = executorService;
        return this;
    }

    @Override // com.taobao.phenix.intf.a
    public c into(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("37337e6d", new Object[]{this, imageView}) : into(imageView, 1.0f);
    }

    public c into(ImageView imageView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f139a00f", new Object[]{this, imageView, new Float(f)});
        }
        limitSize(imageView);
        if (f > 1.0f) {
            com.taobao.phenix.request.b bVar = this.mImageRequest;
            bVar.a((int) (bVar.q() / f));
            com.taobao.phenix.request.b bVar2 = this.mImageRequest;
            bVar2.b((int) (bVar2.r() / f));
        }
        return fetchInto(imageView);
    }

    public c into(ImageView imageView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c65a764d", new Object[]{this, imageView, new Integer(i), new Integer(i2)});
        }
        limitSize(imageView, i, i2);
        return fetchInto(imageView);
    }

    public PhenixCreator limitSize(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("11f2fa6", new Object[]{this, view});
        }
        int[] screenSize = getScreenSize(view.getContext());
        return limitSize(view, screenSize[0], screenSize[1]);
    }

    public PhenixCreator limitSize(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("f2013b06", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (layoutParams.width > 0) {
                this.mImageRequest.a(layoutParams.width);
            } else if (layoutParams.width != -2) {
                this.mImageRequest.a(view.getWidth());
            }
            if (layoutParams.height > 0) {
                this.mImageRequest.b(layoutParams.height);
            } else if (layoutParams.height != -2) {
                this.mImageRequest.b(view.getHeight());
            }
        }
        if (this.mImageRequest.q() <= 0) {
            this.mImageRequest.a(i);
        }
        if (this.mImageRequest.r() <= 0) {
            this.mImageRequest.b(i2);
        }
        return this;
    }

    private c fetchInto(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4c12e353", new Object[]{this, imageView});
        }
        this.mIntoImageRef = new WeakReference<>(imageView);
        return failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.phenix.intf.PhenixCreator.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                ImageView imageView2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                if (PhenixCreator.access$000(PhenixCreator.this) == null || (imageView2 = (ImageView) PhenixCreator.access$000(PhenixCreator.this).get()) == null) {
                    return false;
                }
                if (PhenixCreator.access$300(PhenixCreator.this) != 0) {
                    imageView2.setImageResource(PhenixCreator.access$300(PhenixCreator.this));
                } else if (PhenixCreator.access$400(PhenixCreator.this) != null) {
                    imageView2.setImageDrawable(PhenixCreator.access$400(PhenixCreator.this));
                }
                return true;
            }
        }).memCacheMissListener(new com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c>() { // from class: com.taobao.phenix.intf.PhenixCreator.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(com.taobao.phenix.intf.event.c cVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, cVar})).booleanValue() : a(cVar);
            }

            public boolean a(com.taobao.phenix.intf.event.c cVar) {
                ImageView imageView2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("fa9f0059", new Object[]{this, cVar})).booleanValue();
                }
                if (PhenixCreator.access$000(PhenixCreator.this) == null || (imageView2 = (ImageView) PhenixCreator.access$000(PhenixCreator.this).get()) == null) {
                    return false;
                }
                if (PhenixCreator.access$100(PhenixCreator.this) != 0) {
                    imageView2.setImageResource(PhenixCreator.access$100(PhenixCreator.this));
                } else if (PhenixCreator.access$200(PhenixCreator.this) != null) {
                    imageView2.setImageDrawable(PhenixCreator.access$200(PhenixCreator.this));
                }
                return true;
            }
        }).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.phenix.intf.PhenixCreator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                ImageView imageView2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (PhenixCreator.access$000(PhenixCreator.this) == null || (imageView2 = (ImageView) PhenixCreator.access$000(PhenixCreator.this).get()) == null) {
                    return false;
                }
                if (succPhenixEvent.getDrawable() != null) {
                    imageView2.setImageDrawable(succPhenixEvent.getDrawable());
                }
                return true;
            }
        }).fetch();
    }

    @Override // com.taobao.phenix.intf.a
    public c fetch() {
        j oVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3e75300d", new Object[]{this});
        }
        c m = this.mImageRequest.m();
        if (TextUtils.isEmpty(this.mImageRequest.p())) {
            com.taobao.phenix.intf.event.a<FailPhenixEvent> aVar = this.mFailListener;
            if (aVar != null) {
                aVar.onHappen(new FailPhenixEvent(m));
            }
            return m;
        }
        Map<String, String> B = this.mImageRequest.B();
        if (B != null && (str = B.get(esr.BUNDLE_BIZ_CODE)) != null) {
            this.mImageRequest.b().b = str;
        }
        nip i = b.h().i();
        nna<e, com.taobao.phenix.request.b> c = i.c();
        k a2 = i.a();
        niq niqVar = new niq(this.mImageRequest, this, b.h().m(), a2, b.h().D());
        Handler handler = this.mHandler;
        if (handler != null) {
            oVar = new o(handler);
        } else {
            ExecutorService executorService = this.executorService;
            oVar = executorService != null ? new o(executorService) : a2.e();
        }
        c.b(niqVar.a(oVar));
        return m;
    }

    public com.taobao.phenix.intf.event.a<FailPhenixEvent> getFailureListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.a) ipChange.ipc$dispatch("8169976", new Object[]{this}) : this.mFailListener;
    }

    public com.taobao.phenix.intf.event.a<SuccPhenixEvent> getSuccessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.a) ipChange.ipc$dispatch("747e995d", new Object[]{this}) : this.mSuccessListener;
    }

    public com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c> getMemCacheMissListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.a) ipChange.ipc$dispatch("d9f8ce2b", new Object[]{this}) : this.mMemMissListener;
    }

    public com.taobao.phenix.intf.event.b getRetryHandlerOnFailure() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.b) ipChange.ipc$dispatch("ff8d944a", new Object[]{this}) : this.mRetryHandlerOnFailure;
    }

    public com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.d> getCancelListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.a) ipChange.ipc$dispatch("a2e3bbda", new Object[]{this}) : this.mCancelListener;
    }

    public com.taobao.phenix.intf.event.a<f> getProgressListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.event.a) ipChange.ipc$dispatch("1ade4bc7", new Object[]{this}) : this.mProgressListener;
    }

    @Deprecated
    public PhenixCreator setImageStrategyInfo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("2b8d0ad8", new Object[]{this, obj});
        }
        if (obj != null) {
            addLoaderExtra(esr.BUNDLE_BIZ_CODE, obj.toString());
        }
        return this;
    }
}
