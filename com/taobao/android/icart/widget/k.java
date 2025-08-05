package com.taobao.android.icart.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bm;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.abj;
import tb.akg;
import tb.bbz;
import tb.bdn;
import tb.bed;
import tb.bpa;
import tb.jny;
import tb.kge;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0014J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0014J\b\u0010\"\u001a\u00020\u0012H\u0002J\u001a\u0010#\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/taobao/android/icart/widget/DXButterCartImageWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXButterImageWidgetNode;", "()V", "isItemPic", "", "()Z", "mView", "Landroid/view/View;", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "object", "", "buildSimpleImageOption", "Lcom/taobao/android/dinamicx/widget/DXImageWidgetNode$ImageOption;", "enableAppearEvent", "hasAlreadyLoadSuccess", "view", "loadWithPhenix", "", "context", "Landroid/content/Context;", "weakView", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "onImageLoadFinished", "imageUrl", "", "onImageLoadStart", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onRenderView", "onWidgetAppear", "saveTagInfoWhenLoadSuccess", "skipRenderWhenAlreadyLoaded", "imageView", "updateRatioByUrl", "Builder", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class k extends bm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f12884a;

    static {
        kge.a(-1905624613);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -322438727:
                return super.buildSimpleImageOption();
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : q.a((Object) "disableAppearItemPic", (Object) getUserId()) || q.a((Object) "itemPic", (Object) getUserId());
    }

    @Override // com.taobao.android.dinamicx.widget.bm, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new k();
    }

    @Override // com.taobao.android.dinamicx.widget.bm, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View weakView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, weakView});
            return;
        }
        q.d(context, "context");
        q.d(weakView, "weakView");
        this.f12884a = weakView;
        String imageUrl = getImageUrl();
        q.b(imageUrl, "imageUrl");
        a(context, imageUrl);
        if (b(weakView)) {
            b(context, imageUrl);
            return;
        }
        a(context, weakView);
        if (!c()) {
            return;
        }
        d();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.d buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.d) ipChange.ipc$dispatch("ecc7f9b9", new Object[]{this});
        }
        DXImageWidgetNode.d imageOption = super.buildSimpleImageOption();
        if (a() && akg.b()) {
            imageOption.e = "carts_001";
            imageOption.f = TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_CLIP;
        }
        q.b(imageOption, "imageOption");
        return imageOption;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            b();
        } catch (Exception e) {
            abj.a("ImageNodeUpdateRadioError", e);
        }
        super.onMeasure(i, i2);
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (hasAspectRatioAttribute() || getLayoutWidth() > 0 || getLayoutWidth() == -1) {
        } else {
            String imageUrl = getImageUrl();
            if (TextUtils.isEmpty(imageUrl)) {
                return;
            }
            Matcher matcher = g.b.matcher(imageUrl);
            if (!matcher.find()) {
                return;
            }
            String group = matcher.group(1);
            q.b(group, "matcher.group(1)");
            float parseFloat = Float.parseFloat(group);
            String group2 = matcher.group(2);
            q.b(group2, "matcher.group(2)");
            float parseFloat2 = Float.parseFloat(group2);
            try {
                Result.a aVar = Result.Companion;
                setAspectRatio(parseFloat / parseFloat2);
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
    }

    private final void a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef3872", new Object[]{this, context, view});
            return;
        }
        String imageUrl = getImageUrl();
        if (view instanceof TUrlImageView) {
            ((TUrlImageView) view).enableSizeInLayoutParams(true);
        }
        Drawable a2 = com.alibaba.android.icart.core.performance.cache.b.a(imageUrl);
        setLocalImageDrawable(a2);
        setPlaceHolder(a2);
        if (a2 != null) {
            q.b(imageUrl, "imageUrl");
            b(context, imageUrl);
        }
        super.onRenderView(context, view);
    }

    private final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (!a()) {
        } else {
            bpa.b(context, str);
        }
    }

    private final void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (!a()) {
        } else {
            bpa.a(context, str);
        }
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        String userId = getUserId();
        if (userId == null) {
            return true;
        }
        return !n.b(userId, "disableAppear", false, 2, (Object) null) && (q.a((Object) "itemPic", (Object) userId) ^ true);
    }

    private final boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        Object tag = view.getTag(R.id.image_tag_url);
        if (tag instanceof String) {
            return q.a(tag, (Object) getImageUrl());
        }
        return false;
    }

    private final void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (view == null) {
        } else {
            try {
                view.setTag(R.id.image_tag_url, str);
            } catch (Exception e) {
                String message = e.getMessage();
                q.a((Object) message);
                bed.a("saveTagInfoWhenLoadSuccessError", message);
            }
        }
    }

    private final void d() {
        r C;
        DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null || (C = dXRuntimeContext.C()) == null || (b = C.b()) == null) {
            return;
        }
        b.b(dXRuntimeContext.s());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, event})).booleanValue();
        }
        q.d(event, "event");
        if (event instanceof DXImageWidgetNode.ImageLoadCompleteEvent) {
            String imageUrl = ((DXImageWidgetNode.ImageLoadCompleteEvent) event).getImageUrl();
            View view = this.f12884a;
            q.b(imageUrl, "imageUrl");
            a(view, imageUrl);
            View view2 = this.f12884a;
            if (view2 != null) {
                q.a(view2);
                Context context = view2.getContext();
                q.b(context, "mView!!.context");
                b(context, imageUrl);
            }
        }
        return super.onEvent(event);
    }

    private final boolean b(View view) {
        bbz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        if (!a(view) || (a2 = bdn.a(getDXRuntimeContext())) == null || a2.H() == null) {
            return false;
        }
        jny O = a2.O();
        q.b(O, "cartPresenter.dmContext");
        return O.e();
    }
}
