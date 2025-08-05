package com.taobao.android.litecreator.sdk.framework.container;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.hdw;
import tb.hex;
import tb.hey;
import tb.hez;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class i extends hez implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hex f13446a;
    private FrameLayout b;
    private List<j> c;

    static {
        kge.a(-462438438);
        kge.a(398807943);
    }

    public abstract void f();

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : "undefine";
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            k.a(new hdw());
        }
    }

    public i(Context context, FrameLayout frameLayout, hey heyVar) {
        this.c = new ArrayList();
        this.b = frameLayout;
        if (heyVar != null) {
            this.f13446a = heyVar.a();
        } else {
            this.f13446a = a(context);
        }
        a(this.f13446a);
        e();
        f();
    }

    public i(FrameLayout frameLayout, hey heyVar) {
        this(null, frameLayout, heyVar);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.d
    public View A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d32c928a", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.d
    public <T extends d> T d(String str) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("75f87684", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "undefine")) {
            return null;
        }
        if (TextUtils.equals(str, o())) {
            return this;
        }
        for (j jVar : this.c) {
            if (jVar != null && (t = (T) jVar.d(str)) != null) {
                return t;
            }
        }
        return null;
    }

    public hex a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hex) ipChange.ipc$dispatch("34c4166b", new Object[]{this, context}) : hex.a(context);
    }

    public void a(j jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5d05ef", new Object[]{this, jVar, str});
            return;
        }
        jVar.a(this.b);
        this.c.add(jVar);
        jVar.a(str);
    }

    public List<j> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4f19870", new Object[]{this}) : this.c;
    }

    public FrameLayout q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("c9971961", new Object[]{this}) : this.b;
    }

    @Override // tb.hez
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (j jVar : this.c) {
            jVar.c();
        }
    }

    @Override // tb.hez
    public void W_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c5db6f", new Object[]{this});
            return;
        }
        for (j jVar : this.c) {
            jVar.W_();
        }
    }

    @Override // tb.hez
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (j jVar : this.c) {
            jVar.d();
        }
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = null;
        UGCVideo g = com.taobao.android.litecreator.base.workflow.e.g(this.r);
        if (g != null && g.getMeta("mediaStatInfo") != null) {
            MediaStatInfo mediaStatInfo = (MediaStatInfo) g.getMeta("mediaStatInfo");
            if (!TextUtils.isEmpty(mediaStatInfo.album_film_template)) {
                hashMap = new HashMap();
                hashMap.put("t_id", mediaStatInfo.album_film_template);
            }
        }
        K().a(this.r, hashMap);
    }

    @Override // tb.hez
    public void X_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7ab40e", new Object[]{this});
            return;
        }
        for (j jVar : this.c) {
            jVar.X_();
        }
    }

    @Override // tb.hez
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (j jVar : this.c) {
            jVar.a(i, i2, intent);
        }
    }

    @Override // tb.hez, tb.hew
    public void Z_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee4654c", new Object[]{this});
        } else {
            this.f13446a.Z_();
        }
    }
}
