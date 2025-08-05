package tb;

import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_uikit.widget.text.i;
import com.taobao.android.weex_uikit.widget.text.k;

/* loaded from: classes6.dex */
public class jxf extends MetricAffectingSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f29845a;
    private final int b;
    private final String c;

    static {
        kge.a(1519532369);
    }

    public jxf(int i, int i2, String str) {
        this.f29845a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else if (Build.VERSION.SDK_INT < 28 && !j.a()) {
            try {
                i.a().a(textPaint, this.c, this.f29845a, this.b);
            } catch (Exception e) {
                g.a(e);
            }
        } else {
            k.b(textPaint, this.b, this.f29845a, this.c);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77906dc3", new Object[]{this, textPaint});
        } else if (Build.VERSION.SDK_INT < 28 && !j.a()) {
            try {
                i.a().a(textPaint, this.c, this.f29845a, this.b);
            } catch (Exception e) {
                g.a(e);
            }
        } else {
            k.b(textPaint, this.b, this.f29845a, this.c);
        }
    }
}
