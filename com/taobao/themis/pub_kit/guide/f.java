package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.utils.k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRecommendCloseGuide;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mHasShow", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPopWindow", "Landroid/widget/PopupWindow;", "canShow", "", "show", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/View;", "Companion", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f22795a;
    private final AtomicBoolean b;
    private final Context c;

    static {
        kge.a(-1294613049);
        Companion = new a(null);
    }

    public f(Context mContext) {
        q.d(mContext, "mContext");
        this.c = mContext;
        this.f22795a = new PopupWindow(this.c);
        this.b = new AtomicBoolean(false);
    }

    public final boolean a(View parent) {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, parent})).booleanValue();
        }
        q.d(parent, "parent");
        if (a() && (inflate = View.inflate(this.c, R.layout.tms_pub_recommend_close_tips_layout, null)) != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.tvMainText);
            if (textView != null) {
                textView.setText("可以随时将频道添加到首页哦");
            }
            if (inflate != null) {
                PopupWindow popupWindow = this.f22795a;
                popupWindow.setContentView(inflate);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.setOutsideTouchable(false);
                popupWindow.setFocusable(false);
                popupWindow.setHeight(k.a(this.c, 41.15f));
                popupWindow.setWidth(k.a(this.c, 193.0f));
                Rect rect = new Rect();
                parent.getGlobalVisibleRect(rect);
                try {
                    TMSLogger.a("PubRecommendCloseGuide", "show PubRecommendCloseGuide");
                    this.f22795a.getContentView().measure(0, 0);
                    this.f22795a.showAtLocation(parent, 53, 22, rect.bottom);
                    com.taobao.themis.kernel.utils.a.a(new PubRecommendCloseGuide$show$2(this), 3 * 1000);
                } catch (Exception e) {
                    TMSLogger.b("PubRecommendCloseGuide", "showAsDropDown: ", e);
                }
                this.b.set(true);
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Context context = this.c;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.d("PubRecommendCloseGuide", "environment illegality");
            return false;
        } else if (!this.b.get()) {
            return true;
        } else {
            TMSLogger.d("PubRecommendCloseGuide", "already showed");
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRecommendCloseGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(628778063);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
