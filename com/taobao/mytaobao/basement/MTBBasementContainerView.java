package com.taobao.mytaobao.basement;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.phenix.request.d;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nwv;
import tb.xol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/taobao/mytaobao/basement/MTBBasementContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowErrorPage", "", "mainHandler", "Landroid/os/Handler;", "showSnapshotTask", "Ljava/lang/Runnable;", "<set-?>", "Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "weexView", "getWeexView", "()Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "delayShowPlaceHolder", "", "data", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "hidePlaceHolder", "installWeex", MessageID.onDestroy, "showErrorPage", "reloadClickListener", "Landroid/view/View$OnClickListener;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MTBBasementContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private boolean isShowErrorPage;
    private final Handler mainHandler;
    private Runnable showSnapshotTask;
    private BasementWeexView weexView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ xol b;

        public a(xol xolVar) {
            this.b = xolVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nwv.f(".........real delayShowPlaceHolder");
            View findViewById = MTBBasementContainerView.this.findViewById(R.id.mtb_iv_basement_placeholder);
            String str = null;
            if (!(findViewById instanceof ImageView)) {
                findViewById = null;
            }
            ImageView imageView = (ImageView) findViewById;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            TUrlImageView tUrlImageView = new TUrlImageView(MTBBasementContainerView.this.getContext());
            tUrlImageView.setId(R.id.mtb_iv_basement_placeholder);
            tUrlImageView.setAdjustViewBounds(true);
            MTBBasementContainerView.this.addView(tUrlImageView, -1, -2);
            JSONObject a2 = this.b.a();
            if (a2 != null && (jSONObject = a2.getJSONObject("fields")) != null && (jSONObject2 = jSONObject.getJSONObject("basementTip")) != null) {
                str = jSONObject2.getString("placeHolderType");
            }
            String str2 = str;
            com.taobao.phenix.intf.b.h().a(d.a((StringUtils.equals("2", str2) || StringUtils.equals("3", str2)) ? R.drawable.mtb_basement_placeholder2 : R.drawable.mtb_basement_placeholder)).into(tUrlImageView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public b(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MTBBasementContainerView.access$setShowErrorPage$p(MTBBasementContainerView.this, false);
            View findViewById = MTBBasementContainerView.this.findViewById(R.id.llMtbError);
            if (!(findViewById instanceof View)) {
                findViewById = null;
            }
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            this.b.onClick(view);
        }
    }

    static {
        kge.a(-978800518);
    }

    public MTBBasementContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MTBBasementContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static /* synthetic */ Object ipc$super(MTBBasementContainerView mTBBasementContainerView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final /* synthetic */ void access$setShowErrorPage$p(MTBBasementContainerView mTBBasementContainerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9eb9bf8", new Object[]{mTBBasementContainerView, new Boolean(z)});
        } else {
            mTBBasementContainerView.isShowErrorPage = z;
        }
    }

    public /* synthetic */ MTBBasementContainerView(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTBBasementContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.c(context, "context");
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    public final BasementWeexView getWeexView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasementWeexView) ipChange.ipc$dispatch("64635b9d", new Object[]{this}) : this.weexView;
    }

    public final void installWeex(BasementWeexView weexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0043ed", new Object[]{this, weexView});
            return;
        }
        q.c(weexView, "weexView");
        this.weexView = weexView;
        addView(weexView, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void showErrorPage(View.OnClickListener reloadClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7892d8", new Object[]{this, reloadClickListener});
            return;
        }
        q.c(reloadClickListener, "reloadClickListener");
        View findViewById = findViewById(R.id.llMtbError);
        if (!(findViewById instanceof View)) {
            findViewById = null;
        }
        b bVar = new b(reloadClickListener);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            View findViewById2 = findViewById.findViewById(R.id.btn_basement_refresh);
            if (findViewById2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            findViewById2.setOnClickListener(bVar);
        } else {
            View errorView = LayoutInflater.from(getContext()).inflate(R.layout.mtb_basement_error, (ViewGroup) this, true);
            q.a((Object) errorView, "errorView");
            errorView.setVisibility(0);
            View findViewById3 = errorView.findViewById(R.id.basement_error_img);
            if (findViewById3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
            }
            com.taobao.phenix.intf.b.h().a("https://gw.alicdn.com/imgextra/i1/O1CN01hLnyGq1u2tFgVTqNH_!!6000000005980-2-tps-200-200.png").into((ImageView) findViewById3);
            View findViewById4 = errorView.findViewById(R.id.btn_basement_refresh);
            if (findViewById4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            findViewById4.setOnClickListener(bVar);
        }
        this.isShowErrorPage = true;
    }

    public final void delayShowPlaceHolder(xol data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef503d55", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        nwv.f(".........delayShowPlaceHolder");
        Runnable runnable = this.showSnapshotTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.showSnapshotTask = new a(data);
        Handler handler = this.mainHandler;
        Runnable runnable2 = this.showSnapshotTask;
        if (runnable2 == null) {
            q.a();
        }
        handler.postDelayed(runnable2, 1000L);
    }

    public final void hidePlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a162f8", new Object[]{this});
            return;
        }
        nwv.f(".........hidePlaceHolder");
        Runnable runnable = this.showSnapshotTask;
        if (runnable != null) {
            Handler handler = this.mainHandler;
            if (runnable == null) {
                q.a();
            }
            handler.removeCallbacks(runnable);
        }
        View findViewById = findViewById(R.id.mtb_iv_basement_placeholder);
        if (!(findViewById instanceof ImageView)) {
            findViewById = null;
        }
        ImageView imageView = (ImageView) findViewById;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
        imageView.setImageDrawable(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isShowErrorPage && this.weexView != null) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BasementWeexView basementWeexView = this.weexView;
        if (basementWeexView != null) {
            basementWeexView.dispose();
        }
        this.mainHandler.removeCallbacksAndMessages(null);
    }
}
