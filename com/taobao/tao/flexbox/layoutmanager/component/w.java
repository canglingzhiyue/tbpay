package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.v;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.odx;

/* loaded from: classes8.dex */
public class w extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FOLD_TRANSLATION = 1;
    public static final int MSG_FOLD = 1;
    public static final int MSG_UNFOLD = 2;
    public static final int UNFOLD_TRANSLATION = 2;
    private static HashMap<ab, HashMap<String, w>> e;

    /* renamed from: a  reason: collision with root package name */
    private int f20203a;
    private int b;
    private v c;
    private int d;
    private List<a> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, int i2, int i3, boolean z);
    }

    public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc0d44ce", new Object[]{wVar})).intValue() : wVar.b;
    }

    public static /* synthetic */ int a(w wVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c59bc97b", new Object[]{wVar, new Integer(i)})).intValue();
        }
        wVar.d = i;
        return i;
    }

    public static /* synthetic */ int b(w wVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6d21c5a", new Object[]{wVar, new Integer(i)})).intValue();
        }
        wVar.f20203a = i;
        return i;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    static {
        kge.a(982489839);
        e = new HashMap<>();
    }

    public static w a(ab abVar, Component component, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("6c247a86", new Object[]{abVar, component, strArr});
        }
        HashMap<String, w> hashMap = e.get(abVar);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            e.put(abVar, hashMap);
        }
        String a2 = odx.a(strArr);
        w wVar = hashMap.get(a2);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(component, strArr);
        hashMap.put(a2, wVar2);
        return wVar2;
    }

    public static void a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691da4af", new Object[]{abVar});
        } else {
            e.remove(abVar);
        }
    }

    private w(Component component, String[] strArr) {
        super(Looper.getMainLooper());
        v a2;
        this.f20203a = 0;
        this.d = 0;
        this.f = new ArrayList();
        if (component == null || (a2 = x.a(component.getNode(), strArr, false)) == null) {
            return;
        }
        if (a2.getNode().a(u.class) != null && !((v.a) a2.getViewParams()).b) {
            return;
        }
        this.b = a2.getNode().G().b;
        this.c = a2;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca4723e", new Object[]{this, aVar});
        } else if (this.f.contains(aVar)) {
        } else {
            this.f.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12387b3f", new Object[]{this, aVar});
        } else {
            this.f.remove(aVar);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f20203a = 2;
        removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.view.View] */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1) {
            if (this.f20203a == 1) {
                return;
            }
            v vVar = this.c;
            final int translationY = (vVar == null || vVar.getView() == 0) ? 0 : (int) this.c.getView().getTranslationY();
            ValueAnimator ofInt = ValueAnimator.ofInt(translationY, -this.b);
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.w.1
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
                        return;
                    }
                    w.a(w.this, 1);
                    w wVar = w.this;
                    wVar.a(translationY, w.a(wVar), true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    w.a(w.this, 0);
                    w.b(w.this, 1);
                    w wVar = w.this;
                    wVar.a(w.a(wVar), w.a(w.this), true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    w.a(w.this, 0);
                    w.b(w.this, 1);
                    w wVar = w.this;
                    wVar.a(w.a(wVar), w.a(w.this), true);
                }
            });
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.w.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    w wVar = w.this;
                    wVar.a(-intValue, w.a(wVar), false);
                }
            });
            ofInt.setDuration(250L);
            ofInt.start();
        } else if (i != 2 || this.f20203a == 2) {
        } else {
            final int i2 = -this.b;
            v vVar2 = this.c;
            if (vVar2 != null && vVar2.getView() != 0) {
                i2 = (int) this.c.getView().getTranslationY();
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt(i2, 0);
            ofInt2.addListener(new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.w.3
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
                        return;
                    }
                    w.a(w.this, 2);
                    w wVar = w.this;
                    wVar.a(-i2, w.a(wVar), true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    w.a(w.this, 0);
                    w.b(w.this, 2);
                    w wVar = w.this;
                    wVar.a(0, w.a(wVar), true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    w.a(w.this, 0);
                    w.b(w.this, 2);
                    w wVar = w.this;
                    wVar.a(0, w.a(wVar), true);
                }
            });
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.w.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    w wVar = w.this;
                    wVar.a(-intValue, w.a(wVar), false);
                }
            });
            ofInt2.setDuration(250L);
            ofInt2.start();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (hasMessages(1) || this.f20203a == 1 || this.d != 0 || this.b <= 0) {
        } else {
            removeMessages(2);
            sendMessageDelayed(Message.obtain(this, 1, false), 200L);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (hasMessages(2) || this.f20203a == 2 || this.d != 0 || this.b <= 0) {
        } else {
            removeMessages(1);
            sendMessageDelayed(Message.obtain(this, 2, false), 200L);
        }
    }

    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Boolean bool = (Boolean) map.get("foldTab");
        if (bool != null) {
            if (bool.booleanValue()) {
                h();
                return;
            } else {
                i();
                return;
            }
        }
        int intValue = ((Integer) map.get("totalY")).intValue();
        float floatValue = ((Float) map.get("moveY")).floatValue();
        int i = this.b;
        v vVar = this.c;
        if (vVar != null && ((v.a) vVar.getViewParams()).d > 0) {
            i = ((v.a) this.c.getViewParams()).d;
        }
        if (intValue >= i && (-floatValue) > i && (((Float) map.get("mDy")).floatValue() < 0.0f || ((Integer) map.get("dy")).intValue() > 0)) {
            h();
        } else if (((Float) map.get("mDy")).floatValue() <= 0.0f && ((Integer) map.get("dy")).intValue() >= 0) {
        } else {
            if (intValue == 0) {
                i();
                return;
            }
            v vVar2 = this.c;
            if (vVar2 == null) {
                return;
            }
            if (floatValue > i && !((v.a) vVar2.getViewParams()).c) {
                i();
            } else if (intValue > i && ((Integer) map.get("firstIndex")).intValue() != 0) {
            } else {
                i();
            }
        }
    }

    public void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map.containsKey("foldTab")) {
            if (!String.valueOf(map.get("foldTab")).equals("true")) {
                return;
            }
            h();
        } else if (!map.containsKey("unfoldTab") || !String.valueOf(map.get("unfoldTab")).equals("true")) {
        } else {
            i();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            i();
        }
    }

    public int a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619b8ff", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)})).intValue();
        }
        int i3 = this.f20203a;
        if (i >= i2) {
            this.f20203a = 1;
        } else if (i > 0 && i < i2) {
            this.f20203a = 0;
        } else {
            this.f20203a = 2;
        }
        for (a aVar : this.f) {
            aVar.a(-i, this.b, i3, z);
        }
        return i3;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        v vVar = this.c;
        if (vVar == null) {
            return;
        }
        int i = this.b;
        if (vVar.getNode() == null || this.c.getNode().G() == null) {
            return;
        }
        this.b = this.c.getNode().G().b;
        int i2 = this.b;
        if (i == i2 || this.f20203a != 1) {
            return;
        }
        a(i2, i2, false);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f20203a == 1;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f20203a;
    }
}
