package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.widget.ObserverImageView;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.media.MessageID;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 +2\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0014J\u0012\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010%\u001a\u00020\u001cH\u0016J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u000fH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/taobao/android/detail/ttdetail/skeleton/indication/TTDetailDescSuffixShrinkComponent;", "Lcom/taobao/android/detail/ttdetail/component/module/NestedComponent;", "context", "Landroid/content/Context;", "detailContext", "Lcom/taobao/android/detail/ttdetail/context/DetailContext;", "componentData", "Lcom/taobao/android/detail/ttdetail/data/ComponentData;", "initComponentData", "", "Lcom/taobao/android/detail/ttdetail/component/module/DataEntry;", "(Landroid/content/Context;Lcom/taobao/android/detail/ttdetail/context/DetailContext;Lcom/taobao/android/detail/ttdetail/data/ComponentData;[Lcom/taobao/android/detail/ttdetail/component/module/DataEntry;)V", "mContainer", "Landroid/widget/LinearLayout;", "mHeight", "", "mLoaded", "", "generateLayoutParams", "Lcom/taobao/android/detail/ttdetail/widget/scrollerlayout/TTDetailScrollerLayout$LayoutParams;", "getContentViewHeight", "imageView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "getLocatorId", "", "getScrollItemView", "Landroid/view/View;", "initData", "", "initImageView", "Lcom/taobao/android/detail/ttdetail/widget/ObserverImageView;", "resId", "visibility", MessageID.onDestroy, "onDidAppear", "onGetComponentView", "reusedView", "onLoadData", "scrollBy", "x", "y", "scrollToPos", aw.PARAM_SEARCH_KEYWORD_POS, "Companion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class ojw extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private final LinearLayout b;
    private boolean c;
    private int d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/android/detail/ttdetail/skeleton/indication/TTDetailDescSuffixShrinkComponent$initData$2$1"}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ spl f32126a;
        public final /* synthetic */ ojw b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ Ref.ObjectRef d;

        public b(spl splVar, ojw ojwVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.f32126a = splVar;
            this.b = ojwVar;
            this.c = objectRef;
            this.d = objectRef2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ObserverImageView observerImageView = (ObserverImageView) this.d.element;
            Integer valueOf = observerImageView != null ? Integer.valueOf(observerImageView.getVisibility()) : null;
            if (valueOf == null || valueOf.intValue() != 8) {
                return;
            }
            ObserverImageView observerImageView2 = (ObserverImageView) this.d.element;
            observerImageView2.setVisibility(0);
            observerImageView2.setImageUrl(this.f32126a.i);
            ((TUrlImageView) this.c.element).setVisibility(8);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("arg1", (Object) "DESC_Price");
            com.taobao.android.detail.ttdetail.communication.c.a(ojw.a(this.b), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "onSizeChanged"}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public static final class c implements ObserverImageView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.ObjectRef b;

        public c(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.ObserverImageView.a
        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i == ojw.b(ojw.this)) {
            } else {
                ojw.a(ojw.this, i);
                ((LinearLayout) this.b.element).getLayoutParams().height = ojw.b(ojw.this);
            }
        }
    }

    static {
        kge.a(-1270836803);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(ojw ojwVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "";
    }

    public static final /* synthetic */ Context a(ojw ojwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ad16ba54", new Object[]{ojwVar}) : ojwVar.mContext;
    }

    public static final /* synthetic */ void a(ojw ojwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96aaf27", new Object[]{ojwVar, new Integer(i)});
        } else {
            ojwVar.d = i;
        }
    }

    public static final /* synthetic */ int b(ojw ojwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e68eb5d0", new Object[]{ojwVar})).intValue() : ojwVar.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojw(Context context, eyx eyxVar, eyy eyyVar, DataEntry... initComponentData) {
        super(context, eyxVar, eyyVar, (DataEntry[]) Arrays.copyOf(initComponentData, initComponentData.length));
        LinearLayout linearLayout;
        q.c(context, "context");
        q.c(initComponentData, "initComponentData");
        this.mContext = context;
        d a2 = d.a(this.mContext);
        if (a2 != null) {
            View a3 = a2.a(this.mContext, R.layout.tt_detail_indication_container, null, true);
            if (a3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            linearLayout = (LinearLayout) a3;
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_indication_container, (ViewGroup) null);
            if (inflate == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            linearLayout = (LinearLayout) inflate;
        }
        this.b = linearLayout;
        a(eyyVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/detail/ttdetail/skeleton/indication/TTDetailDescSuffixShrinkComponent$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public static final class a {
        static {
            kge.a(1474770117);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private final ObserverImageView a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObserverImageView) ipChange.ipc$dispatch("ca895fe7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        View findViewById = this.b.findViewById(i);
        q.a((Object) findViewById, "mContainer.findViewById(resId)");
        ObserverImageView observerImageView = (ObserverImageView) findViewById;
        observerImageView.setVisibility(i2);
        return observerImageView;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.taobao.uikit.extend.feature.view.TUrlImageView] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.taobao.android.detail.ttdetail.widget.ObserverImageView] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.widget.LinearLayout, T] */
    private final void a(eyy eyyVar) {
        ObserverImageView observerImageView;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = a(R.id.indicator_shrink_img, 0);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = a(R.id.indicator_expand_img, 8);
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        View findViewById = this.b.findViewById(R.id.indication_container);
        q.a((Object) findViewById, "mContainer.findViewById(R.id.indication_container)");
        objectRef3.element = (LinearLayout) findViewById;
        ObserverImageView observerImageView2 = (ObserverImageView) objectRef2.element;
        if (observerImageView2 != null) {
            observerImageView2.setOnSizeChangedListener(new c(objectRef3));
        }
        spl a2 = spl.a(eyyVar);
        if (a2 == null) {
            return;
        }
        if (!TextUtils.isEmpty(a2.j) && (tUrlImageView = (TUrlImageView) objectRef.element) != null) {
            tUrlImageView.setImageUrl(a2.j);
        }
        if (!TextUtils.isEmpty(a2.i) && (observerImageView = (ObserverImageView) objectRef2.element) != null) {
            observerImageView.setImageUrl(a2.i);
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) objectRef.element;
        if (tUrlImageView2 == null) {
            return;
        }
        tUrlImageView2.setOnClickListener(new b(a2, this, objectRef, objectRef2));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!this.c) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", (Object) "Page_Detail");
                jSONObject.put("eventId", (Object) 2201);
                jSONObject.put("arg1", (Object) "Page_Detail_Show_DESC_Price");
                jSONObject.put("args", (Object) new JSONObject());
                com.taobao.android.detail.ttdetail.communication.c.a(this.mContext, new h("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                i.a("TTDetailIndicationComponent", "Page_Detail_Show_Navigation error", e);
            }
        }
        this.c = true;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.b;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public TTDetailScrollerLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("c38f45ed", new Object[]{this}) : new TTDetailScrollerLayout.LayoutParams(-1, -2);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
        } else if (this.c) {
        } else {
            a();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c = false;
    }
}
