package com.taobao.bootimage.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.taobao.R;
import java.io.File;
import tb.kej;
import tb.kel;
import tb.kem;
import tb.keo;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View m;
    public ImageView n;

    static {
        kge.a(518100514);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 91915245) {
            return new Boolean(super.b());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(Context context, BootImageInfo bootImageInfo, ViewGroup viewGroup) {
        super(context, bootImageInfo);
        this.m = null;
        if (viewGroup != null) {
            this.g = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.bootimage_image_coldstart, viewGroup, false);
            if (this.g == null) {
                return;
            }
            this.m = this.g.findViewById(R.id.bootimage_ad_layouer);
            this.n = (ImageView) this.g.findViewById(R.id.bootimage_ad_layouer_image);
            this.f16713a = (TextView) this.g.findViewById(R.id.textview);
            View findViewById = this.g.findViewById(R.id.close);
            if (kel.f30008a) {
                findViewById.setVisibility(0);
                if (findViewById == null) {
                    return;
                }
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.view.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        kej.a(kem.TAG, "BootImageImageController closeView onclick");
                        if (d.this.d != null) {
                            d.this.d.a(com.taobao.bootimage.d.CLOSE_TYPE_SKIP);
                        }
                        d.this.a();
                    }
                });
                return;
            }
            findViewById.setVisibility(8);
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Context context = this.i.get();
        if (this.h == null || StringUtils.isEmpty(this.h.imgUrl) || context == null || this.g == null || this.m == null) {
            kej.a("BootImageColdStartController", "show false");
            return false;
        } else if (!super.b()) {
            kej.a("BootImageColdStartController", "show super false");
            return false;
        } else {
            try {
                String c = keo.c(this.h.imgUrl);
                if (!StringUtils.isEmpty(c)) {
                    File file = new File(keo.d("Market"), c);
                    if (!file.exists()) {
                        kej.a("BootImageColdStartController", "pic is not exist");
                        return false;
                    }
                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    decodeFile.setDensity(320);
                    this.n.setImageBitmap(decodeFile);
                    this.n.setVisibility(4);
                    if (keo.c((Activity) context)) {
                        int b = keo.b(context);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
                        layoutParams.bottomMargin = b;
                        this.m.setLayoutParams(layoutParams);
                    }
                    return true;
                }
            } catch (Throwable th) {
                kej.a("BootImageColdStartController", "do show exception", th);
            }
            kej.a("BootImageColdStartController", "do show false");
            return false;
        }
    }
}
