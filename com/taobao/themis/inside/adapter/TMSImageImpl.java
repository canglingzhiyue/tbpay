package com.taobao.themis.inside.adapter;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.d;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.ieu;
import tb.kge;
import tb.kxd;
import tb.nia;
import tb.qow;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J$\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J&\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSImageImpl;", "Lcom/taobao/themis/kernel/adapter/IImageAdapter;", "()V", "decideUrl", "", "view", "Landroid/widget/ImageView;", "url", "strategy", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageStrategy;", kxd.GET_CONFIG_PREFIX, "Lcom/taobao/tao/image/ImageStrategyConfig;", "getImageRealURL", ieu.sStageLoadImage, "", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageListener;", "setImageUrl", "imgView", "imageStrategy", "WMLFailPhenixListener", "WMLSucPhenixListener", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSImageImpl implements IImageAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1035809698);
        kge.a(-312139935);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/taobao/phenix/intf/event/SuccPhenixEvent;", "kotlin.jvm.PlatformType", "onHappen"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c<T extends d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IImageAdapter.a f22449a;

        public c(IImageAdapter.a aVar) {
            this.f22449a = aVar;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public final boolean a(SuccPhenixEvent event) {
            IImageAdapter.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, event})).booleanValue();
            }
            q.b(event, "event");
            BitmapDrawable drawable = event.getDrawable();
            if (drawable != null && (aVar = this.f22449a) != null) {
                aVar.a(drawable);
            }
            return false;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IImageAdapter
    public void setImageUrl(ImageView imgView, String url, IImageAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b41f211", new Object[]{this, imgView, url, bVar});
            return;
        }
        q.d(imgView, "imgView");
        q.d(url, "url");
        if (imgView.getTag() instanceof com.taobao.phenix.intf.c) {
            Object tag = imgView.getTag();
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.phenix.intf.PhenixTicket");
            }
            ((com.taobao.phenix.intf.c) tag).b();
        }
        Application application = null;
        if (TextUtils.isEmpty(url)) {
            imgView.setImageDrawable(null);
            return;
        }
        String a2 = a(imgView, url, bVar);
        if (a2 == null) {
            return;
        }
        PhenixCreator releasableDrawable = com.taobao.phenix.intf.b.h().a(a2).limitSize(imgView).releasableDrawable(true);
        if (bVar != null && bVar.a() > 0) {
            nia[] niaVarArr = new nia[1];
            IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
            if (iEnvironmentService != null) {
                application = iEnvironmentService.getApplicationContext();
            }
            niaVarArr[0] = new com.taobao.phenix.compat.effects.b(application, bVar.a());
            releasableDrawable.bitmapProcessors(niaVarArr);
        } else if (bVar != null && bVar.d() > 0) {
            releasableDrawable.bitmapProcessors(new RoundedCornersBitmapProcessor(bVar.d(), 0));
        }
        releasableDrawable.succListener(new b(bVar, imgView, a2));
        releasableDrawable.failListener(new a(bVar, imgView, a2));
        imgView.setTag(releasableDrawable.fetch());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSImageImpl$WMLSucPhenixListener;", "Lcom/taobao/phenix/intf/event/IPhenixListener;", "Lcom/taobao/phenix/intf/event/SuccPhenixEvent;", "strategy", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageStrategy;", "imageView", "Landroid/widget/ImageView;", "url", "", "(Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageStrategy;Landroid/widget/ImageView;Ljava/lang/String;)V", "mImageStrategy", "mImageViewRef", "Ljava/lang/ref/WeakReference;", "mUrl", "onHappen", "", "succPhenixEvent", "Companion", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion;

        /* renamed from: a  reason: collision with root package name */
        private final IImageAdapter.b f22447a;
        private final WeakReference<ImageView> b;
        private final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/inside/adapter/TMSImageImpl$WMLSucPhenixListener$onHappen$1", "Lcom/taobao/themis/inside/utils/BlurTool$OnBlurCompleteListener;", "onBlurComplete", "", IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, "Landroid/graphics/Bitmap;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.inside.adapter.TMSImageImpl$b$b  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0939b implements qow.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageView f22448a;
            public final /* synthetic */ Drawable b;

            public C0939b(ImageView imageView, Drawable drawable) {
                this.f22448a = imageView;
                this.b = drawable;
            }

            @Override // tb.qow.a
            public void a(Bitmap bitmap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                    return;
                }
                q.d(bitmap, "bitmap");
                try {
                    ImageView imageView = this.f22448a;
                    Context context = this.f22448a.getContext();
                    q.b(context, "mImageView.context");
                    imageView.setImageDrawable(new BitmapDrawable(context.getResources(), bitmap));
                } catch (Exception e) {
                    try {
                        TMSLogger.b(e.getMessage(), "", e);
                        this.f22448a.setImageDrawable(this.b);
                    } catch (Exception e2) {
                        TMSLogger.b(e2.getMessage(), "", e);
                    }
                }
            }
        }

        static {
            kge.a(-928586251);
            kge.a(-1292221460);
            Companion = new a(null);
        }

        public b(IImageAdapter.b bVar, ImageView imageView, String url) {
            q.d(imageView, "imageView");
            q.d(url, "url");
            this.f22447a = bVar;
            this.b = new WeakReference<>(imageView);
            this.c = url;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            q.d(succPhenixEvent, "succPhenixEvent");
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            ImageView imageView = this.b.get();
            if (imageView == null) {
                return false;
            }
            q.b(imageView, "mImageViewRef.get() ?: return false");
            if (drawable != null) {
                IImageAdapter.b bVar = this.f22447a;
                if (bVar == null || bVar.a() <= 0) {
                    imageView.setImageDrawable(drawable);
                } else {
                    BitmapDrawable bitmapDrawable = drawable;
                    if (bitmapDrawable.getBitmap() != null) {
                        qow qowVar = qow.INSTANCE;
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        q.b(bitmap, "drawable.bitmap");
                        qowVar.a(bitmap, this.f22447a.a(), new C0939b(imageView, drawable));
                    } else {
                        try {
                            imageView.setImageDrawable(drawable);
                        } catch (Exception e) {
                            TMSLogger.b(e.getMessage(), "", e);
                        }
                    }
                }
            }
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSImageImpl$WMLSucPhenixListener$Companion;", "", "()V", "DRAWABLE_KEY", "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a {
            static {
                kge.a(1098621693);
            }

            private a() {
            }

            public /* synthetic */ a(o oVar) {
                this();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSImageImpl$WMLFailPhenixListener;", "Lcom/taobao/phenix/intf/event/IPhenixListener;", "Lcom/taobao/phenix/intf/event/FailPhenixEvent;", "strategy", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageStrategy;", "imageView", "Landroid/widget/ImageView;", "url", "", "(Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageStrategy;Landroid/widget/ImageView;Ljava/lang/String;)V", "mImageStrategy", "mImageViewRef", "Ljava/lang/ref/WeakReference;", "mUrl", "onHappen", "", "failPhenixEvent", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final IImageAdapter.b f22446a;
        private final WeakReference<ImageView> b;
        private final String c;

        static {
            kge.a(-1208397774);
            kge.a(-1292221460);
        }

        public a(IImageAdapter.b bVar, ImageView imageView, String url) {
            q.d(imageView, "imageView");
            q.d(url, "url");
            this.f22446a = bVar;
            this.b = new WeakReference<>(imageView);
            this.c = url;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ImageView imageView = this.b.get();
            if (imageView == null) {
                return false;
            }
            q.b(imageView, "mImageViewRef.get() ?: return false");
            return false;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IImageAdapter
    public void loadImage(String str, IImageAdapter.b bVar, IImageAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3e92e7", new Object[]{this, str, bVar, aVar});
            return;
        }
        PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(str);
        if (bVar != null && bVar.a() > 0) {
            Object a3 = qpt.a(IEnvironmentService.class);
            q.b(a3, "TMSAdapterManager.getNot…nmentService::class.java)");
            a2.bitmapProcessors(new com.taobao.phenix.compat.effects.b(((IEnvironmentService) a3).getApplicationContext(), bVar.a()));
        } else if (bVar != null && bVar.d() > 0) {
            a2.bitmapProcessors(new RoundedCornersBitmapProcessor(bVar.d(), 0));
        }
        a2.succListener(new c(aVar)).fetch();
    }

    private final String a(ImageView imageView, String str, IImageAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b20b2904", new Object[]{this, imageView, str, bVar}) : TextUtils.isEmpty(str) ? str : b(imageView, str, bVar);
    }

    private final String b(ImageView imageView, String str, IImageAdapter.b bVar) {
        int height;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28214b63", new Object[]{this, imageView, str, bVar});
        }
        ImageStrategyConfig a2 = a(bVar);
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

    private final ImageStrategyConfig a(IImageAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("c96e2ff1", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a(bVar.c() ? ImageStrategyConfig.WEAPPSHARPEN : ImageStrategyConfig.WEAPP, 70);
        q.b(a2, "ImageStrategyConfig.newB…         70\n            )");
        if (!TextUtils.isEmpty(bVar.b())) {
            String b2 = bVar.b();
            q.a((Object) b2);
            a2.a(ImageStrategyConfig.SizeLimitType.valueOf(b2));
        }
        return a2.a();
    }
}
