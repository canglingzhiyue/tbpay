package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class fzk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUNC_EASE = 4;
    public static final int FUNC_EASE_IN = 1;
    public static final int FUNC_EASE_IN_OUT = 3;
    public static final int FUNC_EASE_OUT = 2;
    public static final int FUNC_LINEAR = 0;
    public static final int PROP_BACKGROUND_COLOR = 2;
    public static final int PROP_OPACITY = 1;
    public static final int PROP_TRANSFORM = 0;

    static {
        kge.a(2086734820);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f28238a;
        public final long b;
        public final long c;
        public final int d;

        static {
            kge.a(799260472);
        }

        public a(int i, long j, long j2, int i2) {
            this.f28238a = i;
            this.b = j;
            this.c = j2;
            this.d = i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TransitionProp{prop=" + this.f28238a + ", delayInMs=" + this.b + ", durationInMs=" + this.c + ", func=" + this.d + '}';
        }
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            throw new IllegalArgumentException("Invalid Transition prop: " + str);
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1267206133) {
            if (hashCode != 605322756) {
                if (hashCode == 1052666732 && str.equals("transform")) {
                    c = 0;
                }
            } else if (str.equals("background-color")) {
                c = 2;
            }
        } else if (str.equals("opacity")) {
            c = 1;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid Transition prop: " + str);
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 4;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c = 1;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c = 2;
                    break;
                }
                break;
            case 3105774:
                if (str.equals("ease")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        return c != 3 ? 0 : 4;
    }

    public static List<a> a(String str, String str2, String str3, String str4, String str5) {
        long j;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21e4b8ad", new Object[]{str, str2, str3, str4, str5});
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        String[] strArr = null;
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (!isEmpty) {
            String[] split = str.split(",");
            LinkedList linkedList = new LinkedList();
            for (String str6 : split) {
                String[] split2 = str6.trim().split("\\s");
                if (split2.length != 3) {
                    throw new IllegalArgumentException("split by space array's length != 3");
                }
                linkedList.add(new a(a(split2[0].trim()), 0L, c(split2[1].trim()), b(split2[2].trim())));
            }
            return linkedList;
        } else if (TextUtils.isEmpty(str3)) {
            return null;
        } else {
            String[] split3 = str2.split(",");
            String[] split4 = str3.split(",");
            String[] split5 = TextUtils.isEmpty(str4) ? null : str4.split(",");
            String[] split6 = TextUtils.isEmpty(str5) ? null : str5.split(",");
            if (split4.length != 1 && split4.length != split3.length) {
                return null;
            }
            if (split5 != null && split5.length != 1 && split5.length != split3.length) {
                split5 = null;
            }
            if (split6 == null || split6.length == 1 || split6.length == split3.length) {
                strArr = split6;
            }
            LinkedList linkedList2 = new LinkedList();
            for (int i2 = 0; i2 < split3.length; i2++) {
                int a2 = a(split3[i2].trim());
                long c = c((split4.length != split3.length ? split4[0] : split4[i2]).trim());
                if (split5 != null) {
                    j = c((split5.length != split3.length ? split5[0] : split5[i2]).trim());
                } else {
                    j = 0;
                }
                long j2 = j;
                if (strArr != null) {
                    i = b((strArr.length != split3.length ? strArr[0] : strArr[i2]).trim());
                } else {
                    i = 0;
                }
                linkedList2.add(new a(a2, j2, c, i));
            }
            return linkedList2;
        }
    }

    private static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        if (str.endsWith("ms")) {
            return Float.parseFloat(str.substring(0, str.length() - 2));
        }
        if (str.endsWith("s")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) * 1000.0f;
        }
        throw new IllegalArgumentException("Invalid transition time: " + str);
    }

    public static Interpolator a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("febc8630", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
        }
        if (i == 2) {
            return PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        }
        if (i == 3) {
            return PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);
        }
        if (i == 4) {
            return PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
        }
        return new LinearInterpolator();
    }

    public static List<Animator> a(List<a> list, final View view, final float f, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("869076eb", new Object[]{list, view, new Float(f), new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            boolean z = false;
            loop0: while (true) {
                boolean z2 = false;
                for (a aVar : list) {
                    int i2 = aVar.f28238a;
                    if (i2 != 1) {
                        if (i2 == 2 && !z2) {
                            final int i3 = 16777215;
                            if (view.getBackground() instanceof ColorDrawable) {
                                i3 = ((ColorDrawable) view.getBackground()).getColor();
                            }
                            if (i == i3) {
                                break;
                            }
                            ValueAnimator a2 = a(aVar);
                            a2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.fzk.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                        return;
                                    }
                                    try {
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        if (floatValue == 0.0f) {
                                            return;
                                        }
                                        int red = Color.red(i3);
                                        int green = Color.green(i3);
                                        int blue = Color.blue(i3);
                                        int alpha = Color.alpha(i3);
                                        view.setBackgroundColor(Color.argb((int) (alpha + ((Color.alpha(i) - alpha) * floatValue)), (int) (red + ((Color.red(i) - red) * floatValue)), (int) (green + ((Color.green(i) - green) * floatValue)), (int) (blue + ((Color.blue(i) - blue) * floatValue))));
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                            a2.addListener(new Animator.AnimatorListener() { // from class: tb.fzk.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationRepeat(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationStart(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                    } else {
                                        view.setBackgroundColor(i);
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                                    } else {
                                        view.setBackgroundColor(i);
                                    }
                                }
                            });
                            arrayList.add(a2);
                            z2 = true;
                        }
                    } else if (!z) {
                        final float alpha = view.getAlpha();
                        if (Float.compare(alpha, f) == 0) {
                            z = false;
                        } else {
                            ValueAnimator a3 = a(aVar);
                            a3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.fzk.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                        return;
                                    }
                                    try {
                                        view.setAlpha(alpha + ((f - alpha) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                            a3.addListener(new Animator.AnimatorListener() { // from class: tb.fzk.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationRepeat(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationStart(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                    } else {
                                        view.setAlpha(f);
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                                    } else {
                                        view.setAlpha(f);
                                    }
                                }
                            });
                            arrayList.add(a3);
                            z = true;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static ValueAnimator a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("f0f792a8", new Object[]{aVar});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(aVar.c);
        ofFloat.setStartDelay(aVar.b);
        ofFloat.setInterpolator(a(aVar.d));
        return ofFloat;
    }
}
