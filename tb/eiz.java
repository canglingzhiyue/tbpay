package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.TBAsyncTask;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class eiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27337a = false;

    static {
        kge.a(58060009);
    }

    public static /* synthetic */ DXWidgetNode a(eiz eizVar, ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("7fa2baa", new Object[]{eizVar, viewGroup, str}) : eizVar.a(viewGroup, str);
    }

    public static /* synthetic */ boolean a(eiz eizVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73ff8505", new Object[]{eizVar, viewGroup})).booleanValue() : eizVar.a(viewGroup);
    }

    public eiz() {
        emu.a("com.taobao.android.detail.core.presale.AutoShowCouponDialogManager");
    }

    private boolean a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            return "true".equals(data.getQueryParameter("autoShowCouponFloatPage"));
        }
        return false;
    }

    private boolean b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e6c7d6", new Object[]{this, detailCoreActivity})).booleanValue();
        }
        try {
            return ((FeatureNode) detailCoreActivity.y().t.f10055a.b("feature", FeatureNode.class)).autoShowCouponFloatPage;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean c(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39317cb5", new Object[]{this, detailCoreActivity})).booleanValue();
        }
        try {
            return ((FeatureNode) detailCoreActivity.y().t.f10055a.b("feature", FeatureNode.class)).forbiddenShowCouponFloatPage;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "autoShowCouponFloatPage", "true"));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean a(DetailCoreActivity detailCoreActivity) {
        dya y;
        f f;
        final DetailRecyclerView e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349c12f7", new Object[]{this, detailCoreActivity})).booleanValue();
        }
        if (detailCoreActivity == null || c(detailCoreActivity) || !a(detailCoreActivity.getIntent()) || !b(detailCoreActivity) || !a() || (y = detailCoreActivity.y()) == null || (f = y.f()) == null || (e = f.e()) == null) {
            return false;
        }
        e.postDelayed(new Runnable() { // from class: tb.eiz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    eiz.a(eiz.this, e);
                }
            }
        }, 100L);
        return true;
    }

    private boolean a(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a1860ab", new Object[]{this, viewGroup})).booleanValue();
        }
        if (this.f27337a) {
            return false;
        }
        new TBAsyncTask<Void, Void, DXWidgetNode>() { // from class: tb.eiz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.async.TBAsyncTask
            public DXWidgetNode a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (DXWidgetNode) ipChange2.ipc$dispatch("a726d873", new Object[]{this, voidArr});
                }
                try {
                    return eiz.a(eiz.this, viewGroup, "first_cart_coupons");
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.taobao.android.detail.core.async.TBAsyncTask
            public void a(DXWidgetNode dXWidgetNode) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
                } else if (dXWidgetNode == null) {
                } else {
                    dXWidgetNode.postEvent(new DXEvent(18903999933159L));
                }
            }
        }.a(TBAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        this.f27337a = true;
        return true;
    }

    private DXWidgetNode a(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("4c6685d0", new Object[]{this, viewGroup, str});
        }
        if (viewGroup == null || StringUtils.isEmpty(str)) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        DXWidgetNode dXWidgetNode = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                DXWidgetNode expandWidgetNode = ((DXRootView) childAt).getExpandWidgetNode();
                if (expandWidgetNode != null) {
                    dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(str);
                }
            } else if (childAt instanceof ViewGroup) {
                dXWidgetNode = a((ViewGroup) childAt, str);
            }
            if (dXWidgetNode != null) {
                return dXWidgetNode;
            }
        }
        return null;
    }
}
