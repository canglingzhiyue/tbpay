package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.purchase.aura.utils.e;
import com.taobao.android.purchase.preload.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.arc;
import tb.ifz;

/* loaded from: classes6.dex */
public class mqm extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ID = 7700670404894374791L;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f31198a;

    public static /* synthetic */ Object ipc$super(mqm mqmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1814733277) {
            if (hashCode != -303753557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        return super.onCreateView((Context) objArr[0]);
    }

    static {
        kge.a(-1866303137);
        f31198a = "true".equals(e.a("renderWithCacheImage", "true"));
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new mqm();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        String imageUrl = getImageUrl();
        if (f31198a) {
            z = a(imageUrl, view);
        }
        if (baw.a() && z) {
            arc.a().a("缓存命中", arc.a.a().a("AURA/performance").b());
        }
        if (z) {
            return;
        }
        super.onRenderView(context, view);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : "88001".equals(str) || "88002".equals(str);
    }

    private boolean a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6198cb64", new Object[]{this, str, view})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !a.b()) {
            return false;
        }
        Drawable a2 = a.a(str);
        boolean z = a2 != null && (view instanceof TUrlImageView);
        if (z) {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            tUrlImageView.setAutoRelease(false);
            tUrlImageView.enableSizeInLayoutParams(true);
            setLocalImage(tUrlImageView, a2);
            setPlaceHolder(a2);
        } else if (baw.a() && !a.c(str)) {
            ard a3 = arc.a();
            a3.a("【下单小图】缓存未命中URL：" + str, arc.a.a().a("AURA/performance").b());
        }
        if (!a(getUserId())) {
            ifz.a(ifz.a.b("smallPicturePreloadHit").c(z ? "命中缓存" : "未命中缓存").c("c1", a.b(str)).a(z).a(0.001f));
        }
        return z;
    }
}
