package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f13145a = new a();
    private volatile boolean b = false;

    static {
        kge.a(1144530003);
    }

    public void a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d57028", new Object[]{this, new Integer(i), bVar});
            return;
        }
        a();
        int a2 = this.f13145a.a(i);
        if (a2 == -1) {
            bVar.a();
        } else {
            bVar.a(a2);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b) {
        } else {
            this.b = true;
            a("#f0f0f0", "#111111");
            a("#f2f2f2", "#111111");
            a("#ffffff", "#222222");
            a("#FAFAFA", "#333333");
            a("#111111", "#EEEEEE");
            a("#333333", "#EEEEEE");
            a("#051b28", "#EEEEEE");
            a("#666666", "#aaaaaa");
            a("#999999", "#888888");
            a("#dddddd", "#777777");
            a("#cccccc", "#777777");
            a("#dcdcdc", "#777777");
            a("#eeeeee", "#383838");
            a("#ff5000", "#ff5000");
            a("#ff5500", "#ff5500");
            a("#FDA638", "#FDA638");
            a("#007AFF", "#0084FF");
            a("#34C759", "#30D158");
            a("#5856D6", "#5E5CE6");
            a("#FF2C55", "#FE375F");
            a("#AF52DE", "#BF59F2");
            a("#FF3B30", "#FF453A");
            a("#5BC7F9", "#63D2FF");
            a("#FFCC01", "#FFD60B");
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f13145a.a(Color.parseColor(str), Color.parseColor(str2));
        }
    }
}
