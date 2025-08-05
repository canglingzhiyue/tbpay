package com.taobao.android.detail.wrapper.ext.provider.core;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageInterface;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.emu;
import tb.epl;
import tb.epm;
import tb.epp;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends c implements com.taobao.android.detail.datasdk.protocol.adapter.core.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaobaoImageLoaderAdapter";
    private final String b;
    private ImageStrategyConfig c;

    static {
        kge.a(392173290);
        kge.a(-2062055481);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == -1239730992) {
            super.a((String) objArr[0], (DetailImageView) objArr[1], (epl) objArr[2], (com.taobao.android.detail.datasdk.protocol.image.b) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public h(AliImageInterface aliImageInterface) {
        super(aliImageInterface);
        this.b = "END_IMAGE_URL";
        this.c = ImageStrategyConfig.a("detail", 15).f(false).a();
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBImageLoaderProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c
    public String a(String str, epm epmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4292cc60", new Object[]{this, str, epmVar}) : ImageStrategyDecider.decideUrl(str, Integer.valueOf(epmVar.f27510a), Integer.valueOf(epmVar.b), this.c);
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c
    public void a(String str, Context context, final int i, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf04877", new Object[]{this, str, context, new Integer(i), aVar});
        } else {
            com.taobao.phenix.intf.b.h().a(context).a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.h.1
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
                    if (drawable != null && succPhenixEvent.getDrawable().getBitmap() != null && !succPhenixEvent.getDrawable().getBitmap().isRecycled() && i != -1) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        int i2 = i;
                        if (i2 != intrinsicHeight) {
                            intrinsicWidth = (i2 * intrinsicWidth) / intrinsicHeight;
                        }
                        drawable.setBounds(0, 0, intrinsicWidth, i);
                    }
                    c.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(drawable);
                    }
                    return false;
                }
            }).fetch();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.provider.core.c, com.taobao.android.detail.datasdk.protocol.image.c
    public void a(String str, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7895073", new Object[]{this, str, detailImageView});
        } else {
            a(str, detailImageView, null);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.provider.core.c, com.taobao.android.detail.datasdk.protocol.image.c
    public void a(String str, DetailImageView detailImageView, epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f346f22", new Object[]{this, str, detailImageView, eplVar});
        } else {
            a(str, detailImageView, eplVar, (com.taobao.android.detail.datasdk.protocol.image.b) null);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.provider.core.c, com.taobao.android.detail.datasdk.protocol.image.c
    public void a(String str, DetailImageView detailImageView, epl eplVar, com.taobao.android.detail.datasdk.protocol.image.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61b34d0", new Object[]{this, str, detailImageView, eplVar, bVar});
            return;
        }
        if (eplVar == null) {
            eplVar = new epl.a().a();
        }
        a(eplVar);
        a aVar = new a(bVar, detailImageView);
        ViewGroup.LayoutParams layoutParams = detailImageView.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2 && layoutParams.height > 0) {
                eplVar.b = true;
            } else if (layoutParams.height == -2 && layoutParams.width > 0) {
                eplVar.f27508a = true;
            }
        }
        if (eplVar.b) {
            aVar.c = true;
        } else if (eplVar.f27508a) {
            aVar.d = true;
        }
        super.a(str, detailImageView, eplVar, aVar);
    }

    private void a(epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74ac617", new Object[]{this, eplVar});
        } else if (eplVar == null) {
        } else {
            eplVar.d = "detail";
            eplVar.c = 15;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.android.detail.datasdk.protocol.image.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.detail.datasdk.protocol.image.b f11338a;
        public ImageView b;
        public boolean c;
        public boolean d;

        static {
            kge.a(-1216867894);
            kge.a(128859412);
        }

        public a(com.taobao.android.detail.datasdk.protocol.image.b bVar, ImageView imageView) {
            this.f11338a = bVar;
            this.b = imageView;
        }

        @Override // com.taobao.android.detail.datasdk.protocol.image.b
        public void onSuccess(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
                return;
            }
            BitmapDrawable bitmapDrawable = aVar.b;
            epp.b("TaobaoImageLoaderAdapter", "DetailImageLoadListenerWrapper onSuccess called.");
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
            com.taobao.android.detail.datasdk.protocol.image.b bVar = this.f11338a;
            if (bVar == null) {
                return;
            }
            bVar.onSuccess(aVar);
        }

        @Override // com.taobao.android.detail.datasdk.protocol.image.b
        public void onFailure(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15b99301", new Object[]{this, aVar});
                return;
            }
            com.taobao.android.detail.datasdk.protocol.image.b bVar = this.f11338a;
            if (bVar == null) {
                return;
            }
            bVar.onFailure(aVar);
        }
    }
}
