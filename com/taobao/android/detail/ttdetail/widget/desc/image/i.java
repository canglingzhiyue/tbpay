package com.taobao.android.detail.ttdetail.widget.desc.image;

import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageInterface;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.android.k;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class i extends f implements com.taobao.android.detail.ttdetail.widget.desc.image.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 15;
    public static final String DETAIL_IMG_BIZ_NAME = "detail";
    public static final String TAG = "TaobaoImageLoaderAdapter";
    private static volatile i d;
    private final String b;
    private ImageStrategyConfig c;

    static {
        kge.a(-706594089);
        kge.a(651761296);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == -1906738505) {
            super.a((String) objArr[0], (DetailImageView) objArr[1], (d) objArr[2], (c) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private i(AliImageInterface aliImageInterface) {
        super(aliImageInterface);
        this.b = "END_IMAGE_URL";
        this.c = ImageStrategyConfig.a("detail", 15).f(false).a();
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b30759ce", new Object[0]);
        }
        if (d == null) {
            synchronized (i.class) {
                if (d == null) {
                    d = new i(k.a().a(odg.b().a()));
                }
            }
        }
        return d;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.a
    public String a(String str, g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b241148c", new Object[]{this, str, gVar}) : ImageStrategyDecider.decideUrl(str, Integer.valueOf(gVar.f11003a), Integer.valueOf(gVar.b), this.c);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.f, com.taobao.android.detail.ttdetail.widget.desc.image.e
    public void a(String str, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e4dcb8c", new Object[]{this, str, detailImageView});
        } else {
            a(str, detailImageView, null);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.f, com.taobao.android.detail.ttdetail.widget.desc.image.e
    public void a(String str, DetailImageView detailImageView, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c726d1", new Object[]{this, str, detailImageView, dVar});
        } else {
            a(str, detailImageView, dVar, null);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.f, com.taobao.android.detail.ttdetail.widget.desc.image.e
    public void a(String str, DetailImageView detailImageView, d dVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e597ab7", new Object[]{this, str, detailImageView, dVar, cVar});
            return;
        }
        if (dVar == null) {
            dVar = new d.a().a();
        }
        a(dVar);
        a aVar = new a(cVar, detailImageView);
        ViewGroup.LayoutParams layoutParams = detailImageView.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2 && layoutParams.height > 0) {
                dVar.b = true;
            } else if (layoutParams.height == -2 && layoutParams.width > 0) {
                dVar.f10998a = true;
            }
        }
        if (dVar.b) {
            aVar.c = true;
        } else if (dVar.f10998a) {
            aVar.d = true;
        }
        super.a(str, detailImageView, dVar, aVar);
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbd83ad", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            dVar.d = "detail";
            dVar.c = 15;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f11005a;
        public ImageView b;
        public boolean c;
        public boolean d;

        static {
            kge.a(-1439809481);
            kge.a(526669403);
        }

        public a(c cVar, ImageView imageView) {
            this.f11005a = cVar;
            this.b = imageView;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.image.c
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bbc9aef", new Object[]{this, bVar});
                return;
            }
            BitmapDrawable bitmapDrawable = bVar.b;
            com.taobao.android.detail.ttdetail.utils.i.a("TaobaoImageLoaderAdapter", "DetailImageLoadListenerWrapper onSuccess called.");
            ImageView imageView = this.b;
            if (imageView != null && bitmapDrawable != null) {
                int width = imageView.getWidth();
                int height = this.b.getHeight();
                int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    if (this.c) {
                        width = (int) (((intrinsicWidth * 1.0d) / intrinsicHeight) * height);
                    } else if (this.d) {
                        height = (int) (((intrinsicHeight * 1.0d) / intrinsicWidth) * width);
                    }
                    if (height > 0 && width > 0) {
                        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = height;
                            layoutParams.width = width;
                        } else {
                            this.b.setLayoutParams(new ViewGroup.LayoutParams(width, height));
                        }
                    }
                }
            }
            c cVar = this.f11005a;
            if (cVar == null) {
                return;
            }
            cVar.a(bVar);
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.image.c
        public void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6323b70", new Object[]{this, bVar});
                return;
            }
            c cVar = this.f11005a;
            if (cVar == null) {
                return;
            }
            cVar.b(bVar);
        }
    }
}
