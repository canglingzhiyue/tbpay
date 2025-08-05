package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u001c\u0010\u0019\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0014J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTBVideoViewDowngradeToImageWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXImageWidgetNode;", "()V", "DXTBVIDEOVIEW_COVERURL", "", "getDXTBVIDEOVIEW_COVERURL", "()J", "DXTBVIDEOVIEW_ICONURL", "getDXTBVIDEOVIEW_ICONURL", "coverUrl", "", "iconUrl", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "object", "", "onClone", "", "widgetNode", "deepClone", "", "onCreateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "onRenderView", "weakView", "onSetStringAttribute", "key", "attr", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public class kjl extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final long e = -5605490048558005197L;

    /* renamed from: a  reason: collision with root package name */
    private final long f30119a = 1756289496339923034L;
    private final long b = 4951885508200836195L;
    private String c;
    private String d;

    public static /* synthetic */ Object ipc$super(kjl kjlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTBVideoViewDowngradeToImageWidgetNode$Companion;", "", "()V", "DXTBVIDEOVIEW_TBVIDEOVIEW", "", "getDXTBVIDEOVIEW_TBVIDEOVIEW", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : kjl.a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kjl();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        q.d(widgetNode, "widgetNode");
        if (!(widgetNode instanceof kjl)) {
            return;
        }
        super.onClone(widgetNode, z);
        kjl kjlVar = (kjl) widgetNode;
        this.c = kjlVar.c;
        this.d = kjlVar.d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(tUrlImageView);
        int a2 = gbg.a(context, 54.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 17;
        tUrlImageView2.setLayoutParams(layoutParams);
        frameLayout.addView(tUrlImageView2);
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof FrameLayout)) {
        } else {
            FrameLayout frameLayout = (FrameLayout) view;
            View childAt = frameLayout.getChildAt(0);
            if (!(childAt instanceof TUrlImageView)) {
                childAt = null;
            }
            TUrlImageView tUrlImageView = (TUrlImageView) childAt;
            if (tUrlImageView != null) {
                setImageScaleType(tUrlImageView, getScaleType());
                tUrlImageView.setImageUrl(this.c);
            }
            View childAt2 = frameLayout.getChildAt(1);
            if (!(childAt2 instanceof TUrlImageView)) {
                childAt2 = null;
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) childAt2;
            if (tUrlImageView2 == null) {
                return;
            }
            tUrlImageView2.setImageUrl(this.d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == this.f30119a) {
            this.c = attr;
        } else if (j == this.b) {
            this.d = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }
}
