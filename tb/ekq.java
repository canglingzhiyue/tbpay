package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.phenix.compat.effects.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ekq<ContentView extends View> extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int mViewIdBackground;
    public static final int mViewIdRealContent;
    public aqs d;
    public AURAGlobalData e;

    public static /* synthetic */ Object ipc$super(ekq ekqVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(AURARenderComponent aURARenderComponent, FrameLayout frameLayout, ContentView contentview, int i);

    public abstract ContentView b(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer);

    public abstract String b(AURARenderComponent aURARenderComponent);

    public static /* synthetic */ q a(ekq ekqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("29af66f2", new Object[]{ekqVar}) : ekqVar.c;
    }

    static {
        kge.a(-323345453);
        mViewIdRealContent = R.id.standard_detail_gallery_id_frame_content;
        mViewIdBackground = R.id.standard_detail_gallery_id_frame_background;
    }

    @Override // tb.atc
    public final View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(emh.a(viewGroup), -2));
        ContentView b = b(viewGroup, aURARenderComponentContainer);
        if (-1 != b.getId()) {
            i.a("Assert", "innerCreateView返回的View不允许设置id，使用统一的mViewIdRealContent:" + b.getId());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(emh.a(viewGroup), -1);
        b.setId(mViewIdRealContent);
        b.setLayoutParams(layoutParams);
        frameLayout.addView(b);
        if (this instanceof eks) {
            for (eku ekuVar : b().b(eku.class)) {
                ekuVar.b(frameLayout, (ImageView) b);
            }
        }
        return frameLayout;
    }

    private TUrlImageView a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("4c15b631", new Object[]{this, frameLayout});
        }
        TUrlImageView c = c(frameLayout);
        if (c == null) {
            c = a(frameLayout.getContext());
            frameLayout.addView(c);
        }
        ContentView d = d(frameLayout);
        if (d != null) {
            d.bringToFront();
        }
        return c;
    }

    private void b(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b9fec", new Object[]{this, frameLayout});
        } else {
            frameLayout.removeView(c(frameLayout));
        }
    }

    private TUrlImageView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("31eac39c", new Object[]{this, context});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setId(mViewIdBackground);
        tUrlImageView.setScaleX(1.5f);
        tUrlImageView.setScaleY(1.5f);
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        tUrlImageView.setLayoutParams(layoutParams);
        return tUrlImageView;
    }

    private TUrlImageView c(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("dc1472ef", new Object[]{this, frameLayout});
        }
        View findViewById = frameLayout.findViewById(mViewIdBackground);
        if (!(findViewById instanceof TUrlImageView)) {
            return null;
        }
        return (TUrlImageView) findViewById;
    }

    private ContentView d(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentView) ipChange.ipc$dispatch("53d8d0b0", new Object[]{this, frameLayout});
        }
        ContentView contentview = (ContentView) frameLayout.findViewById(mViewIdRealContent);
        if (contentview == null) {
            ema.a("mainGalleryGetContentViewTagError", "contentView is null, cannot find id:" + mViewIdRealContent, this.c, this.d);
        }
        return contentview;
    }

    @Override // tb.atc
    public final void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof FrameLayout)) {
            arc.a().c("AbsAliSDetailMainGalleryFrameExtension", "renderView", "createView 创建时必须返回一个FrameLayout");
        } else {
            FrameLayout frameLayout = (FrameLayout) view;
            ContentView d = d(frameLayout);
            if (d == null) {
                arc.a().c("AbsAliSDetailMainGalleryFrameExtension", "renderView", "contentView is null");
            } else {
                a(aURARenderComponent, frameLayout, d, i);
            }
            a(aURARenderComponent, frameLayout);
        }
    }

    private void a(AURARenderComponent aURARenderComponent, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa329cd6", new Object[]{this, aURARenderComponent, frameLayout});
            return;
        }
        if (1.0f != emh.b(aURARenderComponent, emh.sDefaultDimension)) {
            z = false;
        }
        if (z) {
            b(aURARenderComponent, frameLayout);
        } else {
            b(frameLayout);
        }
    }

    private void b(AURARenderComponent aURARenderComponent, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab464b5", new Object[]{this, aURARenderComponent, frameLayout});
            return;
        }
        final String b = b(aURARenderComponent);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        final TUrlImageView a2 = a(frameLayout);
        final PhenixOptions bitmapProcessors = new PhenixOptions().scaleFromLarge(true).bitmapProcessors(new b(frameLayout.getContext(), 20, 20));
        Iterator it = b().b(eku.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = b().b(ekw.class).iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        bbh.a(new Runnable() { // from class: tb.ekq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a2.setImageUrl(b, bitmapProcessors);
                } catch (Exception e) {
                    bbh.a(new Runnable() { // from class: tb.ekq.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a2.setImageUrl(b, bitmapProcessors);
                            }
                        }
                    }, 0L);
                    ema.a("mainGalleryAsyncLoadBackgroundError", e.getMessage(), ekq.a(ekq.this), ekq.this.d);
                }
            }
        });
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.d = aqsVar;
        this.e = aURAGlobalData;
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
    }
}
