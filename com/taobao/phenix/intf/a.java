package com.taobao.phenix.intf;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1844150666);
    }

    /* renamed from: error */
    public a mo1204error(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9010c71c", new Object[]{this, new Integer(i)}) : this;
    }

    /* renamed from: error */
    public a mo1205error(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("61ab681d", new Object[]{this, drawable}) : this;
    }

    public abstract c fetch();

    public abstract c into(ImageView imageView);

    /* renamed from: onlyCache */
    public a mo1206onlyCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("931d4cd3", new Object[]{this}) : this;
    }

    /* renamed from: placeholder */
    public a mo1207placeholder(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4ed47", new Object[]{this, new Integer(i)}) : this;
    }

    /* renamed from: placeholder */
    public a mo1208placeholder(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3633fa12", new Object[]{this, drawable}) : this;
    }

    public String url() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae8274ea", new Object[]{this}) : "";
    }
}
