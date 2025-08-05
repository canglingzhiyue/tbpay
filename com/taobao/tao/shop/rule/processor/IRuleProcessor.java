package com.taobao.tao.shop.rule.processor;

import android.net.Uri;
import com.taobao.tao.shop.rule.data.Result;
import com.taobao.tao.shop.rule.data.TBUrlRule;

/* loaded from: classes8.dex */
public interface IRuleProcessor {
    Result executor(TBUrlRule tBUrlRule, Uri uri);
}
