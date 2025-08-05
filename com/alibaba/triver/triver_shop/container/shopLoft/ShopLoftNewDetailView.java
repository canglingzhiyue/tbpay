package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopLoftNewDetailView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f3708a;
    private JSONObject b;
    private JSONObject c;
    private Context d;
    private b.c e;
    private final kotlin.d f = kotlin.e.a(new ShopLoftNewDetailView$rootView$2(this));
    private ShopWrapWebView g;

    static {
        kge.a(-697181795);
        kge.a(-563039837);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    private final HorizontalSwipeLayoutV2 a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HorizontalSwipeLayoutV2) ipChange.ipc$dispatch("4eccee84", new Object[]{this}) : (HorizontalSwipeLayoutV2) this.f.getValue();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        if (context != null) {
            this.d = context;
        }
        this.b = jSONObject;
        if (jSONObject != null) {
            this.f3708a = jSONObject.getString("ndPageUrl");
            this.c = jSONObject.getJSONObject("spmParams");
        }
        this.e = cVar;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        play();
        WVStandardEventCenter.postNotificationToJS(this.g, "shopContentList.viewAppear", "");
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS(this.g, "shopContentList.viewDisappear", "");
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        ceg.Companion.b("newDetail play");
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView != null) {
            if (shopWrapWebView == null) {
                return;
            }
            shopWrapWebView.onResume();
            return;
        }
        Context context = this.d;
        if (context != null) {
            ShopWrapWebView shopWrapWebView2 = new ShopWrapWebView(context);
            this.g = shopWrapWebView2;
            shopWrapWebView2.getShopLoftWebViewBizAdapter().a(this.b);
            shopWrapWebView2.loadUrl(this.f3708a);
            shopWrapWebView2.setBackgroundColor(-16777216);
            o.a(a(), shopWrapWebView2);
            return;
        }
        q.b("context");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView != null) {
            shopWrapWebView.onPause();
        }
        ceg.Companion.b("newDetail paused");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r4.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        r0.destroy();
     */
    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroyed() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftNewDetailView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "bf354a81"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2f
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r0 = r4.g     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L19
            goto L20
        L19:
            boolean r0 = r0.isDestroied()     // Catch: java.lang.Throwable -> L2f
            if (r0 != r3) goto L20
            r2 = 1
        L20:
            if (r2 != 0) goto L29
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r0 = r4.g     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L29
            r0.destroy()     // Catch: java.lang.Throwable -> L2f
        L29:
            kotlin.t r0 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> L2f
            kotlin.Result.m2371constructorimpl(r0)     // Catch: java.lang.Throwable -> L2f
            goto L39
        L2f:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.i.a(r0)
            kotlin.Result.m2371constructorimpl(r0)
        L39:
            r0 = 0
            r4.g = r0
            com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftNewDetailView$HorizontalSwipeLayoutV2 r0 = r4.a()
            r0.removeAllViews()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftNewDetailView.onDestroyed():void");
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView == null) {
            return;
        }
        g.a(shopWrapWebView);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        pause();
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView == null) {
            return;
        }
        g.b(shopWrapWebView);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        } else {
            play();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        return (jSONObject == null || (string = jSONObject.getString("arg1")) == null) ? "Page_NewDetail" : string;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        String string;
        String string2;
        String queryParameter;
        String string3;
        String string4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.c;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("args");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    String key = entry.getKey();
                    q.b(key, "entry.key");
                    hashMap.put(key, entry.getValue().toString());
                }
            }
        }
        String str = "";
        if (hashMap.get("shop_id") == null) {
            HashMap hashMap2 = hashMap;
            JSONObject jSONObject3 = this.b;
            if (jSONObject3 == null || (string4 = jSONObject3.getString("shopId")) == null) {
                string4 = str;
            }
            hashMap2.put("shop_id", string4);
        }
        if (hashMap.get("seller_id") == null) {
            HashMap hashMap3 = hashMap;
            JSONObject jSONObject4 = this.b;
            if (jSONObject4 == null || (string3 = jSONObject4.getString("sellerId")) == null) {
                string3 = str;
            }
            hashMap3.put("seller_id", string3);
        }
        if (hashMap.get("item_id") == null) {
            HashMap hashMap4 = hashMap;
            Uri parse = Uri.parse(this.f3708a);
            if (parse == null || (queryParameter = parse.getQueryParameter("itemId")) == null) {
                queryParameter = str;
            }
            hashMap4.put("item_id", queryParameter);
        }
        if (hashMap.get("newDetailChannel") == null) {
            hashMap.put("newDetailChannel", "shopdetailcard");
        }
        if (hashMap.get("entrySpm") == null) {
            HashMap hashMap5 = hashMap;
            JSONObject jSONObject5 = this.b;
            if (jSONObject5 == null || (string2 = jSONObject5.getString("entrySpm")) == null) {
                string2 = str;
            }
            hashMap5.put("entrySpm", string2);
        }
        HashMap hashMap6 = hashMap;
        JSONObject jSONObject6 = this.b;
        if (jSONObject6 != null && (string = jSONObject6.getString("source")) != null) {
            str = string;
        }
        hashMap6.put("entrySource", str);
        return hashMap6;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : a();
    }

    /* loaded from: classes3.dex */
    public final class HorizontalSwipeLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private float startX;
        private float startY;
        private int swipeThreshold;
        public final /* synthetic */ ShopLoftNewDetailView this$0;

        static {
            kge.a(-247606183);
        }

        public static /* synthetic */ Object ipc$super(HorizontalSwipeLayout horizontalSwipeLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorizontalSwipeLayout(ShopLoftNewDetailView this$0, Context context) {
            super(context);
            q.d(this$0, "this$0");
            q.d(context, "context");
            this.this$0 = this$0;
            this.swipeThreshold = 20;
        }

        public final int getSwipeThreshold() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f169c41", new Object[]{this})).intValue() : this.swipeThreshold;
        }

        public final void setSwipeThreshold(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2021fe9", new Object[]{this, new Integer(i)});
            } else {
                this.swipeThreshold = i;
            }
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue() : this.alreadyDetect;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue() : this.startX;
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue() : this.startY;
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            RecyclerView findRecyclerView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.startX = 0.0f;
                this.startY = 0.0f;
                this.alreadyDetect = false;
                RecyclerView findRecyclerView2 = findRecyclerView();
                if (findRecyclerView2 != null) {
                    findRecyclerView2.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (motionEvent.getAction() == 0) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
            }
            if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(this.startX - x);
                float abs2 = Math.abs(this.startY - y);
                double d = 2;
                float sqrt = (float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)));
                if (abs2 <= abs && sqrt >= 20.0f && (findRecyclerView = findRecyclerView()) != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(true);
                }
                this.alreadyDetect = true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        private final RecyclerView findRecyclerView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("c84ffe60", new Object[]{this});
            }
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RecyclerView) {
                    return (RecyclerView) parent;
                }
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public final class HorizontalSwipeLayoutV2 extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private int moveEventCount;
        private float startX;
        private float startY;
        private int swipeThreshold;
        public final /* synthetic */ ShopLoftNewDetailView this$0;

        static {
            kge.a(-1726337867);
        }

        public static /* synthetic */ Object ipc$super(HorizontalSwipeLayoutV2 horizontalSwipeLayoutV2, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorizontalSwipeLayoutV2(ShopLoftNewDetailView this$0, Context context) {
            super(context);
            q.d(this$0, "this$0");
            q.d(context, "context");
            this.this$0 = this$0;
            this.swipeThreshold = 20;
        }

        public final int getSwipeThreshold() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f169c41", new Object[]{this})).intValue() : this.swipeThreshold;
        }

        public final void setSwipeThreshold(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2021fe9", new Object[]{this, new Integer(i)});
            } else {
                this.swipeThreshold = i;
            }
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue() : this.alreadyDetect;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue() : this.startX;
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue() : this.startY;
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        public final int getMoveEventCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("79ae98b6", new Object[]{this})).intValue() : this.moveEventCount;
        }

        public final void setMoveEventCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a69b214", new Object[]{this, new Integer(i)});
            } else {
                this.moveEventCount = i;
            }
        }

        private final void clearStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
                return;
            }
            this.startX = 0.0f;
            this.startY = 0.0f;
            this.alreadyDetect = false;
            this.moveEventCount = 0;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                clearStatus();
                RecyclerView findRecyclerView = findRecyclerView();
                if (findRecyclerView != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (motionEvent.getAction() == 0) {
                clearStatus();
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                RecyclerView findRecyclerView2 = findRecyclerView();
                if (findRecyclerView2 != null) {
                    findRecyclerView2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
                this.moveEventCount++;
                if (this.moveEventCount == 3) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float abs = Math.abs(this.startX - x);
                    float abs2 = Math.abs(this.startY - y);
                    double d = 2;
                    float sqrt = (float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)));
                    RecyclerView findRecyclerView3 = findRecyclerView();
                    if (abs2 > abs || sqrt < 20.0f) {
                        if (findRecyclerView3 != null) {
                            findRecyclerView3.requestDisallowInterceptTouchEvent(false);
                        }
                    } else if (findRecyclerView3 != null) {
                        findRecyclerView3.requestDisallowInterceptTouchEvent(true);
                    }
                    this.alreadyDetect = true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        private final RecyclerView findRecyclerView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("c84ffe60", new Object[]{this});
            }
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RecyclerView) {
                    return (RecyclerView) parent;
                }
            }
            return null;
        }
    }
}
