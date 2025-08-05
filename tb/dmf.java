package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dmf extends dmg<ObjectAnimator, ObjectAnimator> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c = "translationY";

    static {
        kge.a(-1485251942);
    }

    @Override // tb.dlz
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "translationY";
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.animation.ObjectAnimator, android.animation.Animator] */
    @Override // tb.dmg
    public /* synthetic */ ObjectAnimator c(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("4c25ddcb", new Object[]{this, view}) : b(view);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.animation.ObjectAnimator, android.animation.Animator] */
    @Override // tb.dmg
    public /* synthetic */ ObjectAnimator d(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("8fb0fb8c", new Object[]{this, view}) : a(view);
    }

    public ObjectAnimator a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("706a320a", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float translationY = view.getTranslationY() - view.getHeight();
        float translationY2 = view.getTranslationY();
        this.f26845a = new float[]{iArr[1] + translationY, iArr[1] + translationY2};
        return ObjectAnimator.ofFloat(view, "translationY", translationY, translationY2);
    }

    public ObjectAnimator b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("95fe3b0b", new Object[]{this, view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.b = new float[]{iArr[1] + view.getTranslationY(), (iArr[1] + view.getTranslationY()) - view.getHeight()};
        return ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), view.getTranslationY() - view.getHeight());
    }
}
