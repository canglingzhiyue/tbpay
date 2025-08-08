package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.ext.b;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class tjj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tjk f34151a;
    private tiq b;
    private ViewGroup c;

    static {
        kge.a(1397042775);
    }

    public tjj(tiq tiqVar) {
        this.b = tiqVar;
        this.f34151a = new tjk(tiqVar);
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else if (frameLayout == null) {
            stv.a("RenderManager", "render: container is null.");
        } else {
            this.c = frameLayout;
            this.f34151a.e();
            b(frameLayout);
            if (!a(this.b)) {
                return;
            }
            View a2 = this.f34151a.a();
            b.a(this.b.d().i(), this.b.c());
            if (a2 == null) {
                z = false;
            }
            tjo.a(z, this.b);
            if (a2 == null) {
                stv.a("RenderManager", "render: render view null.");
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(a2, layoutParams);
            if (a2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) a2;
                int i2 = 0;
                while (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        i2 = Math.max(i2, childAt.getLayoutParams().height);
                    }
                    i++;
                }
                i = i2;
            }
            if (i <= 0) {
                return;
            }
            layoutParams.height = i;
            frameLayout.updateViewLayout(a2, layoutParams);
        }
    }

    private void b(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b9fec", new Object[]{this, frameLayout});
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(R.id.ll_close);
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = stt.a(23.0f);
                layoutParams.width = stt.a(75.0f);
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!"commercialAdVideo".equals(this.b.d().b().bizType)) {
                return;
            }
            ImageView a2 = this.b.b().a();
            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            for (int childCount = viewGroup2.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup2.getChildAt(childCount);
                stv.a("RenderManager", "adapterBootImage: coverContainer child " + childCount + " = " + childAt);
                viewGroup2.removeView(childAt);
                if (childAt != a2) {
                    frameLayout2.addView(childAt);
                }
            }
            frameLayout2.addView(a2, new ViewGroup.LayoutParams(-1, -1));
            viewGroup2.addView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        } catch (Throwable th) {
            stv.a("RenderManager", "adapterBootImage error ", th);
        }
    }

    public static boolean a(tiq tiqVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8318c0", new Object[]{tiqVar})).booleanValue();
        }
        try {
            e = tiqVar.d().e();
        } catch (Throwable th) {
            stv.a("RenderManager", "isUseDX error ", th);
        }
        if (e != null && e.size() != 0 && e.containsKey("dxTemplateName")) {
            String string = e.getString("dxTemplateName");
            stv.a("RenderManager", "isUseDX dxTemplateName = " + string);
            return !StringUtils.isEmpty(string);
        }
        stv.a("RenderManager", "isUseDX bizData not valid, splashData=" + tiqVar.d().d());
        return false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f34151a.c();
        }
    }

    public tjk b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tjk) ipChange.ipc$dispatch("16bca068", new Object[]{this}) : this.f34151a;
    }

    public ViewGroup c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this}) : this.c;
    }
}
