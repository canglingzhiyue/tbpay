package tb;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ofh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g.c f31987a;
    private List<ofi> b;
    private aa c;
    private b d;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-828049335);
    }

    public ofh(final g.c cVar, int i, Object obj) {
        this.f31987a = cVar;
        this.c = cVar.f19938a.a(i);
        a(obj);
        this.d = new b(new a() { // from class: tb.ofh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ofh.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("succeed", (Object) true);
                cVar.c.a(cVar, jSONObject);
            }
        });
    }

    private void a(Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        this.b = new ArrayList();
        if (obj instanceof JSONObject) {
            this.b.add((ofi) JSONObject.toJavaObject((JSONObject) obj, ofi.class));
        } else if (!(obj instanceof JSONArray)) {
        } else {
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= jSONArray.size()) {
                    return;
                }
                this.b.add((ofi) JSONObject.toJavaObject((JSONObject) jSONArray.get(i), ofi.class));
                i++;
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        aa aaVar = this.c;
        if (aaVar == null || aaVar.I() == null || this.b.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) false);
            this.f31987a.c.a(this.f31987a, jSONObject);
            return;
        }
        for (ofi ofiVar : this.b) {
            a(ofiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.airbnb.lottie.LottieAnimationView a(final tb.ofi r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ofh.a(tb.ofi):com.airbnb.lottie.LottieAnimationView");
    }

    private int[] a(aa aaVar, ViewGroup viewGroup) {
        int i;
        int i2;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("287a635", new Object[]{this, aaVar, viewGroup});
        }
        int[] iArr = new int[2];
        View x = aaVar.x();
        if (x != null) {
            x.getLocationInWindow(iArr);
            i = iArr[0];
            i2 = iArr[1];
        } else {
            Component.a hostViewComponent = aaVar.I().getHostViewComponent();
            if (hostViewComponent == null || (view = hostViewComponent.f20278a.getView()) == null) {
                i = 0;
                i2 = 0;
            } else {
                view.getLocationInWindow(iArr);
                int i3 = iArr[0] + hostViewComponent.b.c;
                i2 = hostViewComponent.b.d + iArr[1];
                i = i3;
            }
        }
        viewGroup.getLocationInWindow(iArr);
        iArr[0] = i - iArr[0];
        iArr[1] = i2 - iArr[1];
        return iArr;
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f31991a;
        private a b;

        static {
            kge.a(-1226979026);
        }

        public b(a aVar) {
            this.b = aVar;
        }

        public void a(final LottieAnimationView lottieAnimationView, final ofi ofiVar, final ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6deac807", new Object[]{this, lottieAnimationView, ofiVar, viewGroup});
                return;
            }
            this.f31991a++;
            lottieAnimationView.setFailureListener(new j<Throwable>() { // from class: tb.ofh.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.airbnb.lottie.j
                public /* synthetic */ void onResult(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8251d27f", new Object[]{this, th});
                    } else {
                        a(th);
                    }
                }

                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        return;
                    }
                    ogg.b("lottie fail with  " + th.getMessage());
                    b.this.a();
                    if (!ofiVar.b) {
                        return;
                    }
                    viewGroup.removeView(lottieAnimationView);
                }
            });
            lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() { // from class: tb.ofh.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

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
                        return;
                    }
                    b.this.a();
                    if (!ofiVar.b) {
                        return;
                    }
                    viewGroup.removeView(lottieAnimationView);
                }
            });
        }

        public void a() {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f31991a--;
            if (this.f31991a != 0 || (aVar = this.b) == null) {
                return;
            }
            aVar.a();
        }
    }
}
