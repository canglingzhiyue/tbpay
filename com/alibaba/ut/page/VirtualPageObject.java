package com.alibaba.ut.page;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VirtualPageObject extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4228a;
    public int b;
    private Context c;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VirtualPageObject{isSPA=" + this.f4228a + ", mDelegateActivityHashcode=" + this.b + ", mContext=" + this.c + '}';
    }
}
