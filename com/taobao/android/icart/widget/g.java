package com.taobao.android.icart.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.abj;
import tb.akg;
import tb.bbz;
import tb.bdn;
import tb.bed;
import tb.bpa;
import tb.kge;
import tb.mto;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes5.dex */
public class g extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXIMAGEVIEW_IMAGEVIEW = 7700670404894374791L;
    public static final Pattern b;

    /* renamed from: a  reason: collision with root package name */
    private View f12881a;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
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

    static {
        kge.a(694009691);
        b = Pattern.compile("-([0-9]+)-([0-9]+)\\.(jpg|jpeg|gif|apng|png|webp)$");
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        this.f12881a = view;
        if (view == null) {
            bed.a("DXImageWidgetNode#ImageViewIsNull", "图片组件View为null");
            return;
        }
        String imageUrl = getImageUrl();
        b(context, imageUrl);
        if (b(view)) {
            a(context, imageUrl);
            return;
        }
        a(context, view);
        if (!d()) {
            return;
        }
        a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.d buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.d) ipChange.ipc$dispatch("ecc7f9b9", new Object[]{this});
        }
        DXImageWidgetNode.d buildSimpleImageOption = super.buildSimpleImageOption();
        if (e() && akg.b()) {
            buildSimpleImageOption.e = "carts_001";
            buildSimpleImageOption.f = TaobaoMediaPlayer.FFP_PROP_INT64_ENABLE_AUDIO_CLIP;
        }
        return buildSimpleImageOption;
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

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (getAspectRatio() > mto.a.GEO_NOT_SUPPORT || getLayoutWidth() > 0 || getLayoutWidth() == -1) {
        } else {
            String imageUrl = getImageUrl();
            if (TextUtils.isEmpty(imageUrl)) {
                return;
            }
            Matcher matcher = b.matcher(imageUrl);
            if (!matcher.find()) {
                return;
            }
            setAspectRatio(Float.parseFloat(matcher.group(1)) / Float.parseFloat(matcher.group(2)));
        }
    }

    private void a(Context context, View view) {
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
            a(context, imageUrl);
        }
        super.onRenderView(context, view);
    }

    private void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (!e()) {
        } else {
            bpa.b(context, str);
        }
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (!e()) {
        } else {
            bpa.a(context, str);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String userId = getUserId();
        if (userId == null) {
            return true;
        }
        return !userId.startsWith("disableAppear") && !"itemPic".equals(userId);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : "disableAppearItemPic".equals(getUserId()) || "itemPic".equals(getUserId());
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        Object tag = view.getTag(R.id.image_tag_url);
        if (tag instanceof String) {
            return tag.equals(getImageUrl());
        }
        return false;
    }

    private void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (view == null) {
        } else {
            try {
                view.setTag(R.id.image_tag_url, str);
            } catch (Exception e) {
                bed.a("saveTagInfoWhenLoadSuccessError", e.getMessage());
            }
        }
    }

    private void a() {
        r C;
        DinamicXEngine b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null || (C = dXRuntimeContext.C()) == null || (b2 = C.b()) == null) {
            return;
        }
        b2.b(dXRuntimeContext.s());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent instanceof DXImageWidgetNode.ImageLoadCompleteEvent) {
            String imageUrl = ((DXImageWidgetNode.ImageLoadCompleteEvent) dXEvent).getImageUrl();
            a(this.f12881a, imageUrl);
            View view = this.f12881a;
            if (view != null) {
                a(view.getContext(), imageUrl);
            }
        }
        return super.onEvent(dXEvent);
    }

    private boolean b(View view) {
        bbz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        if (a(view) && (a2 = bdn.a(getDXRuntimeContext())) != null && a2.H() != null) {
            return a2.O().e();
        }
        return false;
    }
}
