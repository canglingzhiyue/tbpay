package com.taobao.android;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes4.dex */
public class AliNavImp implements AliNavInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Nav f8602a;

    public AliNavImp(Nav nav) {
        this.f8602a = nav;
    }

    @Override // com.taobao.android.AliNavInterface
    public AliNavInterface a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("a07820f8", new Object[]{this, bundle});
        }
        this.f8602a.withExtras(bundle);
        return this;
    }

    @Override // com.taobao.android.AliNavInterface
    public AliNavInterface a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("4659f669", new Object[]{this, new Integer(i)});
        }
        this.f8602a.withFlags(i);
        return this;
    }

    @Override // com.taobao.android.AliNavInterface
    public AliNavInterface b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNavInterface) ipChange.ipc$dispatch("d2fa216a", new Object[]{this, new Integer(i)});
        }
        this.f8602a.forResult(i);
        return this;
    }

    @Override // com.taobao.android.AliNavInterface
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f8602a.toUri(str);
    }

    @Override // com.taobao.android.AliNavInterface
    public boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue() : this.f8602a.toUri(uri);
    }

    @Override // com.taobao.android.AliNavInterface
    public Uri a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("da09ca35", new Object[]{this, str, jSONObject}) : Uri.parse(str);
    }
}
