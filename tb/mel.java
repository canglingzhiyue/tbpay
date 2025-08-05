package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.c;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.live.home.dinamic.widget.DXTBLNativeTextView;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.taolive.uikit.api.b;
import com.taobao.taolive.uikit.homepage.a;
import com.taobao.taolive.uikit.homepage.e;
import com.taobao.taolive.uikit.view.TBLCommentView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.mek;

/* loaded from: classes7.dex */
public class mel extends mek implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DinamicDataObject b;
    private TemplateObject c;
    private Context d;
    private ViewGroup e;
    private View f;
    private String g;
    private boolean h;
    private com.taobao.live.home.dinamic.view.a i;
    private TBLiveOpenCardView l;
    private boolean m = false;

    public static /* synthetic */ Object ipc$super(mel melVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1795038358:
                super.a((View) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoRequestAccept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
        }
    }

    public mel(DinamicDataObject dinamicDataObject, Context context, ViewGroup viewGroup) {
        if (dinamicDataObject != null) {
            a(dinamicDataObject);
        }
        this.d = context;
        this.e = viewGroup;
    }

    public void a(com.taobao.live.home.dinamic.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a74682", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public void a(DinamicDataObject dinamicDataObject) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c1165", new Object[]{this, dinamicDataObject});
            return;
        }
        this.b = dinamicDataObject;
        try {
            if (this.b == null || this.b.data == null || (jSONObject = this.b.data.get("data")) == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() <= 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null || (jSONObject3 = jSONObject2.getJSONObject("liveInfo")) == null || (jSONObject4 = jSONObject3.getJSONObject("queryParams")) == null) {
                return;
            }
            this.g = jSONObject4.getString("feedId");
        } catch (Exception e) {
            mfj.a("CardContainer", "setDinamicDataObject exp.", e);
        }
    }

    public DinamicDataObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicDataObject) ipChange.ipc$dispatch("fceaea27", new Object[]{this}) : this.b;
    }

    public void a(TemplateObject templateObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c46b1a", new Object[]{this, templateObject});
        } else {
            this.c = templateObject;
        }
    }

    public TemplateObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateObject) ipChange.ipc$dispatch("78e5a49f", new Object[]{this}) : this.c;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.b == null || this.d == null) {
        } else {
            try {
                if (LiveHomeController.a().f() == null) {
                    return;
                }
                LiveHomeController.a().f().a(this.d, this.b, new mfe() { // from class: tb.mel.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mfe
                    public void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        } else {
                            mel.this.a(view);
                        }
                    }

                    @Override // tb.mfe
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            mel.this.d();
                        }
                    }
                });
            } catch (Exception e) {
                mfj.a("CardContainer", "inflate view exp.", e);
                mfj.c("CardContainer", "    template name: " + this.b.templateName);
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f == null || this.b == null) {
        } else {
            try {
                if (LiveHomeController.a().f() == null) {
                    return;
                }
                DinamicXEngine a2 = LiveHomeController.a().f().a();
                if (a2 != null && this.b.data != null && (this.f instanceof DXRootView)) {
                    a2.a(this.d, this.b.data.get("data"), ((DXRootView) this.f).getDxTemplateItem(), -1);
                }
                LiveHomeController.a().f().a(this.f, this.b);
            } catch (Exception e) {
                mfj.a("CardContainer", "bind data exp", e);
                mfj.c("CardContainer", "    template name: " + this.b.templateName);
            }
        }
    }

    @Override // tb.mek
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        TBLiveOpenCardView tBLiveOpenCardView = this.l;
        if (tBLiveOpenCardView == null || !tBLiveOpenCardView.isPlaying()) {
            return;
        }
        this.l.stopVideo();
    }

    @Override // tb.mek
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        DinamicDataObject dinamicDataObject = this.b;
        if (dinamicDataObject != null && !pro.e(dinamicDataObject.type) && this.b.type.equals("big_card")) {
            this.b.playOnce = false;
        }
        a(false);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (LiveHomeController.a().f() == null || this.m) {
        } else {
            this.m = true;
            LiveHomeController.a().f().a(this.f);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (LiveHomeController.a().f() == null || !this.m) {
        } else {
            this.m = false;
            LiveHomeController.a().f().b(this.f);
        }
    }

    @Override // tb.mek
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        TBLiveOpenCardView tBLiveOpenCardView = this.l;
        if (tBLiveOpenCardView != null && tBLiveOpenCardView.isPlaying()) {
            this.l.stopVideo();
        }
        this.i = null;
    }

    @Override // tb.mek
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        if (view != null) {
            this.f = view;
            a(b(this.f));
        }
        super.a(view);
    }

    @Override // tb.mek
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            super.d();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!mfm.l() || this.e == null || this.f == null || this.f31050a == null || this.f31050a.size() <= 0 || this.b == null) {
        } else {
            Rect rect = new Rect();
            boolean localVisibleRect = this.f.getLocalVisibleRect(rect);
            if (rect.height() == this.f.getMeasuredHeight()) {
                z = true;
            }
            Iterator<pqt> it = this.f31050a.iterator();
            while (it.hasNext()) {
                pqt next = it.next();
                if (next instanceof DXTBLNativeTextView) {
                    DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) next;
                    if (localVisibleRect && z) {
                        if (!dXTBLNativeTextView.isSelected()) {
                            dXTBLNativeTextView.startLongTextMarquee();
                        }
                    } else if (dXTBLNativeTextView.isSelected()) {
                        dXTBLNativeTextView.cancelLongTextMarquee();
                    }
                }
            }
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!mfm.j() || this.i == null || this.f == null || this.b == null) {
        } else {
            Rect rect = new Rect();
            boolean localVisibleRect = this.f.getLocalVisibleRect(rect);
            if (rect.height() > this.f.getMeasuredHeight() / 2) {
                z = true;
            }
            if (this.b.mShowUtParam || !localVisibleRect || !z) {
                return;
            }
            this.i.onShowUtParams(this, this.b);
            this.b.mShowUtParam = true;
        }
    }

    public void m() {
        DinamicDataObject dinamicDataObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.taobao.live.home.dinamic.view.a aVar = this.i;
        if (aVar == null || (dinamicDataObject = this.b) == null) {
            return;
        }
        aVar.onShowUtParams(this, dinamicDataObject);
    }

    public void a(boolean z) {
        ViewGroup viewGroup;
        com.taobao.live.home.dinamic.view.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if ((this.h && !z) || (viewGroup = this.e) == null || this.f == null) {
        } else {
            int height = viewGroup.getHeight();
            Rect rect = new Rect();
            this.f.getGlobalVisibleRect(rect);
            float f = 0.0f;
            if (height > 0) {
                f = rect.height() / height;
            }
            if (f < mfm.e() || (aVar = this.i) == null) {
                return;
            }
            this.h = aVar.handleAdExposureIfNecessary(this.b);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.e == null || this.f == null || this.f31050a == null || this.f31050a.size() <= 0) {
        } else {
            Iterator<pqt> it = this.f31050a.iterator();
            while (it.hasNext()) {
                pqt next = it.next();
                if (next instanceof TBLCommentView) {
                    ((TBLCommentView) next).setVisibility(0);
                }
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.e == null || this.f == null || this.f31050a == null || this.f31050a.size() <= 0) {
        } else {
            Iterator<pqt> it = this.f31050a.iterator();
            while (it.hasNext()) {
                pqt next = it.next();
                if (next instanceof TBLCommentView) {
                    ((TBLCommentView) next).setVisibility(8);
                }
            }
        }
    }

    public boolean a(boolean z, e eVar, final mek.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad92e5b3", new Object[]{this, new Boolean(z), eVar, bVar})).booleanValue();
        }
        if (this.e != null && this.f != null && this.f31050a != null && this.f31050a.size() > 0 && this.b != null) {
            int height = this.e.getHeight();
            Rect rect = new Rect();
            this.f.getGlobalVisibleRect(rect);
            float f = 0.0f;
            if (height > 0) {
                f = rect.height() / height;
            }
            Iterator<pqt> it = this.f31050a.iterator();
            while (it.hasNext()) {
                pqt next = it.next();
                if ((next instanceof TBLiveOpenCardView) && !this.b.playOnce) {
                    this.l = (TBLiveOpenCardView) next;
                    if (f > 0.6d) {
                        this.l.setPageId(c.PLAY_PAGEID);
                        this.l.setSubBusinessType(c.PLAY_SUBBUSINESS_TYPE);
                        if (mfm.f()) {
                            this.l.setCloseSkipPlaySwitch(true);
                        }
                        this.l.setEnableCoverFade(true);
                        this.l.setAnimateTime(mfm.o());
                        this.b.playOnce = true;
                        return this.l.playVideo(new com.taobao.taolive.uikit.api.a() { // from class: tb.mel.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.uikit.api.a
                            public void onError(int i) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
                                }
                            }

                            @Override // com.taobao.taolive.uikit.api.a
                            public void onInfo(int i) {
                                mek.b bVar2;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
                                } else if (i != 100003 || (bVar2 = bVar) == null) {
                                } else {
                                    bVar2.a();
                                }
                            }
                        }, new b() { // from class: tb.mel.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.uikit.api.b
                            public void onMediaError(int i, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
                                }
                            }

                            @Override // com.taobao.taolive.uikit.api.b
                            public void onMediaInfo(long j, long j2, long j3, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
                                }
                            }
                        });
                    }
                }
            }
        }
        return false;
    }

    private static ArrayList<pqt> b(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("945f57a3", new Object[]{view});
        }
        ArrayList<pqt> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof pqt) {
                arrayList.add((pqt) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<pqt> b = b(viewGroup.getChildAt(i));
                    if (!b.isEmpty()) {
                        arrayList.addAll(b);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        DinamicDataObject dinamicDataObject = this.b;
        if (dinamicDataObject != null && !dinamicDataObject.noNeedSetPlayOnce) {
            this.b.playOnce = true;
        }
        n();
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        o();
        mfg.a().a("com.taobao.live.home.video.auto.play.stop");
    }
}
