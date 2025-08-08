package com.taobao.android.detail.wrapper.ext.provider.core;

import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageCreatorInterface;
import com.taobao.android.AliImageInterface;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.l;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.purchase.inject.Implementation;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.emu;
import tb.epl;
import tb.fgr;
import tb.kge;

@Implementation
/* loaded from: classes5.dex */
public class c implements com.taobao.android.detail.datasdk.protocol.image.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AliImageInterface f11329a;
    private final String b = "enableImagePerformanceStrategy";

    static {
        kge.a(-27669467);
        kge.a(1217858067);
    }

    public c(AliImageInterface aliImageInterface) {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.ImageProvider");
        if (aliImageInterface == null) {
            throw new IllegalArgumentException("ImageProvider: aliImageInterface is null");
        }
        this.f11329a = aliImageInterface;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.c
    public void a(String str, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7895073", new Object[]{this, str, detailImageView});
        } else {
            this.f11329a.a(str).a(detailImageView);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.c
    public void a(String str, DetailImageView detailImageView, epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f346f22", new Object[]{this, str, detailImageView, eplVar});
        } else {
            a(str, detailImageView, eplVar, null);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.c
    public void a(String str, DetailImageView detailImageView, epl eplVar, com.taobao.android.detail.datasdk.protocol.image.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61b34d0", new Object[]{this, str, detailImageView, eplVar, bVar});
        } else if (detailImageView == null) {
        } else {
            if (StringUtils.isEmpty(str)) {
                detailImageView.setImageDrawable(null);
            } else if (eplVar == null || eplVar.c == 0) {
                throw new IllegalArgumentException("option is invalid");
            } else {
                String str2 = "default";
                if (eplVar.e == null) {
                    ImageStrategyConfig.a f = ImageStrategyConfig.a(eplVar.d != null ? eplVar.d : str2, eplVar.c).f(eplVar.f);
                    if (eplVar.h()) {
                        f.b(10000);
                        f.a(0);
                    } else if (eplVar.i()) {
                        f.a(10000);
                        f.b(0);
                    }
                    eplVar.e = f.a();
                }
                if (eplVar.c() != null) {
                    detailImageView.setScaleType(eplVar.c());
                }
                if (eplVar.f() > 0 && eplVar.g() > 0) {
                    str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(eplVar.f()), Integer.valueOf(eplVar.g()), eplVar.e);
                } else if (detailImageView.getWidth() > 0 && detailImageView.getHeight() > 0) {
                    str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(detailImageView.getWidth()), Integer.valueOf(detailImageView.getHeight()), eplVar.e);
                } else {
                    ViewGroup.LayoutParams layoutParams = detailImageView.getLayoutParams();
                    if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
                        str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), eplVar.e);
                    } else if (fgr.a("enableImagePerformanceStrategy", true, true) && str.startsWith("http") && str.endsWith(".jpg")) {
                        if (eplVar.d != null) {
                            str2 = eplVar.d;
                        }
                        eplVar.e = ImageStrategyConfig.a(str2, eplVar.c).f(eplVar.f).a(1200).b(1200).a(TaobaoImageUrlStrategy.ImageQuality.q90).a();
                        str = ImageStrategyDecider.decideUrl(str, 1200, 1200, eplVar.e);
                    }
                }
                if (str.endsWith("END_IMAGE_URL")) {
                    str = str.substring(0, str.length() - 13);
                }
                AliImageCreatorInterface a2 = this.f11329a.a(str);
                a2.b(new b(str, eplVar, detailImageView, bVar));
                a2.a(new a(str, eplVar, detailImageView, bVar));
                if (eplVar.d() != Integer.MAX_VALUE && eplVar.d() != 0) {
                    a2.a(eplVar.d());
                }
                a2.a();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements com.taobao.android.i<l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private epl f11331a;
        private DetailImageView b;
        private com.taobao.android.detail.datasdk.protocol.image.b c;
        private String d;

        static {
            kge.a(-1664846283);
            kge.a(118018852);
        }

        public b(String str, epl eplVar, DetailImageView detailImageView, com.taobao.android.detail.datasdk.protocol.image.b bVar) {
            try {
                detailImageView.setImageResource(eplVar.e());
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("ImageProvider", "ImageLoadSuccessListenerImpl#setImageResource", th);
            }
            this.f11331a = eplVar;
            this.b = detailImageView;
            this.c = bVar;
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
                epl eplVar = this.f11331a;
                if (eplVar != null && eplVar.c() != null) {
                    this.b.setScaleType(this.f11331a.c());
                }
                return false;
            }
            this.b.setImageDrawable(this.d, a2, this.f11331a);
            epl eplVar2 = this.f11331a;
            if (eplVar2 != null && eplVar2.b() != null) {
                this.b.setScaleType(this.f11331a.b());
            }
            if (this.c != null) {
                com.taobao.android.detail.datasdk.protocol.image.a aVar = new com.taobao.android.detail.datasdk.protocol.image.a();
                aVar.b = lVar.a();
                aVar.f10068a = this.d;
                this.c.onSuccess(aVar);
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.android.i<com.taobao.android.g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private epl f11330a;
        private DetailImageView b;
        private com.taobao.android.detail.datasdk.protocol.image.b c;
        private String d;

        static {
            kge.a(1384273212);
            kge.a(118018852);
        }

        public a(String str, epl eplVar, DetailImageView detailImageView, com.taobao.android.detail.datasdk.protocol.image.b bVar) {
            this.f11330a = eplVar;
            this.b = detailImageView;
            this.c = bVar;
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
            epl eplVar = this.f11330a;
            if (eplVar != null) {
                if (eplVar.a() != null) {
                    this.b.setScaleType(this.f11330a.a());
                }
                try {
                    this.b.setImageResource(this.f11330a.e());
                } catch (Throwable th) {
                    com.taobao.android.detail.core.utils.i.a("ImageProvider", "ImageLoadFailureListenerImpl#setImageResource", th);
                }
            }
            if (this.c != null) {
                com.taobao.android.detail.datasdk.protocol.image.a aVar = new com.taobao.android.detail.datasdk.protocol.image.a();
                aVar.f10068a = this.d;
                this.c.onFailure(aVar);
            }
            return false;
        }
    }
}
