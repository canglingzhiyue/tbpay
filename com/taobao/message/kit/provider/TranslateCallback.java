package com.taobao.message.kit.provider;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/taobao/message/kit/provider/TranslateCallback;", "T", "", "onTranslateComplete", "", "result", "(Ljava/lang/Object;)V", "onTranslateError", "msg", "", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface TranslateCallback<T> {
    void onTranslateComplete(T t);

    void onTranslateError(String str);
}
