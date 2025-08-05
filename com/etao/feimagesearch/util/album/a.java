package com.etao.feimagesearch.util.album;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.o;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes4.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final String f7015a;

    /* renamed from: com.etao.feimagesearch.util.album.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0249a {
        void a(o oVar);
    }

    static {
        kge.a(-216604528);
        INSTANCE = new a();
        String simpleName = a.class.getSimpleName();
        q.a((Object) simpleName, "SystemAlbumPicker::class.java.simpleName");
        f7015a = simpleName;
    }

    private a() {
    }

    @JvmStatic
    public static final void a(FragmentActivity fragmentActivity, boolean z, InterfaceC0249a interfaceC0249a, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c953c352", new Object[]{fragmentActivity, new Boolean(z), interfaceC0249a, str});
        } else if (fragmentActivity == null) {
        } else {
            a aVar = INSTANCE;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            q.a((Object) supportFragmentManager, "activity.supportFragmentManager");
            aVar.a(supportFragmentManager).pickSingleAlbumSrc(z, interfaceC0249a, str);
        }
    }

    private final SystemAlbumPickerFragment a(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (SystemAlbumPickerFragment) ipChange.ipc$dispatch("5befe00a", new Object[]{this, fragmentManager});
        }
        SystemAlbumPickerFragment b = b(fragmentManager);
        if (b != null) {
            z = false;
        }
        if (z) {
            b = new SystemAlbumPickerFragment();
            fragmentManager.beginTransaction().add(b, f7015a).commitNow();
        }
        if (b == null) {
            q.a();
        }
        return b;
    }

    private final SystemAlbumPickerFragment b(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SystemAlbumPickerFragment) ipChange.ipc$dispatch("5f77830b", new Object[]{this, fragmentManager}) : (SystemAlbumPickerFragment) fragmentManager.findFragmentByTag(f7015a);
    }
}
