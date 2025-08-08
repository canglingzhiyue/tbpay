package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.mytaobao.pop.bean.MTBIconLocalIndexProtocol;
import com.taobao.mytaobao.pop.bean.MTBIconPixelInfoBean;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes7.dex */
public class mvt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private mwp f31288a;
    private mvr b;
    private Animator c;

    static {
        kge.a(-182942480);
    }

    public static /* synthetic */ View a(mvt mvtVar, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d0016384", new Object[]{mvtVar, dXWidgetNode}) : mvtVar.a(dXWidgetNode);
    }

    public static /* synthetic */ mwp a(mvt mvtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mwp) ipChange.ipc$dispatch("8c58db93", new Object[]{mvtVar}) : mvtVar.f31288a;
    }

    public static /* synthetic */ void a(mvt mvtVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a500a5", new Object[]{mvtVar, view});
        } else {
            mvtVar.a(view);
        }
    }

    public static /* synthetic */ void a(mvt mvtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedd1b97", new Object[]{mvtVar, str});
        } else {
            mvtVar.c(str);
        }
    }

    public static /* synthetic */ mvr b(mvt mvtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvr) ipChange.ipc$dispatch("73faae6f", new Object[]{mvtVar}) : mvtVar.b;
    }

    public MTBIconPixelInfoBean a(String str) {
        mvr mvrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("9d781f14", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || this.f31288a == null || (mvrVar = this.b) == null) {
            return new MTBIconPixelInfoBean();
        }
        MTBIconLocalIndexProtocol a2 = mvrVar.a(str);
        if (a2 == null) {
            return new MTBIconPixelInfoBean();
        }
        if (a2.moduleTag != null && a2.moduleTag.startsWith("basementTip")) {
            return b(a2);
        }
        return a(a2);
    }

    private MTBIconPixelInfoBean a(MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("b31ca685", new Object[]{this, mTBIconLocalIndexProtocol});
        }
        String str = mTBIconLocalIndexProtocol.nodeId;
        if (StringUtils.isEmpty(str)) {
            return new MTBIconPixelInfoBean();
        }
        DXWidgetNode findWidgetNodeByUserId = this.f31288a.findWidgetNodeByUserId(str);
        if (findWidgetNodeByUserId == null) {
            return new MTBIconPixelInfoBean();
        }
        View a2 = a(findWidgetNodeByUserId);
        if (a2 == null) {
            return new MTBIconPixelInfoBean();
        }
        return this.b.a(a2);
    }

    private MTBIconPixelInfoBean b(MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol) {
        JSONObject findWeexNodeLocal;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("820444c6", new Object[]{this, mTBIconLocalIndexProtocol});
        }
        MTBIconPixelInfoBean mTBIconPixelInfoBean = new MTBIconPixelInfoBean();
        Pair<Rect, Boolean> findBasementLocalInWindow = this.f31288a.findBasementLocalInWindow();
        String str = mTBIconLocalIndexProtocol.nodeId;
        if (findBasementLocalInWindow == null || StringUtils.isEmpty(str) || (findWeexNodeLocal = this.f31288a.findWeexNodeLocal(mTBIconLocalIndexProtocol.nodeId)) == null) {
            return mTBIconPixelInfoBean;
        }
        Rect rect = (Rect) findBasementLocalInWindow.first;
        if (((Boolean) findBasementLocalInWindow.second).booleanValue()) {
            mTBIconPixelInfoBean.setFindIcon(true);
            int intValue = findWeexNodeLocal.getIntValue("x");
            int intValue2 = findWeexNodeLocal.getIntValue("y");
            mTBIconPixelInfoBean.centerX2rpx = intValue;
            mTBIconPixelInfoBean.centerY2rpx = mxq.a(rect.top) + intValue2;
        }
        return mTBIconPixelInfoBean;
    }

    private View a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb35c849", new Object[]{this, dXWidgetNode});
        }
        WeakReference<View> wRView = dXWidgetNode.getWRView();
        if (wRView == null) {
            return null;
        }
        return wRView.get();
    }

    public void b(String str) {
        mvr mvrVar;
        final MTBIconLocalIndexProtocol a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || this.f31288a == null || (mvrVar = this.b) == null || (a2 = mvrVar.a(str)) == null) {
        } else {
            this.f31288a.getRootView().postDelayed(new Runnable() { // from class: tb.mvt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DXWidgetNode findWidgetNodeByUserId;
                    View a3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (mvt.a(mvt.this) == null || mvt.b(mvt.this) == null) {
                    } else {
                        String str2 = a2.nodeId;
                        if (StringUtils.isEmpty(str2) || (findWidgetNodeByUserId = mvt.a(mvt.this).findWidgetNodeByUserId(str2)) == null || (a3 = mvt.a(mvt.this, findWidgetNodeByUserId)) == null) {
                            return;
                        }
                        if (a2.moduleTag == null || !a2.moduleTag.contains("basementTip")) {
                            mvt.a(mvt.this, a3);
                        } else {
                            mvt.a(mvt.this, a2.nodeId);
                        }
                    }
                }
            }, 600L);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.f31288a == null || str == null) {
        } else {
            TLog.loge("mytaobao", "notify weex zoom animation");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabItemId", (Object) str);
            jSONObject.put("uuid", (Object) UUID.randomUUID());
            this.f31288a.a("notifyTabItemZoom", jSONObject);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.3f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.3f, 1.0f));
        animatorSet.setDuration(700L);
        animatorSet.start();
        this.c = animatorSet;
    }

    public void a(mwp mwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5560112", new Object[]{this, mwpVar});
        } else {
            this.f31288a = mwpVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f31288a = null;
        Animator animator = this.c;
        if (animator == null) {
            return;
        }
        animator.cancel();
        this.c = null;
    }

    public void a(mvr mvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f548d24f", new Object[]{this, mvrVar});
        } else {
            this.b = mvrVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
