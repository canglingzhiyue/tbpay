package com.taobao.android.detail.industry.scene.trwidget;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.widget.ScrollFrameLayout;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.taobao.R;
import java.util.Map;
import tb.etm;
import tb.eyx;
import tb.eyy;
import tb.gbg;
import tb.kge;

/* loaded from: classes4.dex */
public class TTDetailTriverWidgetComponent extends etm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_FIELDS_WIDGET_DATA = "widgetData";
    private volatile boolean mHasRender;
    private TRWidgetInstance mTRWidgetInstance;
    private View mTRWidgetView;

    static {
        kge.a(1403102444);
    }

    public static /* synthetic */ Object ipc$super(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1978560141:
                super.onActivityPageResumed((Activity) objArr[0]);
                return null;
            case -1898152289:
                super.onComponentExpand();
                return null;
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1634521564:
                super.onActivityPagePaused((Activity) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -72375978:
                super.onComponentViewDetachedFromWindow();
                return null;
            case 502306446:
                super.onComponentShrink();
                return null;
            case 665468393:
                super.onActivityPageStopped((Activity) objArr[0]);
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            case 1683070809:
                super.onComponentViewAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ View access$102(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("31f84e99", new Object[]{tTDetailTriverWidgetComponent, view});
        }
        tTDetailTriverWidgetComponent.mTRWidgetView = view;
        return view;
    }

    public static /* synthetic */ ScrollFrameLayout access$200(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollFrameLayout) ipChange.ipc$dispatch("712282e8", new Object[]{tTDetailTriverWidgetComponent}) : tTDetailTriverWidgetComponent.mContentContainer;
    }

    public static /* synthetic */ void access$300(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad67975b", new Object[]{tTDetailTriverWidgetComponent});
        } else {
            tTDetailTriverWidgetComponent.addContentView();
        }
    }

    public static /* synthetic */ void access$400(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c3e3dc", new Object[]{tTDetailTriverWidgetComponent, runtimeAbilityParamArr});
        } else {
            tTDetailTriverWidgetComponent.triggerClickEvent(runtimeAbilityParamArr);
        }
    }

    public TTDetailTriverWidgetComponent(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.mTRWidgetInstance = new TRWidgetInstance((FragmentActivity) context);
    }

    @Override // tb.etm
    public void onActivityPageResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a119173", new Object[]{this, activity});
            return;
        }
        super.onActivityPageResumed(activity);
        if (activity != this.mContext) {
            return;
        }
        this.mTRWidgetInstance.resume();
    }

    @Override // tb.etm
    public void onActivityPagePaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e932e24", new Object[]{this, activity});
            return;
        }
        super.onActivityPagePaused(activity);
        if (activity != this.mContext) {
            return;
        }
        this.mTRWidgetInstance.pause();
    }

    @Override // tb.etm
    public void onActivityPageStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27aa3de9", new Object[]{this, activity});
            return;
        }
        super.onActivityPageStopped(activity);
        if (activity != this.mContext) {
            return;
        }
        this.mTRWidgetInstance.stop();
    }

    @Override // tb.etm
    public void onComponentExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc7e9f", new Object[]{this});
            return;
        }
        super.onComponentExpand();
        updateTRiverSize();
    }

    @Override // tb.etm
    public void onComponentShrink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0968e", new Object[]{this});
            return;
        }
        super.onComponentShrink();
        updateTRiverSize();
    }

    private void updateTRiverSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4410b49", new Object[]{this});
        } else if (this.mView == null) {
        } else {
            float width = this.mView.getWidth();
            this.mTRWidgetInstance.updateSize(gbg.c(this.mContext, width) << 1, gbg.c(this.mContext, width / getFrameDimensionRatio()) << 1);
        }
    }

    @Override // tb.etm
    public void onComponentViewAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64519f59", new Object[]{this});
            return;
        }
        super.onComponentViewAttachedToWindow();
        this.mTRWidgetInstance.onAttach(null);
    }

    @Override // tb.etm
    public void onComponentViewDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbafa156", new Object[]{this});
            return;
        }
        super.onComponentViewDetachedFromWindow();
        this.mTRWidgetInstance.onDetach(null);
    }

    @Override // tb.etm
    public void onViewUpdate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e7b33e", new Object[]{this, view});
        } else if (this.mTRWidgetView == null) {
        } else {
            addContentView();
        }
    }

    private void addContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d9bd64", new Object[]{this});
        } else if (this.mContentContainer.getChildAt(0) == this.mTRWidgetView) {
        } else {
            this.mContentContainer.removeAllViews();
            this.mContentContainer.addView(this.mTRWidgetView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        renderTRiverWidget();
        this.mTRWidgetInstance.onAttach(null);
    }

    @Override // tb.etm, com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        this.mTRWidgetInstance.onDetach(null);
    }

    private void renderTRiverWidget() {
        WidgetStartParams renderData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5310ae99", new Object[]{this});
        } else if (this.mHasRender || (renderData = getRenderData()) == null) {
        } else {
            this.mTRWidgetInstance.render(renderData, new a() { // from class: com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1795038358) {
                        super.a((View) objArr[0]);
                        return null;
                    } else if (hashCode != 1597486205) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.a((MotionEvent) objArr[0]);
                        return null;
                    }
                }

                @Override // com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent.a, com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    super.a(view);
                    TTDetailTriverWidgetComponent.access$102(TTDetailTriverWidgetComponent.this, view);
                    if (TTDetailTriverWidgetComponent.access$200(TTDetailTriverWidgetComponent.this) == null) {
                        return;
                    }
                    TTDetailTriverWidgetComponent.access$300(TTDetailTriverWidgetComponent.this);
                }

                @Override // com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent.a, com.alibaba.triver.cannal_engine.TRWidgetInstance.a
                public void a(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                        return;
                    }
                    super.a(motionEvent);
                    TTDetailTriverWidgetComponent.access$400(TTDetailTriverWidgetComponent.this, new RuntimeAbilityParam[0]);
                }
            });
            this.mTRWidgetInstance.getRootView().setTag(R.id.industry_triver_widget_tt_detail_component_instance, this);
            this.mHasRender = true;
        }
    }

    private WidgetStartParams getRenderData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetStartParams) ipChange.ipc$dispatch("1b661b4", new Object[]{this});
        }
        try {
            return (WidgetStartParams) this.mComponentData.d().getJSONObject("widgetData").toJavaObject(WidgetStartParams.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // tb.etm, com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTRWidgetInstance.destroy();
    }

    /* loaded from: classes4.dex */
    public static class a implements TRWidgetInstance.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1218821798);
            kge.a(-595657590);
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            }
        }

        private a() {
        }
    }
}
