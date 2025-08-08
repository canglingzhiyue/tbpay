package tb;

import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.IImageLoader;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ngx implements IImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f31452a = new Handler(Looper.getMainLooper());

    /* renamed from: tb.ngx$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31454a = new int[IImageLoader.ImageQuality.values().length];

        static {
            try {
                f31454a[IImageLoader.ImageQuality.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31454a[IImageLoader.ImageQuality.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31454a[IImageLoader.ImageQuality.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-1930803574);
        kge.a(-918181316);
    }

    public static /* synthetic */ String a(ngx ngxVar, ImageView imageView, String str, IImageLoader.ImageQuality imageQuality, IImageLoader.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbbec733", new Object[]{ngxVar, imageView, str, imageQuality, bVar}) : ngxVar.b(imageView, str, imageQuality, bVar);
    }

    @Override // com.taobao.pha.core.IImageLoader
    public void a(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af386b6c", new Object[]{this, imageView, str});
        } else {
            a(imageView, str, IImageLoader.ImageQuality.ORIGINAL, new IImageLoader.b());
        }
    }

    @Override // com.taobao.pha.core.IImageLoader
    public void a(final ImageView imageView, final String str, final IImageLoader.ImageQuality imageQuality, final IImageLoader.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d59b5e", new Object[]{this, imageView, str, imageQuality, bVar});
        } else {
            this.f31452a.post(new Runnable() { // from class: tb.ngx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ImageView imageView2 = imageView;
                    if (imageView2 == null) {
                        return;
                    }
                    if (imageView2.getTag() instanceof c) {
                        ((c) imageView.getTag()).b();
                    }
                    if (StringUtils.isEmpty(str)) {
                        imageView.setImageDrawable(null);
                        return;
                    }
                    String a2 = ngx.a(ngx.this, imageView, str, imageQuality, bVar);
                    if (!StringUtils.isEmpty(bVar.b)) {
                        com.taobao.phenix.intf.b.h().a(bVar.b).fetch();
                    }
                    PhenixCreator addLoaderExtra = com.taobao.phenix.intf.b.h().a(a2).secondary(bVar.b).limitSize(imageView).releasableDrawable(true).addLoaderExtra(esr.BUNDLE_BIZ_CODE, Integer.toString(100));
                    addLoaderExtra.succListener(new b(bVar, imageView, str));
                    addLoaderExtra.failListener(new a(bVar, imageView, str));
                    imageView.setTag(addLoaderExtra.fetch());
                }
            });
        }
    }

    private String b(ImageView imageView, String str, IImageLoader.ImageQuality imageQuality, IImageLoader.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49fea683", new Object[]{this, imageView, str, imageQuality, bVar}) : (imageView == null || StringUtils.isEmpty(str) || imageQuality == IImageLoader.ImageQuality.ORIGINAL) ? str : a(imageView, str, bVar.f18706a, imageQuality);
    }

    private String a(ImageView imageView, String str, boolean z, IImageLoader.ImageQuality imageQuality) {
        int height;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db2e4653", new Object[]{this, imageView, str, new Boolean(z), imageQuality});
        }
        ImageStrategyConfig a2 = a(z, imageQuality);
        if (a2 == null) {
            return str;
        }
        if (imageView.getLayoutParams() != null) {
            height = imageView.getLayoutParams().height;
            width = imageView.getLayoutParams().width;
        } else {
            height = imageView.getHeight();
            width = imageView.getWidth();
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(width), Integer.valueOf(height), a2);
    }

    private ImageStrategyConfig a(boolean z, IImageLoader.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("8754a140", new Object[]{this, new Boolean(z), imageQuality});
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a(z ? ImageStrategyConfig.WEAPPSHARPEN : ImageStrategyConfig.WEAPP, 100);
        if (imageQuality != null) {
            int i = AnonymousClass2.f31454a[imageQuality.ordinal()];
            if (i == 1) {
                a2.a(TaobaoImageUrlStrategy.ImageQuality.q50);
            } else if (i == 2) {
                a2.a(TaobaoImageUrlStrategy.ImageQuality.q75);
            } else if (i == 3) {
                a2.a(TaobaoImageUrlStrategy.ImageQuality.q90);
            }
        }
        return a2.a();
    }

    /* loaded from: classes7.dex */
    public static class b implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private IImageLoader.b f31456a;
        private WeakReference<ImageView> b;
        private String c;

        static {
            kge.a(504723722);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public b(IImageLoader.b bVar, ImageView imageView, String str) {
            this.f31456a = bVar;
            this.b = new WeakReference<>(imageView);
            this.c = str;
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            ImageView imageView = this.b.get();
            if (imageView != null && drawable != null) {
                imageView.setImageDrawable(drawable);
                if (!succPhenixEvent.isIntermediate() && this.f31456a.c != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, new WeakReference(drawable));
                    this.f31456a.c.a(this.c, imageView, true, hashMap);
                }
            }
            return false;
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private IImageLoader.b f31455a;
        private WeakReference<ImageView> b;
        private String c;

        static {
            kge.a(274538429);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public a(IImageLoader.b bVar, ImageView imageView, String str) {
            this.f31455a = bVar;
            this.b = new WeakReference<>(imageView);
            this.c = str;
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ImageView imageView = this.b.get();
            if (imageView != null && this.f31455a.c != null) {
                this.f31455a.c.a(this.c, imageView, false, null);
            }
            return false;
        }
    }
}
