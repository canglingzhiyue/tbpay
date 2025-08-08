package tb;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.detail.core.standard.lightoff.b;
import com.taobao.android.detail.core.standard.widget.ClipableTUrlImageView;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.mainpic")
/* loaded from: classes4.dex */
public final class eks extends ekq<TUrlImageView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "headerBgImage";
    public static final String TAG = "AliSDetailMainGalleryPictureComponentExtension";
    private s f;

    static {
        kge.a(197026157);
    }

    public static /* synthetic */ Object ipc$super(eks eksVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : COMPONENT_TYPE;
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, com.taobao.uikit.extend.feature.view.TUrlImageView] */
    @Override // tb.ekq
    public /* synthetic */ TUrlImageView b(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c25bfc1e", new Object[]{this, viewGroup, aURARenderComponentContainer}) : c(viewGroup, aURARenderComponentContainer);
    }

    public static /* synthetic */ s a(eks eksVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("5380f7b2", new Object[]{eksVar}) : eksVar.f;
    }

    public static /* synthetic */ void a(eks eksVar, AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513d622", new Object[]{eksVar, aURARenderComponent, view});
        } else {
            eksVar.a(aURARenderComponent, view);
        }
    }

    public static /* synthetic */ void a(eks eksVar, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0f2a91", new Object[]{eksVar, tUrlImageView});
        } else {
            eksVar.a(tUrlImageView);
        }
    }

    public eks() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.AliSDetailMainGalleryPictureComponentExtension");
    }

    @Override // tb.ekq
    public String b(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9aaefeae", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        return (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null || (str = (String) bbc.a(map, "url", String.class, "")) == null) ? "" : emd.a(str);
    }

    public TUrlImageView c(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("a3fcea7f", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        final ClipableTUrlImageView clipableTUrlImageView = new ClipableTUrlImageView(viewGroup.getContext());
        clipableTUrlImageView.setStrategyConfig(new ImageStrategyConfig.a("detail", 1503).a());
        clipableTUrlImageView.failListener(new a<FailPhenixEvent>() { // from class: tb.eks.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                eks.a(eks.this, clipableTUrlImageView);
                return false;
            }
        });
        return clipableTUrlImageView;
    }

    private void a(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
        } else if (tUrlImageView == null) {
        } else {
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER);
            tUrlImageView.setImageResource(R.drawable.pic_gallery_image_placeholder);
        }
    }

    @Override // tb.ekq
    public void a(final AURARenderComponent aURARenderComponent, FrameLayout frameLayout, TUrlImageView tUrlImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134131c7", new Object[]{this, aURARenderComponent, frameLayout, tUrlImageView, new Integer(i)});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            ema.a("picture#componentInvalidUrl", "data is null|component=" + aURARenderComponent.key, this.d);
            a(tUrlImageView);
            return;
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        if (map == null) {
            ema.a("picture#componentInvalidUrl", "fields is empty|component=" + aURARenderComponent.key, this.d);
            a(tUrlImageView);
            return;
        }
        String str = (String) bbc.a(map, "url", String.class, "");
        if (StringUtils.isEmpty(str)) {
            ema.a("picture#componentInvalidUrl", "url is empty|component=" + aURARenderComponent.key, this.d);
            a(tUrlImageView);
            return;
        }
        String str2 = (String) bbc.a(map, "imageMode", String.class, AliSDetailScaleType.fitCenter);
        if (AliSDetailScaleType.centerCrop.equalsIgnoreCase(str2)) {
            ard a2 = arc.a();
            a2.a(TAG, "innerRenderView", "mode=" + str2 + ",imageUrl=" + str);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        tUrlImageView.setImageUrl(emd.a(str), new PhenixOptions().preloadWithSmall(true).scaleFromLarge(true));
        for (eku ekuVar : b().b(eku.class)) {
            ekuVar.a(frameLayout, tUrlImageView);
        }
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: tb.eks.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    eks.a(eks.this, aURARenderComponent, view);
                }
            }
        });
        com.alibaba.android.aura.service.event.a.a(this.f, aURARenderComponent, AURAEventKey.exposureItem);
    }

    private void a(final AURARenderComponent aURARenderComponent, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4392661f", new Object[]{this, aURARenderComponent, view});
        } else if (!eir.a(view.getContext())) {
            com.alibaba.android.aura.service.event.a.a(this.f, aURARenderComponent, "itemClick");
        } else {
            final HashMap hashMap = new HashMap();
            epj.b().a(b(aURARenderComponent), view.getContext(), view.getHeight(), new c.a() { // from class: tb.eks.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        return;
                    }
                    hashMap.put(b.TRANS_IMGE_KEY, drawable);
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                    hashMap.put(b.TRANS_FROME_RECT_KEY, rect);
                    com.alibaba.android.aura.service.event.a.a(eks.a(eks.this), aURARenderComponent, "itemClick", hashMap);
                }
            });
        }
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = aURARenderComponent.key;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        return a() + System.currentTimeMillis();
    }

    @Override // tb.ekq, tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f = qVar.b();
    }
}
