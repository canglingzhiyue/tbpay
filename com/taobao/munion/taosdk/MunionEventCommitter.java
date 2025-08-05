package com.taobao.munion.taosdk;

import android.net.Uri;

/* loaded from: classes7.dex */
public interface MunionEventCommitter {
    Uri commitEvent(String str, Uri uri);

    String commitEvent(String str);

    String commitEvent(String str, String str2);
}
