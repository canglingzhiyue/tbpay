package tb;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;

/* loaded from: classes6.dex */
public class jxg implements ViewPager.PageTransformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f29846a;

    static {
        kge.a(187708782);
        kge.a(941956907);
    }

    public jxg(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f29846a = 1.0f;
            return;
        }
        try {
            this.f29846a = Float.parseFloat(jSONObject.getString("scale"));
        } catch (Exception e) {
            g.a(e);
        }
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f29846a < 0.0f) {
            throw new IllegalArgumentException("scale must be positive");
        }
    }

    @Override // android.support.v4.view.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
            return;
        }
        float f2 = this.f29846a;
        float f3 = 1.0f - f2;
        if (f < -1.0f) {
            view.setScaleX(f2);
            view.setScaleY(this.f29846a);
        } else if (f <= 0.0f) {
            float f4 = (f * f3) + 1.0f;
            view.setScaleX(f4);
            view.setScaleY(f4);
        } else if (f <= 1.0f) {
            float f5 = 1.0f - (f * f3);
            view.setScaleX(f5);
            view.setScaleY(f5);
        } else {
            view.setScaleX(f2);
            view.setScaleY(this.f29846a);
        }
    }
}
