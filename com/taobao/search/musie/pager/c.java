package com.taobao.search.musie.pager;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class c extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f19264a;

    static {
        kge.a(382791636);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1154160711) {
            if (hashCode != 1508002586) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.calculateDxToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
        }
        return new Integer(super.calculateDyToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int getHorizontalSnapPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f19bf9", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
        }
        return -1;
    }

    public c(Context context, int i) {
        super(context);
        this.f19264a = i;
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int calculateDxToMakeVisible(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59e24b1a", new Object[]{this, view, new Integer(i)})).intValue() : super.calculateDxToMakeVisible(view, i) + this.f19264a;
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int calculateDyToMakeVisible(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i)})).intValue();
        }
        q.c(view, "view");
        return super.calculateDyToMakeVisible(view, i) + this.f19264a;
    }
}
