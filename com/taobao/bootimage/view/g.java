package com.taobao.bootimage.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import tb.kej;
import tb.kem;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView m;

    static {
        kge.a(1766569823);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == 91915245) {
            return new Boolean(super.b());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ImageView a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("5adb32ad", new Object[]{gVar}) : gVar.m;
    }

    public g(Context context, BootImageInfo bootImageInfo, ViewGroup viewGroup) {
        super(context, bootImageInfo);
        if (viewGroup != null) {
            this.g = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.bootimage_image, viewGroup, false);
            if (this.g == null) {
                return;
            }
            this.m = (ImageView) this.g.findViewById(R.id.show_image);
            this.f16713a = (TextView) this.g.findViewById(R.id.textview);
            View findViewById = this.g.findViewById(R.id.close);
            View findViewById2 = this.g.findViewById(R.id.click_image);
            if (!StringUtils.isEmpty(this.h.targetUrl) && findViewById2 != null) {
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.view.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        kej.a(kem.TAG, "targetUrl onClick show image: click jump");
                        if (StringUtils.isEmpty(g.this.h.targetUrl)) {
                            return;
                        }
                        if (g.this.d != null) {
                            g.this.d.b("BootImage_Image_Click");
                        }
                        Nav.from(com.taobao.bootimage.f.b()).toUri(g.this.h.targetUrl);
                        if (g.this.f == null) {
                            return;
                        }
                        g.this.f.sendEmptyMessageDelayed(10, 1000L);
                    }
                });
            }
            if (findViewById == null) {
                return;
            }
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.view.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    kej.a(kem.TAG, "BootImageImageController closeView onclick");
                    if (g.this.d != null) {
                        g.this.d.a(com.taobao.bootimage.d.CLOSE_TYPE_SKIP);
                    }
                    g.this.a();
                }
            });
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        kej.a(kem.TAG, "BootImageImageController show image: start");
        if (this.h == null || StringUtils.isEmpty(this.h.imgUrl) || this.i.get() == null || this.g == null) {
            kej.a(kem.TAG, "BootImageImageController show image failed: data error.");
            return false;
        } else if (!super.b()) {
            return false;
        } else {
            final String str = this.h.imgUrl;
            PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, str);
            a2.mo1206onlyCache();
            a2.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.view.g.3
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
                    kej.a(kem.TAG, "BootImageImageController show image: load image success, url=" + str);
                    if (g.this.e) {
                        if (g.a(g.this) != null) {
                            g.a(g.this).setImageDrawable(succPhenixEvent.getDrawable());
                        }
                        g.this.c();
                        if (g.this.d != null) {
                            g.this.d.a();
                        }
                    } else {
                        kej.a(kem.TAG, "BootImageImageController show image: load image failed, resources is release.");
                    }
                    return true;
                }
            });
            a2.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.view.g.4
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
                    if (g.this.e && g.this.d != null) {
                        g.this.d.a(102);
                        g.this.a();
                    }
                    kej.a(kem.TAG, "BootImageImageController show image: load image failed, code " + failPhenixEvent.getResultCode() + ", url=" + str);
                    return true;
                }
            });
            a2.fetch();
            return true;
        }
    }
}
