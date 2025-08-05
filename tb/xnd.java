package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.bm;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes7.dex */
public class xnd extends bm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2039336137);
    }

    public static /* synthetic */ Object ipc$super(xnd xndVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -322438727) {
            if (hashCode == -303753557) {
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            } else if (hashCode != 1327675976) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            }
        }
        return super.buildSimpleImageOption();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode
    public DXImageWidgetNode.d buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXImageWidgetNode.d) ipChange.ipc$dispatch("ecc7f9b9", new Object[]{this});
        }
        DXImageWidgetNode.d buildSimpleImageOption = super.buildSimpleImageOption();
        if (buildSimpleImageOption != null) {
            ImageStrategyConfig a2 = onq.a(getImageUrl(), lfx.GUESS_IMAGE_STRATEGY_CONFIG);
            if (a2 != null) {
                buildSimpleImageOption.e = a2.d();
                buildSimpleImageOption.f = a2.e();
            }
            buildSimpleImageOption.J = onq.a(getImageUrl(), (String) null);
        }
        return buildSimpleImageOption;
    }

    @Override // com.taobao.android.dinamicx.widget.bm, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (view instanceof TUrlImageView) {
            onq.a((TUrlImageView) view, getImageUrl(), null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
        }
        a(true);
        super.onRenderView(context, view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() == 5288671110273408574L) {
            a(true);
        } else if (dXEvent.getEventId() == 5388973340095122049L) {
            a(false);
        }
        return super.onEvent(dXEvent);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!j.a("enableHomePageJumpToNextPageCostOpt", true) || !a(getImageUrl())) {
        } else {
            View nativeView = getNativeView();
            if (!(nativeView instanceof TUrlImageView)) {
                return;
            }
            if (z && nativeView.getTag(R.id.tag_image_view_predraw_listener) == null) {
                ohx ohxVar = new ohx((TUrlImageView) nativeView);
                nativeView.getViewTreeObserver().addOnPreDrawListener(ohxVar);
                nativeView.setTag(R.id.tag_image_view_predraw_listener, ohxVar);
            }
            if (z || nativeView.getTag(R.id.tag_image_view_predraw_listener) == null) {
                return;
            }
            nativeView.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) nativeView.getTag(R.id.tag_image_view_predraw_listener));
            nativeView.setTag(R.id.tag_image_view_predraw_listener, null);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String lowerCase = str != null ? str.toLowerCase() : "";
        return lowerCase.endsWith(".gif") || lowerCase.endsWith(".webp") || lowerCase.endsWith(".apng");
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2112480014);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new xnd();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.bm, com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new xnd();
    }
}
