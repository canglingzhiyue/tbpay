package com.taobao.android.fcanvas.integration;

import android.text.TextUtils;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final b b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WeakReference<TextureView>> f12325a = new HashMap(8);

    static {
        kge.a(387880241);
        b = new b();
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("907b7f1a", new Object[0]) : b;
    }

    public void a(String str, TextureView textureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30cb146b", new Object[]{this, str, textureView});
        } else if (textureView == null || TextUtils.isEmpty(str)) {
        } else {
            this.f12325a.put(str, new WeakReference<>(textureView));
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f12325a.remove(str);
        }
    }

    public TextureView b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("20f93c3c", new Object[]{this, str});
        }
        WeakReference<TextureView> weakReference = this.f12325a.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
