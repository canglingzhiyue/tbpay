package com.taobao.bootimage.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import tb.iqn;
import tb.iqo;
import tb.kej;
import tb.kel;
import tb.kge;
import tb.nwp;

/* loaded from: classes6.dex */
public class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iqn c;
    private ImageView m;
    private FrameLayout n;
    private TextView o;

    static {
        kge.a(-224195403);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915245) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.b());
        }
    }

    public static /* synthetic */ ImageView a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("83b69ab", new Object[]{eVar}) : eVar.m;
    }

    public static /* synthetic */ iqn b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iqn) ipChange.ipc$dispatch("2917bcdc", new Object[]{eVar}) : eVar.c;
    }

    public e(Context context, BootImageInfo bootImageInfo, ViewGroup viewGroup) {
        super(context, bootImageInfo);
        if (viewGroup != null) {
            this.g = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.bootimage_image_commercial, viewGroup, false);
            if (this.g == null) {
                return;
            }
            this.m = (ImageView) this.g.findViewById(R.id.show_image);
            ImageView imageView = (ImageView) this.g.findViewById(R.id.iv_taobao_logo);
            ImageView imageView2 = (ImageView) this.g.findViewById(R.id.icon_ipv6_logo);
            this.f16713a = (TextView) this.g.findViewById(R.id.countdown_text);
            View findViewById = this.g.findViewById(R.id.close);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.view.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        kej.a("BootImageCommercialVideoController", "closeView onclick");
                        if (e.this.d != null) {
                            e.this.d.a(com.taobao.bootimage.d.CLOSE_TYPE_SKIP);
                        }
                        e.this.a();
                    }
                });
                this.o = (TextView) this.g.findViewById(R.id.close_txt);
                a(this.o, bootImageInfo);
            }
            if (imageView != null && imageView2 != null && bootImageInfo != null && bootImageInfo.hideTBLogo) {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
            }
            this.n = (FrameLayout) this.g.findViewById(R.id.interact_view_container);
            if (kel.f || bootImageInfo == null) {
                return;
            }
            try {
                this.c = new iqo();
                this.c.a(context, bootImageInfo, com.taobao.bootimage.linked.h.b("").b().getSplashObj());
                BootImageInteractBaseView d = this.c.d();
                if (d == null) {
                    return;
                }
                d.setBootImageContentListener(new nwp() { // from class: com.taobao.bootimage.view.e.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.nwp
                    public void a(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        kej.a("BootImageCommercialVideoController", "closeView clickAd");
                        if (e.this.d != null) {
                            e.this.d.a(str);
                        }
                        e.this.a();
                    }
                });
                this.n.addView(d);
            } catch (Throwable th) {
                th.printStackTrace();
                kej.a("BootImageCommercialVideoController", "getDX bootImageInteractBaseController error = ", th);
            }
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        kej.a("BootImageCommercialVideoController", "show image: start");
        if (this.h == null || TextUtils.isEmpty(this.h.imgUrl) || this.i.get() == null || this.g == null) {
            kej.a("BootImageCommercialVideoController", "show image failed: data error.");
            return false;
        } else if (!super.b()) {
            return false;
        } else {
            final String str = this.h.imgUrl;
            PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, str);
            a2.mo1206onlyCache();
            a2.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.view.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    kej.a("BootImageCommercialVideoController", "show image: load image success, url=" + str);
                    if (e.this.e) {
                        if (e.a(e.this) != null) {
                            e.a(e.this).setImageDrawable(succPhenixEvent.getDrawable());
                        }
                        if (e.b(e.this) != null) {
                            e.b(e.this).b();
                        }
                        e.this.c();
                        if (e.this.d != null) {
                            e.this.d.a();
                        }
                    } else {
                        kej.a("BootImageCommercialVideoController", "show image: load image failed, resources is release.");
                    }
                    return true;
                }
            });
            a2.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.view.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    if (e.this.e && e.this.d != null) {
                        e.this.d.a(102);
                        e.this.a();
                    }
                    kej.a("BootImageCommercialVideoController", "show image: load image failed, code " + failPhenixEvent.getResultCode() + ", url=" + str);
                    return true;
                }
            });
            a2.fetch();
            return true;
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        iqn iqnVar = this.c;
        if (iqnVar == null) {
            return;
        }
        iqnVar.c();
    }

    private void a(TextView textView, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692fed9a", new Object[]{this, textView, bootImageInfo});
        } else if (textView == null || bootImageInfo == null || TextUtils.isEmpty(bootImageInfo.closeTxt)) {
        } else {
            textView.setText(bootImageInfo.closeTxt);
        }
    }
}
