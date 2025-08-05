package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailAdaptiveTextViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailCommentTagsViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCategoryCoupon;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCouponConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXRichTextViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXSimpleTextViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXWrapTagViewConstructor;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamic.c;
import com.taobao.android.dinamic.d;
import com.taobao.android.dinamic.tempate.DTemplateManager;

/* loaded from: classes4.dex */
public class ear {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1657744787);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.DinamicUtils");
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("cb5c838c", new Object[0]) : d.a("detail");
    }

    public static DTemplateManager b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DTemplateManager) ipChange.ipc$dispatch("4141e5c7", new Object[0]) : DTemplateManager.a("detail");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            b().a(DTemplateManager.CacheStrategy.STRATEGY_ALLOW_VERSION_DEGRADE);
            c.a().a("detail", DetailAdaptiveTextViewConstructor.VIEW_TAG, new DetailAdaptiveTextViewConstructor());
            c.a().a("detail", DetailCommentTagsViewConstructor.VIEW_TAG, new DetailCommentTagsViewConstructor());
            c.a().a("detail", DetailXSimpleTextViewConstructor.VIEW_TAG, new DetailXSimpleTextViewConstructor());
            c.a().a("detail", DetailXRichTextViewConstructor.VIEW_TAG, new DetailXRichTextViewConstructor());
            c.a().a("detail", DetailXWrapTagViewConstructor.VIEW_TAG, new DetailXWrapTagViewConstructor());
            c.a().a("detail", DetailRichTextViewByCouponConstructor.VIEW_TAG, new DetailRichTextViewByCouponConstructor());
            c.a().a("detail", DetailRichTextViewByCategoryCoupon.VIEW_TAG, new DetailRichTextViewByCategoryCoupon());
            c.a().a("detail", eaw.PARSER_TAG, new eaw());
            c.a().a("detail", eav.PARSER_TAG, new eav());
            c.a().a("detail", eax.PARSER_TAG, new eax());
            c.a().a("detail", eau.PARSER_TAG, new eau());
            c.a().a("detail", "xTap", new eat());
            c.a().a("detail", "xCopy", new eas());
            c.a().a("detail", XCountDownConstructor.VIEW_TAG, new XCountDownConstructor());
        } catch (Throwable unused) {
            i.a("dinamic", "dinamic registe onFailure!");
        }
    }
}
