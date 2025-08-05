package com.taobao.android.layoutmanager.adapter.impl;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class h implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1512822177);
        kge.a(-612164948);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.l
    public Pair<Uri, Boolean> a(Context context, Uri uri, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("44311717", new Object[]{this, context, uri, new Boolean(z), new Boolean(z2), new Boolean(z3)}) : com.taobao.android.layoutmanager.a.a(context, uri, z, z2, z3);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.l
    public Uri a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d0a98fd6", new Object[]{this, uri, new Boolean(z), new Boolean(z2)}) : com.taobao.android.layoutmanager.a.a(uri, z, z2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.l
    public boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue() : com.taobao.android.layoutmanager.a.b(uri);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.l
    public boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
        }
        String uri2 = uri == null ? "" : uri.toString();
        return uri2.contains("/app/tb-source-app/video-fullpage/pages/index2") || uri2.contains("/video-fullpage/transparent-videolist.html");
    }
}
