package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.business.videocollection.poplayer.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class sio extends pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sii c;
    private TUrlImageView d;

    static {
        kge.a(2070070633);
    }

    public static /* synthetic */ Object ipc$super(sio sioVar, String str, Object... objArr) {
        if (str.hashCode() == -1355309186) {
            super.onCreateView((psw) objArr[0], (snp) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "VideoCoverLayer";
    }

    public static /* synthetic */ sii a(sio sioVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("d6f0a3d4", new Object[]{sioVar}) : sioVar.c;
    }

    public sio(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.c = siiVar;
    }

    public TUrlImageView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("44403452", new Object[]{this}) : this.d;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        boolean e = ((ICardService) this.f32873a.getService(ICardService.class)).getConfig().e();
        boolean c = spv.a().c();
        if (!e) {
            if (c) {
                return true;
            }
            if (!this.c.ar()) {
                return this.f32873a.getService(INativeCollectionPoplayerService.class) != null && ((INativeCollectionPoplayerService) this.f32873a.getService(INativeCollectionPoplayerService.class)).checkDialogPopup(this.f32873a) && ((INativeCollectionPoplayerService) this.f32873a.getService(INativeCollectionPoplayerService.class)).checkPopupFisrtTime(this.f32873a) && a.b(this.f32873a);
            }
            spz.c("VideoCoverLayer", "在容器外预创建的播放器会以前播，不用添加封面图");
            return true;
        }
        String preCoverKey = this.f32873a.getInstanceConfig().getPreCoverKey();
        boolean a2 = b.a().a(preCoverKey);
        bl e2 = b.a().e(preCoverKey);
        boolean c2 = b.a().c(preCoverKey);
        if (e2 != null && !c2 && a2) {
            z = true;
        }
        return z;
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        this.d = new TUrlImageView(snpVar.itemView.getContext());
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        spz.c(sii.TAG, "onShowCover 封面");
        if (this.c.af() == null || this.d.getParent() != null) {
            return;
        }
        boolean e = ((ICardService) this.f32873a.getService(ICardService.class)).getConfig().e();
        if (this.c.k().f() != null && e) {
            spz.a("VideoCoverLayer", "onShowCover orangeSharePlayerView 为true并且dw实例不为null，return掉");
            return;
        }
        sjq b = this.c.ah().b();
        sin.a(this.c.af());
        this.d.setStrategyConfig(FluidSDK.getImageAdapter().getImageStrategyConfig(b));
        this.d.setImageUrl(this.c.af().e());
        this.d.setScaleType(b.g);
        this.d.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.sio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                ((IMessageService) sio.a(sio.this).z().getService(IMessageService.class)).sendMessage(new spy("VSMSG_longPress", sio.a(sio.this).f(), null));
                return false;
            }
        });
        this.c.ah().a(new FrameLayout.LayoutParams(b.d, b.c));
        this.c.ah().a().topMargin = b.e;
        spz.a("VideoCoverLayer", "onShowCover halfscreen " + this.c.ah().b().d + " " + this.c.ah().b().c + " ; " + this.c.af().n() + " " + this.c.af().j() + " ; " + this.c.ah().a().height);
        if (d()) {
            spz.a("VideoCoverLayer", "onShowCover 不显示封面图，return掉");
            return;
        }
        spz.c(sii.TAG, "onShowCover 显示firstCover图，detail.decidedFirstFrame()：" + this.c.af().e() + ",id:" + this.c.w());
        this.c.ag().a(this.d, this.c.ah().a());
    }

    public void a(int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5309b8b6", new Object[]{this, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        spz.c(sii.TAG, "onShowFirstCover 封面");
        if (this.d.getParent() != null || this.c.af() == null) {
            return;
        }
        boolean e = ((ICardService) this.f32873a.getService(ICardService.class)).getConfig().e();
        spz.a("VideoCoverLayer", "onShowFirstCover orangeSharePlayerView :" + e);
        if (e && this.c.k().f() != null) {
            spz.a("VideoCoverLayer", "onShowFirstCover orangeSharePlayerView 为true并且dw实例不为null，return掉");
            return;
        }
        sjq b = this.c.ah().b();
        if (drawable == null && str != null) {
            TUrlImageView loadingImage = ((IQuickOpenService) this.c.z().getService(IQuickOpenService.class)).getLoadingImage();
            if (loadingImage != null && loadingImage.getDrawable() != null) {
                this.d.setImageDrawable(loadingImage.getDrawable());
                spz.a("VideoCoverLayer", "onShowFirstCover drawable为null mCardRenderManager.mCoverImageView.setImageDrawable");
            } else {
                this.d.setStrategyConfig(FluidSDK.getImageAdapter().getImageStrategyConfig(b));
                this.d.setImageUrl(str);
                spz.a("VideoCoverLayer", "onShowFirstCover drawable为null mCardRenderManager.mCoverImageView.setImageUrl");
            }
        } else {
            this.d.setImageDrawable(drawable);
            spz.a("VideoCoverLayer", "onShowFirstCover drawable不为null mCardRenderManager.mCoverImageView.setImageDrawable");
        }
        this.d.setScaleType(b.g);
        this.d.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.sio.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                ((IMessageService) sio.a(sio.this).z().getService(IMessageService.class)).sendMessage(new spy("VSMSG_longPress", sio.a(sio.this).f(), null));
                return false;
            }
        });
        this.c.ah().a(new FrameLayout.LayoutParams(b.d, b.l == 0 ? b.c : b.l));
        this.c.ah().a().topMargin = this.c.ah().b().e;
        if (d()) {
            spz.a("VideoCoverLayer", "onShowFirstCover 不显示封面图，return掉");
            return;
        }
        spz.a("VideoCoverLayer", "onShowFirstCover 显示firstCover图,top:" + this.c.ah().a().topMargin);
        this.c.ag().a(this.d, this.c.ah().a());
        ((IContainerService) this.f32873a.getService(IContainerService.class)).hideLoading();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.d.getParent() == null) {
        } else {
            ViewParent parent = this.d.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(this.d);
        }
    }
}
