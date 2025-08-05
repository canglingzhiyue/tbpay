package com.taobao.themis.open.permission.auth.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/AbsAuthDialog;", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "contentModel", "Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;", "scopeNicks", "", "", "callback", "Lcom/taobao/themis/open/permission/auth/ui/AuthDialogCallback;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/open/permission/auth/model/AuthContentResultModel;Ljava/util/List;Lcom/taobao/themis/open/permission/auth/ui/AuthDialogCallback;)V", "cancel", "", "show", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.themis.kernel.f f22698a;
    private final com.taobao.themis.open.permission.auth.model.a b;
    private final List<String> c;
    private final b d;

    static {
        kge.a(13837789);
    }

    public a(com.taobao.themis.kernel.f instance, com.taobao.themis.open.permission.auth.model.a contentModel, List<String> scopeNicks, b callback) {
        q.d(instance, "instance");
        q.d(contentModel, "contentModel");
        q.d(scopeNicks, "scopeNicks");
        q.d(callback, "callback");
        this.f22698a = instance;
        this.b = contentModel;
        this.c = scopeNicks;
        this.d = callback;
    }
}
