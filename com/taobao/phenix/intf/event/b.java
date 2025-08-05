package com.taobao.phenix.intf.event;

import android.util.Pair;
import com.taobao.phenix.intf.PhenixCreator;

/* loaded from: classes.dex */
public interface b {
    Pair<String, String> getDefaultRetryUrlPair();

    String getRetryUrl(PhenixCreator phenixCreator, Throwable th);
}
