package com.taobao.tbugc.adapter;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import tb.jms;
import tb.jmx;
import tb.kge;

/* loaded from: classes9.dex */
public class b implements jms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1863473280);
        kge.a(-1624786599);
    }

    @Override // tb.jms
    public void a(String str, ImageView imageView, jmx jmxVar) {
        com.taobao.phenix.intf.c into;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d929c27", new Object[]{this, str, imageView, jmxVar});
            return;
        }
        int b = jmxVar.b();
        if (b != 0) {
            imageView.setImageResource(b);
        }
        if (imageView.getTag() instanceof com.taobao.phenix.intf.c) {
            ((com.taobao.phenix.intf.c) imageView.getTag()).b();
        }
        PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(imageView.getContext()).a(str);
        if (jmxVar.a() != 0) {
            a2.mo1204error(jmxVar.a());
        }
        if (b != 0) {
            a2.mo1207placeholder(b);
        }
        jmx.a c = jmxVar.c();
        if (c != null) {
            into = a2.into(imageView, c.b(), c.a());
        } else {
            into = a2.into(imageView);
        }
        imageView.setTag(into);
    }

    @Override // tb.jms
    public void a(String str, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84801d6c", new Object[]{this, str, imageView});
            return;
        }
        if (imageView.getTag() instanceof com.taobao.phenix.intf.c) {
            ((com.taobao.phenix.intf.c) imageView.getTag()).b();
        }
        imageView.setTag(com.taobao.phenix.intf.b.h().a(imageView.getContext()).a(str).into(imageView));
    }
}
