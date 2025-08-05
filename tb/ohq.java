package tb;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.o;
import com.taobao.tao.homepage.f;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.ArrayList;
import mtopsdk.common.util.MtopUtils;

/* loaded from: classes7.dex */
public class ohq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DXRootView f32068a;
    private View b;
    private JSONObject c;

    static {
        kge.a(-151870426);
    }

    public void a(Context context, FrameLayout frameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3a4b6d", new Object[]{this, context, frameLayout, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("template")) {
            e.e("GuideViewWidgetNode", "secondFloor data has no template info.");
        } else {
            this.c = jSONObject;
            frameLayout.removeAllViews();
            DinamicXEngine b = f.a().b();
            DXTemplateItem e = o.a(jSONObject.getJSONObject("template")).e();
            DXTemplateItem a2 = b.a(e);
            if (a2 != null) {
                this.f32068a = b.a(context, a2).f11780a;
                frameLayout.addView(this.f32068a);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(e);
            b.a(arrayList);
            DXRootView dXRootView = this.f32068a;
            if (dXRootView != null) {
                b.a(dXRootView, jSONObject);
            }
            this.b = frameLayout;
        }
    }

    public void a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8961210", new Object[]{this, refreshState, refreshState2});
            return;
        }
        if (refreshState == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH && refreshState2 == TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR) {
            b();
            a(this.c);
            e.e("GuideViewWidgetNode", "设置引导条可见");
        }
        if (refreshState != TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR) {
            return;
        }
        a();
        e.e("GuideViewWidgetNode", "新状态是要进入二楼了，设置引导条不可见");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            e.e("GuideViewWidgetNode", "hideTemplate mGuideView == null");
            return;
        }
        view.clearAnimation();
        this.b.setVisibility(4);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            e.e("GuideViewWidgetNode", "mGuideView == null");
            return;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1500L);
        alphaAnimation.setInterpolator(MtopUtils.getContext(), 17563659);
        this.b.setAnimation(alphaAnimation);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            kss.a(jSONObject, jSONObject.getJSONObject("item"));
        }
    }
}
