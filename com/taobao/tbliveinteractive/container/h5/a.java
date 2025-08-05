package com.taobao.tbliveinteractive.container.h5;

import android.content.Context;
import android.os.Bundle;
import android.taobao.util.k;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends android.support.design.widget.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TaoLiveWebBottomFragment f22112a;

    static {
        kge.a(252015255);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -451962688) {
            super.onRestoreInstanceState((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 359041003) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.onSaveInstanceState();
        }
    }

    public a(Context context) {
        super(context);
    }

    public a(Context context, int i, TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        super(context, i);
        this.f22112a = taoLiveWebBottomFragment;
    }

    @Override // android.support.design.widget.b, android.support.v7.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setType(1000);
        window.clearFlags(2);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("156687eb", new Object[]{this});
        }
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState.containsKey("android:dialogShowing") && onSaveInstanceState.getBoolean("android:dialogShowing")) {
            onSaveInstanceState.remove("android:dialogHierarchy");
            onSaveInstanceState.putBoolean("TaoLiveBottomWebFragment:shouldRestore", true);
            k.a("CustomBottomDialog", "取消：TaoLiveWebBottomFragment 自动重建! 防止上屏");
        }
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
            return;
        }
        super.onRestoreInstanceState(bundle);
        if (!bundle.containsKey("TaoLiveBottomWebFragment:shouldRestore") || !bundle.getBoolean("TaoLiveBottomWebFragment:shouldRestore")) {
            return;
        }
        k.a("CustomBottomDialog", "Activity 自动恢复或切换横竖屏取消上屏!");
        TaoLiveWebBottomFragment taoLiveWebBottomFragment = this.f22112a;
        if (taoLiveWebBottomFragment == null) {
            return;
        }
        taoLiveWebBottomFragment.dismissAllowingStateLoss();
    }
}
