package com.taobao.android.launcher.bootstrap.tao.biz.touch;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.sxs;

/* loaded from: classes5.dex */
public class ViewListDelegate extends ArrayList<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sxs taskRunner;

    public static /* synthetic */ Object ipc$super(ViewListDelegate viewListDelegate, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((ViewListDelegate) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ViewListDelegate(sxs sxsVar) {
        this.taskRunner = sxsVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df3d232e", new Object[]{this, view})).booleanValue();
        }
        if (!this.taskRunner.a()) {
            b.a(view, this.taskRunner);
        }
        return super.add((ViewListDelegate) view);
    }
}
