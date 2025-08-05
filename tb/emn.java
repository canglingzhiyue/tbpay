package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v7.widget.AliSMainGalleryRecyclerView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class emn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<RecyclerView, ValueAnimator> f27430a;

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f27430a;
    }

    public static /* synthetic */ void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{recyclerView, new Integer(i)});
        } else {
            b(recyclerView, i);
        }
    }

    static {
        kge.a(-1242511209);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSMainGalleryRecyclerViewScroller");
        f27430a = new HashMap();
    }

    public static void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{recyclerView});
        } else if (recyclerView.getAdapter() instanceof atq) {
            List<AURARenderComponent> a2 = ((atq) recyclerView.getAdapter()).a();
            if (bau.a(a2)) {
                return;
            }
            for (AURARenderComponent aURARenderComponent : a2) {
                if (a(aURARenderComponent)) {
                    a(recyclerView, aURARenderComponent, a2);
                }
            }
        }
    }

    private static boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.fields == null) {
            return false;
        }
        boolean equals = "true".equals(aURARenderComponent.data.fields.get("isSelected"));
        if (equals) {
            return equals;
        }
        if (aURARenderComponent.parent != null && aURARenderComponent.parent.data != null && aURARenderComponent.parent.data.fields != null) {
            return "true".equals(aURARenderComponent.parent.data.fields.get("isSelected"));
        }
        return false;
    }

    public static void a(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b95e0", new Object[]{recyclerView, str});
        } else if (recyclerView.getAdapter() instanceof atq) {
            List<AURARenderComponent> a2 = ((atq) recyclerView.getAdapter()).a();
            if (bau.a(a2)) {
                return;
            }
            for (AURARenderComponent aURARenderComponent : a2) {
                if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
                    if (TextUtils.equals(aURARenderComponent.data.fields.get("code") instanceof String ? (String) aURARenderComponent.data.fields.get("code") : "", str)) {
                        a(recyclerView, aURARenderComponent, a2);
                    }
                }
            }
        }
    }

    public static void b(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1b1a21", new Object[]{recyclerView, str});
        } else if (TextUtils.isEmpty(str)) {
            arc.a().c("AliSMainGalleryRecyclerViewScroller", "scrollToMainGalleryFrame", "recyclerView is null or frameComponentKey is null or globalData is null");
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (!(adapter instanceof atq)) {
                return;
            }
            List<AURARenderComponent> a2 = ((atq) adapter).a();
            if (bau.a(a2)) {
                return;
            }
            for (AURARenderComponent aURARenderComponent : a2) {
                if (str.equalsIgnoreCase(aURARenderComponent.key)) {
                    a(recyclerView, aURARenderComponent, a2);
                    return;
                }
            }
        }
    }

    public static void a(RecyclerView recyclerView, AURARenderComponent aURARenderComponent, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f48dfd6", new Object[]{recyclerView, aURARenderComponent, list});
        } else if (recyclerView == null || list == null) {
            arc.a().c("AliSMainGalleryRecyclerViewScroller", "scrollToMainGalleryFrame", "recyclerView is null or platRenderComponentList is null");
        } else if (aURARenderComponent == null) {
            arc.a().c("AliSMainGalleryRecyclerViewScroller", "scrollToMainGalleryFrame", "recyclerView is null or frameComponent is null");
        } else if (bau.a(list)) {
        } else {
            int indexOf = list.indexOf(aURARenderComponent);
            if (indexOf < 0) {
                arc.a().c("AliSMainGalleryRecyclerViewScroller", "scrollToMainGalleryFrame", "cannot find the index to scroll");
                return;
            }
            int a2 = emi.a(indexOf, list);
            int a3 = emj.a(recyclerView, false);
            recyclerView.scrollBy(((indexOf - a2) * recyclerView.getWidth()) - ((a3 - emi.a(a3, list)) * recyclerView.getWidth()), 0);
            a(recyclerView, indexOf, recyclerView.getHeight(), emh.a(recyclerView.getContext(), recyclerView.getWidth(), aURARenderComponent, emh.sDefaultDimension, false));
        }
    }

    private static void a(final RecyclerView recyclerView, final int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8bc94d", new Object[]{recyclerView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i2 == i3) {
            b(recyclerView, i);
        } else {
            ValueAnimator valueAnimator = f27430a.get(recyclerView);
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.emn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else {
                        emj.b(RecyclerView.this, ((Integer) valueAnimator2.getAnimatedValue()).intValue());
                    }
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: tb.emn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    } else if (hashCode != -1868320925) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onAnimationCancel((Animator) objArr[0]);
                        return null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationCancel(animator);
                    emn.a().remove(RecyclerView.this);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    emn.a().remove(RecyclerView.this);
                    emn.a(RecyclerView.this, i);
                }
            });
            f27430a.put(recyclerView, ofInt);
            ofInt.start();
        }
    }

    private static void b(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f244dcc", new Object[]{recyclerView, new Integer(i)});
        } else if (recyclerView instanceof AliSMainGalleryRecyclerView) {
            ((AliSMainGalleryRecyclerView) recyclerView).setScrollState(1);
            recyclerView.stopScroll();
        } else {
            recyclerView.smoothScrollToPosition(i);
        }
    }
}
