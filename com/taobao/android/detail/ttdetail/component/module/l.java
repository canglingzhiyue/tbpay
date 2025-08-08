package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.ezg;
import tb.kge;

/* loaded from: classes4.dex */
public class l extends k implements com.taobao.android.detail.ttdetail.widget.draglayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f10548a;

    static {
        kge.a(-208568832);
        kge.a(887644476);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(l lVar, String str, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130503af", new Object[]{lVar, str, imageView});
        } else {
            lVar.a(str, imageView);
        }
    }

    public l(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.f10548a = new j(-1, -1, 17);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : a(view);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.f10548a;
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.iv_image_content) {
            com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
            if (a2 != null) {
                view = a2.a(this.mContext, R.layout.tt_detail_image_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_image_component, (ViewGroup) null);
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image_content);
        final String a3 = com.taobao.android.detail.ttdetail.utils.l.a(d());
        if (imageView instanceof TTObservedImageView) {
            ((TTObservedImageView) imageView).setObserveListener(this.c);
        }
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_image_mask);
        final boolean e = e();
        if (!e) {
            i = 8;
        }
        imageView2.setVisibility(i);
        imageView2.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.component.module.l.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (e) {
                    l.a(l.this, a3, imageView2);
                } else {
                    com.taobao.android.detail.ttdetail.utils.q.a(imageView2, (String) null);
                }
            }
        });
        com.taobao.android.detail.ttdetail.utils.q.a(imageView, a3);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.component.module.l.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                h hVar = (h) l.this.getParentComponent();
                String b = hVar != null ? ((ezc) hVar.getComponentData()).b() : null;
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                l.this.triggerClickEvent(new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.handler.bizhandlers.a.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.IMAGE_COMPONENT), new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.handler.bizhandlers.a.KEY_FRAME_COMPONENT_ID, b), new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.handler.bizhandlers.a.KEY_TRIGGER_VIEW_RECT, new Rect(iArr[0], iArr[1], iArr[0] + view2.getWidth(), iArr[1] + view2.getHeight())));
            }
        });
        return view;
    }

    private void a(final String str, final ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84801d6c", new Object[]{this, str, imageView});
        } else if (StringUtils.isEmpty(str)) {
            com.taobao.android.detail.ttdetail.utils.i.a("ImageComponent", "loadBgMask url is empty");
        } else {
            bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.component.module.l.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.q.a(imageView);
                    com.taobao.phenix.intf.b.h().a(com.taobao.android.detail.ttdetail.utils.q.e(imageView, str)).bitmapProcessors(new com.taobao.phenix.compat.effects.b(l.this.mContext, 25)).schedulePriority(4).limitSize(imageView).into(imageView);
                }
            });
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.k
    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : d();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d == null) {
            return null;
        }
        return d.getString("url");
    }

    private boolean e() {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        ezg a2 = this.mComponentData.a();
        if (a2 != null && (e = a2.e()) != null) {
            return "true".equals(e.getString("enableBgMask"));
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.a
    public Rect c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("61daa133", new Object[]{this});
        }
        if (this.mView == null || this.mView.getWindowToken() == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + this.mView.getWidth(), iArr[1] + this.mView.getHeight());
    }
}
