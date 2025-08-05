package com.tencent.mm.opensdk.utils;

import android.net.Uri;
import android.provider.BaseColumns;
import tb.kge;

/* loaded from: classes9.dex */
public final class a implements BaseColumns {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f23671a;

    static {
        kge.a(1572196109);
        kge.a(-600556498);
        f23671a = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    }
}
