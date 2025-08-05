package com.taobao.android.nav;

import android.net.Uri;

/* loaded from: classes6.dex */
public interface p {
    boolean hostFilter(String str);

    boolean pathFilter(String str);

    boolean queryFilter(Uri uri);

    boolean schemeFilter(String str);
}
