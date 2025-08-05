package com.taobao.android.tab2liveroom.liveroom;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ogl;

/* loaded from: classes6.dex */
public class b extends ogl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map b;
    public String i;
    public Map j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;

    /* renamed from: a  reason: collision with root package name */
    public String f15288a = a.DEFAULT_REFRESH_URL;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 5000;
    public String h = com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE_mixLive;

    static {
        kge.a(-2068004355);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2079543418) {
            super.a((Context) objArr[0], (String) objArr[1], objArr[2]);
            return null;
        } else if (hashCode != -1185345197) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Context) objArr[0], (HashMap) objArr[1]);
            return null;
        }
    }

    @Override // tb.ogl
    public void a(Context context, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
            return;
        }
        super.a(context, hashMap);
        if (!oeb.a(this.l, this.n)) {
            return;
        }
        this.ar = 0.0f;
        this.am = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r9.equals("bottomOffset") != false) goto L10;
     */
    @Override // tb.ogl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tab2liveroom.liveroom.b.a(android.content.Context, java.lang.String, java.lang.Object):void");
    }

    public float g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[]{this})).floatValue() : this.c;
    }

    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.d;
    }

    public float j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue() : this.e;
    }

    public float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue() : this.f;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.k;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.l;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.n;
    }
}
