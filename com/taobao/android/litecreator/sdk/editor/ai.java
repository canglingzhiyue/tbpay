package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Image;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import javax.inject.Inject;
import tb.hel;
import tb.hen;
import tb.kge;

/* loaded from: classes5.dex */
public class ai extends al<x> implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Inject

    /* renamed from: a  reason: collision with root package name */
    public hen f13391a;
    private e b = d.a();

    static {
        kge.a(2068479723);
        kge.a(-291605433);
    }

    public ai() {
        a(this);
    }

    public x a(hel helVar, Image image, ImageEditInfo imageEditInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("507220d3", new Object[]{this, helVar, image, imageEditInfo}) : new ak(helVar, this, image, imageEditInfo);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.e
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d578e1", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.e
    public void a(ai aiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eecac6", new Object[]{this, aiVar});
        } else {
            this.b.a(aiVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f13391a.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f13391a.b();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f13391a.c();
        }
    }
}
