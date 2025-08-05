package tb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.h;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class tqm extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POSTHEIGHTANIM = -2398747359691505742L;

    /* renamed from: a */
    private static volatile Set<String> f34277a = new HashSet(4);

    public static /* synthetic */ Object ipc$super(tqm tqmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$9lRMVX40ZnNybIPP8gGl0kahX6A(View view, View view2, ValueAnimator valueAnimator) {
        a(view, view2, valueAnimator);
    }

    public static /* synthetic */ Set a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[0]) : f34277a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e2, code lost:
        if (r5 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
        r4.setInterpolator(new android.view.animation.LinearInterpolator());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ed, code lost:
        r4.setInterpolator(new android.view.animation.DecelerateInterpolator());
     */
    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r17, java.lang.Object[] r18, com.taobao.android.dinamicx.DXRuntimeContext r19) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqm.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    public static /* synthetic */ void a(View view, View view2, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a50840c", new Object[]{view, view2, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.getLayoutParams().height = intValue;
        view.requestLayout();
        view2.getLayoutParams().height = intValue;
        view2.requestLayout();
        view2.invalidate();
    }

    private int a(DinamicXEngine dinamicXEngine, Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("534c087", new Object[]{this, dinamicXEngine, context, new Integer(i)})).intValue() : dinamicXEngine != null ? gbg.a(dinamicXEngine, context, i) : gbg.b(context, i);
    }
}
