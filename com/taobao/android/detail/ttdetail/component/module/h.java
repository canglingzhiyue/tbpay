package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.taobao.R;
import tb.emh;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends o<ezc> implements com.taobao.android.detail.ttdetail.communication.g<com.taobao.android.detail.ttdetail.bizmessage.f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f10544a;
    public static final int b;
    public static final int c;
    public static final int d;
    private String e;
    private volatile boolean f;
    private n g;
    private String h;
    private float i;

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(com.taobao.android.detail.ttdetail.bizmessage.f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, fVar})).booleanValue() : a(fVar);
    }

    static {
        kge.a(1944285742);
        kge.a(-767194759);
        f10544a = R.id.cl_frame_root;
        b = R.id.fl_frame_container;
        c = R.id.tt_detail_element_content_id;
        d = R.id.tt_detail_element_float_id;
    }

    public h(Context context, eyx eyxVar, ezc ezcVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, ezcVar, dataEntryArr);
        com.taobao.android.detail.ttdetail.communication.c.a(this.mContext, com.taobao.android.detail.ttdetail.bizmessage.f.class, this);
        l();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.e = null;
        Feature feature = (Feature) this.mDetailContext.a().a(Feature.class);
        if (com.taobao.android.detail.ttdetail.utils.n.b(feature)) {
            this.e = emh.sDefaultDimension;
        }
        boolean b2 = com.taobao.android.detail.ttdetail.widget.video.a.a().b(this.mContext);
        if (com.taobao.android.detail.ttdetail.utils.n.a(this.mContext, feature) || b2) {
            z = true;
        }
        String m = m();
        if (!z && !TextUtils.isEmpty(m)) {
            this.e = m;
        }
        this.i = com.taobao.android.detail.ttdetail.utils.f.a(c());
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        View view2 = null;
        View findViewWithTag = view != null ? view.findViewWithTag(Integer.valueOf(c)) : null;
        d a2 = a(0);
        View componentView = a2.getComponentView(findViewWithTag);
        View findViewWithTag2 = view != null ? view.findViewWithTag(Integer.valueOf(d)) : null;
        d a3 = n() >= 2 ? a(1) : null;
        if (a3 != null) {
            view2 = a3.getComponentView(findViewWithTag2);
        }
        if (componentView == null || view2 == null) {
            if (componentView != null) {
                if (componentView == findViewWithTag) {
                    FrameLayout frameLayout4 = (FrameLayout) view.findViewById(b);
                    if (findViewWithTag2 != null) {
                        frameLayout4.removeView(findViewWithTag2);
                    }
                } else {
                    if (view != null && view.getId() == f10544a) {
                        frameLayout2 = (FrameLayout) view.findViewById(b);
                        frameLayout2.removeAllViews();
                    } else {
                        view = a();
                        frameLayout2 = (FrameLayout) view.findViewById(b);
                    }
                    componentView.setTag(Integer.valueOf(c));
                    j frameSize = a2.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                    frameLayout2.addView(componentView, new FrameLayout.LayoutParams(frameSize.a(), frameSize.b(), frameSize.c()));
                }
            } else if (view2 != null) {
                if (view2 == findViewWithTag2) {
                    FrameLayout frameLayout5 = (FrameLayout) view.findViewById(b);
                    if (findViewWithTag != null) {
                        frameLayout5.removeView(findViewWithTag);
                    }
                } else {
                    if (view != null && view.getId() == f10544a) {
                        frameLayout = (FrameLayout) view.findViewById(b);
                        frameLayout.removeAllViews();
                    } else {
                        view = a();
                        frameLayout = (FrameLayout) view.findViewById(b);
                    }
                    view2.setTag(Integer.valueOf(d));
                    j frameSize2 = a2.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                    frameLayout.addView(view2, new FrameLayout.LayoutParams(frameSize2.a(), frameSize2.b(), frameSize2.c()));
                }
            }
        } else if (componentView != findViewWithTag || view2 != findViewWithTag2) {
            if (componentView == findViewWithTag) {
                FrameLayout frameLayout6 = (FrameLayout) view.findViewById(b);
                if (findViewWithTag2 != null) {
                    frameLayout6.removeView(findViewWithTag2);
                }
                view2.setTag(Integer.valueOf(d));
                j frameSize3 = a3.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                frameLayout6.addView(view2, new FrameLayout.LayoutParams(frameSize3.a(), frameSize3.b(), frameSize3.c()));
            } else if (view2 == findViewWithTag2) {
                FrameLayout frameLayout7 = (FrameLayout) view.findViewById(b);
                if (findViewWithTag != null) {
                    frameLayout7.removeView(findViewWithTag);
                }
                componentView.setTag(Integer.valueOf(c));
                j frameSize4 = a2.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                frameLayout7.addView(componentView, 0, new FrameLayout.LayoutParams(frameSize4.a(), frameSize4.b(), frameSize4.c()));
            } else {
                if (view != null && view.getId() == f10544a) {
                    frameLayout3 = (FrameLayout) view.findViewById(b);
                    frameLayout3.removeAllViews();
                } else {
                    view = a();
                    frameLayout3 = (FrameLayout) view.findViewById(b);
                }
                componentView.setTag(Integer.valueOf(c));
                view2.setTag(Integer.valueOf(d));
                j frameSize5 = a2.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                j frameSize6 = a3.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                frameLayout3.addView(componentView, new FrameLayout.LayoutParams(frameSize5.a(), frameSize5.b(), frameSize5.c()));
                frameLayout3.addView(view2, new FrameLayout.LayoutParams(frameSize6.a(), frameSize6.b(), frameSize6.c()));
            }
        }
        return view == null ? a() : view;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
        if (a2 != null) {
            return a2.a(this.mContext, R.layout.tt_detail_frame_component, null, true);
        }
        return LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_frame_component, (ViewGroup) null);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int n = n();
        for (int i2 = 0; i2 < n; i2++) {
            String a2 = bq.a(a(i2));
            if (!TextUtils.isEmpty(a2)) {
                com.taobao.android.detail.ttdetail.behavior.b.a(this.mContext, a2, i);
                com.taobao.android.detail.ttdetail.behavior.b.a(this.mContext, a2, "isGalleryContent", "true");
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public int getDataTypeHashId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30064ddd", new Object[]{this})).intValue();
        }
        String i = ((ezc) this.mComponentData).i();
        if (i != null) {
            return i.hashCode();
        }
        return -1;
    }

    public Rect b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("28899072", new Object[]{this});
        }
        d a2 = a(0);
        if (!(a2 instanceof com.taobao.android.detail.ttdetail.widget.draglayout.a)) {
            return null;
        }
        return ((com.taobao.android.detail.ttdetail.widget.draglayout.a) a2).c();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.h = str;
        this.i = com.taobao.android.detail.ttdetail.utils.f.a(c());
        r();
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        d a2 = a(0);
        if (a2 instanceof l) {
            return ((l) a2).d();
        }
        if (!(a2 instanceof p)) {
            return null;
        }
        return ((p) a2).q();
    }

    private String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return null;
        }
        return ((p) a2).g();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.h)) {
            return this.h;
        }
        if (!TextUtils.isEmpty(this.e) && k()) {
            return this.e;
        }
        return ((ezc) this.mComponentData).k();
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue();
        }
        float f = this.i;
        return f != 0.0f ? f : com.taobao.android.detail.ttdetail.utils.f.a(c());
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return;
        }
        ((p) a2).a(z);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return;
        }
        ((p) a2).f();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return;
        }
        ((p) a2).i();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!this.f) {
            return false;
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return false;
        }
        this.f = false;
        return ((p) a2).b(false);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        d a2 = a(0);
        if (a2 instanceof p) {
            boolean n = ((p) a2).n();
            this.f = n;
            return n;
        }
        this.f = false;
        return false;
    }

    public String i() {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        eyy h = ((ezc) this.mComponentData).h();
        if (h != null && (d2 = h.d()) != null && !d2.isEmpty()) {
            return d2.getString("videoUrl");
        }
        return null;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return false;
        }
        return ((p) a2).k();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        eyy h = ((ezc) this.mComponentData).h();
        return h != null && "native$headervideo".equals(h.c());
    }

    public void a(VideoView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9f34c7", new Object[]{this, bVar});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return;
        }
        ((p) a2).a(bVar);
    }

    public void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a313e9", new Object[]{this, nVar});
        } else {
            this.g = nVar;
        }
    }

    public FrameLayout o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b93699a3", new Object[]{this});
        }
        d a2 = a(0);
        if (!(a2 instanceof p)) {
            return null;
        }
        return ((p) a2).o();
    }

    public float p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fcce7", new Object[]{this})).floatValue() : d();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.taobao.android.detail.ttdetail.communication.c.a(this.mContext, this);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (this.mView == null || this.mView.getWindowToken() == null) {
        } else {
            int measuredWidth = this.mView.getMeasuredWidth();
            int measuredHeight = this.mView.getMeasuredHeight();
            n nVar = this.g;
            if (nVar == null) {
                return;
            }
            nVar.a(((ezc) this.mComponentData).b(), measuredWidth, measuredHeight, measuredWidth, (int) (measuredWidth / d()));
        }
    }

    public boolean a(com.taobao.android.detail.ttdetail.bizmessage.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ffc15f", new Object[]{this, fVar})).booleanValue();
        }
        if (k() && fVar.a()) {
            l();
            r();
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
