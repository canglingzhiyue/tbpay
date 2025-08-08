package com.taobao.android.detail.ttdetail.widget.desc.image;

import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageCreatorInterface;
import com.taobao.android.AliImageInterface;
import com.taobao.android.l;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.kge;

/* loaded from: classes5.dex */
public class f implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AliImageInterface f11000a;
    private final String b = "enableImagePerformanceStrategy";

    static {
        kge.a(1189162258);
        kge.a(-64356244);
    }

    public f(AliImageInterface aliImageInterface) {
        if (aliImageInterface == null) {
            throw new IllegalArgumentException("ImageProvider: aliImageInterface is null");
        }
        this.f11000a = aliImageInterface;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.e
    public void a(String str, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e4dcb8c", new Object[]{this, str, detailImageView});
        } else {
            this.f11000a.a(str).a(detailImageView);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.e
    public void a(String str, DetailImageView detailImageView, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c726d1", new Object[]{this, str, detailImageView, dVar});
        } else {
            a(str, detailImageView, dVar, null);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.image.e
    public void a(String str, DetailImageView detailImageView, d dVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e597ab7", new Object[]{this, str, detailImageView, dVar, cVar});
        } else if (detailImageView == null) {
        } else {
            if (StringUtils.isEmpty(str)) {
                detailImageView.setImageDrawable(null);
            } else if (dVar == null || dVar.c == 0) {
                throw new IllegalArgumentException("option is invalid");
            } else {
                String str2 = "default";
                if (dVar.e == null) {
                    ImageStrategyConfig.a f = ImageStrategyConfig.a(dVar.d != null ? dVar.d : str2, dVar.c).f(dVar.f);
                    if (dVar.h()) {
                        f.b(10000);
                        f.a(0);
                    } else if (dVar.i()) {
                        f.a(10000);
                        f.b(0);
                    }
                    dVar.e = f.a();
                }
                if (dVar.c() != null) {
                    detailImageView.setScaleType(dVar.c());
                }
                if (dVar.f() > 0 && dVar.g() > 0) {
                    str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(dVar.f()), Integer.valueOf(dVar.g()), dVar.e);
                } else if (detailImageView.getWidth() > 0 && detailImageView.getHeight() > 0) {
                    str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(detailImageView.getWidth()), Integer.valueOf(detailImageView.getHeight()), dVar.e);
                } else {
                    ViewGroup.LayoutParams layoutParams = detailImageView.getLayoutParams();
                    if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
                        str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), dVar.e);
                    } else if (str.startsWith("http") && str.endsWith(".jpg")) {
                        if (dVar.d != null) {
                            str2 = dVar.d;
                        }
                        dVar.e = ImageStrategyConfig.a(str2, dVar.c).f(dVar.f).a(1200).b(1200).a(TaobaoImageUrlStrategy.ImageQuality.q90).a();
                        str = ImageStrategyDecider.decideUrl(str, 1200, 1200, dVar.e);
                    }
                }
                if (str.endsWith("END_IMAGE_URL")) {
                    str = str.substring(0, str.length() - 13);
                }
                AliImageCreatorInterface a2 = this.f11000a.a(str);
                a2.b(new b(str, dVar, detailImageView, cVar));
                a2.a(new a(str, dVar, detailImageView, cVar));
                if (dVar.d() != Integer.MAX_VALUE && dVar.d() != 0) {
                    a2.a(dVar.d());
                }
                a2.a();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements com.taobao.android.i<l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private d f11002a;
        private DetailImageView b;
        private c c;
        private String d;

        static {
            kge.a(903084136);
            kge.a(118018852);
        }

        public b(String str, d dVar, DetailImageView detailImageView, c cVar) {
            try {
                detailImageView.setImageResource(dVar.e());
            } catch (Throwable unused) {
            }
            this.f11002a = dVar;
            this.b = detailImageView;
            this.c = cVar;
            this.d = str;
        }

        @Override // com.taobao.android.i
        public boolean a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
            }
            if (this.b == null) {
                return false;
            }
            BitmapDrawable a2 = lVar.a();
            if (a2 == null || a2.getBitmap() == null || a2.getBitmap().isRecycled()) {
                d dVar = this.f11002a;
                if (dVar != null && dVar.c() != null) {
                    this.b.setScaleType(this.f11002a.c());
                }
                return false;
            }
            this.b.setImageDrawable(this.d, a2, this.f11002a);
            d dVar2 = this.f11002a;
            if (dVar2 != null && dVar2.b() != null) {
                this.b.setScaleType(this.f11002a.b());
            }
            if (this.c != null) {
                com.taobao.android.detail.ttdetail.widget.desc.image.b bVar = new com.taobao.android.detail.ttdetail.widget.desc.image.b();
                bVar.b = lVar.a();
                bVar.f10997a = this.d;
                this.c.a(bVar);
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.android.i<com.taobao.android.g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private d f11001a;
        private DetailImageView b;
        private c c;
        private String d;

        static {
            kge.a(-342763665);
            kge.a(118018852);
        }

        public a(String str, d dVar, DetailImageView detailImageView, c cVar) {
            this.f11001a = dVar;
            this.b = detailImageView;
            this.c = cVar;
            this.d = str;
        }

        @Override // com.taobao.android.i
        public boolean a(com.taobao.android.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5565567", new Object[]{this, gVar})).booleanValue();
            }
            if (this.b == null) {
                return false;
            }
            d dVar = this.f11001a;
            if (dVar != null) {
                if (dVar.a() != null) {
                    this.b.setScaleType(this.f11001a.a());
                }
                try {
                    this.b.setImageResource(this.f11001a.e());
                } catch (Throwable unused) {
                }
            }
            if (this.c != null) {
                com.taobao.android.detail.ttdetail.widget.desc.image.b bVar = new com.taobao.android.detail.ttdetail.widget.desc.image.b();
                bVar.f10997a = this.d;
                this.c.b(bVar);
            }
            return false;
        }
    }
}
