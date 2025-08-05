package com.android.alibaba.ip.server;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class InstantRunContentProvider extends PreferencesProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1958589221);
    }

    public static /* synthetic */ Object ipc$super(InstantRunContentProvider instantRunContentProvider, String str, Object... objArr) {
        if (str.hashCode() == 413640390) {
            return new Boolean(super.onCreate());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.android.alibaba.ip.server.PreferencesProvider
    public String getAuthorities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e29c5ee", new Object[]{this});
        }
        return getContext().getPackageName() + "." + InstantRunContentProvider.class.getName();
    }

    @Override // com.android.alibaba.ip.server.PreferencesProvider, android.content.ContentProvider
    public boolean onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a7a6c6", new Object[]{this})).booleanValue();
        }
        super.onCreate();
        InstantPatcher.create(getContext());
        return true;
    }
}
