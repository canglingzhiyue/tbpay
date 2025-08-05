package com.taobao.taolive.room;

import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taolive.room.ui.swipeback.SwipeBackLayout;
import com.taobao.taolive.room.ui.swipeback.a;
import com.taobao.taolive.room.ui.swipeback.b;
import tb.kge;

/* loaded from: classes8.dex */
public class SwipeBackActivity extends CustomBaseActivity implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f21492a;

    static {
        kge.a(538435504);
        kge.a(-59574792);
    }

    public static /* synthetic */ Object ipc$super(SwipeBackActivity swipeBackActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1835627922) {
            super.onPostCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1874373038) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.findViewById(((Number) objArr[0]).intValue());
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.f21492a = new b(this);
        this.f21492a.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d697592", new Object[]{this, bundle});
            return;
        }
        super.onPostCreate(bundle);
        this.f21492a.b();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public View findViewById(int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        View findViewById = super.findViewById(i);
        return (findViewById != null || (bVar = this.f21492a) == null) ? findViewById : bVar.a(i);
    }

    public SwipeBackLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwipeBackLayout) ipChange.ipc$dispatch("65398a3b", new Object[]{this}) : this.f21492a.c();
    }

    @Override // com.taobao.taolive.room.ui.swipeback.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a().setEnableGesture(z);
        }
    }
}
