package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fjp;
import tb.gbg;
import tb.kge;
import tb.mfg;
import tb.pqj;
import tb.tip;

/* loaded from: classes6.dex */
public class a extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTAOLIVEJELLYMARQUEE_AUTOSCROLL = 2581999839571595826L;
    public static final long DXTAOLIVEJELLYMARQUEE_ISCACHE = 4954174782170669367L;
    public static final long DXTAOLIVEJELLYMARQUEE_MARQUEELISTDATA = -7994418844692357355L;
    public static final long DXTAOLIVEJELLYMARQUEE_ONCHANGE = 5288679823228297259L;
    public static final long DXTAOLIVEJELLYMARQUEE_TAOLIVEJELLYMARQUEE = 714296102135946647L;
    public static final int EVENT_TAOLIVE_FAXIAN_RECYCLER_SCROLL_LISTENER = 20001;
    public static final int EVENT_TAOLIVE_FAXIAN_SELECTED = 20002;
    public static final String EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND = "com.taobao.live.home.top_marquee_background";
    public static final String TAG;
    private boolean b;
    private boolean c;
    private JSONArray d;
    private List<FlexiblePageViewEntity> e;
    private int f;
    private int g;
    private int h;
    private FlexibleMarqueeGallery i;
    private b j;
    private boolean k = true;
    private boolean l = true;

    /* renamed from: a  reason: collision with root package name */
    public int f14150a = 0;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ JSONArray a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("2ea1f1db", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbafd27", new Object[]{aVar, jSONObject, new Boolean(z)});
        } else {
            aVar.a(jSONObject, z);
        }
    }

    public static /* synthetic */ b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d905191c", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ List c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3d543ce6", new Object[]{aVar}) : aVar.e;
    }

    static {
        kge.a(-1258121863);
        TAG = a.class.getSimpleName();
    }

    /* renamed from: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0544a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2002984112);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            a aVar = (a) dXWidgetNode;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.i = new FlexibleMarqueeGallery(context);
        return this.i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        this.k = i.D();
        this.f14150a = 0;
        if (this.i == null) {
            if (!(view instanceof FlexibleMarqueeGallery)) {
                return;
            }
            this.i = (FlexibleMarqueeGallery) view;
        }
        String str = TAG;
        TLog.loge(str, "onRenderView " + this.d.toJSONString());
        this.g = gbg.b(context, 105.0f);
        this.f = a(174);
        this.h = a(83);
        int a2 = c.a();
        int i = ((a2 - this.f) - (this.h << 1)) / 4;
        int i2 = a2 - (i << 1);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        marginLayoutParams.width = i2;
        marginLayoutParams.height = this.g;
        marginLayoutParams.setMargins(i, 0, i, 0);
        this.i.setLayoutParams(marginLayoutParams);
        this.i.setEnableScaleAnime(true);
        this.i.setGalleryDisplayWidth(i2);
        this.i.setFoldedCardWidth(this.h);
        this.i.setFoldedCardVisibleCount(2);
        this.i.setCardHeight(this.g);
        this.i.setCardSpacing(i);
        this.i.setCardCornerRadius(a(6));
        this.i.setScrollAnimDuration(1000L);
        this.i.setBezierFactors(0.3f, 0.0f, 0.25f, 1.0f);
        this.i.setScaleAnimeMinValue(0.9f);
        this.i.setMoveAnimeDelayDistanceRate(0.09f);
        this.i.setOnGalleryScrollListener(new AbsFlexibleMarqueeGallery.e() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.e
            public void a(int i3, int i4, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i3), new Integer(i4), new Boolean(z)});
                    return;
                }
                if (a.a(a.this) != null) {
                    int size = i3 % a.a(a.this).size();
                    if (a.a(a.this) != null) {
                        JSONObject jSONObject = a.a(a.this).getJSONObject(size);
                        String string = jSONObject.getString("channelBackgroudImg");
                        if (i.aa()) {
                            string = jSONObject.getString("newBackgroundPicUrl");
                        }
                        mfg.a().a(a.EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, string);
                    }
                }
                if (a.b(a.this) != null) {
                    a.b(a.this).a(i3);
                }
                if (a.c(a.this) == null || a.c(a.this).isEmpty()) {
                    return;
                }
                FlexiblePageViewEntity flexiblePageViewEntity = (FlexiblePageViewEntity) a.c(a.this).get(i3 % a.c(a.this).size());
                FlexiblePageViewEntity flexiblePageViewEntity2 = (FlexiblePageViewEntity) a.c(a.this).get(i4 % a.c(a.this).size());
                a.a(a.this, flexiblePageViewEntity.showMaidian, true);
                if (!StringUtils.isEmpty(flexiblePageViewEntity.channelBackgroudImg)) {
                    a.a(a.this, flexiblePageViewEntity.showMaidianBackground, true);
                }
                a.a(a.this, flexiblePageViewEntity2.showMaidian, false);
            }
        });
        if (this.e == null) {
            this.e = pqj.b(this.d.toJSONString(), FlexiblePageViewEntity.class);
        }
        this.j = new b(this.k, this.c, this.f, this.g, this.h);
        this.j.a(this.e);
        this.i.setAdapter(this.j);
        a();
        FlexibleMarqueeGallery flexibleMarqueeGallery = this.i;
        flexibleMarqueeGallery.setOnCardAnimatePerformListener(new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.b(flexibleMarqueeGallery));
        int i3 = 0;
        while (i3 < 3) {
            List<FlexiblePageViewEntity> list = this.e;
            FlexiblePageViewEntity flexiblePageViewEntity = list.get(i3 % list.size());
            a(flexiblePageViewEntity.showMaidian, i3 == 0);
            if (i3 == 0) {
                if (!StringUtils.isEmpty(flexiblePageViewEntity.channelBackgroudImg)) {
                    a(flexiblePageViewEntity.showMaidianBackground, i3 == 0);
                }
                if (i.aa()) {
                    mfg.a().a(EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, flexiblePageViewEntity.newBackgroundPicUrl);
                } else {
                    mfg.a().a(EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, flexiblePageViewEntity.channelBackgroudImg);
                }
            }
            i3++;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.k && this.b && this.l) {
            com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar = new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c(this.i);
            cVar.a(Integer.MAX_VALUE);
            cVar.a(i.A());
            cVar.c();
        } else if (this.i.getAutoRunner() == null) {
        } else {
            this.i.getAutoRunner().a();
        }
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : ((this.g * i) << 1) / 210;
    }

    private void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        String str = TAG;
        Log.e(str, "track4Show " + this.c);
        if (this.c || jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("pageName");
        String string2 = jSONObject.getString("name");
        HashMap hashMap = new HashMap();
        hashMap.putAll(tip.a(jSONObject.getString("params")));
        hashMap.put(fjp.BIZ_CONTEXT_KEY_CARD_TYPE, z ? "open" : "close");
        k.a(string, string2, hashMap);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXTAOLIVEJELLYMARQUEE_MARQUEELISTDATA) {
            this.d = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTAOLIVEJELLYMARQUEE_AUTOSCROLL) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == 4954174782170669367L) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        Map<String, f> args;
        f fVar;
        f fVar2;
        FlexibleMarqueeGallery flexibleMarqueeGallery;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent != null) {
            if (dXEvent.getEventId() == 20001) {
                Map<String, f> args2 = dXEvent.getArgs();
                if (args2 != null && (fVar2 = args2.get("newState")) != null && fVar2.v() && (flexibleMarqueeGallery = this.i) != null) {
                    int[] iArr = new int[2];
                    flexibleMarqueeGallery.getLocationOnScreen(iArr);
                    this.f14150a = Math.max(this.f14150a, iArr[1]);
                    String str = TAG;
                    TLog.loge(str, "onScrollStateChanged " + iArr[1] + " " + this.f14150a + " " + this.g + " " + fVar2);
                    if (fVar2.w() == 0) {
                        if (iArr[1] == 0 || this.f14150a - iArr[1] > this.g / 2) {
                            if (this.i.getAutoRunner() != null) {
                                this.i.getAutoRunner().a();
                                TLog.loge(TAG, "onScrollStateChanged pause");
                            }
                        } else {
                            a();
                            TLog.loge(TAG, "onScrollStateChanged resume");
                        }
                    }
                }
            } else if (dXEvent.getEventId() == 20002 && (args = dXEvent.getArgs()) != null && (fVar = args.get("isAppear")) != null && fVar.E() && this.i != null) {
                if (fVar.B()) {
                    this.l = true;
                    a();
                    TLog.loge(TAG, "FAXIAN_SELECTED resume");
                } else {
                    this.l = false;
                    if (this.i.getAutoRunner() != null) {
                        this.i.getAutoRunner().a();
                        TLog.loge(TAG, "FAXIAN_SELECTED pause");
                    }
                }
            }
        }
        return super.onEvent(dXEvent);
    }
}
