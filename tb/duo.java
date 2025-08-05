package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView;
import com.taobao.android.buy.module.scrollbar.widget.a;
import com.taobao.android.buy.module.scrollbar.widget.b;
import java.util.List;

@AURAExtensionImpl(code = "alibuy.impl.render.component.creator.scrollbar")
/* loaded from: classes4.dex */
public final class duo extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AURAGlobalData d;

    static {
        kge.a(-1895685487);
    }

    public static /* synthetic */ Object ipc$super(duo duoVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "buy_v2_right_nav_bar";
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : "buy_v2_right_nav_bar";
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.d = aURAGlobalData;
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        AliBuyScrollbarView aliBuyScrollbarView = (AliBuyScrollbarView) this.d.get("alibuy_scrollbar", AliBuyScrollbarView.class);
        if (aliBuyScrollbarView != null) {
            a(aliBuyScrollbarView, (a) this.d.get("alibuy_scrollState", a.class));
            return aliBuyScrollbarView;
        }
        AliBuyScrollbarView aliBuyScrollbarView2 = new AliBuyScrollbarView(viewGroup.getContext());
        this.d.update("alibuy_scrollbar", aliBuyScrollbarView2);
        a aVar = new a();
        if (viewGroup instanceof RecyclerView) {
            aliBuyScrollbarView2.setBarHeight(viewGroup.getHeight());
            a(aliBuyScrollbarView2, aVar);
            aVar.a((RecyclerView) viewGroup);
        }
        this.d.update("alibuy_scrollState", aVar);
        a(aliBuyScrollbarView2);
        return aliBuyScrollbarView2;
    }

    private void a(AliBuyScrollbarView aliBuyScrollbarView, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75c4c38", new Object[]{this, aliBuyScrollbarView, aVar});
            return;
        }
        aVar.b = aliBuyScrollbarView.mStartPosition;
        List list = (List) this.d.get("render_view_item_models", List.class);
        aliBuyScrollbarView.setItemCount(list.size() - dup.a(list));
        aVar.f9252a = aliBuyScrollbarView.getItemCount();
    }

    private void a(final AliBuyScrollbarView aliBuyScrollbarView) {
        final RecyclerView recyclerView;
        final a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508d8e2f", new Object[]{this, aliBuyScrollbarView});
            return;
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null || (recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class)) == null || (aVar = (a) this.d.get("alibuy_scrollState", a.class)) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.duo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (i2 == 0) {
                    return;
                }
                if (Math.abs(i2) > 120) {
                    aliBuyScrollbarView.show();
                }
                int i3 = -1;
                if (aliBuyScrollbarView.mStartPosition == -1) {
                    aliBuyScrollbarView.mStartPosition = aVar.c();
                }
                int b = aVar.b();
                int itemCount = aliBuyScrollbarView.getItemCount();
                int computeVerticalScrollExtent = b - recyclerView2.computeVerticalScrollExtent();
                if (computeVerticalScrollExtent == 0) {
                    return;
                }
                float min = Math.min(1.0f, Math.max(aVar.a() / computeVerticalScrollExtent, 0.0f));
                if ((dup.a(recyclerView2) - aliBuyScrollbarView.mStartPosition) + 1 >= itemCount && i2 > 0) {
                    min = 1.0f;
                }
                if (i2 > 0) {
                    i3 = 1;
                }
                aliBuyScrollbarView.scrollToPercent(min, i3);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                if (i != 0) {
                    return;
                }
                aliBuyScrollbarView.hide();
            }
        });
        aliBuyScrollbarView.setListener(new b() { // from class: tb.duo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int e;
            private int f;

            @Override // com.taobao.android.buy.module.scrollbar.widget.b
            public void a(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                int i = 1;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                    return;
                }
                this.f = aVar.b();
                this.e = aVar.a();
                float computeVerticalScrollExtent = ((this.f - recyclerView.computeVerticalScrollExtent()) * f2) - this.e;
                if (Math.abs(computeVerticalScrollExtent) > 2600.0f) {
                    if (computeVerticalScrollExtent <= 0.0f) {
                        i = -1;
                    }
                    recyclerView.smoothScrollBy(0, i * 2600, new Interpolator() { // from class: tb.duo.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.TimeInterpolator
                        public float getInterpolation(float f3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Number) ipChange3.ipc$dispatch("22c782db", new Object[]{this, new Float(f3)})).floatValue();
                            }
                            return 0.3f;
                        }
                    });
                    return;
                }
                if ((f2 > f && computeVerticalScrollExtent < 0.0f) || (f2 < f && computeVerticalScrollExtent > 0.0f)) {
                    computeVerticalScrollExtent = 0.0f;
                }
                recyclerView.smoothScrollBy(0, (int) computeVerticalScrollExtent, new Interpolator() { // from class: tb.duo.2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.TimeInterpolator
                    public float getInterpolation(float f3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return ((Number) ipChange3.ipc$dispatch("22c782db", new Object[]{this, new Float(f3)})).floatValue();
                        }
                        return 0.3f;
                    }
                });
            }

            @Override // com.taobao.android.buy.module.scrollbar.widget.b
            public void b(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
                } else if (f2 <= 0.01f) {
                    recyclerView.scrollToPosition(0);
                    aliBuyScrollbarView.hide();
                } else {
                    if (f2 >= 0.99f) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset((aliBuyScrollbarView.getItemCount() - 1) + aliBuyScrollbarView.mStartPosition, 1000);
                            aliBuyScrollbarView.hide();
                            return;
                        }
                    }
                    this.f = aVar.b();
                    this.e = aVar.a();
                    float computeVerticalScrollExtent = ((this.f - recyclerView.computeVerticalScrollExtent()) * f2) - this.e;
                    if (Math.abs(computeVerticalScrollExtent) <= 2600.0f) {
                        recyclerView.smoothScrollBy(0, (int) computeVerticalScrollExtent, new Interpolator() { // from class: tb.duo.2.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.animation.TimeInterpolator
                            public float getInterpolation(float f3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Number) ipChange3.ipc$dispatch("22c782db", new Object[]{this, new Float(f3)})).floatValue();
                                }
                                return 1.0f;
                            }
                        });
                    } else {
                        float itemCount = (aliBuyScrollbarView.getItemCount() * f2) + aliBuyScrollbarView.mStartPosition;
                        if (itemCount > aliBuyScrollbarView.mStartPosition) {
                            itemCount -= 1.0f;
                        }
                        recyclerView.scrollToPosition((int) itemCount);
                    }
                    aliBuyScrollbarView.hide();
                }
            }
        });
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof AliBuyScrollbarView)) {
        } else {
            AliBuyScrollbarView aliBuyScrollbarView = (AliBuyScrollbarView) view;
            if (aliBuyScrollbarView.hasInit() || aURARenderComponent.data == null) {
                return;
            }
            aliBuyScrollbarView.onDataChange(aURARenderComponent.data.fields);
        }
    }
}
