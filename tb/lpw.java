package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.lpm;

/* loaded from: classes7.dex */
public class lpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f30802a;
    private boolean b;
    private ljs d;
    private lpm.a e;
    private final a f = new a();
    private int g = this.f.c;
    private lpj c = new lpj();

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f30808a;
        public boolean b = false;
        public int c = 150;
        public boolean d = false;
        public String e = "";

        static {
            kge.a(1680375823);
        }
    }

    static {
        kge.a(1998822369);
    }

    public static /* synthetic */ View a(lpw lpwVar, IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, int i, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a00315c4", new Object[]{lpwVar, iDxItemRenderService, viewGroup, new Integer(i), baseSectionModel, baseSectionModel2}) : lpwVar.a(iDxItemRenderService, viewGroup, i, baseSectionModel, baseSectionModel2);
    }

    public static /* synthetic */ ViewGroup a(lpw lpwVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7db73dd1", new Object[]{lpwVar, viewGroup});
        }
        lpwVar.f30802a = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ void a(lpw lpwVar, View view, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37224ed", new Object[]{lpwVar, view, aVar});
        } else {
            lpwVar.a(view, aVar);
        }
    }

    public static /* synthetic */ void a(lpw lpwVar, ViewGroup viewGroup, ViewGroup viewGroup2, View view, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375c702f", new Object[]{lpwVar, viewGroup, viewGroup2, view, aVar});
        } else {
            lpwVar.a(viewGroup, viewGroup2, view, aVar);
        }
    }

    public static /* synthetic */ boolean a(lpw lpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f341b289", new Object[]{lpwVar})).booleanValue() : lpwVar.b;
    }

    public static /* synthetic */ boolean a(lpw lpwVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63002631", new Object[]{lpwVar, view})).booleanValue() : lpwVar.a(view);
    }

    public static /* synthetic */ boolean a(lpw lpwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74f550f3", new Object[]{lpwVar, new Boolean(z)})).booleanValue();
        }
        lpwVar.b = z;
        return z;
    }

    public static /* synthetic */ void b(lpw lpwVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb30660c", new Object[]{lpwVar, view});
        } else {
            lpwVar.e(view);
        }
    }

    public lpw(ljs ljsVar) {
        this.d = ljsVar;
    }

    public void a(Context context, final ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, View view, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88db3783", new Object[]{this, context, viewGroup, baseSectionModel, baseSectionModel2, view, aVar});
        } else if (!baseSectionModel2.containsKey("template")) {
        } else {
            if (aVar == null) {
                aVar = this.f;
            }
            this.g = aVar.c;
            final RelativeLayout relativeLayout = new RelativeLayout(context);
            a(relativeLayout, a(context, viewGroup, baseSectionModel2, view, aVar), baseSectionModel, new lpm.b() { // from class: tb.lpw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lpm.b
                public void a(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view2});
                    } else if (viewGroup.getLocalVisibleRect(new Rect())) {
                        lpw.a(lpw.this, viewGroup, relativeLayout, view2, aVar);
                        lpw.a(lpw.this, (ViewGroup) relativeLayout);
                    } else if (!aVar.b) {
                    } else {
                        if (lpw.a(lpw.this, (View) relativeLayout)) {
                            ldf.d("Home.DXFloatingLayerView", "dx downloadListener回调重复调用，已经添加过视图了 这里不重复add");
                            return;
                        }
                        relativeLayout.addView(view2);
                        viewGroup.addView(relativeLayout);
                        relativeLayout.setTag(R.id.overlay_overlay_view_tag, aVar.e);
                        lpw.a(lpw.this, relativeLayout, aVar);
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f30802a;
        if (viewGroup == null || viewGroup.getParent() == null || this.b) {
            return;
        }
        viewGroup.setTag(R.id.overlay_overlay_view_tag, null);
        this.b = true;
        a(viewGroup, d(viewGroup));
    }

    public void a(lpm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1763a732", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2, View view, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e999b72c", new Object[]{this, viewGroup, viewGroup2, view, aVar});
        } else if (a(viewGroup2)) {
            ldf.d("Home.DXFloatingLayerView", "dx downloadListener回调重复调用，已经添加过视图了 这里不重复add");
        } else {
            viewGroup2.addView(view);
            viewGroup.addView(viewGroup2);
            viewGroup2.setTag(R.id.overlay_overlay_view_tag, aVar.e);
            a(viewGroup2, aVar);
            c(viewGroup2);
        }
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : view.getParent() instanceof ViewGroup;
    }

    private BaseSectionModel<?> a(Context context, ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, View view, a aVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("e04f24b3", new Object[]{this, context, viewGroup, baseSectionModel, view, aVar});
        }
        int a2 = this.c.a(view == null ? viewGroup : view);
        int b = this.c.b(view == null ? viewGroup : view);
        if (view != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr);
            viewGroup.getLocationOnScreen(iArr2);
            int i3 = iArr[0] - iArr2[0];
            i2 = iArr[1] - iArr2[1];
            i = i3;
        } else {
            i = 0;
            i2 = 0;
        }
        return this.c.a(baseSectionModel, context, b, a2, i, i2, aVar.b);
    }

    private void a(ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, lpm.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840198a0", new Object[]{this, viewGroup, baseSectionModel, baseSectionModel2, bVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.d.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null) {
            return;
        }
        View a2 = a(iDxItemRenderService, viewGroup, iDxItemRenderService.getViewType(baseSectionModel), baseSectionModel, baseSectionModel2);
        if (a2 != null) {
            bVar.a(a2);
            a(iDxItemRenderService, baseSectionModel);
            return;
        }
        a(iDxItemRenderService, viewGroup, baseSectionModel, baseSectionModel2, bVar);
    }

    private void a(IDxItemRenderService iDxItemRenderService, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db44a77", new Object[]{this, iDxItemRenderService, baseSectionModel});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseSectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, null);
    }

    private void a(final IDxItemRenderService iDxItemRenderService, final ViewGroup viewGroup, final BaseSectionModel<?> baseSectionModel, final BaseSectionModel<?> baseSectionModel2, final lpm.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1148b027", new Object[]{this, iDxItemRenderService, viewGroup, baseSectionModel, baseSectionModel2, bVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseSectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, new IDxItemRenderService.b() { // from class: tb.lpw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                View a2 = lpw.a(lpw.this, iDxItemRenderService, viewGroup, iDxItemRenderService.getViewType(baseSectionModel), baseSectionModel, baseSectionModel2);
                if (a2 == null) {
                    return;
                }
                bVar.a(a2);
            }
        });
    }

    private View a(IDxItemRenderService iDxItemRenderService, ViewGroup viewGroup, int i, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("abf4df67", new Object[]{this, iDxItemRenderService, viewGroup, new Integer(i), baseSectionModel, baseSectionModel2});
        }
        BaseSectionModel<?> createBaseSectionModel = baseSectionModel.createBaseSectionModel(baseSectionModel);
        View createView = iDxItemRenderService.createView(viewGroup, i);
        if (createView == null) {
            ldf.d("Home.DXFloatingLayerView", "addDxView view == null");
            return null;
        }
        iDxItemRenderService.bindData(createView, createBaseSectionModel);
        this.e.a(createBaseSectionModel, baseSectionModel2);
        return createView;
    }

    private void a(View view, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaa39ea", new Object[]{this, view, aVar});
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.lpw.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                } else if (aVar.b) {
                } else {
                    view2.setVisibility(4);
                    if (view2.getParent() == null || lpw.a(lpw.this)) {
                        return;
                    }
                    lpw.a(lpw.this, true);
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
            }
        });
        if (aVar != null && aVar.f30808a) {
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: tb.lpw.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                }
                if (aVar.d || motionEvent.getAction() != 0) {
                    return false;
                }
                ldf.d("Home.DXFloatingLayerView", "popupView.setOnTouchListener.onTouch");
                if (!aVar.b) {
                    lpw.this.a();
                }
                return true;
            }
        });
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            return;
        }
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.g);
            view.startAnimation(alphaAnimation);
        } catch (Exception e) {
            ldf.a("enter animation overlay met exception.", e, new String[0]);
        }
    }

    private void a(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a8e616", new Object[]{this, view, animationListener});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(this.g);
        alphaAnimation.setAnimationListener(animationListener);
        view.startAnimation(alphaAnimation);
    }

    private Animation.AnimationListener d(final View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation.AnimationListener) ipChange.ipc$dispatch("2eb38edb", new Object[]{this, view}) : new Animation.AnimationListener() { // from class: tb.lpw.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    lpw.b(lpw.this, view);
                }
            }
        };
    }

    private void e(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else if (view == null || (parent = view.getParent()) == null) {
        } else {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
